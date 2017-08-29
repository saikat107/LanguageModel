<METHOD_START> @ java.lang.Override public org.springframework.web.socket.sockjs.transport.handler.TransportType org.springframework.web.socket.sockjs.transport.handler.TransportType ( ) { return TransportType . JSONP_SEND ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , WebSocketHandler org.springframework.web.socket.sockjs.transport.handler.WebSocketHandler , AbstractHttpSockJsSession org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) throws org.springframework.web.socket.sockjs.transport.handler.SockJsException { super. handleRequestInternal ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , org.springframework.web.socket.sockjs.transport.handler.WebSocketHandler , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) ; try { org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse . getBody ( ) . write ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new SockJsException ( STRING , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . getId ( ) , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String [] java.lang.String[] ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) throws java.io.IOException { SockJsMessageCodec org.springframework.web.socket.sockjs.transport.handler.SockJsMessageCodec = getServiceConfig ( ) . getMessageCodec ( ) ; MediaType org.springframework.web.socket.sockjs.transport.handler.MediaType = org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest . getHeaders ( ) . getContentType ( ) ; if ( org.springframework.web.socket.sockjs.transport.handler.MediaType != null && MediaType . APPLICATION_FORM_URLENCODED . isCompatibleWith ( org.springframework.web.socket.sockjs.transport.handler.MediaType ) ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.socket.sockjs.transport.handler.MultiValueMap<java.lang.String,java.lang.String> = this . org.springframework.web.socket.sockjs.transport.handler.FormHttpMessageConverter . read ( null , org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) ; java.lang.String java.lang.String = org.springframework.web.socket.sockjs.transport.handler.MultiValueMap<java.lang.String,java.lang.String> . getFirst ( STRING ) ; return ( StringUtils . hasText ( java.lang.String ) ? org.springframework.web.socket.sockjs.transport.handler.SockJsMessageCodec . decode ( java.lang.String ) : null ) ; } else { return org.springframework.web.socket.sockjs.transport.handler.SockJsMessageCodec . decodeInputStream ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest . getBody ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.transport.handler.HttpStatus org.springframework.web.socket.sockjs.transport.handler.HttpStatus ( ) { return HttpStatus . OK ; }  <METHOD_END>
