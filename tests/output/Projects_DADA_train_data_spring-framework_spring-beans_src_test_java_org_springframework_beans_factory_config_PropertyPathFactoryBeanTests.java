<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.config.Resource ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ) ; assertEquals ( new java.lang.Integer ( NUMBER ) , org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ) ; assertEquals ( ITestBean .class , org.springframework.beans.factory.config.DefaultListableBeanFactory . getType ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.lang.Object instanceof TestBean ) ; assertTrue ( java.lang.Object == java.lang.Object ) ; assertEquals ( NUMBER , ( ( TestBean ) java.lang.Object ) . getAge ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.config.Resource ) ; assertNull ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getType ( STRING ) ) ; assertEquals ( TestBean .class , org.springframework.beans.factory.config.DefaultListableBeanFactory . getType ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.lang.Object instanceof TestBean ) ; assertTrue ( java.lang.Object instanceof TestBean ) ; assertTrue ( java.lang.Object instanceof TestBean ) ; assertEquals ( NUMBER , ( ( TestBean ) java.lang.Object ) . getAge ( ) ) ; assertEquals ( NUMBER , ( ( TestBean ) java.lang.Object ) . getAge ( ) ) ; assertEquals ( NUMBER , ( ( TestBean ) java.lang.Object ) . getAge ( ) ) ; assertTrue ( java.lang.Object != java.lang.Object ) ; assertTrue ( java.lang.Object != java.lang.Object ) ; assertTrue ( java.lang.Object != java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.config.Resource ) ; assertNull ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getType ( STRING ) ) ; assertNull ( org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.config.Resource ) ; TestBean org.springframework.beans.factory.config.TestBean = ( TestBean ) org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.config.TestBean = ( TestBean ) org.springframework.beans.factory.config.DefaultListableBeanFactory . getBean ( STRING ) ; assertSame ( org.springframework.beans.factory.config.TestBean , org.springframework.beans.factory.config.TestBean . getSpouse ( ) ) ; assertTrue ( ! org.springframework.beans.factory.config.TestBean . getFriends ( ) . isEmpty ( ) ) ; assertSame ( org.springframework.beans.factory.config.TestBean , org.springframework.beans.factory.config.TestBean . getFriends ( ) . iterator ( ) . next ( ) ) ; }  <METHOD_END>
