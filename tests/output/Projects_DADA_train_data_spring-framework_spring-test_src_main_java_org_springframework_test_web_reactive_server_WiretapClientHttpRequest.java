<METHOD_START> public void ( ClientHttpRequest org.springframework.test.web.reactive.server.ClientHttpRequest ) { super( org.springframework.test.web.reactive.server.ClientHttpRequest ); this . org.springframework.test.web.reactive.server.DataBuffer = org.springframework.test.web.reactive.server.DataBufferFactory . allocateBuffer ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.reactive.server.MonoProcessor<byte[]> < byte [] > org.springframework.test.web.reactive.server.MonoProcessor<byte[]> ( ) { return this . org.springframework.test.web.reactive.server.MonoProcessor<byte[]> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.reactive.server.Mono<java.lang.Void> < java.lang.Void > org.springframework.test.web.reactive.server.Mono<java.lang.Void> ( Publisher < ? extends DataBuffer > org.springframework.test.web.reactive.server.Publisher<? extends org.springframework.test.web.reactive.server.DataBuffer> ) { return super. writeWith ( Flux . from ( org.springframework.test.web.reactive.server.Publisher<> ) . doOnNext ( this :: void ) . doOnError ( this :: void ) . doOnCancel ( this :: void ) . doOnComplete ( this :: void ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.reactive.server.Mono<java.lang.Void> < java.lang.Void > org.springframework.test.web.reactive.server.Mono<java.lang.Void> ( Publisher < ? extends Publisher < ? extends DataBuffer > > org.springframework.test.web.reactive.server.Publisher<? extends org.springframework.test.web.reactive.server.Publisher<? extends org.springframework.test.web.reactive.server.DataBuffer>> ) { return super. writeAndFlushWith ( Flux . from ( org.springframework.test.web.reactive.server.Publisher<> ) . map ( p -> Flux . from ( p ) . doOnNext ( this :: handleOnNext ) . doOnError ( this :: handleError ) ) . doOnError ( this :: void ) . doOnCancel ( this :: void ) . doOnComplete ( this :: void ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.reactive.server.Mono<java.lang.Void> < java.lang.Void > org.springframework.test.web.reactive.server.Mono<java.lang.Void> ( ) { void ( ) ; return super. setComplete ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( DataBuffer org.springframework.test.web.reactive.server.DataBuffer ) { this . org.springframework.test.web.reactive.server.DataBuffer . write ( org.springframework.test.web.reactive.server.DataBuffer ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Throwable java.lang.Throwable ) { if ( ! this . org.springframework.test.web.reactive.server.MonoProcessor<byte[]> . isTerminated ( ) ) { this . org.springframework.test.web.reactive.server.MonoProcessor<byte[]> . onError ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( ! this . org.springframework.test.web.reactive.server.MonoProcessor<byte[]> . isTerminated ( ) ) { byte [] byte[] = new byte [ this . org.springframework.test.web.reactive.server.DataBuffer . readableByteCount ( ) ] ; this . org.springframework.test.web.reactive.server.DataBuffer . read ( byte[] ) ; this . org.springframework.test.web.reactive.server.MonoProcessor<byte[]> . onNext ( byte[] ) ; } }  <METHOD_END>
