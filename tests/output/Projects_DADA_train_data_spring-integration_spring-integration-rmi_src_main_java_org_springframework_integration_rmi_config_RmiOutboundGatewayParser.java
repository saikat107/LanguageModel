<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return RmiOutboundGateway .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.rmi.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) || ! StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.rmi.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = StringUtils . hasText ( java.lang.String ) ? java.lang.String : STRING + java.rmi.registry.Registry . int ; return STRING + java.lang.String + STRING + java.lang.String + STRING + RmiInboundGateway . SERVICE_NAME_PREFIX + java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( BeanDefinitionBuilder org.springframework.integration.rmi.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.rmi.config.ParserContext ) { if ( StringUtils . hasText ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) { org.springframework.integration.rmi.config.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } }  <METHOD_END>
