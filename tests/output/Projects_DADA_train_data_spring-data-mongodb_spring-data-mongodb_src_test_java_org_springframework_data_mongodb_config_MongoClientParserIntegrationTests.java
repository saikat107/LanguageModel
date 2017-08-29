<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.mongodb.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; this . org.springframework.data.mongodb.config.BeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.mongodb.config.DefaultListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBean ( STRING ) , instanceOf ( MongoClient .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; AbstractApplicationContext org.springframework.data.mongodb.config.AbstractApplicationContext = new GenericApplicationContext ( org.springframework.data.mongodb.config.DefaultListableBeanFactory ) ; org.springframework.data.mongodb.config.AbstractApplicationContext . refresh ( ) ; try { MongoClient org.springframework.data.mongodb.config.MongoClient = org.springframework.data.mongodb.config.AbstractApplicationContext . getBean ( STRING , MongoClient .class ) ; assertThat ( org.springframework.data.mongodb.config.MongoClient . getReadPreference ( ) , is ( ReadPreference . secondary ( ) ) ) ; assertThat ( org.springframework.data.mongodb.config.MongoClient . getWriteConcern ( ) , is ( WriteConcern . NORMAL ) ) ; } finally { org.springframework.data.mongodb.config.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; AbstractApplicationContext org.springframework.data.mongodb.config.AbstractApplicationContext = new GenericApplicationContext ( org.springframework.data.mongodb.config.DefaultListableBeanFactory ) ; org.springframework.data.mongodb.config.AbstractApplicationContext . refresh ( ) ; try { MongoClient org.springframework.data.mongodb.config.MongoClient = org.springframework.data.mongodb.config.AbstractApplicationContext . getBean ( STRING , MongoClient .class ) ; assertThat ( org.springframework.data.mongodb.config.MongoClient . getAddress ( ) . getHost ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.config.MongoClient . getAddress ( ) . getPort ( ) , is ( NUMBER ) ) ; } finally { org.springframework.data.mongodb.config.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; AbstractApplicationContext org.springframework.data.mongodb.config.AbstractApplicationContext = new GenericApplicationContext ( org.springframework.data.mongodb.config.DefaultListableBeanFactory ) ; org.springframework.data.mongodb.config.AbstractApplicationContext . refresh ( ) ; try { MongoClient org.springframework.data.mongodb.config.MongoClient = org.springframework.data.mongodb.config.AbstractApplicationContext . getBean ( STRING , MongoClient .class ) ; assertThat ( org.springframework.data.mongodb.config.MongoClient . getCredentialsList ( ) , contains ( MongoCredential . createPlainCredential ( STRING , STRING , STRING . char[] ( ) ) ) ) ; } finally { org.springframework.data.mongodb.config.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; AbstractApplicationContext org.springframework.data.mongodb.config.AbstractApplicationContext = new GenericApplicationContext ( org.springframework.data.mongodb.config.DefaultListableBeanFactory ) ; org.springframework.data.mongodb.config.AbstractApplicationContext . refresh ( ) ; try { MongoClient org.springframework.data.mongodb.config.MongoClient = org.springframework.data.mongodb.config.AbstractApplicationContext . getBean ( STRING , MongoClient .class ) ; assertThat ( org.springframework.data.mongodb.config.MongoClient . getMongoClientOptions ( ) . getServerSelectionTimeout ( ) , is ( ( java.lang.Object ) NUMBER ) ) ; } finally { org.springframework.data.mongodb.config.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>