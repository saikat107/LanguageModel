<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; GenericMessage < org.w3c.dom.Document > org.springframework.integration.xml.config.GenericMessage<org.w3c.dom.Document> = new GenericMessage < org.w3c.dom.Document > ( org.w3c.dom.Document ) ; TestXmlApplicationContext org.springframework.integration.xml.config.TestXmlApplicationContext = TestXmlApplicationContextHelper . getTestAppContext ( java.lang.String + STRING + STRING + STRING ) ; EventDrivenConsumer org.springframework.integration.xml.config.EventDrivenConsumer = ( EventDrivenConsumer ) org.springframework.integration.xml.config.TestXmlApplicationContext . getBean ( STRING ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( - NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertFalse ( TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING , java.lang.Boolean .class ) ) ; org.springframework.integration.xml.config.EventDrivenConsumer . start ( ) ; org.springframework.integration.xml.config.TestXmlApplicationContext . getAutowireCapableBeanFactory ( ) . autowireBeanProperties ( this , AutowireCapableBeanFactory . AUTOWIRE_BY_TYPE , false ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<org.w3c.dom.Document> ) ; assertEquals ( STRING , NUMBER , org.springframework.integration.xml.config.QueueChannel . getQueueSize ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; GenericMessage < org.w3c.dom.Document > org.springframework.integration.xml.config.GenericMessage<org.w3c.dom.Document> = new GenericMessage < org.w3c.dom.Document > ( org.w3c.dom.Document ) ; TestXmlApplicationContext org.springframework.integration.xml.config.TestXmlApplicationContext = TestXmlApplicationContextHelper . getTestAppContext ( java.lang.String + STRING ) ; EventDrivenConsumer org.springframework.integration.xml.config.EventDrivenConsumer = ( EventDrivenConsumer ) org.springframework.integration.xml.config.TestXmlApplicationContext . getBean ( STRING ) ; org.springframework.integration.xml.config.EventDrivenConsumer . start ( ) ; org.springframework.integration.xml.config.TestXmlApplicationContext . getAutowireCapableBeanFactory ( ) . autowireBeanProperties ( this , AutowireCapableBeanFactory . AUTOWIRE_BY_TYPE , false ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<org.w3c.dom.Document> ) ; assertEquals ( STRING , NUMBER , org.springframework.integration.xml.config.QueueChannel . getQueueSize ( ) ) ; assertTrue ( STRING , ( ( Message < ? > ) org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) . getPayload ( ) instanceof org.w3c.dom.Document ) ; assertTrue ( STRING , ( ( Message < ? > ) org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) . getPayload ( ) instanceof org.w3c.dom.Document ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestXmlApplicationContext org.springframework.integration.xml.config.TestXmlApplicationContext = TestXmlApplicationContextHelper . getTestAppContext ( STRING + java.lang.String + STRING ) ; EventDrivenConsumer org.springframework.integration.xml.config.EventDrivenConsumer = ( EventDrivenConsumer ) org.springframework.integration.xml.config.TestXmlApplicationContext . getBean ( STRING ) ; DirectFieldAccessor org.springframework.integration.xml.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.xml.config.EventDrivenConsumer ) ; java.lang.Object java.lang.Object = org.springframework.integration.xml.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; org.springframework.integration.xml.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.integration.xml.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertTrue ( STRING , java.lang.Object instanceof javax.xml.parsers.DocumentBuilderFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestXmlApplicationContext org.springframework.integration.xml.config.TestXmlApplicationContext = TestXmlApplicationContextHelper . getTestAppContext ( java.lang.String + STRING + STRING ) ; EventDrivenConsumer org.springframework.integration.xml.config.EventDrivenConsumer = ( EventDrivenConsumer ) org.springframework.integration.xml.config.TestXmlApplicationContext . getBean ( STRING ) ; DirectFieldAccessor org.springframework.integration.xml.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.xml.config.EventDrivenConsumer ) ; java.lang.Object java.lang.Object = org.springframework.integration.xml.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; org.springframework.integration.xml.config.DirectFieldAccessor = new DirectFieldAccessor ( java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.integration.xml.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertTrue ( STRING , java.lang.Object instanceof javax.xml.parsers.DocumentBuilderFactory ) ; }  <METHOD_END>
