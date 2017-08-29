<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerResponse org.springframework.web.reactive.function.server.ServerResponse = ServerResponse . ok ( ) . header ( STRING , STRING ) . build ( ) . block ( ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . from ( org.springframework.web.reactive.function.server.ServerResponse ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . OK . equals ( response . statusCode ( ) ) && STRING . equals ( response . headers ( ) . getFirst ( STRING ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . status ( HttpStatus . CREATED ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . CREATED . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . OK . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = java.net.URI . java.net.URI ( STRING ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . created ( java.net.URI ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . CREATED . equals ( response . statusCode ( ) ) && location . equals ( response . headers ( ) . getLocation ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . accepted ( ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . ACCEPTED . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . noContent ( ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . NO_CONTENT . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = java.net.URI . java.net.URI ( STRING ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . seeOther ( java.net.URI ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . SEE_OTHER . equals ( response . statusCode ( ) ) && location . equals ( response . headers ( ) . getLocation ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = java.net.URI . java.net.URI ( STRING ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . temporaryRedirect ( java.net.URI ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . TEMPORARY_REDIRECT . equals ( response . statusCode ( ) ) && location . equals ( response . headers ( ) . getLocation ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = java.net.URI . java.net.URI ( STRING ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . permanentRedirect ( java.net.URI ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . PERMANENT_REDIRECT . equals ( response . statusCode ( ) ) && location . equals ( response . headers ( ) . getLocation ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . badRequest ( ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . BAD_REQUEST . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . notFound ( ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . NOT_FOUND . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . unprocessableEntity ( ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> HttpStatus . UNPROCESSABLE_ENTITY . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . allow ( HttpMethod . GET ) . build ( ) ; java.util.Set<org.springframework.web.reactive.function.server.HttpMethod> < HttpMethod > java.util.Set<org.springframework.web.reactive.function.server.HttpMethod> = java.util.EnumSet . java.util.EnumSet ( HttpMethod . GET ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> expected . equals ( response . headers ( ) . getAllow ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . contentLength ( NUMBER ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> Long . valueOf ( NUMBER ) . equals ( response . headers ( ) . getContentLength ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . contentType ( MediaType . APPLICATION_JSON ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> MediaType . APPLICATION_JSON . equals ( response . headers ( ) . getContentType ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . eTag ( STRING ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> STRING . equals ( response . headers ( ) . getETag ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.time.ZonedDateTime java.time.ZonedDateTime = java.time.ZonedDateTime . java.time.ZonedDateTime ( ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . lastModified ( java.time.ZonedDateTime ) . build ( ) ; java.lang.Long java.lang.Long = java.time.ZonedDateTime . java.time.Instant ( ) . long ( ) / NUMBER ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> expected . equals ( response . headers ( ) . getLastModified ( ) / NUMBER ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . cacheControl ( CacheControl . noCache ( ) ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> STRING . equals ( response . headers ( ) . getCacheControl ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . varyBy ( STRING ) . build ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Collections . java.util.List<java.lang.String> ( STRING ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> expected . equals ( response . headers ( ) . getVary ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpStatus org.springframework.web.reactive.function.server.HttpStatus = HttpStatus . ACCEPTED ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . status ( org.springframework.web.reactive.function.server.HttpStatus ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> statusCode . equals ( response . statusCode ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders org.springframework.web.reactive.function.server.HttpHeaders = new HttpHeaders ( ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . headers ( org.springframework.web.reactive.function.server.HttpHeaders ) . build ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> ) . expectNextMatches ( response -> headers . equals ( response . headers ( ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . status ( HttpStatus . CREATED ) . header ( STRING , STRING ) . build ( ) ; ServerWebExchange org.springframework.web.reactive.function.server.ServerWebExchange = mock ( ServerWebExchange .class ) ; MockServerHttpResponse org.springframework.web.reactive.function.server.MockServerHttpResponse = new MockServerHttpResponse ( ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getResponse ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.MockServerHttpResponse ) ; HandlerStrategies org.springframework.web.reactive.function.server.HandlerStrategies = mock ( HandlerStrategies .class ) ; org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> . then ( res -> res . writeTo ( exchange , strategies ) ) . block ( ) ; assertEquals ( HttpStatus . CREATED , org.springframework.web.reactive.function.server.MockServerHttpResponse . getStatusCode ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.function.server.MockServerHttpResponse . getHeaders ( ) . getFirst ( STRING ) ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.MockServerHttpResponse . getBody ( ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Mono < java.lang.Void > org.springframework.web.reactive.function.server.Mono<java.lang.Void> = Mono . empty ( ) ; Mono < ServerResponse > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> = ServerResponse . ok ( ) . build ( org.springframework.web.reactive.function.server.Mono<java.lang.Void> ) ; ServerWebExchange org.springframework.web.reactive.function.server.ServerWebExchange = mock ( ServerWebExchange .class ) ; MockServerHttpResponse org.springframework.web.reactive.function.server.MockServerHttpResponse = new MockServerHttpResponse ( ) ; when ( org.springframework.web.reactive.function.server.ServerWebExchange . getResponse ( ) ) . thenReturn ( org.springframework.web.reactive.function.server.MockServerHttpResponse ) ; HandlerStrategies org.springframework.web.reactive.function.server.HandlerStrategies = mock ( HandlerStrategies .class ) ; org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerResponse> . then ( res -> res . writeTo ( exchange , strategies ) ) . block ( ) ; StepVerifier . create ( org.springframework.web.reactive.function.server.MockServerHttpResponse . getBody ( ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>