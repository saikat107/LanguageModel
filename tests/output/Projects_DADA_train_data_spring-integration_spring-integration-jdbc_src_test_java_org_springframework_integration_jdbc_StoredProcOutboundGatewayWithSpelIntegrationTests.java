<METHOD_START> @ Test @ DirtiesContext public void void ( ) java.lang.Exception { User org.springframework.integration.jdbc.User = new User ( STRING , STRING , STRING ) ; User org.springframework.integration.jdbc.User = new User ( STRING , STRING , STRING ) ; Message < User > org.springframework.integration.jdbc.Message<org.springframework.integration.jdbc.User> = MessageBuilder . withPayload ( org.springframework.integration.jdbc.User ) . setHeader ( STRING , STRING ) . build ( ) ; Message < User > org.springframework.integration.jdbc.Message<org.springframework.integration.jdbc.User> = MessageBuilder . withPayload ( org.springframework.integration.jdbc.User ) . setHeader ( STRING , STRING ) . build ( ) ; org.springframework.integration.jdbc.MessageChannel . send ( org.springframework.integration.jdbc.Message<org.springframework.integration.jdbc.User> ) ; org.springframework.integration.jdbc.MessageChannel . send ( org.springframework.integration.jdbc.Message<org.springframework.integration.jdbc.User> ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> = ( Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > ) this . org.springframework.integration.jdbc.PollableChannel . receive ( NUMBER ) ; org.springframework.integration.jdbc.AbstractApplicationContext . stop ( ) ; assertNotNull ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ) ; assertNotNull ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> . getPayload ( ) ) ; assertNotNull ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> . getPayload ( ) instanceof java.util.Collection<?> < ? > ) ; java.util.Collection<org.springframework.integration.jdbc.User> < User > java.util.Collection<org.springframework.integration.jdbc.User> = org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> . getPayload ( ) ; assertTrue ( java.util.Collection<org.springframework.integration.jdbc.User> . size ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) java.lang.Exception { User org.springframework.integration.jdbc.User = new User ( STRING , STRING , STRING ) ; Message < User > org.springframework.integration.jdbc.Message<org.springframework.integration.jdbc.User> = MessageBuilder . withPayload ( org.springframework.integration.jdbc.User ) . build ( ) ; this . org.springframework.integration.jdbc.MessageChannel . send ( org.springframework.integration.jdbc.Message<org.springframework.integration.jdbc.User> ) ; Message < ? > org.springframework.integration.jdbc.Message<?> = this . org.springframework.integration.jdbc.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.jdbc.Message<> ) ; assertThat ( org.springframework.integration.jdbc.Message<> , instanceOf ( ErrorMessage .class ) ) ; MessageHandlingException org.springframework.integration.jdbc.MessageHandlingException = ( MessageHandlingException ) org.springframework.integration.jdbc.Message<> . getPayload ( ) ; java.lang.String java.lang.String = STRING + STRING ; java.lang.String java.lang.String = org.springframework.integration.jdbc.MessageHandlingException . getCause ( ) . getMessage ( ) ; Assert . assertEquals ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) java.lang.Exception { Mockito . reset ( this . org.springframework.integration.jdbc.SqlReturnType ) ; Message < java.lang.String > org.springframework.integration.jdbc.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ; java.lang.String java.lang.String = org.springframework.integration.jdbc.Message<java.lang.String> . getHeaders ( ) . getId ( ) . toString ( ) ; java.lang.String java.lang.String = new JsonOutboundMessageMapper ( ) . fromMessage ( org.springframework.integration.jdbc.Message<java.lang.String> ) ; this . org.springframework.integration.jdbc.JdbcTemplate . update ( STRING , java.lang.String , java.lang.String ) ; this . org.springframework.integration.jdbc.MessageChannel . send ( new GenericMessage < java.lang.String > ( java.lang.String ) ) ; Message < ? > org.springframework.integration.jdbc.Message<?> = this . org.springframework.integration.jdbc.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.jdbc.Message<> ) ; java.lang.Object java.lang.Object = org.springframework.integration.jdbc.Message<> . getPayload ( ) ; assertTrue ( java.lang.Object instanceof java.lang.String ) ; Message < ? > org.springframework.integration.jdbc.Message<?> = new JsonInboundMessageMapper ( java.lang.String .class , new Jackson2JsonMessageParser ( ) ) . toMessage ( ( java.lang.String ) java.lang.Object ) ; assertEquals ( org.springframework.integration.jdbc.Message<java.lang.String> . getPayload ( ) , org.springframework.integration.jdbc.Message<> . getPayload ( ) ) ; assertEquals ( org.springframework.integration.jdbc.Message<java.lang.String> . getHeaders ( ) . get ( STRING ) , org.springframework.integration.jdbc.Message<> . getHeaders ( ) . get ( STRING ) ) ; Mockito . verify ( org.springframework.integration.jdbc.SqlReturnType ) . getTypeValue ( Mockito . any ( java.sql.CallableStatement .class ) , Mockito . eq ( NUMBER ) , Mockito . eq ( JdbcTypesEnum . CLOB . getCode ( ) ) , Mockito . eq ( ( java.lang.String ) null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { this . org.springframework.integration.jdbc.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( ReplyRequiredException .class ) ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) java.lang.InterruptedException { if ( java.util.concurrent.atomic.AtomicInteger . int ( ) > NUMBER ) { return null ; } return java.util.concurrent.atomic.AtomicInteger . int ( ) ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator public void void ( Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ) { java.util.concurrent.BlockingQueue<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> . add ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ) ; }  <METHOD_END>
<METHOD_START> org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> < java.util.Collection<org.springframework.integration.jdbc.User> < User > > org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ( long long ) throws java.lang.InterruptedException { return java.util.concurrent.BlockingQueue<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> . poll ( long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; }  <METHOD_END>
