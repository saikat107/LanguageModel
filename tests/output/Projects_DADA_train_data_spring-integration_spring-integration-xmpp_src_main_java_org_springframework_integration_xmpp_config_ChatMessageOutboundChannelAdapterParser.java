<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return ChatMessageSendingMessageHandler .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.xmpp.config.AbstractBeanDefinition org.springframework.integration.xmpp.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.xmpp.config.ParserContext ) { AbstractBeanDefinition org.springframework.integration.xmpp.config.AbstractBeanDefinition = super. parseConsumer ( org.w3c.dom.Element , org.springframework.integration.xmpp.config.ParserContext ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.xmpp.config.AbstractBeanDefinition . getPropertyValues ( ) . addPropertyValue ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; } return org.springframework.integration.xmpp.config.AbstractBeanDefinition ; }  <METHOD_END>
