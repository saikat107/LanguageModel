<METHOD_START> public void void ( ) { RepositoryConfigurationExtension org.springframework.data.jpa.repository.config.RepositoryConfigurationExtension = new JpaRepositoryConfigExtension ( ) ; RepositoryBeanDefinitionParser org.springframework.data.jpa.repository.config.RepositoryBeanDefinitionParser = new RepositoryBeanDefinitionParser ( org.springframework.data.jpa.repository.config.RepositoryConfigurationExtension ) ; registerBeanDefinitionParser ( STRING , org.springframework.data.jpa.repository.config.RepositoryBeanDefinitionParser ) ; registerBeanDefinitionParser ( STRING , new AuditingBeanDefinitionParser ( ) ) ; }  <METHOD_END>
