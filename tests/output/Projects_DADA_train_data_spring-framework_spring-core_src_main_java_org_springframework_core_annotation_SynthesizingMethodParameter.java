<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , int int ) { super( java.lang.reflect.Method , int ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , int int , int int ) { super( java.lang.reflect.Method , int , int ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> , int int ) { super( java.lang.reflect.Constructor<> , int ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> , int int , int int ) { super( java.lang.reflect.Constructor<> , int , int ); }  <METHOD_END>
<METHOD_START> protected void ( org.springframework.core.annotation.SynthesizingMethodParameter org.springframework.core.annotation.SynthesizingMethodParameter ) { super( org.springframework.core.annotation.SynthesizingMethodParameter ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected < A extends java.lang.annotation.Annotation > A A ( A A ) { return AnnotationUtils . synthesizeAnnotation ( A , getAnnotatedElement ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.annotation.Annotation [] java.lang.annotation.Annotation[] ( java.lang.annotation.Annotation [] java.lang.annotation.Annotation[] ) { return AnnotationUtils . synthesizeAnnotationArray ( java.lang.annotation.Annotation[] , getAnnotatedElement ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.annotation.SynthesizingMethodParameter org.springframework.core.annotation.SynthesizingMethodParameter ( ) { return new org.springframework.core.annotation.SynthesizingMethodParameter ( this ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.core.annotation.SynthesizingMethodParameter org.springframework.core.annotation.SynthesizingMethodParameter ( java.lang.reflect.Executable java.lang.reflect.Executable , int int ) { if ( java.lang.reflect.Executable instanceof java.lang.reflect.Method ) { return new org.springframework.core.annotation.SynthesizingMethodParameter ( ( java.lang.reflect.Method ) java.lang.reflect.Executable , int ) ; } else if ( java.lang.reflect.Executable instanceof java.lang.reflect.Constructor ) { return new org.springframework.core.annotation.SynthesizingMethodParameter ( ( java.lang.reflect.Constructor<?> < ? > ) java.lang.reflect.Executable , int ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.reflect.Executable ) ; } }  <METHOD_END>
<METHOD_START> public static org.springframework.core.annotation.SynthesizingMethodParameter org.springframework.core.annotation.SynthesizingMethodParameter ( java.lang.reflect.Parameter java.lang.reflect.Parameter ) { return org.springframework.core.annotation.SynthesizingMethodParameter ( java.lang.reflect.Parameter . java.lang.reflect.Executable ( ) , findParameterIndex ( java.lang.reflect.Parameter ) ) ; }  <METHOD_END>