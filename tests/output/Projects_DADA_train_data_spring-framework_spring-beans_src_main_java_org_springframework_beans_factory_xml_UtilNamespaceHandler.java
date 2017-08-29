<METHOD_START> @ java.lang.Override public void void ( ) { registerBeanDefinitionParser ( STRING , new org.springframework.beans.factory.xml.UtilNamespaceHandler.ConstantBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new org.springframework.beans.factory.xml.UtilNamespaceHandler.PropertyPathBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new org.springframework.beans.factory.xml.UtilNamespaceHandler.ListBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new org.springframework.beans.factory.xml.UtilNamespaceHandler.SetBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new org.springframework.beans.factory.xml.UtilNamespaceHandler.MapBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new org.springframework.beans.factory.xml.UtilNamespaceHandler.PropertiesBeanDefinitionParser ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return FieldRetrievingFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.beans.factory.xml.AbstractBeanDefinition , ParserContext org.springframework.beans.factory.xml.ParserContext ) { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.beans.factory.xml.AbstractBeanDefinition , org.springframework.beans.factory.xml.ParserContext ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return PropertyPathFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { org.springframework.beans.factory.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; return; } int int = java.lang.String . int ( STRING ) ; if ( int == - NUMBER ) { org.springframework.beans.factory.xml.ParserContext . getReaderContext ( ) . error ( STRING , org.w3c.dom.Element ) ; return; } java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int + NUMBER ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.beans.factory.xml.AbstractBeanDefinition , ParserContext org.springframework.beans.factory.xml.ParserContext ) { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.beans.factory.xml.AbstractBeanDefinition , org.springframework.beans.factory.xml.ParserContext ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return ListFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = org.springframework.beans.factory.xml.ParserContext . getDelegate ( ) . parseListElement ( org.w3c.dom.Element , org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.List<java.lang.Object> ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . setScope ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return SetFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) { java.util.Set<java.lang.Object> < java.lang.Object > java.util.Set<java.lang.Object> = org.springframework.beans.factory.xml.ParserContext . getDelegate ( ) . parseSetElement ( org.w3c.dom.Element , org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.Set<java.lang.Object> ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . setScope ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return MapFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = org.springframework.beans.factory.xml.ParserContext . getDelegate ( ) . parseMapElement ( org.w3c.dom.Element , org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.Map<java.lang.Object,java.lang.Object> ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; } java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . setScope ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return PropertiesFactoryBean .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) { java.util.Properties java.util.Properties = org.springframework.beans.factory.xml.ParserContext . getDelegate ( ) . parsePropsElement ( org.w3c.dom.Element ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.Properties ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { java.lang.String = org.springframework.beans.factory.xml.ParserContext . getReaderContext ( ) . getEnvironment ( ) . resolvePlaceholders ( java.lang.String ) ; java.lang.String [] java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String[] ) ; } org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Boolean . java.lang.Boolean ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) ; org.springframework.beans.factory.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Boolean . java.lang.Boolean ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . setScope ( java.lang.String ) ; } }  <METHOD_END>
