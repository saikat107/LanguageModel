<METHOD_START> public void ( GreetingService samples.websocket.tomcat.client.GreetingService , java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch , java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> ) { this . samples.websocket.tomcat.client.GreetingService = samples.websocket.tomcat.client.GreetingService ; this . java.util.concurrent.CountDownLatch = java.util.concurrent.CountDownLatch ; this . java.util.concurrent.atomic.AtomicReference<java.lang.String> = java.util.concurrent.atomic.AtomicReference<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession samples.websocket.tomcat.client.WebSocketSession ) throws java.lang.Exception { TextMessage samples.websocket.tomcat.client.TextMessage = new TextMessage ( this . samples.websocket.tomcat.client.GreetingService . getGreeting ( ) ) ; samples.websocket.tomcat.client.WebSocketSession . sendMessage ( samples.websocket.tomcat.client.TextMessage ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession samples.websocket.tomcat.client.WebSocketSession , TextMessage samples.websocket.tomcat.client.TextMessage )			throws java.lang.Exception { this . samples.websocket.tomcat.client.Log . info ( STRING + samples.websocket.tomcat.client.TextMessage + STRING + this . java.util.concurrent.CountDownLatch . long ( ) + STRING ) ; samples.websocket.tomcat.client.WebSocketSession . close ( ) ; this . java.util.concurrent.atomic.AtomicReference<java.lang.String> . void ( samples.websocket.tomcat.client.TextMessage . getPayload ( ) ) ; this . java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>