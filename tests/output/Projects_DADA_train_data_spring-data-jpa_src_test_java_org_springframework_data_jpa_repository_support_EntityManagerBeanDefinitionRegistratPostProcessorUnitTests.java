<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.data.jpa.repository.support.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.data.jpa.repository.support.DefaultListableBeanFactory . registerBeanDefinition ( STRING , new RootBeanDefinition ( LocalContainerEntityManagerFactoryBean .class ) ) ; ConfigurableListableBeanFactory org.springframework.data.jpa.repository.support.ConfigurableListableBeanFactory = new DefaultListableBeanFactory ( org.springframework.data.jpa.repository.support.DefaultListableBeanFactory ) ; BeanFactoryPostProcessor org.springframework.data.jpa.repository.support.BeanFactoryPostProcessor = new EntityManagerBeanDefinitionRegistrarPostProcessor ( ) ; org.springframework.data.jpa.repository.support.BeanFactoryPostProcessor . postProcessBeanFactory ( org.springframework.data.jpa.repository.support.ConfigurableListableBeanFactory ) ; assertThat ( org.springframework.data.jpa.repository.support.DefaultListableBeanFactory . getBeanDefinitionCount ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinitionBuilder org.springframework.data.jpa.repository.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistratPostProcessorUnitTests.StubEntityManagerFactoryBean .class ) ; org.springframework.data.jpa.repository.support.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistratPostProcessorUnitTests.SpecialEntityManagerFactory .class ) ; DefaultListableBeanFactory org.springframework.data.jpa.repository.support.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.data.jpa.repository.support.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.data.jpa.repository.support.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; BeanFactoryPostProcessor org.springframework.data.jpa.repository.support.BeanFactoryPostProcessor = new EntityManagerBeanDefinitionRegistrarPostProcessor ( ) ; org.springframework.data.jpa.repository.support.BeanFactoryPostProcessor . postProcessBeanFactory ( org.springframework.data.jpa.repository.support.DefaultListableBeanFactory ) ; assertThat ( org.springframework.data.jpa.repository.support.DefaultListableBeanFactory . getBeanDefinitionCount ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<? extends org.springframework.data.jpa.repository.support.EntityManagerFactory> < ? extends EntityManagerFactory > java.lang.Class<? extends org.springframework.data.jpa.repository.support.EntityManagerFactory> ) { this . java.lang.Class<? extends org.springframework.data.jpa.repository.support.EntityManagerFactory> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends org.springframework.data.jpa.repository.support.EntityManagerFactory> < ? extends EntityManagerFactory > java.lang.Class<? extends org.springframework.data.jpa.repository.support.EntityManagerFactory> ( ) { return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.jpa.repository.support.EntityManagerFactory org.springframework.data.jpa.repository.support.EntityManagerFactory ( EntityManagerFactory org.springframework.data.jpa.repository.support.EntityManagerFactory ) { return mock ( java.lang.Class<> ) ; }  <METHOD_END>