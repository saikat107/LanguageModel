<METHOD_START> @ java.lang.Override protected com.foo.AbstractBeanDefinition com.foo.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext com.foo.ParserContext ) { return com.foo.AbstractBeanDefinition ( org.w3c.dom.Element ) ; }  <METHOD_END>
<METHOD_START> private static com.foo.AbstractBeanDefinition com.foo.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinitionBuilder com.foo.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( ComponentFactoryBean .class ) ; com.foo.BeanDefinitionBuilder . addPropertyValue ( STRING , com.foo.BeanDefinition ( org.w3c.dom.Element ) ) ; java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> = DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ; if ( java.util.List<org.w3c.dom.Element> != null && java.util.List<org.w3c.dom.Element> . int ( ) > NUMBER ) { void ( java.util.List<org.w3c.dom.Element> , com.foo.BeanDefinitionBuilder ) ; } return com.foo.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private static com.foo.BeanDefinition com.foo.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element ) { BeanDefinitionBuilder com.foo.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( Component .class ) ; com.foo.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; return com.foo.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.util.List<org.w3c.dom.Element> < org.w3c.dom.Element > java.util.List<org.w3c.dom.Element> , BeanDefinitionBuilder com.foo.BeanDefinitionBuilder ) { ManagedList < BeanDefinition > com.foo.ManagedList<com.foo.BeanDefinition> = new ManagedList <> ( java.util.List<org.w3c.dom.Element> . int ( ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : java.util.List<org.w3c.dom.Element> ) { com.foo.ManagedList<com.foo.BeanDefinition> . add ( com.foo.AbstractBeanDefinition ( org.w3c.dom.Element ) ) ; } com.foo.BeanDefinitionBuilder . addPropertyValue ( STRING , com.foo.ManagedList<com.foo.BeanDefinition> ) ; }  <METHOD_END>