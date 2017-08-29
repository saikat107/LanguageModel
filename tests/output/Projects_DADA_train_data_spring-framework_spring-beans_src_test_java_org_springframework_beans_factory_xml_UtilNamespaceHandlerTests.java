<METHOD_START> @ Before public void void ( ) { this . org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( this . org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . setEventListener ( this . org.springframework.beans.factory.xml.CollectingReaderEventListener ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.UtilNamespaceHandlerTests> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Integer java.lang.Integer = ( java.lang.Integer ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( java.lang.Integer . int , java.lang.Integer . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Integer java.lang.Integer = ( java.lang.Integer ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( java.lang.Integer . int , java.lang.Integer . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ComponentDefinition org.springframework.beans.factory.xml.ComponentDefinition = this . org.springframework.beans.factory.xml.CollectingReaderEventListener . getComponentDefinition ( STRING ) ; assertNotNull ( STRING , org.springframework.beans.factory.xml.ComponentDefinition ) ; AbstractBeanDefinition org.springframework.beans.factory.xml.AbstractBeanDefinition = ( AbstractBeanDefinition ) org.springframework.beans.factory.xml.ComponentDefinition . getBeanDefinitions ( ) [ NUMBER ] ; assertEquals ( STRING , PropertiesFactoryBean .class , org.springframework.beans.factory.xml.AbstractBeanDefinition . getBeanClass ( ) ) ; ComponentDefinition org.springframework.beans.factory.xml.ComponentDefinition = this . org.springframework.beans.factory.xml.CollectingReaderEventListener . getComponentDefinition ( STRING ) ; assertNotNull ( STRING , org.springframework.beans.factory.xml.ComponentDefinition ) ; AbstractBeanDefinition org.springframework.beans.factory.xml.AbstractBeanDefinition = ( AbstractBeanDefinition ) org.springframework.beans.factory.xml.ComponentDefinition . getBeanDefinitions ( ) [ NUMBER ] ; assertEquals ( STRING , FieldRetrievingFactoryBean .class , org.springframework.beans.factory.xml.AbstractBeanDefinition . getBeanClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.Properties java.util.Properties = org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = ( java.lang.String ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map java.util.Map = ( java.util.Map ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.util.Map . java.lang.Object ( STRING ) ) ; java.util.Map java.util.Map = ( java.util.Map ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Map == java.util.Map ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map java.util.Map = ( java.util.Map ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.util.Map . java.lang.Object ( STRING ) ) ; java.util.Map java.util.Map = ( java.util.Map ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.util.Map . java.lang.Object ( STRING ) ) ; assertTrue ( java.util.Map != java.util.Map ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List java.util.List = ( java.util.List ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.List java.util.List = ( java.util.List ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.List == java.util.List ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List java.util.List = ( java.util.List ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.List java.util.List = ( java.util.List ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , java.util.List . java.lang.Object ( NUMBER ) ) ; assertTrue ( java.util.List != java.util.List ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Set java.util.Set = ( java.util.Set ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Set . boolean ( STRING ) ) ; java.util.Set java.util.Set = ( java.util.Set ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Set == java.util.Set ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Set java.util.Set = ( java.util.Set ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Set . boolean ( STRING ) ) ; java.util.Set java.util.Set = ( java.util.Set ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Set . boolean ( STRING ) ) ; assertTrue ( java.util.Set != java.util.Set ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map java.util.Map = ( java.util.Map ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Map instanceof java.util.TreeMap ) ; assertEquals ( this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) , java.util.Map . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map java.util.Map = ( java.util.Map ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Map instanceof LinkedCaseInsensitiveMap ) ; assertEquals ( this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) , java.util.Map . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( STRING , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( STRING ) ) ; java.util.Map java.util.Map = org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertTrue ( java.util.Map . java.lang.Object ( STRING ) instanceof java.util.Set ) ; java.util.Set java.util.Set = ( java.util.Set ) java.util.Map . java.lang.Object ( STRING ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( STRING ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( java.util.List , org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ) ; assertEquals ( java.util.Set , org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ) ; assertEquals ( java.util.Map , org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ) ; assertFalse ( java.util.List == org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ) ; assertFalse ( java.util.Set == org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ) ; assertFalse ( java.util.Map == org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.TestBean . getStringArray ( ) . length ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getStringArray ( ) [ NUMBER ] ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( STRING , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( STRING ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Arrays . boolean ( org.springframework.beans.factory.xml.TestBean . getStringArray ( ) , org.springframework.beans.factory.xml.TestBean . getStringArray ( ) ) ) ; assertFalse ( org.springframework.beans.factory.xml.TestBean . getStringArray ( ) == org.springframework.beans.factory.xml.TestBean . getStringArray ( ) ) ; assertEquals ( java.util.List , org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ) ; assertEquals ( java.util.Set , org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ) ; assertFalse ( java.util.List == org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ) ; assertFalse ( java.util.Set == org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( java.lang.Integer . int , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( java.lang.Thread . java.lang.Thread.State . java.lang.Thread.State ) ) ; assertTrue ( java.util.Set . boolean ( java.lang.Thread . java.lang.Thread.State . java.lang.Thread.State ) ) ; java.util.Map java.util.Map = org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertEquals ( CustomEnum . VALUE_1 , java.util.Map . java.lang.Object ( STRING ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( java.util.List , org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ) ; assertEquals ( java.util.Set , org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ) ; assertEquals ( java.util.Map , org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ) ; assertFalse ( java.util.List == org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ) ; assertFalse ( java.util.Set == org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ) ; assertFalse ( java.util.Map == org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( org.springframework.beans.factory.xml.TestBean ) ) ; java.util.Map java.util.Map = org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.Map . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( java.util.List . java.lang.Class<? extends java.util.List> ( ) ) ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertFalse ( java.lang.reflect.Proxy . boolean ( java.util.Set . java.lang.Class<? extends java.util.Set> ( ) ) ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( org.springframework.beans.factory.xml.TestBean ) ) ; java.util.Map java.util.Map = org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ; assertFalse ( java.lang.reflect.Proxy . boolean ( java.util.Map . java.lang.Class<? extends java.util.Map> ( ) ) ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.Map . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertFalse ( java.lang.reflect.Proxy . boolean ( java.util.List . java.lang.Class<? extends java.util.List> ( ) ) ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( java.util.Set . java.lang.Class<? extends java.util.Set> ( ) ) ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( org.springframework.beans.factory.xml.TestBean ) ) ; java.util.Map java.util.Map = org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ; assertFalse ( java.lang.reflect.Proxy . boolean ( java.util.Map . java.lang.Class<? extends java.util.Map> ( ) ) ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.Map . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; java.util.List java.util.List = org.springframework.beans.factory.xml.TestBean . getSomeList ( ) ; assertFalse ( java.lang.reflect.Proxy . boolean ( java.util.List . java.lang.Class<? extends java.util.List> ( ) ) ) ; assertEquals ( NUMBER , java.util.List . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.List . java.lang.Object ( NUMBER ) ) ; java.util.Set java.util.Set = org.springframework.beans.factory.xml.TestBean . getSomeSet ( ) ; assertFalse ( java.lang.reflect.Proxy . boolean ( java.util.Set . java.lang.Class<? extends java.util.Set> ( ) ) ) ; assertEquals ( NUMBER , java.util.Set . int ( ) ) ; assertTrue ( java.util.Set . boolean ( org.springframework.beans.factory.xml.TestBean ) ) ; java.util.Map java.util.Map = org.springframework.beans.factory.xml.TestBean . getSomeMap ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( java.util.Map . java.lang.Class<? extends java.util.Map> ( ) ) ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , java.util.Map . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , null , java.util.Properties . java.lang.Object ( STRING ) ) ; java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( java.util.Properties == java.util.Properties ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , null , java.util.Properties . java.lang.Object ( STRING ) ) ; java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , null , java.util.Properties . java.lang.Object ( STRING ) ) ; assertTrue ( java.util.Properties != java.util.Properties ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , null , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Properties java.util.Properties = ( java.util.Properties ) this . org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
