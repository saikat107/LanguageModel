<METHOD_START> @ java.lang.Override public void void ( ServletContext org.springframework.boot.load.it.war.ServletContext ) throws org.springframework.boot.load.it.war.ServletException { AnnotationConfigWebApplicationContext org.springframework.boot.load.it.war.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.load.it.war.AnnotationConfigWebApplicationContext . register ( SpringConfiguration .class ) ; org.springframework.boot.load.it.war.ServletContext . addServlet ( STRING , new DispatcherServlet ( org.springframework.boot.load.it.war.AnnotationConfigWebApplicationContext ) ) . addMapping ( STRING ) ; }  <METHOD_END>
