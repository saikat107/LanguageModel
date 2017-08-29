<METHOD_START> public void ( WebSocketClient org.springframework.web.socket.sockjs.client.WebSocketClient ) { Assert . notNull ( org.springframework.web.socket.sockjs.client.WebSocketClient , STRING ) ; this . org.springframework.web.socket.sockjs.client.WebSocketClient = org.springframework.web.socket.sockjs.client.WebSocketClient ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.socket.sockjs.client.WebSocketClient org.springframework.web.socket.sockjs.client.WebSocketClient ( ) { return this . org.springframework.web.socket.sockjs.client.WebSocketClient ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.socket.sockjs.client.TransportType> < TransportType > java.util.List<org.springframework.web.socket.sockjs.client.TransportType> ( ) { return java.util.Collections . java.util.List ( TransportType . WEBSOCKET ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.client.ListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> < WebSocketSession > org.springframework.web.socket.sockjs.client.ListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ( TransportRequest org.springframework.web.socket.sockjs.client.TransportRequest , WebSocketHandler org.springframework.web.socket.sockjs.client.WebSocketHandler ) { final SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> = new SettableListenableFuture <> ( ) ; WebSocketClientSockJsSession org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession = new WebSocketClientSockJsSession ( org.springframework.web.socket.sockjs.client.TransportRequest , org.springframework.web.socket.sockjs.client.WebSocketHandler , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; org.springframework.web.socket.sockjs.client.WebSocketHandler = new org.springframework.web.socket.sockjs.client.WebSocketTransport.ClientSockJsWebSocketHandler ( org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession ) ; org.springframework.web.socket.sockjs.client.TransportRequest . addTimeoutTask ( org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession . getTimeoutTask ( ) ) ; java.net.URI java.net.URI = org.springframework.web.socket.sockjs.client.TransportRequest . getTransportUrl ( ) ; WebSocketHttpHeaders org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders = new WebSocketHttpHeaders ( org.springframework.web.socket.sockjs.client.TransportRequest . getHandshakeHeaders ( ) ) ; if ( org.springframework.web.socket.sockjs.client.Log . isDebugEnabled ( ) ) { org.springframework.web.socket.sockjs.client.Log . debug ( STRING + java.net.URI ) ; } this . org.springframework.web.socket.sockjs.client.WebSocketClient . doHandshake ( org.springframework.web.socket.sockjs.client.WebSocketHandler , org.springframework.web.socket.sockjs.client.WebSocketHttpHeaders , java.net.URI ) . addCallback ( new ListenableFutureCallback < WebSocketSession > ( ) { @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession ) { } @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . setException ( java.lang.Throwable ) ; } } ) ; return org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . setException ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( ! boolean ( ) ) { if ( this . org.springframework.web.socket.sockjs.client.WebSocketClient instanceof Lifecycle ) { ( ( Lifecycle ) this . org.springframework.web.socket.sockjs.client.WebSocketClient ) . start ( ) ; } else { this . boolean = true ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( boolean ( ) ) { if ( this . org.springframework.web.socket.sockjs.client.WebSocketClient instanceof Lifecycle ) { ( ( Lifecycle ) this . org.springframework.web.socket.sockjs.client.WebSocketClient ) . stop ( ) ; } else { this . boolean = false ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { if ( this . org.springframework.web.socket.sockjs.client.WebSocketClient instanceof Lifecycle ) { return ( ( Lifecycle ) this . org.springframework.web.socket.sockjs.client.WebSocketClient ) . isRunning ( ) ; } else { return this . boolean ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . org.springframework.web.socket.sockjs.client.WebSocketClient + STRING ; }  <METHOD_END>
<METHOD_START> public void ( WebSocketClientSockJsSession org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession ) { Assert . notNull ( org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession , STRING ) ; this . org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession = org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession ) throws java.lang.Exception { Assert . state ( this . java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) , STRING ) ; this . org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession . initializeDelegateSession ( org.springframework.web.socket.sockjs.client.WebSocketSession ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession , TextMessage org.springframework.web.socket.sockjs.client.TextMessage ) throws java.lang.Exception { this . org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession . handleFrame ( org.springframework.web.socket.sockjs.client.TextMessage . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession , java.lang.Throwable java.lang.Throwable ) throws java.lang.Exception { this . org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession . handleTransportError ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession , CloseStatus org.springframework.web.socket.sockjs.client.CloseStatus ) throws java.lang.Exception { this . org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession . afterTransportClosed ( org.springframework.web.socket.sockjs.client.CloseStatus ) ; }  <METHOD_END>
