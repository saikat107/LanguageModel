<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean = new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean . void ( NUMBER ) ; AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( org.springframework.aop.aspectj.annotation.MultiplyReturnValue .class ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; assertEquals ( STRING , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean . int ( ) * NUMBER , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean = new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean = new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ; AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( PerThisAspect .class ) ; AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( PerThisAspect .class ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.LoggingAspectOnVarargs .class ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; assertTrue ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . boolean ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum ) ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean ) ; assertTrue ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . boolean ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { org.springframework.aop.aspectj.annotation.MultiplyReturnValue org.springframework.aop.aspectj.annotation.MultiplyReturnValue = new org.springframework.aop.aspectj.annotation.MultiplyReturnValue ( ) ; int int = NUMBER ; org.springframework.aop.aspectj.annotation.MultiplyReturnValue . void ( int ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean = new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean . void ( NUMBER ) ; AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( org.springframework.aop.aspectj.annotation.MultiplyReturnValue ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; assertEquals ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean . int ( ) * int , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean ) ; assertEquals ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean . int ( ) * int , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( new PerThisAspect ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.LoggingAspectOnVarargs .class ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; assertTrue ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . boolean ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { AspectJProxyFactory org.springframework.aop.aspectj.annotation.AspectJProxyFactory = new AspectJProxyFactory ( new org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.TestBean ( ) ) ; org.springframework.aop.aspectj.annotation.AspectJProxyFactory . addAspect ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.LoggingAspectOnSetter .class ) ; org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean = org.springframework.aop.aspectj.annotation.AspectJProxyFactory . getProxy ( ) ; assertTrue ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.ITestBean . boolean ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyEnum , org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum . org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyOtherEnum ) ) ; }  <METHOD_END>
<METHOD_START> int int ( )  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) < V extends org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyInterface > boolean boolean ( V ... V[] );  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < V extends org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.MyInterface > boolean boolean ( V ... V[] ) { return true ; }  <METHOD_END>
<METHOD_START> @ Around ( STRING ) public java.lang.Object java.lang.Object ( ProceedingJoinPoint org.springframework.aop.aspectj.annotation.ProceedingJoinPoint ) throws java.lang.Throwable { LogFactory . getLog ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.LoggingAspectOnVarargs .class ) . debug ( java.util.Arrays . java.util.List ( org.springframework.aop.aspectj.annotation.ProceedingJoinPoint . getArgs ( ) ) ) ; return org.springframework.aop.aspectj.annotation.ProceedingJoinPoint . proceed ( ) ; }  <METHOD_END>
<METHOD_START> @ Around ( STRING ) public java.lang.Object java.lang.Object ( ProceedingJoinPoint org.springframework.aop.aspectj.annotation.ProceedingJoinPoint ) throws java.lang.Throwable { LogFactory . getLog ( org.springframework.aop.aspectj.annotation.AspectProxyFactoryTests.LoggingAspectOnSetter .class ) . debug ( java.util.Arrays . java.util.List ( org.springframework.aop.aspectj.annotation.ProceedingJoinPoint . getArgs ( ) ) ) ; return org.springframework.aop.aspectj.annotation.ProceedingJoinPoint . proceed ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ Around ( STRING ) public java.lang.Object java.lang.Object ( ProceedingJoinPoint org.springframework.aop.aspectj.annotation.ProceedingJoinPoint ) throws java.lang.Throwable { ++ this . int ; int int = ( java.lang.Integer ) org.springframework.aop.aspectj.annotation.ProceedingJoinPoint . proceed ( ) ; return int * this . int ; }  <METHOD_END>
