<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { Server org.springframework.boot.load.it.jar.Server = new Server ( NUMBER ) ; ServletContextHandler org.springframework.boot.load.it.jar.ServletContextHandler = new ServletContextHandler ( ServletContextHandler . SESSIONS ) ; org.springframework.boot.load.it.jar.ServletContextHandler . setContextPath ( STRING ) ; org.springframework.boot.load.it.jar.Server . setHandler ( org.springframework.boot.load.it.jar.ServletContextHandler ) ; AnnotationConfigWebApplicationContext org.springframework.boot.load.it.jar.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.load.it.jar.AnnotationConfigWebApplicationContext . register ( SpringConfiguration .class ) ; DispatcherServlet org.springframework.boot.load.it.jar.DispatcherServlet = new DispatcherServlet ( org.springframework.boot.load.it.jar.AnnotationConfigWebApplicationContext ) ; org.springframework.boot.load.it.jar.ServletContextHandler . addServlet ( new ServletHolder ( org.springframework.boot.load.it.jar.DispatcherServlet ) , STRING ) ; org.springframework.boot.load.it.jar.Server . start ( ) ; org.springframework.boot.load.it.jar.Server . join ( ) ; }  <METHOD_END>
