<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.ConfigurableApplicationContext != null ) { this . org.springframework.boot.autoconfigure.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SpringApplication org.springframework.boot.autoconfigure.SpringApplication = new SpringApplication ( org.springframework.boot.autoconfigure.AutoConfigurationReproTests.EarlyInitConfig .class , PropertySourcesPlaceholderConfigurer .class , ServletWebServerFactoryAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.ConfigurableApplicationContext = org.springframework.boot.autoconfigure.SpringApplication . run ( STRING ) ; java.lang.String java.lang.String = ( java.lang.String ) this . org.springframework.boot.autoconfigure.ConfigurableApplicationContext . getBean ( STRING ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
