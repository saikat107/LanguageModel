<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.ConfigurableApplicationContext != null ) { this . org.springframework.boot.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.ConfigurableApplicationContext = SpringApplication . run ( new java.lang.Object [] { org.springframework.boot.OverrideSourcesTests.MainConfiguration .class } , new java.lang.String [] { STRING } ) ; assertThat ( this . org.springframework.boot.ConfigurableApplicationContext . getBean ( org.springframework.boot.OverrideSourcesTests.Service .class ) . bean . name ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.ConfigurableApplicationContext = SpringApplication . run ( new java.lang.Object [] { org.springframework.boot.OverrideSourcesTests.MainConfiguration .class , org.springframework.boot.OverrideSourcesTests.TestConfiguration .class } , new java.lang.String [] { STRING , STRING } ) ; assertThat ( this . org.springframework.boot.ConfigurableApplicationContext . getBean ( org.springframework.boot.OverrideSourcesTests.Service .class ) . bean . name ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Primary public org.springframework.boot.OverrideSourcesTests.TestBean org.springframework.boot.OverrideSourcesTests.TestBean ( ) { return new org.springframework.boot.OverrideSourcesTests.TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.OverrideSourcesTests.TestBean org.springframework.boot.OverrideSourcesTests.TestBean ( ) { return new org.springframework.boot.OverrideSourcesTests.TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.OverrideSourcesTests.Service org.springframework.boot.OverrideSourcesTests.Service ( ) { return new org.springframework.boot.OverrideSourcesTests.Service ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
