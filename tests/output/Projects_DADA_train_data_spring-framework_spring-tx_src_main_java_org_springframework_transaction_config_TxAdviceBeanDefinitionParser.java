<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return TransactionInterceptor .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.transaction.config.ParserContext , BeanDefinitionBuilder org.springframework.transaction.config.BeanDefinitionBuilder ) { org.springframework.transaction.config.BeanDefinitionBuilder . addPropertyReference ( STRING , TxNamespaceHandler . getTransactionManagerName ( org.w3c.dom.Element ) ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , java.lang.String ) ; if ( java.util.List<org.w3c.dom.Element> . int ( ) > NUMBER ) { org.springframework.transaction.config.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; } else if ( java.util.List<org.w3c.dom.Element> . int ( ) == NUMBER ) { org.w3c.dom.Element org.w3c.dom.Element = java.util.List<org.w3c.dom.Element> . org.w3c.dom.Element ( NUMBER ) ; RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = org.springframework.transaction.config.RootBeanDefinition ( org.w3c.dom.Element , org.springframework.transaction.config.ParserContext ) ; org.springframework.transaction.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.transaction.config.RootBeanDefinition ) ; } else { org.springframework.transaction.config.BeanDefinitionBuilder . addPropertyValue ( STRING , new RootBeanDefinition ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.transaction.config.RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.transaction.config.ParserContext ) { java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , java.lang.String ) ; ManagedMap < TypedStringValue , RuleBasedTransactionAttribute > org.springframework.transaction.config.ManagedMap<org.springframework.transaction.config.TypedStringValue,org.springframework.transaction.config.RuleBasedTransactionAttribute> = new ManagedMap <> ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; org.springframework.transaction.config.ManagedMap<org.springframework.transaction.config.TypedStringValue,org.springframework.transaction.config.RuleBasedTransactionAttribute> . setSource ( org.springframework.transaction.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; TypedStringValue org.springframework.transaction.config.TypedStringValue = new TypedStringValue ( java.lang.String ) ; org.springframework.transaction.config.TypedStringValue . setSource ( org.springframework.transaction.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; RuleBasedTransactionAttribute org.springframework.transaction.config.RuleBasedTransactionAttribute = new RuleBasedTransactionAttribute ( ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.transaction.config.RuleBasedTransactionAttribute . setPropagationBehaviorName ( RuleBasedTransactionAttribute . PREFIX_PROPAGATION + java.lang.String ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.transaction.config.RuleBasedTransactionAttribute . setIsolationLevelName ( RuleBasedTransactionAttribute . PREFIX_ISOLATION + java.lang.String ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { try { org.springframework.transaction.config.RuleBasedTransactionAttribute . setTimeout ( java.lang.Integer . int ( java.lang.String ) ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { org.springframework.transaction.config.ParserContext . getReaderContext ( ) . error ( STRING + java.lang.String + STRING , org.w3c.dom.Element ) ; } } if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.transaction.config.RuleBasedTransactionAttribute . setReadOnly ( java.lang.Boolean . java.lang.Boolean ( org.w3c.dom.Element . java.lang.String ( java.lang.String ) ) ) ; } java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> < RollbackRuleAttribute > java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> = new java.util.LinkedList<org.springframework.transaction.config.RollbackRuleAttribute> <> ( ) ; if ( org.w3c.dom.Element . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; void ( java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> , java.lang.String ) ; } if ( org.w3c.dom.Element . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; void ( java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> , java.lang.String ) ; } org.springframework.transaction.config.RuleBasedTransactionAttribute . setRollbackRules ( java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> ) ; org.springframework.transaction.config.ManagedMap<org.springframework.transaction.config.TypedStringValue,org.springframework.transaction.config.RuleBasedTransactionAttribute> . put ( org.springframework.transaction.config.TypedStringValue , org.springframework.transaction.config.RuleBasedTransactionAttribute ) ; } RootBeanDefinition org.springframework.transaction.config.RootBeanDefinition = new RootBeanDefinition ( NameMatchTransactionAttributeSource .class ) ; org.springframework.transaction.config.RootBeanDefinition . setSource ( org.springframework.transaction.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; org.springframework.transaction.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , org.springframework.transaction.config.ManagedMap<org.springframework.transaction.config.TypedStringValue,org.springframework.transaction.config.RuleBasedTransactionAttribute> ) ; return org.springframework.transaction.config.RootBeanDefinition ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> < RollbackRuleAttribute > java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> , java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> . add ( new RollbackRuleAttribute ( StringUtils . trimWhitespace ( java.lang.String ) ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> < RollbackRuleAttribute > java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> , java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.List<org.springframework.transaction.config.RollbackRuleAttribute> . add ( new NoRollbackRuleAttribute ( StringUtils . trimWhitespace ( java.lang.String ) ) ) ; } }  <METHOD_END>