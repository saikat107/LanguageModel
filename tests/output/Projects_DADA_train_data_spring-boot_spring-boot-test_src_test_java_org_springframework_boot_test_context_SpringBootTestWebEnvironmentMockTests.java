<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . int ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { WebApplicationContext org.springframework.boot.test.context.WebApplicationContext = WebApplicationContextUtils . getWebApplicationContext ( this . org.springframework.boot.test.context.ServletContext ) ; assertThat ( org.springframework.boot.test.context.WebApplicationContext ) . isSameAs ( this . org.springframework.boot.test.context.WebApplicationContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RequestAttributes org.springframework.boot.test.context.RequestAttributes = RequestContextHolder . getRequestAttributes ( ) ; assertThat ( org.springframework.boot.test.context.RequestAttributes ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( ReflectionTestUtils . getField ( this . org.springframework.boot.test.context.ServletContext , STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public static org.springframework.boot.test.context.PropertySourcesPlaceholderConfigurer org.springframework.boot.test.context.PropertySourcesPlaceholderConfigurer ( ) { return new PropertySourcesPlaceholderConfigurer ( ) ; }  <METHOD_END>
