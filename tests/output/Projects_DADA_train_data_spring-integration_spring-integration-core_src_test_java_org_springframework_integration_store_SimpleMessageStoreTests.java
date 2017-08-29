<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; assertThat ( org.springframework.integration.store.SimpleMessageStore . getMessage ( org.springframework.integration.store.Message<java.lang.String> . getHeaders ( ) . getId ( ) ) , is ( org.springframework.integration.store.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; try { org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessagingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } org.springframework.integration.store.SimpleMessageStore . removeMessage ( org.springframework.integration.store.Message<java.lang.String> . getHeaders ( ) . getId ( ) ) ; try { org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessagingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } org.springframework.integration.store.SimpleMessageStore . removeMessage ( org.springframework.integration.store.Message<java.lang.String> . getHeaders ( ) . getId ( ) ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { final SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER , NUMBER ) ; final Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; final Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; java.util.concurrent.CountDownLatch . void ( ) ; } ) ; java.lang.Thread . void ( NUMBER ) ; Message < ? > org.springframework.integration.store.Message<?> = org.springframework.integration.store.SimpleMessageStore . removeMessage ( org.springframework.integration.store.Message<java.lang.String> . getHeaders ( ) . getId ( ) ) ; assertEquals ( org.springframework.integration.store.Message<java.lang.String> , org.springframework.integration.store.Message<> ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; Message < ? > org.springframework.integration.store.Message<?> = org.springframework.integration.store.SimpleMessageStore . getMessage ( org.springframework.integration.store.Message<java.lang.String> . getHeaders ( ) . getId ( ) ) ; assertEquals ( org.springframework.integration.store.Message<java.lang.String> , org.springframework.integration.store.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) java.lang.InterruptedException { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER , NUMBER ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( new GenericMessage < java.lang.Object > ( STRING ) ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( new GenericMessage < java.lang.Object > ( STRING ) ) ; fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { final SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER , NUMBER ) ; final Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; final Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; java.util.concurrent.CountDownLatch . void ( ) ; } ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.integration.store.SimpleMessageStore . removeMessagesFromGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; MessageGroup org.springframework.integration.store.MessageGroup = org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) ; org.springframework.integration.store.MessageGroup . getMessages ( ) . contains ( org.springframework.integration.store.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER , NUMBER ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , MessageBuilder . withPayload ( STRING ) . build ( ) ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , MessageBuilder . withPayload ( STRING ) . build ( ) ) ; fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; org.springframework.integration.store.SimpleMessageStore . addMessage ( org.springframework.integration.store.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; try { org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessagingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } org.springframework.integration.store.SimpleMessageStore . removeMessagesFromGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; try { org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessagingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } org.springframework.integration.store.SimpleMessageStore . removeMessagesFromGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; Message < ? > org.springframework.integration.store.Message<?> = org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) . getOne ( ) ; org.springframework.integration.store.SimpleMessageStore . removeMessagesFromGroup ( STRING , org.springframework.integration.store.Message<> ) ; MessageGroup org.springframework.integration.store.MessageGroup = org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) ; assertEquals ( NUMBER , org.springframework.integration.store.MessageGroup . size ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( NUMBER , NUMBER ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , MessageBuilder . withPayload ( STRING ) . build ( ) ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , MessageBuilder . withPayload ( STRING ) . build ( ) ) ; org.springframework.integration.store.SimpleMessageStore . removeMessageGroup ( STRING ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageStore . getMessageGroupCount ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; org.springframework.integration.store.SimpleMessageStore . setCopyOnGet ( true ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; assertNotSame ( org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) , org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; org.springframework.integration.store.SimpleMessageStore . setExpiryCallbacks ( java.util.Arrays .< MessageGroupCallback > java.util.List<org.springframework.integration.store.MessageGroupCallback> ( ( messageGroupStore , group ) -> { } ) ) ; assertEquals ( NUMBER , ( ( java.util.Collection<?> < ? > ) ReflectionTestUtils . getField ( org.springframework.integration.store.SimpleMessageStore , STRING ) ) . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; final java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( ) ; org.springframework.integration.store.SimpleMessageStore . registerMessageGroupExpiryCallback ( ( messageGroupStore , group ) -> { list . add ( group . getOne ( ) . getPayload ( ) . toString ( ) ) ; messageGroupStore . removeMessageGroup ( group . getGroupId ( ) ) ; } ) ; Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( STRING , org.springframework.integration.store.Message<java.lang.String> ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; org.springframework.integration.store.SimpleMessageStore . expireMessageGroups ( - NUMBER ) ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SimpleMessageStore org.springframework.integration.store.SimpleMessageStore = new SimpleMessageStore ( ) ; java.lang.String java.lang.String = STRING ; java.util.List<org.springframework.integration.store.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.store.Message<?>> = new java.util.ArrayList<org.springframework.integration.store.Message<?>> < Message < ? > > ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { Message < java.lang.String > org.springframework.integration.store.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setCorrelationId ( java.lang.String ) . build ( ) ; org.springframework.integration.store.SimpleMessageStore . addMessageToGroup ( java.lang.String , org.springframework.integration.store.Message<java.lang.String> ) ; java.util.List<org.springframework.integration.store.Message<?>> . add ( org.springframework.integration.store.Message<java.lang.String> ) ; } MessageGroup org.springframework.integration.store.MessageGroup = org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.store.MessageGroup . size ( ) ) ; org.springframework.integration.store.SimpleMessageStore . removeMessagesFromGroup ( java.lang.String , java.util.List<org.springframework.integration.store.Message<?>> ) ; org.springframework.integration.store.MessageGroup = org.springframework.integration.store.SimpleMessageStore . getMessageGroup ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.store.MessageGroup . size ( ) ) ; }  <METHOD_END>
