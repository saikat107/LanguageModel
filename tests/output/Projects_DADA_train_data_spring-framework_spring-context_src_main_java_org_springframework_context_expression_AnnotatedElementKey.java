<METHOD_START> public void ( java.lang.reflect.AnnotatedElement java.lang.reflect.AnnotatedElement , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.reflect.AnnotatedElement , STRING ) ; this . java.lang.reflect.AnnotatedElement = java.lang.reflect.AnnotatedElement ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.context.expression.AnnotatedElementKey ) ) { return false ; } org.springframework.context.expression.AnnotatedElementKey org.springframework.context.expression.AnnotatedElementKey = ( org.springframework.context.expression.AnnotatedElementKey ) java.lang.Object ; return ( this . java.lang.reflect.AnnotatedElement . boolean ( org.springframework.context.expression.AnnotatedElementKey . java.lang.reflect.AnnotatedElement ) && ObjectUtils . nullSafeEquals ( this . java.lang.Class<> , org.springframework.context.expression.AnnotatedElementKey . java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.reflect.AnnotatedElement . int ( ) + ( this . java.lang.Class<> != null ? this . java.lang.Class<> . int ( ) * NUMBER : NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.reflect.AnnotatedElement + ( this . java.lang.Class<> != null ? STRING + this . java.lang.Class<> : STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( org.springframework.context.expression.AnnotatedElementKey org.springframework.context.expression.AnnotatedElementKey ) { int int = this . java.lang.reflect.AnnotatedElement . java.lang.String ( ) . int ( org.springframework.context.expression.AnnotatedElementKey . java.lang.reflect.AnnotatedElement . java.lang.String ( ) ) ; if ( int == NUMBER && this . java.lang.Class<> != null ) { int = this . java.lang.Class<> . java.lang.String ( ) . int ( org.springframework.context.expression.AnnotatedElementKey . java.lang.Class<> . java.lang.String ( ) ) ; } return int ; }  <METHOD_END>
