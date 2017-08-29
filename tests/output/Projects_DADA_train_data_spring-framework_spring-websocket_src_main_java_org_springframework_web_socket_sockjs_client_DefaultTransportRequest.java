<METHOD_START> public void ( SockJsUrlInfo org.springframework.web.socket.sockjs.client.SockJsUrlInfo , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , Transport org.springframework.web.socket.sockjs.client.Transport , TransportType org.springframework.web.socket.sockjs.client.TransportType , SockJsMessageCodec org.springframework.web.socket.sockjs.client.SockJsMessageCodec ) { Assert . notNull ( org.springframework.web.socket.sockjs.client.SockJsUrlInfo , STRING ) ; Assert . notNull ( org.springframework.web.socket.sockjs.client.Transport , STRING ) ; Assert . notNull ( org.springframework.web.socket.sockjs.client.TransportType , STRING ) ; Assert . notNull ( org.springframework.web.socket.sockjs.client.SockJsMessageCodec , STRING ) ; this . org.springframework.web.socket.sockjs.client.SockJsUrlInfo = org.springframework.web.socket.sockjs.client.SockJsUrlInfo ; this . org.springframework.web.socket.sockjs.client.HttpHeaders = ( org.springframework.web.socket.sockjs.client.HttpHeaders != null ? org.springframework.web.socket.sockjs.client.HttpHeaders : new HttpHeaders ( ) ) ; this . org.springframework.web.socket.sockjs.client.HttpHeaders = ( org.springframework.web.socket.sockjs.client.HttpHeaders != null ? org.springframework.web.socket.sockjs.client.HttpHeaders : new HttpHeaders ( ) ) ; this . org.springframework.web.socket.sockjs.client.Transport = org.springframework.web.socket.sockjs.client.Transport ; this . org.springframework.web.socket.sockjs.client.TransportType = org.springframework.web.socket.sockjs.client.TransportType ; this . org.springframework.web.socket.sockjs.client.SockJsMessageCodec = org.springframework.web.socket.sockjs.client.SockJsMessageCodec ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.client.SockJsUrlInfo org.springframework.web.socket.sockjs.client.SockJsUrlInfo ( ) { return this . org.springframework.web.socket.sockjs.client.SockJsUrlInfo ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.client.HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders ( ) { return this . org.springframework.web.socket.sockjs.client.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.client.HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders ( ) { return this . org.springframework.web.socket.sockjs.client.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . org.springframework.web.socket.sockjs.client.SockJsUrlInfo . getTransportUrl ( this . org.springframework.web.socket.sockjs.client.TransportType ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.security.Principal java.security.Principal ) { this . java.security.Principal = java.security.Principal ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.security.Principal java.security.Principal ( ) { return this . java.security.Principal ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.client.SockJsMessageCodec org.springframework.web.socket.sockjs.client.SockJsMessageCodec ( ) { return this . org.springframework.web.socket.sockjs.client.SockJsMessageCodec ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public void void ( TaskScheduler org.springframework.web.socket.sockjs.client.TaskScheduler ) { this . org.springframework.web.socket.sockjs.client.TaskScheduler = org.springframework.web.socket.sockjs.client.TaskScheduler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { this . java.util.List<java.lang.Runnable> . boolean ( java.lang.Runnable ) ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest org.springframework.web.socket.sockjs.client.DefaultTransportRequest ) { this . org.springframework.web.socket.sockjs.client.DefaultTransportRequest = org.springframework.web.socket.sockjs.client.DefaultTransportRequest ; }  <METHOD_END>
<METHOD_START> public void void ( WebSocketHandler org.springframework.web.socket.sockjs.client.WebSocketHandler , SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) { if ( org.springframework.web.socket.sockjs.client.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.sockjs.client.Log . trace ( STRING + this ) ; } org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback = new org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback ( org.springframework.web.socket.sockjs.client.WebSocketHandler , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; void ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback ) ; this . org.springframework.web.socket.sockjs.client.Transport . connect ( this , org.springframework.web.socket.sockjs.client.WebSocketHandler ) . addCallback ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback ) { if ( this . org.springframework.web.socket.sockjs.client.TaskScheduler != null ) { if ( org.springframework.web.socket.sockjs.client.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.sockjs.client.Log . trace ( STRING + this . long + STRING ) ; } java.util.Date java.util.Date = new java.util.Date ( java.lang.System . long ( ) + this . long ) ; this . org.springframework.web.socket.sockjs.client.TaskScheduler . schedule ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest.ConnectCallback , java.util.Date ) ; } else if ( org.springframework.web.socket.sockjs.client.Log . isTraceEnabled ( ) ) { org.springframework.web.socket.sockjs.client.Log . trace ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + java.net.URI ( ) + STRING ; }  <METHOD_END>
<METHOD_START> public void ( WebSocketHandler org.springframework.web.socket.sockjs.client.WebSocketHandler , SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) { this . org.springframework.web.socket.sockjs.client.WebSocketHandler = org.springframework.web.socket.sockjs.client.WebSocketHandler ; this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> = org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebSocketSession org.springframework.web.socket.sockjs.client.WebSocketSession ) { if ( this . java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . set ( org.springframework.web.socket.sockjs.client.WebSocketSession ) ; } else if ( org.springframework.web.socket.sockjs.client.Log . isErrorEnabled ( ) ) { org.springframework.web.socket.sockjs.client.Log . error ( STRING + org.springframework.web.socket.sockjs.client.DefaultTransportRequest .this ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { void ( java.lang.Throwable , false ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { void ( null , true ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Throwable java.lang.Throwable , boolean boolean ) { if ( this . java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { if ( boolean ) { java.lang.String java.lang.String = STRING + org.springframework.web.socket.sockjs.client.DefaultTransportRequest .this ; org.springframework.web.socket.sockjs.client.Log . error ( java.lang.String ) ; java.lang.Throwable = new SockJsTransportFailureException ( java.lang.String , org.springframework.web.socket.sockjs.client.SockJsUrlInfo ( ) . getSessionId ( ) , java.lang.Throwable ) ; } if ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest != null ) { org.springframework.web.socket.sockjs.client.Log . error ( org.springframework.web.socket.sockjs.client.DefaultTransportRequest .this + STRING , java.lang.Throwable ) ; org.springframework.web.socket.sockjs.client.DefaultTransportRequest . void ( this . org.springframework.web.socket.sockjs.client.WebSocketHandler , this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; } else { org.springframework.web.socket.sockjs.client.Log . error ( STRING + org.springframework.web.socket.sockjs.client.DefaultTransportRequest .this , java.lang.Throwable ) ; this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . setException ( java.lang.Throwable ) ; } if ( boolean ) { try { for ( java.lang.Runnable java.lang.Runnable : java.util.List<java.lang.Runnable> ) { java.lang.Runnable . void ( ) ; } } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.web.socket.sockjs.client.Log . error ( STRING + org.springframework.web.socket.sockjs.client.DefaultTransportRequest .this , java.lang.Throwable ) ; } } } else { org.springframework.web.socket.sockjs.client.Log . error ( STRING + org.springframework.web.socket.sockjs.client.DefaultTransportRequest .this + STRING , java.lang.Throwable ) ; } }  <METHOD_END>
