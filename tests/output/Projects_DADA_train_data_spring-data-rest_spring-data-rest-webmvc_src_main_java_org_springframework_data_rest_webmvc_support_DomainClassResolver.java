<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.reflect.Method java.lang.reflect.Method , NativeWebRequest org.springframework.data.rest.webmvc.support.NativeWebRequest ) { Assert . notNull ( java.lang.reflect.Method , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.support.NativeWebRequest , STRING ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.support.BaseUri . getRepositoryLookupPath ( org.springframework.data.rest.webmvc.support.NativeWebRequest ) ; java.lang.String java.lang.String = UriUtils . findMappingVariable ( STRING , java.lang.reflect.Method , java.lang.String ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = UriUtils . getPathSegments ( java.lang.reflect.Method ) ; if ( ! java.util.List<java.lang.String> . boolean ( ) ) { java.lang.String = java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ; } } if ( ! StringUtils . hasText ( java.lang.String ) ) { return null ; } for ( java.lang.Class<?> < ? > java.lang.Class<?> : org.springframework.data.rest.webmvc.support.Repositories ) { ResourceMetadata org.springframework.data.rest.webmvc.support.ResourceMetadata = org.springframework.data.rest.webmvc.support.ResourceMappings . getMetadataFor ( java.lang.Class<> ) ; if ( org.springframework.data.rest.webmvc.support.ResourceMetadata . getPath ( ) . matches ( java.lang.String ) && org.springframework.data.rest.webmvc.support.ResourceMetadata . isExported ( ) ) { return java.lang.Class<> ; } } return null ; }  <METHOD_END>
