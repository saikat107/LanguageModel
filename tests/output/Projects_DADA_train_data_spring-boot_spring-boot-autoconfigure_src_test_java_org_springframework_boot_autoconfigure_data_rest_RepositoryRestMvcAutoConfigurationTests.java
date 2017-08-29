<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext != null ) { this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestMvcConfiguration .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfiguration .class , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestMvcConfiguration .class ) ) . isNotNull ( ) ; RepositoryRestConfiguration org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestConfiguration .class ) ; java.net.URI java.net.URI = java.net.URI . java.net.URI ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getBaseUri ( ) ) . as ( STRING ) . isEqualTo ( java.net.URI ) ; BaseUri org.springframework.boot.autoconfigure.data.rest.BaseUri = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( BaseUri .class ) ; assertThat ( java.net.URI ) . as ( STRING ) . isEqualTo ( org.springframework.boot.autoconfigure.data.rest.BaseUri . getUri ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfiguration .class , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestMvcConfiguration .class ) ) . isNotNull ( ) ; RepositoryRestConfiguration org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestConfiguration .class ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getDefaultPageSize ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getMaxPageSize ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getPageParamName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getLimitParamName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getSortParamName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getRepositoryDetectionStrategy ( ) ) . isEqualTo ( RepositoryDetectionStrategies . VISIBILITY ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getDefaultMediaType ( ) ) . isEqualTo ( MediaType . parseMediaType ( STRING ) ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . returnBodyOnCreate ( null ) ) . isFalse ( ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . returnBodyOnUpdate ( null ) ) . isFalse ( ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . isEnableEnumTranslation ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfigurationWithConfigurer .class , STRING , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestMvcConfiguration .class ) ) . isNotNull ( ) ; RepositoryRestConfiguration org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestConfiguration .class ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getRepositoryDetectionStrategy ( ) ) . isEqualTo ( RepositoryDetectionStrategies . ALL ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getDefaultMediaType ( ) ) . isEqualTo ( MediaType . parseMediaType ( STRING ) ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getMaxPageSize ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfigurationWithRestMvcConfig .class , STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestMvcConfiguration .class ) ) . isNotNull ( ) ; RepositoryRestConfiguration org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( RepositoryRestConfiguration .class ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . getBaseUri ( ) ) . isEqualTo ( java.net.URI . java.net.URI ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.boot.autoconfigure.data.rest.JsonProcessingException { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfigurationWithObjectMapperBuilder .class ) ; void ( STRING ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.TestConfiguration .class ) ; java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.data.rest.ObjectMapper> < java.lang.String , ObjectMapper > java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.data.rest.ObjectMapper> = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBeansOfType ( ObjectMapper .class ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.data.rest.ObjectMapper> . size ( ) ) . isGreaterThan ( NUMBER ) ; this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( ObjectMapper .class ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String )			throws org.springframework.boot.autoconfigure.data.rest.JsonProcessingException { ObjectMapper org.springframework.boot.autoconfigure.data.rest.ObjectMapper = this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . getBean ( java.lang.String , ObjectMapper .class ) ; assertThat ( org.springframework.boot.autoconfigure.data.rest.ObjectMapper . writeValueAsString ( new java.util.Date ( NUMBER ) ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigWebApplicationContext org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . register ( java.lang.Class<> , org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfigurationTests.BaseConfiguration .class ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext , java.lang.String[] ) ; org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext = org.springframework.boot.autoconfigure.data.rest.AnnotationConfigWebApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.data.rest.Jackson2ObjectMapperBuilder org.springframework.boot.autoconfigure.data.rest.Jackson2ObjectMapperBuilder ( ) { Jackson2ObjectMapperBuilder org.springframework.boot.autoconfigure.data.rest.Jackson2ObjectMapperBuilder = new Jackson2ObjectMapperBuilder ( ) ; org.springframework.boot.autoconfigure.data.rest.Jackson2ObjectMapperBuilder . simpleDateFormat ( STRING ) ; return org.springframework.boot.autoconfigure.data.rest.Jackson2ObjectMapperBuilder ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RepositoryRestConfiguration org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration ) { org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . setRepositoryDetectionStrategy ( RepositoryDetectionStrategies . ALL ) ; org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . setDefaultMediaType ( MediaType . parseMediaType ( STRING ) ) ; org.springframework.boot.autoconfigure.data.rest.RepositoryRestConfiguration . setMaxPageSize ( NUMBER ) ; }  <METHOD_END>