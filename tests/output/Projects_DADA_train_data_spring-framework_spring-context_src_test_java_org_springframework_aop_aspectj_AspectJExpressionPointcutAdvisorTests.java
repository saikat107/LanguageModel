<METHOD_START> @ Before public void void ( ) { ClassPathXmlApplicationContext org.springframework.aop.aspectj.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisorTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisorTests> ( ) ) ; org.springframework.aop.aspectj.ITestBean = ( ITestBean ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; org.springframework.aop.aspectj.CallCountingInterceptor = ( org.springframework.aop.aspectj.CallCountingInterceptor ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , NUMBER , org.springframework.aop.aspectj.CallCountingInterceptor . int ( ) ) ; org.springframework.aop.aspectj.ITestBean . getSpouses ( ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.aspectj.CallCountingInterceptor . int ( ) ) ; org.springframework.aop.aspectj.ITestBean . getSpouse ( ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.aspectj.CallCountingInterceptor . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.aspectj.MethodInvocation ) throws java.lang.Throwable { int ++ ; return org.springframework.aop.aspectj.MethodInvocation . proceed ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . int = NUMBER ; }  <METHOD_END>
