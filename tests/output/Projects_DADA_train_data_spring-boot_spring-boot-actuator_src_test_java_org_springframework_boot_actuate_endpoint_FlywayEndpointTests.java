<METHOD_START> public void ( ) { super( org.springframework.boot.actuate.endpoint.FlywayEndpointTests.Config .class , FlywayEndpoint .class , STRING , true , STRING ); }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( getEndpointBean ( ) . invoke ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.endpoint.FlywayEndpoint org.springframework.boot.actuate.endpoint.FlywayEndpoint ( Flyway org.springframework.boot.actuate.endpoint.Flyway ) { return new FlywayEndpoint ( org.springframework.boot.actuate.endpoint.Flyway ) ; }  <METHOD_END>