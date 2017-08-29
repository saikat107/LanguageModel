<METHOD_START> @ BeforeClass public static void void ( ) { java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( STRING ) . accept ( MediaType . TEXT_PLAIN ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileCopyUtils . copy ( java.lang.Class<? extends org.springframework.boot.actuate.hypermedia.EndpointDocumentation> ( ) . java.io.InputStream ( STRING ) , new java.io.FileOutputStream ( java.io.File ) ) ; this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( STRING ) . accept ( MediaType . TEXT_PLAIN ) . header ( HttpHeaders . RANGE , STRING ) ) . andExpect ( status ( ) . isPartialContent ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( STRING ) . accept ( MediaType . APPLICATION_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( post ( STRING ) . contentType ( ActuatorMediaTypes . APPLICATION_ACTUATOR_V2_JSON ) . content ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) . accept ( ActuatorMediaTypes . APPLICATION_ACTUATOR_V2_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) . param ( STRING , STRING ) . accept ( ActuatorMediaTypes . APPLICATION_ACTUATOR_V2_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( STRING ) . param ( STRING , STRING ) . param ( STRING , STRING ) . param ( STRING , STRING ) . accept ( ActuatorMediaTypes . APPLICATION_ACTUATOR_V2_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.io.File java.io.File = new java.io.File ( STRING ) ; final java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; final java.util.List<org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc> < org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc > java.util.List<org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc> = new java.util.ArrayList<org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.List<org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc> ) ; for ( MvcEndpoint org.springframework.boot.actuate.hypermedia.MvcEndpoint : java.util.Collection<? extends org.springframework.boot.actuate.hypermedia.MvcEndpoint> ( ) ) { final java.lang.String java.lang.String = ( StringUtils . hasText ( org.springframework.boot.actuate.hypermedia.MvcEndpoint . getPath ( ) ) ? org.springframework.boot.actuate.hypermedia.MvcEndpoint . getPath ( ) : STRING ) ; if ( ! java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER ) ; java.lang.String = java.lang.String . int ( ) > NUMBER ? java.lang.String : STRING ; this . org.springframework.boot.actuate.hypermedia.MockMvc . perform ( get ( java.lang.String ) . accept ( ActuatorMediaTypes . APPLICATION_ACTUATOR_V2_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) . andDo ( document ( java.lang.String ) ) . andDo ( new ResultHandler ( ) { @ java.lang.Override public void void ( MvcResult org.springframework.boot.actuate.hypermedia.MvcResult ) throws java.lang.Exception { org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc = new org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc ( java.io.File , java.lang.String ) ; java.util.List<org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc> . boolean ( org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc ) ; } } ) ; } } java.io.File java.io.File = new java.io.File ( java.lang.String + STRING ) ; java.io.File . java.io.File ( ) . boolean ( ) ; java.io.PrintWriter java.io.PrintWriter = new java.io.PrintWriter ( java.io.File , STRING ) ; try { Template org.springframework.boot.actuate.hypermedia.Template = this . org.springframework.boot.actuate.hypermedia.TemplateEngine . createTemplate ( new java.io.File ( STRING ) ) ; org.springframework.boot.actuate.hypermedia.Template . make ( java.util.Map<java.lang.String,java.lang.Object> ) . writeTo ( java.io.PrintWriter ) ; } finally { java.io.PrintWriter . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MvcResult org.springframework.boot.actuate.hypermedia.MvcResult ) throws java.lang.Exception { org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc = new org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc ( java.io.File , java.lang.String ) ; java.util.List<org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc> . boolean ( org.springframework.boot.actuate.hypermedia.EndpointDocumentation.EndpointDoc ) ; }  <METHOD_END>
<METHOD_START> private java.util.Collection<? extends org.springframework.boot.actuate.hypermedia.MvcEndpoint> < ? extends MvcEndpoint > java.util.Collection<? extends org.springframework.boot.actuate.hypermedia.MvcEndpoint> ( ) { java.util.List<? extends org.springframework.boot.actuate.hypermedia.MvcEndpoint> < ? extends MvcEndpoint > java.util.List<? extends org.springframework.boot.actuate.hypermedia.MvcEndpoint> = new java.util.ArrayList <> ( this . org.springframework.boot.actuate.hypermedia.MvcEndpoints . getEndpoints ( ) ) ; java.util.Collections . void ( java.util.List<> , new java.util.Comparator<org.springframework.boot.actuate.hypermedia.MvcEndpoint> < MvcEndpoint > ( ) { @ java.lang.Override public int int ( MvcEndpoint org.springframework.boot.actuate.hypermedia.MvcEndpoint , MvcEndpoint org.springframework.boot.actuate.hypermedia.MvcEndpoint ) { return org.springframework.boot.actuate.hypermedia.MvcEndpoint . getPath ( ) . compareTo ( org.springframework.boot.actuate.hypermedia.MvcEndpoint . getPath ( ) ) ; } } ) ; return java.util.List<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( MvcEndpoint org.springframework.boot.actuate.hypermedia.MvcEndpoint , MvcEndpoint org.springframework.boot.actuate.hypermedia.MvcEndpoint ) { return org.springframework.boot.actuate.hypermedia.MvcEndpoint . getPath ( ) . compareTo ( org.springframework.boot.actuate.hypermedia.MvcEndpoint . getPath ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.io.File java.io.File , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String . boolean ( STRING ) ? STRING : java.lang.String ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER ) + STRING ; if ( new java.io.File ( java.io.File , java.lang.String ) . boolean ( ) ) { this . java.lang.String = java.lang.String ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
