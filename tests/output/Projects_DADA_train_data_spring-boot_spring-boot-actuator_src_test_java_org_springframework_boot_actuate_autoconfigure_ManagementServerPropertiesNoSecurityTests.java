<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ManagementServerProperties org.springframework.boot.actuate.autoconfigure.ManagementServerProperties = org.springframework.boot.actuate.autoconfigure.ManagementServerProperties ( STRING ) ; assertThat ( org.springframework.boot.actuate.autoconfigure.ManagementServerProperties . getSecurity ( ) . isEnabled ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.autoconfigure.ManagementServerProperties org.springframework.boot.actuate.autoconfigure.ManagementServerProperties ( java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext , java.lang.String[] ) ; org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . register ( org.springframework.boot.actuate.autoconfigure.ManagementServerPropertiesNoSecurityTests.Config .class ) ; org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext = org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext ; return this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigApplicationContext . getBean ( ManagementServerProperties .class ) ; }  <METHOD_END>