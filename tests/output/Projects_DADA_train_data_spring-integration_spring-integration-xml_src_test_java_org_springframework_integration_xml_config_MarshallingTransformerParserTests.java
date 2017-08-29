<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.xml.config.ApplicationContext = new ClassPathXmlApplicationContext ( STRING , java.lang.Class<? extends org.springframework.integration.xml.config.MarshallingTransformerParserTests> ( ) ) ; this . org.springframework.integration.xml.config.PollableChannel = ( PollableChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { EventDrivenConsumer org.springframework.integration.xml.config.EventDrivenConsumer = ( EventDrivenConsumer ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( - NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING ) ) ; assertFalse ( TestUtils . getPropertyValue ( org.springframework.integration.xml.config.EventDrivenConsumer , STRING , java.lang.Boolean .class ) ) ; SmartLifecycleRoleController org.springframework.integration.xml.config.SmartLifecycleRoleController = org.springframework.integration.xml.config.ApplicationContext . getBean ( SmartLifecycleRoleController .class ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.xml.config.SmartLifecycle> < SmartLifecycle > java.util.List<org.springframework.integration.xml.config.SmartLifecycle> = ( java.util.List<org.springframework.integration.xml.config.SmartLifecycle> < SmartLifecycle > ) TestUtils . getPropertyValue ( org.springframework.integration.xml.config.SmartLifecycleRoleController , STRING , MultiValueMap .class ) . get ( STRING ) ; assertThat ( java.util.List<org.springframework.integration.xml.config.SmartLifecycle> , contains ( ( SmartLifecycle ) org.springframework.integration.xml.config.EventDrivenConsumer ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = ( MessageChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; GenericMessage < java.lang.Object > org.springframework.integration.xml.config.GenericMessage<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<java.lang.Object> ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.xml.config.Message<> . getPayload ( ) instanceof javax.xml.transform.dom.DOMResult ) ; org.w3c.dom.Document org.w3c.dom.Document = ( org.w3c.dom.Document ) ( ( javax.xml.transform.dom.DOMResult ) org.springframework.integration.xml.config.Message<> . getPayload ( ) ) . org.w3c.dom.Node ( ) ; assertEquals ( STRING , STRING , org.w3c.dom.Document . org.w3c.dom.Element ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = ( MessageChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; GenericMessage < java.lang.Object > org.springframework.integration.xml.config.GenericMessage<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<java.lang.Object> ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.xml.config.Message<> . getPayload ( ) instanceof java.lang.String ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.xml.config.Message<> . getPayload ( ) ; assertEquals ( STRING , STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = ( MessageChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; GenericMessage < java.lang.Object > org.springframework.integration.xml.config.GenericMessage<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<java.lang.Object> ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.xml.config.Message<> . getPayload ( ) instanceof javax.xml.transform.dom.DOMResult ) ; org.w3c.dom.Document org.w3c.dom.Document = ( org.w3c.dom.Document ) ( ( javax.xml.transform.dom.DOMResult ) org.springframework.integration.xml.config.Message<> . getPayload ( ) ) . org.w3c.dom.Node ( ) ; assertEquals ( STRING , STRING , org.w3c.dom.Document . org.w3c.dom.Element ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = ( MessageChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; GenericMessage < java.lang.Object > org.springframework.integration.xml.config.GenericMessage<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<java.lang.Object> ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.xml.config.Message<> . getPayload ( ) instanceof StringResult ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = ( MessageChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; GenericMessage < java.lang.Object > org.springframework.integration.xml.config.GenericMessage<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<java.lang.Object> ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.xml.config.Message<> . getPayload ( ) instanceof StubStringResult ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MessageChannel org.springframework.integration.xml.config.MessageChannel = ( MessageChannel ) org.springframework.integration.xml.config.ApplicationContext . getBean ( STRING ) ; GenericMessage < java.lang.Object > org.springframework.integration.xml.config.GenericMessage<java.lang.Object> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.xml.config.MessageChannel . send ( org.springframework.integration.xml.config.GenericMessage<java.lang.Object> ) ; Message < ? > org.springframework.integration.xml.config.Message<?> = org.springframework.integration.xml.config.PollableChannel . receive ( NUMBER ) ; assertTrue ( STRING , org.springframework.integration.xml.config.Message<> . getPayload ( ) instanceof javax.xml.transform.dom.DOMResult ) ; org.w3c.dom.Document org.w3c.dom.Document = ( org.w3c.dom.Document ) ( ( javax.xml.transform.dom.DOMResult ) org.springframework.integration.xml.config.Message<> . getPayload ( ) ) . org.w3c.dom.Node ( ) ; java.lang.String java.lang.String = org.w3c.dom.Document . org.w3c.dom.Element ( ) . java.lang.String ( ) ; assertThat ( java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( java.lang.String , Matchers . containsString ( STRING ) ) ; assertThat ( java.lang.String , Matchers . containsString ( STRING ) ) ; }  <METHOD_END>
