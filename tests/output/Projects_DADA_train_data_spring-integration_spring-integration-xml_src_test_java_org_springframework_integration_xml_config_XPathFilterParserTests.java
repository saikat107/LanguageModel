<METHOD_START> @ Test public void void ( ) java.lang.Exception { EventDrivenConsumer org.springframework.integration.xml.config.EventDrivenConsumer = ( EventDrivenConsumer ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( - NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertFalse ( TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING , java.lang.Boolean .class ) ) ; SmartLifecycleRoleController org.springframework.integration.xml.config.SmartLifecycleRoleController = org.springframework.integration.xml.config.ApplicationContext . getBean ( SmartLifecycleRoleController .class ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.xml.config.SmartLifecycle> < SmartLifecycle > java.util.List<org.springframework.integration.xml.config.SmartLifecycle> = ( java.util.List<org.springframework.integration.xml.config.SmartLifecycle> < SmartLifecycle > ) TestUtils . getPropertyValue ( org.springframework.integration.xml.config.SmartLifecycleRoleController , STRING , MultiValueMap .class ) . get ( STRING ) ; assertThat ( java.util.List<org.springframework.integration.xml.config.SmartLifecycle> , contains ( ( SmartLifecycle ) org.springframework.integration.xml.config.EventDrivenConsumer ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.xml.config.QueueChannel = new QueueChannel ( ) ; PollableChannel org.springframework.integration.xml.config.PollableChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.xml.config.QueueChannel = new QueueChannel ( ) ; PollableChannel org.springframework.integration.xml.config.PollableChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.xml.config.QueueChannel = new QueueChannel ( ) ; PollableChannel org.springframework.integration.xml.config.PollableChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.xml.config.QueueChannel = new QueueChannel ( ) ; PollableChannel org.springframework.integration.xml.config.PollableChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.xml.config.QueueChannel = new QueueChannel ( ) ; PollableChannel org.springframework.integration.xml.config.PollableChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; QueueChannel org.springframework.integration.xml.config.QueueChannel = new QueueChannel ( ) ; PollableChannel org.springframework.integration.xml.config.PollableChannel = org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING , PollableChannel .class ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; org.w3c.dom.Document org.w3c.dom.Document = XmlTestUtil . getDocumentForString ( STRING ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = MessageBuilder . withPayload ( org.w3c.dom.Document ) . setReplyChannel ( org.springframework.integration.xml.config.QueueChannel ) . build ( ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.Message<> ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertEquals ( org.springframework.integration.xml.config.Message<> , org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.QueueChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>