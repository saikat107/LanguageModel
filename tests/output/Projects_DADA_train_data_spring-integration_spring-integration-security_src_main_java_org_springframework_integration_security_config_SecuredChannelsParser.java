<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return ChannelSecurityInterceptor .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.security.config.ParserContext , BeanDefinitionBuilder org.springframework.integration.security.config.BeanDefinitionBuilder ) { org.springframework.integration.security.config.BeanDefinitionBuilder . addConstructorArgValue ( this . org.springframework.integration.security.config.BeanDefinition ( org.w3c.dom.Element , org.springframework.integration.security.config.ParserContext ) ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.security.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.security.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.security.config.BeanDefinition org.springframework.integration.security.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.security.config.ParserContext ) { BeanDefinitionBuilder org.springframework.integration.security.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ChannelSecurityMetadataSource .class ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; ManagedMap < java.lang.String , BeanDefinition > org.springframework.integration.security.config.ManagedMap<java.lang.String,org.springframework.integration.security.config.BeanDefinition> = new ManagedMap < java.lang.String , BeanDefinition > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) && ! StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.security.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } BeanDefinitionBuilder org.springframework.integration.security.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( DefaultChannelAccessPolicy .class ) ; org.springframework.integration.security.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.security.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.security.config.BeanDefinitionBuilder . getBeanDefinition ( ) . setRole ( BeanDefinition . ROLE_SUPPORT ) ; org.springframework.integration.security.config.ManagedMap<java.lang.String,org.springframework.integration.security.config.BeanDefinition> . put ( org.w3c.dom.Element . java.lang.String ( STRING ) , org.springframework.integration.security.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } org.springframework.integration.security.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.integration.security.config.ManagedMap<java.lang.String,org.springframework.integration.security.config.BeanDefinition> ) ; return org.springframework.integration.security.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
