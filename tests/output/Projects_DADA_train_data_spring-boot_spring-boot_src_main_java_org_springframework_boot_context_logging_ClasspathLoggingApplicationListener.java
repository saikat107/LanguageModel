<METHOD_START> @ java.lang.Override public void void ( ApplicationEvent org.springframework.boot.context.logging.ApplicationEvent ) { if ( org.springframework.boot.context.logging.Log . isDebugEnabled ( ) ) { if ( org.springframework.boot.context.logging.ApplicationEvent instanceof ApplicationEnvironmentPreparedEvent ) { org.springframework.boot.context.logging.Log . debug ( STRING + java.lang.String ( ) ) ; } else if ( org.springframework.boot.context.logging.ApplicationEvent instanceof ApplicationFailedEvent ) { org.springframework.boot.context.logging.Log . debug ( STRING + java.lang.String ( ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.boot.context.logging.ResolvableType ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.boot.context.logging.ResolvableType . getRawClass ( ) ; if ( java.lang.Class<> == null ) { return false ; } return ApplicationEnvironmentPreparedEvent .class . boolean ( java.lang.Class<> ) || ApplicationFailedEvent .class . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return true ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { java.lang.ClassLoader java.lang.ClassLoader = java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) ; if ( java.lang.ClassLoader instanceof java.net.URLClassLoader ) { return java.util.Arrays . java.lang.String ( ( ( java.net.URLClassLoader ) java.lang.ClassLoader ) . java.net.URL[] ( ) ) ; } return STRING ; }  <METHOD_END>
