<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; assertEquals ( STRING , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . encodeUrl ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . registerUrlEncoder ( s -> s + STRING ) ; assertEquals ( STRING , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . encodeUrl ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . registerUrlEncoder ( s -> s + STRING ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . registerUrlEncoder ( s -> s + STRING ) ; assertEquals ( STRING , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . encodeUrl ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . writeWith ( Flux . just ( org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) , org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) , org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) ) ) . block ( ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertEquals ( NUMBER , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . size ( ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; Flux < Flux < DefaultDataBuffer > > org.springframework.http.server.reactive.Flux<org.springframework.http.server.reactive.Flux<org.springframework.http.server.reactive.DefaultDataBuffer>> = Flux . just ( Flux . just ( org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) ) ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . writeAndFlushWith ( org.springframework.http.server.reactive.Flux<org.springframework.http.server.reactive.Flux<org.springframework.http.server.reactive.DefaultDataBuffer>> ) . block ( ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertEquals ( NUMBER , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . size ( ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; java.lang.IllegalStateException java.lang.IllegalStateException = new java.lang.IllegalStateException ( STRING ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . writeWith ( Flux . error ( java.lang.IllegalStateException ) ) . otherwise ( ex -> Mono . empty ( ) ) . block ( ) ; assertFalse ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertFalse ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertFalse ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . isEmpty ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . setComplete ( ) . block ( ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . isEmpty ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseCookie org.springframework.http.server.reactive.ResponseCookie = ResponseCookie . from ( STRING , STRING ) . build ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . beforeCommit ( ( ) { response . getCookies ( ) . add ( cookie . getName ( ) , cookie ) ; return Mono . empty ( ) ; } ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . writeWith ( Flux . just ( org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) , org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) , org.springframework.http.server.reactive.DefaultDataBuffer ( STRING ) ) ) . block ( ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertSame ( org.springframework.http.server.reactive.ResponseCookie , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . getCookies ( ) . getFirst ( STRING ) ) ; assertEquals ( NUMBER , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . size ( ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING , new java.lang.String ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . get ( NUMBER ) . asByteBuffer ( ) . array ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseCookie org.springframework.http.server.reactive.ResponseCookie = ResponseCookie . from ( STRING , STRING ) . build ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse = new org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse ( ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . beforeCommit ( ( ) { response . getCookies ( ) . add ( cookie . getName ( ) , cookie ) ; return Mono . empty ( ) ; } ) ; org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . setComplete ( ) . block ( ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . boolean ) ; assertTrue ( org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . java.util.List<org.springframework.http.server.reactive.DataBuffer> . isEmpty ( ) ) ; assertSame ( org.springframework.http.server.reactive.ResponseCookie , org.springframework.http.server.reactive.ServerHttpResponseTests.TestServerHttpResponse . getCookies ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.server.reactive.DefaultDataBuffer org.springframework.http.server.reactive.DefaultDataBuffer ( java.lang.String java.lang.String ) { return new DefaultDataBufferFactory ( ) . wrap ( java.nio.ByteBuffer . java.nio.ByteBuffer ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { super( new DefaultDataBufferFactory ( ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { assertFalse ( this . boolean ) ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { assertFalse ( this . boolean ) ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { assertFalse ( this . boolean ) ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.server.reactive.Mono<java.lang.Void> ( Publisher < ? extends DataBuffer > org.springframework.http.server.reactive.Publisher<? extends org.springframework.http.server.reactive.DataBuffer> ) { return Flux . from ( org.springframework.http.server.reactive.Publisher<> ) . map ( b -> { this . body . add ( b ) ; return b ; } ) . then ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.server.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.server.reactive.Mono<java.lang.Void> ( Publisher < ? extends Publisher < ? extends DataBuffer > > org.springframework.http.server.reactive.Publisher<? extends org.springframework.http.server.reactive.Publisher<? extends org.springframework.http.server.reactive.DataBuffer>> ) { return Flux . from ( org.springframework.http.server.reactive.Publisher<> ) . flatMap ( body -> Flux . from ( body ) . map ( b -> { this . body . add ( b ) ; return b ; } ) ) . then ( ) ; }  <METHOD_END>