<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( this . org.springframework.beans.factory.xml.DefaultListableBeanFactory ) . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.MetadataAttachmentTests> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.beans.factory.xml.BeanDefinition = this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getMergedBeanDefinition ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.BeanDefinition . getAttribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.beans.factory.xml.BeanDefinition = this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getMergedBeanDefinition ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.beans.factory.xml.BeanDefinition . getAttribute ( STRING ) ) ; assertEquals ( STRING , STRING , org.springframework.beans.factory.xml.BeanDefinition . getAttribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.beans.factory.xml.BeanDefinition = this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getMergedBeanDefinition ( STRING ) ; PropertyValue org.springframework.beans.factory.xml.PropertyValue = org.springframework.beans.factory.xml.BeanDefinition . getPropertyValues ( ) . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.PropertyValue . getAttribute ( STRING ) ) ; }  <METHOD_END>