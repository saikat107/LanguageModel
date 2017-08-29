<METHOD_START> @ Test public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . setDocumentReaderClass ( DefaultBeanDefinitionDocumentReader .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . setDocumentReaderClass ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . setDocumentReaderClass ( java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanDefinitionStoreException .class ) public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; Resource org.springframework.beans.factory.xml.Resource = new InputStreamResource ( java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) . java.io.InputStream ( STRING ) ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . loadBeanDefinitions ( org.springframework.beans.factory.xml.Resource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; Resource org.springframework.beans.factory.xml.Resource = new InputStreamResource ( java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) . java.io.InputStream ( STRING ) ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . setValidationMode ( XmlBeanDefinitionReader . VALIDATION_DTD ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( org.springframework.beans.factory.xml.Resource ) ; void ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; Resource org.springframework.beans.factory.xml.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . loadBeanDefinitions ( org.springframework.beans.factory.xml.Resource ) ; void ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; Resource org.springframework.beans.factory.xml.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . loadBeanDefinitions ( org.springframework.beans.factory.xml.Resource ) ; void ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanDefinitionStoreException .class ) public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; org.xml.sax.InputSource org.xml.sax.InputSource = new org.xml.sax.InputSource ( java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) . java.io.InputStream ( STRING ) ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . loadBeanDefinitions ( org.xml.sax.InputSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; org.xml.sax.InputSource org.xml.sax.InputSource = new org.xml.sax.InputSource ( java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) . java.io.InputStream ( STRING ) ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . setValidationMode ( XmlBeanDefinitionReader . VALIDATION_DTD ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( org.xml.sax.InputSource ) ; void ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleBeanDefinitionRegistry org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry = new SimpleBeanDefinitionRegistry ( ) ; Resource org.springframework.beans.factory.xml.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) . loadBeanDefinitions ( org.springframework.beans.factory.xml.Resource ) ; void ( org.springframework.beans.factory.xml.SimpleBeanDefinitionRegistry ) ; }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.beans.factory.xml.BeanDefinitionRegistry ) { assertEquals ( NUMBER , org.springframework.beans.factory.xml.BeanDefinitionRegistry . getBeanDefinitionCount ( ) ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.BeanDefinitionRegistry . getBeanDefinitionNames ( ) . length ) ; assertTrue ( java.util.Arrays . java.util.List ( org.springframework.beans.factory.xml.BeanDefinitionRegistry . getBeanDefinitionNames ( ) ) . contains ( STRING ) ) ; assertTrue ( java.util.Arrays . java.util.List ( org.springframework.beans.factory.xml.BeanDefinitionRegistry . getBeanDefinitionNames ( ) ) . contains ( STRING ) ) ; assertTrue ( org.springframework.beans.factory.xml.BeanDefinitionRegistry . containsBeanDefinition ( STRING ) ) ; assertTrue ( org.springframework.beans.factory.xml.BeanDefinitionRegistry . containsBeanDefinition ( STRING ) ) ; assertEquals ( TestBean .class . java.lang.String ( ) , org.springframework.beans.factory.xml.BeanDefinitionRegistry . getBeanDefinition ( STRING ) . getBeanClassName ( ) ) ; assertEquals ( TestBean .class . java.lang.String ( ) , org.springframework.beans.factory.xml.BeanDefinitionRegistry . getBeanDefinition ( STRING ) . getBeanClassName ( ) ) ; assertTrue ( org.springframework.beans.factory.xml.BeanDefinitionRegistry . isAlias ( STRING ) ) ; java.lang.String [] java.lang.String[] = org.springframework.beans.factory.xml.BeanDefinitionRegistry . getAliases ( STRING ) ; assertEquals ( NUMBER , java.lang.String[] . int ) ; assertTrue ( ObjectUtils . containsElement ( java.lang.String[] , STRING ) ) ; assertTrue ( ObjectUtils . containsElement ( java.lang.String[] , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) throws java.lang.Exception { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; Resource org.springframework.beans.factory.xml.Resource = new ClassPathResource ( java.lang.String , java.lang.Class<? extends org.springframework.beans.factory.xml.XmlBeanDefinitionReaderTests> ( ) ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.beans.factory.xml.Resource ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertNotNull ( org.springframework.beans.factory.xml.TestBean ) ; }  <METHOD_END>
