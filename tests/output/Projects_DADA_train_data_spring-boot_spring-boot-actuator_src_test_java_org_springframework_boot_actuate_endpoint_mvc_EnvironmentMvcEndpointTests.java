<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getBean ( EnvironmentEndpoint .class ) . setEnabled ( true ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext ) . build ( ) ; EnvironmentTestUtils . addEnvironment ( ( ConfigurableApplicationContext ) this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) . header ( HttpHeaders . ACCEPT , MediaType . APPLICATION_JSON_VALUE ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , MediaType . APPLICATION_JSON_UTF8_VALUE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) . header ( HttpHeaders . ACCEPT , MediaType . APPLICATION_JSON_VALUE ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , MediaType . APPLICATION_JSON_UTF8_VALUE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getBean ( EnvironmentEndpoint .class ) . setEnabled ( false ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isNotFound ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , null ) ; ( ( ConfigurableEnvironment ) this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getEnvironment ( ) ) . getPropertySources ( ) . addFirst ( new MapPropertySource ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; ( ( ConfigurableEnvironment ) this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getEnvironment ( ) ) . getPropertySources ( ) . addFirst ( new MapPropertySource ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; ( ( ConfigurableEnvironment ) this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getEnvironment ( ) ) . getPropertySources ( ) . addFirst ( new MapPropertySource ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.endpoint.mvc.EnvironmentEndpoint org.springframework.boot.actuate.endpoint.mvc.EnvironmentEndpoint ( ) { return new EnvironmentEndpoint ( ) ; }  <METHOD_END>