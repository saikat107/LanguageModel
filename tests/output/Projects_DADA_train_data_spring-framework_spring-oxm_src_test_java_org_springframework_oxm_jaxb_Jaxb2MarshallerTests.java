<METHOD_START> @ java.lang.Override protected org.springframework.oxm.jaxb.Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller ( ) java.lang.Exception { Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setContextPath ( java.lang.String ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . afterPropertiesSet ( ) ; return org.springframework.oxm.jaxb.Jaxb2Marshaller ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { FlightType org.springframework.oxm.jaxb.FlightType = new FlightType ( ) ; org.springframework.oxm.jaxb.FlightType . setNumber ( NUMBER ) ; org.springframework.oxm.jaxb.Flights = new Flights ( ) ; org.springframework.oxm.jaxb.Flights . getFlight ( ) . add ( org.springframework.oxm.jaxb.FlightType ) ; return org.springframework.oxm.jaxb.Flights ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.xml.sax.ContentHandler org.xml.sax.ContentHandler = mock ( org.xml.sax.ContentHandler .class ) ; javax.xml.transform.sax.SAXResult javax.xml.transform.sax.SAXResult = new javax.xml.transform.sax.SAXResult ( org.xml.sax.ContentHandler ) ; marshaller . marshal ( org.springframework.oxm.jaxb.Flights , javax.xml.transform.sax.SAXResult ) ; InOrder org.springframework.oxm.jaxb.InOrder = inOrder ( org.xml.sax.ContentHandler ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . setDocumentLocator ( isA ( org.xml.sax.Locator .class ) ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . startDocument ( ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . startPrefixMapping ( STRING , STRING ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . startElement ( eq ( STRING ) , eq ( STRING ) , eq ( STRING ) , isA ( org.xml.sax.Attributes .class ) ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . startElement ( eq ( STRING ) , eq ( STRING ) , eq ( STRING ) , isA ( org.xml.sax.Attributes .class ) ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . startElement ( eq ( STRING ) , eq ( STRING ) , eq ( STRING ) , isA ( org.xml.sax.Attributes .class ) ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . characters ( isA ( char [] .class ) , eq ( NUMBER ) , eq ( NUMBER ) ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . endElement ( STRING , STRING , STRING ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . endElement ( STRING , STRING , STRING ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . endElement ( STRING , STRING , STRING ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . endPrefixMapping ( STRING ) ; org.springframework.oxm.jaxb.InOrder . verify ( org.xml.sax.ContentHandler ) . endDocument ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { marshaller = new Jaxb2Marshaller ( ) ; marshaller . setContextPath ( java.lang.String ) ; marshaller . setLazyInit ( true ) ; marshaller . afterPropertiesSet ( ) ; java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; javax.xml.transform.stream.StreamResult javax.xml.transform.stream.StreamResult = new javax.xml.transform.stream.StreamResult ( java.io.StringWriter ) ; marshaller . marshal ( org.springframework.oxm.jaxb.Flights , javax.xml.transform.stream.StreamResult ) ; DifferenceEvaluator org.springframework.oxm.jaxb.DifferenceEvaluator = chain ( Default , downgradeDifferencesToEqual ( XML_STANDALONE ) ) ; assertThat ( STRING , java.io.StringWriter . java.lang.String ( ) , isSimilarTo ( EXPECTED_STRING ) . withDifferenceEvaluator ( org.springframework.oxm.jaxb.DifferenceEvaluator ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setContextPath ( java.lang.String ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setMarshallerProperties ( java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( javax . xml . bind . javax.xml.bind.Marshaller . java.lang.String , java.lang.Boolean . java.lang.Boolean ) ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = UncategorizedMappingException .class ) public void void ( ) java.lang.Exception { Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setContextPath ( STRING ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = XmlMappingException .class ) public void void ( ) java.lang.Exception { Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setClassesToBeBound ( FlightType .class ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . afterPropertiesSet ( ) ; javax.xml.transform.Result javax.xml.transform.Result = new javax.xml.transform.stream.StreamResult ( new java.io.StringWriter ( ) ) ; Flights org.springframework.oxm.jaxb.Flights = new Flights ( ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . marshal ( org.springframework.oxm.jaxb.Flights , javax.xml.transform.Result ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { marshaller = new Jaxb2Marshaller ( ) ; marshaller . setClassesToBeBound ( Flights .class , FlightType .class ) ; marshaller . afterPropertiesSet ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { marshaller = new Jaxb2Marshaller ( ) ; marshaller . setPackagesToScan ( new java.lang.String [] { java.lang.String } ) ; marshaller . afterPropertiesSet ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { assertTrue ( STRING , marshaller . supports ( Flights .class ) ) ; assertTrue ( STRING , marshaller . supports ( ( java.lang.reflect.Type ) Flights .class ) ) ; assertFalse ( STRING , marshaller . supports ( FlightType .class ) ) ; assertFalse ( STRING , marshaller . supports ( ( java.lang.reflect.Type ) FlightType .class ) ) ; java.lang.reflect.Method java.lang.reflect.Method = ObjectFactory .class . java.lang.reflect.Method ( STRING , FlightType .class ) ; assertTrue ( STRING , marshaller . supports ( java.lang.reflect.Method . java.lang.reflect.Type ( ) ) ) ; marshaller . setSupportJaxbElementClass ( true ) ; javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.FlightType> < FlightType > javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.FlightType> = new javax.xml.bind.JAXBElement <> ( new javax.xml.namespace.QName ( STRING , STRING ) , FlightType .class , new FlightType ( ) ) ; assertTrue ( STRING , marshaller . supports ( javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.FlightType> . getClass ( ) ) ) ; assertFalse ( STRING , marshaller . supports ( org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement .class ) ) ; assertFalse ( STRING , marshaller . supports ( ( java.lang.reflect.Type ) org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement .class ) ) ; java.lang.reflect.Method = java.lang.Class<? extends org.springframework.oxm.jaxb.Jaxb2MarshallerTests> ( ) . java.lang.reflect.Method ( STRING ) ; assertFalse ( STRING , marshaller . supports ( java.lang.reflect.Method . java.lang.reflect.Type ( ) ) ) ; assertFalse ( STRING , marshaller . supports ( org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType .class ) ) ; assertFalse ( STRING , marshaller . supports ( ( java.lang.reflect.Type ) org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType .class ) ) ; java.lang.reflect.Method = java.lang.Class<? extends org.springframework.oxm.jaxb.Jaxb2MarshallerTests> ( ) . java.lang.reflect.Method ( STRING ) ; assertFalse ( STRING , marshaller . supports ( java.lang.reflect.Method . java.lang.reflect.Type ( ) ) ) ; void ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { final Primitives org.springframework.oxm.jaxb.Primitives = new Primitives ( ) ; ReflectionUtils . doWithMethods ( Primitives .class , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Method . java.lang.reflect.Type ( ) ; assertTrue ( STRING + java.lang.reflect.Method . java.lang.String ( ) . java.lang.String ( NUMBER ) + STRING , marshaller . supports ( java.lang.reflect.Type ) ) ; try { java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( org.springframework.oxm.jaxb.Primitives ) ; marshaller . marshal ( java.lang.Object , new javax.xml.transform.stream.StreamResult ( new java.io.ByteArrayOutputStream ( ) ) ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { fail ( java.lang.reflect.InvocationTargetException . java.lang.String ( ) ) ; } } } , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Method . java.lang.reflect.Type ( ) ; assertTrue ( STRING + java.lang.reflect.Method . java.lang.String ( ) . java.lang.String ( NUMBER ) + STRING , marshaller . supports ( java.lang.reflect.Type ) ) ; try { java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( org.springframework.oxm.jaxb.Primitives ) ; marshaller . marshal ( java.lang.Object , new javax.xml.transform.stream.StreamResult ( new java.io.ByteArrayOutputStream ( ) ) ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { fail ( java.lang.reflect.InvocationTargetException . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { final StandardClasses org.springframework.oxm.jaxb.StandardClasses = new StandardClasses ( ) ; ReflectionUtils . doWithMethods ( StandardClasses .class , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Method . java.lang.reflect.Type ( ) ; assertTrue ( STRING + java.lang.reflect.Method . java.lang.String ( ) . java.lang.String ( NUMBER ) + STRING , marshaller . supports ( java.lang.reflect.Type ) ) ; try { java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( org.springframework.oxm.jaxb.StandardClasses ) ; marshaller . marshal ( java.lang.Object , new javax.xml.transform.stream.StreamResult ( new java.io.ByteArrayOutputStream ( ) ) ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { fail ( java.lang.reflect.InvocationTargetException . java.lang.String ( ) ) ; } } } , new ReflectionUtils . ReflectionUtils ( ) { @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Method java.lang.reflect.Method ) throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { java.lang.reflect.Type java.lang.reflect.Type = java.lang.reflect.Method . java.lang.reflect.Type ( ) ; assertTrue ( STRING + java.lang.reflect.Method . java.lang.String ( ) . java.lang.String ( NUMBER ) + STRING , marshaller . supports ( java.lang.reflect.Type ) ) ; try { java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( org.springframework.oxm.jaxb.StandardClasses ) ; marshaller . marshal ( java.lang.Object , new javax.xml.transform.stream.StreamResult ( new java.io.ByteArrayOutputStream ( ) ) ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { fail ( java.lang.reflect.InvocationTargetException . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { marshaller = new Jaxb2Marshaller ( ) ; marshaller . setClassesToBeBound ( org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement .class , org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType .class ) ; marshaller . afterPropertiesSet ( ) ; assertTrue ( STRING , marshaller . supports ( org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement .class ) ) ; assertTrue ( STRING , marshaller . supports ( ( java.lang.reflect.Type ) org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement .class ) ) ; assertFalse ( STRING , marshaller . supports ( org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType .class ) ) ; assertFalse ( STRING , marshaller . supports ( ( java.lang.reflect.Type ) org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { marshaller = new Jaxb2Marshaller ( ) ; marshaller . setClassesToBeBound ( BinaryObject .class ) ; marshaller . setMtomEnabled ( true ) ; marshaller . afterPropertiesSet ( ) ; MimeContainer org.springframework.oxm.jaxb.MimeContainer = mock ( MimeContainer .class ) ; Resource org.springframework.oxm.jaxb.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.oxm.jaxb.Jaxb2MarshallerTests> ( ) ) ; javax.activation.DataHandler javax.activation.DataHandler = new javax.activation.DataHandler ( new javax.activation.FileDataSource ( org.springframework.oxm.jaxb.Resource . getFile ( ) ) ) ; given ( org.springframework.oxm.jaxb.MimeContainer . convertToXopPackage ( ) ) . willReturn ( true ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.oxm.jaxb.Resource . getInputStream ( ) ) ; BinaryObject org.springframework.oxm.jaxb.BinaryObject = new BinaryObject ( byte[] , javax.activation.DataHandler ) ; java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; marshaller . marshal ( org.springframework.oxm.jaxb.BinaryObject , new javax.xml.transform.stream.StreamResult ( java.io.StringWriter ) , org.springframework.oxm.jaxb.MimeContainer ) ; assertTrue ( STRING , java.io.StringWriter . java.lang.String ( ) . int ( ) > NUMBER ) ; verify ( org.springframework.oxm.jaxb.MimeContainer , times ( NUMBER ) ) . addAttachment ( isA ( java.lang.String .class ) , isA ( javax.activation.DataHandler .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { marshaller = new Jaxb2Marshaller ( ) ; marshaller . setPackagesToScan ( new java.lang.String [] { STRING } ) ; marshaller . afterPropertiesSet ( ) ; Airplane org.springframework.oxm.jaxb.Airplane = new Airplane ( ) ; org.springframework.oxm.jaxb.Airplane . setName ( STRING ) ; java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; javax.xml.transform.Result javax.xml.transform.Result = new javax.xml.transform.stream.StreamResult ( java.io.StringWriter ) ; marshaller . marshal ( org.springframework.oxm.jaxb.Airplane , javax.xml.transform.Result ) ; DifferenceEvaluator org.springframework.oxm.jaxb.DifferenceEvaluator = chain ( Default , downgradeDifferencesToEqual ( XML_STANDALONE ) ) ; assertThat ( STRING , java.io.StringWriter . java.lang.String ( ) , isSimilarTo ( STRING ) . withDifferenceEvaluator ( org.springframework.oxm.jaxb.DifferenceEvaluator ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final javax . xml . bind . javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller = mock ( javax . xml . bind . javax.xml.bind.Unmarshaller .class ) ; Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) { @ java.lang.Override protected javax . xml . bind . javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller ( ) { return javax.xml.bind.Unmarshaller ; } } ; org.springframework.oxm.jaxb.Jaxb2Marshaller . unmarshal ( new javax.xml.transform.stream.StreamSource ( STRING ) ) ; ArgumentCaptor < javax.xml.transform.sax.SAXSource > org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> = ArgumentCaptor . forClass ( javax.xml.transform.sax.SAXSource .class ) ; verify ( javax.xml.bind.Unmarshaller ) . unmarshal ( org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . capture ( ) ) ; javax.xml.transform.sax.SAXSource javax.xml.transform.sax.SAXSource = org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . getValue ( ) ; assertEquals ( true , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; assertEquals ( false , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; reset ( javax.xml.bind.Unmarshaller ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setProcessExternalEntities ( true ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setSupportDtd ( true ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . unmarshal ( new javax.xml.transform.stream.StreamSource ( STRING ) ) ; verify ( javax.xml.bind.Unmarshaller ) . unmarshal ( org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . capture ( ) ) ; javax.xml.transform.sax.SAXSource = org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . getValue ( ) ; assertEquals ( false , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; assertEquals ( true , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax . xml . bind . javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller ( ) { return javax.xml.bind.Unmarshaller ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final javax . xml . bind . javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller = mock ( javax . xml . bind . javax.xml.bind.Unmarshaller .class ) ; Jaxb2Marshaller org.springframework.oxm.jaxb.Jaxb2Marshaller = new Jaxb2Marshaller ( ) { @ java.lang.Override protected javax . xml . bind . javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller ( ) { return javax.xml.bind.Unmarshaller ; } } ; org.springframework.oxm.jaxb.Jaxb2Marshaller . unmarshal ( new javax.xml.transform.sax.SAXSource ( new org.xml.sax.InputSource ( STRING ) ) ) ; ArgumentCaptor < javax.xml.transform.sax.SAXSource > org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> = ArgumentCaptor . forClass ( javax.xml.transform.sax.SAXSource .class ) ; verify ( javax.xml.bind.Unmarshaller ) . unmarshal ( org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . capture ( ) ) ; javax.xml.transform.sax.SAXSource javax.xml.transform.sax.SAXSource = org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . getValue ( ) ; assertEquals ( true , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; assertEquals ( false , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; reset ( javax.xml.bind.Unmarshaller ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setProcessExternalEntities ( true ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . setSupportDtd ( true ) ; org.springframework.oxm.jaxb.Jaxb2Marshaller . unmarshal ( new javax.xml.transform.sax.SAXSource ( new org.xml.sax.InputSource ( STRING ) ) ) ; verify ( javax.xml.bind.Unmarshaller ) . unmarshal ( org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . capture ( ) ) ; javax.xml.transform.sax.SAXSource = org.springframework.oxm.jaxb.ArgumentCaptor<javax.xml.transform.sax.SAXSource> . getValue ( ) ; assertEquals ( false , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; assertEquals ( true , javax.xml.transform.sax.SAXSource . org.xml.sax.XMLReader ( ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax . xml . bind . javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller ( ) { return javax.xml.bind.Unmarshaller ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement> < org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement > javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyRootElement> ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType> < org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType > javax.xml.bind.JAXBElement<org.springframework.oxm.jaxb.Jaxb2MarshallerTests.DummyType> ( ) { return null ; }  <METHOD_END>