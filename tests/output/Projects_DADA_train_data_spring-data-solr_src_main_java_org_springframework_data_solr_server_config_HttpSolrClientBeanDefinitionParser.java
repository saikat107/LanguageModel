<METHOD_START> @ java.lang.Override protected org.springframework.data.solr.server.config.AbstractBeanDefinition org.springframework.data.solr.server.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.solr.server.config.ParserContext ) { BeanDefinitionBuilder org.springframework.data.solr.server.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( HttpSolrClientFactoryBean .class ) ; void ( org.w3c.dom.Element , org.springframework.data.solr.server.config.BeanDefinitionBuilder ) ; return org.springframework.data.solr.server.config.AbstractBeanDefinition ( org.springframework.data.solr.server.config.BeanDefinitionBuilder , org.w3c.dom.Element , org.springframework.data.solr.server.config.ParserContext ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.data.solr.server.config.BeanDefinitionBuilder ) { org.springframework.data.solr.server.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.data.solr.server.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.data.solr.server.config.BeanDefinitionBuilder . addPropertyValue ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.server.config.AbstractBeanDefinition org.springframework.data.solr.server.config.AbstractBeanDefinition ( BeanDefinitionBuilder org.springframework.data.solr.server.config.BeanDefinitionBuilder , org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.data.solr.server.config.ParserContext ) { AbstractBeanDefinition org.springframework.data.solr.server.config.AbstractBeanDefinition = org.springframework.data.solr.server.config.BeanDefinitionBuilder . getBeanDefinition ( ) ; org.springframework.data.solr.server.config.AbstractBeanDefinition . setSource ( org.springframework.data.solr.server.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; return org.springframework.data.solr.server.config.AbstractBeanDefinition ; }  <METHOD_END>
