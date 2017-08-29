<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.aop.framework.TestBean = new TestBean ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( org.springframework.aop.framework.TestBean ) ; NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; Advisor org.springframework.aop.framework.Advisor = new DefaultPointcutAdvisor ( new CountingBeforeAdvice ( ) ) ; Advised org.springframework.aop.framework.Advised = ( Advised ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; org.springframework.aop.framework.Advised . addAdvice ( org.springframework.aop.framework.NopInterceptor ) ; org.springframework.aop.framework.ProxyFactory . addAdvisor ( org.springframework.aop.framework.Advisor ) ; assertEquals ( - NUMBER , org.springframework.aop.framework.ProxyFactory . indexOf ( new NopInterceptor ( ) ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.ProxyFactory . indexOf ( org.springframework.aop.framework.NopInterceptor ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.ProxyFactory . indexOf ( org.springframework.aop.framework.Advisor ) ) ; assertEquals ( - NUMBER , org.springframework.aop.framework.Advised . indexOf ( new DefaultPointcutAdvisor ( null ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.aop.framework.TestBean = new TestBean ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( org.springframework.aop.framework.TestBean ) ; NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; CountingBeforeAdvice org.springframework.aop.framework.CountingBeforeAdvice = new CountingBeforeAdvice ( ) ; Advisor org.springframework.aop.framework.Advisor = new DefaultPointcutAdvisor ( org.springframework.aop.framework.CountingBeforeAdvice ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( org.springframework.aop.framework.NopInterceptor ) ; org.springframework.aop.framework.ProxyFactory . addAdvisor ( org.springframework.aop.framework.Advisor ) ; ITestBean org.springframework.aop.framework.ITestBean = ( ITestBean ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; org.springframework.aop.framework.ITestBean . setAge ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . removeAdvisor ( org.springframework.aop.framework.Advisor ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertFalse ( org.springframework.aop.framework.ProxyFactory . removeAdvisor ( new DefaultPointcutAdvisor ( null ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.aop.framework.TestBean = new TestBean ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( org.springframework.aop.framework.TestBean ) ; NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; CountingBeforeAdvice org.springframework.aop.framework.CountingBeforeAdvice = new CountingBeforeAdvice ( ) ; Advisor org.springframework.aop.framework.Advisor = new DefaultPointcutAdvisor ( org.springframework.aop.framework.CountingBeforeAdvice ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( org.springframework.aop.framework.NopInterceptor ) ; org.springframework.aop.framework.ProxyFactory . addAdvisor ( org.springframework.aop.framework.Advisor ) ; NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( org.springframework.aop.framework.NopInterceptor ) ; ITestBean org.springframework.aop.framework.ITestBean = ( ITestBean ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; org.springframework.aop.framework.ITestBean . setAge ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; org.springframework.aop.framework.ProxyFactory . removeAdvisor ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.framework.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; org.springframework.aop.framework.ProxyFactory . removeAdvisor ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.framework.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; try { org.springframework.aop.framework.ProxyFactory . removeAdvisor ( - NUMBER ) ; } catch ( AopConfigException org.springframework.aop.framework.AopConfigException ) { } try { org.springframework.aop.framework.ProxyFactory . removeAdvisor ( NUMBER ) ; } catch ( AopConfigException org.springframework.aop.framework.AopConfigException ) { } assertEquals ( NUMBER , org.springframework.aop.framework.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.aop.framework.TestBean = new TestBean ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( org.springframework.aop.framework.TestBean ) ; NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; CountingBeforeAdvice org.springframework.aop.framework.CountingBeforeAdvice = new CountingBeforeAdvice ( ) ; CountingBeforeAdvice org.springframework.aop.framework.CountingBeforeAdvice = new CountingBeforeAdvice ( ) ; Advisor org.springframework.aop.framework.Advisor = new DefaultPointcutAdvisor ( org.springframework.aop.framework.CountingBeforeAdvice ) ; Advisor org.springframework.aop.framework.Advisor = new DefaultPointcutAdvisor ( org.springframework.aop.framework.CountingBeforeAdvice ) ; org.springframework.aop.framework.ProxyFactory . addAdvisor ( org.springframework.aop.framework.Advisor ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( org.springframework.aop.framework.NopInterceptor ) ; ITestBean org.springframework.aop.framework.ITestBean = ( ITestBean ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; Advised org.springframework.aop.framework.Advised = ( Advised ) org.springframework.aop.framework.ITestBean ; org.springframework.aop.framework.ITestBean . setAge ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertFalse ( org.springframework.aop.framework.Advised . replaceAdvisor ( new DefaultPointcutAdvisor ( new NopInterceptor ( ) ) , org.springframework.aop.framework.Advisor ) ) ; assertTrue ( org.springframework.aop.framework.Advised . replaceAdvisor ( org.springframework.aop.framework.Advisor , org.springframework.aop.framework.Advisor ) ) ; assertEquals ( org.springframework.aop.framework.Advisor , org.springframework.aop.framework.ProxyFactory . getAdvisors ( ) [ NUMBER ] ) ; assertEquals ( NUMBER , org.springframework.aop.framework.ITestBean . getAge ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.NopInterceptor . getCount ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.CountingBeforeAdvice . getCalls ( ) ) ; assertFalse ( org.springframework.aop.framework.ProxyFactory . replaceAdvisor ( new DefaultPointcutAdvisor ( null ) , org.springframework.aop.framework.Advisor ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TimeStamped org.springframework.aop.framework.TimeStamped = new TimeStamped ( ) { @ java.lang.Override public long long ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; } } ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( org.springframework.aop.framework.TimeStamped ) ; org.springframework.aop.framework.ProxyFactory . addInterface ( TimeStamped .class ) ; assertThat ( org.springframework.aop.framework.ProxyFactory . getProxy ( ) , instanceOf ( TimeStamped .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { class TestBeanSubclass extends TestBean implements java.lang.Comparable<java.lang.Object> < java.lang.Object > { @ java.lang.Override public int int ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; } } TestBeanSubclass raw = new TestBeanSubclass ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( raw ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.framework.ProxyFactory . getProxiedInterfaces ( ) . length ) ; ITestBean org.springframework.aop.framework.ITestBean = ( ITestBean ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertThat ( STRING , org.springframework.aop.framework.ITestBean , instanceOf ( IOther .class ) ) ; raw . setAge ( NUMBER ) ; assertTrue ( org.springframework.aop.framework.ITestBean . getAge ( ) == raw . getAge ( ) ) ; long long = NUMBER ; org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor = new org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor ( long ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = org.springframework.aop.framework.ProxyFactory . getProxiedInterfaces ( ) ; org.springframework.aop.framework.ProxyFactory . addAdvisor ( NUMBER , new DefaultIntroductionAdvisor ( org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor , TimeStamped .class ) ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = org.springframework.aop.framework.ProxyFactory . getProxiedInterfaces ( ) ; assertEquals ( STRING , java.lang.Class<?>[] . int + NUMBER , java.lang.Class<?>[] . int ) ; TimeStamped org.springframework.aop.framework.TimeStamped = ( TimeStamped ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( org.springframework.aop.framework.TimeStamped . getTimeStamp ( ) == long ) ; ( ( IOther ) org.springframework.aop.framework.TimeStamped ) . absquatulate ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { class MyInterceptor implements MethodInterceptor { @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.framework.MethodInvocation ) throws java.lang.Throwable { throw new java.lang.UnsupportedOperationException ( ) ; } } NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; NopInterceptor org.springframework.aop.framework.NopInterceptor = new NopInterceptor ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( new TestBean ( ) ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( NUMBER , org.springframework.aop.framework.NopInterceptor ) ; assertThat ( org.springframework.aop.framework.ProxyFactory . getProxy ( ) , instanceOf ( ITestBean .class ) ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . adviceIncluded ( org.springframework.aop.framework.NopInterceptor ) ) ; assertTrue ( ! org.springframework.aop.framework.ProxyFactory . adviceIncluded ( org.springframework.aop.framework.NopInterceptor ) ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . countAdvicesOfType ( NopInterceptor .class ) == NUMBER ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . countAdvicesOfType ( MyInterceptor .class ) == NUMBER ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( NUMBER , org.springframework.aop.framework.NopInterceptor ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . adviceIncluded ( org.springframework.aop.framework.NopInterceptor ) ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . countAdvicesOfType ( NopInterceptor .class ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.framework.MethodInvocation ) throws java.lang.Throwable { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( new TestBean ( ) ) ; assertFalse ( STRING , org.springframework.aop.framework.ProxyFactory . getProxy ( ) instanceof TimeStamped ) ; long long = NUMBER ; org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor = new org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor ( ) ; org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor . void ( long ) ; int int = org.springframework.aop.framework.ProxyFactory . getAdvisors ( ) . length ; org.springframework.aop.framework.ProxyFactory . addAdvisor ( NUMBER , new DefaultIntroductionAdvisor ( org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor , TimeStamped .class ) ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . getAdvisors ( ) . length == int + NUMBER ) ; TimeStamped org.springframework.aop.framework.TimeStamped = ( TimeStamped ) org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( org.springframework.aop.framework.TimeStamped . getTimeStamp ( ) == long ) ; org.springframework.aop.framework.ProxyFactory . removeAdvice ( org.springframework.aop.framework.ProxyFactoryTests.TimestampIntroductionInterceptor ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . getAdvisors ( ) . length == int ) ; try { org.springframework.aop.framework.TimeStamped . getTimeStamp ( ) ; fail ( STRING ) ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) {		} assertFalse ( STRING , org.springframework.aop.framework.ProxyFactory . getProxy ( ) instanceof TimeStamped ) ; org.springframework.aop.framework.ProxyFactory . removeAdvice ( new DebugInterceptor ( ) ) ; assertTrue ( org.springframework.aop.framework.ProxyFactory . getAdvisors ( ) . length == int ) ; ITestBean org.springframework.aop.framework.ITestBean = ( ITestBean ) org.springframework.aop.framework.TimeStamped ; DebugInterceptor org.springframework.aop.framework.DebugInterceptor = new DebugInterceptor ( ) ; org.springframework.aop.framework.ProxyFactory . addAdvice ( NUMBER , org.springframework.aop.framework.DebugInterceptor ) ; org.springframework.aop.framework.ITestBean . getSpouse ( ) ; assertEquals ( NUMBER , org.springframework.aop.framework.DebugInterceptor . getCount ( ) ) ; org.springframework.aop.framework.ProxyFactory . removeAdvice ( org.springframework.aop.framework.DebugInterceptor ) ; org.springframework.aop.framework.ITestBean . getSpouse ( ) ; assertTrue ( org.springframework.aop.framework.DebugInterceptor . getCount ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( ) ; org.springframework.aop.framework.ProxyFactory . setTargetClass ( ITestBean .class ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( STRING , AopUtils . isJdkDynamicProxy ( java.lang.Object ) ) ; assertTrue ( java.lang.Object instanceof ITestBean ) ; assertEquals ( ITestBean .class , AopProxyUtils . ultimateTargetClass ( java.lang.Object ) ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( STRING , AopUtils . isJdkDynamicProxy ( java.lang.Object ) ) ; assertTrue ( java.lang.Object instanceof ITestBean ) ; assertEquals ( ITestBean .class , AopProxyUtils . ultimateTargetClass ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( ) ; org.springframework.aop.framework.ProxyFactory . setTargetClass ( TestBean .class ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( STRING , AopUtils . isCglibProxy ( java.lang.Object ) ) ; assertTrue ( java.lang.Object instanceof TestBean ) ; assertEquals ( TestBean .class , AopProxyUtils . ultimateTargetClass ( java.lang.Object ) ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( java.lang.Object ) ; org.springframework.aop.framework.ProxyFactory . setProxyTargetClass ( true ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( STRING , AopUtils . isCglibProxy ( java.lang.Object ) ) ; assertTrue ( java.lang.Object instanceof TestBean ) ; assertEquals ( TestBean .class , AopProxyUtils . ultimateTargetClass ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore ( STRING ) public void void ( ) { javax.swing.JFrame javax.swing.JFrame = new javax.swing.JFrame ( ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( javax.swing.JFrame ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; assertTrue ( java.lang.Object instanceof javax.swing.RootPaneContainer ) ; assertTrue ( java.lang.Object instanceof javax.accessibility.Accessible ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = new ProxyFactory ( new org.springframework.aop.framework.ProxyFactoryTests.A ( ) ) . getProxy ( ) ; java.lang.Object java.lang.Object = new ProxyFactory ( new org.springframework.aop.framework.ProxyFactoryTests.B ( ) ) . getProxy ( ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( NUMBER ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; AnnotationAwareOrderComparator . sort ( java.util.List<java.lang.Object> ) ; assertSame ( java.lang.Object , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; assertSame ( java.lang.Object , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( new org.springframework.aop.framework.ProxyFactoryTests.A ( ) ) ; org.springframework.aop.framework.ProxyFactory . setProxyTargetClass ( true ) ; ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( new org.springframework.aop.framework.ProxyFactoryTests.B ( ) ) ; org.springframework.aop.framework.ProxyFactory . setProxyTargetClass ( true ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( NUMBER ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; AnnotationAwareOrderComparator . sort ( java.util.List<java.lang.Object> ) ; assertSame ( java.lang.Object , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; assertSame ( java.lang.Object , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> public void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {		}  <METHOD_END>
