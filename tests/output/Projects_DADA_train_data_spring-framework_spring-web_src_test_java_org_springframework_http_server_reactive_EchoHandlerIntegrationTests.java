<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.EchoHandlerIntegrationTests.EchoHandler org.springframework.http.server.reactive.EchoHandlerIntegrationTests.EchoHandler ( ) { return new org.springframework.http.server.reactive.EchoHandlerIntegrationTests.EchoHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RestTemplate org.springframework.http.server.reactive.RestTemplate = new RestTemplate ( ) ; byte [] byte[] = byte[] ( ) ; RequestEntity < byte [] > org.springframework.http.server.reactive.RequestEntity<byte[]> = RequestEntity . post ( new java.net.URI ( STRING + port ) ) . body ( byte[] ) ; ResponseEntity < byte [] > org.springframework.http.server.reactive.ResponseEntity<byte[]> = org.springframework.http.server.reactive.RestTemplate . exchange ( org.springframework.http.server.reactive.RequestEntity<byte[]> , byte [] .class ) ; assertArrayEquals ( byte[] , org.springframework.http.server.reactive.ResponseEntity<byte[]> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> private byte [] byte[] ( ) { byte [] byte[] = new byte [ int ] ; java.util.Random . void ( byte[] ) ; return byte[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.server.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.server.reactive.Mono<java.lang.Void> ( ServerHttpRequest org.springframework.http.server.reactive.ServerHttpRequest , ServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponse ) { return org.springframework.http.server.reactive.ServerHttpResponse . writeWith ( org.springframework.http.server.reactive.ServerHttpRequest . getBody ( ) ) ; }  <METHOD_END>