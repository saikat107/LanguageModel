<METHOD_START> @ Before public void void ( ) { this . org.springframework.test.web.servlet.htmlunit.MockMvc = MockMvcBuilders . standaloneSetup ( new HelloController ( ) , new ForwardController ( ) ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { this . org.springframework.test.web.servlet.htmlunit.WebClient . setWebConnection ( new MockMvcWebConnection ( this . org.springframework.test.web.servlet.htmlunit.MockMvc , this . org.springframework.test.web.servlet.htmlunit.WebClient ) ) ; Page org.springframework.test.web.servlet.htmlunit.Page = this . org.springframework.test.web.servlet.htmlunit.WebClient . getPage ( STRING ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.Page . getWebResponse ( ) . getStatusCode ( ) , equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { this . org.springframework.test.web.servlet.htmlunit.WebClient . setWebConnection ( new MockMvcWebConnection ( this . org.springframework.test.web.servlet.htmlunit.MockMvc , this . org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ) ; Page org.springframework.test.web.servlet.htmlunit.Page = this . org.springframework.test.web.servlet.htmlunit.WebClient . getPage ( STRING ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.Page . getWebResponse ( ) . getStatusCode ( ) , equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { this . org.springframework.test.web.servlet.htmlunit.WebClient . setWebConnection ( new MockMvcWebConnection ( this . org.springframework.test.web.servlet.htmlunit.MockMvc , this . org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ) ; Page org.springframework.test.web.servlet.htmlunit.Page = this . org.springframework.test.web.servlet.htmlunit.WebClient . getPage ( STRING ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.Page . getWebResponse ( ) . getStatusCode ( ) , equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { this . org.springframework.test.web.servlet.htmlunit.WebClient . setWebConnection ( new MockMvcWebConnection ( this . org.springframework.test.web.servlet.htmlunit.MockMvc , this . org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ) ; Page org.springframework.test.web.servlet.htmlunit.Page = this . org.springframework.test.web.servlet.htmlunit.WebClient . getPage ( STRING ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.Page . getWebResponse ( ) . getContentAsString ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.io.IOException { new MockMvcWebConnection ( this . org.springframework.test.web.servlet.htmlunit.MockMvc , this . org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.io.IOException { new MockMvcWebConnection ( this . org.springframework.test.web.servlet.htmlunit.MockMvc , this . org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ; }  <METHOD_END>