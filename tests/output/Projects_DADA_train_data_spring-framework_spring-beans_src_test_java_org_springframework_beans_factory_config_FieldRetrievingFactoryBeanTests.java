<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setStaticField ( STRING ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; assertEquals ( new java.lang.Integer ( java.sql.Connection . int ) , org.springframework.beans.factory.config.FieldRetrievingFactoryBean . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setStaticField ( STRING ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; assertEquals ( new java.lang.Integer ( java.sql.Connection . int ) , org.springframework.beans.factory.config.FieldRetrievingFactoryBean . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetClass ( java.sql.Connection .class ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetField ( STRING ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; assertEquals ( new java.lang.Integer ( java.sql.Connection . int ) , org.springframework.beans.factory.config.FieldRetrievingFactoryBean . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBeanTests.PublicFieldHolder org.springframework.beans.factory.config.FieldRetrievingFactoryBeanTests.PublicFieldHolder = new org.springframework.beans.factory.config.FieldRetrievingFactoryBeanTests.PublicFieldHolder ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetObject ( org.springframework.beans.factory.config.FieldRetrievingFactoryBeanTests.PublicFieldHolder ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetField ( STRING ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; assertEquals ( org.springframework.beans.factory.config.FieldRetrievingFactoryBeanTests.PublicFieldHolder . java.lang.String , org.springframework.beans.factory.config.FieldRetrievingFactoryBean . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setBeanName ( STRING ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; assertEquals ( new java.lang.Integer ( java.sql.Connection . int ) , org.springframework.beans.factory.config.FieldRetrievingFactoryBean . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetField ( STRING ) ; try { org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {		} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetClass ( java.sql.Connection .class ) ; try { org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {		} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setTargetObject ( new org.springframework.beans.factory.config.FieldRetrievingFactoryBeanTests.PublicFieldHolder ( ) ) ; try { org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) {		} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldRetrievingFactoryBean org.springframework.beans.factory.config.FieldRetrievingFactoryBean = new FieldRetrievingFactoryBean ( ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . setBeanName ( STRING ) ; org.springframework.beans.factory.config.FieldRetrievingFactoryBean . afterPropertiesSet ( ) ; assertEquals ( STRING , org.springframework.beans.factory.config.FieldRetrievingFactoryBean . getObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.config.Resource ) ; TestBean org.springframework.beans.factory.config.TestBean = ( TestBean ) org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( new java.lang.Integer ( java.sql.Connection . int ) , org.springframework.beans.factory.config.TestBean . getSomeIntegerArray ( ) [ NUMBER ] ) ; assertEquals ( new java.lang.Integer ( java.sql.Connection . int ) , org.springframework.beans.factory.config.TestBean . getSomeIntegerArray ( ) [ NUMBER ] ) ; }  <METHOD_END>
