<METHOD_START> @ Test public void void ( ) { AdvisedSupport org.springframework.aop.framework.AdvisedSupport = new AdvisedSupport ( ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . completeProxiedInterfaces ( org.springframework.aop.framework.AdvisedSupport ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Class<?>> ( java.lang.Class<?>[] ) ; assertTrue ( java.util.List<> . boolean ( Advised .class ) ) ; assertTrue ( java.util.List<> . boolean ( SpringProxy .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AdvisedSupport org.springframework.aop.framework.AdvisedSupport = new AdvisedSupport ( ) ; org.springframework.aop.framework.AdvisedSupport . setOpaque ( true ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . completeProxiedInterfaces ( org.springframework.aop.framework.AdvisedSupport ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AdvisedSupport org.springframework.aop.framework.AdvisedSupport = new AdvisedSupport ( ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( ITestBean .class ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( java.lang.Comparable .class ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . completeProxiedInterfaces ( org.springframework.aop.framework.AdvisedSupport ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Class<?>> ( java.lang.Class<?>[] ) ; assertTrue ( java.util.List<> . boolean ( Advised .class ) ) ; assertTrue ( java.util.List<> . boolean ( ITestBean .class ) ) ; assertTrue ( java.util.List<> . boolean ( java.lang.Comparable .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AdvisedSupport org.springframework.aop.framework.AdvisedSupport = new AdvisedSupport ( ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( ITestBean .class ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( java.lang.Comparable .class ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( Advised .class ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . completeProxiedInterfaces ( org.springframework.aop.framework.AdvisedSupport ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Class<?>> ( java.lang.Class<?>[] ) ; assertTrue ( java.util.List<> . boolean ( Advised .class ) ) ; assertTrue ( java.util.List<> . boolean ( ITestBean .class ) ) ; assertTrue ( java.util.List<> . boolean ( java.lang.Comparable .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AdvisedSupport org.springframework.aop.framework.AdvisedSupport = new AdvisedSupport ( ) ; org.springframework.aop.framework.AdvisedSupport . setOpaque ( true ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( ITestBean .class ) ; org.springframework.aop.framework.AdvisedSupport . addInterface ( java.lang.Comparable .class ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . completeProxiedInterfaces ( org.springframework.aop.framework.AdvisedSupport ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; java.util.List<?> < ? > java.util.List<?> = java.util.Arrays . java.util.List<java.lang.Class<?>> ( java.lang.Class<?>[] ) ; assertFalse ( java.util.List<> . boolean ( Advised .class ) ) ; assertTrue ( java.util.List<> . boolean ( ITestBean .class ) ) ; assertTrue ( java.util.List<> . boolean ( java.lang.Comparable .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( ) ; org.springframework.aop.framework.ProxyFactory . setTarget ( new TestBean ( ) ) ; org.springframework.aop.framework.ProxyFactory . addInterface ( ITestBean .class ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . proxiedUserInterfaces ( java.lang.Object ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; assertEquals ( ITestBean .class , java.lang.Class<?>[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( ) ; org.springframework.aop.framework.ProxyFactory . setTarget ( new TestBean ( ) ) ; org.springframework.aop.framework.ProxyFactory . addInterface ( ITestBean .class ) ; org.springframework.aop.framework.ProxyFactory . addInterface ( java.lang.Comparable .class ) ; java.lang.Object java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = AopProxyUtils . proxiedUserInterfaces ( java.lang.Object ) ; assertEquals ( NUMBER , java.lang.Class<?>[] . int ) ; assertEquals ( ITestBean .class , java.lang.Class<?>[] [ NUMBER ] ) ; assertEquals ( java.lang.Comparable .class , java.lang.Class<?>[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { java.lang.Object java.lang.Object = java.lang.reflect.Proxy . java.lang.Object ( java.lang.Class<? extends org.springframework.aop.framework.AopProxyUtilsTests> ( ) . java.lang.ClassLoader ( ) , new java.lang.Class [ NUMBER ] , ( java.lang.Object , java.lang.reflect.Method , java.lang.Object[] ) -> null ) ; AopProxyUtils . proxiedUserInterfaces ( java.lang.Object ) ; }  <METHOD_END>