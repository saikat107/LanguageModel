<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableApplicationContext sample.atmosphere.ConfigurableApplicationContext = new SpringApplicationBuilder ( sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) . properties ( STRING + this . int + STRING ) . run ( STRING ) ; long long = sample.atmosphere.ConfigurableApplicationContext . getBean ( sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .class ) . latch . getCount ( ) ; java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = sample.atmosphere.ConfigurableApplicationContext . getBean ( sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .class ) . messagePayload ; sample.atmosphere.ConfigurableApplicationContext . close ( ) ; assertThat ( long ) . isEqualTo ( NUMBER ) ; assertThat ( java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { sample.atmosphere.Log . info ( STRING + this . java.util.concurrent.CountDownLatch . long ( ) ) ; if ( this . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) { sample.atmosphere.Log . info ( STRING + this . java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; } else { sample.atmosphere.Log . info ( STRING + this . java.util.concurrent.CountDownLatch . long ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public sample.atmosphere.WebSocketConnectionManager sample.atmosphere.WebSocketConnectionManager ( ) { WebSocketConnectionManager sample.atmosphere.WebSocketConnectionManager = new WebSocketConnectionManager ( sample.atmosphere.StandardWebSocketClient ( ) , sample.atmosphere.TextWebSocketHandler ( ) , this . java.lang.String ) ; sample.atmosphere.WebSocketConnectionManager . setAutoStartup ( true ) ; return sample.atmosphere.WebSocketConnectionManager ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.atmosphere.StandardWebSocketClient sample.atmosphere.StandardWebSocketClient ( ) { return new StandardWebSocketClient ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.atmosphere.TextWebSocketHandler sample.atmosphere.TextWebSocketHandler ( ) { return new TextWebSocketHandler ( ) { @ java.lang.Override public void void ( WebSocketSession sample.atmosphere.WebSocketSession )						throws java.lang.Exception { sample.atmosphere.WebSocketSession . sendMessage ( new TextMessage ( STRING ) ) ; } @ java.lang.Override protected void void ( WebSocketSession sample.atmosphere.WebSocketSession , TextMessage sample.atmosphere.TextMessage ) throws java.lang.Exception { sample.atmosphere.Log . info ( STRING + sample.atmosphere.TextMessage + STRING + sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .this . java.util.concurrent.CountDownLatch . long ( ) + STRING ) ; sample.atmosphere.WebSocketSession . close ( ) ; sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .this . java.util.concurrent.atomic.AtomicReference<java.lang.String> . void ( sample.atmosphere.TextMessage . getPayload ( ) ) ; sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .this . java.util.concurrent.CountDownLatch . void ( ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession sample.atmosphere.WebSocketSession )						throws java.lang.Exception { sample.atmosphere.WebSocketSession . sendMessage ( new TextMessage ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( WebSocketSession sample.atmosphere.WebSocketSession , TextMessage sample.atmosphere.TextMessage ) throws java.lang.Exception { sample.atmosphere.Log . info ( STRING + sample.atmosphere.TextMessage + STRING + sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .this . java.util.concurrent.CountDownLatch . long ( ) + STRING ) ; sample.atmosphere.WebSocketSession . close ( ) ; sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .this . java.util.concurrent.atomic.AtomicReference<java.lang.String> . void ( sample.atmosphere.TextMessage . getPayload ( ) ) ; sample.atmosphere.SampleAtmosphereApplicationTests.ClientConfiguration .this . java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>