<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.ServletConfiguration .class ) ; ServletContextInitializerBeans org.springframework.boot.web.servlet.ServletContextInitializerBeans = new ServletContextInitializerBeans ( this . org.springframework.boot.web.servlet.ConfigurableApplicationContext . getBeanFactory ( ) ) ; assertThat ( org.springframework.boot.web.servlet.ServletContextInitializerBeans . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.web.servlet.ServletContextInitializerBeans . iterator ( ) ) . hasOnlyElementsOfType ( org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestServlet .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.FilterConfiguration .class ) ; ServletContextInitializerBeans org.springframework.boot.web.servlet.ServletContextInitializerBeans = new ServletContextInitializerBeans ( this . org.springframework.boot.web.servlet.ConfigurableApplicationContext . getBeanFactory ( ) ) ; assertThat ( org.springframework.boot.web.servlet.ServletContextInitializerBeans . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.web.servlet.ServletContextInitializerBeans . iterator ( ) ) . hasOnlyElementsOfType ( org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestFilter .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.boot.web.servlet.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestServlet org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestServlet ( ) { return new org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestServlet ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestFilter org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestFilter ( ) { return new org.springframework.boot.web.servlet.ServletContextInitializerBeansTests.TestFilter ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletContext org.springframework.boot.web.servlet.ServletContext ) throws org.springframework.boot.web.servlet.ServletException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletContext org.springframework.boot.web.servlet.ServletContext ) throws org.springframework.boot.web.servlet.ServletException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( FilterConfig org.springframework.boot.web.servlet.FilterConfig ) throws org.springframework.boot.web.servlet.ServletException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.boot.web.servlet.ServletRequest , ServletResponse org.springframework.boot.web.servlet.ServletResponse , FilterChain org.springframework.boot.web.servlet.FilterChain ) throws java.io.IOException , org.springframework.boot.web.servlet.ServletException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
