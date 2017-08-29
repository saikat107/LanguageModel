<METHOD_START> @ java.lang.Override public final void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , WebSocketHandler org.springframework.web.socket.sockjs.transport.handler.WebSocketHandler , SockJsSession org.springframework.web.socket.sockjs.transport.handler.SockJsSession ) throws org.springframework.web.socket.sockjs.transport.handler.SockJsException { AbstractHttpSockJsSession org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession = ( AbstractHttpSockJsSession ) org.springframework.web.socket.sockjs.transport.handler.SockJsSession ; java.lang.String java.lang.String = null ; org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . setAcceptedProtocol ( java.lang.String ) ; org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse . getHeaders ( ) . setContentType ( org.springframework.web.socket.sockjs.transport.handler.MediaType ( ) ) ; void ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , ServerHttpResponse org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , AbstractHttpSockJsSession org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) throws org.springframework.web.socket.sockjs.transport.handler.SockJsException { if ( org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . isNew ( ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest . getMethod ( ) + STRING + org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest . getURI ( ) ) ; } org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . handleInitialRequest ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) ) ; } else if ( org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . isClosed ( ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) ; } SockJsFrame org.springframework.web.socket.sockjs.transport.handler.SockJsFrame = SockJsFrame . closeFrameGoAway ( ) ; try { org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse . getBody ( ) . write ( org.springframework.web.socket.sockjs.transport.handler.SockJsFrame . getContentBytes ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new SockJsException ( STRING + org.springframework.web.socket.sockjs.transport.handler.SockJsFrame , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . getId ( ) , java.io.IOException ) ; } } else if ( ! org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . isActive ( ) ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + getTransportType ( ) + STRING ) ; } org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . handleSuccessiveRequest ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest , org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse , org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) ) ; } else { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + getTransportType ( ) + STRING + org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession ) ; } java.lang.String java.lang.String = org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat ( org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) . format ( SockJsFrame . closeFrameAnotherConnectionOpen ( ) ) ; try { org.springframework.web.socket.sockjs.transport.handler.ServerHttpResponse . getBody ( ) . write ( java.lang.String . byte[] ( SockJsFrame . CHARSET ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new SockJsException ( STRING + java.lang.String , org.springframework.web.socket.sockjs.transport.handler.AbstractHttpSockJsSession . getId ( ) , java.io.IOException ) ; } } }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.web.socket.sockjs.transport.handler.MediaType org.springframework.web.socket.sockjs.transport.handler.MediaType ( )  <METHOD_END>
<METHOD_START> protected abstract org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat org.springframework.web.socket.sockjs.transport.handler.SockJsFrameFormat ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest );  <METHOD_END>
<METHOD_START> protected final java.lang.String java.lang.String ( ServerHttpRequest org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest ) { java.lang.String java.lang.String = org.springframework.web.socket.sockjs.transport.handler.ServerHttpRequest . getURI ( ) . getQuery ( ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.socket.sockjs.transport.handler.MultiValueMap<java.lang.String,java.lang.String> = UriComponentsBuilder . newInstance ( ) . query ( java.lang.String ) . build ( ) . getQueryParams ( ) ; java.lang.String java.lang.String = org.springframework.web.socket.sockjs.transport.handler.MultiValueMap<java.lang.String,java.lang.String> . getFirst ( STRING ) ; if ( StringUtils . isEmpty ( java.lang.String ) ) { return null ; } try { java.lang.String java.lang.String = UriUtils . decode ( java.lang.String , STRING ) ; return ( java.util.regex.Pattern . java.util.regex.Matcher ( java.lang.String ) . boolean ( ) ? java.lang.String : null ) ; } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { throw new SockJsException ( STRING , null , java.io.UnsupportedEncodingException ) ; } }  <METHOD_END>