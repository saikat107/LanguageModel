<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint = new org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint ( new org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestEndpoint ( STRING ) ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint . setPath ( STRING ) ; CloudFoundryEndpointHandlerMapping org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping = new CloudFoundryEndpointHandlerMapping ( java.util.Collections . java.util.Set<org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint> ( org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint ) , null , null ) ; assertThat ( org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . getPath ( org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestMvcEndpoint ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CloudFoundryEndpointHandlerMapping org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping = new CloudFoundryEndpointHandlerMapping ( java.util.Collections . java.util.Set<org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestHalJsonMvcEndpoint> ( new org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestHalJsonMvcEndpoint ( ) ) , null , null ) ; assertThat ( org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . getEndpoints ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.boot.actuate.cloudfoundry.StaticApplicationContext = new StaticApplicationContext ( ) ; CloudFoundryEndpointHandlerMapping org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping = new CloudFoundryEndpointHandlerMapping ( java.util.Collections .< NamedMvcEndpoint > java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> ( ) , null , null ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . setPrefix ( STRING ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . setApplicationContext ( org.springframework.boot.actuate.cloudfoundry.StaticApplicationContext ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . afterPropertiesSet ( ) ; HandlerExecutionChain org.springframework.boot.actuate.cloudfoundry.HandlerExecutionChain = org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . getHandler ( new MockHttpServletRequest ( STRING , STRING ) ) ; HandlerMethod org.springframework.boot.actuate.cloudfoundry.HandlerMethod = ( HandlerMethod ) org.springframework.boot.actuate.cloudfoundry.HandlerExecutionChain . getHandler ( ) ; assertThat ( org.springframework.boot.actuate.cloudfoundry.HandlerMethod . getBean ( ) ) . isInstanceOf ( CloudFoundryDiscoveryMvcEndpoint .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.boot.actuate.cloudfoundry.StaticApplicationContext = new StaticApplicationContext ( ) ; HealthEndpoint org.springframework.boot.actuate.cloudfoundry.HealthEndpoint = new HealthEndpoint ( new OrderedHealthAggregator ( ) , java.util.Collections .< java.lang.String , HealthIndicator > java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.HealthIndicator> ( ) ) ; CloudFoundryEndpointHandlerMapping org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping = new CloudFoundryEndpointHandlerMapping ( java.util.Collections . java.util.Set<T> ( new org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestHealthMvcEndpoint ( org.springframework.boot.actuate.cloudfoundry.HealthEndpoint ) ) , null , null ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . setPrefix ( STRING ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . setApplicationContext ( org.springframework.boot.actuate.cloudfoundry.StaticApplicationContext ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . afterPropertiesSet ( ) ; HandlerExecutionChain org.springframework.boot.actuate.cloudfoundry.HandlerExecutionChain = org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMapping . getHandler ( new MockHttpServletRequest ( STRING , STRING ) ) ; HandlerMethod org.springframework.boot.actuate.cloudfoundry.HandlerMethod = ( HandlerMethod ) org.springframework.boot.actuate.cloudfoundry.HandlerExecutionChain . getHandler ( ) ; java.lang.Object java.lang.Object = org.springframework.boot.actuate.cloudfoundry.HandlerMethod . getBean ( ) ; assertThat ( java.lang.Object ) . isInstanceOf ( CloudFoundryHealthMvcEndpoint .class ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return null ; }  <METHOD_END>
<METHOD_START> void ( org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestEndpoint org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestEndpoint ) { super( org.springframework.boot.actuate.cloudfoundry.CloudFoundryEndpointHandlerMappingTests.TestEndpoint ); }  <METHOD_END>
<METHOD_START> void ( ) { super( new ManagementServletContext ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; } } ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> void ( HealthEndpoint org.springframework.boot.actuate.cloudfoundry.HealthEndpoint ) { super( org.springframework.boot.actuate.cloudfoundry.HealthEndpoint ); }  <METHOD_END>
