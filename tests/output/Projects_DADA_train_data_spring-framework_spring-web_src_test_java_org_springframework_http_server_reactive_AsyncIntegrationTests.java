<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.AsyncIntegrationTests.AsyncHandler org.springframework.http.server.reactive.AsyncIntegrationTests.AsyncHandler ( ) { return new org.springframework.http.server.reactive.AsyncIntegrationTests.AsyncHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URI java.net.URI = new java.net.URI ( STRING + port ) ; ResponseEntity < java.lang.String > org.springframework.http.server.reactive.ResponseEntity<java.lang.String> = new RestTemplate ( ) . exchange ( RequestEntity . get ( java.net.URI ) . build ( ) , java.lang.String .class ) ; assertThat ( org.springframework.http.server.reactive.ResponseEntity<java.lang.String> . getBody ( ) , Matchers . equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.server.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.server.reactive.Mono<java.lang.Void> ( ServerHttpRequest org.springframework.http.server.reactive.ServerHttpRequest , ServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponse ) { return org.springframework.http.server.reactive.ServerHttpResponse . writeWith ( Flux . just ( STRING , STRING , STRING , STRING , STRING ) . delayElements ( java.time.Duration . java.time.Duration ( NUMBER ) ) . publishOn ( org.springframework.http.server.reactive.Scheduler ) . collect ( org.springframework.http.server.reactive.DataBufferFactory :: allocateBuffer , ( buffer , str ) -> buffer . write ( str . getBytes ( ) ) ) ) ; }  <METHOD_END>
