<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.file.config.BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.file.config.ParserContext ) { BeanDefinition org.springframework.integration.file.config.BeanDefinition = FileParserUtils . parseRemoteFileTemplate ( org.w3c.dom.Element , org.springframework.integration.file.config.ParserContext , false , java.lang.Class<? extends org.springframework.integration.file.config.RemoteFileOperations<?>> ( ) ) ; BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( java.lang.String ( ) ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.integration.file.config.BeanDefinition ) ; if ( org.w3c.dom.Element . boolean ( STRING ) ) { org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgReference ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } else { org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; if ( org.w3c.dom.Element . boolean ( EXPRESSION_ATTRIBUTE ) ) { org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( org.w3c.dom.Element . java.lang.String ( EXPRESSION_ATTRIBUTE ) ) ; } } IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setReferenceIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; this . void ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , org.springframework.integration.file.config.ParserContext , STRING , STRING , STRING ) ; this . void ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , org.springframework.integration.file.config.ParserContext , STRING , STRING , STRING ) ; BeanDefinition org.springframework.integration.file.config.BeanDefinition = IntegrationNamespaceUtils . createExpressionDefinitionFromValueOrExpression ( STRING , STRING , org.springframework.integration.file.config.ParserContext , org.w3c.dom.Element , false ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.file.config.BeanDefinition ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING , STRING ) ; void ( org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element ) ; return org.springframework.integration.file.config.BeanDefinitionBuilder ; }  <METHOD_END>
<METHOD_START> protected void void ( BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element ) { }  <METHOD_END>
<METHOD_START> protected void void ( BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.file.config.ParserContext , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String + STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String + STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String + STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; int int = boolean ? NUMBER : NUMBER ; int += boolean ? NUMBER : NUMBER ; int += boolean ? NUMBER : NUMBER ; int += boolean ? NUMBER : NUMBER ; if ( int > NUMBER ) { org.springframework.integration.file.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } else if ( boolean ) { org.springframework.integration.file.config.BeanDefinitionBuilder . addPropertyReference ( java.lang.String , java.lang.String ) ; } else if ( boolean ) { BeanDefinition org.springframework.integration.file.config.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFileListFilter .class ) . addConstructorArgValue ( java.lang.String ) . getBeanDefinition ( ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , org.springframework.integration.file.config.BeanDefinition ) ; } else if ( boolean ) { BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( STRING . boolean ( java.lang.String ) ? this . java.lang.String ( ) : SimplePatternFileListFilter .class . java.lang.String ( ) ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , org.springframework.integration.file.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } else if ( boolean ) { BeanDefinitionBuilder org.springframework.integration.file.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( STRING . boolean ( java.lang.String ) ? this . java.lang.String ( ) : RegexPatternFileListFilter .class . java.lang.String ( ) ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.integration.file.config.BeanDefinitionBuilder . addPropertyValue ( java.lang.String , org.springframework.integration.file.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> protected abstract java.lang.Class<? extends org.springframework.integration.file.config.RemoteFileOperations<?>> < ? extends RemoteFileOperations < ? > > java.lang.Class<? extends org.springframework.integration.file.config.RemoteFileOperations<?>> ( )  <METHOD_END>