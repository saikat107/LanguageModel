<METHOD_START> public void ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ) { this . java.lang.reflect.Constructor<?> = java.lang.reflect.Constructor<> ; if ( java.lang.reflect.Constructor<> . boolean ( ) ) { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) ; this . java.lang.Integer = java.lang.Class<?>[] . int - NUMBER ; } else { this . java.lang.Integer = null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.support.TypedValue org.springframework.expression.spel.support.TypedValue ( EvaluationContext org.springframework.expression.spel.support.EvaluationContext , java.lang.Object ... java.lang.Object[] ) throws org.springframework.expression.spel.support.AccessException { try { if ( java.lang.Object[] != null ) { ReflectionHelper . convertArguments ( org.springframework.expression.spel.support.EvaluationContext . getTypeConverter ( ) , java.lang.Object[] , this . java.lang.reflect.Constructor<> , this . java.lang.Integer ) ; } if ( this . java.lang.reflect.Constructor<> . boolean ( ) ) { java.lang.Object[] = ReflectionHelper . setupArgumentsForVarargsInvocation ( this . java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) , java.lang.Object[] ) ; } ReflectionUtils . makeAccessible ( this . java.lang.reflect.Constructor<> ) ; return new TypedValue ( this . java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new AccessException ( STRING + this . java.lang.reflect.Constructor<> , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> ( ) { return this . java.lang.reflect.Constructor<> ; }  <METHOD_END>