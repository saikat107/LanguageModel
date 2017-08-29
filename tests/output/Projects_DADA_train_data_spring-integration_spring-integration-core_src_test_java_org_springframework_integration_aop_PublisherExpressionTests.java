<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.integration.aop.StaticApplicationContext . registerSingleton ( STRING , QueueChannel .class ) ; IntegrationEvaluationContextFactoryBean org.springframework.integration.aop.IntegrationEvaluationContextFactoryBean = new IntegrationEvaluationContextFactoryBean ( ) ; org.springframework.integration.aop.IntegrationEvaluationContextFactoryBean . setApplicationContext ( org.springframework.integration.aop.StaticApplicationContext ) ; org.springframework.integration.aop.IntegrationEvaluationContextFactoryBean . afterPropertiesSet ( ) ; EvaluationContext org.springframework.integration.aop.EvaluationContext = org.springframework.integration.aop.IntegrationEvaluationContextFactoryBean . getObject ( ) ; org.springframework.integration.aop.StaticApplicationContext . getBeanFactory ( ) . registerSingleton ( IntegrationContextUtils . INTEGRATION_EVALUATION_CONTEXT_BEAN_NAME , org.springframework.integration.aop.EvaluationContext ) ; org.springframework.integration.aop.StaticApplicationContext . getBeanFactory ( ) . registerSingleton ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PublisherAnnotationAdvisor org.springframework.integration.aop.PublisherAnnotationAdvisor = new PublisherAnnotationAdvisor ( ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setBeanFactory ( org.springframework.integration.aop.StaticApplicationContext ) ; QueueChannel org.springframework.integration.aop.QueueChannel = org.springframework.integration.aop.StaticApplicationContext . getBean ( STRING , QueueChannel .class ) ; org.springframework.integration.aop.PublisherAnnotationAdvisor . setDefaultChannelName ( STRING ) ; ProxyFactory org.springframework.integration.aop.ProxyFactory = new ProxyFactory ( new org.springframework.integration.aop.PublisherExpressionTests.TestBeanImpl ( ) ) ; org.springframework.integration.aop.ProxyFactory . addAdvisor ( org.springframework.integration.aop.PublisherAnnotationAdvisor ) ; org.springframework.integration.aop.PublisherExpressionTests.TestBean org.springframework.integration.aop.PublisherExpressionTests.TestBean = ( org.springframework.integration.aop.PublisherExpressionTests.TestBean ) org.springframework.integration.aop.ProxyFactory . getProxy ( ) ; org.springframework.integration.aop.PublisherExpressionTests.TestBean . java.lang.String ( STRING ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aop.Message<> ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.aop.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Publisher @ Payload ( STRING ) public java.lang.String java.lang.String ( @ Header ( STRING ) java.lang.String java.lang.String ) { return STRING ; }  <METHOD_END>
