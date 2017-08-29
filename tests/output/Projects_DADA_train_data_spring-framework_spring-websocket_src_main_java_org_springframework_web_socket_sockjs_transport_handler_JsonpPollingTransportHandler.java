<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.transport.handler.TransportType org.springframework.web.socket.sockjs.transport.handler.TransportType ( ) { return TransportType . JSONP ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.transport.handler.MediaType org.springframework.web.socket.sockjs.transport.handler.MediaType ( ) { return new MediaType ( STRING , STRING , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( SockJsSession org.springframework.web.socket.sockjs.transport.handler.SockJsSession ) { return org.springframework.web.socket.sockjs.transport.handler.SockJsSession instanceof PollingSockJsSession ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.transport.handler.PollingSockJsSession org.springframework.web.socket.sockjs.transport.handler.PollingSockJsSession ( java.lang.String java.lang.String , WebSocketHandler org.springframework.web.socket.sockjs.transport.handler.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return new PollingSockJsSession ( java.lang.String , getServiceConfig ( ) , org.springframework.web.socket.sockjs.transport.handler.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , AbstractHttpSockJsSession org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) throws org.springframework.web.socket.sockjs.transport.handler.SockJsException { try { java.lang.String java.lang.String = getCallbackParam ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse . setStatusCode ( HttpStatus . INTERNAL_SERVER_ERROR ) ; org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse . getBody ( ) . write ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; return; } } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . tryCloseWithSockJsTransportError ( java.lang.Throwable , CloseStatus . SERVER_ERROR ) ; throw new SockJsTransportFailureException ( STRING , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . getId ( ) , java.lang.Throwable ) ; } super. handleRequestInternal ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) { java.lang.String java.lang.String = getCallbackParam ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) ; return new DefaultSockJsFrameFormat ( STRING STRING + java.lang.String + STRING ) { @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return JavaScriptUtils . javaScriptEscape ( java.lang.String ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return JavaScriptUtils . javaScriptEscape ( java.lang.String ) ; }  <METHOD_END>
