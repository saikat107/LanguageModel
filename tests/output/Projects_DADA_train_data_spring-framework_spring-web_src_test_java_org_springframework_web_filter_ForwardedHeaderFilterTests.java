<METHOD_START> @ Before @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; this . org.springframework.web.filter.MockHttpServletRequest . setScheme ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setServerName ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setServerPort ( NUMBER ) ; this . org.springframework.web.filter.MockFilterChain = new MockFilterChain ( new HttpServlet ( ) {} ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; assertEquals ( STRING , java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; assertEquals ( STRING , java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; assertEquals ( STRING , java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getContextPath ( ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getContextPath ( ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getContextPath ( ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getContextPath ( ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) { @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> = getHeaderNames ( ) ; while ( java.util.Enumeration<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = java.util.Enumeration<java.lang.String> . java.lang.String ( ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { return super. getHeader ( java.lang.String ) ; } } return null ; } } ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURI ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> = getHeaderNames ( ) ; while ( java.util.Enumeration<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = java.util.Enumeration<java.lang.String> . java.lang.String ( ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { return super. getHeader ( java.lang.String ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; void ( java.lang.String ) ; void ( java.lang.String ) ; void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.filter.ForwardedHeaderFilter . shouldNotFilter ( new MockHttpServletRequest ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( STRING , STRING ) ; this . org.springframework.web.filter.ForwardedHeaderFilter . doFilter ( this . org.springframework.web.filter.MockHttpServletRequest , new MockHttpServletResponse ( ) , this . org.springframework.web.filter.MockFilterChain ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = ( HttpServletRequest ) this . org.springframework.web.filter.MockFilterChain . getRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURL ( ) . toString ( ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getScheme ( ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getServerName ( ) ) ; assertEquals ( NUMBER , org.springframework.web.filter.HttpServletRequest . getServerPort ( ) ) ; assertTrue ( org.springframework.web.filter.HttpServletRequest . isSecure ( ) ) ; assertNull ( org.springframework.web.filter.HttpServletRequest . getHeader ( java.lang.String ) ) ; assertNull ( org.springframework.web.filter.HttpServletRequest . getHeader ( java.lang.String ) ) ; assertNull ( org.springframework.web.filter.HttpServletRequest . getHeader ( java.lang.String ) ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURL ( ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURL ( ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ( ) ; org.springframework.web.filter.HttpServletRequest . getRequestURL ( ) . append ( STRING ) ; assertEquals ( STRING , org.springframework.web.filter.HttpServletRequest . getRequestURL ( ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; java.lang.String java.lang.String = java.lang.String ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; java.lang.String java.lang.String = java.lang.String ( ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setContextPath ( STRING ) ; java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . setRequestURI ( STRING ) ; java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; assertEquals ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; assertEquals ( STRING + java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; this . org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; assertEquals ( STRING + java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( final java.lang.String java.lang.String ) throws org.springframework.web.filter.ServletException , java.io.IOException { MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = org.springframework.web.filter.MockHttpServletResponse ( this . org.springframework.web.filter.ForwardedHeaderFilter , new OncePerRequestFilter ( ) { @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , HttpServletResponse org.springframework.web.filter.HttpServletResponse , FilterChain org.springframework.web.filter.FilterChain )					throws org.springframework.web.filter.ServletException , java.io.IOException { org.springframework.web.filter.HttpServletResponse . sendRedirect ( java.lang.String ) ; } } ) ; return org.springframework.web.filter.MockHttpServletResponse . getRedirectedUrl ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , HttpServletResponse org.springframework.web.filter.HttpServletResponse , FilterChain org.springframework.web.filter.FilterChain )					throws org.springframework.web.filter.ServletException , java.io.IOException { org.springframework.web.filter.HttpServletResponse . sendRedirect ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.web.filter.MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse ( Filter ... org.springframework.web.filter.Filter[] ) throws org.springframework.web.filter.ServletException , java.io.IOException { MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; FilterChain org.springframework.web.filter.FilterChain = new MockFilterChain ( new HttpServlet ( ) {} , org.springframework.web.filter.Filter[] ) ; org.springframework.web.filter.FilterChain . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse ) ; return org.springframework.web.filter.MockHttpServletResponse ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) org.springframework.web.filter.ServletException , java.io.IOException { return org.springframework.web.filter.HttpServletRequest ( ) . getContextPath ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.filter.HttpServletRequest org.springframework.web.filter.HttpServletRequest ( ) org.springframework.web.filter.ServletException , java.io.IOException { MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.filter.ForwardedHeaderFilter . doFilterInternal ( this . org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , this . org.springframework.web.filter.MockFilterChain ) ; return ( HttpServletRequest ) this . org.springframework.web.filter.MockFilterChain . getRequest ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) throws org.springframework.web.filter.ServletException { MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.filter.MockHttpServletRequest . addHeader ( java.lang.String , STRING ) ; assertFalse ( this . org.springframework.web.filter.ForwardedHeaderFilter . shouldNotFilter ( org.springframework.web.filter.MockHttpServletRequest ) ) ; }  <METHOD_END>
