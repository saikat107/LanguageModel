<METHOD_START> @ java.lang.Override protected org.springframework.integration.websocket.config.AbstractBeanDefinition org.springframework.integration.websocket.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.websocket.config.ParserContext , java.lang.String java.lang.String ) { BeanDefinitionBuilder org.springframework.integration.websocket.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( WebSocketInboundChannelAdapter .class ) ; WebSocketAdapterParsingUtils . configureWebSocketAdapter ( org.springframework.integration.websocket.config.BeanDefinitionBuilder , org.springframework.integration.websocket.config.ParserContext , org.w3c.dom.Element ) ; org.springframework.integration.websocket.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.websocket.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.websocket.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.websocket.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.websocket.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; return org.springframework.integration.websocket.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
