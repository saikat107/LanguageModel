<METHOD_START> public void ( ) { super( MimeTypeUtils . APPLICATION_XML , MimeTypeUtils . TEXT_XML ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.http.codec.xml.ResolvableType , MimeType org.springframework.http.codec.xml.MimeType ) { if ( super. canEncode ( org.springframework.http.codec.xml.ResolvableType , org.springframework.http.codec.xml.MimeType ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.http.codec.xml.ResolvableType . getRawClass ( ) ; return ( java.lang.Class<> . boolean ( javax.xml.bind.annotation.XmlRootElement .class ) || java.lang.Class<> . boolean ( javax.xml.bind.annotation.XmlType .class ) ) ; } else { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.http.codec.xml.Flux<org.springframework.http.codec.xml.DataBuffer> < DataBuffer > org.springframework.http.codec.xml.Flux<org.springframework.http.codec.xml.DataBuffer> ( java.lang.Object java.lang.Object , DataBufferFactory org.springframework.http.codec.xml.DataBufferFactory , ResolvableType org.springframework.http.codec.xml.ResolvableType , MimeType org.springframework.http.codec.xml.MimeType , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { try { DataBuffer org.springframework.http.codec.xml.DataBuffer = org.springframework.http.codec.xml.DataBufferFactory . allocateBuffer ( NUMBER ) ; java.io.OutputStream java.io.OutputStream = org.springframework.http.codec.xml.DataBuffer . asOutputStream ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . getUserClass ( java.lang.Object ) ; javax.xml.bind.Marshaller javax.xml.bind.Marshaller = org.springframework.http.codec.xml.JaxbContextContainer . createMarshaller ( java.lang.Class<> ) ; javax.xml.bind.Marshaller . void ( javax.xml.bind.Marshaller . java.lang.String , java.nio.charset.StandardCharsets . java.nio.charset.Charset . java.lang.String ( ) ) ; javax.xml.bind.Marshaller . void ( java.lang.Object , java.io.OutputStream ) ; return Flux . just ( org.springframework.http.codec.xml.DataBuffer ) ; } catch ( javax.xml.bind.JAXBException javax.xml.bind.JAXBException ) { return Flux . error ( javax.xml.bind.JAXBException ) ; } }  <METHOD_END>