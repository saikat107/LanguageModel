<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) throws java.lang.ClassNotFoundException { return ClassUtils . forName ( java.lang.String , this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.ClassNotFoundException , java.lang.NoSuchMethodException { prepare ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { try { invoke ( ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { org.springframework.scheduling.support.Log . error ( java.lang.String ( ) , java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.scheduling.support.Log . error ( java.lang.String ( ) , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return STRING + getTargetMethod ( ) + STRING + getTargetClass ( ) + STRING ; }  <METHOD_END>