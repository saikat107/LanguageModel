<METHOD_START> @ Before public void void ( ) { void ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = new MethodJmsListenerEndpoint ( ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setBean ( this ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMethod ( java.lang.reflect.Method ( ) ) ; org.springframework.jms.config.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . createMessageListener ( org.springframework.jms.config.DefaultMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = new MethodJmsListenerEndpoint ( ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setBean ( this ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMethod ( java.lang.reflect.Method ( ) ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMessageHandlerMethodFactory ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) ; assertNotNull ( org.springframework.jms.config.MethodJmsListenerEndpoint . createMessageListener ( org.springframework.jms.config.DefaultMessageListenerContainer ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageConverter org.springframework.jms.config.MessageConverter = mock ( MessageConverter .class ) ; DestinationResolver org.springframework.jms.config.DestinationResolver = mock ( DestinationResolver .class ) ; this . org.springframework.jms.config.DefaultMessageListenerContainer . setMessageConverter ( org.springframework.jms.config.MessageConverter ) ; this . org.springframework.jms.config.DefaultMessageListenerContainer . setDestinationResolver ( org.springframework.jms.config.DestinationResolver ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ( STRING , org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean .class ) , org.springframework.jms.config.DefaultMessageListenerContainer ) ; DirectFieldAccessor org.springframework.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.jms.config.MessagingMessageListenerAdapter ) ; assertSame ( org.springframework.jms.config.MessageConverter , org.springframework.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertSame ( org.springframework.jms.config.DestinationResolver , org.springframework.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( javax . javax.jms . javax.jms .class , Session .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( Message .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class , int .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( STRING ) ; org.springframework.jms.config.StubTextMessage . setIntProperty ( STRING , NUMBER ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class , int .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( STRING ) ; org.springframework.jms.config.StubTextMessage . setIntProperty ( STRING , NUMBER ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class , int .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( STRING ) ; org.springframework.jms.config.StubTextMessage . setIntProperty ( STRING , NUMBER ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class , java.util.Map .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( STRING ) ; org.springframework.jms.config.StubTextMessage . setIntProperty ( STRING , NUMBER ) ; org.springframework.jms.config.StubTextMessage . setJMSMessageID ( STRING ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( MessageHeaders .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( STRING ) ; org.springframework.jms.config.StubTextMessage . setLongProperty ( STRING , NUMBER ) ; org.springframework.jms.config.StubTextMessage . setJMSType ( STRING ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( JmsMessageHeaderAccessor .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( STRING ) ; org.springframework.jms.config.StubTextMessage . setBooleanProperty ( STRING , true ) ; org.springframework.jms.config.StubTextMessage . setJMSPriority ( NUMBER ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean .class ) ; org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean = new org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean ( ) ; org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean . java.lang.String = STRING ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; ObjectMessage org.springframework.jms.config.ObjectMessage = mock ( ObjectMessage .class ) ; given ( org.springframework.jms.config.ObjectMessage . getObject ( ) ) . willReturn ( org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.ObjectMessage , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.Integer .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; Destination org.springframework.jms.config.Destination = new Destination ( ) {} ; TextMessage org.springframework.jms.config.TextMessage = mock ( TextMessage .class ) ; QueueSender org.springframework.jms.config.QueueSender = mock ( QueueSender .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; given ( org.springframework.jms.config.Session . createTextMessage ( java.lang.String ) ) . willReturn ( org.springframework.jms.config.TextMessage ) ; given ( org.springframework.jms.config.Session . createProducer ( org.springframework.jms.config.Destination ) ) . willReturn ( org.springframework.jms.config.QueueSender ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . setDefaultResponseDestination ( org.springframework.jms.config.Destination ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( java.lang.String ) ; org.springframework.jms.config.StubTextMessage . setJMSCorrelationID ( java.lang.String ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; void ( ) ; verify ( org.springframework.jms.config.TextMessage ) . setJMSCorrelationID ( java.lang.String ) ; verify ( org.springframework.jms.config.QueueSender ) . send ( org.springframework.jms.config.TextMessage ) ; verify ( org.springframework.jms.config.QueueSender ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { java.lang.String java.lang.String = STRING ; SimpleMessageListenerContainer org.springframework.jms.config.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ( java.lang.String , java.lang.String .class ) , org.springframework.jms.config.SimpleMessageListenerContainer ) ; void ( org.springframework.jms.config.MessagingMessageListenerAdapter , STRING , false ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { java.lang.String java.lang.String = STRING ; SimpleMessageListenerContainer org.springframework.jms.config.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( ) ; org.springframework.jms.config.SimpleMessageListenerContainer . setPubSubDomain ( true ) ; org.springframework.jms.config.SimpleMessageListenerContainer . setReplyPubSubDomain ( false ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ( java.lang.String , java.lang.String .class ) , org.springframework.jms.config.SimpleMessageListenerContainer ) ; void ( org.springframework.jms.config.MessagingMessageListenerAdapter , STRING , false ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { java.lang.String java.lang.String = STRING ; SimpleMessageListenerContainer org.springframework.jms.config.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( ) ; org.springframework.jms.config.SimpleMessageListenerContainer . setPubSubDomain ( true ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ( java.lang.String , java.lang.String .class ) , org.springframework.jms.config.SimpleMessageListenerContainer ) ; void ( org.springframework.jms.config.MessagingMessageListenerAdapter , STRING , true ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { java.lang.String java.lang.String = STRING ; SimpleMessageListenerContainer org.springframework.jms.config.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( ) ; org.springframework.jms.config.SimpleMessageListenerContainer . setReplyPubSubDomain ( true ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ( java.lang.String , java.lang.String .class ) , org.springframework.jms.config.SimpleMessageListenerContainer ) ; void ( org.springframework.jms.config.MessagingMessageListenerAdapter , STRING , true ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class ) ; void ( org.springframework.jms.config.MessagingMessageListenerAdapter , STRING , false ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter , java.lang.String java.lang.String , boolean boolean ) throws org.springframework.jms.config.JMSException { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; Destination org.springframework.jms.config.Destination = new Destination ( ) {} ; DestinationResolver org.springframework.jms.config.DestinationResolver = mock ( DestinationResolver .class ) ; TextMessage org.springframework.jms.config.TextMessage = mock ( TextMessage .class ) ; QueueSender org.springframework.jms.config.QueueSender = mock ( QueueSender .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; given ( org.springframework.jms.config.DestinationResolver . resolveDestinationName ( org.springframework.jms.config.Session , java.lang.String , boolean ) ) . willReturn ( org.springframework.jms.config.Destination ) ; given ( org.springframework.jms.config.Session . createTextMessage ( java.lang.String ) ) . willReturn ( org.springframework.jms.config.TextMessage ) ; given ( org.springframework.jms.config.Session . createProducer ( org.springframework.jms.config.Destination ) ) . willReturn ( org.springframework.jms.config.QueueSender ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . setDestinationResolver ( org.springframework.jms.config.DestinationResolver ) ; StubTextMessage org.springframework.jms.config.StubTextMessage = org.springframework.jms.config.StubTextMessage ( java.lang.String ) ; org.springframework.jms.config.StubTextMessage . setJMSCorrelationID ( java.lang.String ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage , org.springframework.jms.config.Session ) ; verify ( org.springframework.jms.config.DestinationResolver ) . resolveDestinationName ( org.springframework.jms.config.Session , java.lang.String , boolean ) ; verify ( org.springframework.jms.config.TextMessage ) . setJMSCorrelationID ( java.lang.String ) ; verify ( org.springframework.jms.config.QueueSender ) . send ( org.springframework.jms.config.TextMessage ) ; verify ( org.springframework.jms.config.QueueSender ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class ) ; TextMessage org.springframework.jms.config.TextMessage = mock ( TextMessage .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; given ( org.springframework.jms.config.Session . createTextMessage ( STRING ) ) . willReturn ( org.springframework.jms.config.TextMessage ) ; org.springframework.jms.config.ExpectedException . expect ( ReplyFailureException .class ) ; org.springframework.jms.config.ExpectedException . expectCause ( Matchers . isA ( InvalidDestinationException .class ) ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.jms.config.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.jms.config.ExpectedException . expectMessage ( STRING ) ; org.springframework.jms.config.ExpectedException . expectMessage ( STRING ) ; org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { java.lang.String java.lang.String = STRING ; DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory = new DefaultMessageHandlerMethodFactory ( ) ; org.springframework.jms.config.DefaultMessageHandlerMethodFactory . setValidator ( org.springframework.jms.config.Validator ( STRING ) ) ; void ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.reflect.Method ( java.lang.String , java.lang.String .class ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory = new DefaultMessageHandlerMethodFactory ( ) ; org.springframework.jms.config.DefaultMessageHandlerMethodFactory . setValidator ( org.springframework.jms.config.Validator ( STRING ) ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.reflect.Method ( STRING , java.lang.String .class ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.ExpectedException . expect ( ListenerExecutionFailedException .class ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.Integer .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.ExpectedException . expect ( ListenerExecutionFailedException .class ) ; org.springframework.jms.config.ExpectedException . expectCause ( Matchers . isA ( MessageConversionException .class ) ) ; org.springframework.jms.config.ExpectedException . expectMessage ( java.lang.reflect.Method ( java.lang.Integer .class ) . java.lang.String ( ) ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( Message .class ) ; Session org.springframework.jms.config.Session = mock ( Session .class ) ; org.springframework.jms.config.ExpectedException . expect ( ListenerExecutionFailedException .class ) ; org.springframework.jms.config.ExpectedException . expectCause ( Matchers . isA ( MessageConversionException .class ) ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . onMessage ( org.springframework.jms.config.StubTextMessage ( STRING ) , org.springframework.jms.config.Session ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter ( DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method java.lang.reflect.Method , MessageListenerContainer org.springframework.jms.config.MessageListenerContainer ) { MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = new MethodJmsListenerEndpoint ( ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setBean ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMethod ( java.lang.reflect.Method ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMessageHandlerMethodFactory ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) ; return org.springframework.jms.config.MethodJmsListenerEndpoint . createMessageListener ( org.springframework.jms.config.MessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter ( DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method java.lang.reflect.Method ) { return org.springframework.jms.config.MessagingMessageListenerAdapter ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method , new SimpleMessageListenerContainer ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { return org.springframework.jms.config.MessagingMessageListenerAdapter ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method ( java.lang.Class<?>[] ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.StubTextMessage org.springframework.jms.config.StubTextMessage ( java.lang.String java.lang.String ) { return new StubTextMessage ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method java.lang.reflect.Method ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean .class , java.lang.String , java.lang.Class<?>[] ) ; assertNotNull ( STRING + java.lang.String + STRING + java.util.Arrays . java.lang.String ( java.lang.Class<?>[] ) ) ; return java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method java.lang.reflect.Method ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { return java.lang.reflect.Method ( org.springframework.jms.config.TestName . getMethodName ( ) , java.lang.Class<?>[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , org.springframework.jms.config.TestName . getMethodName ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean , java.lang.String java.lang.String ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.jms.config.MethodJmsListenerEndpointTests.JmsEndpointSampleBean . java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) { org.springframework.jms.config.DefaultMessageHandlerMethodFactory . setBeanFactory ( new StaticListableBeanFactory ( ) ) ; org.springframework.jms.config.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.Validator org.springframework.jms.config.Validator ( final java.lang.String java.lang.String ) { return new Validator ( ) { @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.String .class . boolean ( java.lang.Class<> ) ; } @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.jms.config.Errors ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; if ( java.lang.String . boolean ( java.lang.String ) ) { org.springframework.jms.config.Errors . reject ( STRING ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.String .class . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.jms.config.Errors ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; if ( java.lang.String . boolean ( java.lang.String ) ) { org.springframework.jms.config.Errors . reject ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Method java.lang.reflect.Method ( ) { return ReflectionUtils . findMethod ( org.springframework.jms.config.MethodJmsListenerEndpointTests .class , org.springframework.jms.config.TestName . getMethodName ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( javax . javax.jms . javax.jms javax.jms.Message , Session org.springframework.jms.config.Session ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertNotNull ( STRING , javax.jms.Message ) ; assertNotNull ( STRING , org.springframework.jms.config.Session ) ; }  <METHOD_END>
<METHOD_START> public void void ( Message < java.lang.String > org.springframework.jms.config.Message<java.lang.String> ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertNotNull ( STRING , org.springframework.jms.config.Message<java.lang.String> ) ; assertEquals ( STRING , STRING , org.springframework.jms.config.Message<java.lang.String> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Payload java.lang.String java.lang.String , @ Header int int ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertEquals ( STRING , STRING , java.lang.String ) ; assertEquals ( STRING , NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Payload java.lang.String java.lang.String , @ Header ( STRING ) int int ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertEquals ( STRING , STRING , java.lang.String ) ; assertEquals ( STRING , NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Payload java.lang.String java.lang.String , @ Header ( name = STRING ) int int ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertEquals ( STRING , STRING , java.lang.String ) ; assertEquals ( STRING , NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , @ Headers java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertEquals ( STRING , STRING , java.lang.String ) ; assertNotNull ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; assertEquals ( STRING , STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( JmsHeaders . MESSAGE_ID ) ) ; assertEquals ( STRING , NUMBER , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( MessageHeaders org.springframework.jms.config.MessageHeaders ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertNotNull ( STRING , org.springframework.jms.config.MessageHeaders ) ; assertEquals ( STRING , STRING , org.springframework.jms.config.MessageHeaders . get ( JmsHeaders . TYPE ) ) ; assertEquals ( STRING , NUMBER , ( long ) org.springframework.jms.config.MessageHeaders . get ( STRING ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( JmsMessageHeaderAccessor org.springframework.jms.config.JmsMessageHeaderAccessor ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertNotNull ( STRING , org.springframework.jms.config.JmsMessageHeaderAccessor ) ; assertEquals ( STRING , java.lang.Integer . java.lang.Integer ( NUMBER ) , org.springframework.jms.config.JmsMessageHeaderAccessor . getPriority ( ) ) ; assertEquals ( STRING , true , org.springframework.jms.config.JmsMessageHeaderAccessor . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertNotNull ( STRING , org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean ) ; assertEquals ( STRING , STRING , org.springframework.jms.config.MethodJmsListenerEndpointTests.MyBean . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertNotNull ( STRING , java.lang.Integer ) ; assertEquals ( STRING , java.lang.Integer . java.lang.Integer ( NUMBER ) , java.lang.Integer ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( @ Payload java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ SendTo ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ SendTo ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ SendTo ( { STRING , STRING } ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( @ Validated java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ Payload java.lang.Integer java.lang.Integer ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( Message < java.lang.Integer > org.springframework.jms.config.Message<java.lang.Integer> ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>