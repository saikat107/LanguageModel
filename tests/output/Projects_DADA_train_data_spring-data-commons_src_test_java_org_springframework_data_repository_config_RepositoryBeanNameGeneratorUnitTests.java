<METHOD_START> @ Before public void void ( ) { RepositoryBeanNameGenerator org.springframework.data.repository.config.RepositoryBeanNameGenerator = new RepositoryBeanNameGenerator ( ) ; org.springframework.data.repository.config.RepositoryBeanNameGenerator . setBeanClassLoader ( java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) ) ; this . org.springframework.data.repository.config.BeanNameGenerator = org.springframework.data.repository.config.RepositoryBeanNameGenerator ; this . org.springframework.data.repository.config.BeanDefinitionRegistry = new DefaultListableBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.config.BeanNameGenerator . generateBeanName ( org.springframework.data.repository.config.BeanDefinition ( MyRepository .class ) , org.springframework.data.repository.config.BeanDefinitionRegistry ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.repository.config.BeanNameGenerator . generateBeanName ( org.springframework.data.repository.config.BeanDefinition ( org.springframework.data.repository.config.RepositoryBeanNameGeneratorUnitTests.AnnotatedInterface .class ) , org.springframework.data.repository.config.BeanDefinitionRegistry ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.repository.config.BeanDefinition org.springframework.data.repository.config.BeanDefinition ( java.lang.Class<?> < ? > java.lang.Class<?> ) { BeanDefinitionBuilder org.springframework.data.repository.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( RepositoryFactoryBeanSupport .class ) ; org.springframework.data.repository.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.Class<> . java.lang.String ( ) ) ; return org.springframework.data.repository.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
