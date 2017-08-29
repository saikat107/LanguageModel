<METHOD_START> public void ( HttpHandler org.springframework.test.web.reactive.server.HttpHandler ) { Assert . notNull ( org.springframework.test.web.reactive.server.HttpHandler , STRING ) ; this . org.springframework.test.web.reactive.server.HttpHandler = org.springframework.test.web.reactive.server.HttpHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.reactive.server.Mono<org.springframework.test.web.reactive.server.ClientHttpResponse> < ClientHttpResponse > org.springframework.test.web.reactive.server.Mono<org.springframework.test.web.reactive.server.ClientHttpResponse> ( HttpMethod org.springframework.test.web.reactive.server.HttpMethod , java.net.URI java.net.URI , java.util.function.Function<? super org.springframework.test.web.reactive.server.ClientHttpRequest,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> < ? super ClientHttpRequest , Mono < java.lang.Void > > java.util.function.Function<? super org.springframework.test.web.reactive.server.ClientHttpRequest,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> ) { MonoProcessor < ClientHttpResponse > org.springframework.test.web.reactive.server.MonoProcessor<org.springframework.test.web.reactive.server.ClientHttpResponse> = MonoProcessor . create ( ) ; MockClientHttpRequest org.springframework.test.web.reactive.server.MockClientHttpRequest = new MockClientHttpRequest ( org.springframework.test.web.reactive.server.HttpMethod , java.net.URI ) ; MockServerHttpResponse org.springframework.test.web.reactive.server.MockServerHttpResponse = new MockServerHttpResponse ( ) ; org.springframework.test.web.reactive.server.MockClientHttpRequest . setWriteHandler ( requestBody -> { log ( STRING , httpMethod , uri ) ; ServerHttpRequest mockServerRequest = adaptRequest ( mockClientRequest , requestBody ) ; this . handler . handle ( mockServerRequest , mockServerResponse ) . subscribe ( aVoid -> {} , result :: onError ) ; return Mono . empty ( ) ; } ) ; org.springframework.test.web.reactive.server.MockServerHttpResponse . setWriteHandler ( responseBody -> { log ( STRING , httpMethod , uri ) ; result . onNext ( adaptResponse ( mockServerResponse , responseBody ) ) ; return Mono . empty ( ) ; } ) ; void ( STRING , org.springframework.test.web.reactive.server.HttpMethod , java.net.URI ) ; java.util.function.Function<,org.springframework.test.web.reactive.server.Mono<java.lang.Void>> . apply ( org.springframework.test.web.reactive.server.MockClientHttpRequest ) . subscribe ( aVoid -> {} , org.springframework.test.web.reactive.server.MonoProcessor<org.springframework.test.web.reactive.server.ClientHttpResponse> :: onError ) ; return org.springframework.test.web.reactive.server.MonoProcessor<org.springframework.test.web.reactive.server.ClientHttpResponse> ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , HttpMethod org.springframework.test.web.reactive.server.HttpMethod , java.net.URI java.net.URI ) { if ( org.springframework.test.web.reactive.server.Log . isDebugEnabled ( ) ) { org.springframework.test.web.reactive.server.Log . debug ( java.lang.String . java.lang.String ( STRING , java.lang.String , org.springframework.test.web.reactive.server.HttpMethod , java.net.URI ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.reactive.server.ServerHttpRequest org.springframework.test.web.reactive.server.ServerHttpRequest ( MockClientHttpRequest org.springframework.test.web.reactive.server.MockClientHttpRequest , Publisher < DataBuffer > org.springframework.test.web.reactive.server.Publisher<org.springframework.test.web.reactive.server.DataBuffer> ) { HttpMethod org.springframework.test.web.reactive.server.HttpMethod = org.springframework.test.web.reactive.server.MockClientHttpRequest . getMethod ( ) ; java.net.URI java.net.URI = org.springframework.test.web.reactive.server.MockClientHttpRequest . getURI ( ) ; HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders = org.springframework.test.web.reactive.server.MockClientHttpRequest . getHeaders ( ) ; MultiValueMap < java.lang.String , HttpCookie > org.springframework.test.web.reactive.server.MultiValueMap<java.lang.String,org.springframework.test.web.reactive.server.HttpCookie> = org.springframework.test.web.reactive.server.MockClientHttpRequest . getCookies ( ) ; return MockServerHttpRequest . method ( org.springframework.test.web.reactive.server.HttpMethod , java.net.URI ) . headers ( org.springframework.test.web.reactive.server.HttpHeaders ) . cookies ( org.springframework.test.web.reactive.server.MultiValueMap<java.lang.String,org.springframework.test.web.reactive.server.HttpCookie> ) . body ( org.springframework.test.web.reactive.server.Publisher<org.springframework.test.web.reactive.server.DataBuffer> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.reactive.server.ClientHttpResponse org.springframework.test.web.reactive.server.ClientHttpResponse ( MockServerHttpResponse org.springframework.test.web.reactive.server.MockServerHttpResponse , Flux < DataBuffer > org.springframework.test.web.reactive.server.Flux<org.springframework.test.web.reactive.server.DataBuffer> ) { HttpStatus org.springframework.test.web.reactive.server.HttpStatus = java.util.Optional . java.util.Optional ( org.springframework.test.web.reactive.server.MockServerHttpResponse . getStatusCode ( ) ) . orElse ( HttpStatus . OK ) ; MockClientHttpResponse org.springframework.test.web.reactive.server.MockClientHttpResponse = new MockClientHttpResponse ( org.springframework.test.web.reactive.server.HttpStatus ) ; org.springframework.test.web.reactive.server.MockClientHttpResponse . getHeaders ( ) . putAll ( org.springframework.test.web.reactive.server.MockServerHttpResponse . getHeaders ( ) ) ; org.springframework.test.web.reactive.server.MockClientHttpResponse . getCookies ( ) . putAll ( org.springframework.test.web.reactive.server.MockServerHttpResponse . getCookies ( ) ) ; org.springframework.test.web.reactive.server.MockClientHttpResponse . setBody ( org.springframework.test.web.reactive.server.Flux<org.springframework.test.web.reactive.server.DataBuffer> ) ; return org.springframework.test.web.reactive.server.MockClientHttpResponse ; }  <METHOD_END>
