<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.mqtt.DownstreamExceptionTests.Service . int = NUMBER ; Log org.springframework.integration.mqtt.Log = spy ( TestUtils . getPropertyValue ( org.springframework.integration.mqtt.MqttPahoMessageDrivenChannelAdapter , STRING , Log .class ) ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; doAnswer ( invocation -> { if ( ( ( String ) invocation . getArgument ( NUMBER ) ) . contains ( STRING ) ) { latch . countDown ( ) ; } return null ; } ) . when ( org.springframework.integration.mqtt.Log ) . error ( anyString ( ) , any ( java.lang.Throwable .class ) ) ; new DirectFieldAccessor ( org.springframework.integration.mqtt.MqttPahoMessageDrivenChannelAdapter ) . setPropertyValue ( STRING , org.springframework.integration.mqtt.Log ) ; MqttPahoMessageHandler org.springframework.integration.mqtt.MqttPahoMessageHandler = new MqttPahoMessageHandler ( STRING , STRING ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . setDefaultTopic ( STRING ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . afterPropertiesSet ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . start ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . int ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . void ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . int ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; verify ( org.springframework.integration.mqtt.Log ) . error ( contains ( STRING ) , any ( java.lang.Throwable .class ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . void ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertSame ( this . org.springframework.integration.mqtt.PollableChannel , TestUtils . getPropertyValue ( this . org.springframework.integration.mqtt.MqttPahoMessageDrivenChannelAdapter , STRING ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . int = NUMBER ; MqttPahoMessageHandler org.springframework.integration.mqtt.MqttPahoMessageHandler = new MqttPahoMessageHandler ( STRING , STRING ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . setDefaultTopic ( STRING ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . afterPropertiesSet ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . start ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . int ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . void ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . int ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( org.springframework.integration.mqtt.PollableChannel . receive ( NUMBER ) ) ; org.springframework.integration.mqtt.DownstreamExceptionTests.Service . java.util.concurrent.CyclicBarrier . void ( ) ; org.springframework.integration.mqtt.MqttPahoMessageHandler . stop ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) throws java.lang.Exception { java.util.concurrent.CyclicBarrier . int ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; if ( int ++ > NUMBER ) { throw new java.lang.RuntimeException ( STRING ) ; } }  <METHOD_END>
