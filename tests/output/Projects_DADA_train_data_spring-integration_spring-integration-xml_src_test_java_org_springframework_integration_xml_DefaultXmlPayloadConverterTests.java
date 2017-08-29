<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.integration.xml.DefaultXmlPayloadConverter = new DefaultXmlPayloadConverter ( ) ; org.w3c.dom.Document = javax.xml.parsers.DocumentBuilderFactory . javax.xml.parsers.DocumentBuilderFactory ( ) . javax.xml.parsers.DocumentBuilder ( ) . org.w3c.dom.Document ( new org.xml.sax.InputSource ( new java.io.StringReader ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( STRING ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( org.w3c.dom.Document ) ; Assert . assertTrue ( org.w3c.dom.Document == org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Node org.w3c.dom.Node = org.w3c.dom.Document . org.w3c.dom.NodeList ( STRING ) . org.w3c.dom.Node ( NUMBER ) ; org.w3c.dom.Node org.w3c.dom.Node = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToNode ( org.w3c.dom.Node ) ; assertTrue ( STRING , org.w3c.dom.Node == org.w3c.dom.Node ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Node org.w3c.dom.Node = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToNode ( STRING ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , ( org.w3c.dom.Document ) org.w3c.dom.Node ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Node org.w3c.dom.Node = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToNode ( org.w3c.dom.Document ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , ( org.w3c.dom.Document ) org.w3c.dom.Node ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.transform.Source javax.xml.transform.Source = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToSource ( org.w3c.dom.Document ) ; assertEquals ( javax.xml.transform.dom.DOMSource .class , javax.xml.transform.Source . java.lang.Class<? extends javax.xml.transform.Source> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.transform.Source javax.xml.transform.Source = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToSource ( java.lang.String ) ; assertEquals ( StringSource .class , javax.xml.transform.Source . java.lang.Class<? extends javax.xml.transform.Source> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.transform.sax.SAXSource javax.xml.transform.sax.SAXSource = new javax.xml.transform.sax.SAXSource ( ) ; javax.xml.transform.Source javax.xml.transform.Source = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToSource ( javax.xml.transform.sax.SAXSource ) ; assertEquals ( javax.xml.transform.Source , javax.xml.transform.sax.SAXSource ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) { org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToSource ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Node org.w3c.dom.Node = org.w3c.dom.Document . org.w3c.dom.NodeList ( STRING ) . org.w3c.dom.Node ( NUMBER ) ; org.w3c.dom.Node org.w3c.dom.Node = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToNode ( new javax.xml.transform.dom.DOMSource ( org.w3c.dom.Node ) ) ; assertTrue ( STRING , org.w3c.dom.Node == org.w3c.dom.Node ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.w3c.dom.Node org.w3c.dom.Node = org.w3c.dom.Document . org.w3c.dom.NodeList ( STRING ) . org.w3c.dom.Node ( NUMBER ) ; org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( org.w3c.dom.Node ) ; org.w3c.dom.NodeList org.w3c.dom.NodeList = org.w3c.dom.Document . org.w3c.dom.NodeList ( ) ; assertEquals ( NUMBER , org.w3c.dom.NodeList . int ( ) ) ; assertEquals ( STRING , org.w3c.dom.NodeList . org.w3c.dom.Node ( NUMBER ) . java.lang.String ( ) ) ; assertEquals ( STRING , org.w3c.dom.NodeList . org.w3c.dom.Node ( NUMBER ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.w3c.dom.Node org.w3c.dom.Node = org.w3c.dom.Document . org.w3c.dom.NodeList ( STRING ) . org.w3c.dom.Node ( NUMBER ) ; javax.xml.transform.dom.DOMSource javax.xml.transform.dom.DOMSource = new javax.xml.transform.dom.DOMSource ( org.w3c.dom.Node ) ; org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( javax.xml.transform.dom.DOMSource ) ; org.w3c.dom.NodeList org.w3c.dom.NodeList = org.w3c.dom.Document . org.w3c.dom.NodeList ( ) ; assertEquals ( NUMBER , org.w3c.dom.NodeList . int ( ) ) ; assertEquals ( STRING , org.w3c.dom.NodeList . org.w3c.dom.Node ( NUMBER ) . java.lang.String ( ) ) ; assertEquals ( STRING , org.w3c.dom.NodeList . org.w3c.dom.Node ( NUMBER ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( STRING . byte[] ( ) ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = new ClassPathResource ( STRING ) . getFile ( ) ; org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( java.io.File ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.InputStream java.io.InputStream = new ClassPathResource ( STRING ) . getInputStream ( ) ; org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( java.io.InputStream ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathResource org.springframework.integration.xml.ClassPathResource = new ClassPathResource ( STRING ) ; javax.xml.transform.stream.StreamSource javax.xml.transform.stream.StreamSource = new javax.xml.transform.stream.StreamSource ( org.springframework.integration.xml.ClassPathResource . getInputStream ( ) ) ; org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( javax.xml.transform.stream.StreamSource ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.w3c.dom.Document org.w3c.dom.Document = org.springframework.integration.xml.DefaultXmlPayloadConverter . convertToDocument ( new org.springframework.integration.xml.DefaultXmlPayloadConverterTests.MySource ( ) ) ; XMLAssert . assertXMLEqual ( org.w3c.dom.Document , org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { try { return new ClassPathResource ( STRING ) . getFile ( ) . getPath ( ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( java.io.IOException ) ; } }  <METHOD_END>