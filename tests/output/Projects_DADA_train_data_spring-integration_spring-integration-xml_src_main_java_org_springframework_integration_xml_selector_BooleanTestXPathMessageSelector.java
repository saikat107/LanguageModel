<METHOD_START> public void ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { super( java.lang.String , java.util.Map<java.lang.String,java.lang.String> ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { super( java.lang.String , java.lang.String , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( XPathExpression org.springframework.integration.xml.selector.XPathExpression ) { super( org.springframework.integration.xml.selector.XPathExpression ); }  <METHOD_END>
<METHOD_START> public boolean boolean ( Message < ? > org.springframework.integration.xml.selector.Message<?> ) { org.w3c.dom.Node org.w3c.dom.Node = getConverter ( ) . convertToNode ( org.springframework.integration.xml.selector.Message<> . getPayload ( ) ) ; return getXPathExpresion ( ) . evaluateAsBoolean ( org.w3c.dom.Node ) ; }  <METHOD_END>
