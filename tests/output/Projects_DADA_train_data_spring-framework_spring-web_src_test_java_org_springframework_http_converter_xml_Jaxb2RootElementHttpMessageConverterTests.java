<METHOD_START> @ Before public void void ( ) { org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter = new Jaxb2RootElementHttpMessageConverter ( ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement = new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement ( ) ; DefaultAopProxyFactory org.springframework.http.converter.xml.DefaultAopProxyFactory = new DefaultAopProxyFactory ( ) ; AdvisedSupport org.springframework.http.converter.xml.AdvisedSupport = new AdvisedSupport ( ) ; org.springframework.http.converter.xml.AdvisedSupport . setTarget ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement ) ; org.springframework.http.converter.xml.AdvisedSupport . setProxyTargetClass ( true ) ; AopProxy org.springframework.http.converter.xml.AopProxy = org.springframework.http.converter.xml.DefaultAopProxyFactory . createAopProxy ( org.springframework.http.converter.xml.AdvisedSupport ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement ) org.springframework.http.converter.xml.AopProxy . getProxy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . canRead ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement .class , null ) ) ; assertTrue ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . canRead ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type .class , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . canWrite ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement .class , null ) ) ; assertTrue ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . canWrite ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElementSubclass .class , null ) ) ; assertTrue ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . canWrite ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement . java.lang.Class<? extends org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement> ( ) , null ) ) ; assertFalse ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . canWrite ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type .class , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( byte[] ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement ) org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; assertEquals ( STRING , STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( byte[] ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElementSubclass org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElementSubclass = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElementSubclass ) org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElementSubclass .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; assertEquals ( STRING , STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElementSubclass . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type ( ) . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( byte[] ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type ) org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; assertEquals ( STRING , STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.http.converter.xml.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests> ( ) ) ; java.lang.String java.lang.String = STRING + STRING + STRING + org.springframework.http.converter.xml.Resource . getURI ( ) + STRING + STRING ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( java.lang.String . byte[] ( STRING ) ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . setSupportDtd ( true ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement ) org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; assertEquals ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.http.converter.xml.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests> ( ) ) ; java.lang.String java.lang.String = STRING + STRING + STRING + org.springframework.http.converter.xml.Resource . getURI ( ) + STRING + STRING ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( java.lang.String . byte[] ( STRING ) ) ; this . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . setProcessExternalEntities ( true ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement ) org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; assertEquals ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( java.lang.String . byte[] ( STRING ) ) ; this . org.springframework.http.converter.xml.ExpectedException . expect ( HttpMessageNotReadableException .class ) ; this . org.springframework.http.converter.xml.ExpectedException . expectMessage ( STRING ) ; this . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpOutputMessage org.springframework.http.converter.xml.MockHttpOutputMessage = new MockHttpOutputMessage ( ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . write ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement , null , org.springframework.http.converter.xml.MockHttpOutputMessage ) ; assertEquals ( STRING , new MediaType ( STRING , STRING ) , org.springframework.http.converter.xml.MockHttpOutputMessage . getHeaders ( ) . getContentType ( ) ) ; DifferenceEvaluator org.springframework.http.converter.xml.DifferenceEvaluator = chain ( Default , downgradeDifferencesToEqual ( XML_STANDALONE ) ) ; assertThat ( STRING , org.springframework.http.converter.xml.MockHttpOutputMessage . getBodyAsString ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , isSimilarTo ( STRING ) . withDifferenceEvaluator ( org.springframework.http.converter.xml.DifferenceEvaluator ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpOutputMessage org.springframework.http.converter.xml.MockHttpOutputMessage = new MockHttpOutputMessage ( ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter . write ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.RootElement , null , org.springframework.http.converter.xml.MockHttpOutputMessage ) ; assertEquals ( STRING , new MediaType ( STRING , STRING ) , org.springframework.http.converter.xml.MockHttpOutputMessage . getHeaders ( ) . getContentType ( ) ) ; DifferenceEvaluator org.springframework.http.converter.xml.DifferenceEvaluator = chain ( Default , downgradeDifferencesToEqual ( XML_STANDALONE ) ) ; assertThat ( STRING , org.springframework.http.converter.xml.MockHttpOutputMessage . getBodyAsString ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , isSimilarTo ( STRING ) . withDifferenceEvaluator ( org.springframework.http.converter.xml.DifferenceEvaluator ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpOutputMessage org.springframework.http.converter.xml.MockHttpOutputMessage = new MockHttpOutputMessage ( ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter = new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter ( ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter . write ( new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement ( new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ( STRING , STRING ) ) , null , org.springframework.http.converter.xml.MockHttpOutputMessage ) ; DifferenceEvaluator org.springframework.http.converter.xml.DifferenceEvaluator = chain ( Default , downgradeDifferencesToEqual ( XML_STANDALONE ) ) ; assertThat ( STRING , org.springframework.http.converter.xml.MockHttpOutputMessage . getBodyAsString ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , isSimilarTo ( STRING ) . withDifferenceEvaluator ( org.springframework.http.converter.xml.DifferenceEvaluator ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter = new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter ( ) ; MockHttpInputMessage org.springframework.http.converter.xml.MockHttpInputMessage = new MockHttpInputMessage ( byte[] ) ; org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement = ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement ) org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyJaxb2RootElementHttpMessageConverter . read ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement .class , org.springframework.http.converter.xml.MockHttpInputMessage ) ; assertEquals ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ( ) . java.lang.String ( ) ) ; assertEquals ( STRING , org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyRootElement . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type ( ) { return this . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type ; }  <METHOD_END>
<METHOD_START> @ javax.xml.bind.annotation.XmlElement public void void ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type ) { this . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type = org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.Type ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( javax.xml.bind.Marshaller javax.xml.bind.Marshaller ) { javax.xml.bind.Marshaller . void ( new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElementAdapter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( javax.xml.bind.Unmarshaller javax.xml.bind.Unmarshaller ) { javax.xml.bind.Unmarshaller . void ( new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElementAdapter ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> public void ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ) { this . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement = org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ; }  <METHOD_END>
<METHOD_START> @ javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElementAdapter .class ) public org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ( ) { return org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ) { this . org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement = org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ) throws java.lang.Exception { return org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement . java.lang.String ( ) + STRING + org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ( java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.String [] java.lang.String[] = java.lang.String . java.lang.String[] ( STRING ) ; return new org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverterTests.MyCustomElement ( java.lang.String[] [ NUMBER ] , java.lang.String[] [ NUMBER ] ) ; }  <METHOD_END>
