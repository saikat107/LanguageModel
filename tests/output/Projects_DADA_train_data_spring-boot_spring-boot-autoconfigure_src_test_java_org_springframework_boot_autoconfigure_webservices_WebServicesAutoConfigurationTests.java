<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext != null ) { this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( WebServicesAutoConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . getBeansOfType ( ServletRegistrationBean .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.webservices.ExpectedException . expect ( BeanCreationException .class ) ; this . org.springframework.boot.autoconfigure.webservices.ExpectedException . expectMessage ( STRING ) ; void ( WebServicesAutoConfiguration .class , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( WebServicesAutoConfiguration .class , STRING ) ; ServletRegistrationBean < ? > org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<?> = this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . getBean ( ServletRegistrationBean .class ) ; assertThat ( org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<> . getUrlMappings ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( WebServicesAutoConfiguration .class , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . getBeansOfType ( ServletRegistrationBean .class ) ) . hasSize ( NUMBER ) ; ServletRegistrationBean < ? > org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<?> = this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . getBean ( ServletRegistrationBean .class ) ; assertThat ( org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<> . getUrlMappings ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( WebServicesAutoConfiguration .class , STRING ) ; ServletRegistrationBean < ? > org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<?> = this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . getBean ( ServletRegistrationBean .class ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<> , STRING ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( WebServicesAutoConfiguration .class , STRING , STRING ) ; ServletRegistrationBean < ? > org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<?> = this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . getBean ( ServletRegistrationBean .class ) ; assertThat ( org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<> . getInitParameters ( ) ) . containsEntry ( STRING , STRING ) ; assertThat ( org.springframework.boot.autoconfigure.webservices.ServletRegistrationBean<> . getInitParameters ( ) ) . containsEntry ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigWebApplicationContext org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext , java.lang.String[] ) ; org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . register ( java.lang.Class<> ) ; org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext = org.springframework.boot.autoconfigure.webservices.AnnotationConfigWebApplicationContext ; }  <METHOD_END>
