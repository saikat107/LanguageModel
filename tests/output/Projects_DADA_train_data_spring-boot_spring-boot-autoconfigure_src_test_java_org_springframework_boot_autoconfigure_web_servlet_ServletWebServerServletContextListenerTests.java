<METHOD_START> @ BeforeClass @ AfterClass public static void void ( ) { ReflectionTestUtils . setField ( TomcatURLStreamHandlerFactory .class , STRING , null ) ; ReflectionTestUtils . setField ( java.net.URL .class , STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.JettyConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.TomcatConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.UndertowConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.JettyConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.TomcatConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.UndertowConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { AnnotationConfigServletWebServerApplicationContext org.springframework.boot.autoconfigure.web.servlet.AnnotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.ServletContextListenerBeanConfiguration .class , java.lang.Class<> ) ; ServletContextListener org.springframework.boot.autoconfigure.web.servlet.ServletContextListener = org.springframework.boot.autoconfigure.web.servlet.AnnotationConfigServletWebServerApplicationContext . getBean ( STRING , ServletContextListener .class ) ; verify ( org.springframework.boot.autoconfigure.web.servlet.ServletContextListener ) . contextInitialized ( any ( ServletContextEvent .class ) ) ; org.springframework.boot.autoconfigure.web.servlet.AnnotationConfigServletWebServerApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { AnnotationConfigServletWebServerApplicationContext org.springframework.boot.autoconfigure.web.servlet.AnnotationConfigServletWebServerApplicationContext = new AnnotationConfigServletWebServerApplicationContext ( org.springframework.boot.autoconfigure.web.servlet.ServletWebServerServletContextListenerTests.ServletListenerRegistrationBeanConfiguration .class , java.lang.Class<> ) ; ServletContextListener org.springframework.boot.autoconfigure.web.servlet.ServletContextListener = ( ServletContextListener ) org.springframework.boot.autoconfigure.web.servlet.AnnotationConfigServletWebServerApplicationContext . getBean ( STRING , ServletListenerRegistrationBean .class ) . getListener ( ) ; verify ( org.springframework.boot.autoconfigure.web.servlet.ServletContextListener ) . contextInitialized ( any ( ServletContextEvent .class ) ) ; org.springframework.boot.autoconfigure.web.servlet.AnnotationConfigServletWebServerApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactory org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactory ( ) { return new TomcatServletWebServerFactory ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactory org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactory ( ) { return new JettyServletWebServerFactory ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactory org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactory ( ) { return new UndertowServletWebServerFactory ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.ServletContextListener org.springframework.boot.autoconfigure.web.servlet.ServletContextListener ( ) { return mock ( ServletContextListener .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.autoconfigure.web.servlet.ServletContextListener> < ServletContextListener > org.springframework.boot.autoconfigure.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.autoconfigure.web.servlet.ServletContextListener> ( ) { return new ServletListenerRegistrationBean <> ( mock ( ServletContextListener .class ) ) ; }  <METHOD_END>
