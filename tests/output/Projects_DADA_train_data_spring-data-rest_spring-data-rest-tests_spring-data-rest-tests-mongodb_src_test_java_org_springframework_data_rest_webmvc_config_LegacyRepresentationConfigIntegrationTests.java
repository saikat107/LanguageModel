<METHOD_START> @ java.lang.Override public void void ( RepositoryRestConfiguration org.springframework.data.rest.webmvc.config.RepositoryRestConfiguration ) { org.springframework.data.rest.webmvc.config.RepositoryRestConfiguration . setDefaultMediaType ( MediaType . APPLICATION_JSON ) ; org.springframework.data.rest.webmvc.config.RepositoryRestConfiguration . useHalAsDefaultJsonMediaType ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { for ( java.lang.String java.lang.String : java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) { mvc . perform ( get ( java.lang.String ) . accept ( MediaType . APPLICATION_JSON ) ) . andExpect ( jsonPath ( STRING , is ( notNullValue ( ) ) ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { for ( java.lang.String java.lang.String : java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) { mvc . perform ( get ( java.lang.String ) . accept ( MediaType . ALL ) ) . andExpect ( jsonPath ( STRING , is ( notNullValue ( ) ) ) ) ; } }  <METHOD_END>