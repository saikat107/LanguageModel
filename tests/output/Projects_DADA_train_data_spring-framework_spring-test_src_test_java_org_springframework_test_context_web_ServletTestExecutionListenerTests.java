<METHOD_START> @ Before public void void ( ) { given ( org.springframework.test.context.web.WebApplicationContext . getServletContext ( ) ) . willReturn ( org.springframework.test.context.web.MockServletContext ) ; given ( org.springframework.test.context.web.TestContext . getApplicationContext ( ) ) . willReturn ( org.springframework.test.context.web.WebApplicationContext ) ; MockHttpServletRequest org.springframework.test.context.web.MockHttpServletRequest = new MockHttpServletRequest ( org.springframework.test.context.web.MockServletContext ) ; MockHttpServletResponse org.springframework.test.context.web.MockHttpServletResponse = new MockHttpServletResponse ( ) ; ServletWebRequest org.springframework.test.context.web.ServletWebRequest = new ServletWebRequest ( org.springframework.test.context.web.MockHttpServletRequest , org.springframework.test.context.web.MockHttpServletResponse ) ; org.springframework.test.context.web.MockHttpServletRequest . setAttribute ( java.lang.String , STRING ) ; RequestContextHolder . setRequestAttributes ( org.springframework.test.context.web.ServletWebRequest ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BDDMockito .< java.lang.Class<?> < ? > > given ( org.springframework.test.context.web.TestContext . getTestClass ( ) ) . willReturn ( java.lang.Class<? extends org.springframework.test.context.web.ServletTestExecutionListenerTests> ( ) ) ; given ( org.springframework.test.context.web.TestContext . getApplicationContext ( ) ) . willReturn ( mock ( ApplicationContext .class ) ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestClass ( org.springframework.test.context.web.TestContext ) ; void ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . prepareTestInstance ( org.springframework.test.context.web.TestContext ) ; void ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestMethod ( org.springframework.test.context.web.TestContext ) ; void ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . afterTestMethod ( org.springframework.test.context.web.TestContext ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BDDMockito .< java.lang.Class<?> < ? > > given ( org.springframework.test.context.web.TestContext . getTestClass ( ) ) . willReturn ( org.springframework.test.context.web.ServletTestExecutionListenerTests.LegacyWebTestCase .class ) ; RequestContextHolder . resetRequestAttributes ( ) ; void ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestClass ( org.springframework.test.context.web.TestContext ) ; org.springframework.test.context.web.ServletTestExecutionListener . prepareTestInstance ( org.springframework.test.context.web.TestContext ) ; void ( ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; given ( org.springframework.test.context.web.TestContext . getAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ) . willReturn ( null ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestMethod ( org.springframework.test.context.web.TestContext ) ; void ( ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; org.springframework.test.context.web.ServletTestExecutionListener . afterTestMethod ( org.springframework.test.context.web.TestContext ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . removeAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BDDMockito .< java.lang.Class<?> < ? > > given ( org.springframework.test.context.web.TestContext . getTestClass ( ) ) . willReturn ( org.springframework.test.context.web.ServletTestExecutionListenerTests.LegacyWebTestCase .class ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestClass ( org.springframework.test.context.web.TestContext ) ; void ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . prepareTestInstance ( org.springframework.test.context.web.TestContext ) ; void ( ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; given ( org.springframework.test.context.web.TestContext . getAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ) . willReturn ( null ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestMethod ( org.springframework.test.context.web.TestContext ) ; void ( ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; given ( org.springframework.test.context.web.TestContext . getAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ) . willReturn ( null ) ; org.springframework.test.context.web.ServletTestExecutionListener . afterTestMethod ( org.springframework.test.context.web.TestContext ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . removeAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BDDMockito .< java.lang.Class<?> < ? > > given ( org.springframework.test.context.web.TestContext . getTestClass ( ) ) . willReturn ( org.springframework.test.context.web.ServletTestExecutionListenerTests.AtWebAppConfigWebTestCase .class ) ; RequestContextHolder . resetRequestAttributes ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestClass ( org.springframework.test.context.web.TestContext ) ; void ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BDDMockito .< java.lang.Class<?> < ? > > given ( org.springframework.test.context.web.TestContext . getTestClass ( ) ) . willReturn ( org.springframework.test.context.web.ServletTestExecutionListenerTests.AtWebAppConfigWebTestCase .class ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestClass ( org.springframework.test.context.web.TestContext ) ; org.springframework.test.context.web.RequestAttributes ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BDDMockito .< java.lang.Class<?> < ? > > given ( org.springframework.test.context.web.TestContext . getTestClass ( ) ) . willReturn ( org.springframework.test.context.web.ServletTestExecutionListenerTests.NoAtWebAppConfigWebTestCase .class ) ; given ( org.springframework.test.context.web.TestContext . getAttribute ( ServletTestExecutionListener . ACTIVATE_LISTENER ) ) . willReturn ( true ) ; RequestContextHolder . resetRequestAttributes ( ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestClass ( org.springframework.test.context.web.TestContext ) ; void ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.context.web.RequestAttributes org.springframework.test.context.web.RequestAttributes ( ) { RequestAttributes org.springframework.test.context.web.RequestAttributes = RequestContextHolder . getRequestAttributes ( ) ; assertNotNull ( STRING , org.springframework.test.context.web.RequestAttributes ) ; return org.springframework.test.context.web.RequestAttributes ; }  <METHOD_END>
<METHOD_START> private void void ( ) { assertNull ( STRING , RequestContextHolder . getRequestAttributes ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { RequestAttributes org.springframework.test.context.web.RequestAttributes = org.springframework.test.context.web.RequestAttributes ( ) ; java.lang.Object java.lang.Object = org.springframework.test.context.web.RequestAttributes . getAttribute ( java.lang.String , RequestAttributes . SCOPE_REQUEST ) ; assertNotNull ( java.lang.String + STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { RequestAttributes org.springframework.test.context.web.RequestAttributes = org.springframework.test.context.web.RequestAttributes ( ) ; java.lang.Object java.lang.Object = org.springframework.test.context.web.RequestAttributes . getAttribute ( java.lang.String , RequestAttributes . SCOPE_REQUEST ) ; assertNull ( java.lang.String + STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) java.lang.Exception { org.springframework.test.context.web.ServletTestExecutionListener . prepareTestInstance ( org.springframework.test.context.web.TestContext ) ; org.springframework.test.context.web.RequestAttributes ( ) ; void ( ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( POPULATED_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; given ( org.springframework.test.context.web.TestContext . getAttribute ( POPULATED_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ) . willReturn ( java.lang.Boolean . java.lang.Boolean ) ; given ( org.springframework.test.context.web.TestContext . getAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ) . willReturn ( java.lang.Boolean . java.lang.Boolean ) ; org.springframework.test.context.web.ServletTestExecutionListener . beforeTestMethod ( org.springframework.test.context.web.TestContext ) ; org.springframework.test.context.web.RequestAttributes ( ) ; void ( ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( POPULATED_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; verify ( org.springframework.test.context.web.TestContext , times ( NUMBER ) ) . setAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; org.springframework.test.context.web.ServletTestExecutionListener . afterTestMethod ( org.springframework.test.context.web.TestContext ) ; verify ( org.springframework.test.context.web.TestContext ) . removeAttribute ( POPULATED_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ; verify ( org.springframework.test.context.web.TestContext ) . removeAttribute ( RESET_REQUEST_CONTEXT_HOLDER_ATTRIBUTE ) ; void ( ) ; }  <METHOD_END>