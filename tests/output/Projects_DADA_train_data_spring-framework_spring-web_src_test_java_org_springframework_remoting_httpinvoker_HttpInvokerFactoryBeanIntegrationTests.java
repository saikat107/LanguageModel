<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { ApplicationContext org.springframework.remoting.httpinvoker.ApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.InvokerAutowiringConfig .class ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean = org.springframework.remoting.httpinvoker.ApplicationContext . getBean ( STRING , org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean .class ) ; assertSame ( org.springframework.remoting.httpinvoker.ApplicationContext . getBean ( STRING ) , org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService . void ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { AnnotationConfigApplicationContext org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.InvokerAutowiringConfig .class . java.lang.String ( ) ) ) ; org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean = org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . getBean ( STRING , org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean .class ) ; assertSame ( org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . getBean ( STRING ) , org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService . void ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { AnnotationConfigApplicationContext org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . register ( org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.ConfigWithPlainFactoryBean .class ) ; org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean = org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . getBean ( STRING , org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean .class ) ; assertSame ( org.springframework.remoting.httpinvoker.AnnotationConfigApplicationContext . getBean ( STRING ) , org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService . void ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean . org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( )  <METHOD_END>
<METHOD_START> @ Async public void void ( )  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.remoting.httpinvoker.AsyncAnnotationBeanPostProcessor org.springframework.remoting.httpinvoker.AsyncAnnotationBeanPostProcessor ( ) { return new AsyncAnnotationBeanPostProcessor ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean ( ) { HttpInvokerProxyFactoryBean org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean . setServiceUrl ( STRING ) ; org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean . setServiceInterface ( org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService .class ) ; org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean . setHttpInvokerRequestExecutor ( new HttpInvokerRequestExecutor ( ) { @ java.lang.Override public org.springframework.remoting.httpinvoker.RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult ( HttpInvokerClientConfiguration org.springframework.remoting.httpinvoker.HttpInvokerClientConfiguration , RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation ) { return new RemoteInvocationResult ( null ) ; } } ) ; return org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.remoting.httpinvoker.RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult ( HttpInvokerClientConfiguration org.springframework.remoting.httpinvoker.HttpInvokerClientConfiguration , RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation ) { return new RemoteInvocationResult ( null ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.remoting.httpinvoker.FactoryBean<java.lang.String> < java.lang.String > org.springframework.remoting.httpinvoker.FactoryBean<java.lang.String> ( ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean ( ) { return new org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyBean ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean ( ) { java.lang.String java.lang.String = org.springframework.remoting.httpinvoker.Environment . getProperty ( STRING ) ; HttpInvokerProxyFactoryBean org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean ( ) ; org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean . setServiceUrl ( STRING + java.lang.String ) ; org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean . setServiceInterface ( org.springframework.remoting.httpinvoker.HttpInvokerFactoryBeanIntegrationTests.MyService .class ) ; org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean . setHttpInvokerRequestExecutor ( new HttpInvokerRequestExecutor ( ) { @ java.lang.Override public org.springframework.remoting.httpinvoker.RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult ( HttpInvokerClientConfiguration org.springframework.remoting.httpinvoker.HttpInvokerClientConfiguration , RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation ) { return new RemoteInvocationResult ( null ) ; } } ) ; return org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.remoting.httpinvoker.RemoteInvocationResult org.springframework.remoting.httpinvoker.RemoteInvocationResult ( HttpInvokerClientConfiguration org.springframework.remoting.httpinvoker.HttpInvokerClientConfiguration , RemoteInvocation org.springframework.remoting.httpinvoker.RemoteInvocation ) { return new RemoteInvocationResult ( null ) ; }  <METHOD_END>