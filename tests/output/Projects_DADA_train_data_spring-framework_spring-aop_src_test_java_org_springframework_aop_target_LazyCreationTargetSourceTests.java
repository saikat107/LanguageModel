<METHOD_START> @ Test public void void ( ) { TargetSource org.springframework.aop.target.TargetSource = new AbstractLazyCreationTargetSource ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { return new org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean ( ) ; } @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean .class ; } } ; org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean = ( org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean ) ProxyFactory . getProxy ( org.springframework.aop.target.TargetSource ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean . int ) ; assertEquals ( STRING , org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean .class , org.springframework.aop.target.TargetSource . getTargetClass ( ) ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean . int ) ; org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean . void ( ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean . int ) ; org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean . void ( ) ; assertEquals ( STRING , NUMBER , org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean . int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) { return new org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean .class ; }  <METHOD_END>
<METHOD_START> public void ( ) { if ( org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean .class . boolean ( java.lang.Class<? extends org.springframework.aop.target.LazyCreationTargetSourceTests.InitCountingBean> ( ) ) ) { int ++ ; } }  <METHOD_END>
<METHOD_START> public void void ( ) { }  <METHOD_END>
