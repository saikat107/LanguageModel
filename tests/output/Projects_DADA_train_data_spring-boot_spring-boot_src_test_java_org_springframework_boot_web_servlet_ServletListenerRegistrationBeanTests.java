<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServletListenerRegistrationBean < ServletContextListener > org.springframework.boot.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.web.servlet.ServletContextListener> = new ServletListenerRegistrationBean <> ( this . org.springframework.boot.web.servlet.ServletContextListener ) ; org.springframework.boot.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.web.servlet.ServletContextListener> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext ) . addListener ( this . org.springframework.boot.web.servlet.ServletContextListener ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServletListenerRegistrationBean < ServletContextListener > org.springframework.boot.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.web.servlet.ServletContextListener> = new ServletListenerRegistrationBean <> ( this . org.springframework.boot.web.servlet.ServletContextListener ) ; org.springframework.boot.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.web.servlet.ServletContextListener> . setEnabled ( false ) ; org.springframework.boot.web.servlet.ServletListenerRegistrationBean<org.springframework.boot.web.servlet.ServletContextListener> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext , times ( NUMBER ) ) . addListener ( any ( ServletContextListener .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; new ServletListenerRegistrationBean < java.util.EventListener > ( new java.util.EventListener ( ) {		} ) ; }  <METHOD_END>