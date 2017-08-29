<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.http.codec.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.http.codec.HttpMessageReader<?>> = this . org.springframework.http.codec.ServerCodecConfigurer . getReaders ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.http.codec.HttpMessageReader<?>> . size ( ) ) ; assertEquals ( ByteArrayDecoder .class , org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) . getClass ( ) ) ; assertEquals ( ByteBufferDecoder .class , org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) . getClass ( ) ) ; assertEquals ( DataBufferDecoder .class , org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) . getClass ( ) ) ; assertEquals ( ResourceDecoder .class , org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) . getClass ( ) ) ; void ( org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) , true ) ; assertEquals ( FormHttpMessageReader .class , java.util.List<org.springframework.http.codec.HttpMessageReader<?>> . get ( this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) . getClass ( ) ) ; assertEquals ( Jaxb2XmlDecoder .class , org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) . getClass ( ) ) ; assertEquals ( Jackson2JsonDecoder .class , org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) . getClass ( ) ) ; void ( org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> = this . org.springframework.http.codec.ServerCodecConfigurer . getWriters ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> . size ( ) ) ; assertEquals ( ByteArrayEncoder .class , org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) . getClass ( ) ) ; assertEquals ( ByteBufferEncoder .class , org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) . getClass ( ) ) ; assertEquals ( DataBufferEncoder .class , org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) . getClass ( ) ) ; assertEquals ( ResourceHttpMessageWriter .class , java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> . get ( java.util.concurrent.atomic.AtomicInteger . int ( ) ) . getClass ( ) ) ; void ( org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) , true ) ; assertEquals ( Jaxb2XmlEncoder .class , org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) . getClass ( ) ) ; assertEquals ( Jackson2JsonEncoder .class , org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) . getClass ( ) ) ; void ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) ; void ( org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Jackson2JsonEncoder org.springframework.http.codec.Jackson2JsonEncoder = new Jackson2JsonEncoder ( ) ; this . org.springframework.http.codec.ServerCodecConfigurer . defaultCodec ( ) . jackson2Encoder ( org.springframework.http.codec.Jackson2JsonEncoder ) ; assertSame ( org.springframework.http.codec.Jackson2JsonEncoder , this . org.springframework.http.codec.ServerCodecConfigurer . getWriters ( ) . stream ( ) . filter ( writer -> ServerSentEventHttpMessageWriter .class . equals ( writer . getClass ( ) ) ) . map ( writer -> ( ServerSentEventHttpMessageWriter ) writer ) . findFirst ( ) . map ( ServerSentEventHttpMessageWriter :: getEncoder ) . filter ( e -> e == encoder ) . orElse ( null ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.codec.Decoder<?> < ? > org.springframework.http.codec.Decoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) { HttpMessageReader < ? > org.springframework.http.codec.HttpMessageReader<?> = java.util.List<org.springframework.http.codec.HttpMessageReader<?>> . get ( this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( DecoderHttpMessageReader .class , org.springframework.http.codec.HttpMessageReader<> . getClass ( ) ) ; return ( ( DecoderHttpMessageReader ) org.springframework.http.codec.HttpMessageReader<> ) . getDecoder ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.codec.Encoder<?> < ? > org.springframework.http.codec.Encoder<?> ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) { HttpMessageWriter < ? > org.springframework.http.codec.HttpMessageWriter<?> = java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> . get ( this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( EncoderHttpMessageWriter .class , org.springframework.http.codec.HttpMessageWriter<> . getClass ( ) ) ; return ( ( EncoderHttpMessageWriter ) org.springframework.http.codec.HttpMessageWriter<> ) . getEncoder ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( Decoder < ? > org.springframework.http.codec.Decoder<?> , boolean boolean ) { assertEquals ( StringDecoder .class , org.springframework.http.codec.Decoder<> . getClass ( ) ) ; assertTrue ( org.springframework.http.codec.Decoder<> . canDecode ( forClass ( java.lang.String .class ) , MimeTypeUtils . TEXT_PLAIN ) ) ; assertEquals ( ! boolean , org.springframework.http.codec.Decoder<> . canDecode ( forClass ( java.lang.String .class ) , MediaType . TEXT_EVENT_STREAM ) ) ; Flux < java.lang.String > org.springframework.http.codec.Flux<java.lang.String> = ( Flux < java.lang.String > ) org.springframework.http.codec.Decoder<> . decode ( Flux . just ( new DefaultDataBufferFactory ( ) . wrap ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) , ResolvableType . forClass ( java.lang.String .class ) , MimeTypeUtils . TEXT_PLAIN , java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , org.springframework.http.codec.Flux<java.lang.String> . collectList ( ) . block ( java.time.Duration . java.time.Duration ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( Encoder < ? > org.springframework.http.codec.Encoder<?> , boolean boolean ) { assertEquals ( CharSequenceEncoder .class , org.springframework.http.codec.Encoder<> . getClass ( ) ) ; assertTrue ( org.springframework.http.codec.Encoder<> . canEncode ( forClass ( java.lang.String .class ) , MimeTypeUtils . TEXT_PLAIN ) ) ; assertEquals ( ! boolean , org.springframework.http.codec.Encoder<> . canEncode ( forClass ( java.lang.String .class ) , MediaType . TEXT_EVENT_STREAM ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) { HttpMessageWriter < ? > org.springframework.http.codec.HttpMessageWriter<?> = java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> . get ( this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( ServerSentEventHttpMessageWriter .class , org.springframework.http.codec.HttpMessageWriter<> . getClass ( ) ) ; Encoder < ? > org.springframework.http.codec.Encoder<?> = ( ( ServerSentEventHttpMessageWriter ) org.springframework.http.codec.HttpMessageWriter<> ) . getEncoder ( ) ; assertNotNull ( org.springframework.http.codec.Encoder<> ) ; assertEquals ( Jackson2JsonEncoder .class , org.springframework.http.codec.Encoder<> . getClass ( ) ) ; }  <METHOD_END>
