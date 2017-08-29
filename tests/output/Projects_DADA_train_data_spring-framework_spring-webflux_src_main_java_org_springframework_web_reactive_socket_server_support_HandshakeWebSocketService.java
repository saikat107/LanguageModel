<METHOD_START> public void ( ) { this( org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) ); }  <METHOD_END>
<METHOD_START> public void ( RequestUpgradeStrategy org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ) { Assert . notNull ( org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy , STRING ) ; this . org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy = org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ; }  <METHOD_END>
<METHOD_START> private static org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) { java.lang.String java.lang.String ; if ( boolean ) { java.lang.String = STRING ; } else if ( boolean ) { java.lang.String = STRING ; } else if ( boolean ) { java.lang.String = STRING ; } else if ( boolean ) { java.lang.String = STRING ; } else if ( boolean ) { java.lang.String = STRING ; } else { throw new java.lang.IllegalStateException ( STRING ) ; } try { java.lang.String = STRING + java.lang.String ; java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . forName ( java.lang.String , org.springframework.web.reactive.socket.server.support.HandshakeWebSocketService .class . java.lang.ClassLoader ( ) ) ; return ( RequestUpgradeStrategy ) ReflectionUtils . accessibleConstructor ( java.lang.Class<> ) . newInstance ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) { return this . org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( ! boolean ( ) ) { this . boolean = true ; void ( ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( ) { if ( org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) instanceof Lifecycle ) { ( ( Lifecycle ) org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) ) . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( boolean ( ) ) { this . boolean = false ; void ( ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( ) { if ( org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) instanceof Lifecycle ) { ( ( Lifecycle ) org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy ( ) ) . stop ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> ( ServerWebExchange org.springframework.web.reactive.socket.server.support.ServerWebExchange , WebSocketHandler org.springframework.web.reactive.socket.server.support.WebSocketHandler ) { ServerHttpRequest org.springframework.web.reactive.socket.server.support.ServerHttpRequest = org.springframework.web.reactive.socket.server.support.ServerWebExchange . getRequest ( ) ; HttpMethod org.springframework.web.reactive.socket.server.support.HttpMethod = org.springframework.web.reactive.socket.server.support.ServerHttpRequest . getMethod ( ) ; HttpHeaders org.springframework.web.reactive.socket.server.support.HttpHeaders = org.springframework.web.reactive.socket.server.support.ServerHttpRequest . getHeaders ( ) ; if ( org.springframework.web.reactive.socket.server.support.Log . isDebugEnabled ( ) ) { org.springframework.web.reactive.socket.server.support.Log . debug ( STRING + org.springframework.web.reactive.socket.server.support.ServerHttpRequest . getURI ( ) + STRING + org.springframework.web.reactive.socket.server.support.HttpHeaders ) ; } if ( HttpMethod . GET != org.springframework.web.reactive.socket.server.support.HttpMethod ) { return Mono . error ( new MethodNotAllowedException ( org.springframework.web.reactive.socket.server.support.HttpMethod , java.util.Collections . java.util.Set ( HttpMethod . GET ) ) ) ; } if ( ! STRING . boolean ( org.springframework.web.reactive.socket.server.support.HttpHeaders . getUpgrade ( ) ) ) { return org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> ( STRING + org.springframework.web.reactive.socket.server.support.HttpHeaders ) ; } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.web.reactive.socket.server.support.HttpHeaders . getConnection ( ) ; if ( ! java.util.List<java.lang.String> . boolean ( STRING ) && ! java.util.List<java.lang.String> . boolean ( STRING ) ) { return org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> ( STRING + org.springframework.web.reactive.socket.server.support.HttpHeaders ) ; } java.lang.String java.lang.String = org.springframework.web.reactive.socket.server.support.HttpHeaders . getFirst ( java.lang.String ) ; if ( java.lang.String == null ) { return org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> ( STRING ) ; } java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> = java.util.Optional<java.lang.String> ( org.springframework.web.reactive.socket.server.support.HttpHeaders , org.springframework.web.reactive.socket.server.support.WebSocketHandler ) ; return this . org.springframework.web.reactive.socket.server.support.RequestUpgradeStrategy . upgrade ( org.springframework.web.reactive.socket.server.support.ServerWebExchange , org.springframework.web.reactive.socket.server.support.WebSocketHandler , java.util.Optional<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.socket.server.support.Mono<java.lang.Void> ( java.lang.String java.lang.String ) { if ( org.springframework.web.reactive.socket.server.support.Log . isDebugEnabled ( ) ) { org.springframework.web.reactive.socket.server.support.Log . debug ( java.lang.String ) ; } return Mono . error ( new ServerWebInputException ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> ( HttpHeaders org.springframework.web.reactive.socket.server.support.HttpHeaders , WebSocketHandler org.springframework.web.reactive.socket.server.support.WebSocketHandler ) { java.lang.String java.lang.String = org.springframework.web.reactive.socket.server.support.HttpHeaders . getFirst ( java.lang.String ) ; if ( java.lang.String == null ) { return java.util.Optional . java.util.Optional<java.lang.String> ( ) ; } java.lang.String [] java.lang.String[] = org.springframework.web.reactive.socket.server.support.WebSocketHandler . getSubProtocols ( ) ; return StringUtils . commaDelimitedListToSet ( java.lang.String ) . stream ( ) . filter ( protocol -> Arrays . stream ( protocols ) . anyMatch ( protocol :: equals ) ) . findFirst ( ) ; }  <METHOD_END>
