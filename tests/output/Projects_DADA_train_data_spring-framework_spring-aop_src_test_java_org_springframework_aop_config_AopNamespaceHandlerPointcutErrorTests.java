<METHOD_START> @ Test public void void ( ) { try { DefaultListableBeanFactory org.springframework.aop.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.aop.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( qualifiedResource ( java.lang.Class<? extends org.springframework.aop.config.AopNamespaceHandlerPointcutErrorTests> ( ) , STRING ) ) ; fail ( STRING ) ; } catch ( BeanDefinitionStoreException org.springframework.aop.config.BeanDefinitionStoreException ) { assertTrue ( org.springframework.aop.config.BeanDefinitionStoreException . contains ( BeanDefinitionParsingException .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { DefaultListableBeanFactory org.springframework.aop.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.aop.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( qualifiedResource ( java.lang.Class<? extends org.springframework.aop.config.AopNamespaceHandlerPointcutErrorTests> ( ) , STRING ) ) ; fail ( STRING ) ; } catch ( BeanDefinitionStoreException org.springframework.aop.config.BeanDefinitionStoreException ) { assertTrue ( org.springframework.aop.config.BeanDefinitionStoreException . contains ( BeanDefinitionParsingException .class ) ) ; } }  <METHOD_END>
