<METHOD_START> public void ( XmlReaderContext org.springframework.beans.factory.xml.XmlReaderContext , BeanDefinitionParserDelegate org.springframework.beans.factory.xml.BeanDefinitionParserDelegate ) { this . org.springframework.beans.factory.xml.XmlReaderContext = org.springframework.beans.factory.xml.XmlReaderContext ; this . org.springframework.beans.factory.xml.BeanDefinitionParserDelegate = org.springframework.beans.factory.xml.BeanDefinitionParserDelegate ; }  <METHOD_END>
<METHOD_START> public void ( XmlReaderContext org.springframework.beans.factory.xml.XmlReaderContext , BeanDefinitionParserDelegate org.springframework.beans.factory.xml.BeanDefinitionParserDelegate , BeanDefinition org.springframework.beans.factory.xml.BeanDefinition ) { this . org.springframework.beans.factory.xml.XmlReaderContext = org.springframework.beans.factory.xml.XmlReaderContext ; this . org.springframework.beans.factory.xml.BeanDefinitionParserDelegate = org.springframework.beans.factory.xml.BeanDefinitionParserDelegate ; this . org.springframework.beans.factory.xml.BeanDefinition = org.springframework.beans.factory.xml.BeanDefinition ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.xml.XmlReaderContext org.springframework.beans.factory.xml.XmlReaderContext ( ) { return this . org.springframework.beans.factory.xml.XmlReaderContext ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.xml.BeanDefinitionRegistry org.springframework.beans.factory.xml.BeanDefinitionRegistry ( ) { return this . org.springframework.beans.factory.xml.XmlReaderContext . getRegistry ( ) ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.xml.BeanDefinitionParserDelegate org.springframework.beans.factory.xml.BeanDefinitionParserDelegate ( ) { return this . org.springframework.beans.factory.xml.BeanDefinitionParserDelegate ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.xml.BeanDefinition org.springframework.beans.factory.xml.BeanDefinition ( ) { return this . org.springframework.beans.factory.xml.BeanDefinition ; }  <METHOD_END>
<METHOD_START> public final boolean boolean ( ) { return ( this . org.springframework.beans.factory.xml.BeanDefinition != null ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return BeanDefinitionParserDelegate . TRUE_VALUE . equals ( this . org.springframework.beans.factory.xml.BeanDefinitionParserDelegate . getDefaults ( ) . getLazyInit ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return this . org.springframework.beans.factory.xml.XmlReaderContext . extractSource ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.xml.CompositeComponentDefinition org.springframework.beans.factory.xml.CompositeComponentDefinition ( ) { return ( ! this . java.util.Stack<org.springframework.beans.factory.xml.ComponentDefinition> . isEmpty ( ) ? ( CompositeComponentDefinition ) this . java.util.Stack<org.springframework.beans.factory.xml.ComponentDefinition> . lastElement ( ) : null ) ; }  <METHOD_END>
<METHOD_START> public void void ( CompositeComponentDefinition org.springframework.beans.factory.xml.CompositeComponentDefinition ) { this . java.util.Stack<org.springframework.beans.factory.xml.ComponentDefinition> . push ( org.springframework.beans.factory.xml.CompositeComponentDefinition ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.xml.CompositeComponentDefinition org.springframework.beans.factory.xml.CompositeComponentDefinition ( ) { return ( CompositeComponentDefinition ) this . java.util.Stack<org.springframework.beans.factory.xml.ComponentDefinition> . pop ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { void ( org.springframework.beans.factory.xml.CompositeComponentDefinition ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ComponentDefinition org.springframework.beans.factory.xml.ComponentDefinition ) { CompositeComponentDefinition org.springframework.beans.factory.xml.CompositeComponentDefinition = org.springframework.beans.factory.xml.CompositeComponentDefinition ( ) ; if ( org.springframework.beans.factory.xml.CompositeComponentDefinition != null ) { org.springframework.beans.factory.xml.CompositeComponentDefinition . addNestedComponent ( org.springframework.beans.factory.xml.ComponentDefinition ) ; } else { this . org.springframework.beans.factory.xml.XmlReaderContext . fireComponentRegistered ( org.springframework.beans.factory.xml.ComponentDefinition ) ; } }  <METHOD_END>
<METHOD_START> public void void ( BeanComponentDefinition org.springframework.beans.factory.xml.BeanComponentDefinition ) { BeanDefinitionReaderUtils . registerBeanDefinition ( org.springframework.beans.factory.xml.BeanComponentDefinition , org.springframework.beans.factory.xml.BeanDefinitionRegistry ( ) ) ; void ( org.springframework.beans.factory.xml.BeanComponentDefinition ) ; }  <METHOD_END>
