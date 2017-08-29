<METHOD_START> @ java.lang.Override public org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> < WebSocketSession > org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> ( WebSocketHandler org.springframework.web.socket.client.WebSocketHandler , java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { Assert . notNull ( java.lang.String , STRING ) ; java.net.URI java.net.URI = UriComponentsBuilder . fromUriString ( java.lang.String ) . buildAndExpand ( java.lang.Object[] ) . encode ( ) . toUri ( ) ; return org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> ( org.springframework.web.socket.client.WebSocketHandler , null , java.net.URI ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> < WebSocketSession > org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> ( WebSocketHandler org.springframework.web.socket.client.WebSocketHandler , WebSocketHttpHeaders org.springframework.web.socket.client.WebSocketHttpHeaders , java.net.URI java.net.URI ) { Assert . notNull ( org.springframework.web.socket.client.WebSocketHandler , STRING ) ; void ( java.net.URI ) ; if ( org.springframework.web.socket.client.Log . isDebugEnabled ( ) ) { org.springframework.web.socket.client.Log . debug ( STRING + java.net.URI ) ; } HttpHeaders org.springframework.web.socket.client.HttpHeaders = new HttpHeaders ( ) ; if ( org.springframework.web.socket.client.WebSocketHttpHeaders != null ) { for ( java.lang.String java.lang.String : org.springframework.web.socket.client.WebSocketHttpHeaders . keySet ( ) ) { if ( ! java.util.Set<java.lang.String> . boolean ( java.lang.String . java.lang.String ( ) ) ) { org.springframework.web.socket.client.HttpHeaders . put ( java.lang.String , org.springframework.web.socket.client.WebSocketHttpHeaders . get ( java.lang.String ) ) ; } } } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = ( org.springframework.web.socket.client.WebSocketHttpHeaders != null && org.springframework.web.socket.client.WebSocketHttpHeaders . getSecWebSocketProtocol ( ) != null ? org.springframework.web.socket.client.WebSocketHttpHeaders . getSecWebSocketProtocol ( ) : java.util.Collections . java.util.List<java.lang.String> ( ) ) ; java.util.List<org.springframework.web.socket.client.WebSocketExtension> < WebSocketExtension > java.util.List<org.springframework.web.socket.client.WebSocketExtension> = ( org.springframework.web.socket.client.WebSocketHttpHeaders != null && org.springframework.web.socket.client.WebSocketHttpHeaders . getSecWebSocketExtensions ( ) != null ? org.springframework.web.socket.client.WebSocketHttpHeaders . getSecWebSocketExtensions ( ) : java.util.Collections . java.util.List<org.springframework.web.socket.client.WebSocketExtension> ( ) ) ; return org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> ( org.springframework.web.socket.client.WebSocketHandler , org.springframework.web.socket.client.HttpHeaders , java.net.URI , java.util.List<java.lang.String> , java.util.List<org.springframework.web.socket.client.WebSocketExtension> , java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.net.URI java.net.URI ) { Assert . notNull ( java.net.URI , STRING ) ; java.lang.String java.lang.String = java.net.URI . java.lang.String ( ) ; if ( ! STRING . boolean ( java.lang.String ) && ! STRING . boolean ( java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> < WebSocketSession > org.springframework.web.socket.client.ListenableFuture<org.springframework.web.socket.client.WebSocketSession> ( WebSocketHandler org.springframework.web.socket.client.WebSocketHandler , HttpHeaders org.springframework.web.socket.client.HttpHeaders , java.net.URI java.net.URI , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> , java.util.List<org.springframework.web.socket.client.WebSocketExtension> < WebSocketExtension > java.util.List<org.springframework.web.socket.client.WebSocketExtension> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> );  <METHOD_END>
