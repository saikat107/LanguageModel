<METHOD_START> public void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . org.springframework.integration.xml.transformer.support.XPathExpression = XPathExpressionFactory . createXPathExpression ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( XPathExpression org.springframework.integration.xml.transformer.support.XPathExpression ) { Assert . notNull ( org.springframework.integration.xml.transformer.support.XPathExpression , STRING ) ; this . org.springframework.integration.xml.transformer.support.XPathExpression = org.springframework.integration.xml.transformer.support.XPathExpression ; }  <METHOD_END>
<METHOD_START> public void void ( XPathEvaluationType org.springframework.integration.xml.transformer.support.XPathEvaluationType ) { this . org.springframework.integration.xml.transformer.support.XPathEvaluationType = org.springframework.integration.xml.transformer.support.XPathEvaluationType ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> != null ) { this . org.springframework.integration.xml.transformer.support.TypeDescriptor = TypeDescriptor . valueOf ( java.lang.Class<> ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Boolean java.lang.Boolean ( ) { return this . java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.xml.transformer.support.BeanFactory ) throws org.springframework.integration.xml.transformer.support.BeansException { ConversionService org.springframework.integration.xml.transformer.support.ConversionService = IntegrationUtils . getConversionService ( org.springframework.integration.xml.transformer.support.BeanFactory ) ; if ( org.springframework.integration.xml.transformer.support.ConversionService != null ) { this . org.springframework.integration.xml.transformer.support.BeanFactoryTypeConverter . setConversionService ( org.springframework.integration.xml.transformer.support.ConversionService ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.xml.transformer.support.Message<?> ) { org.w3c.dom.Node org.w3c.dom.Node = org.springframework.integration.xml.transformer.support.XmlPayloadConverter . convertToNode ( org.springframework.integration.xml.transformer.support.Message<> . getPayload ( ) ) ; java.lang.Object java.lang.Object = this . org.springframework.integration.xml.transformer.support.XPathEvaluationType . evaluateXPath ( this . org.springframework.integration.xml.transformer.support.XPathExpression , org.w3c.dom.Node ) ; if ( java.lang.Object instanceof java.lang.String && ( ( java.lang.String ) java.lang.Object ) . int ( ) == NUMBER ) { java.lang.Object = null ; } if ( java.lang.Object != null && this . org.springframework.integration.xml.transformer.support.TypeDescriptor != null ) { return this . org.springframework.integration.xml.transformer.support.BeanFactoryTypeConverter . convertValue ( java.lang.Object , TypeDescriptor . forObject ( java.lang.Object ) , this . org.springframework.integration.xml.transformer.support.TypeDescriptor ) ; } else { return java.lang.Object ; } }  <METHOD_END>
