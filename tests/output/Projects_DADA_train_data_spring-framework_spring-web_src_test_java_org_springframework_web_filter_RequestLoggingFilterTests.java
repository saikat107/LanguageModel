<METHOD_START> @ Test public void void ( ) java.lang.Exception { final MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.MockHttpServletRequest . setQueryString ( STRING ) ; FilterChain org.springframework.web.filter.FilterChain = new org.springframework.web.filter.RequestLoggingFilterTests.NoOpFilterChain ( ) ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , org.springframework.web.filter.FilterChain ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; assertFalse ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; assertFalse ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . setIncludeQueryString ( true ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.MockHttpServletRequest . setQueryString ( STRING ) ; FilterChain org.springframework.web.filter.FilterChain = new org.springframework.web.filter.RequestLoggingFilterTests.NoOpFilterChain ( ) ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , org.springframework.web.filter.FilterChain ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . setIncludeQueryString ( true ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; FilterChain org.springframework.web.filter.FilterChain = new org.springframework.web.filter.RequestLoggingFilterTests.NoOpFilterChain ( ) ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , org.springframework.web.filter.FilterChain ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . setIncludePayload ( true ) ; final MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; final byte [] byte[] = STRING . byte[] ( STRING ) ; org.springframework.web.filter.MockHttpServletRequest . setContent ( byte[] ) ; FilterChain org.springframework.web.filter.FilterChain = new FilterChain ( ) { @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse )					throws java.io.IOException , org.springframework.web.filter.ServletException { ( ( HttpServletResponse ) org.springframework.web.filter.ServletResponse ) . setStatus ( HttpServletResponse . SC_OK ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.filter.ServletRequest . getInputStream ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; } } ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , org.springframework.web.filter.FilterChain ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse )					throws java.io.IOException , org.springframework.web.filter.ServletException { ( ( HttpServletResponse ) org.springframework.web.filter.ServletResponse ) . setStatus ( HttpServletResponse . SC_OK ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.filter.ServletRequest . getInputStream ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . setIncludePayload ( true ) ; final MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; final java.lang.String java.lang.String = STRING ; org.springframework.web.filter.MockHttpServletRequest . setContent ( java.lang.String . byte[] ( STRING ) ) ; FilterChain org.springframework.web.filter.FilterChain = new FilterChain ( ) { @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse )					throws java.io.IOException , org.springframework.web.filter.ServletException { ( ( HttpServletResponse ) org.springframework.web.filter.ServletResponse ) . setStatus ( HttpServletResponse . SC_OK ) ; java.lang.String java.lang.String = FileCopyUtils . copyToString ( org.springframework.web.filter.ServletRequest . getReader ( ) ) ; assertEquals ( java.lang.String , java.lang.String ) ; } } ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , org.springframework.web.filter.FilterChain ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse )					throws java.io.IOException , org.springframework.web.filter.ServletException { ( ( HttpServletResponse ) org.springframework.web.filter.ServletResponse ) . setStatus ( HttpServletResponse . SC_OK ) ; java.lang.String java.lang.String = FileCopyUtils . copyToString ( org.springframework.web.filter.ServletRequest . getReader ( ) ) ; assertEquals ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . setIncludePayload ( true ) ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . setMaxPayloadLength ( NUMBER ) ; final MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; final byte [] byte[] = STRING . byte[] ( STRING ) ; org.springframework.web.filter.MockHttpServletRequest . setContent ( byte[] ) ; FilterChain org.springframework.web.filter.FilterChain = new FilterChain ( ) { @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse )					throws java.io.IOException , org.springframework.web.filter.ServletException { ( ( HttpServletResponse ) org.springframework.web.filter.ServletResponse ) . setStatus ( HttpServletResponse . SC_OK ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.filter.ServletRequest . getInputStream ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; ContentCachingRequestWrapper org.springframework.web.filter.ContentCachingRequestWrapper = WebUtils . getNativeRequest ( org.springframework.web.filter.ServletRequest , ContentCachingRequestWrapper .class ) ; assertArrayEquals ( STRING . byte[] ( STRING ) , org.springframework.web.filter.ContentCachingRequestWrapper . getContentAsByteArray ( ) ) ; } } ; org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , org.springframework.web.filter.FilterChain ) ; assertNotNull ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String ) ; assertTrue ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; assertFalse ( org.springframework.web.filter.RequestLoggingFilterTests.MyRequestLoggingFilter . java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse )					throws java.io.IOException , org.springframework.web.filter.ServletException { ( ( HttpServletResponse ) org.springframework.web.filter.ServletResponse ) . setStatus ( HttpServletResponse . SC_OK ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.web.filter.ServletRequest . getInputStream ( ) ) ; assertArrayEquals ( byte[] , byte[] ) ; ContentCachingRequestWrapper org.springframework.web.filter.ContentCachingRequestWrapper = WebUtils . getNativeRequest ( org.springframework.web.filter.ServletRequest , ContentCachingRequestWrapper .class ) ; assertArrayEquals ( STRING . byte[] ( STRING ) , org.springframework.web.filter.ContentCachingRequestWrapper . getContentAsByteArray ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse ) throws java.io.IOException , org.springframework.web.filter.ServletException {		}  <METHOD_END>