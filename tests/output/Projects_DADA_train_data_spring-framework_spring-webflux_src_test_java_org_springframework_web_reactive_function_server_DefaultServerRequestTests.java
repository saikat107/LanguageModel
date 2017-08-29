<METHOD_START> @ Before public void void ( ) { org.springframework.web.reactive.function.server.ServerHttpRequest = mock ( ServerHttpRequest .class ) ; org.springframework.web.reactive.function.server.ServerHttpResponse = mock ( ServerHttpResponse .class ) ; org.springframework.web.reactive.function.server.ServerWebExchange = mock ( ServerWebExchange .class ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getRequest ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.ServerHttpRequest ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getResponse ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.ServerHttpResponse ) ; org.springframework.web.reactive.function.server.HandlerStrategies = mock ( HandlerStrategies .class ) ; org.springframework.web.reactive.function.server.DefaultServerRequest = new DefaultServerRequest ( org.springframework.web.reactive.function.server.ServerWebExchange , org.springframework.web.reactive.function.server.HandlerStrategies ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpMethod org.springframework.web.reactive.function.server.HttpMethod = HttpMethod . HEAD ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getMethod ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.HttpMethod ) ; assertEquals ( org.springframework.web.reactive.function.server.HttpMethod , org.springframework.web.reactive.function.server.DefaultServerRequest . method ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = java.net.URI . java.net.URI ( STRING ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getURI ( ) ) . thenReturn ( java.net.URI ) ; assertEquals ( java.net.URI , org.springframework.web.reactive.function.server.DefaultServerRequest . uri ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { when ( org.springframework.web.reactive.function.server.ServerWebExchange . getAttribute ( STRING ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) ) ; assertEquals ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) , org.springframework.web.reactive.function.server.DefaultServerRequest . attribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.reactive.function.server.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.web.reactive.function.server.MultiValueMap<java.lang.String,java.lang.String> . set ( STRING , STRING ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getQueryParams ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.MultiValueMap<java.lang.String,java.lang.String> ) ; assertEquals ( java.util.Optional . java.util.Optional<java.lang.String> ( STRING ) , org.springframework.web.reactive.function.server.DefaultServerRequest . queryParam ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getAttribute ( RouterFunctions . URI_TEMPLATE_VARIABLES_ATTRIBUTE ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.util.Map<java.lang.String,java.lang.String>> ( java.util.Map<java.lang.String,java.lang.String> ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.server.DefaultServerRequest . pathVariable ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getAttribute ( RouterFunctions . URI_TEMPLATE_VARIABLES_ATTRIBUTE ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.util.Map<java.lang.String,java.lang.String>> ( java.util.Map<java.lang.String,java.lang.String> ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.server.DefaultServerRequest . pathVariable ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getAttribute ( RouterFunctions . URI_TEMPLATE_VARIABLES_ATTRIBUTE ) ) . thenReturn ( java.util.Optional . java.util.Optional<java.util.Map<java.lang.String,java.lang.String>> ( java.util.Map<java.lang.String,java.lang.String> ) ) ; assertEquals ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.web.reactive.function.server.DefaultServerRequest . pathVariables ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebSession org.springframework.web.reactive.function.server.WebSession = mock ( WebSession .class ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getSession ( ) ) . thenReturn ( Mono . just ( org.springframework.web.reactive.function.server.WebSession ) ) ; assertEquals ( org.springframework.web.reactive.function.server.WebSession , org.springframework.web.reactive.function.server.DefaultServerRequest . session ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders org.springframework.web.reactive.function.server.HttpHeaders = new HttpHeaders ( ) ; java.util.List<org.springframework.web.reactive.function.server.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.function.server.MediaType> = java.util.Collections . java.util.List ( MediaType . APPLICATION_JSON ) ; org.springframework.web.reactive.function.server.HttpHeaders . setAccept ( java.util.List<org.springframework.web.reactive.function.server.MediaType> ) ; java.util.List<java.nio.charset.Charset> < java.nio.charset.Charset > java.util.List<java.nio.charset.Charset> = java.util.Collections . java.util.List<java.nio.charset.Charset> ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; org.springframework.web.reactive.function.server.HttpHeaders . setAcceptCharset ( java.util.List<java.nio.charset.Charset> ) ; long long = NUMBER ; org.springframework.web.reactive.function.server.HttpHeaders . setContentLength ( long ) ; MediaType org.springframework.web.reactive.function.server.MediaType = MediaType . TEXT_PLAIN ; org.springframework.web.reactive.function.server.HttpHeaders . setContentType ( org.springframework.web.reactive.function.server.MediaType ) ; java.net.InetSocketAddress java.net.InetSocketAddress = java.net.InetSocketAddress . java.net.InetSocketAddress ( STRING , NUMBER ) ; org.springframework.web.reactive.function.server.HttpHeaders . setHost ( java.net.InetSocketAddress ) ; java.util.List<org.springframework.web.reactive.function.server.HttpRange> < HttpRange > java.util.List<org.springframework.web.reactive.function.server.HttpRange> = java.util.Collections . java.util.List ( HttpRange . createByteRange ( NUMBER , NUMBER ) ) ; org.springframework.web.reactive.function.server.HttpHeaders . setRange ( java.util.List<org.springframework.web.reactive.function.server.HttpRange> ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getHeaders ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.HttpHeaders ) ; ServerRequest . ServerRequest ServerRequest.Headers = org.springframework.web.reactive.function.server.DefaultServerRequest . headers ( ) ; assertEquals ( java.util.List<org.springframework.web.reactive.function.server.MediaType> , ServerRequest.Headers . accept ( ) ) ; assertEquals ( java.util.List<java.nio.charset.Charset> , ServerRequest.Headers . acceptCharset ( ) ) ; assertEquals ( java.util.OptionalLong . java.util.OptionalLong ( long ) , ServerRequest.Headers . contentLength ( ) ) ; assertEquals ( java.util.Optional . java.util.Optional ( org.springframework.web.reactive.function.server.MediaType ) , ServerRequest.Headers . contentType ( ) ) ; assertEquals ( org.springframework.web.reactive.function.server.HttpHeaders , ServerRequest.Headers . asHttpHeaders ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultDataBufferFactory org.springframework.web.reactive.function.server.DefaultDataBufferFactory = new DefaultDataBufferFactory ( ) ; DefaultDataBuffer org.springframework.web.reactive.function.server.DefaultDataBuffer = org.springframework.web.reactive.function.server.DefaultDataBufferFactory . wrap ( java.nio.ByteBuffer . java.nio.ByteBuffer ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; Flux < DataBuffer > org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> = Flux . just ( org.springframework.web.reactive.function.server.DefaultDataBuffer ) ; HttpHeaders org.springframework.web.reactive.function.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.reactive.function.server.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getHeaders ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.HttpHeaders ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getBody ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> ) ; java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> = java.util.Collections . java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> ( new DecoderHttpMessageReader <> ( StringDecoder . allMimeTypes ( true ) ) ) ; when ( org.springframework.web.reactive.function.server.HandlerStrategies . messageReaders ( ) ) . thenReturn ( java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> :: stream ) ; Mono < java.lang.String > org.springframework.web.reactive.function.server.Mono<java.lang.String> = org.springframework.web.reactive.function.server.DefaultServerRequest . body ( toMono ( java.lang.String .class ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.server.Mono<java.lang.String> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultDataBufferFactory org.springframework.web.reactive.function.server.DefaultDataBufferFactory = new DefaultDataBufferFactory ( ) ; DefaultDataBuffer org.springframework.web.reactive.function.server.DefaultDataBuffer = org.springframework.web.reactive.function.server.DefaultDataBufferFactory . wrap ( java.nio.ByteBuffer . java.nio.ByteBuffer ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; Flux < DataBuffer > org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> = Flux . just ( org.springframework.web.reactive.function.server.DefaultDataBuffer ) ; HttpHeaders org.springframework.web.reactive.function.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.reactive.function.server.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getHeaders ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.HttpHeaders ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getBody ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> ) ; java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> = java.util.Collections . java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> ( new DecoderHttpMessageReader <> ( StringDecoder . allMimeTypes ( true ) ) ) ; when ( org.springframework.web.reactive.function.server.HandlerStrategies . messageReaders ( ) ) . thenReturn ( java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> :: stream ) ; Mono < java.lang.String > org.springframework.web.reactive.function.server.Mono<java.lang.String> = org.springframework.web.reactive.function.server.DefaultServerRequest . bodyToMono ( java.lang.String .class ) ; assertEquals ( STRING , org.springframework.web.reactive.function.server.Mono<java.lang.String> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultDataBufferFactory org.springframework.web.reactive.function.server.DefaultDataBufferFactory = new DefaultDataBufferFactory ( ) ; DefaultDataBuffer org.springframework.web.reactive.function.server.DefaultDataBuffer = org.springframework.web.reactive.function.server.DefaultDataBufferFactory . wrap ( java.nio.ByteBuffer . java.nio.ByteBuffer ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; Flux < DataBuffer > org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> = Flux . just ( org.springframework.web.reactive.function.server.DefaultDataBuffer ) ; HttpHeaders org.springframework.web.reactive.function.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.reactive.function.server.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getHeaders ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.HttpHeaders ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getBody ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> ) ; java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> = java.util.Collections . java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> ( new DecoderHttpMessageReader <> ( StringDecoder . allMimeTypes ( true ) ) ) ; when ( org.springframework.web.reactive.function.server.HandlerStrategies . messageReaders ( ) ) . thenReturn ( java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> :: stream ) ; Flux < java.lang.String > org.springframework.web.reactive.function.server.Flux<java.lang.String> = org.springframework.web.reactive.function.server.DefaultServerRequest . bodyToFlux ( java.lang.String .class ) ; Mono < java.util.List<java.lang.String> < java.lang.String > > org.springframework.web.reactive.function.server.Mono<java.util.List<java.lang.String>> = org.springframework.web.reactive.function.server.Flux<java.lang.String> . collectList ( ) ; assertEquals ( java.util.Collections . java.util.List<java.lang.String> ( STRING ) , org.springframework.web.reactive.function.server.Mono<java.util.List<java.lang.String>> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultDataBufferFactory org.springframework.web.reactive.function.server.DefaultDataBufferFactory = new DefaultDataBufferFactory ( ) ; DefaultDataBuffer org.springframework.web.reactive.function.server.DefaultDataBuffer = org.springframework.web.reactive.function.server.DefaultDataBufferFactory . wrap ( java.nio.ByteBuffer . java.nio.ByteBuffer ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; Flux < DataBuffer > org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> = Flux . just ( org.springframework.web.reactive.function.server.DefaultDataBuffer ) ; HttpHeaders org.springframework.web.reactive.function.server.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.reactive.function.server.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getHeaders ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.HttpHeaders ) ; when ( org.springframework.web.reactive.function.server.ServerHttpRequest . getBody ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.Flux<org.springframework.web.reactive.function.server.DataBuffer> ) ; java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> = java.util.Collections . java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> ( ) ; when ( org.springframework.web.reactive.function.server.HandlerStrategies . messageReaders ( ) ) . thenReturn ( java.util.Set<org.springframework.web.reactive.function.server.HttpMessageReader<?>> :: stream ) ; Flux < java.lang.String > org.springframework.web.reactive.function.server.Flux<java.lang.String> = org.springframework.web.reactive.function.server.DefaultServerRequest . bodyToFlux ( java.lang.String .class ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Flux<java.lang.String> ) . expectError ( UnsupportedMediaTypeStatusException .class ) . verify ( ) ; }  <METHOD_END>