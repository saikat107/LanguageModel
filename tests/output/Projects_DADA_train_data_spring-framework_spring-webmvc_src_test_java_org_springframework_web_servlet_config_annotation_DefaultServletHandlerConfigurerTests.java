<METHOD_START> @ Before public void void ( ) { org.springframework.web.servlet.config.annotation.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurerTests.DispatchingMockServletContext = new org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurerTests.DispatchingMockServletContext ( ) ; org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer = new DefaultServletHandlerConfigurer ( org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurerTests.DispatchingMockServletContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNull ( org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer . getHandlerMapping ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer . enable ( ) ; SimpleUrlHandlerMapping org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping = org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping ( ) ; SimpleUrlHandlerMapping org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping = org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping ; DefaultServletHttpRequestHandler org.springframework.web.servlet.config.annotation.DefaultServletHttpRequestHandler = ( DefaultServletHttpRequestHandler ) org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping . getUrlMap ( ) . get ( STRING ) ; assertNotNull ( org.springframework.web.servlet.config.annotation.DefaultServletHttpRequestHandler ) ; assertEquals ( java.lang.Integer . int , org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping . getOrder ( ) ) ; org.springframework.web.servlet.config.annotation.DefaultServletHttpRequestHandler . handleRequest ( new MockHttpServletRequest ( ) , org.springframework.web.servlet.config.annotation.MockHttpServletResponse ) ; java.lang.String java.lang.String = STRING ; assertEquals ( STRING , java.lang.String , org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurerTests.DispatchingMockServletContext . java.lang.String ) ; assertEquals ( STRING , java.lang.String , org.springframework.web.servlet.config.annotation.MockHttpServletResponse . getForwardedUrl ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer . enable ( STRING ) ; SimpleUrlHandlerMapping org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping = org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping ( ) ; DefaultServletHttpRequestHandler org.springframework.web.servlet.config.annotation.DefaultServletHttpRequestHandler = ( DefaultServletHttpRequestHandler ) org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping . getUrlMap ( ) . get ( STRING ) ; assertNotNull ( org.springframework.web.servlet.config.annotation.DefaultServletHttpRequestHandler ) ; assertEquals ( java.lang.Integer . int , org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping . getOrder ( ) ) ; org.springframework.web.servlet.config.annotation.DefaultServletHttpRequestHandler . handleRequest ( new MockHttpServletRequest ( ) , org.springframework.web.servlet.config.annotation.MockHttpServletResponse ) ; java.lang.String java.lang.String = STRING ; assertEquals ( STRING , java.lang.String , org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurerTests.DispatchingMockServletContext . java.lang.String ) ; assertEquals ( STRING , java.lang.String , org.springframework.web.servlet.config.annotation.MockHttpServletResponse . getForwardedUrl ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.config.annotation.RequestDispatcher org.springframework.web.servlet.config.annotation.RequestDispatcher ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; return new MockRequestDispatcher ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping org.springframework.web.servlet.config.annotation.SimpleUrlHandlerMapping ( ) { return ( SimpleUrlHandlerMapping ) org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer . getHandlerMapping ( ) ; }  <METHOD_END>
