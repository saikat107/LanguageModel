<METHOD_START> @ Test public void void ( ) { org.springframework.test.web.servlet.setup.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.test.web.servlet.setup.ExpectedException . expectMessage ( equalTo ( STRING ) ) ; webAppContextSetup ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.test.web.servlet.setup.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.test.web.servlet.setup.ExpectedException . expectMessage ( equalTo ( STRING ) ) ; webAppContextSetup ( new StubWebApplicationContext ( null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StubWebApplicationContext org.springframework.test.web.servlet.setup.StubWebApplicationContext = new StubWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; this . org.springframework.test.web.servlet.setup.MockServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; DefaultMockMvcBuilder org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder = webAppContextSetup ( org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; assertSame ( org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . initWebAppContext ( ) , WebApplicationContextUtils . getRequiredWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StubWebApplicationContext org.springframework.test.web.servlet.setup.StubWebApplicationContext = new StubWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; this . org.springframework.test.web.servlet.setup.MockServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; StaticWebApplicationContext org.springframework.test.web.servlet.setup.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.test.web.servlet.setup.StaticWebApplicationContext . setParent ( org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; org.springframework.test.web.servlet.setup.StaticWebApplicationContext . setServletContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; DefaultMockMvcBuilder org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder = webAppContextSetup ( org.springframework.test.web.servlet.setup.StaticWebApplicationContext ) ; assertSame ( org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . initWebAppContext ( ) . getParent ( ) , WebApplicationContextUtils . getRequiredWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StubWebApplicationContext org.springframework.test.web.servlet.setup.StubWebApplicationContext = new StubWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; DefaultMockMvcBuilder org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder = webAppContextSetup ( org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; WebApplicationContext org.springframework.test.web.servlet.setup.WebApplicationContext = org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . initWebAppContext ( ) ; assertSame ( org.springframework.test.web.servlet.setup.StubWebApplicationContext , org.springframework.test.web.servlet.setup.WebApplicationContext ) ; assertSame ( org.springframework.test.web.servlet.setup.StubWebApplicationContext , WebApplicationContextUtils . getRequiredWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.test.web.servlet.setup.StaticApplicationContext = new StaticApplicationContext ( ) ; StaticWebApplicationContext org.springframework.test.web.servlet.setup.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.test.web.servlet.setup.StaticWebApplicationContext . setParent ( org.springframework.test.web.servlet.setup.StaticApplicationContext ) ; org.springframework.test.web.servlet.setup.StaticWebApplicationContext . setServletContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; StaticWebApplicationContext org.springframework.test.web.servlet.setup.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.test.web.servlet.setup.StaticWebApplicationContext . setParent ( org.springframework.test.web.servlet.setup.StaticWebApplicationContext ) ; org.springframework.test.web.servlet.setup.StaticWebApplicationContext . setServletContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; DefaultMockMvcBuilder org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder = webAppContextSetup ( org.springframework.test.web.servlet.setup.StaticWebApplicationContext ) ; WebApplicationContext org.springframework.test.web.servlet.setup.WebApplicationContext = org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . initWebAppContext ( ) ; assertSame ( org.springframework.test.web.servlet.setup.StaticWebApplicationContext , org.springframework.test.web.servlet.setup.WebApplicationContext ) ; assertSame ( org.springframework.test.web.servlet.setup.StaticWebApplicationContext , org.springframework.test.web.servlet.setup.WebApplicationContext . getParent ( ) ) ; assertSame ( org.springframework.test.web.servlet.setup.StaticApplicationContext , org.springframework.test.web.servlet.setup.WebApplicationContext . getParent ( ) . getParent ( ) ) ; assertSame ( org.springframework.test.web.servlet.setup.StaticWebApplicationContext , WebApplicationContextUtils . getRequiredWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StubWebApplicationContext org.springframework.test.web.servlet.setup.StubWebApplicationContext = new StubWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; DefaultMockMvcBuilder org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder = webAppContextSetup ( org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . addDispatcherServletCustomizer ( ds -> ds . setContextId ( STRING ) ) ; org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . dispatchOptions ( true ) ; MockMvc org.springframework.test.web.servlet.setup.MockMvc = org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . build ( ) ; DispatcherServlet org.springframework.test.web.servlet.setup.DispatcherServlet = ( DispatcherServlet ) new DirectFieldAccessor ( org.springframework.test.web.servlet.setup.MockMvc ) . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.test.web.servlet.setup.DispatcherServlet . getContextId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StubWebApplicationContext org.springframework.test.web.servlet.setup.StubWebApplicationContext = new StubWebApplicationContext ( this . org.springframework.test.web.servlet.setup.MockServletContext ) ; DefaultMockMvcBuilder org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder = webAppContextSetup ( org.springframework.test.web.servlet.setup.StubWebApplicationContext ) ; org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . addDispatcherServletCustomizer ( ds -> ds . setContextId ( STRING ) ) ; org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . addDispatcherServletCustomizer ( ds -> ds . setContextId ( STRING ) ) ; org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . dispatchOptions ( true ) ; MockMvc org.springframework.test.web.servlet.setup.MockMvc = org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder . build ( ) ; DispatcherServlet org.springframework.test.web.servlet.setup.DispatcherServlet = ( DispatcherServlet ) new DirectFieldAccessor ( org.springframework.test.web.servlet.setup.MockMvc ) . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.test.web.servlet.setup.DispatcherServlet . getContextId ( ) ) ; }  <METHOD_END>
