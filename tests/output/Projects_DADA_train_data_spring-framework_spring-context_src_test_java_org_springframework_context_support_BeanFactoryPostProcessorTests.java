<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor = new org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor ( ) ; org.springframework.context.support.StaticApplicationContext . addBeanFactoryPostProcessor ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor ) ; assertFalse ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor . boolean ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; assertTrue ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor . boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor .class ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor = ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor ) org.springframework.context.support.StaticApplicationContext . getBean ( STRING ) ; assertTrue ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor . boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor .class , org.springframework.context.support.MutablePropertyValues ) ; MutablePropertyValues org.springframework.context.support.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.context.support.MutablePropertyValues . add ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , PropertyPlaceholderConfigurer .class , org.springframework.context.support.MutablePropertyValues ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor = ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor ) org.springframework.context.support.StaticApplicationContext . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor . java.lang.String ) ; assertTrue ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor . boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.context.support.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.context.support.DefaultListableBeanFactory . registerBeanDefinition ( STRING , new RootBeanDefinition ( TestBean .class ) ) ; org.springframework.context.support.DefaultListableBeanFactory . registerBeanDefinition ( STRING , new RootBeanDefinition ( TestBean .class ) ) ; org.springframework.context.support.DefaultListableBeanFactory . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor .class ) ) ; org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor = ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor ) org.springframework.context.support.DefaultListableBeanFactory . getBean ( STRING ) ; assertFalse ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor . boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor = new org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor ( ) ; org.springframework.context.support.StaticApplicationContext . addBeanFactoryPostProcessor ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor ) ; assertFalse ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor . boolean ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; assertTrue ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor . boolean ) ; assertTrue ( org.springframework.context.support.StaticApplicationContext . getBean ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor .class ) . wasCalled ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , TestBean .class ) ; org.springframework.context.support.StaticApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor2 .class ) ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; assertTrue ( org.springframework.context.support.StaticApplicationContext . getBean ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor .class ) . wasCalled ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; org.springframework.context.support.StaticApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBeanFactoryPostProcessor .class ) ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; assertTrue ( org.springframework.context.support.StaticApplicationContext . getBean ( org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBeanFactoryPostProcessor .class ) . received instanceof ContextRefreshedEvent ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; RootBeanDefinition org.springframework.context.support.RootBeanDefinition = new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.NestingBeanFactoryPostProcessor .class ) ; org.springframework.context.support.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean .class ) ) ; org.springframework.context.support.StaticApplicationContext . registerBeanDefinition ( STRING , org.springframework.context.support.RootBeanDefinition ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; assertTrue ( org.springframework.context.support.StaticApplicationContext . getBean ( org.springframework.context.support.BeanFactoryPostProcessorTests.NestingBeanFactoryPostProcessor .class ) . getListeningBean ( ) . received instanceof ContextRefreshedEvent ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.support.ConfigurableListableBeanFactory ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionRegistry org.springframework.context.support.BeanDefinitionRegistry ) throws org.springframework.context.support.BeansException { org.springframework.context.support.BeanDefinitionRegistry . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanFactoryPostProcessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.support.ConfigurableListableBeanFactory ) throws org.springframework.context.support.BeansException { this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionRegistry org.springframework.context.support.BeanDefinitionRegistry ) throws org.springframework.context.support.BeansException { org.springframework.context.support.BeanDefinitionRegistry . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.support.BeanFactoryPostProcessorTests.TestBeanDefinitionRegistryPostProcessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.support.ConfigurableListableBeanFactory ) throws org.springframework.context.support.BeansException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return HIGHEST_PRECEDENCE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.support.ConfigurableListableBeanFactory ) throws org.springframework.context.support.BeansException {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEvent org.springframework.context.support.ApplicationEvent ) { Assert . state ( this . org.springframework.context.support.ApplicationEvent == null , STRING ) ; this . org.springframework.context.support.ApplicationEvent = org.springframework.context.support.ApplicationEvent ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEvent org.springframework.context.support.ApplicationEvent ) { Assert . state ( this . org.springframework.context.support.ApplicationEvent == null , STRING ) ; this . org.springframework.context.support.ApplicationEvent = org.springframework.context.support.ApplicationEvent ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean ) { this . org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean = org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean ; }  <METHOD_END>
<METHOD_START> public org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean ( ) { return org.springframework.context.support.BeanFactoryPostProcessorTests.ListeningBean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.support.ConfigurableListableBeanFactory ) throws org.springframework.context.support.BeansException {		}  <METHOD_END>
