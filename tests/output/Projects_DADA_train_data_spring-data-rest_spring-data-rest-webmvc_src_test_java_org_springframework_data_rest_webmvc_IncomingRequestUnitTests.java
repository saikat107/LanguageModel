<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.rest.webmvc.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.webmvc.MockHttpServletRequest . addHeader ( STRING , STRING ) ; IncomingRequest org.springframework.data.rest.webmvc.IncomingRequest = new IncomingRequest ( new ServletServerHttpRequest ( org.springframework.data.rest.webmvc.MockHttpServletRequest ) ) ; assertThat ( org.springframework.data.rest.webmvc.IncomingRequest . isJsonPatchRequest ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.webmvc.IncomingRequest . isJsonMergePatchRequest ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.webmvc.MockHttpServletRequest . addHeader ( STRING , STRING ) ; IncomingRequest org.springframework.data.rest.webmvc.IncomingRequest = new IncomingRequest ( new ServletServerHttpRequest ( org.springframework.data.rest.webmvc.MockHttpServletRequest ) ) ; assertThat ( org.springframework.data.rest.webmvc.IncomingRequest . isJsonPatchRequest ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.rest.webmvc.IncomingRequest . isJsonMergePatchRequest ( ) ) . isTrue ( ) ; }  <METHOD_END>
