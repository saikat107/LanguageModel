<METHOD_START> @ Before public void void ( ) { this . sample.MockHttpServletRequest = new MockHttpServletRequest ( ) ; this . sample.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . sample.MockFilterChain = new MockFilterChain ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . sample.FilterChainProxy . doFilter ( this . sample.MockHttpServletRequest , this . sample.MockHttpServletResponse , this . sample.MockFilterChain ) ; assertThat ( this . sample.MockHttpServletResponse . getStatus ( ) ) . isEqualTo ( HttpServletResponse . SC_UNAUTHORIZED ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . sample.MockHttpServletRequest . addHeader ( STRING , STRING + new java.lang.String ( Base64 . encode ( STRING . byte[] ( STRING ) ) ) ) ; this . sample.FilterChainProxy . doFilter ( this . sample.MockHttpServletRequest , this . sample.MockHttpServletResponse , this . sample.MockFilterChain ) ; assertThat ( this . sample.MockHttpServletResponse . getStatus ( ) ) . isEqualTo ( HttpServletResponse . SC_OK ) ; }  <METHOD_END>
