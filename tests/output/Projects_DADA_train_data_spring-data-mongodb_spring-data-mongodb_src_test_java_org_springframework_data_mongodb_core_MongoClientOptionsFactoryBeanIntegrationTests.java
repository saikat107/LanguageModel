<METHOD_START> @ Test public void void ( ) { RootBeanDefinition org.springframework.data.mongodb.core.RootBeanDefinition = new RootBeanDefinition ( MongoClientOptionsFactoryBean .class ) ; org.springframework.data.mongodb.core.RootBeanDefinition . getPropertyValues ( ) . addPropertyValue ( STRING , STRING ) ; DefaultListableBeanFactory org.springframework.data.mongodb.core.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.data.mongodb.core.DefaultListableBeanFactory . registerCustomEditor ( ReadPreference .class , ReadPreferencePropertyEditor .class ) ; org.springframework.data.mongodb.core.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.data.mongodb.core.RootBeanDefinition ) ; MongoClientOptionsFactoryBean org.springframework.data.mongodb.core.MongoClientOptionsFactoryBean = org.springframework.data.mongodb.core.DefaultListableBeanFactory . getBean ( STRING , MongoClientOptionsFactoryBean .class ) ; assertThat ( ReflectionTestUtils . getField ( org.springframework.data.mongodb.core.MongoClientOptionsFactoryBean , STRING ) , is ( ( java.lang.Object ) ReadPreference . nearest ( ) ) ) ; }  <METHOD_END>