<METHOD_START> @ Test public void void ( ) { new ServletContextApplicationContextInitializer ( this . org.springframework.boot.web.servlet.support.ServletContext ) . initialize ( this . org.springframework.boot.web.servlet.support.ConfigurableWebApplicationContext ) ; verify ( this . org.springframework.boot.web.servlet.support.ConfigurableWebApplicationContext ) . setServletContext ( this . org.springframework.boot.web.servlet.support.ServletContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new ServletContextApplicationContextInitializer ( this . org.springframework.boot.web.servlet.support.ServletContext ) . initialize ( this . org.springframework.boot.web.servlet.support.ConfigurableWebApplicationContext ) ; verify ( this . org.springframework.boot.web.servlet.support.ServletContext , times ( NUMBER ) ) . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , this . org.springframework.boot.web.servlet.support.ConfigurableWebApplicationContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new ServletContextApplicationContextInitializer ( this . org.springframework.boot.web.servlet.support.ServletContext , true ) . initialize ( this . org.springframework.boot.web.servlet.support.ConfigurableWebApplicationContext ) ; verify ( this . org.springframework.boot.web.servlet.support.ServletContext ) . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , this . org.springframework.boot.web.servlet.support.ConfigurableWebApplicationContext ) ; }  <METHOD_END>
