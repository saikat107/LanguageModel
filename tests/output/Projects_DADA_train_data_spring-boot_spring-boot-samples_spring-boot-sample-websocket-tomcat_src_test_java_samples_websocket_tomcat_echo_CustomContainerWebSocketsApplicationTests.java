<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableApplicationContext samples.websocket.tomcat.echo.ConfigurableApplicationContext = new SpringApplicationBuilder ( samples.websocket.tomcat.echo.CustomContainerWebSocketsApplicationTests.ClientConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) . properties ( STRING + int + STRING ) . run ( STRING ) ; long long = samples.websocket.tomcat.echo.ConfigurableApplicationContext . getBean ( samples.websocket.tomcat.echo.CustomContainerWebSocketsApplicationTests.ClientConfiguration .class ) . latch . getCount ( ) ; java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = samples.websocket.tomcat.echo.ConfigurableApplicationContext . getBean ( samples.websocket.tomcat.echo.CustomContainerWebSocketsApplicationTests.ClientConfiguration .class ) . messagePayload ; samples.websocket.tomcat.echo.ConfigurableApplicationContext . close ( ) ; assertThat ( long ) . isEqualTo ( NUMBER ) ; assertThat ( java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableApplicationContext samples.websocket.tomcat.echo.ConfigurableApplicationContext = new SpringApplicationBuilder ( samples.websocket.tomcat.echo.CustomContainerWebSocketsApplicationTests.ClientConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) . properties ( STRING + int + STRING ) . run ( STRING ) ; long long = samples.websocket.tomcat.echo.ConfigurableApplicationContext . getBean ( samples.websocket.tomcat.echo.CustomContainerWebSocketsApplicationTests.ClientConfiguration .class ) . latch . getCount ( ) ; java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = samples.websocket.tomcat.echo.ConfigurableApplicationContext . getBean ( samples.websocket.tomcat.echo.CustomContainerWebSocketsApplicationTests.ClientConfiguration .class ) . messagePayload ; samples.websocket.tomcat.echo.ConfigurableApplicationContext . close ( ) ; assertThat ( long ) . isEqualTo ( NUMBER ) ; assertThat ( java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public samples.websocket.tomcat.echo.ServletWebServerFactory samples.websocket.tomcat.echo.ServletWebServerFactory ( ) { return new TomcatServletWebServerFactory ( STRING , int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { samples.websocket.tomcat.echo.Log . info ( STRING + this . java.util.concurrent.CountDownLatch . long ( ) ) ; if ( this . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) { samples.websocket.tomcat.echo.Log . info ( STRING + this . java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; } else { samples.websocket.tomcat.echo.Log . info ( STRING + this . java.util.concurrent.CountDownLatch . long ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public samples.websocket.tomcat.echo.WebSocketConnectionManager samples.websocket.tomcat.echo.WebSocketConnectionManager ( ) { WebSocketConnectionManager samples.websocket.tomcat.echo.WebSocketConnectionManager = new WebSocketConnectionManager ( samples.websocket.tomcat.echo.StandardWebSocketClient ( ) , samples.websocket.tomcat.echo.SimpleClientWebSocketHandler ( ) , this . java.lang.String ) ; samples.websocket.tomcat.echo.WebSocketConnectionManager . setAutoStartup ( true ) ; return samples.websocket.tomcat.echo.WebSocketConnectionManager ; }  <METHOD_END>
<METHOD_START> @ Bean public samples.websocket.tomcat.echo.StandardWebSocketClient samples.websocket.tomcat.echo.StandardWebSocketClient ( ) { return new StandardWebSocketClient ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public samples.websocket.tomcat.echo.SimpleClientWebSocketHandler samples.websocket.tomcat.echo.SimpleClientWebSocketHandler ( ) { return new SimpleClientWebSocketHandler ( samples.websocket.tomcat.echo.GreetingService ( ) , this . java.util.concurrent.CountDownLatch , this . java.util.concurrent.atomic.AtomicReference<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Bean public samples.websocket.tomcat.echo.GreetingService samples.websocket.tomcat.echo.GreetingService ( ) { return new SimpleGreetingService ( ) ; }  <METHOD_END>
