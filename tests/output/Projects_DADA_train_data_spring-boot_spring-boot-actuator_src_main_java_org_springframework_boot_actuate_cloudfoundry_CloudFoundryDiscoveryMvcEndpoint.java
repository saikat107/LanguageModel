<METHOD_START> void ( java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> < NamedMvcEndpoint > java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> ) { super( STRING , false ); this . java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> = java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( produces = MediaType . APPLICATION_JSON_VALUE ) @ ResponseBody public java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link>> < java.lang.String , java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> < java.lang.String , org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link > > java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link>> ( HttpServletRequest org.springframework.boot.actuate.cloudfoundry.HttpServletRequest ) { java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> < java.lang.String , org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link > java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> = new java.util.LinkedHashMap<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> <> ( ) ; java.lang.String java.lang.String = org.springframework.boot.actuate.cloudfoundry.HttpServletRequest . getRequestURL ( ) . toString ( ) ; if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( ) - NUMBER ) ; } java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> . org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ( STRING , org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link . org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ( java.lang.String ) ) ; AccessLevel org.springframework.boot.actuate.cloudfoundry.AccessLevel = AccessLevel . get ( org.springframework.boot.actuate.cloudfoundry.HttpServletRequest ) ; for ( NamedMvcEndpoint org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint : this . java.util.Set<org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint> ) { if ( org.springframework.boot.actuate.cloudfoundry.AccessLevel != null && org.springframework.boot.actuate.cloudfoundry.AccessLevel . isAccessAllowed ( org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint . getPath ( ) ) ) { java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> . org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ( org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint . getName ( ) , org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link . org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ( java.lang.String + STRING + org.springframework.boot.actuate.cloudfoundry.NamedMvcEndpoint . getName ( ) ) ) ; } } return java.util.Collections . java.util.Map<java.lang.String,java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link>> ( STRING , java.util.Map<java.lang.String,org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link> ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> static org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ( java.lang.Object java.lang.Object ) { org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link = new org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ( ) ; org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link . void ( java.lang.Object . java.lang.String ( ) ) ; return org.springframework.boot.actuate.cloudfoundry.CloudFoundryDiscoveryMvcEndpoint.Link ; }  <METHOD_END>
