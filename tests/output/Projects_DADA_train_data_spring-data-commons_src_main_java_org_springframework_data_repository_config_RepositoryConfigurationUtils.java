<METHOD_START> private void ( ) {}  <METHOD_END>
<METHOD_START> public static void void ( RepositoryConfigurationExtension org.springframework.data.repository.config.RepositoryConfigurationExtension , BeanDefinitionRegistry org.springframework.data.repository.config.BeanDefinitionRegistry , RepositoryConfigurationSource org.springframework.data.repository.config.RepositoryConfigurationSource ) { Assert . notNull ( org.springframework.data.repository.config.RepositoryConfigurationExtension , STRING ) ; Assert . notNull ( org.springframework.data.repository.config.BeanDefinitionRegistry , STRING ) ; Assert . notNull ( org.springframework.data.repository.config.RepositoryConfigurationSource , STRING ) ; java.lang.Class<? extends org.springframework.data.repository.config.RepositoryConfigurationExtension> < ? extends RepositoryConfigurationExtension > java.lang.Class<? extends org.springframework.data.repository.config.RepositoryConfigurationExtension> = org.springframework.data.repository.config.RepositoryConfigurationExtension . getClass ( ) ; java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) . java.lang.String ( GENERATED_BEAN_NAME_SEPARATOR ) . concat ( STRING ) ; if ( org.springframework.data.repository.config.BeanDefinitionRegistry . containsBeanDefinition ( java.lang.String ) ) { return; } RootBeanDefinition org.springframework.data.repository.config.RootBeanDefinition = new RootBeanDefinition ( java.lang.Class<> ) ; org.springframework.data.repository.config.RootBeanDefinition . setSource ( org.springframework.data.repository.config.RepositoryConfigurationSource . getSource ( ) ) ; org.springframework.data.repository.config.RootBeanDefinition . setRole ( AbstractBeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.data.repository.config.RootBeanDefinition . setLazyInit ( true ) ; org.springframework.data.repository.config.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.data.repository.config.RootBeanDefinition ) ; }  <METHOD_END>