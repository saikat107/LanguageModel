<METHOD_START> public void ( java.lang.reflect.Method java.lang.reflect.Method , AspectJExpressionPointcut org.springframework.aop.aspectj.AspectJExpressionPointcut , AspectInstanceFactory org.springframework.aop.aspectj.AspectInstanceFactory ) { super( java.lang.reflect.Method , org.springframework.aop.aspectj.AspectJExpressionPointcut , org.springframework.aop.aspectj.AspectInstanceFactory ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { setThrowingNameNoCheck ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.aspectj.MethodInvocation ) throws java.lang.Throwable { try { return org.springframework.aop.aspectj.MethodInvocation . proceed ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { if ( boolean ( java.lang.Throwable ) ) { invokeAdviceMethod ( getJoinPointMatch ( ) , null , java.lang.Throwable ) ; } throw java.lang.Throwable ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Throwable java.lang.Throwable ) { return getDiscoveredThrowingType ( ) . isAssignableFrom ( java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) ) ; }  <METHOD_END>
