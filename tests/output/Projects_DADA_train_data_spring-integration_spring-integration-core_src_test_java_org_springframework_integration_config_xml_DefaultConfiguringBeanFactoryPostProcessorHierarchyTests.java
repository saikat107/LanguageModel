<METHOD_START> @ Test public void void ( ) { ClassPathXmlApplicationContext org.springframework.integration.config.xml.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.config.xml.DefaultConfiguringBeanFactoryPostProcessorHierarchyTests> ( ) ) ; org.springframework.integration.config.xml.ClassPathXmlApplicationContext . refresh ( ) ; GenericApplicationContext org.springframework.integration.config.xml.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.integration.config.xml.GenericApplicationContext . setParent ( org.springframework.integration.config.xml.ClassPathXmlApplicationContext ) ; XmlBeanDefinitionReader org.springframework.integration.config.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.integration.config.xml.GenericApplicationContext ) ; org.springframework.integration.config.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , this . java.lang.Class<? extends org.springframework.integration.config.xml.DefaultConfiguringBeanFactoryPostProcessorHierarchyTests> ( ) ) ) ; org.springframework.integration.config.xml.GenericApplicationContext . refresh ( ) ; assertSame ( org.springframework.integration.config.xml.ClassPathXmlApplicationContext . getBean ( IntegrationContextUtils . ERROR_CHANNEL_BEAN_NAME ) , org.springframework.integration.config.xml.GenericApplicationContext . getBean ( IntegrationContextUtils . ERROR_CHANNEL_BEAN_NAME ) ) ; assertSame ( org.springframework.integration.config.xml.ClassPathXmlApplicationContext . getBean ( IntegrationContextUtils . NULL_CHANNEL_BEAN_NAME ) , org.springframework.integration.config.xml.GenericApplicationContext . getBean ( IntegrationContextUtils . NULL_CHANNEL_BEAN_NAME ) ) ; assertSame ( org.springframework.integration.config.xml.ClassPathXmlApplicationContext . getBean ( IntegrationContextUtils . TASK_SCHEDULER_BEAN_NAME ) , org.springframework.integration.config.xml.GenericApplicationContext . getBean ( IntegrationContextUtils . TASK_SCHEDULER_BEAN_NAME ) ) ; }  <METHOD_END>