<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) org.springframework.oxm.jibx.JiBXException { if ( this . java.lang.Class<> != null ) { if ( StringUtils . hasLength ( this . java.lang.String ) ) { if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + this . java.lang.Class<> + STRING + this . java.lang.String + STRING ) ; } this . org.springframework.oxm.jibx.IBindingFactory = BindingDirectory . getFactory ( this . java.lang.String , this . java.lang.Class<> ) ; } else { if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + this . java.lang.Class<> + STRING ) ; } this . org.springframework.oxm.jibx.IBindingFactory = BindingDirectory . getFactory ( this . java.lang.Class<> ) ; } } else if ( this . java.lang.String != null ) { if ( ! StringUtils . hasLength ( java.lang.String ) ) { java.lang.String = java.lang.String ; } if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + this . java.lang.String + STRING + this . java.lang.String + STRING ) ; } this . org.springframework.oxm.jibx.IBindingFactory = BindingDirectory . getFactory ( this . java.lang.String , this . java.lang.String ) ; } else { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; if ( this . java.lang.Class<> != null ) { return ( this . java.lang.Class<> == java.lang.Class<> ) ; } java.lang.String [] java.lang.String[] = this . org.springframework.oxm.jibx.IBindingFactory . getMappedClasses ( ) ; java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( java.lang.String . boolean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , java.io.OutputStream java.io.OutputStream )			throws org.springframework.oxm.jibx.XmlMappingException , java.io.IOException { try { IMarshallingContext org.springframework.oxm.jibx.IMarshallingContext = org.springframework.oxm.jibx.IMarshallingContext ( ) ; org.springframework.oxm.jibx.IMarshallingContext . startDocument ( this . java.lang.String , this . java.lang.Boolean , java.io.OutputStream ) ; void ( org.springframework.oxm.jibx.IMarshallingContext , java.lang.Object ) ; } catch ( JiBXException org.springframework.oxm.jibx.JiBXException ) { throw org.springframework.oxm.jibx.XmlMappingException ( org.springframework.oxm.jibx.JiBXException , true ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , java.io.Writer java.io.Writer ) throws org.springframework.oxm.jibx.XmlMappingException , java.io.IOException { try { IMarshallingContext org.springframework.oxm.jibx.IMarshallingContext = org.springframework.oxm.jibx.IMarshallingContext ( ) ; org.springframework.oxm.jibx.IMarshallingContext . startDocument ( this . java.lang.String , this . java.lang.Boolean , java.io.Writer ) ; void ( org.springframework.oxm.jibx.IMarshallingContext , java.lang.Object ) ; } catch ( JiBXException org.springframework.oxm.jibx.JiBXException ) { throw org.springframework.oxm.jibx.XmlMappingException ( org.springframework.oxm.jibx.JiBXException , true ) ; } }  <METHOD_END>
<METHOD_START> private void void ( IMarshallingContext org.springframework.oxm.jibx.IMarshallingContext , java.lang.Object java.lang.Object ) throws java.io.IOException , org.springframework.oxm.jibx.JiBXException { if ( StringUtils . hasLength ( java.lang.String ) ) { IXMLWriter org.springframework.oxm.jibx.IXMLWriter = org.springframework.oxm.jibx.IMarshallingContext . getXmlWriter ( ) ; org.springframework.oxm.jibx.IXMLWriter . writeDocType ( java.lang.String , java.lang.String , java.lang.String , java.lang.String ) ; } org.springframework.oxm.jibx.IMarshallingContext . marshalDocument ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , org.w3c.dom.Node org.w3c.dom.Node ) throws org.springframework.oxm.jibx.XmlMappingException { try { javax.xml.transform.Result javax.xml.transform.Result = new javax.xml.transform.dom.DOMResult ( org.w3c.dom.Node ) ; void ( java.lang.Object , javax.xml.transform.Result ) ; } catch ( java.io.IOException java.io.IOException ) { throw new MarshallingFailureException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , javax.xml.stream.XMLEventWriter javax.xml.stream.XMLEventWriter ) { javax.xml.stream.XMLStreamWriter javax.xml.stream.XMLStreamWriter = StaxUtils . createEventStreamWriter ( javax.xml.stream.XMLEventWriter ) ; void ( java.lang.Object , javax.xml.stream.XMLStreamWriter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , javax.xml.stream.XMLStreamWriter javax.xml.stream.XMLStreamWriter ) throws org.springframework.oxm.jibx.XmlMappingException { try { MarshallingContext org.springframework.oxm.jibx.MarshallingContext = ( MarshallingContext ) org.springframework.oxm.jibx.IMarshallingContext ( ) ; IXMLWriter org.springframework.oxm.jibx.IXMLWriter = new StAXWriter ( org.springframework.oxm.jibx.MarshallingContext . getNamespaces ( ) , javax.xml.stream.XMLStreamWriter ) ; org.springframework.oxm.jibx.MarshallingContext . setXmlWriter ( org.springframework.oxm.jibx.IXMLWriter ) ; org.springframework.oxm.jibx.MarshallingContext . marshalDocument ( java.lang.Object ) ; } catch ( JiBXException org.springframework.oxm.jibx.JiBXException ) { throw org.springframework.oxm.jibx.XmlMappingException ( org.springframework.oxm.jibx.JiBXException , false ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object , org.xml.sax.ContentHandler org.xml.sax.ContentHandler , org.xml.sax.ext.LexicalHandler org.xml.sax.ext.LexicalHandler )			throws org.springframework.oxm.jibx.XmlMappingException { try { javax.xml.transform.sax.SAXResult javax.xml.transform.sax.SAXResult = new javax.xml.transform.sax.SAXResult ( org.xml.sax.ContentHandler ) ; javax.xml.transform.sax.SAXResult . void ( org.xml.sax.ext.LexicalHandler ) ; void ( java.lang.Object , javax.xml.transform.sax.SAXResult ) ; } catch ( java.io.IOException java.io.IOException ) { throw new MarshallingFailureException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , javax.xml.transform.Result javax.xml.transform.Result ) throws java.io.IOException { try { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( NUMBER ) ; void ( java.lang.Object , java.io.ByteArrayOutputStream ) ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( java.io.ByteArrayOutputStream . byte[] ( ) ) ; javax.xml.transform.Transformer javax.xml.transform.Transformer = this . javax.xml.transform.TransformerFactory . javax.xml.transform.Transformer ( ) ; javax.xml.transform.Transformer . void ( new javax.xml.transform.stream.StreamSource ( java.io.ByteArrayInputStream ) , javax.xml.transform.Result ) ; } catch ( javax.xml.transform.TransformerException javax.xml.transform.TransformerException ) { throw new MarshallingFailureException ( STRING + ClassUtils . getShortName ( javax.xml.transform.Result . java.lang.Class<? extends javax.xml.transform.Result> ( ) ) + STRING , javax.xml.transform.TransformerException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( javax.xml.stream.XMLEventReader javax.xml.stream.XMLEventReader ) { try { javax.xml.stream.XMLStreamReader javax.xml.stream.XMLStreamReader = StaxUtils . createEventStreamReader ( javax.xml.stream.XMLEventReader ) ; return java.lang.Object ( javax.xml.stream.XMLStreamReader ) ; } catch ( javax.xml.stream.XMLStreamException javax.xml.stream.XMLStreamException ) { return new UnmarshallingFailureException ( STRING , javax.xml.stream.XMLStreamException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( javax.xml.stream.XMLStreamReader javax.xml.stream.XMLStreamReader ) { try { UnmarshallingContext org.springframework.oxm.jibx.UnmarshallingContext = ( UnmarshallingContext ) org.springframework.oxm.jibx.IUnmarshallingContext ( ) ; IXMLReader org.springframework.oxm.jibx.IXMLReader = new StAXReaderWrapper ( javax.xml.stream.XMLStreamReader , null , true ) ; org.springframework.oxm.jibx.UnmarshallingContext . setDocument ( org.springframework.oxm.jibx.IXMLReader ) ; return org.springframework.oxm.jibx.UnmarshallingContext . unmarshalElement ( ) ; } catch ( JiBXException org.springframework.oxm.jibx.JiBXException ) { throw org.springframework.oxm.jibx.XmlMappingException ( org.springframework.oxm.jibx.JiBXException , false ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.io.InputStream java.io.InputStream ) throws org.springframework.oxm.jibx.XmlMappingException , java.io.IOException { try { IUnmarshallingContext org.springframework.oxm.jibx.IUnmarshallingContext = org.springframework.oxm.jibx.IUnmarshallingContext ( ) ; return org.springframework.oxm.jibx.IUnmarshallingContext . unmarshalDocument ( java.io.InputStream , java.lang.String ) ; } catch ( JiBXException org.springframework.oxm.jibx.JiBXException ) { throw org.springframework.oxm.jibx.XmlMappingException ( org.springframework.oxm.jibx.JiBXException , false ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.io.Reader java.io.Reader ) throws org.springframework.oxm.jibx.XmlMappingException , java.io.IOException { try { IUnmarshallingContext org.springframework.oxm.jibx.IUnmarshallingContext = org.springframework.oxm.jibx.IUnmarshallingContext ( ) ; return org.springframework.oxm.jibx.IUnmarshallingContext . unmarshalDocument ( java.io.Reader ) ; } catch ( JiBXException org.springframework.oxm.jibx.JiBXException ) { throw org.springframework.oxm.jibx.XmlMappingException ( org.springframework.oxm.jibx.JiBXException , false ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( org.w3c.dom.Node org.w3c.dom.Node ) throws org.springframework.oxm.jibx.XmlMappingException { try { return java.lang.Object ( new javax.xml.transform.dom.DOMSource ( org.w3c.dom.Node ) , null ) ; } catch ( java.io.IOException java.io.IOException ) { throw new UnmarshallingFailureException ( STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( org.xml.sax.XMLReader org.xml.sax.XMLReader , org.xml.sax.InputSource org.xml.sax.InputSource )			throws org.springframework.oxm.jibx.XmlMappingException , java.io.IOException { return java.lang.Object ( new javax.xml.transform.sax.SAXSource ( org.xml.sax.XMLReader , org.xml.sax.InputSource ) , org.xml.sax.InputSource . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( javax.xml.transform.Source javax.xml.transform.Source , java.lang.String java.lang.String ) throws java.io.IOException { try { javax.xml.transform.Transformer javax.xml.transform.Transformer = this . javax.xml.transform.TransformerFactory . javax.xml.transform.Transformer ( ) ; if ( java.lang.String != null ) { javax.xml.transform.Transformer . void ( javax.xml.transform.OutputKeys . java.lang.String , java.lang.String ) ; } java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( NUMBER ) ; javax.xml.transform.Transformer . void ( javax.xml.transform.Source , new javax.xml.transform.stream.StreamResult ( java.io.ByteArrayOutputStream ) ) ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( java.io.ByteArrayOutputStream . byte[] ( ) ) ; return java.lang.Object ( java.io.ByteArrayInputStream ) ; } catch ( javax.xml.transform.TransformerException javax.xml.transform.TransformerException ) { throw new MarshallingFailureException ( STRING + ClassUtils . getShortName ( javax.xml.transform.Source . java.lang.Class<? extends javax.xml.transform.Source> ( ) ) + STRING , javax.xml.transform.TransformerException ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.oxm.jibx.IMarshallingContext org.springframework.oxm.jibx.IMarshallingContext ( ) org.springframework.oxm.jibx.JiBXException { IMarshallingContext org.springframework.oxm.jibx.IMarshallingContext = this . org.springframework.oxm.jibx.IBindingFactory . createMarshallingContext ( ) ; org.springframework.oxm.jibx.IMarshallingContext . setIndent ( this . int ) ; return org.springframework.oxm.jibx.IMarshallingContext ; }  <METHOD_END>
<METHOD_START> protected org.springframework.oxm.jibx.IUnmarshallingContext org.springframework.oxm.jibx.IUnmarshallingContext ( ) org.springframework.oxm.jibx.JiBXException { return this . org.springframework.oxm.jibx.IBindingFactory . createUnmarshallingContext ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.oxm.jibx.XmlMappingException org.springframework.oxm.jibx.XmlMappingException ( JiBXException org.springframework.oxm.jibx.JiBXException , boolean boolean ) { if ( org.springframework.oxm.jibx.JiBXException instanceof ValidationException ) { return new ValidationFailureException ( STRING , org.springframework.oxm.jibx.JiBXException ) ; } else { if ( boolean ) { return new MarshallingFailureException ( STRING , org.springframework.oxm.jibx.JiBXException ) ; } else { return new UnmarshallingFailureException ( STRING , org.springframework.oxm.jibx.JiBXException ) ; } } }  <METHOD_END>