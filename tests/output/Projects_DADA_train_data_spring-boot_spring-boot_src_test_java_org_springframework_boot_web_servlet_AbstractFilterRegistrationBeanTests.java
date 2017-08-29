<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; given ( this . org.springframework.boot.web.servlet.ServletContext . addFilter ( anyString ( ) , ( Filter ) any ( ) ) ) . willReturn ( this . FilterRegistration.Dynamic ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext ) . addFilter ( eq ( STRING ) , org.springframework.boot.web.servlet.Filter ( ) ) ; verify ( this . FilterRegistration.Dynamic ) . setAsyncSupported ( true ) ; verify ( this . FilterRegistration.Dynamic ) . addMappingForUrlPatterns ( java.util.EnumSet . java.util.EnumSet ( DispatcherType . REQUEST ) , false , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setName ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setAsyncSupported ( false ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setInitParameters ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addInitParameter ( STRING , STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setUrlPatterns ( new java.util.LinkedHashSet <> ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addUrlPatterns ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setServletNames ( new java.util.LinkedHashSet <> ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addServletNames ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setServletRegistrationBeans ( java.util.Collections . java.util.Set ( org.springframework.boot.web.servlet.ServletRegistrationBean<?> ( STRING ) ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addServletRegistrationBeans ( org.springframework.boot.web.servlet.ServletRegistrationBean<?> ( STRING ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setMatchAfter ( true ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext ) . addFilter ( eq ( STRING ) , org.springframework.boot.web.servlet.Filter ( ) ) ; verify ( this . FilterRegistration.Dynamic ) . setAsyncSupported ( false ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; verify ( this . FilterRegistration.Dynamic ) . setInitParameters ( java.util.Map<java.lang.String,java.lang.String> ) ; verify ( this . FilterRegistration.Dynamic ) . addMappingForUrlPatterns ( java.util.EnumSet . java.util.EnumSet ( DispatcherType . REQUEST ) , true , STRING , STRING , STRING ) ; verify ( this . FilterRegistration.Dynamic ) . addMappingForServletNames ( java.util.EnumSet . java.util.EnumSet ( DispatcherType . REQUEST ) , true , STRING , STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setName ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext ) . addFilter ( eq ( STRING ) , org.springframework.boot.web.servlet.Filter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext ) . addFilter ( eq ( STRING ) , org.springframework.boot.web.servlet.Filter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setEnabled ( false ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . org.springframework.boot.web.servlet.ServletContext , times ( NUMBER ) ) . addFilter ( eq ( STRING ) , org.springframework.boot.web.servlet.Filter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setServletRegistrationBeans ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addServletRegistrationBeans ( ( ServletRegistrationBean [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( org.springframework.boot.web.servlet.ServletRegistrationBean<?> ( STRING ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setServletRegistrationBeans ( new java.util.LinkedHashSet<org.springframework.boot.web.servlet.ServletRegistrationBean<?>> < ServletRegistrationBean < ? > > ( java.util.Arrays . java.util.List ( org.springframework.boot.web.servlet.ServletRegistrationBean<?> ( STRING ) ) ) ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . FilterRegistration.Dynamic ) . addMappingForServletNames ( java.util.EnumSet . java.util.EnumSet ( DispatcherType . REQUEST ) , false , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addInitParameter ( STRING , STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . getInitParameters ( ) . put ( STRING , STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . FilterRegistration.Dynamic ) . setInitParameters ( java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setUrlPatterns ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addUrlPatterns ( ( java.lang.String [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setServletNames ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; this . org.springframework.boot.web.servlet.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.web.servlet.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . addServletNames ( ( java.lang.String [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setDispatcherTypes ( DispatcherType . INCLUDE , DispatcherType . FORWARD ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . FilterRegistration.Dynamic ) . addMappingForUrlPatterns ( java.util.EnumSet . java.util.EnumSet ( DispatcherType . INCLUDE , DispatcherType . FORWARD ) , false , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractFilterRegistrationBean < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> = org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( ) ; java.util.EnumSet<org.springframework.boot.web.servlet.DispatcherType> < DispatcherType > java.util.EnumSet<org.springframework.boot.web.servlet.DispatcherType> = java.util.EnumSet . java.util.EnumSet ( DispatcherType . INCLUDE , DispatcherType . FORWARD ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . setDispatcherTypes ( java.util.EnumSet<org.springframework.boot.web.servlet.DispatcherType> ) ; org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<> . onStartup ( this . org.springframework.boot.web.servlet.ServletContext ) ; verify ( this . FilterRegistration.Dynamic ) . addMappingForUrlPatterns ( java.util.EnumSet<org.springframework.boot.web.servlet.DispatcherType> , false , STRING ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.boot.web.servlet.Filter org.springframework.boot.web.servlet.Filter ( )  <METHOD_END>
<METHOD_START> protected abstract org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> < ? > org.springframework.boot.web.servlet.AbstractFilterRegistrationBean<?> ( org.springframework.boot.web.servlet.ServletRegistrationBean<?> < ? > ... org.springframework.boot.web.servlet.ServletRegistrationBean<?>[] );  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.web.servlet.ServletRegistrationBean<?> < ? > org.springframework.boot.web.servlet.ServletRegistrationBean<?> ( java.lang.String java.lang.String ) { ServletRegistrationBean < ? > org.springframework.boot.web.servlet.ServletRegistrationBean<?> = new ServletRegistrationBean <> ( ) ; org.springframework.boot.web.servlet.ServletRegistrationBean<> . setName ( java.lang.String ) ; return org.springframework.boot.web.servlet.ServletRegistrationBean<> ; }  <METHOD_END>
