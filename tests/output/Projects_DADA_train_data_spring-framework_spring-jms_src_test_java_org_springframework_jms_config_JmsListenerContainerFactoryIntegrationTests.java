<METHOD_START> @ Before public void void ( ) { void ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { this . org.springframework.jms.config.DefaultJmsListenerContainerFactory . setMessageConverter ( new org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.UpperCaseMessageConverter ( ) ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { MessagingMessageConverter org.springframework.jms.config.MessagingMessageConverter = new MessagingMessageConverter ( ) ; org.springframework.jms.config.MessagingMessageConverter . setPayloadConverter ( new org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.UpperCaseMessageConverter ( ) ) ; this . org.springframework.jms.config.DefaultJmsListenerContainerFactory . setMessageConverter ( org.springframework.jms.config.MessagingMessageConverter ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.jms.config.JMSException { MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = org.springframework.jms.config.MethodJmsListenerEndpoint ( this . org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface . java.lang.Class<? extends org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface> ( ) , STRING , java.lang.String .class , java.lang.String .class ) ; Message org.springframework.jms.config.Message = new StubTextMessage ( STRING ) ; org.springframework.jms.config.Message . setStringProperty ( STRING , STRING ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpoint , org.springframework.jms.config.Message ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { ProxyFactory org.springframework.jms.config.ProxyFactory = new ProxyFactory ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleBean ) ; org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface = ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface ) org.springframework.jms.config.ProxyFactory . getProxy ( ) ; org.springframework.jms.config.DefaultJmsListenerContainerFactory . setMessageConverter ( new org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.UpperCaseMessageConverter ( ) ) ; MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = org.springframework.jms.config.MethodJmsListenerEndpoint ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface .class , STRING , java.lang.String .class , java.lang.String .class ) ; Message org.springframework.jms.config.Message = new StubTextMessage ( STRING ) ; org.springframework.jms.config.Message . setStringProperty ( STRING , STRING ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpoint , org.springframework.jms.config.Message ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.jms.config.JMSException { ProxyFactory org.springframework.jms.config.ProxyFactory = new ProxyFactory ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleBean ) ; org.springframework.jms.config.ProxyFactory . setProxyTargetClass ( true ) ; org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface = ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleBean ) org.springframework.jms.config.ProxyFactory . getProxy ( ) ; org.springframework.jms.config.DefaultJmsListenerContainerFactory . setMessageConverter ( new org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.UpperCaseMessageConverter ( ) ) ; MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = org.springframework.jms.config.MethodJmsListenerEndpoint ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleBean .class , STRING , java.lang.String .class , java.lang.String .class ) ; Message org.springframework.jms.config.Message = new StubTextMessage ( STRING ) ; org.springframework.jms.config.Message . setStringProperty ( STRING , STRING ) ; void ( org.springframework.jms.config.MethodJmsListenerEndpoint , org.springframework.jms.config.Message ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( JmsListenerEndpoint org.springframework.jms.config.JmsListenerEndpoint , Message org.springframework.jms.config.Message ) throws org.springframework.jms.config.JMSException { DefaultMessageListenerContainer org.springframework.jms.config.DefaultMessageListenerContainer = org.springframework.jms.config.DefaultJmsListenerContainerFactory . createListenerContainer ( org.springframework.jms.config.JmsListenerEndpoint ) ; java.lang.Object java.lang.Object = org.springframework.jms.config.DefaultMessageListenerContainer . getMessageListener ( ) ; if ( java.lang.Object instanceof SessionAwareMessageListener ) { ( ( SessionAwareMessageListener < Message > ) java.lang.Object ) . onMessage ( org.springframework.jms.config.Message , mock ( Session .class ) ) ; } else { ( ( MessageListener ) java.lang.Object ) . onMessage ( org.springframework.jms.config.Message ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { assertTrue ( STRING + java.lang.String + STRING , org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleBean . java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint ( DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory , java.lang.reflect.Method java.lang.reflect.Method ) { MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint = new MethodJmsListenerEndpoint ( ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setBean ( org.springframework.jms.config.JmsListenerContainerFactoryIntegrationTests.JmsEndpointSampleInterface ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMethod ( java.lang.reflect.Method ) ; org.springframework.jms.config.MethodJmsListenerEndpoint . setMessageHandlerMethodFactory ( org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) ; return org.springframework.jms.config.MethodJmsListenerEndpoint ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.MethodJmsListenerEndpoint org.springframework.jms.config.MethodJmsListenerEndpoint ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { return org.springframework.jms.config.MethodJmsListenerEndpoint ( this . org.springframework.jms.config.DefaultMessageHandlerMethodFactory , ReflectionUtils . findMethod ( java.lang.Class<> , java.lang.String , java.lang.Class<?>[] ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( DefaultMessageHandlerMethodFactory org.springframework.jms.config.DefaultMessageHandlerMethodFactory ) { org.springframework.jms.config.DefaultMessageHandlerMethodFactory . setBeanFactory ( new StaticListableBeanFactory ( ) ) ; org.springframework.jms.config.DefaultMessageHandlerMethodFactory . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> void void ( @ Payload java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> public void void ( @ Payload java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String ) { java.util.Map<java.lang.String,java.lang.Boolean> . java.lang.Boolean ( STRING , true ) ; assertEquals ( STRING , STRING , java.lang.String ) ; assertEquals ( STRING , STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.config.Message org.springframework.jms.config.Message ( java.lang.Object java.lang.Object , Session org.springframework.jms.config.Session ) throws org.springframework.jms.config.JMSException , org.springframework.jms.config.MessageConversionException { return new StubTextMessage ( java.lang.Object . java.lang.String ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message org.springframework.jms.config.Message ) throws org.springframework.jms.config.JMSException , org.springframework.jms.config.MessageConversionException { java.lang.String java.lang.String = ( ( TextMessage ) org.springframework.jms.config.Message ) . getText ( ) ; return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
