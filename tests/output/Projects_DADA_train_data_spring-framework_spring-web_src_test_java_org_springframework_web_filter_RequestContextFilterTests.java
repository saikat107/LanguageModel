<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new ServletException ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( final ServletException org.springframework.web.filter.ServletException ) throws java.lang.Exception { final MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.filter.MockHttpServletRequest . setAttribute ( STRING , STRING ) ; final MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; class DummyFilterChain implements FilterChain { public int int = NUMBER ; @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse ) throws java.io.IOException , org.springframework.web.filter.ServletException { ++ int ; if ( int == NUMBER ) { assertSame ( STRING , RequestContextHolder . currentRequestAttributes ( ) . getAttribute ( STRING , RequestAttributes . SCOPE_REQUEST ) ) ; if ( org.springframework.web.filter.ServletException != null ) { throw org.springframework.web.filter.ServletException ; } } else { throw new java.lang.IllegalStateException ( STRING ) ; } } } ; DummyFilterChain fc = new DummyFilterChain ( ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( new MockServletContext ( ) , STRING ) ; RequestContextFilter org.springframework.web.filter.RequestContextFilter = new RequestContextFilter ( ) ; org.springframework.web.filter.RequestContextFilter . init ( org.springframework.web.filter.MockFilterConfig ) ; try { org.springframework.web.filter.RequestContextFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , fc ) ; if ( org.springframework.web.filter.ServletException != null ) { fail ( ) ; } } catch ( ServletException org.springframework.web.filter.ServletException ) { assertNotNull ( org.springframework.web.filter.ServletException ) ; } try { RequestContextHolder . currentRequestAttributes ( ) ; fail ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } assertEquals ( NUMBER , fc . int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse ) throws java.io.IOException , org.springframework.web.filter.ServletException { ++ int ; if ( int == NUMBER ) { assertSame ( STRING , RequestContextHolder . currentRequestAttributes ( ) . getAttribute ( STRING , RequestAttributes . SCOPE_REQUEST ) ) ; if ( org.springframework.web.filter.ServletException != null ) { throw org.springframework.web.filter.ServletException ; } } else { throw new java.lang.IllegalStateException ( STRING ) ; } }  <METHOD_END>
