<METHOD_START> public void ( HttpStatus org.springframework.mock.http.client.reactive.HttpStatus ) { Assert . notNull ( org.springframework.mock.http.client.reactive.HttpStatus , STRING ) ; this . org.springframework.mock.http.client.reactive.HttpStatus = org.springframework.mock.http.client.reactive.HttpStatus ; }  <METHOD_END>
<METHOD_START> public org.springframework.mock.http.client.reactive.HttpStatus org.springframework.mock.http.client.reactive.HttpStatus ( ) { return this . org.springframework.mock.http.client.reactive.HttpStatus ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.mock.http.client.reactive.HttpHeaders org.springframework.mock.http.client.reactive.HttpHeaders ( ) { return this . org.springframework.mock.http.client.reactive.HttpHeaders ; }  <METHOD_END>
<METHOD_START> public org.springframework.mock.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.mock.http.client.reactive.ResponseCookie> < java.lang.String , ResponseCookie > org.springframework.mock.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.mock.http.client.reactive.ResponseCookie> ( ) { return this . org.springframework.mock.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.mock.http.client.reactive.ResponseCookie> ; }  <METHOD_END>
<METHOD_START> public void void ( Publisher < DataBuffer > org.springframework.mock.http.client.reactive.Publisher<org.springframework.mock.http.client.reactive.DataBuffer> ) { this . org.springframework.mock.http.client.reactive.Flux<org.springframework.mock.http.client.reactive.DataBuffer> = Flux . from ( org.springframework.mock.http.client.reactive.Publisher<org.springframework.mock.http.client.reactive.DataBuffer> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { void ( java.lang.String , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.nio.charset.Charset java.nio.charset.Charset ) { DataBuffer org.springframework.mock.http.client.reactive.DataBuffer = org.springframework.mock.http.client.reactive.DataBuffer ( java.lang.String , java.nio.charset.Charset ) ; this . org.springframework.mock.http.client.reactive.Flux<org.springframework.mock.http.client.reactive.DataBuffer> = Flux . just ( org.springframework.mock.http.client.reactive.DataBuffer ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.mock.http.client.reactive.DataBuffer org.springframework.mock.http.client.reactive.DataBuffer ( java.lang.String java.lang.String , java.nio.charset.Charset java.nio.charset.Charset ) { byte [] byte[] = java.lang.String . byte[] ( java.nio.charset.Charset ) ; java.nio.ByteBuffer java.nio.ByteBuffer = java.nio.ByteBuffer . java.nio.ByteBuffer ( byte[] ) ; return this . org.springframework.mock.http.client.reactive.DataBufferFactory . wrap ( java.nio.ByteBuffer ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.mock.http.client.reactive.Flux<org.springframework.mock.http.client.reactive.DataBuffer> < DataBuffer > org.springframework.mock.http.client.reactive.Flux<org.springframework.mock.http.client.reactive.DataBuffer> ( ) { return this . org.springframework.mock.http.client.reactive.Flux<org.springframework.mock.http.client.reactive.DataBuffer> ; }  <METHOD_END>
<METHOD_START> public org.springframework.mock.http.client.reactive.Mono<java.lang.String> < java.lang.String > org.springframework.mock.http.client.reactive.Mono<java.lang.String> ( ) { java.nio.charset.Charset java.nio.charset.Charset = java.nio.charset.Charset ( ) ; return Flux . from ( org.springframework.mock.http.client.reactive.Flux<org.springframework.mock.http.client.reactive.DataBuffer> ( ) ) . reduce ( org.springframework.mock.http.client.reactive.DataBufferFactory . allocateBuffer ( ) , ( previous , current ) -> { previous . write ( current ) ; DataBufferUtils . release ( current ) ; return previous ; } ) . map ( buffer -> dumpString ( buffer , charset ) ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( DataBuffer org.springframework.mock.http.client.reactive.DataBuffer , java.nio.charset.Charset java.nio.charset.Charset ) { Assert . notNull ( java.nio.charset.Charset , STRING ) ; byte [] byte[] = new byte [ org.springframework.mock.http.client.reactive.DataBuffer . readableByteCount ( ) ] ; org.springframework.mock.http.client.reactive.DataBuffer . read ( byte[] ) ; return new java.lang.String ( byte[] , java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> private java.nio.charset.Charset java.nio.charset.Charset ( ) { java.nio.charset.Charset java.nio.charset.Charset = null ; MediaType org.springframework.mock.http.client.reactive.MediaType = org.springframework.mock.http.client.reactive.HttpHeaders ( ) . getContentType ( ) ; if ( org.springframework.mock.http.client.reactive.MediaType != null ) { java.nio.charset.Charset = org.springframework.mock.http.client.reactive.MediaType . getCharset ( ) ; } return ( java.nio.charset.Charset != null ? java.nio.charset.Charset : java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; }  <METHOD_END>