<METHOD_START> protected void ( ) { this . org.springframework.test.web.client.match.XmlExpectationsHelper = new XmlExpectationsHelper ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( java.lang.String java.lang.String ) { return org.springframework.test.web.client.match.RequestMatcher ( MediaType . parseMediaType ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final MediaType org.springframework.test.web.client.match.MediaType ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MediaType org.springframework.test.web.client.match.MediaType = org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . getContentType ( ) ; assertTrue ( STRING , org.springframework.test.web.client.match.MediaType != null ) ; assertEquals ( STRING , org.springframework.test.web.client.match.MediaType , org.springframework.test.web.client.match.MediaType ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MediaType org.springframework.test.web.client.match.MediaType = org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . getContentType ( ) ; assertTrue ( STRING , org.springframework.test.web.client.match.MediaType != null ) ; assertEquals ( STRING , org.springframework.test.web.client.match.MediaType , org.springframework.test.web.client.match.MediaType ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( java.lang.String java.lang.String ) { return org.springframework.test.web.client.match.RequestMatcher ( MediaType . parseMediaType ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final MediaType org.springframework.test.web.client.match.MediaType ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MediaType org.springframework.test.web.client.match.MediaType = org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . getContentType ( ) ; assertTrue ( STRING , org.springframework.test.web.client.match.MediaType != null ) ; assertTrue ( STRING + org.springframework.test.web.client.match.MediaType + STRING + org.springframework.test.web.client.match.MediaType + STRING , org.springframework.test.web.client.match.MediaType . isCompatibleWith ( org.springframework.test.web.client.match.MediaType ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MediaType org.springframework.test.web.client.match.MediaType = org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) . getContentType ( ) ; assertTrue ( STRING , org.springframework.test.web.client.match.MediaType != null ) ; assertTrue ( STRING + org.springframework.test.web.client.match.MediaType + STRING + org.springframework.test.web.client.match.MediaType + STRING , org.springframework.test.web.client.match.MediaType . isCompatibleWith ( org.springframework.test.web.client.match.MediaType ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final Matcher < ? super java.lang.String > org.springframework.test.web.client.match.Matcher<? super java.lang.String> ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; assertThat ( STRING , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) , org.springframework.test.web.client.match.Matcher<> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; assertThat ( STRING , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) , org.springframework.test.web.client.match.Matcher<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; assertEquals ( STRING , java.lang.String , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; assertEquals ( STRING , java.lang.String , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final byte [] byte[] ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; assertEquals ( STRING , byte[] , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsBytes ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; assertEquals ( STRING , byte[] , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsBytes ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final MultiValueMap < java.lang.String , java.lang.String > org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> ) { return new RequestMatcher ( ) { @ java.lang.Override public void void ( final ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { HttpInputMessage org.springframework.test.web.client.match.HttpInputMessage = new HttpInputMessage ( ) { @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; return new java.io.ByteArrayInputStream ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsBytes ( ) ) ; } @ java.lang.Override public org.springframework.test.web.client.match.HttpHeaders org.springframework.test.web.client.match.HttpHeaders ( ) { return org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) ; } } ; FormHttpMessageConverter org.springframework.test.web.client.match.FormHttpMessageConverter = new FormHttpMessageConverter ( ) ; assertEquals ( STRING , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.test.web.client.match.FormHttpMessageConverter . read ( null , org.springframework.test.web.client.match.HttpInputMessage ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { HttpInputMessage org.springframework.test.web.client.match.HttpInputMessage = new HttpInputMessage ( ) { @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; return new java.io.ByteArrayInputStream ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsBytes ( ) ) ; } @ java.lang.Override public org.springframework.test.web.client.match.HttpHeaders org.springframework.test.web.client.match.HttpHeaders ( ) { return org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) ; } } ; FormHttpMessageConverter org.springframework.test.web.client.match.FormHttpMessageConverter = new FormHttpMessageConverter ( ) ; assertEquals ( STRING , org.springframework.test.web.client.match.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.test.web.client.match.FormHttpMessageConverter . read ( null , org.springframework.test.web.client.match.HttpInputMessage ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; return new java.io.ByteArrayInputStream ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsBytes ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.client.match.HttpHeaders org.springframework.test.web.client.match.HttpHeaders ( ) { return org.springframework.test.web.client.match.ClientHttpRequest . getHeaders ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final java.lang.String java.lang.String ) { return new org.springframework.test.web.client.match.ContentRequestMatchers.AbstractXmlRequestMatcher ( ) { @ java.lang.Override protected void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception { org.springframework.test.web.client.match.XmlExpectationsHelper . assertXmlEqual ( java.lang.String , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception { org.springframework.test.web.client.match.XmlExpectationsHelper . assertXmlEqual ( java.lang.String , org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final Matcher < ? super org.w3c.dom.Node > org.springframework.test.web.client.match.Matcher<? super org.w3c.dom.Node> ) { return new org.springframework.test.web.client.match.ContentRequestMatchers.AbstractXmlRequestMatcher ( ) { @ java.lang.Override protected void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception { org.springframework.test.web.client.match.XmlExpectationsHelper . assertNode ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) , org.springframework.test.web.client.match.Matcher<> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception { org.springframework.test.web.client.match.XmlExpectationsHelper . assertNode ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) , org.springframework.test.web.client.match.Matcher<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.match.RequestMatcher org.springframework.test.web.client.match.RequestMatcher ( final Matcher < ? super javax.xml.transform.Source > org.springframework.test.web.client.match.Matcher<? super javax.xml.transform.Source> ) { return new org.springframework.test.web.client.match.ContentRequestMatchers.AbstractXmlRequestMatcher ( ) { @ java.lang.Override protected void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception { org.springframework.test.web.client.match.XmlExpectationsHelper . assertSource ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) , org.springframework.test.web.client.match.Matcher<> ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception { org.springframework.test.web.client.match.XmlExpectationsHelper . assertSource ( org.springframework.test.web.client.match.MockClientHttpRequest . getBodyAsString ( ) , org.springframework.test.web.client.match.Matcher<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final void void ( ClientHttpRequest org.springframework.test.web.client.match.ClientHttpRequest ) throws java.io.IOException , java.lang.AssertionError { try { MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest = ( MockClientHttpRequest ) org.springframework.test.web.client.match.ClientHttpRequest ; void ( org.springframework.test.web.client.match.MockClientHttpRequest ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.AssertionError ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected abstract void void ( MockClientHttpRequest org.springframework.test.web.client.match.MockClientHttpRequest ) throws java.lang.Exception ;  <METHOD_END>
