<METHOD_START> public void ( MimeType ... org.springframework.core.codec.MimeType[] ) { super( org.springframework.core.codec.MimeType[] ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> < DataBuffer > org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> ( Publisher < ? extends T > org.springframework.core.codec.Publisher<? extends T> , DataBufferFactory org.springframework.core.codec.DataBufferFactory , ResolvableType org.springframework.core.codec.ResolvableType , MimeType org.springframework.core.codec.MimeType , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return Flux . from ( org.springframework.core.codec.Publisher<> ) . take ( NUMBER ) . concatMap ( t -> encode ( t , bufferFactory , elementType , mimeType , hints ) ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> < DataBuffer > org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> ( T T , DataBufferFactory org.springframework.core.codec.DataBufferFactory , ResolvableType org.springframework.core.codec.ResolvableType , MimeType org.springframework.core.codec.MimeType , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> );  <METHOD_END>
