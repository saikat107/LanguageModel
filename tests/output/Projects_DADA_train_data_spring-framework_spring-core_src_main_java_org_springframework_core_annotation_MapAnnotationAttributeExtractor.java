<METHOD_START> void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> , java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement ) { super( java.lang.Class<> , java.lang.reflect.AnnotatedElement , java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<> ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.reflect.Method java.lang.reflect.Method ) { return java.lang.Object ( java.lang.reflect.Method . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return getSource ( ) . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( java.util.Map<java.lang.String,java.lang.Object> ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = AnnotationUtils . getAttributeAliasMap ( java.lang.Class<> ) ; for ( java.lang.reflect.Method java.lang.reflect.Method : AnnotationUtils . getAttributeMethods ( java.lang.Class<> ) ) { java.lang.String java.lang.String = java.lang.reflect.Method . java.lang.String ( ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; if ( java.lang.Object == null ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( java.lang.String ) ; if ( java.util.List<java.lang.String> != null ) { for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; if ( java.lang.Object != null ) { java.lang.Object = java.lang.Object ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; break; } } } } if ( java.lang.Object == null ) { java.lang.Object java.lang.Object = AnnotationUtils . getDefaultValue ( java.lang.Class<> , java.lang.String ) ; if ( java.lang.Object != null ) { java.lang.Object = java.lang.Object ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; } } Assert . notNull ( java.lang.Object , ( ) String . format ( STRING , attributes , attributeName , annotationType . getName ( ) ) ) ; java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.reflect.Method . java.lang.Class<?> ( ) ; java.lang.Class<? extends java.lang.Object> < ? extends java.lang.Object > java.lang.Class<? extends java.lang.Object> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; if ( ! ClassUtils . isAssignable ( java.lang.Class<> , java.lang.Class<> ) ) { boolean boolean = false ; if ( java.lang.Class<> . boolean ( ) && java.lang.Class<> . java.lang.Class<?> ( ) == java.lang.Class<> ) { java.lang.Object java.lang.Object = java.lang.reflect.Array . java.lang.Object ( java.lang.Class<> . java.lang.Class<?> ( ) , NUMBER ) ; java.lang.reflect.Array . void ( java.lang.Object , NUMBER , java.lang.Object ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; boolean = true ; } else if ( java.lang.annotation.Annotation .class . boolean ( java.lang.Class<> ) && java.util.Map .class . boolean ( java.lang.Class<> ) ) { java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> = ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ) java.lang.Class<> ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.lang.Object ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , AnnotationUtils . synthesizeAnnotation ( java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<> , null ) ) ; boolean = true ; } else if ( java.lang.Class<> . boolean ( ) && java.lang.Class<> . boolean ( ) && java.lang.annotation.Annotation .class . boolean ( java.lang.Class<> . java.lang.Class<?> ( ) ) && java.util.Map .class . boolean ( java.lang.Class<> . java.lang.Class<?> ( ) ) ) { java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> = ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ) java.lang.Class<> . java.lang.Class<?> ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > [] java.util.Map<java.lang.String,java.lang.Object>[] = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > [] ) java.lang.Object ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , AnnotationUtils . synthesizeAnnotationArray ( java.util.Map<java.lang.String,java.lang.Object>[] , java.lang.Class<> ) ) ; boolean = true ; } Assert . isTrue ( boolean , ( ) String . format ( STRING + STRING , attributes , actualReturnType . getName ( ) , attributeName , requiredReturnType . getName ( ) , annotationType . getName ( ) ) ) ; } } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
