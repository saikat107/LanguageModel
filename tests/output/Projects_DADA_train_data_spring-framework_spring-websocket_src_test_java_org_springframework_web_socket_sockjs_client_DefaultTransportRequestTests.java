<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Before public void void ( ) java.lang.Exception { this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> = mock ( ListenableFutureCallback .class ) ; this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> = new SettableListenableFuture <> ( ) ; this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . addCallback ( this . org.springframework.web.socket.sockjs.client.ListenableFutureCallback<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; this . org.springframework.web.socket.sockjs.client.TestTransport = new TestTransport ( STRING ) ; this . org.springframework.web.socket.sockjs.client.TestTransport = new TestTransport ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest = org.springframework.web.socket.sockjs.client.DefaultTransportRequest ( this . org.springframework.web.socket.sockjs.client.TestTransport , TransportType . WEBSOCKET ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . connect ( null , this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession = mock ( WebSocketSession .class ) ; this . org.springframework.web.socket.sockjs.client.TestTransport . getConnectCallback ( ) . onSuccess ( org.springframework.web.socket.sockjs.client.WebSocketSession ) ; assertSame ( org.springframework.web.socket.sockjs.client.WebSocketSession , this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest = org.springframework.web.socket.sockjs.client.DefaultTransportRequest ( this . org.springframework.web.socket.sockjs.client.TestTransport , TransportType . WEBSOCKET ) ; DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest = org.springframework.web.socket.sockjs.client.DefaultTransportRequest ( this . org.springframework.web.socket.sockjs.client.TestTransport , TransportType . XHR_STREAMING ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . setFallbackRequest ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . connect ( null , this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; this . org.springframework.web.socket.sockjs.client.TestTransport . getConnectCallback ( ) . onFailure ( new java.io.IOException ( STRING ) ) ; assertFalse ( this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . isDone ( ) ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; this . org.springframework.web.socket.sockjs.client.TestTransport . getConnectCallback ( ) . onFailure ( new java.io.IOException ( STRING ) ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . isDone ( ) ) ; this . org.springframework.web.socket.sockjs.client.ExpectedException . expect ( java.util.concurrent.ExecutionException .class ) ; this . org.springframework.web.socket.sockjs.client.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . get ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TaskScheduler org.springframework.web.socket.sockjs.client.TaskScheduler = mock ( TaskScheduler .class ) ; java.lang.Runnable java.lang.Runnable = mock ( java.lang.Runnable .class ) ; DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest = org.springframework.web.socket.sockjs.client.DefaultTransportRequest ( this . org.springframework.web.socket.sockjs.client.TestTransport , TransportType . WEBSOCKET ) ; DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest = org.springframework.web.socket.sockjs.client.DefaultTransportRequest ( this . org.springframework.web.socket.sockjs.client.TestTransport , TransportType . XHR_STREAMING ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . setFallbackRequest ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . setTimeoutScheduler ( org.springframework.web.socket.sockjs.client.TaskScheduler ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . addTimeoutTask ( java.lang.Runnable ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . connect ( null , this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; assertFalse ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; ArgumentCaptor < java.lang.Runnable > org.springframework.web.socket.sockjs.client.ArgumentCaptor<java.lang.Runnable> = ArgumentCaptor . forClass ( java.lang.Runnable .class ) ; verify ( org.springframework.web.socket.sockjs.client.TaskScheduler ) . schedule ( org.springframework.web.socket.sockjs.client.ArgumentCaptor<java.lang.Runnable> . capture ( ) , any ( java.util.Date .class ) ) ; verifyNoMoreInteractions ( org.springframework.web.socket.sockjs.client.TaskScheduler ) ; org.springframework.web.socket.sockjs.client.ArgumentCaptor<java.lang.Runnable> . getValue ( ) . run ( ) ; assertTrue ( this . org.springframework.web.socket.sockjs.client.TestTransport . invoked ( ) ) ; verify ( java.lang.Runnable ) . run ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.socket.sockjs.client.DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest ( Transport org.springframework.web.socket.sockjs.client.Transport , TransportType org.springframework.web.socket.sockjs.client.TransportType ) throws java.lang.Exception { SockJsUrlInfo org.springframework.web.socket.sockjs.client.SockJsUrlInfo = new SockJsUrlInfo ( new java.net.URI ( STRING ) ) ; return new DefaultTransportRequest ( org.springframework.web.socket.sockjs.client.SockJsUrlInfo , new HttpHeaders ( ) , new HttpHeaders ( ) , org.springframework.web.socket.sockjs.client.Transport , org.springframework.web.socket.sockjs.client.TransportType , org.springframework.web.socket.sockjs.client.Jackson2SockJsMessageCodec ) ; }  <METHOD_END>