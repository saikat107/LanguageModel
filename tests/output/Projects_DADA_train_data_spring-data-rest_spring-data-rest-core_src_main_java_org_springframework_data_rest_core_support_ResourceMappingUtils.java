<METHOD_START> protected void ( ) {}  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.Class<?> < ? > java.lang.Class<?> ) { RestResource org.springframework.data.rest.core.support.RestResource = findAnnotation ( java.lang.Class<> , RestResource .class ) ; if ( org.springframework.data.rest.core.support.RestResource != null ) { if ( hasText ( org.springframework.data.rest.core.support.RestResource . rel ( ) ) ) { return org.springframework.data.rest.core.support.RestResource . rel ( ) ; } } return uncapitalize ( java.lang.Class<> . java.lang.String ( ) . java.lang.String ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method ) { RestResource org.springframework.data.rest.core.support.RestResource = findAnnotation ( java.lang.reflect.Method , RestResource .class ) ; if ( org.springframework.data.rest.core.support.RestResource != null ) { if ( hasText ( org.springframework.data.rest.core.support.RestResource . rel ( ) ) ) { return org.springframework.data.rest.core.support.RestResource . rel ( ) ; } } return java.lang.reflect.Method . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( RepositoryRestConfiguration org.springframework.data.rest.core.support.RepositoryRestConfiguration , RepositoryInformation org.springframework.data.rest.core.support.RepositoryInformation , PersistentProperty < ? > org.springframework.data.rest.core.support.PersistentProperty<?> ) { if ( org.springframework.data.rest.core.support.PersistentProperty<> == null ) { return null ; } ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = org.springframework.data.rest.core.support.ResourceMapping ( org.springframework.data.rest.core.support.RepositoryRestConfiguration , org.springframework.data.rest.core.support.RepositoryInformation ) ; ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = org.springframework.data.rest.core.support.ResourceMapping ( org.springframework.data.rest.core.support.RepositoryRestConfiguration , org.springframework.data.rest.core.support.PersistentProperty<> . getOwner ( ) ) ; ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = org.springframework.data.rest.core.support.ResourceMapping . getResourceMappingFor ( org.springframework.data.rest.core.support.PersistentProperty<> . getName ( ) ) ; return java.lang.String . java.lang.String ( STRING , org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) , org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) , ( null != org.springframework.data.rest.core.support.ResourceMapping ? org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) : org.springframework.data.rest.core.support.PersistentProperty<> . getName ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.Class<?> < ? > java.lang.Class<?> ) { RestResource org.springframework.data.rest.core.support.RestResource = findAnnotation ( java.lang.Class<> , RestResource .class ) ; if ( org.springframework.data.rest.core.support.RestResource != null ) { if ( hasTextExceptSlash ( org.springframework.data.rest.core.support.RestResource . path ( ) ) ) { return removeLeadingSlash ( org.springframework.data.rest.core.support.RestResource . path ( ) ) ; } } return uncapitalize ( java.lang.Class<> . java.lang.String ( ) . java.lang.String ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method ) { RestResource org.springframework.data.rest.core.support.RestResource = findAnnotation ( java.lang.reflect.Method , RestResource .class ) ; if ( org.springframework.data.rest.core.support.RestResource != null ) { if ( hasTextExceptSlash ( org.springframework.data.rest.core.support.RestResource . path ( ) ) ) { return removeLeadingSlash ( org.springframework.data.rest.core.support.RestResource . path ( ) ) ; } } return java.lang.reflect.Method . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { RestResource org.springframework.data.rest.core.support.RestResource = findAnnotation ( java.lang.Class<> , RestResource .class ) ; return org.springframework.data.rest.core.support.RestResource == null || org.springframework.data.rest.core.support.RestResource . exported ( ) ; }  <METHOD_END>
<METHOD_START> public static boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { RestResource org.springframework.data.rest.core.support.RestResource = findAnnotation ( java.lang.reflect.Method , RestResource .class ) ; return org.springframework.data.rest.core.support.RestResource == null || org.springframework.data.rest.core.support.RestResource . exported ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.rest.core.support.ResourceMapping org.springframework.data.rest.core.support.ResourceMapping ( RepositoryRestConfiguration org.springframework.data.rest.core.support.RepositoryRestConfiguration , RepositoryInformation org.springframework.data.rest.core.support.RepositoryInformation ) { if ( null == org.springframework.data.rest.core.support.RepositoryInformation ) { return null ; } java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.core.support.RepositoryInformation . getRepositoryInterface ( ) ; ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = ( null != org.springframework.data.rest.core.support.RepositoryRestConfiguration ? org.springframework.data.rest.core.support.RepositoryRestConfiguration . getResourceMappingForRepository ( java.lang.Class<> ) : null ) ; return org.springframework.data.rest.core.support.ResourceMapping ( java.lang.Class<> , org.springframework.data.rest.core.support.ResourceMapping ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.rest.core.support.ResourceMapping org.springframework.data.rest.core.support.ResourceMapping ( RepositoryRestConfiguration org.springframework.data.rest.core.support.RepositoryRestConfiguration , PersistentEntity < ? , ? > org.springframework.data.rest.core.support.PersistentEntity<?,?> ) { if ( null == org.springframework.data.rest.core.support.PersistentEntity<,> ) { return null ; } java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.core.support.PersistentEntity<,> . getType ( ) ; ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = ( null != org.springframework.data.rest.core.support.RepositoryRestConfiguration ? org.springframework.data.rest.core.support.RepositoryRestConfiguration . getResourceMappingForDomainType ( java.lang.Class<> ) : null ) ; return org.springframework.data.rest.core.support.ResourceMapping ( java.lang.Class<> , org.springframework.data.rest.core.support.ResourceMapping ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.rest.core.support.ResourceMapping org.springframework.data.rest.core.support.ResourceMapping ( java.lang.reflect.Method java.lang.reflect.Method , ResourceMapping org.springframework.data.rest.core.support.ResourceMapping ) { ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = new ResourceMapping ( java.lang.String ( java.lang.reflect.Method ) , java.lang.String ( java.lang.reflect.Method ) , boolean ( java.lang.reflect.Method ) ) ; if ( null != org.springframework.data.rest.core.support.ResourceMapping ) { return new ResourceMapping ( ( null != org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) ? org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) : org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) ) , ( null != org.springframework.data.rest.core.support.ResourceMapping . getPath ( ) ? org.springframework.data.rest.core.support.ResourceMapping . getPath ( ) : org.springframework.data.rest.core.support.ResourceMapping . getPath ( ) ) , ( org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) != org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) ? org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) : org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) ) ) ; } return org.springframework.data.rest.core.support.ResourceMapping ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.rest.core.support.ResourceMapping org.springframework.data.rest.core.support.ResourceMapping ( java.lang.Class<?> < ? > java.lang.Class<?> , ResourceMapping org.springframework.data.rest.core.support.ResourceMapping ) { ResourceMapping org.springframework.data.rest.core.support.ResourceMapping = new ResourceMapping ( java.lang.String ( java.lang.Class<> ) , java.lang.String ( java.lang.Class<> ) , boolean ( java.lang.Class<> ) ) ; if ( null != org.springframework.data.rest.core.support.ResourceMapping ) { return new ResourceMapping ( ( null != org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) ? org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) : org.springframework.data.rest.core.support.ResourceMapping . getRel ( ) ) , ( null != org.springframework.data.rest.core.support.ResourceMapping . getPath ( ) ? org.springframework.data.rest.core.support.ResourceMapping . getPath ( ) : org.springframework.data.rest.core.support.ResourceMapping . getPath ( ) ) , ( org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) != org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) ? org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) : org.springframework.data.rest.core.support.ResourceMapping . isExported ( ) ) ) . addResourceMappings ( org.springframework.data.rest.core.support.ResourceMapping . getResourceMappings ( ) ) ; } return org.springframework.data.rest.core.support.ResourceMapping ; }  <METHOD_END>
