<METHOD_START> public void ( AfterReturningAdvice org.springframework.aop.framework.adapter.AfterReturningAdvice ) { Assert . notNull ( org.springframework.aop.framework.adapter.AfterReturningAdvice , STRING ) ; this . org.springframework.aop.framework.adapter.AfterReturningAdvice = org.springframework.aop.framework.adapter.AfterReturningAdvice ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.framework.adapter.MethodInvocation ) throws java.lang.Throwable { java.lang.Object java.lang.Object = org.springframework.aop.framework.adapter.MethodInvocation . proceed ( ) ; this . org.springframework.aop.framework.adapter.AfterReturningAdvice . afterReturning ( java.lang.Object , org.springframework.aop.framework.adapter.MethodInvocation . getMethod ( ) , org.springframework.aop.framework.adapter.MethodInvocation . getArguments ( ) , org.springframework.aop.framework.adapter.MethodInvocation . getThis ( ) ) ; return java.lang.Object ; }  <METHOD_END>