<METHOD_START> @ Test public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; ClassPathXmlApplicationContext org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithCorrelationKeyProvidedTests> ( ) ) ; RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; ClassPathXmlApplicationContext org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithCorrelationKeyProvidedTests> ( ) ) ; RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; ClassPathXmlApplicationContext org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithCorrelationKeyProvidedTests> ( ) ) ; RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; java.lang.String java.lang.String = java.util.UUID . java.util.UUID ( ) . java.lang.String ( ) . java.lang.String ( STRING , STRING ) ; Message < ? > org.springframework.integration.jms.request_reply.Message<?> = org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( MessageBuilder . withPayload ( STRING ) . setHeader ( JmsHeaders . CORRELATION_ID , java.lang.String ) . build ( ) ) ; assertEquals ( java.lang.String , org.springframework.integration.jms.request_reply.Message<> . getHeaders ( ) . get ( STRING ) ) ; org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; ClassPathXmlApplicationContext org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithCorrelationKeyProvidedTests> ( ) ) ; RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { try { org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { } } JmsOutboundGateway org.springframework.integration.jms.request_reply.JmsOutboundGateway = TestUtils . getPropertyValue ( org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . getBean ( STRING ) , STRING , JmsOutboundGateway .class ) ; org.springframework.integration.jms.request_reply.JmsOutboundGateway . setReceiveTimeout ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( MessageBuilder . withPayload ( STRING ) . build ( ) ) . getPayload ( ) ) ; org.springframework.integration.jms.request_reply.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.Thread . void ( NUMBER ) ; return java.lang.String ; }  <METHOD_END>
