<METHOD_START> private static java.lang.String java.lang.String ( ConfigurableListableBeanFactory org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ) { return org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory . containsBeanDefinition ( STRING ) ? STRING : STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ) throws org.springframework.data.neo4j.repository.support.BeansException { org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition = new org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition ( transformedBeanName ( java.lang.String ( org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ) ) , org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ) ; BeanDefinitionBuilder org.springframework.data.neo4j.repository.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( STRING ) ; org.springframework.data.neo4j.repository.support.BeanDefinitionBuilder . setFactoryMethod ( STRING ) ; org.springframework.data.neo4j.repository.support.BeanDefinitionBuilder . addConstructorArgReference ( org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition . java.lang.String ( ) ) ; AbstractBeanDefinition org.springframework.data.neo4j.repository.support.AbstractBeanDefinition = org.springframework.data.neo4j.repository.support.BeanDefinitionBuilder . getRawBeanDefinition ( ) ; org.springframework.data.neo4j.repository.support.AbstractBeanDefinition . setScope ( org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition . org.springframework.data.neo4j.repository.support.BeanDefinition ( ) . getScope ( ) ) ; org.springframework.data.neo4j.repository.support.AbstractBeanDefinition . setSource ( org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition . org.springframework.data.neo4j.repository.support.BeanDefinition ( ) . getSource ( ) ) ; org.springframework.data.neo4j.repository.support.AbstractBeanDefinition . setAutowireCandidate ( true ) ; BeanDefinitionReaderUtils . registerWithGeneratedName ( org.springframework.data.neo4j.repository.support.AbstractBeanDefinition , ( BeanDefinitionRegistry ) org.springframework.data.neo4j.repository.support.SessionBeanDefinitionRegistrarPostProcessor.SessionFactoryBeanDefinition . org.springframework.data.neo4j.repository.support.BeanFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.neo4j.repository.support.DataAccessException org.springframework.data.neo4j.repository.support.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { return SessionFactoryUtils . convertOgmAccessException ( java.lang.RuntimeException ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String , ConfigurableListableBeanFactory org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ) { this . java.lang.String = java.lang.String ; this . org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory = org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> org.springframework.data.neo4j.repository.support.BeanFactory org.springframework.data.neo4j.repository.support.BeanFactory ( ) { return org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory ; }  <METHOD_END>
<METHOD_START> org.springframework.data.neo4j.repository.support.BeanDefinition org.springframework.data.neo4j.repository.support.BeanDefinition ( ) { return org.springframework.data.neo4j.repository.support.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; }  <METHOD_END>