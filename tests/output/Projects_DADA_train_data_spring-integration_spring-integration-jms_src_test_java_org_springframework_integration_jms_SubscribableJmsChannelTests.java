<METHOD_START> @ Before public void void ( ) { ActiveMqTestUtils . prepare ( ) ; ActiveMQConnectionFactory org.springframework.integration.jms.ActiveMQConnectionFactory = new ActiveMQConnectionFactory ( ) ; org.springframework.integration.jms.ActiveMQConnectionFactory . setBrokerURL ( STRING ) ; org.springframework.integration.jms.ActiveMQConnectionFactory . setTrustAllPackages ( true ) ; this . org.springframework.integration.jms.CachingConnectionFactory = new CachingConnectionFactory ( org.springframework.integration.jms.ActiveMQConnectionFactory ) ; this . org.springframework.integration.jms.Destination = new ActiveMQTopic ( STRING ) ; this . org.springframework.integration.jms.Destination = new ActiveMQQueue ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { this . org.springframework.integration.jms.CachingConnectionFactory . resetConnection ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList1 . add ( message ) ; latch . countDown ( ) ; } ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList2 . add ( message ) ; latch . countDown ( ) ; } ; JmsChannelFactoryBean org.springframework.integration.jms.JmsChannelFactoryBean = new JmsChannelFactoryBean ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setConnectionFactory ( this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setDestination ( this . org.springframework.integration.jms.Destination ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.jms.JmsChannelFactoryBean . afterPropertiesSet ( ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.JmsChannelFactoryBean . getObject ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . afterPropertiesSet ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . start ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; java.util.concurrent.CountDownLatch . boolean ( int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertNotNull ( java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertNotNull ( java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList1 . add ( message ) ; latch . countDown ( ) ; } ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList2 . add ( message ) ; latch . countDown ( ) ; } ; JmsChannelFactoryBean org.springframework.integration.jms.JmsChannelFactoryBean = new JmsChannelFactoryBean ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setConnectionFactory ( this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setDestination ( this . org.springframework.integration.jms.Destination ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.jms.JmsChannelFactoryBean . afterPropertiesSet ( ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.JmsChannelFactoryBean . getObject ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . afterPropertiesSet ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . start ( ) ; if ( ! boolean ( org.springframework.integration.jms.SubscribableJmsChannel , NUMBER ) ) { fail ( STRING ) ; } org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; java.util.concurrent.CountDownLatch . boolean ( int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList1 . add ( message ) ; latch . countDown ( ) ; } ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList2 . add ( message ) ; latch . countDown ( ) ; } ; JmsChannelFactoryBean org.springframework.integration.jms.JmsChannelFactoryBean = new JmsChannelFactoryBean ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setConnectionFactory ( this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setDestinationName ( STRING ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setPubSubDomain ( false ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.jms.JmsChannelFactoryBean . afterPropertiesSet ( ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.JmsChannelFactoryBean . getObject ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . afterPropertiesSet ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . start ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertTrue ( STRING + java.util.concurrent.CountDownLatch . long ( ) , java.util.concurrent.CountDownLatch . boolean ( int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertNotNull ( java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertNotNull ( java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList1 . add ( message ) ; latch . countDown ( ) ; } ; final java.util.List<org.springframework.integration.jms.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.jms.Message<?>> = java.util.Collections . java.util.List<org.springframework.integration.jms.Message<?>> ( new java.util.ArrayList<org.springframework.integration.jms.Message<?>> < Message < ? > > ( ) ) ; MessageHandler org.springframework.integration.jms.MessageHandler = message -> { receivedList2 . add ( message ) ; latch . countDown ( ) ; } ; JmsChannelFactoryBean org.springframework.integration.jms.JmsChannelFactoryBean = new JmsChannelFactoryBean ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setConnectionFactory ( this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setDestinationName ( STRING ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setPubSubDomain ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.jms.JmsChannelFactoryBean . afterPropertiesSet ( ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.JmsChannelFactoryBean . getObject ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . afterPropertiesSet ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . start ( ) ; if ( ! boolean ( org.springframework.integration.jms.SubscribableJmsChannel , NUMBER ) ) { fail ( STRING ) ; } org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . subscribe ( org.springframework.integration.jms.MessageHandler ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; java.util.concurrent.CountDownLatch . boolean ( int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.Message<?>> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.jms.Message<?>> . get ( NUMBER ) . getPayload ( ) ) ; org.springframework.integration.jms.SubscribableJmsChannel . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.integration.jms.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( JmsChannelFactoryBean .class ) ; org.springframework.integration.jms.BeanDefinitionBuilder . addConstructorArgValue ( true ) ; org.springframework.integration.jms.BeanDefinitionBuilder . addPropertyValue ( STRING , this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.BeanDefinitionBuilder . addPropertyValue ( STRING , STRING ) ; org.springframework.integration.jms.BeanDefinitionBuilder . addPropertyValue ( STRING , false ) ; StaticApplicationContext org.springframework.integration.jms.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.integration.jms.StaticApplicationContext . registerBeanDefinition ( STRING , org.springframework.integration.jms.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = org.springframework.integration.jms.StaticApplicationContext . getBean ( STRING , SubscribableJmsChannel .class ) ; assertFalse ( org.springframework.integration.jms.SubscribableJmsChannel . isRunning ( ) ) ; org.springframework.integration.jms.StaticApplicationContext . refresh ( ) ; assertTrue ( org.springframework.integration.jms.SubscribableJmsChannel . isRunning ( ) ) ; org.springframework.integration.jms.StaticApplicationContext . stop ( ) ; assertFalse ( org.springframework.integration.jms.SubscribableJmsChannel . isRunning ( ) ) ; org.springframework.integration.jms.StaticApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JmsChannelFactoryBean org.springframework.integration.jms.JmsChannelFactoryBean = new JmsChannelFactoryBean ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setConnectionFactory ( this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setDestinationName ( STRING ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.jms.JmsChannelFactoryBean . afterPropertiesSet ( ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.JmsChannelFactoryBean . getObject ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . afterPropertiesSet ( ) ; AbstractMessageListenerContainer org.springframework.integration.jms.AbstractMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.SubscribableJmsChannel , STRING , AbstractMessageListenerContainer .class ) ; MessageListener org.springframework.integration.jms.MessageListener = ( MessageListener ) org.springframework.integration.jms.AbstractMessageListenerContainer . getMessageListener ( ) ; try { org.springframework.integration.jms.MessageListener . onMessage ( new StubTextMessage ( STRING ) ) ; fail ( STRING ) ; } catch ( MessageDeliveryException org.springframework.integration.jms.MessageDeliveryException ) { assertThat ( org.springframework.integration.jms.MessageDeliveryException . getMessage ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JmsChannelFactoryBean org.springframework.integration.jms.JmsChannelFactoryBean = new JmsChannelFactoryBean ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setConnectionFactory ( this . org.springframework.integration.jms.CachingConnectionFactory ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setDestinationName ( STRING ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setPubSubDomain ( true ) ; org.springframework.integration.jms.JmsChannelFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.jms.JmsChannelFactoryBean . afterPropertiesSet ( ) ; SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.JmsChannelFactoryBean . getObject ( ) ; org.springframework.integration.jms.SubscribableJmsChannel . afterPropertiesSet ( ) ; AbstractMessageListenerContainer org.springframework.integration.jms.AbstractMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.SubscribableJmsChannel , STRING , AbstractMessageListenerContainer .class ) ; MessageListener org.springframework.integration.jms.MessageListener = ( MessageListener ) org.springframework.integration.jms.AbstractMessageListenerContainer . getMessageListener ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.List<java.lang.String> ( org.springframework.integration.jms.SubscribableJmsChannel ) ; org.springframework.integration.jms.MessageListener . onMessage ( new StubTextMessage ( STRING ) ) ; void ( java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel ) { AbstractMessageListenerContainer org.springframework.integration.jms.AbstractMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.SubscribableJmsChannel , STRING , AbstractMessageListenerContainer .class ) ; Log org.springframework.integration.jms.Log = mock ( Log .class ) ; final java.util.ArrayList<java.lang.String> < java.lang.String > java.util.ArrayList<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( ) ; doAnswer ( invocation -> { String message = invocation . getArgument ( NUMBER ) ; if ( message . startsWith ( STRING ) ) { logList . add ( message ) ; } return null ; } ) . when ( org.springframework.integration.jms.Log ) . warn ( anyString ( ) , any ( java.lang.Exception .class ) ) ; when ( org.springframework.integration.jms.Log . isWarnEnabled ( ) ) . thenReturn ( true ) ; java.lang.Object java.lang.Object = org.springframework.integration.jms.AbstractMessageListenerContainer . getMessageListener ( ) ; DirectFieldAccessor org.springframework.integration.jms.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; org.springframework.integration.jms.DirectFieldAccessor . setPropertyValue ( STRING , org.springframework.integration.jms.Log ) ; return java.util.ArrayList<java.lang.String> ; }  <METHOD_END>
<METHOD_START> private void void ( final java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { assertTrue ( STRING , java.util.List<java.lang.String> . int ( ) > NUMBER ) ; boolean boolean = false ; while ( java.util.List<java.lang.String> . int ( ) > NUMBER ) { java.lang.String java.lang.String = java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ; assertNotNull ( STRING , java.lang.String ) ; if ( java.lang.String . boolean ( STRING ) ) { boolean = true ; assertEquals ( STRING , java.lang.String ) ; break; } } assertTrue ( STRING , boolean ) ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( SubscribableJmsChannel org.springframework.integration.jms.SubscribableJmsChannel , long long ) { AbstractMessageListenerContainer org.springframework.integration.jms.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) new DirectFieldAccessor ( org.springframework.integration.jms.SubscribableJmsChannel ) . getPropertyValue ( STRING ) ; if ( org.springframework.integration.jms.AbstractMessageListenerContainer instanceof DefaultMessageListenerContainer ) { DefaultMessageListenerContainer org.springframework.integration.jms.DefaultMessageListenerContainer = ( DefaultMessageListenerContainer ) org.springframework.integration.jms.AbstractMessageListenerContainer ; if ( org.springframework.integration.jms.DefaultMessageListenerContainer . getCacheLevel ( ) != DefaultMessageListenerContainer . CACHE_CONSUMER ) { return true ; } while ( long > NUMBER ) { if ( org.springframework.integration.jms.DefaultMessageListenerContainer . isRegisteredWithDestination ( ) ) { return true ; } try { java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { } long -= NUMBER ; } return false ; } return true ; }  <METHOD_END>