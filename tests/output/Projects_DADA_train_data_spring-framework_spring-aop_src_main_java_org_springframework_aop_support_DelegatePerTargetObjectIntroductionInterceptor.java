<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; this . java.lang.Class<?> = java.lang.Class<> ; java.lang.Object java.lang.Object = java.lang.Object ( ) ; implementInterfacesOnObject ( java.lang.Object ) ; suppressInterface ( IntroductionInterceptor .class ) ; suppressInterface ( DynamicIntroductionAdvice .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.support.MethodInvocation ) throws java.lang.Throwable { if ( isMethodOnIntroducedInterface ( org.springframework.aop.support.MethodInvocation ) ) { java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.aop.support.MethodInvocation . getThis ( ) ) ; java.lang.Object java.lang.Object = AopUtils . invokeJoinpointUsingReflection ( java.lang.Object , org.springframework.aop.support.MethodInvocation . getMethod ( ) , org.springframework.aop.support.MethodInvocation . getArguments ( ) ) ; if ( java.lang.Object == java.lang.Object && org.springframework.aop.support.MethodInvocation instanceof ProxyMethodInvocation ) { java.lang.Object = ( ( ProxyMethodInvocation ) org.springframework.aop.support.MethodInvocation ) . getProxy ( ) ; } return java.lang.Object ; } return java.lang.Object ( org.springframework.aop.support.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.support.MethodInvocation ) throws java.lang.Throwable { return org.springframework.aop.support.MethodInvocation . proceed ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { synchronized ( this . java.util.Map<java.lang.Object,java.lang.Object> ) { if ( this . java.util.Map<java.lang.Object,java.lang.Object> . boolean ( java.lang.Object ) ) { return this . java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object ) ; } else { java.lang.Object java.lang.Object = java.lang.Object ( ) ; this . java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object , java.lang.Object ) ; return java.lang.Object ; } } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( ) { try { return ReflectionUtils . accessibleConstructor ( this . java.lang.Class<> ) . newInstance ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalArgumentException ( STRING + this . java.lang.Class<> . java.lang.String ( ) + STRING + this . java.lang.Class<> . java.lang.String ( ) + STRING + java.lang.Throwable ) ; } }  <METHOD_END>