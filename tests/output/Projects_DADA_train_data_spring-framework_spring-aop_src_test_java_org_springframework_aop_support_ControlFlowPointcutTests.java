<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.aop.support.TestBean = new TestBean ( ) ; org.springframework.aop.support.TestBean . setAge ( NUMBER ) ; NopInterceptor org.springframework.aop.support.NopInterceptor = new NopInterceptor ( ) ; ControlFlowPointcut org.springframework.aop.support.ControlFlowPointcut = new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) ; ProxyFactory org.springframework.aop.support.ProxyFactory = new ProxyFactory ( org.springframework.aop.support.TestBean ) ; ITestBean org.springframework.aop.support.ITestBean = ( ITestBean ) org.springframework.aop.support.ProxyFactory . getProxy ( ) ; org.springframework.aop.support.ProxyFactory . addAdvisor ( new DefaultPointcutAdvisor ( org.springframework.aop.support.ControlFlowPointcut , org.springframework.aop.support.NopInterceptor ) ) ; assertEquals ( org.springframework.aop.support.TestBean . getAge ( ) , org.springframework.aop.support.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; assertEquals ( org.springframework.aop.support.TestBean . getAge ( ) , new org.springframework.aop.support.ControlFlowPointcutTests.One ( ) . int ( org.springframework.aop.support.ITestBean ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; assertEquals ( org.springframework.aop.support.TestBean . getAge ( ) , new org.springframework.aop.support.ControlFlowPointcutTests.One ( ) . int ( org.springframework.aop.support.ITestBean ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.ControlFlowPointcut . getEvaluations ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.aop.support.TestBean = new TestBean ( ) ; org.springframework.aop.support.TestBean . setAge ( NUMBER ) ; NopInterceptor org.springframework.aop.support.NopInterceptor = new NopInterceptor ( ) ; ControlFlowPointcut org.springframework.aop.support.ControlFlowPointcut = new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) ; Pointcut org.springframework.aop.support.Pointcut = Pointcuts . intersection ( Pointcuts . SETTERS , org.springframework.aop.support.ControlFlowPointcut ) ; ProxyFactory org.springframework.aop.support.ProxyFactory = new ProxyFactory ( org.springframework.aop.support.TestBean ) ; ITestBean org.springframework.aop.support.ITestBean = ( ITestBean ) org.springframework.aop.support.ProxyFactory . getProxy ( ) ; org.springframework.aop.support.ProxyFactory . addAdvisor ( new DefaultPointcutAdvisor ( org.springframework.aop.support.Pointcut , org.springframework.aop.support.NopInterceptor ) ) ; org.springframework.aop.support.TestBean . setAge ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , new org.springframework.aop.support.ControlFlowPointcutTests.One ( ) . int ( org.springframework.aop.support.ITestBean ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; new org.springframework.aop.support.ControlFlowPointcutTests.One ( ) . void ( org.springframework.aop.support.ITestBean ) ; assertEquals ( NUMBER , org.springframework.aop.support.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.support.ControlFlowPointcut . getEvaluations ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) , new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) ) ; assertEquals ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) , new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) ) ; assertFalse ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) . equals ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) ) ) ; assertEquals ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) . hashCode ( ) , new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) . hashCode ( ) ) ; assertEquals ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) . hashCode ( ) , new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) . hashCode ( ) ) ; assertFalse ( new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class , STRING ) . hashCode ( ) == new ControlFlowPointcut ( org.springframework.aop.support.ControlFlowPointcutTests.One .class ) . hashCode ( ) ) ; }  <METHOD_END>
<METHOD_START> int int ( ITestBean org.springframework.aop.support.ITestBean ) { return org.springframework.aop.support.ITestBean . getAge ( ) ; }  <METHOD_END>
<METHOD_START> int int ( ITestBean org.springframework.aop.support.ITestBean ) { return org.springframework.aop.support.ITestBean . getAge ( ) ; }  <METHOD_END>
<METHOD_START> void void ( ITestBean org.springframework.aop.support.ITestBean ) { org.springframework.aop.support.ITestBean . setAge ( NUMBER ) ; }  <METHOD_END>