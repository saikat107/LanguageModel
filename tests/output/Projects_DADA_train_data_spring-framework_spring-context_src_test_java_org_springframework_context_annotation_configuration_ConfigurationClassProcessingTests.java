<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithCustomName .class , ( ) org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithCustomName . org.springframework.context.annotation.configuration.TestBean , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithCustomNameConfiguredViaValueAttribute .class , ( ) org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithCustomNameConfiguredViaValueAttribute . org.springframework.context.annotation.configuration.TestBean , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.util.function.Supplier<org.springframework.context.annotation.configuration.TestBean> < TestBean > java.util.function.Supplier<org.springframework.context.annotation.configuration.TestBean> , java.lang.String java.lang.String ) { GenericApplicationContext org.springframework.context.annotation.configuration.GenericApplicationContext = new GenericApplicationContext ( ) ; AnnotationConfigUtils . registerAnnotationConfigProcessors ( org.springframework.context.annotation.configuration.GenericApplicationContext ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( java.lang.Class<> ) ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . refresh ( ) ; assertSame ( java.util.function.Supplier<org.springframework.context.annotation.configuration.TestBean> . get ( ) , org.springframework.context.annotation.configuration.GenericApplicationContext . getBean ( java.lang.String ) ) ; org.springframework.context.annotation.configuration.ExpectedException . expect ( NoSuchBeanDefinitionException .class ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithAliases .class , ( ) org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithAliases . org.springframework.context.annotation.configuration.TestBean , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithAliasesConfiguredViaValueAttribute .class , ( ) org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithAliasesConfiguredViaValueAttribute . org.springframework.context.annotation.configuration.TestBean , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.util.function.Supplier<org.springframework.context.annotation.configuration.TestBean> < TestBean > java.util.function.Supplier<org.springframework.context.annotation.configuration.TestBean> , java.lang.String java.lang.String ) { TestBean org.springframework.context.annotation.configuration.TestBean = java.util.function.Supplier<org.springframework.context.annotation.configuration.TestBean> . get ( ) ; BeanFactory org.springframework.context.annotation.configuration.BeanFactory = org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( java.lang.Class<> ) ; assertSame ( org.springframework.context.annotation.configuration.TestBean , org.springframework.context.annotation.configuration.BeanFactory . getBean ( java.lang.String ) ) ; java.util.Arrays . java.util.stream.IntStream ( org.springframework.context.annotation.configuration.BeanFactory . getAliases ( java.lang.String ) ) . map ( org.springframework.context.annotation.configuration.BeanFactory :: getBean ) . forEach ( alias -> assertSame ( testBean , alias ) ) ; org.springframework.context.annotation.configuration.ExpectedException . expect ( NoSuchBeanDefinitionException .class ) ; org.springframework.context.annotation.configuration.BeanFactory . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GenericApplicationContext org.springframework.context.annotation.configuration.GenericApplicationContext = new GenericApplicationContext ( ) ; AnnotationConfigUtils . registerAnnotationConfigProcessors ( org.springframework.context.annotation.configuration.GenericApplicationContext ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithProviderImplementation .class ) ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . refresh ( ) ; assertSame ( org.springframework.context.annotation.configuration.GenericApplicationContext . getBean ( STRING ) , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithBeanWithProviderImplementation . org.springframework.context.annotation.configuration.TestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GenericApplicationContext org.springframework.context.annotation.configuration.GenericApplicationContext = new GenericApplicationContext ( ) ; AnnotationConfigUtils . registerAnnotationConfigProcessors ( org.springframework.context.annotation.configuration.GenericApplicationContext ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithSetWithProviderImplementation .class ) ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . refresh ( ) ; assertSame ( org.springframework.context.annotation.configuration.GenericApplicationContext . getBean ( STRING ) , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithSetWithProviderImplementation . java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.context.annotation.configuration.ExpectedException . expect ( BeanDefinitionParsingException .class ) ; org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithFinalBean .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanFactory org.springframework.context.annotation.configuration.BeanFactory = org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SimplestPossibleConfig .class ) ; java.lang.String java.lang.String = org.springframework.context.annotation.configuration.BeanFactory . getBean ( STRING , java.lang.String .class ) ; assertEquals ( java.lang.String , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanFactory org.springframework.context.annotation.configuration.BeanFactory = org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithNonSpecificReturnTypes .class ) ; assertEquals ( java.lang.Object .class , org.springframework.context.annotation.configuration.BeanFactory . getType ( STRING ) ) ; assertFalse ( org.springframework.context.annotation.configuration.BeanFactory . isTypeMatch ( STRING , java.lang.String .class ) ) ; java.lang.String java.lang.String = org.springframework.context.annotation.configuration.BeanFactory . getBean ( STRING , java.lang.String .class ) ; assertEquals ( java.lang.String , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ListableBeanFactory org.springframework.context.annotation.configuration.ListableBeanFactory = org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithNonSpecificReturnTypes .class ) ; assertEquals ( java.util.List .class , org.springframework.context.annotation.configuration.ListableBeanFactory . getType ( STRING ) ) ; assertTrue ( org.springframework.context.annotation.configuration.ListableBeanFactory . isTypeMatch ( STRING , java.util.List .class ) ) ; assertEquals ( FactoryBean .class , org.springframework.context.annotation.configuration.ListableBeanFactory . getType ( STRING ) ) ; assertTrue ( org.springframework.context.annotation.configuration.ListableBeanFactory . isTypeMatch ( STRING , FactoryBean .class ) ) ; assertFalse ( org.springframework.context.annotation.configuration.ListableBeanFactory . isTypeMatch ( STRING , BeanClassLoaderAware .class ) ) ; assertFalse ( org.springframework.context.annotation.configuration.ListableBeanFactory . isTypeMatch ( STRING , ListFactoryBean .class ) ) ; assertTrue ( org.springframework.context.annotation.configuration.ListableBeanFactory . getBean ( STRING ) instanceof java.util.List ) ; java.lang.String [] java.lang.String[] = org.springframework.context.annotation.configuration.ListableBeanFactory . getBeanNamesForType ( FactoryBean .class ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertEquals ( STRING , java.lang.String[] [ NUMBER ] ) ; java.lang.String[] = org.springframework.context.annotation.configuration.ListableBeanFactory . getBeanNamesForType ( BeanClassLoaderAware .class ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertEquals ( STRING , java.lang.String[] [ NUMBER ] ) ; java.lang.String[] = org.springframework.context.annotation.configuration.ListableBeanFactory . getBeanNamesForType ( ListFactoryBean .class ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertEquals ( STRING , java.lang.String[] [ NUMBER ] ) ; java.lang.String[] = org.springframework.context.annotation.configuration.ListableBeanFactory . getBeanNamesForType ( java.util.List .class ) ; assertEquals ( STRING , java.lang.String[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanFactory org.springframework.context.annotation.configuration.BeanFactory = org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithPrototypeBean .class ) ; TestBean org.springframework.context.annotation.configuration.TestBean = org.springframework.context.annotation.configuration.BeanFactory . getBean ( STRING , TestBean .class ) ; ITestBean org.springframework.context.annotation.configuration.ITestBean = org.springframework.context.annotation.configuration.BeanFactory . getBean ( STRING , ITestBean .class ) ; ITestBean org.springframework.context.annotation.configuration.ITestBean = org.springframework.context.annotation.configuration.BeanFactory . getBean ( STRING , ITestBean .class ) ; assertSame ( org.springframework.context.annotation.configuration.TestBean . getSpouse ( ) , org.springframework.context.annotation.configuration.ITestBean ) ; assertNotSame ( org.springframework.context.annotation.configuration.ITestBean . getSpouse ( ) , org.springframework.context.annotation.configuration.ITestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithPrototypeBean .class , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints .class ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints = org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints .class ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints . org.springframework.context.annotation.configuration.TestBean . getName ( ) ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints . org.springframework.context.annotation.configuration.TestBean . getName ( ) ) ; org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints = org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints .class ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints . org.springframework.context.annotation.configuration.TestBean . getName ( ) ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.AdaptiveInjectionPoints . org.springframework.context.annotation.configuration.TestBean . getName ( ) ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.ConfigWithPostProcessor .class ) ; RootBeanDefinition org.springframework.context.annotation.configuration.RootBeanDefinition = new RootBeanDefinition ( PropertyPlaceholderConfigurer .class ) ; org.springframework.context.annotation.configuration.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , STRING ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . registerBeanDefinition ( STRING , org.springframework.context.annotation.configuration.RootBeanDefinition ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . refresh ( ) ; TestBean org.springframework.context.annotation.configuration.TestBean = org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; ITestBean org.springframework.context.annotation.configuration.ITestBean = org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . getBean ( STRING , ITestBean .class ) ; ITestBean org.springframework.context.annotation.configuration.ITestBean = org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . getBean ( STRING , ITestBean .class ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.TestBean . getName ( ) ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.ITestBean . getName ( ) ) ; assertEquals ( STRING , org.springframework.context.annotation.configuration.ITestBean . getName ( ) ) ; org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean = org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . getBean ( STRING , org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean .class ) ; assertTrue ( org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean . boolean ) ; org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.context.annotation.configuration.DefaultListableBeanFactory org.springframework.context.annotation.configuration.DefaultListableBeanFactory ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { DefaultListableBeanFactory org.springframework.context.annotation.configuration.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) ; org.springframework.context.annotation.configuration.DefaultListableBeanFactory . registerBeanDefinition ( java.lang.String , new RootBeanDefinition ( java.lang.Class<> ) ) ; } ConfigurationClassPostProcessor org.springframework.context.annotation.configuration.ConfigurationClassPostProcessor = new ConfigurationClassPostProcessor ( ) ; org.springframework.context.annotation.configuration.ConfigurationClassPostProcessor . postProcessBeanDefinitionRegistry ( org.springframework.context.annotation.configuration.DefaultListableBeanFactory ) ; org.springframework.context.annotation.configuration.ConfigurationClassPostProcessor . postProcessBeanFactory ( org.springframework.context.annotation.configuration.DefaultListableBeanFactory ) ; RequiredAnnotationBeanPostProcessor org.springframework.context.annotation.configuration.RequiredAnnotationBeanPostProcessor = new RequiredAnnotationBeanPostProcessor ( ) ; org.springframework.context.annotation.configuration.RequiredAnnotationBeanPostProcessor . setBeanFactory ( org.springframework.context.annotation.configuration.DefaultListableBeanFactory ) ; org.springframework.context.annotation.configuration.DefaultListableBeanFactory . addBeanPostProcessor ( org.springframework.context.annotation.configuration.RequiredAnnotationBeanPostProcessor ) ; org.springframework.context.annotation.configuration.DefaultListableBeanFactory . freezeConfiguration ( ) ; return org.springframework.context.annotation.configuration.DefaultListableBeanFactory ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean ( STRING ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = { STRING , STRING , STRING , STRING } ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean ( { STRING , STRING , STRING , STRING } ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) public java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public final @ Bean org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return new TestBean ( ) ; }  <METHOD_END>
<METHOD_START> public @ Bean java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public @ Bean java.lang.Object java.lang.Object ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public @ Bean org.springframework.context.annotation.configuration.FactoryBean<?> < ? > org.springframework.context.annotation.configuration.FactoryBean<?> ( ) { ListFactoryBean org.springframework.context.annotation.configuration.ListFactoryBean = new ListFactoryBean ( ) ; org.springframework.context.annotation.configuration.ListFactoryBean . setSourceList ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; return org.springframework.context.annotation.configuration.ListFactoryBean ; }  <METHOD_END>
<METHOD_START> public @ Bean org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { TestBean org.springframework.context.annotation.configuration.TestBean = new org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean ( STRING ) ; org.springframework.context.annotation.configuration.TestBean . setSpouse ( org.springframework.context.annotation.configuration.TestBean ( ) ) ; return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> public @ Bean org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { TestBean org.springframework.context.annotation.configuration.TestBean = new org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean ( STRING ) ; org.springframework.context.annotation.configuration.TestBean . setSpouse ( org.springframework.context.annotation.configuration.TestBean ( ) ) ; return org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( InjectionPoint org.springframework.context.annotation.configuration.InjectionPoint ) { return new TestBean ( org.springframework.context.annotation.configuration.InjectionPoint . getMember ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( DependencyDescriptor org.springframework.context.annotation.configuration.DependencyDescriptor ) { return new TestBean ( org.springframework.context.annotation.configuration.DependencyDescriptor . getMember ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Autowired @ Qualifier ( STRING ) public void void ( TestBean org.springframework.context.annotation.configuration.TestBean ) { this . org.springframework.context.annotation.configuration.TestBean = org.springframework.context.annotation.configuration.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.POBPP org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.POBPP ( ) { return new org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.POBPP ( ) { java.lang.String java.lang.String = STRING + java.lang.String ; public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; } @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { if ( java.lang.Object instanceof ITestBean ) { ( ( ITestBean ) java.lang.Object ) . setName ( ( ( ITestBean ) java.lang.Object ) . getName ( ) + java.lang.String ) ; } return java.lang.Object ; } @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { return java.lang.Object ; } public int int ( ) { return NUMBER ; } } ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { if ( java.lang.Object instanceof ITestBean ) { ( ( ITestBean ) java.lang.Object ) . setName ( ( ( ITestBean ) java.lang.Object ) . getName ( ) + java.lang.String ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> public org.springframework.context.annotation.configuration.BeanFactoryPostProcessor org.springframework.context.annotation.configuration.BeanFactoryPostProcessor ( ) { return new BeanFactoryPostProcessor ( ) { @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.annotation.configuration.ConfigurableListableBeanFactory ) { BeanDefinition org.springframework.context.annotation.configuration.BeanDefinition = org.springframework.context.annotation.configuration.ConfigurableListableBeanFactory . getBeanDefinition ( STRING ) ; org.springframework.context.annotation.configuration.BeanDefinition . getPropertyValues ( ) . addPropertyValue ( STRING , STRING + java.lang.String ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.annotation.configuration.ConfigurableListableBeanFactory ) { BeanDefinition org.springframework.context.annotation.configuration.BeanDefinition = org.springframework.context.annotation.configuration.ConfigurableListableBeanFactory . getBeanDefinition ( STRING ) ; org.springframework.context.annotation.configuration.BeanDefinition . getPropertyValues ( ) . addPropertyValue ( STRING , STRING + java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation.configuration.ITestBean org.springframework.context.annotation.configuration.ITestBean ( ) { return new org.springframework.context.annotation.configuration.ConfigurationClassProcessingTests.SpousyTestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Required public void void ( ITestBean org.springframework.context.annotation.configuration.ITestBean ) { super. setSpouse ( org.springframework.context.annotation.configuration.ITestBean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ContextRefreshedEvent org.springframework.context.annotation.configuration.ContextRefreshedEvent ) { this . boolean = true ; }  <METHOD_END>
