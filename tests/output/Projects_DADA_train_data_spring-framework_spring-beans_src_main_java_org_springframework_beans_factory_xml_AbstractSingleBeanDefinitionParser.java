<METHOD_START> @ java.lang.Override protected final org.springframework.beans.factory.xml.AbstractBeanDefinition org.springframework.beans.factory.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( ) ; java.lang.String java.lang.String = java.lang.String ( org.w3c.dom.Element ) ; if ( java.lang.String != null ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setParentName ( java.lang.String ) ; } java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( org.w3c.dom.Element ) ; if ( java.lang.Class<> != null ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setBeanClass ( java.lang.Class<> ) ; } else { java.lang.String java.lang.String = java.lang.String ( org.w3c.dom.Element ) ; if ( java.lang.String != null ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setBeanClassName ( java.lang.String ) ; } } org.springframework.beans.factory.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setSource ( org.springframework.beans.factory.xml.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; if ( org.springframework.beans.factory.xml.ParserContext . isNested ( ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . setScope ( org.springframework.beans.factory.xml.ParserContext . getContainingBeanDefinition ( ) . getScope ( ) ) ; } if ( org.springframework.beans.factory.xml.ParserContext . isDefaultLazyInit ( ) ) { org.springframework.beans.factory.xml.BeanDefinitionBuilder . setLazyInit ( true ) ; } void ( org.w3c.dom.Element , org.springframework.beans.factory.xml.ParserContext , org.springframework.beans.factory.xml.BeanDefinitionBuilder ) ; return org.springframework.beans.factory.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return null ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( org.w3c.dom.Element org.w3c.dom.Element ) { return null ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return null ; }  <METHOD_END>
<METHOD_START> protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.beans.factory.xml.ParserContext , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) { void ( org.w3c.dom.Element , org.springframework.beans.factory.xml.BeanDefinitionBuilder ) ; }  <METHOD_END>
<METHOD_START> protected void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.beans.factory.xml.BeanDefinitionBuilder ) {	}  <METHOD_END>
