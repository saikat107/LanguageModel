<METHOD_START> public void ( RepositoryConfigurationSource org.springframework.data.repository.config.RepositoryConfigurationSource , ResourceLoader org.springframework.data.repository.config.ResourceLoader , Environment org.springframework.data.repository.config.Environment ) { this . boolean = org.springframework.data.repository.config.RepositoryConfigurationSource instanceof XmlRepositoryConfigurationSource ; boolean boolean = org.springframework.data.repository.config.RepositoryConfigurationSource instanceof AnnotationRepositoryConfigurationSource ; Assert . isTrue ( boolean || boolean , STRING ) ; Assert . notNull ( org.springframework.data.repository.config.ResourceLoader , STRING ) ; RepositoryBeanNameGenerator org.springframework.data.repository.config.RepositoryBeanNameGenerator = new RepositoryBeanNameGenerator ( ) ; org.springframework.data.repository.config.RepositoryBeanNameGenerator . setBeanClassLoader ( org.springframework.data.repository.config.ResourceLoader . getClassLoader ( ) ) ; this . org.springframework.data.repository.config.BeanNameGenerator = org.springframework.data.repository.config.RepositoryBeanNameGenerator ; this . org.springframework.data.repository.config.RepositoryConfigurationSource = org.springframework.data.repository.config.RepositoryConfigurationSource ; this . org.springframework.data.repository.config.ResourceLoader = org.springframework.data.repository.config.ResourceLoader ; this . org.springframework.data.repository.config.Environment = org.springframework.data.repository.config.Environment ( org.springframework.data.repository.config.Environment , org.springframework.data.repository.config.ResourceLoader ) ; this . boolean = boolean ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.repository.config.Environment org.springframework.data.repository.config.Environment ( Environment org.springframework.data.repository.config.Environment , ResourceLoader org.springframework.data.repository.config.ResourceLoader ) { if ( org.springframework.data.repository.config.Environment != null ) { return org.springframework.data.repository.config.Environment ; } return org.springframework.data.repository.config.ResourceLoader instanceof EnvironmentCapable ? ( ( EnvironmentCapable ) org.springframework.data.repository.config.ResourceLoader ) . getEnvironment ( ) : new StandardEnvironment ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.repository.config.BeanComponentDefinition> < BeanComponentDefinition > java.util.List<org.springframework.data.repository.config.BeanComponentDefinition> ( BeanDefinitionRegistry org.springframework.data.repository.config.BeanDefinitionRegistry , RepositoryConfigurationExtension org.springframework.data.repository.config.RepositoryConfigurationExtension ) { org.springframework.data.repository.config.RepositoryConfigurationExtension . registerBeansForRoot ( org.springframework.data.repository.config.BeanDefinitionRegistry , org.springframework.data.repository.config.RepositoryConfigurationSource ) ; RepositoryBeanDefinitionBuilder org.springframework.data.repository.config.RepositoryBeanDefinitionBuilder = new RepositoryBeanDefinitionBuilder ( org.springframework.data.repository.config.BeanDefinitionRegistry , org.springframework.data.repository.config.RepositoryConfigurationExtension , org.springframework.data.repository.config.ResourceLoader , org.springframework.data.repository.config.Environment ) ; java.util.List<org.springframework.data.repository.config.BeanComponentDefinition> < BeanComponentDefinition > java.util.List<org.springframework.data.repository.config.BeanComponentDefinition> = new java.util.ArrayList<org.springframework.data.repository.config.BeanComponentDefinition> <> ( ) ; for ( RepositoryConfiguration < ? extends RepositoryConfigurationSource > org.springframework.data.repository.config.RepositoryConfiguration<? extends org.springframework.data.repository.config.RepositoryConfigurationSource> : org.springframework.data.repository.config.RepositoryConfigurationExtension . getRepositoryConfigurations ( org.springframework.data.repository.config.RepositoryConfigurationSource , org.springframework.data.repository.config.ResourceLoader , boolean ) ) { BeanDefinitionBuilder org.springframework.data.repository.config.BeanDefinitionBuilder = org.springframework.data.repository.config.RepositoryBeanDefinitionBuilder . build ( org.springframework.data.repository.config.RepositoryConfiguration<> ) ; org.springframework.data.repository.config.RepositoryConfigurationExtension . postProcess ( org.springframework.data.repository.config.BeanDefinitionBuilder , org.springframework.data.repository.config.RepositoryConfigurationSource ) ; if ( boolean ) { org.springframework.data.repository.config.RepositoryConfigurationExtension . postProcess ( org.springframework.data.repository.config.BeanDefinitionBuilder , ( XmlRepositoryConfigurationSource ) org.springframework.data.repository.config.RepositoryConfigurationSource ) ; } else { org.springframework.data.repository.config.RepositoryConfigurationExtension . postProcess ( org.springframework.data.repository.config.BeanDefinitionBuilder , ( AnnotationRepositoryConfigurationSource ) org.springframework.data.repository.config.RepositoryConfigurationSource ) ; } AbstractBeanDefinition org.springframework.data.repository.config.AbstractBeanDefinition = org.springframework.data.repository.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; java.lang.String java.lang.String = org.springframework.data.repository.config.BeanNameGenerator . generateBeanName ( org.springframework.data.repository.config.AbstractBeanDefinition , org.springframework.data.repository.config.BeanDefinitionRegistry ) ; if ( org.springframework.data.repository.config.Logger . isDebugEnabled ( ) ) { org.springframework.data.repository.config.Logger . debug ( java.lang.String , org.springframework.data.repository.config.RepositoryConfigurationExtension . getModuleName ( ) , java.lang.String , org.springframework.data.repository.config.RepositoryConfiguration<> . getRepositoryInterface ( ) , org.springframework.data.repository.config.RepositoryConfiguration<> . getRepositoryFactoryBeanClassName ( ) ) ; } org.springframework.data.repository.config.AbstractBeanDefinition . setAttribute ( java.lang.String , org.springframework.data.repository.config.RepositoryConfiguration<> . getRepositoryInterface ( ) ) ; org.springframework.data.repository.config.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.data.repository.config.AbstractBeanDefinition ) ; java.util.List<org.springframework.data.repository.config.BeanComponentDefinition> . add ( new BeanComponentDefinition ( org.springframework.data.repository.config.AbstractBeanDefinition , java.lang.String ) ) ; } return java.util.List<org.springframework.data.repository.config.BeanComponentDefinition> ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { boolean boolean = SpringFactoriesLoader . loadFactoryNames ( RepositoryFactorySupport .class , org.springframework.data.repository.config.ResourceLoader . getClassLoader ( ) ) . size ( ) > NUMBER ; if ( boolean ) { org.springframework.data.repository.config.Logger . info ( java.lang.String ) ; } return boolean ; }  <METHOD_END>
