<METHOD_START> @ Before public void void ( ) { this . org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( this . org.springframework.beans.factory.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.config.Resource ) ; this . org.springframework.beans.factory.config.DefaultListableBeanFactory . setSerializationId ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { this . org.springframework.beans.factory.config.DefaultListableBeanFactory . setSerializationId ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean .class ) ; ObjectFactory < ? > org.springframework.beans.factory.config.ObjectFactory<?> = org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean . org.springframework.beans.factory.config.ObjectFactory<?> ( ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.ObjectFactory<> . getObject ( ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.ObjectFactory<> . getObject ( ) ; assertTrue ( java.util.Date != java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean .class ) ; ObjectFactory < ? > org.springframework.beans.factory.config.ObjectFactory<?> = org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.FactoryTestBean . org.springframework.beans.factory.config.ObjectFactory<?> ( ) ; org.springframework.beans.factory.config.ObjectFactory<?> = ( ObjectFactory ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.beans.factory.config.ObjectFactory<> ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.ObjectFactory<> . getObject ( ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.ObjectFactory<> . getObject ( ) ; assertTrue ( java.util.Date != java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean .class ) ; Provider < ? > org.springframework.beans.factory.config.Provider<?> = org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean . org.springframework.beans.factory.config.Provider<?> ( ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.Provider<> . get ( ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.Provider<> . get ( ) ; assertTrue ( java.util.Date != java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean .class ) ; Provider < ? > org.springframework.beans.factory.config.Provider<?> = org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBeanTests.ProviderTestBean . org.springframework.beans.factory.config.Provider<?> ( ) ; org.springframework.beans.factory.config.Provider<?> = ( Provider ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.beans.factory.config.Provider<> ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.Provider<> . get ( ) ; java.util.Date java.util.Date = ( java.util.Date ) org.springframework.beans.factory.config.Provider<> . get ( ) ; assertTrue ( java.util.Date != java.util.Date ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final java.lang.String java.lang.String = STRING ; BeanFactory org.springframework.beans.factory.config.BeanFactory = mock ( BeanFactory .class ) ; given ( org.springframework.beans.factory.config.BeanFactory . getBean ( java.lang.String ) ) . willReturn ( java.lang.String ) ; ObjectFactoryCreatingFactoryBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean = new ObjectFactoryCreatingFactoryBean ( ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . setTargetBeanName ( java.lang.String ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . setBeanFactory ( org.springframework.beans.factory.config.BeanFactory ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . afterPropertiesSet ( ) ; ObjectFactory < ? > org.springframework.beans.factory.config.ObjectFactory<?> = org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . getObject ( ) ; java.lang.Object java.lang.Object = org.springframework.beans.factory.config.ObjectFactory<> . getObject ( ) ; assertSame ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { new ObjectFactoryCreatingFactoryBean ( ) . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { ObjectFactoryCreatingFactoryBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean = new ObjectFactoryCreatingFactoryBean ( ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . setTargetBeanName ( STRING ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { ObjectFactoryCreatingFactoryBean org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean = new ObjectFactoryCreatingFactoryBean ( ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . setTargetBeanName ( STRING ) ; org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( STRING , ObjectFactory .class , new ObjectFactoryCreatingFactoryBean ( ) . getObjectType ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.config.ObjectFactory<?> < ? > org.springframework.beans.factory.config.ObjectFactory<?> ( ) { return org.springframework.beans.factory.config.ObjectFactory<> ; }  <METHOD_END>
<METHOD_START> public void void ( ObjectFactory < ? > org.springframework.beans.factory.config.ObjectFactory<?> ) { this . org.springframework.beans.factory.config.ObjectFactory<?> = org.springframework.beans.factory.config.ObjectFactory<> ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.config.Provider<?> < ? > org.springframework.beans.factory.config.Provider<?> ( ) { return org.springframework.beans.factory.config.Provider<> ; }  <METHOD_END>
<METHOD_START> public void void ( Provider < ? > org.springframework.beans.factory.config.Provider<?> ) { this . org.springframework.beans.factory.config.Provider<?> = org.springframework.beans.factory.config.Provider<> ; }  <METHOD_END>
