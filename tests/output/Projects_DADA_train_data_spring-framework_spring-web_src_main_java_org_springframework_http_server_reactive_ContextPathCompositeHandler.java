<METHOD_START> public void ( java.util.Map<java.lang.String,? extends org.springframework.http.server.reactive.HttpHandler> < java.lang.String , ? extends HttpHandler > java.util.Map<java.lang.String,? extends org.springframework.http.server.reactive.HttpHandler> ) { Assert . notEmpty ( java.util.Map<java.lang.String,> , STRING ) ; this . java.util.Map<java.lang.String,org.springframework.http.server.reactive.HttpHandler> = java.util.Map<java.lang.String,org.springframework.http.server.reactive.HttpHandler> ( java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Map<java.lang.String,org.springframework.http.server.reactive.HttpHandler> < java.lang.String , HttpHandler > java.util.Map<java.lang.String,org.springframework.http.server.reactive.HttpHandler> ( java.util.Map<java.lang.String,? extends org.springframework.http.server.reactive.HttpHandler> < java.lang.String , ? extends HttpHandler > java.util.Map<java.lang.String,? extends org.springframework.http.server.reactive.HttpHandler> ) { java.util.Map<java.lang.String,> . java.util.Set<java.lang.String> ( ) . void ( org.springframework.http.server.reactive.ContextPathCompositeHandler :: void ) ; return new java.util.LinkedHashMap <> ( java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; if ( java.lang.String . boolean ( STRING ) ) { return; } Assert . isTrue ( java.lang.String . boolean ( STRING ) , STRING ) ; Assert . isTrue ( ! java.lang.String . boolean ( STRING ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.server.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.server.reactive.Mono<java.lang.Void> ( ServerHttpRequest org.springframework.http.server.reactive.ServerHttpRequest , ServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponse ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.http.server.reactive.ServerHttpRequest ) ; return this . java.util.Map<java.lang.String,org.springframework.http.server.reactive.HttpHandler> . entrySet ( ) . stream ( ) . filter ( entry -> path . startsWith ( entry . getKey ( ) ) ) . findFirst ( ) . map ( entry -> { String contextPath = request . getContextPath ( ) + entry . getKey ( ) ; ServerHttpRequest newRequest = request . mutate ( ) . contextPath ( contextPath ) . build ( ) ; return entry . getValue ( ) . handle ( newRequest , response ) ; } ) . orElseGet ( ( ) { response . setStatusCode ( HttpStatus . NOT_FOUND ) ; response . setComplete ( ) ; return Mono . empty ( ) ; } ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ServerHttpRequest org.springframework.http.server.reactive.ServerHttpRequest ) { java.lang.String java.lang.String = org.springframework.http.server.reactive.ServerHttpRequest . getURI ( ) . getRawPath ( ) ; java.lang.String java.lang.String = org.springframework.http.server.reactive.ServerHttpRequest . getContextPath ( ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { return java.lang.String ; } int int = java.lang.String . int ( ) ; return ( java.lang.String . int ( ) > int ? java.lang.String . java.lang.String ( int ) : STRING ) ; }  <METHOD_END>