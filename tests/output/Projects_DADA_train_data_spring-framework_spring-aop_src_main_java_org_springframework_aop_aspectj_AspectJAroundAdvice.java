<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , AspectJExpressionPointcut org.springframework.aop.aspectj.AspectJExpressionPointcut , AspectInstanceFactory org.springframework.aop.aspectj.AspectInstanceFactory ) { super( java.lang.reflect.Method , org.springframework.aop.aspectj.AspectJExpressionPointcut , org.springframework.aop.aspectj.AspectInstanceFactory ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.aspectj.MethodInvocation ) throws java.lang.Throwable { if ( ! ( org.springframework.aop.aspectj.MethodInvocation instanceof ProxyMethodInvocation ) ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.aop.aspectj.MethodInvocation ) ; } ProxyMethodInvocation org.springframework.aop.aspectj.ProxyMethodInvocation = ( ProxyMethodInvocation ) org.springframework.aop.aspectj.MethodInvocation ; ProceedingJoinPoint org.springframework.aop.aspectj.ProceedingJoinPoint = org.springframework.aop.aspectj.ProceedingJoinPoint ( org.springframework.aop.aspectj.ProxyMethodInvocation ) ; JoinPointMatch org.springframework.aop.aspectj.JoinPointMatch = getJoinPointMatch ( org.springframework.aop.aspectj.ProxyMethodInvocation ) ; return invokeAdviceMethod ( org.springframework.aop.aspectj.ProceedingJoinPoint , org.springframework.aop.aspectj.JoinPointMatch , null , null ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.aop.aspectj.ProceedingJoinPoint org.springframework.aop.aspectj.ProceedingJoinPoint ( ProxyMethodInvocation org.springframework.aop.aspectj.ProxyMethodInvocation ) { return new MethodInvocationProceedingJoinPoint ( org.springframework.aop.aspectj.ProxyMethodInvocation ) ; }  <METHOD_END>
