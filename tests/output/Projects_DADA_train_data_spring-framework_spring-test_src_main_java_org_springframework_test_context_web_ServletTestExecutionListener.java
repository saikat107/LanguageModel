<METHOD_START> @ java.lang.Override public final int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.web.TestContext ) throws java.lang.Exception { void ( org.springframework.test.context.web.TestContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.web.TestContext ) throws java.lang.Exception { void ( org.springframework.test.context.web.TestContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.web.TestContext ) throws java.lang.Exception { if ( java.lang.Boolean . java.lang.Boolean . boolean ( org.springframework.test.context.web.TestContext . getAttribute ( java.lang.String ) ) ) { if ( org.springframework.test.context.web.Log . isDebugEnabled ( ) ) { org.springframework.test.context.web.Log . debug ( java.lang.String . java.lang.String ( STRING , org.springframework.test.context.web.TestContext ) ) ; } RequestContextHolder . resetRequestAttributes ( ) ; org.springframework.test.context.web.TestContext . setAttribute ( DependencyInjectionTestExecutionListener . REINJECT_DEPENDENCIES_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; } org.springframework.test.context.web.TestContext . removeAttribute ( java.lang.String ) ; org.springframework.test.context.web.TestContext . removeAttribute ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( TestContext org.springframework.test.context.web.TestContext ) { return ( java.lang.Boolean . java.lang.Boolean . boolean ( org.springframework.test.context.web.TestContext . getAttribute ( java.lang.String ) ) || AnnotatedElementUtils . hasAnnotation ( org.springframework.test.context.web.TestContext . getTestClass ( ) , WebAppConfiguration .class ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( TestContext org.springframework.test.context.web.TestContext ) { return java.lang.Boolean . java.lang.Boolean . boolean ( org.springframework.test.context.web.TestContext . getAttribute ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( TestContext org.springframework.test.context.web.TestContext ) { if ( ! boolean ( org.springframework.test.context.web.TestContext ) || boolean ( org.springframework.test.context.web.TestContext ) ) { return; } ApplicationContext org.springframework.test.context.web.ApplicationContext = org.springframework.test.context.web.TestContext . getApplicationContext ( ) ; if ( org.springframework.test.context.web.ApplicationContext instanceof WebApplicationContext ) { WebApplicationContext org.springframework.test.context.web.WebApplicationContext = ( WebApplicationContext ) org.springframework.test.context.web.ApplicationContext ; ServletContext org.springframework.test.context.web.ServletContext = org.springframework.test.context.web.WebApplicationContext . getServletContext ( ) ; Assert . state ( org.springframework.test.context.web.ServletContext instanceof MockServletContext , ( ) String . format ( STRING , testContext ) ) ; if ( org.springframework.test.context.web.Log . isDebugEnabled ( ) ) { org.springframework.test.context.web.Log . debug ( java.lang.String . java.lang.String ( STRING , org.springframework.test.context.web.TestContext ) ) ; } MockServletContext org.springframework.test.context.web.MockServletContext = ( MockServletContext ) org.springframework.test.context.web.ServletContext ; MockHttpServletRequest org.springframework.test.context.web.MockHttpServletRequest = new MockHttpServletRequest ( org.springframework.test.context.web.MockServletContext ) ; org.springframework.test.context.web.MockHttpServletRequest . setAttribute ( java.lang.String , java.lang.Boolean . java.lang.Boolean ) ; MockHttpServletResponse org.springframework.test.context.web.MockHttpServletResponse = new MockHttpServletResponse ( ) ; ServletWebRequest org.springframework.test.context.web.ServletWebRequest = new ServletWebRequest ( org.springframework.test.context.web.MockHttpServletRequest , org.springframework.test.context.web.MockHttpServletResponse ) ; RequestContextHolder . setRequestAttributes ( org.springframework.test.context.web.ServletWebRequest ) ; org.springframework.test.context.web.TestContext . setAttribute ( java.lang.String , java.lang.Boolean . java.lang.Boolean ) ; org.springframework.test.context.web.TestContext . setAttribute ( java.lang.String , java.lang.Boolean . java.lang.Boolean ) ; if ( org.springframework.test.context.web.WebApplicationContext instanceof ConfigurableApplicationContext ) { @ java.lang.SuppressWarnings ( STRING ) ConfigurableApplicationContext org.springframework.test.context.web.ConfigurableApplicationContext = ( ConfigurableApplicationContext ) org.springframework.test.context.web.WebApplicationContext ; ConfigurableListableBeanFactory org.springframework.test.context.web.ConfigurableListableBeanFactory = org.springframework.test.context.web.ConfigurableApplicationContext . getBeanFactory ( ) ; org.springframework.test.context.web.ConfigurableListableBeanFactory . registerResolvableDependency ( MockHttpServletResponse .class , org.springframework.test.context.web.MockHttpServletResponse ) ; org.springframework.test.context.web.ConfigurableListableBeanFactory . registerResolvableDependency ( ServletWebRequest .class , org.springframework.test.context.web.ServletWebRequest ) ; } } }  <METHOD_END>
