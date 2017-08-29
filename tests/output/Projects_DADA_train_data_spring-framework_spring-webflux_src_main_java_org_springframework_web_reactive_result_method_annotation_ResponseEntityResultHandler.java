<METHOD_START> public void ( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> , RequestedContentTypeResolver org.springframework.web.reactive.result.method.annotation.RequestedContentTypeResolver ) { this( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> , org.springframework.web.reactive.result.method.annotation.RequestedContentTypeResolver , new ReactiveAdapterRegistry ( ) ); }  <METHOD_END>
<METHOD_START> public void ( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> , RequestedContentTypeResolver org.springframework.web.reactive.result.method.annotation.RequestedContentTypeResolver , ReactiveAdapterRegistry org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ) { super( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> , org.springframework.web.reactive.result.method.annotation.RequestedContentTypeResolver , org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ); setOrder ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( HandlerResult org.springframework.web.reactive.result.method.annotation.HandlerResult ) { if ( boolean ( org.springframework.web.reactive.result.method.annotation.HandlerResult . getReturnType ( ) ) ) { return true ; } ReactiveAdapter org.springframework.web.reactive.result.method.annotation.ReactiveAdapter = getAdapter ( org.springframework.web.reactive.result.method.annotation.HandlerResult ) ; return org.springframework.web.reactive.result.method.annotation.ReactiveAdapter != null && ! org.springframework.web.reactive.result.method.annotation.ReactiveAdapter . isNoValue ( ) && boolean ( org.springframework.web.reactive.result.method.annotation.HandlerResult . getReturnType ( ) . getGeneric ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.web.reactive.result.method.annotation.ResolvableType . getRawClass ( ) ; return ( HttpEntity .class . boolean ( java.lang.Class<> ) && ! RequestEntity .class . boolean ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Void> ( ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange , HandlerResult org.springframework.web.reactive.result.method.annotation.HandlerResult ) { Mono < ? > org.springframework.web.reactive.result.method.annotation.Mono<?> ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ; ReactiveAdapter org.springframework.web.reactive.result.method.annotation.ReactiveAdapter = getAdapter ( org.springframework.web.reactive.result.method.annotation.HandlerResult ) ; if ( org.springframework.web.reactive.result.method.annotation.ReactiveAdapter != null ) { Assert . isTrue ( ! org.springframework.web.reactive.result.method.annotation.ReactiveAdapter . isMultiValue ( ) , STRING ) ; org.springframework.web.reactive.result.method.annotation.Mono<?> = Mono . from ( org.springframework.web.reactive.result.method.annotation.ReactiveAdapter . toPublisher ( org.springframework.web.reactive.result.method.annotation.HandlerResult . getReturnValue ( ) ) ) ; org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.HandlerResult . getReturnTypeSource ( ) . nested ( ) . nested ( ) ; } else { org.springframework.web.reactive.result.method.annotation.Mono<?> = Mono . justOrEmpty ( org.springframework.web.reactive.result.method.annotation.HandlerResult . getReturnValue ( ) ) ; org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.HandlerResult . getReturnTypeSource ( ) . nested ( ) ; } return org.springframework.web.reactive.result.method.annotation.Mono<> . then ( returnValue -> { Assert . isInstanceOf ( HttpEntity .class , returnValue , STRING ) ; HttpEntity < ? > httpEntity = ( HttpEntity < ? > ) returnValue ; if ( httpEntity instanceof ResponseEntity ) { ResponseEntity < ? > responseEntity = ( ResponseEntity < ? > ) httpEntity ; exchange . getResponse ( ) . setStatusCode ( responseEntity . getStatusCode ( ) ) ; } HttpHeaders entityHeaders = httpEntity . getHeaders ( ) ; HttpHeaders responseHeaders = exchange . getResponse ( ) . getHeaders ( ) ; if ( ! entityHeaders . isEmpty ( ) ) { entityHeaders . entrySet ( ) . stream ( ) . filter ( entry -> ! responseHeaders . containsKey ( entry . getKey ( ) ) ) . forEach ( entry -> responseHeaders . put ( entry . getKey ( ) , entry . getValue ( ) ) ) ; } if( httpEntity . getBody ( ) == null ) { return exchange . getResponse ( ) . setComplete ( ) ; } String etag = entityHeaders . getETag ( ) ; Instant lastModified = Instant . ofEpochMilli ( entityHeaders . getLastModified ( ) ) ; HttpMethod httpMethod = exchange . getRequest ( ) . getMethod ( ) ; if ( SAFE_METHODS . contains ( httpMethod ) && exchange . checkNotModified ( etag , lastModified ) ) { return exchange . getResponse ( ) . setComplete ( ) ; } return writeBody ( httpEntity . getBody ( ) , bodyParameter , exchange ) ; } ) ; }  <METHOD_END>
