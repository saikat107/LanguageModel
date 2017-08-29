<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler = new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> ) { final SettableListenableFuture < java.lang.String > org.springframework.integration.handler.SettableListenableFuture<java.lang.String> = new SettableListenableFuture < java.lang.String > ( ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { try { java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; switch ( int ) { case NUMBER : org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . set ( STRING ) ; break; case NUMBER : org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . setException ( new java.lang.RuntimeException ( STRING ) ) ; break; case NUMBER : org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . setException ( new MessagingException ( org.springframework.integration.handler.Message<> ) ) ; } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } ) ; return org.springframework.integration.handler.SettableListenableFuture<java.lang.String> ; } } ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setAsync ( true ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setOutputChannel ( this . org.springframework.integration.handler.QueueChannel ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setBeanFactory ( mock ( BeanFactory .class ) ) ; this . java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; Log org.springframework.integration.handler.Log = spy ( TestUtils . getPropertyValue ( this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler , STRING , Log .class ) ) ; new DirectFieldAccessor ( this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler ) . setPropertyValue ( STRING , org.springframework.integration.handler.Log ) ; doAnswer ( invocation -> { failedCallbackMessage = invocation . getArgument ( NUMBER ) ; failedCallbackException = invocation . getArgument ( NUMBER ) ; exceptionLatch . countDown ( ) ; return null ; } ) . when ( org.springframework.integration.handler.Log ) . error ( anyString ( ) , any ( java.lang.Throwable .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> ) { final SettableListenableFuture < java.lang.String > org.springframework.integration.handler.SettableListenableFuture<java.lang.String> = new SettableListenableFuture < java.lang.String > ( ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { try { java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; switch ( int ) { case NUMBER : org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . set ( STRING ) ; break; case NUMBER : org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . setException ( new java.lang.RuntimeException ( STRING ) ) ; break; case NUMBER : org.springframework.integration.handler.SettableListenableFuture<java.lang.String> . setException ( new MessagingException ( org.springframework.integration.handler.Message<> ) ) ; } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } ) ; return org.springframework.integration.handler.SettableListenableFuture<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . int = NUMBER ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertNull ( this . org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = this . org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertNull ( this . java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . int = NUMBER ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setOutputChannel ( null ) ; QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . handleMessage ( org.springframework.integration.handler.Message<> ) ; assertNull ( org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertEquals ( STRING , org.springframework.integration.handler.Message<> . getPayload ( ) ) ; assertNull ( this . java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . int = NUMBER ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setOutputChannel ( null ) ; QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < java.lang.String > org.springframework.integration.handler.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setErrorChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . handleMessage ( org.springframework.integration.handler.Message<java.lang.String> ) ; assertNull ( this . org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertThat ( org.springframework.integration.handler.Message<> . getPayload ( ) , instanceOf ( DestinationResolutionException .class ) ) ; assertEquals ( STRING , ( ( java.lang.Throwable ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . java.lang.String ( ) ) ; assertNull ( ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getFailedMessage ( ) ) ; assertNotNull ( this . java.lang.Exception ) ; assertThat ( this . java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < java.lang.String > org.springframework.integration.handler.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setErrorChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . handleMessage ( org.springframework.integration.handler.Message<java.lang.String> ) ; assertNull ( this . org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ) ; this . int = NUMBER ; this . java.util.concurrent.CountDownLatch . void ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertThat ( org.springframework.integration.handler.Message<> . getPayload ( ) , instanceOf ( MessageHandlingException .class ) ) ; assertEquals ( STRING , ( ( java.lang.Throwable ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . java.lang.Throwable ( ) . java.lang.String ( ) ) ; assertSame ( org.springframework.integration.handler.Message<java.lang.String> , ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getFailedMessage ( ) ) ; assertNull ( this . java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.handler.QueueChannel = new QueueChannel ( ) ; Message < java.lang.String > org.springframework.integration.handler.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setErrorChannel ( org.springframework.integration.handler.QueueChannel ) . build ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . handleMessage ( org.springframework.integration.handler.Message<java.lang.String> ) ; assertNull ( this . org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ) ; this . int = NUMBER ; this . java.util.concurrent.CountDownLatch . void ( ) ; Message < ? > org.springframework.integration.handler.Message<?> = org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.handler.Message<> ) ; assertThat ( org.springframework.integration.handler.Message<> . getPayload ( ) , instanceOf ( MessagingException .class ) ) ; assertSame ( org.springframework.integration.handler.Message<java.lang.String> , ( ( MessagingException ) org.springframework.integration.handler.Message<> . getPayload ( ) ) . getFailedMessage ( ) ) ; assertNull ( this . java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < java.lang.String > org.springframework.integration.handler.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . handleMessage ( org.springframework.integration.handler.Message<java.lang.String> ) ; assertNull ( this . org.springframework.integration.handler.QueueChannel . receive ( NUMBER ) ) ; this . int = NUMBER ; this . java.util.concurrent.CountDownLatch . void ( ) ; assertTrue ( this . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertNotNull ( this . java.lang.Exception ) ; assertThat ( this . java.lang.String , containsString ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . int = NUMBER ; GatewayProxyFactoryBean org.springframework.integration.handler.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( org.springframework.integration.handler.AsyncHandlerTests.Foo .class ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; DirectChannel org.springframework.integration.handler.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.handler.DirectChannel ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . setDefaultReplyTimeout ( NUMBER ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.handler.AsyncHandlerTests.Foo org.springframework.integration.handler.AsyncHandlerTests.Foo = ( org.springframework.integration.handler.AsyncHandlerTests.Foo ) org.springframework.integration.handler.GatewayProxyFactoryBean . getObject ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setOutputChannel ( null ) ; EventDrivenConsumer org.springframework.integration.handler.EventDrivenConsumer = new EventDrivenConsumer ( org.springframework.integration.handler.DirectChannel , this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler ) ; org.springframework.integration.handler.EventDrivenConsumer . afterPropertiesSet ( ) ; org.springframework.integration.handler.EventDrivenConsumer . start ( ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; java.lang.String java.lang.String = org.springframework.integration.handler.AsyncHandlerTests.Foo . java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . int = NUMBER ; GatewayProxyFactoryBean org.springframework.integration.handler.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( org.springframework.integration.handler.AsyncHandlerTests.Foo .class ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; DirectChannel org.springframework.integration.handler.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.handler.DirectChannel ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . setDefaultReplyTimeout ( NUMBER ) ; org.springframework.integration.handler.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.handler.AsyncHandlerTests.Foo org.springframework.integration.handler.AsyncHandlerTests.Foo = ( org.springframework.integration.handler.AsyncHandlerTests.Foo ) org.springframework.integration.handler.GatewayProxyFactoryBean . getObject ( ) ; this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler . setOutputChannel ( null ) ; EventDrivenConsumer org.springframework.integration.handler.EventDrivenConsumer = new EventDrivenConsumer ( org.springframework.integration.handler.DirectChannel , this . org.springframework.integration.handler.AbstractReplyProducingMessageHandler ) ; org.springframework.integration.handler.EventDrivenConsumer . afterPropertiesSet ( ) ; org.springframework.integration.handler.EventDrivenConsumer . start ( ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; try { org.springframework.integration.handler.AsyncHandlerTests.Foo . java.lang.String ( STRING ) ; } catch ( MessagingException org.springframework.integration.handler.MessagingException ) { assertThat ( org.springframework.integration.handler.MessagingException . getClass ( ) . getSimpleName ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.integration.handler.MessagingException . getMessage ( ) , equalTo ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String );  <METHOD_END>
