<METHOD_START> @ Test public void void ( ) { ClassPathXmlApplicationContext org.springframework.aop.aspectj.autoproxy.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.aspectj.autoproxy.AspectJAutoProxyCreatorAndLazyInitTargetSourceTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.aspectj.autoproxy.AspectJAutoProxyCreatorAndLazyInitTargetSourceTests> ( ) ) ; ITestBean org.springframework.aop.aspectj.autoproxy.ITestBean = ( ITestBean ) org.springframework.aop.aspectj.autoproxy.ClassPathXmlApplicationContext . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.autoproxy.LazyTestBean . int ) ; assertNotNull ( org.springframework.aop.aspectj.autoproxy.ITestBean ) ; org.springframework.aop.aspectj.autoproxy.ITestBean . getAge ( ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.autoproxy.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.autoproxy.LazyTestBean . int ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { ++ int ; }  <METHOD_END>