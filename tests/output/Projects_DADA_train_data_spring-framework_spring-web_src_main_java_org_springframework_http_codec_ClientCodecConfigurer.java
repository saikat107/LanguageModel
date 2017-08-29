<METHOD_START> public void ( ) { super( new org.springframework.http.codec.ClientCodecConfigurer.ClientDefaultCodecConfigurer ( ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.codec.ClientCodecConfigurer.ClientDefaultCodecConfigurer org.springframework.http.codec.ClientCodecConfigurer.ClientDefaultCodecConfigurer ( ) { return ( org.springframework.http.codec.ClientCodecConfigurer.ClientDefaultCodecConfigurer ) super. defaultCodec ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) { super. addDefaultTypedWriter ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> ) ; org.springframework.http.codec.ClientCodecConfigurer.ClientDefaultCodecConfigurer ( ) . addWriterTo ( java.util.List<org.springframework.http.codec.HttpMessageWriter<?>> , FormHttpMessageWriter ::new ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) { super. addDefaultObjectReaders ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) ; org.springframework.http.codec.ClientCodecConfigurer.ClientDefaultCodecConfigurer ( ) . void ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) ; }  <METHOD_END>
<METHOD_START> public void void ( Decoder < ? > org.springframework.http.codec.Decoder<?> ) { HttpMessageReader < ? > org.springframework.http.codec.HttpMessageReader<?> = new ServerSentEventHttpMessageReader ( org.springframework.http.codec.Decoder<> ) ; getReaders ( ) . put ( ServerSentEventHttpMessageReader .class , org.springframework.http.codec.HttpMessageReader<> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) { addReaderTo ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> , ( ) new DecoderHttpMessageReader <> ( StringDecoder . textPlainOnly ( false ) ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) { addReaderTo ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> , ( ) new DecoderHttpMessageReader <> ( StringDecoder . allMimeTypes ( false ) ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.http.codec.HttpMessageReader<?>> ) { addReaderTo ( java.util.List<org.springframework.http.codec.HttpMessageReader<?>> , ( ) findReader ( ServerSentEventHttpMessageReader .class , ( ) { Decoder < ? > decoder = null ; if ( jackson2Present ) { decoder = findDecoderReader ( Jackson2JsonDecoder .class , Jackson2JsonDecoder ::new ) . getDecoder ( ) ; } return new ServerSentEventHttpMessageReader ( decoder ) ; } ) ) ; }  <METHOD_END>
