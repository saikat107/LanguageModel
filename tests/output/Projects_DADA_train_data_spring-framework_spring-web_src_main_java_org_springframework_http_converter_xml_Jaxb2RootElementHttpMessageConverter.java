<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; if ( boolean ) { void ( true ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , MediaType org.springframework.http.converter.xml.MediaType ) { return ( java.lang.Class<> . boolean ( javax.xml.bind.annotation.XmlRootElement .class ) || java.lang.Class<> . boolean ( javax.xml.bind.annotation.XmlType .class ) ) && boolean ( org.springframework.http.converter.xml.MediaType ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , MediaType org.springframework.http.converter.xml.MediaType ) { return ( AnnotationUtils . findAnnotation ( java.lang.Class<> , javax.xml.bind.annotation.XmlRootElement .class ) != null && boolean ( org.springframework.http.converter.xml.MediaType ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.Class<?> < ? > java.lang.Class<?> , HttpHeaders org.springframework.http.converter.xml.HttpHeaders , javax.xml.transform.Source javax.xml.transform.Source ) throws java.io.IOException { try { javax.xml.transform.Source = javax.xml.transform.Source ( javax.xml.transform.Source ) ; javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller = createUnmarshaller ( java.lang.Class<> ) ; if ( java.lang.Class<> . boolean ( javax.xml.bind.annotation.XmlRootElement .class ) ) { return javax.xml.bind.Unmarshaller . java.lang.Object ( javax.xml.transform.Source ) ; } else { javax.xml.bind.JAXBElement<?> < ? > javax.xml.bind.JAXBElement<?> = javax.xml.bind.Unmarshaller . javax.xml.bind.JAXBElement<> ( javax.xml.transform.Source , java.lang.Class<> ) ; return javax.xml.bind.JAXBElement<> . getValue ( ) ; } } catch ( java.lang.NullPointerException java.lang.NullPointerException ) { if ( ! boolean ( ) ) { throw new HttpMessageNotReadableException ( STRING + STRING + STRING , java.lang.NullPointerException ) ; } throw java.lang.NullPointerException ; } catch ( javax.xml.bind.UnmarshalException javax.xml.bind.UnmarshalException ) { throw new HttpMessageNotReadableException ( STRING + java.lang.Class<> + STRING + javax.xml.bind.UnmarshalException . java.lang.String ( ) , javax.xml.bind.UnmarshalException ) ; } catch ( javax.xml.bind.JAXBException javax.xml.bind.JAXBException ) { throw new HttpMessageConversionException ( STRING + javax.xml.bind.JAXBException . java.lang.String ( ) , javax.xml.bind.JAXBException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected javax.xml.transform.Source javax.xml.transform.Source ( javax.xml.transform.Source javax.xml.transform.Source ) { if ( javax.xml.transform.Source instanceof javax.xml.transform.stream.StreamSource ) { javax.xml.transform.stream.StreamSource javax.xml.transform.stream.StreamSource = ( javax.xml.transform.stream.StreamSource ) javax.xml.transform.Source ; org.xml.sax.InputSource org.xml.sax.InputSource = new org.xml.sax.InputSource ( javax.xml.transform.stream.StreamSource . java.io.InputStream ( ) ) ; try { org.xml.sax.XMLReader org.xml.sax.XMLReader = org . xml . sax . helpers . org.xml.sax.helpers.XMLReaderFactory . org.xml.sax.XMLReader ( ) ; org.xml.sax.XMLReader . void ( STRING , ! boolean ( ) ) ; java.lang.String java.lang.String = STRING ; org.xml.sax.XMLReader . void ( java.lang.String , boolean ( ) ) ; if ( ! boolean ( ) ) { org.xml.sax.XMLReader . void ( org.xml.sax.EntityResolver ) ; } return new javax.xml.transform.sax.SAXSource ( org.xml.sax.XMLReader , org.xml.sax.InputSource ) ; } catch ( org.xml.sax.SAXException org.xml.sax.SAXException ) { logger . warn ( STRING , org.xml.sax.SAXException ) ; return javax.xml.transform.Source ; } } else { return javax.xml.transform.Source ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , HttpHeaders org.springframework.http.converter.xml.HttpHeaders , javax.xml.transform.Result javax.xml.transform.Result ) throws java.io.IOException { try { java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . getUserClass ( java.lang.Object ) ; javax.xml.bind.Marshaller javax.xml.bind.Marshaller = createMarshaller ( java.lang.Class<> ) ; void ( org.springframework.http.converter.xml.HttpHeaders . getContentType ( ) , javax.xml.bind.Marshaller ) ; javax.xml.bind.Marshaller . void ( java.lang.Object , javax.xml.transform.Result ) ; } catch ( javax.xml.bind.MarshalException javax.xml.bind.MarshalException ) { throw new HttpMessageNotWritableException ( STRING + java.lang.Object + STRING + javax.xml.bind.MarshalException . java.lang.String ( ) , javax.xml.bind.MarshalException ) ; } catch ( javax.xml.bind.JAXBException javax.xml.bind.JAXBException ) { throw new HttpMessageConversionException ( STRING + javax.xml.bind.JAXBException . java.lang.String ( ) , javax.xml.bind.JAXBException ) ; } }  <METHOD_END>
<METHOD_START> private void void ( MediaType org.springframework.http.converter.xml.MediaType , javax.xml.bind.Marshaller javax.xml.bind.Marshaller ) throws javax.xml.bind.PropertyException { if ( org.springframework.http.converter.xml.MediaType != null && org.springframework.http.converter.xml.MediaType . getCharset ( ) != null ) { javax.xml.bind.Marshaller . void ( javax.xml.bind.Marshaller . java.lang.String , org.springframework.http.converter.xml.MediaType . getCharset ( ) . name ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.xml.sax.InputSource org.xml.sax.InputSource ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return new org.xml.sax.InputSource ( new java.io.StringReader ( STRING ) ) ; }  <METHOD_END>
