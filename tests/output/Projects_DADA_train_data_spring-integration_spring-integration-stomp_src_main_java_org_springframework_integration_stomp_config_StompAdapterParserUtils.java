<METHOD_START> static void void ( BeanDefinitionBuilder org.springframework.integration.stomp.config.BeanDefinitionBuilder , ParserContext org.springframework.integration.stomp.config.ParserContext , org.w3c.dom.Element org.w3c.dom.Element ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.stomp.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } org.springframework.integration.stomp.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( boolean ) { org.springframework.integration.stomp.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.springframework.integration.stomp.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; } org.springframework.integration.stomp.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } else if ( boolean ) { BeanDefinitionBuilder org.springframework.integration.stomp.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( StompHeaderMapper .class ) ; org.springframework.integration.stomp.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; org.springframework.integration.stomp.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; org.springframework.integration.stomp.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.stomp.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } }  <METHOD_END>
