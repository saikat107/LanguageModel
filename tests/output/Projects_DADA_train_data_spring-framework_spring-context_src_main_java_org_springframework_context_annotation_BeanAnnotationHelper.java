<METHOD_START> public static boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return AnnotatedElementUtils . hasAnnotation ( java.lang.reflect.Method , Bean .class ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.reflect.Method java.lang.reflect.Method ) { java.lang.String java.lang.String = java.lang.reflect.Method . java.lang.String ( ) ; Bean org.springframework.context.annotation.Bean = AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method , Bean .class ) ; if ( org.springframework.context.annotation.Bean != null && org.springframework.context.annotation.Bean . name ( ) . length > NUMBER ) { java.lang.String = org.springframework.context.annotation.Bean . name ( ) [ NUMBER ] ; } return java.lang.String ; }  <METHOD_END>
