<METHOD_START> @ Before public void void ( ) { org.springframework.integration.aop.StaticApplicationContext . registerSingleton ( STRING , QueueChannel .class ) ; org.springframework.integration.aop.StaticApplicationContext . registerSingleton ( STRING , QueueChannel .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PublisherAnnotationAdvisor org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( org.springframework.integration.aop.StaticApplicationContext ) ; QueueChannel org.springframework.integration.aop.QueueChannel = org.springframework.integration.aop.StaticApplicationContext . getBean ( STRING , QueueChannel .class ) ; ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( new org.springframework.integration.aop.PublisherAnnotationAdvisorTests.AnnotationAtMethodLevelTestBeanImpl ( ) ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestVoidBean org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestVoidBean = ( org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestVoidBean ) org.springframework.integration.aop.ProxyFactory . getProxy ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestVoidBean . void ( STRING ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aop.Message<> ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PublisherAnnotationAdvisor org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( org.springframework.integration.aop.StaticApplicationContext ) ; QueueChannel org.springframework.integration.aop.QueueChannel = org.springframework.integration.aop.StaticApplicationContext . getBean ( STRING , QueueChannel .class ) ; ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( new org.springframework.integration.aop.PublisherAnnotationAdvisorTests.AnnotationAtMethodLevelTestBeanImpl ( ) ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean = ( org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean ) org.springframework.integration.aop.ProxyFactory . getProxy ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean . java.lang.String ( ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aop.Message<> ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PublisherAnnotationAdvisor org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( org.springframework.integration.aop.StaticApplicationContext ) ; QueueChannel org.springframework.integration.aop.QueueChannel = org.springframework.integration.aop.StaticApplicationContext . getBean ( STRING , QueueChannel .class ) ; ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( new org.springframework.integration.aop.PublisherAnnotationAdvisorTests.AnnotationAtClassLevelTestBeanImpl ( ) ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean = ( org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean ) org.springframework.integration.aop.ProxyFactory . getProxy ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean . java.lang.String ( ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aop.Message<> ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PublisherAnnotationAdvisor org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( org.springframework.integration.aop.StaticApplicationContext ) ; QueueChannel org.springframework.integration.aop.QueueChannel = org.springframework.integration.aop.StaticApplicationContext . getBean ( STRING , QueueChannel .class ) ; ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( new org.springframework.integration.aop.PublisherAnnotationAdvisorTests.MetaAnnotationAtMethodLevelTestBeanImpl ( ) ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean = ( org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean ) org.springframework.integration.aop.ProxyFactory . getProxy ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean . java.lang.String ( ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aop.Message<> ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PublisherAnnotationAdvisor org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( org.springframework.integration.aop.StaticApplicationContext ) ; QueueChannel org.springframework.integration.aop.QueueChannel = org.springframework.integration.aop.StaticApplicationContext . getBean ( STRING , QueueChannel .class ) ; ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( new org.springframework.integration.aop.PublisherAnnotationAdvisorTests.MetaAnnotationAtClassLevelTestBeanImpl ( ) ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean = ( org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean ) org.springframework.integration.aop.ProxyFactory . getProxy ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestBean . java.lang.String ( ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aop.Message<> ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Publisher ( channel = STRING ) public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Publisher ( channel = STRING ) public void void ( @ Payload java.lang.String java.lang.String ) { }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ org.springframework.integration.aop.PublisherAnnotationAdvisorTests.TestMetaPublisher public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
