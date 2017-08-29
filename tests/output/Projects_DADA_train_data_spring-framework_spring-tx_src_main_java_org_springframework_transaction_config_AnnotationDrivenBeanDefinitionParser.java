<METHOD_START> @ java.lang.Override public org.springframework.transaction.config.BeanDefinition org.springframework.transaction.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.transaction.config.ParserContext ) { void ( org.springframework.transaction.config.ParserContext ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( STRING . boolean ( java.lang.String ) ) { void ( org.w3c.dom.Element , org.springframework.transaction.config.ParserContext ) ; } else { org.springframework.transaction.config.AnnotationDrivenBeanDefinitionParser.AopAutoProxyConfigurer . void ( org.w3c.dom.Element , org.springframework.transaction.config.ParserContext ) ; } return null ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.transaction.config.ParserContext ) { java.lang.String java.lang.String = TransactionManagementConfigUtils . TRANSACTION_ASPECT_BEAN_NAME ; java.lang.String java.lang.String = TransactionManagementConfigUtils . TRANSACTION_ASPECT_CLASS_NAME ; if ( ! org.springframework.transaction.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( java.lang.String ) ) { RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = new RootBeanDefinition ( ) ; org.springframework.transaction.config.RootBeanDefinition . setBeanClassName ( java.lang.String ) ; org.springframework.transaction.config.RootBeanDefinition . setFactoryMethodName ( STRING ) ; void ( org.w3c.dom.Element , org.springframework.transaction.config.RootBeanDefinition ) ; org.springframework.transaction.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.transaction.config.RootBeanDefinition , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinition org.springframework.transaction.config.BeanDefinition ) { org.springframework.transaction.config.BeanDefinition . getPropertyValues ( ) . add ( STRING , TxNamespaceHandler . getTransactionManagerName ( org.w3c.dom.Element ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ParserContext org.springframework.transaction.config.ParserContext ) { RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = new RootBeanDefinition ( ) ; org.springframework.transaction.config.RootBeanDefinition . setBeanClass ( TransactionalEventListenerFactory .class ) ; org.springframework.transaction.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.transaction.config.RootBeanDefinition , TransactionManagementConfigUtils . TRANSACTIONAL_EVENT_LISTENER_FACTORY_BEAN_NAME ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.transaction.config.ParserContext ) { AopNamespaceUtils . registerAutoProxyCreatorIfNecessary ( org.springframework.transaction.config.ParserContext , org.w3c.dom.Element ) ; java.lang.String java.lang.String = TransactionManagementConfigUtils . TRANSACTION_ADVISOR_BEAN_NAME ; if ( ! org.springframework.transaction.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( java.lang.String ) ) { java.lang.Object java.lang.Object = org.springframework.transaction.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = new RootBeanDefinition ( STRING ) ; org.springframework.transaction.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.transaction.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; java.lang.String java.lang.String = org.springframework.transaction.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.transaction.config.RootBeanDefinition ) ; RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = new RootBeanDefinition ( TransactionInterceptor .class ) ; org.springframework.transaction.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.transaction.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; void ( org.w3c.dom.Element , org.springframework.transaction.config.RootBeanDefinition ) ; org.springframework.transaction.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; java.lang.String java.lang.String = org.springframework.transaction.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.transaction.config.RootBeanDefinition ) ; RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = new RootBeanDefinition ( BeanFactoryTransactionAttributeSourceAdvisor .class ) ; org.springframework.transaction.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.transaction.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.transaction.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; org.springframework.transaction.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String ) ; if ( org.w3c.dom.Element . boolean ( STRING ) ) { org.springframework.transaction.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } org.springframework.transaction.config.ParserContext . getRegistry ( ) . registerBeanDefinition ( java.lang.String , org.springframework.transaction.config.RootBeanDefinition ) ; CompositeComponentDefinition org.springframework.transaction.config.CompositeComponentDefinition = new CompositeComponentDefinition ( org.w3c.dom.Element . java.lang.String ( ) , java.lang.Object ) ; org.springframework.transaction.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.transaction.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.transaction.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.transaction.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.transaction.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.transaction.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.transaction.config.ParserContext . registerComponent ( org.springframework.transaction.config.CompositeComponentDefinition ) ; } }  <METHOD_END>
