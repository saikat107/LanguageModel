<METHOD_START> public void ( ) { this( int ); }  <METHOD_END>
<METHOD_START> public void ( int int ) { super( MimeTypeUtils . APPLICATION_OCTET_STREAM , MimeTypeUtils . ALL ); Assert . isTrue ( int > NUMBER , STRING ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.core.codec.ResolvableType , MimeType org.springframework.core.codec.MimeType ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.core.codec.ResolvableType . getRawClass ( ) ; return ( super. canEncode ( org.springframework.core.codec.ResolvableType , org.springframework.core.codec.MimeType ) && Resource .class . boolean ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> < DataBuffer > org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> ( Resource org.springframework.core.codec.Resource , DataBufferFactory org.springframework.core.codec.DataBufferFactory , ResolvableType org.springframework.core.codec.ResolvableType , MimeType org.springframework.core.codec.MimeType , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { try { if ( org.springframework.core.codec.Resource . isFile ( ) ) { java.io.File java.io.File = org.springframework.core.codec.Resource . getFile ( ) ; java.nio.channels.AsynchronousFileChannel java.nio.channels.AsynchronousFileChannel = java.nio.channels.AsynchronousFileChannel . java.nio.channels.AsynchronousFileChannel ( java.io.File . java.nio.file.Path ( ) , java.nio.file.StandardOpenOption . java.nio.file.StandardOpenOption ) ; return DataBufferUtils . read ( java.nio.channels.AsynchronousFileChannel , org.springframework.core.codec.DataBufferFactory , this . int ) ; } } catch ( java.io.IOException java.io.IOException ) { } try { java.nio.channels.ReadableByteChannel java.nio.channels.ReadableByteChannel = org.springframework.core.codec.Resource . readableChannel ( ) ; return DataBufferUtils . read ( java.nio.channels.ReadableByteChannel , org.springframework.core.codec.DataBufferFactory , this . int ) ; } catch ( java.io.IOException java.io.IOException ) { return Flux . error ( java.io.IOException ) ; } }  <METHOD_END>
