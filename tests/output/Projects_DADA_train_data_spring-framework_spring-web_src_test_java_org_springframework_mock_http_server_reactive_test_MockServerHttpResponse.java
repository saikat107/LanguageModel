<METHOD_START> public void ( ) { super( new DefaultDataBufferFactory ( ) ); }  <METHOD_END>
<METHOD_START> private java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> < Flux < DataBuffer > , Mono < java.lang.Void > > java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> ( ) { return org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> -> { this . org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> = org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> . cache ( ) ; return this . org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> . then ( ) ; } ; }  <METHOD_END>
<METHOD_START> public org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> < DataBuffer > org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> ( ) { return this . org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> ; }  <METHOD_END>
<METHOD_START> public org.springframework.mock.http.server.reactive.test.Mono<java.lang.String> < java.lang.String > org.springframework.mock.http.server.reactive.test.Mono<java.lang.String> ( ) { java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset ( ) ; return org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer> ( ) . reduce ( bufferFactory ( ) . allocateBuffer ( ) , ( previous , current ) -> { previous . write ( current ) ; DataBufferUtils . release ( current ) ; return previous ; } ) . map ( buffer -> bufferToString ( buffer , charset ) ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( DataBuffer org.springframework.mock.http.server.reactive.test.DataBuffer , java.nio.charset.Charset java.nio.charset.Charset ) { Assert . notNull ( java.nio.charset.Charset , STRING ) ; byte [] byte[] = new byte [ org.springframework.mock.http.server.reactive.test.DataBuffer . readableByteCount ( ) ] ; org.springframework.mock.http.server.reactive.test.DataBuffer . read ( byte[] ) ; return new java.lang.String ( byte[] , java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> private java.nio.charset.Charset java.nio.charset.Charset ( ) { java.nio.charset.Charset java.nio.charset.Charset = null ; MediaType org.springframework.mock.http.server.reactive.test.MediaType = getHeaders ( ) . getContentType ( ) ; if ( org.springframework.mock.http.server.reactive.test.MediaType != null ) { java.nio.charset.Charset = org.springframework.mock.http.server.reactive.test.MediaType . getCharset ( ) ; } return ( java.nio.charset.Charset != null ? java.nio.charset.Charset : java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> < Flux < DataBuffer > , Mono < java.lang.Void > > java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> ) { Assert . notNull ( java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> , STRING ) ; this . java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> = java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void> < java.lang.Void > org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void> ( Publisher < ? extends DataBuffer > org.springframework.mock.http.server.reactive.test.Publisher<? extends org.springframework.mock.http.server.reactive.test.DataBuffer> ) { return this . java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> . apply ( Flux . from ( org.springframework.mock.http.server.reactive.test.Publisher<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void> < java.lang.Void > org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void> ( Publisher < ? extends Publisher < ? extends DataBuffer > > org.springframework.mock.http.server.reactive.test.Publisher<? extends org.springframework.mock.http.server.reactive.test.Publisher<? extends org.springframework.mock.http.server.reactive.test.DataBuffer>> ) { return this . java.util.function.Function<org.springframework.mock.http.server.reactive.test.Flux<org.springframework.mock.http.server.reactive.test.DataBuffer>,org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void>> . apply ( Flux . from ( org.springframework.mock.http.server.reactive.test.Publisher<> ) . concatMap ( Flux :: from ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void> < java.lang.Void > org.springframework.mock.http.server.reactive.test.Mono<java.lang.Void> ( ) { return doCommit ( ( ) Mono . defer ( ( ) this . writeHandler . apply ( Flux . empty ( ) ) ) ) ; }  <METHOD_END>
