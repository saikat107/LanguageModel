<METHOD_START> public void ( MethodParameter org.springframework.data.rest.core.mapping.MethodParameter , java.lang.String java.lang.String ) { this . java.lang.String = org.springframework.data.rest.core.mapping.MethodParameter . getParameterName ( ) ; Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription = TypedResourceDescription . defaultFor ( java.lang.String . java.lang.String ( STRING ) . java.lang.String ( java.lang.String ) , org.springframework.data.rest.core.mapping.MethodParameter . getParameterType ( ) ) ; Description org.springframework.data.rest.core.mapping.Description = org.springframework.data.rest.core.mapping.MethodParameter . getParameterAnnotation ( Description .class ) ; this . org.springframework.data.rest.core.mapping.ResourceDescription = org.springframework.data.rest.core.mapping.Description == null ? org.springframework.data.rest.core.mapping.ResourceDescription : new AnnotationBasedResourceDescription ( org.springframework.data.rest.core.mapping.Description , org.springframework.data.rest.core.mapping.ResourceDescription ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.rest.core.mapping.ResourceDescription org.springframework.data.rest.core.mapping.ResourceDescription ( ) { return org.springframework.data.rest.core.mapping.ResourceDescription ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.data.rest.core.mapping.ParameterMetadata ) ) { return false ; } org.springframework.data.rest.core.mapping.ParameterMetadata org.springframework.data.rest.core.mapping.ParameterMetadata = ( org.springframework.data.rest.core.mapping.ParameterMetadata ) java.lang.Object ; return this . java.lang.String . boolean ( org.springframework.data.rest.core.mapping.ParameterMetadata . java.lang.String ) && this . org.springframework.data.rest.core.mapping.ResourceDescription . equals ( org.springframework.data.rest.core.mapping.ParameterMetadata . org.springframework.data.rest.core.mapping.ResourceDescription ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { int int = NUMBER ; int += NUMBER * java.lang.String . int ( ) ; int += NUMBER * org.springframework.data.rest.core.mapping.ResourceDescription . hashCode ( ) ; return int ; }  <METHOD_END>