<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( org.springframework.web.filter.MockFilterConfig ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( org.springframework.web.filter.MockFilterConfig ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = new org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ( ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( new MockFilterConfig ( new MockServletContext ( ) ) ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { MockServletContext org.springframework.web.filter.MockServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.MockServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.MockServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( STRING ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( new MockFilterConfig ( org.springframework.web.filter.MockServletContext ) ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { MockServletContext org.springframework.web.filter.MockServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.MockServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( new MockFilterConfig ( org.springframework.web.filter.MockServletContext ) ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { MockServletContext org.springframework.web.filter.MockServletContext = new MockServletContext ( ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( STRING , null ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( new MockFilterConfig ( org.springframework.web.filter.MockServletContext ) ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( org.springframework.web.filter.ServletContext , STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( org.springframework.web.filter.MockFilterConfig ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( org.springframework.web.filter.MockFilterConfig ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( org.springframework.web.filter.MockFilterConfig ) ; assertEquals ( org.springframework.web.filter.MockFilterConfig , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertEquals ( org.springframework.web.filter.MockFilterConfig , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( STRING , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( STRING ) ; MockFilterConfig org.springframework.web.filter.MockFilterConfig = new MockFilterConfig ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.MockFilterConfig . addInitParameter ( STRING , STRING ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( ) ; org.springframework.web.filter.DelegatingFilterProxy . init ( org.springframework.web.filter.MockFilterConfig ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; java.lang.String java.lang.String = STRING ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( java.lang.String , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( java.lang.String ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( java.lang.String , org.springframework.web.filter.StaticWebApplicationContext ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.ServletContext . setAttribute ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( java.lang.String , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( java.lang.String , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( java.lang.String ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( java.lang.String ) ; org.springframework.web.filter.DelegatingFilterProxy . setContextAttribute ( java.lang.String ) ; org.springframework.web.filter.DelegatingFilterProxy . setServletContext ( org.springframework.web.filter.ServletContext ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.web.filter.ServletException , java.io.IOException { ServletContext org.springframework.web.filter.ServletContext = new MockServletContext ( ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.ServletContext . setAttribute ( STRING , org.springframework.web.filter.StaticWebApplicationContext ) ; StaticWebApplicationContext org.springframework.web.filter.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.filter.StaticWebApplicationContext . setServletContext ( org.springframework.web.filter.ServletContext ) ; java.lang.String java.lang.String = STRING ; org.springframework.web.filter.StaticWebApplicationContext . registerSingleton ( java.lang.String , org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter .class ) ; org.springframework.web.filter.StaticWebApplicationContext . refresh ( ) ; org.springframework.web.filter.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.filter.StaticWebApplicationContext ) ; org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter = ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter ) org.springframework.web.filter.StaticWebApplicationContext . getBean ( java.lang.String ) ; DelegatingFilterProxy org.springframework.web.filter.DelegatingFilterProxy = new DelegatingFilterProxy ( java.lang.String ) ; org.springframework.web.filter.DelegatingFilterProxy . setServletContext ( org.springframework.web.filter.ServletContext ) ; MockHttpServletRequest org.springframework.web.filter.MockHttpServletRequest = new MockHttpServletRequest ( ) ; MockHttpServletResponse org.springframework.web.filter.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.filter.DelegatingFilterProxy . doFilter ( org.springframework.web.filter.MockHttpServletRequest , org.springframework.web.filter.MockHttpServletResponse , null ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.web.filter.MockHttpServletRequest . getAttribute ( STRING ) ) ; org.springframework.web.filter.DelegatingFilterProxy . destroy ( ) ; assertNull ( org.springframework.web.filter.DelegatingFilterProxyTests.MockFilter . org.springframework.web.filter.FilterConfig ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( FilterConfig org.springframework.web.filter.FilterConfig ) throws org.springframework.web.filter.ServletException { this . org.springframework.web.filter.FilterConfig = org.springframework.web.filter.FilterConfig ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.filter.ServletRequest , ServletResponse org.springframework.web.filter.ServletResponse , FilterChain org.springframework.web.filter.FilterChain ) throws java.io.IOException , org.springframework.web.filter.ServletException { org.springframework.web.filter.ServletRequest . setAttribute ( STRING , java.lang.Boolean . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.web.filter.FilterConfig = null ; }  <METHOD_END>