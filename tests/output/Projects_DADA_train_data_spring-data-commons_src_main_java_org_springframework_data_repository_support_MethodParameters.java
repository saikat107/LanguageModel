<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method ) { this( java.lang.reflect.Method , java.util.Optional . java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> ( ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> < AnnotationAttribute > java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> ) { Assert . notNull ( java.lang.reflect.Method , STRING ) ; this . java.util.List<org.springframework.data.repository.support.MethodParameter> = new java.util.ArrayList <> ( ) ; for ( int int = NUMBER ; int < java.lang.reflect.Method . int ( ) ; int ++ ) { MethodParameter org.springframework.data.repository.support.MethodParameter = new org.springframework.data.repository.support.MethodParameters.AnnotationNamingMethodParameter ( java.lang.reflect.Method , int , java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> ) ; org.springframework.data.repository.support.MethodParameter . initParameterNameDiscovery ( org.springframework.data.repository.support.ParameterNameDiscoverer ) ; java.util.List<org.springframework.data.repository.support.MethodParameter> . add ( org.springframework.data.repository.support.MethodParameter ) ; } }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.repository.support.MethodParameter> < MethodParameter > java.util.List<org.springframework.data.repository.support.MethodParameter> ( ) { return java.util.List<org.springframework.data.repository.support.MethodParameter> ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<org.springframework.data.repository.support.MethodParameter> < MethodParameter > java.util.Optional<org.springframework.data.repository.support.MethodParameter> ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; return java.util.List<org.springframework.data.repository.support.MethodParameter> ( ) . stream ( ) . filter ( it -> name . equals ( it . getParameterName ( ) ) ) . findFirst ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.repository.support.MethodParameter> < MethodParameter > java.util.List<org.springframework.data.repository.support.MethodParameter> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return java.util.List<org.springframework.data.repository.support.MethodParameter> ( ) . stream ( ) . filter ( it -> it . getParameterType ( ) . equals ( type ) ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.repository.support.MethodParameter> < MethodParameter > java.util.List<org.springframework.data.repository.support.MethodParameter> ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return java.util.List<org.springframework.data.repository.support.MethodParameter> ( ) . stream ( ) . filter ( it -> it . hasParameterAnnotation ( annotation ) ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , int int , java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> < AnnotationAttribute > java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> ) { super( java.lang.reflect.Method , int ); this . java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> = java.util.Optional<org.springframework.data.repository.support.AnnotationAttribute> ; this . org.springframework.data.repository.support.Lazy<java.lang.String> = Lazy . of ( ( ) this . attribute . flatMap ( it -> it . getValueFrom ( this ) . map ( Object :: toString ) ) . orElseGet ( super:: getParameterName ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.repository.support.Lazy<java.lang.String> . get ( ) ; }  <METHOD_END>
