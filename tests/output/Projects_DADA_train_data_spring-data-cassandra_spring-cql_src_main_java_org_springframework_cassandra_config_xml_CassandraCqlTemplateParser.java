<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return CassandraCqlTemplateFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.cassandra.config.xml.AbstractBeanDefinition , ParserContext org.springframework.cassandra.config.xml.ParserContext )			throws org.springframework.cassandra.config.xml.BeanDefinitionStoreException { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.AbstractBeanDefinition , org.springframework.cassandra.config.xml.ParserContext ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : DefaultCqlBeanNames . TEMPLATE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) { addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , DefaultCqlBeanNames . SESSION ) ; }  <METHOD_END>
