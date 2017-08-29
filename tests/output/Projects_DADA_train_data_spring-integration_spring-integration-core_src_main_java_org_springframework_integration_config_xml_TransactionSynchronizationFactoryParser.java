<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.xml.AbstractBeanDefinition org.springframework.integration.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DefaultTransactionSynchronizationFactory .class ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; org.w3c.dom.Element org.w3c.dom.Element = DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) ; if ( this . boolean ( org.w3c.dom.Element , org.w3c.dom.Element , org.w3c.dom.Element ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionEvaluatingTransactionSynchronizationProcessor .class ) ; this . void ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext , org.springframework.integration.config.xml.BeanDefinitionBuilder , STRING ) ; this . void ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext , org.springframework.integration.config.xml.BeanDefinitionBuilder , STRING ) ; this . void ( org.w3c.dom.Element , org.springframework.integration.config.xml.ParserContext , org.springframework.integration.config.xml.BeanDefinitionBuilder , STRING ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; return org.springframework.integration.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.integration.config.xml.BeanDefinitionBuilder , java.lang.String java.lang.String ) { if ( org.w3c.dom.Element != null ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( this . boolean ( java.lang.String , java.lang.String ) ) { org.springframework.integration.config.xml.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { RootBeanDefinition org.springframework.integration.config.xml.RootBeanDefinition = new RootBeanDefinition ( ExpressionFactoryBean .class ) ; org.springframework.integration.config.xml.RootBeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( java.lang.String ) ; org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyValue ( java.lang.String + STRING , org.springframework.integration.config.xml.RootBeanDefinition ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( java.lang.String + STRING , java.lang.String ) ; } else { org.springframework.integration.config.xml.BeanDefinitionBuilder . addPropertyReference ( java.lang.String + STRING , STRING ) ; } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( org.w3c.dom.Element ... org.w3c.dom.Element[] ) { for ( java.lang.Object java.lang.Object : org.w3c.dom.Element[] ) { if ( java.lang.Object != null ) { return false ; } } return true ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String ... java.lang.String[] ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( StringUtils . hasText ( java.lang.String ) ) { return false ; } } return true ; }  <METHOD_END>
