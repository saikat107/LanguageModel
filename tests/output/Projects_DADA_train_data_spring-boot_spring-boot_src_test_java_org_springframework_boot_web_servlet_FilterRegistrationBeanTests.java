<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterRegistrationBean < Filter > org.springframework.boot.web.servlet.FilterRegistrationBean<org.springframework.boot.web.servlet.Filter> = new FilterRegistrationBean <> ( ) ; org.springframework.boot.web.servlet.FilterRegistrationBean<org.springframework.boot.web.servlet.Filter> . setFilter ( this . org.springframework.boot.web.servlet.MockFilter ) ; org.springframework.boot.web.servlet.FilterRegistrationBean<org.springframework.boot.web.servlet.Filter> . onStartup ( this . servletContext ) ; verify ( this . servletContext ) . addFilter ( STRING , this . org.springframework.boot.web.servlet.MockFilter ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FilterRegistrationBean < Filter > org.springframework.boot.web.servlet.FilterRegistrationBean<org.springframework.boot.web.servlet.Filter> = new FilterRegistrationBean <> ( ) ; this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.FilterRegistrationBean<org.springframework.boot.web.servlet.Filter> . onStartup ( this . servletContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; new FilterRegistrationBean <> ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; new FilterRegistrationBean <> ( this . org.springframework.boot.web.servlet.MockFilter , ( ServletRegistrationBean [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<org.springframework.boot.web.servlet.MockFilter> < MockFilter > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<org.springframework.boot.web.servlet.MockFilter> ( org.springframework.boot.web.servlet.ServletRegistrationBean<?> < ? > ... org.springframework.boot.web.servlet.ServletRegistrationBean<?>[] ) { return new FilterRegistrationBean <> ( this . org.springframework.boot.web.servlet.MockFilter , org.springframework.boot.web.servlet.ServletRegistrationBean<?>[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.web.servlet.Filter org.springframework.boot.web.servlet.Filter ( ) { return eq ( this . org.springframework.boot.web.servlet.MockFilter ) ; }  <METHOD_END>
