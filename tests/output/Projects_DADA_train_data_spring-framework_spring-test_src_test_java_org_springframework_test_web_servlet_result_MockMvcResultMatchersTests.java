<METHOD_START> @ Test public void void ( ) java.lang.Exception { redirectedUrl ( STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { redirectedUrl ( STRING , NUMBER , NUMBER ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { redirectedUrlPattern ( STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.AssertionError .class ) public void void ( ) java.lang.Exception { redirectedUrlPattern ( STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { forwardedUrl ( STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { forwardedUrl ( STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { forwardedUrl ( STRING , NUMBER , NUMBER ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { forwardedUrlPattern ( STRING STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.AssertionError .class ) public void void ( ) java.lang.Exception { forwardedUrlPattern ( STRING ) . match ( org.springframework.test.web.servlet.result.StubMvcResult ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.result.StubMvcResult org.springframework.test.web.servlet.result.StubMvcResult ( java.lang.String java.lang.String ) throws java.lang.Exception { MockHttpServletResponse org.springframework.test.web.servlet.result.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.test.web.servlet.result.MockHttpServletResponse . sendRedirect ( java.lang.String ) ; StubMvcResult org.springframework.test.web.servlet.result.StubMvcResult = new StubMvcResult ( null , null , null , null , null , null , org.springframework.test.web.servlet.result.MockHttpServletResponse ) ; return org.springframework.test.web.servlet.result.StubMvcResult ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.result.StubMvcResult org.springframework.test.web.servlet.result.StubMvcResult ( java.lang.String java.lang.String ) { MockHttpServletResponse org.springframework.test.web.servlet.result.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.test.web.servlet.result.MockHttpServletResponse . setForwardedUrl ( java.lang.String ) ; StubMvcResult org.springframework.test.web.servlet.result.StubMvcResult = new StubMvcResult ( null , null , null , null , null , null , org.springframework.test.web.servlet.result.MockHttpServletResponse ) ; return org.springframework.test.web.servlet.result.StubMvcResult ; }  <METHOD_END>
