<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( SORT , STRING ) ; void ( Sort . by ( ASC , STRING ) . and ( Sort . by ( DESC , STRING ) . and ( Sort . by ( ASC , STRING ) ) ) , STRING ) ; void ( Sort . by ( ASC , STRING ) . and ( Sort . by ( ASC , STRING ) . and ( Sort . by ( DESC , STRING ) ) ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( SORT , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { UriComponents org.springframework.data.web.UriComponents = UriComponentsBuilder . fromPath ( STRING ) . build ( ) ; HateoasSortHandlerMethodArgumentResolver org.springframework.data.web.HateoasSortHandlerMethodArgumentResolver = new HateoasSortHandlerMethodArgumentResolver ( ) ; assertThat ( org.springframework.data.web.HateoasSortHandlerMethodArgumentResolver . getSortTemplateVariables ( null , org.springframework.data.web.UriComponents ) . toString ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( Sort org.springframework.data.web.Sort , java.lang.String java.lang.String ) throws java.lang.Exception { void ( org.springframework.data.web.Sort , java.lang.String , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( Sort org.springframework.data.web.Sort , java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.lang.Exception { UriComponentsBuilder org.springframework.data.web.UriComponentsBuilder = UriComponentsBuilder . fromUri ( new java.net.URI ( java.lang.String ) ) ; MethodParameter org.springframework.data.web.MethodParameter = getParameterOfMethod ( STRING ) ; new HateoasSortHandlerMethodArgumentResolver ( ) . enhance ( org.springframework.data.web.UriComponentsBuilder , org.springframework.data.web.MethodParameter , org.springframework.data.web.Sort ) ; assertThat ( org.springframework.data.web.UriComponentsBuilder . build ( ) . toUriString ( ) ) . endsWith ( java.lang.String ) ; }  <METHOD_END>