<METHOD_START> void ( java.lang.annotation.Annotation java.lang.annotation.Annotation , java.lang.Object java.lang.Object ) { super( java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) , java.lang.Object , java.lang.annotation.Annotation ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.reflect.Method java.lang.reflect.Method ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; return ReflectionUtils . invokeMethod ( java.lang.reflect.Method , getSource ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { java.lang.reflect.Method java.lang.reflect.Method = ReflectionUtils . findMethod ( getAnnotationType ( ) , java.lang.String ) ; return java.lang.Object ( java.lang.reflect.Method ) ; }  <METHOD_END>
