<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext != null ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Parameters ( name = STRING ) public static java.lang.Object [] java.lang.Object[] ( ) { return new java.lang.Object [] { new java.lang.Object [] { STRING , HalJsonMvcEndpoint .class } , new java.lang.Object [] { STRING , AuditEventsMvcEndpoint .class } , new java.lang.Object [] { STRING , AutoConfigurationReportEndpoint .class } , new java.lang.Object [] { STRING , BeansEndpoint .class } , new java.lang.Object [] { STRING , ConfigurationPropertiesReportEndpoint .class } , new java.lang.Object [] { STRING , DocsMvcEndpoint .class } , new java.lang.Object [] { STRING , DumpEndpoint .class } , new java.lang.Object [] { STRING , EnvironmentMvcEndpoint .class } , new java.lang.Object [] { STRING , FlywayEndpoint .class } , new java.lang.Object [] { STRING , HealthMvcEndpoint .class } , new java.lang.Object [] { STRING , InfoEndpoint .class } , new java.lang.Object [] { STRING , JolokiaMvcEndpoint .class } , new java.lang.Object [] { STRING , LiquibaseEndpoint .class } , new java.lang.Object [] { STRING , LogFileMvcEndpoint .class } , new java.lang.Object [] { STRING , LoggersMvcEndpoint .class } , new java.lang.Object [] { STRING , RequestMappingEndpoint .class } , new java.lang.Object [] { STRING , MetricsMvcEndpoint .class } , new java.lang.Object [] { STRING , ShutdownEndpoint .class } , new java.lang.Object [] { STRING , TraceEndpoint .class } } ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.String = java.lang.String ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext ( ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext . register ( org.springframework.boot.actuate.autoconfigure.MvcEndpointPathConfigurationTests.TestConfiguration .class ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext , STRING + this . java.lang.String + STRING + STRING , STRING + this . java.lang.String + STRING , STRING ) ; this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext . refresh ( ) ; assertThat ( java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { if ( MvcEndpoint .class . boolean ( this . java.lang.Class<> ) ) { return ( ( MvcEndpoint ) this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext . getBean ( this . java.lang.Class<> ) ) . getPath ( ) ; } for ( MvcEndpoint org.springframework.boot.actuate.autoconfigure.MvcEndpoint : this . org.springframework.boot.actuate.autoconfigure.AnnotationConfigWebApplicationContext . getBean ( MvcEndpoints .class ) . getEndpoints ( ) ) { if ( org.springframework.boot.actuate.autoconfigure.MvcEndpoint instanceof EndpointMvcAdapter && this . java.lang.Class<> . boolean ( ( ( EndpointMvcAdapter ) org.springframework.boot.actuate.autoconfigure.MvcEndpoint ) . getDelegate ( ) ) ) { return ( ( EndpointMvcAdapter ) org.springframework.boot.actuate.autoconfigure.MvcEndpoint ) . getPath ( ) ; } } throw new java.lang.IllegalStateException ( STRING + this . java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.ConditionEvaluationReport org.springframework.boot.actuate.autoconfigure.ConditionEvaluationReport ( ConfigurableListableBeanFactory org.springframework.boot.actuate.autoconfigure.ConfigurableListableBeanFactory ) { return ConditionEvaluationReport . get ( org.springframework.boot.actuate.autoconfigure.ConfigurableListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.boot.actuate.autoconfigure.LoggingSystem org.springframework.boot.actuate.autoconfigure.LoggingSystem ( ) { return LoggingSystem . get ( java.lang.Class<? extends org.springframework.boot.actuate.autoconfigure.MvcEndpointPathConfigurationTests.TestConfiguration> ( ) . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.FlywayEndpoint org.springframework.boot.actuate.autoconfigure.FlywayEndpoint ( ) { return new FlywayEndpoint ( new Flyway ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.LiquibaseEndpoint org.springframework.boot.actuate.autoconfigure.LiquibaseEndpoint ( ) { return new LiquibaseEndpoint ( new SpringLiquibase ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.autoconfigure.DocsMvcEndpoint org.springframework.boot.actuate.autoconfigure.DocsMvcEndpoint ( ManagementServletContext org.springframework.boot.actuate.autoconfigure.ManagementServletContext ) { return new DocsMvcEndpoint ( org.springframework.boot.actuate.autoconfigure.ManagementServletContext ) ; }  <METHOD_END>
