<METHOD_START> public void ( ) { this( null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = ( java.lang.ClassLoader != null ? java.lang.ClassLoader : ClassUtils . getDefaultClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { if ( StringUtils . hasText ( java.lang.String ) ) { void ( ClassUtils . resolveClassName ( java.lang.String . java.lang.String ( ) , this . java.lang.ClassLoader ) ) ; } else { void ( null ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.Class<?> < ? > java.lang.Class<?> = ( java.lang.Class<?> < ? > ) java.lang.Object ( ) ; if ( java.lang.Class<> != null ) { return ClassUtils . getQualifiedName ( java.lang.Class<> ) ; } else { return STRING ; } }  <METHOD_END>