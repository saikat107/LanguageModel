<METHOD_START> @ Test ( expected = MessageDeliveryException .class ) public void void ( ) { DirectChannel org.springframework.integration.endpoint.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.endpoint.DirectChannel . subscribe ( message -> { throw new RuntimeException ( STRING ) ; } ) ; MessageProducerSupport org.springframework.integration.endpoint.MessageProducerSupport = new MessageProducerSupport ( ) { } ; org.springframework.integration.endpoint.MessageProducerSupport . setOutputChannel ( org.springframework.integration.endpoint.DirectChannel ) ; org.springframework.integration.endpoint.MessageProducerSupport . setBeanFactory ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.endpoint.MessageProducerSupport . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . start ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . sendMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageDeliveryException .class ) public void void ( ) { DirectChannel org.springframework.integration.endpoint.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.endpoint.DirectChannel . subscribe ( message -> { throw new RuntimeException ( STRING ) ; } ) ; PublishSubscribeChannel org.springframework.integration.endpoint.PublishSubscribeChannel = new PublishSubscribeChannel ( ) ; org.springframework.integration.endpoint.PublishSubscribeChannel . subscribe ( message -> { throw new RuntimeException ( STRING ) ; } ) ; MessageProducerSupport org.springframework.integration.endpoint.MessageProducerSupport = new MessageProducerSupport ( ) { } ; org.springframework.integration.endpoint.MessageProducerSupport . setOutputChannel ( org.springframework.integration.endpoint.DirectChannel ) ; org.springframework.integration.endpoint.MessageProducerSupport . setErrorChannel ( org.springframework.integration.endpoint.PublishSubscribeChannel ) ; org.springframework.integration.endpoint.MessageProducerSupport . setBeanFactory ( TestUtils . createTestApplicationContext ( ) ) ; org.springframework.integration.endpoint.MessageProducerSupport . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . start ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . sendMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestApplicationContext org.springframework.integration.endpoint.TestApplicationContext = TestUtils . createTestApplicationContext ( ) ; org.springframework.integration.endpoint.TestApplicationContext . refresh ( ) ; DirectChannel org.springframework.integration.endpoint.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.endpoint.DirectChannel . subscribe ( message -> { throw new RuntimeException ( STRING ) ; } ) ; PublishSubscribeChannel org.springframework.integration.endpoint.PublishSubscribeChannel = new PublishSubscribeChannel ( ) ; org.springframework.integration.endpoint.MessageProducerSupportTests.SuccessfulErrorService org.springframework.integration.endpoint.MessageProducerSupportTests.SuccessfulErrorService = new org.springframework.integration.endpoint.MessageProducerSupportTests.SuccessfulErrorService ( ) ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.MessageProducerSupportTests.SuccessfulErrorService ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setBeanFactory ( org.springframework.integration.endpoint.TestApplicationContext ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.PublishSubscribeChannel . subscribe ( org.springframework.integration.endpoint.ServiceActivatingHandler ) ; MessageProducerSupport org.springframework.integration.endpoint.MessageProducerSupport = new MessageProducerSupport ( ) { } ; org.springframework.integration.endpoint.MessageProducerSupport . setOutputChannel ( org.springframework.integration.endpoint.DirectChannel ) ; org.springframework.integration.endpoint.MessageProducerSupport . setErrorChannel ( org.springframework.integration.endpoint.PublishSubscribeChannel ) ; org.springframework.integration.endpoint.MessageProducerSupport . setBeanFactory ( org.springframework.integration.endpoint.TestApplicationContext ) ; org.springframework.integration.endpoint.MessageProducerSupport . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . start ( ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; org.springframework.integration.endpoint.MessageProducerSupport . sendMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( ErrorMessage .class , org.springframework.integration.endpoint.MessageProducerSupportTests.SuccessfulErrorService . org.springframework.integration.endpoint.Message<> . getClass ( ) ) ; ErrorMessage org.springframework.integration.endpoint.ErrorMessage = ( ErrorMessage ) org.springframework.integration.endpoint.MessageProducerSupportTests.SuccessfulErrorService . org.springframework.integration.endpoint.Message<> ; assertEquals ( MessageDeliveryException .class , org.springframework.integration.endpoint.ErrorMessage . getPayload ( ) . getClass ( ) ) ; MessageDeliveryException org.springframework.integration.endpoint.MessageDeliveryException = ( MessageDeliveryException ) org.springframework.integration.endpoint.ErrorMessage . getPayload ( ) ; assertEquals ( org.springframework.integration.endpoint.Message<> , org.springframework.integration.endpoint.MessageDeliveryException . getFailedMessage ( ) ) ; org.springframework.integration.endpoint.TestApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectChannel org.springframework.integration.endpoint.DirectChannel = new DirectChannel ( ) ; MessageProducerSupport org.springframework.integration.endpoint.MessageProducerSupport = new MessageProducerSupport ( ) { } ; org.springframework.integration.endpoint.MessageProducerSupport . setOutputChannelName ( STRING ) ; TestApplicationContext org.springframework.integration.endpoint.TestApplicationContext = TestUtils . createTestApplicationContext ( ) ; org.springframework.integration.endpoint.TestApplicationContext . registerBean ( STRING , org.springframework.integration.endpoint.DirectChannel ) ; org.springframework.integration.endpoint.TestApplicationContext . refresh ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . setBeanFactory ( org.springframework.integration.endpoint.TestApplicationContext ) ; org.springframework.integration.endpoint.MessageProducerSupport . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.MessageProducerSupport . start ( ) ; assertSame ( org.springframework.integration.endpoint.DirectChannel , org.springframework.integration.endpoint.MessageProducerSupport . getOutputChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint = new org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . int ( ) ) ; assertTrue ( org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . boolean ( ) ) ; org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . start ( ) ; assertFalse ( org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . boolean ( ) ) ; org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . stop ( ( ) { } ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . int ( ) ) ; assertTrue ( org.springframework.integration.endpoint.MessageProducerSupportTests.CustomEndpoint . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { this . org.springframework.integration.endpoint.Message<?> = org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( final java.lang.Runnable java.lang.Runnable ) { this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; super. doStop ( java.lang.Runnable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; }  <METHOD_END>
