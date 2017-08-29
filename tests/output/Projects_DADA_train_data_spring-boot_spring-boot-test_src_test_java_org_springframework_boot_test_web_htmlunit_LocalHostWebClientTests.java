<METHOD_START> public void ( ) { MockitoAnnotations . initMocks ( this ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.web.htmlunit.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.test.web.htmlunit.ExpectedException . expectMessage ( STRING ) ; new LocalHostWebClient ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockEnvironment org.springframework.boot.test.web.htmlunit.MockEnvironment = new MockEnvironment ( ) ; WebClient org.springframework.boot.test.web.htmlunit.WebClient = new LocalHostWebClient ( org.springframework.boot.test.web.htmlunit.MockEnvironment ) ; WebConnection org.springframework.boot.test.web.htmlunit.WebConnection = org.springframework.boot.test.web.htmlunit.WebConnection ( ) ; org.springframework.boot.test.web.htmlunit.WebClient . setWebConnection ( org.springframework.boot.test.web.htmlunit.WebConnection ) ; org.springframework.boot.test.web.htmlunit.WebClient . getPage ( STRING ) ; verify ( org.springframework.boot.test.web.htmlunit.WebConnection ) . getResponse ( this . org.springframework.boot.test.web.htmlunit.ArgumentCaptor<org.springframework.boot.test.web.htmlunit.WebRequest> . capture ( ) ) ; assertThat ( this . org.springframework.boot.test.web.htmlunit.ArgumentCaptor<org.springframework.boot.test.web.htmlunit.WebRequest> . getValue ( ) . getUrl ( ) ) . isEqualTo ( new java.net.URL ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockEnvironment org.springframework.boot.test.web.htmlunit.MockEnvironment = new MockEnvironment ( ) ; org.springframework.boot.test.web.htmlunit.MockEnvironment . setProperty ( STRING , STRING ) ; WebClient org.springframework.boot.test.web.htmlunit.WebClient = new LocalHostWebClient ( org.springframework.boot.test.web.htmlunit.MockEnvironment ) ; WebConnection org.springframework.boot.test.web.htmlunit.WebConnection = org.springframework.boot.test.web.htmlunit.WebConnection ( ) ; org.springframework.boot.test.web.htmlunit.WebClient . setWebConnection ( org.springframework.boot.test.web.htmlunit.WebConnection ) ; org.springframework.boot.test.web.htmlunit.WebClient . getPage ( STRING ) ; verify ( org.springframework.boot.test.web.htmlunit.WebConnection ) . getResponse ( this . org.springframework.boot.test.web.htmlunit.ArgumentCaptor<org.springframework.boot.test.web.htmlunit.WebRequest> . capture ( ) ) ; assertThat ( this . org.springframework.boot.test.web.htmlunit.ArgumentCaptor<org.springframework.boot.test.web.htmlunit.WebRequest> . getValue ( ) . getUrl ( ) ) . isEqualTo ( new java.net.URL ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.web.htmlunit.WebConnection org.springframework.boot.test.web.htmlunit.WebConnection ( ) java.net.MalformedURLException , java.io.IOException { WebConnection org.springframework.boot.test.web.htmlunit.WebConnection = mock ( WebConnection .class ) ; WebResponse org.springframework.boot.test.web.htmlunit.WebResponse = new StringWebResponse ( STRING , new java.net.URL ( STRING ) ) ; given ( org.springframework.boot.test.web.htmlunit.WebConnection . getResponse ( ( WebRequest ) any ( ) ) ) . willReturn ( org.springframework.boot.test.web.htmlunit.WebResponse ) ; return org.springframework.boot.test.web.htmlunit.WebConnection ; }  <METHOD_END>
