<METHOD_START> @ Before @ java.lang.Override public void void ( ) java.lang.InterruptedException { super. setUp ( ) ; org.springframework.data.mongodb.repository.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.data.mongodb.repository.config.BeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.mongodb.repository.config.DefaultListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.data.mongodb.repository.config.MongoNamespaceIntegrationTests> ( ) ) ) ; BeanDefinition org.springframework.data.mongodb.repository.config.BeanDefinition = org.springframework.data.mongodb.repository.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.mongodb.repository.config.BeanDefinition , is ( notNullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Repositories org.springframework.data.mongodb.repository.config.Repositories = new Repositories ( org.springframework.data.mongodb.repository.config.ApplicationContext ) ; PersistentEntity < ? , ? > org.springframework.data.mongodb.repository.config.PersistentEntity<?,?> = org.springframework.data.mongodb.repository.config.Repositories . getPersistentEntity ( Person .class ) ; assertThat ( org.springframework.data.mongodb.repository.config.PersistentEntity<,> , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.repository.config.PersistentEntity<,> , is ( instanceOf ( MongoPersistentEntity .class ) ) ) ; }  <METHOD_END>