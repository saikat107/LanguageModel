<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getBean ( MetricsEndpoint .class ) . setEnabled ( true ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) . header ( HttpHeaders . ACCEPT , MediaType . APPLICATION_JSON_VALUE ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , MediaType . APPLICATION_JSON_UTF8_VALUE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) . header ( HttpHeaders . ACCEPT , MediaType . APPLICATION_JSON_VALUE ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( header ( ) . string ( STRING , MediaType . APPLICATION_JSON_UTF8_VALUE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getBean ( MetricsEndpoint .class ) . setEnabled ( false ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isNotFound ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.WebApplicationContext . getBean ( MetricsEndpoint .class ) . setEnabled ( false ) ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isNotFound ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isNotFound ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.endpoint.mvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.endpoint.mvc.MetricsEndpoint org.springframework.boot.actuate.endpoint.mvc.MetricsEndpoint ( ) { return new MetricsEndpoint ( new PublicMetrics ( ) { @ java.lang.Override public java.util.Collection<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> ( ) { java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> < Metric < ? > > java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> = new java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> <> ( ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric < java.lang.Integer > ( STRING , null ) ) ; return java.util.Collections . java.util.List ( java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> ( ) { java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> < Metric < ? > > java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> = new java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> <> ( ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric <> ( STRING , NUMBER ) ) ; java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> . add ( new Metric < java.lang.Integer > ( STRING , null ) ) ; return java.util.Collections . java.util.List ( java.util.ArrayList<org.springframework.boot.actuate.endpoint.mvc.Metric<?>> ) ; }  <METHOD_END>
