<METHOD_START> private void ( ) { throw new java.lang.AssertionError ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> < BeanDefinition > org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jdbc.config.ParserContext ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; ManagedList < BeanDefinition > org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> = new ManagedList < BeanDefinition > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) && StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } if ( StringUtils . hasText ( java.lang.String ) && StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } final BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder ; if ( STRING . boolean ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( SqlOutParameter .class ) ; } else if ( STRING . boolean ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( SqlInOutParameter .class ) ; } else { org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( SqlParameter .class ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.ParserContext . getReaderContext ( ) . error ( STRING + STRING , org.w3c.dom.Element ) ; } } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } else { org.springframework.integration.jdbc.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { JdbcTypesEnum org.springframework.integration.jdbc.config.JdbcTypesEnum = JdbcTypesEnum . convertToJdbcTypesEnum ( java.lang.String ) ; if ( org.springframework.integration.jdbc.config.JdbcTypesEnum != null ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.integration.jdbc.config.JdbcTypesEnum . getCode ( ) ) ; } else { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } } else { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( java.sql.Types . int ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } else if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( new TypedStringValue ( java.lang.String , java.lang.Integer .class ) ) ; } else { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( null ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; } org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> . add ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } return org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> < BeanDefinition > org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jdbc.config.ParserContext ) { ManagedList < BeanDefinition > org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> = new ManagedList < BeanDefinition > ( ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ProcedureParameter .class ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { if ( ! StringUtils . hasText ( java.lang.String ) ) { if ( org.springframework.integration.jdbc.config.Log . isInfoEnabled ( ) ) { org.springframework.integration.jdbc.config.Log . info ( java.lang.String . java.lang.String ( STRING + STRING + STRING , java.lang.String ) ) ; } org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , new TypedStringValue ( java.lang.String , java.lang.String .class ) ) ; } else { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , new TypedStringValue ( java.lang.String , java.lang.String ) ) ; } } org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> . add ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } return org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> < java.lang.String , BeanMetadataElement > org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.integration.jdbc.config.ParserContext ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; ManagedMap < java.lang.String , BeanMetadataElement > org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> = new ManagedMap < java.lang.String , BeanMetadataElement > ( ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; BeanMetadataElement org.springframework.integration.jdbc.config.BeanMetadataElement = null ; try { ClassUtils . forName ( java.lang.String , org.springframework.integration.jdbc.config.ParserContext . getReaderContext ( ) . getBeanClassLoader ( ) ) ; org.springframework.integration.jdbc.config.BeanMetadataElement = BeanDefinitionBuilder . genericBeanDefinition ( java.lang.String ) . getBeanDefinition ( ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { org.springframework.integration.jdbc.config.BeanMetadataElement = new RuntimeBeanReference ( java.lang.String ) ; } org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> . put ( java.lang.String , org.springframework.integration.jdbc.config.BeanMetadataElement ) ; } return org.springframework.integration.jdbc.config.ManagedMap<java.lang.String,org.springframework.integration.jdbc.config.BeanMetadataElement> ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.jdbc.config.BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder ( final org.w3c.dom.Element org.w3c.dom.Element , final ParserContext org.springframework.integration.jdbc.config.ParserContext ) { Assert . notNull ( org.w3c.dom.Element , STRING ) ; Assert . notNull ( org.springframework.integration.jdbc.config.ParserContext , STRING ) ; final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; final BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( StoredProcExecutor .class ) ; org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgReference ( java.lang.String ) ; final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; boolean boolean = StringUtils . hasText ( java.lang.String ) ; if ( ! ( boolean ^ boolean ) ) { org.springframework.integration.jdbc.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } BeanDefinitionBuilder org.springframework.integration.jdbc.config.BeanDefinitionBuilder ; if ( boolean ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ExpressionFactoryBean .class ) ; org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } else { org.springframework.integration.jdbc.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( LiteralExpression .class ) ; org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; } org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.jdbc.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; IntegrationNamespaceUtils . setValueIfAttributeDefined ( org.springframework.integration.jdbc.config.BeanDefinitionBuilder , org.w3c.dom.Element , STRING ) ; final ManagedList < BeanDefinition > org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> = org.springframework.integration.jdbc.config.StoredProcParserUtils . org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ( org.w3c.dom.Element , org.springframework.integration.jdbc.config.ParserContext ) ; final ManagedList < BeanDefinition > org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> = org.springframework.integration.jdbc.config.StoredProcParserUtils . org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ( org.w3c.dom.Element , org.springframework.integration.jdbc.config.ParserContext ) ; if ( ! org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> . isEmpty ( ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ) ; } if ( ! org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> . isEmpty ( ) ) { org.springframework.integration.jdbc.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.integration.jdbc.config.ManagedList<org.springframework.integration.jdbc.config.BeanDefinition> ) ; } return org.springframework.integration.jdbc.config.BeanDefinitionBuilder ; }  <METHOD_END>