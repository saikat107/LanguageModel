<METHOD_START> @ Test ( expected = MessageTimeoutException .class ) public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; AbstractApplicationContext org.springframework.integration.jms.request_reply.AbstractApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithNonCachedConsumersTests> ( ) ) ; try { RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; ConnectionFactory org.springframework.integration.jms.request_reply.ConnectionFactory = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( ConnectionFactory .class ) ; final JmsTemplate org.springframework.integration.jms.request_reply.JmsTemplate = new JmsTemplate ( org.springframework.integration.jms.request_reply.ConnectionFactory ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; new java.lang.Thread ( ( ) { final Message org.springframework.integration.jms.request_reply.Message = org.springframework.integration.jms.request_reply.JmsTemplate . receive ( org.springframework.integration.jms.request_reply.Destination ) ; org.springframework.integration.jms.request_reply.JmsTemplate . send ( org.springframework.integration.jms.request_reply.Destination , ( MessageCreator ) session -> { TextMessage message = session . createTextMessage ( ) ; message . setText ( STRING ) ; message . setJMSCorrelationID ( requestMessage . getJMSMessageID ( ) ) ; return message ; } ) ; } ) . void ( ) ; org . springframework . org.springframework.messaging . org.springframework.messaging < ? > siReplyMessage = org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( STRING , siReplyMessage . getPayload ( ) ) ; } finally { org.springframework.integration.jms.request_reply.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; AbstractApplicationContext org.springframework.integration.jms.request_reply.AbstractApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithNonCachedConsumersTests> ( ) ) ; try { RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; ConnectionFactory org.springframework.integration.jms.request_reply.ConnectionFactory = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( ConnectionFactory .class ) ; final JmsTemplate org.springframework.integration.jms.request_reply.JmsTemplate = new JmsTemplate ( org.springframework.integration.jms.request_reply.ConnectionFactory ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; new java.lang.Thread ( ( ) { final Message org.springframework.integration.jms.request_reply.Message = org.springframework.integration.jms.request_reply.JmsTemplate . receive ( org.springframework.integration.jms.request_reply.Destination ) ; org.springframework.integration.jms.request_reply.JmsTemplate . send ( org.springframework.integration.jms.request_reply.Destination , ( MessageCreator ) session -> { TextMessage message = session . createTextMessage ( ) ; message . setText ( STRING ) ; message . setJMSCorrelationID ( requestMessage . getJMSMessageID ( ) ) ; return message ; } ) ; } ) . void ( ) ; org . springframework . org.springframework.messaging . org.springframework.messaging < ? > siReplyMessage = org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( STRING , siReplyMessage . getPayload ( ) ) ; } finally { org.springframework.integration.jms.request_reply.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; AbstractApplicationContext org.springframework.integration.jms.request_reply.AbstractApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithNonCachedConsumersTests> ( ) ) ; try { RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; ConnectionFactory org.springframework.integration.jms.request_reply.ConnectionFactory = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( ConnectionFactory .class ) ; final JmsTemplate org.springframework.integration.jms.request_reply.JmsTemplate = new JmsTemplate ( org.springframework.integration.jms.request_reply.ConnectionFactory ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; new java.lang.Thread ( ( ) { final Message org.springframework.integration.jms.request_reply.Message = org.springframework.integration.jms.request_reply.JmsTemplate . receive ( org.springframework.integration.jms.request_reply.Destination ) ; org.springframework.integration.jms.request_reply.JmsTemplate . send ( org.springframework.integration.jms.request_reply.Destination , ( MessageCreator ) session -> { TextMessage message = session . createTextMessage ( ) ; message . setText ( STRING ) ; message . setJMSCorrelationID ( requestMessage . getJMSCorrelationID ( ) ) ; return message ; } ) ; } ) . void ( ) ; org . springframework . org.springframework.messaging . org.springframework.messaging < ? > siReplyMessage = org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( STRING , siReplyMessage . getPayload ( ) ) ; } finally { org.springframework.integration.jms.request_reply.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageTimeoutException .class ) public void void ( ) java.lang.Exception { ActiveMqTestUtils . prepare ( ) ; AbstractApplicationContext org.springframework.integration.jms.request_reply.AbstractApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.jms.request_reply.RequestReplyScenariosWithNonCachedConsumersTests> ( ) ) ; try { RequestReplyExchanger org.springframework.integration.jms.request_reply.RequestReplyExchanger = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , RequestReplyExchanger .class ) ; ConnectionFactory org.springframework.integration.jms.request_reply.ConnectionFactory = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( ConnectionFactory .class ) ; final JmsTemplate org.springframework.integration.jms.request_reply.JmsTemplate = new JmsTemplate ( org.springframework.integration.jms.request_reply.ConnectionFactory ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; final Destination org.springframework.integration.jms.request_reply.Destination = org.springframework.integration.jms.request_reply.AbstractApplicationContext . getBean ( STRING , Destination .class ) ; new java.lang.Thread ( ( ) { final Message org.springframework.integration.jms.request_reply.Message = org.springframework.integration.jms.request_reply.JmsTemplate . receive ( org.springframework.integration.jms.request_reply.Destination ) ; org.springframework.integration.jms.request_reply.JmsTemplate . send ( org.springframework.integration.jms.request_reply.Destination , ( MessageCreator ) session -> { TextMessage message = session . createTextMessage ( ) ; message . setText ( STRING ) ; message . setJMSCorrelationID ( requestMessage . getJMSCorrelationID ( ) ) ; return message ; } ) ; } ) . void ( ) ; org . springframework . org.springframework.messaging . org.springframework.messaging < ? > siReplyMessage = org.springframework.integration.jms.request_reply.RequestReplyExchanger . exchange ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( STRING , siReplyMessage . getPayload ( ) ) ; } finally { org.springframework.integration.jms.request_reply.AbstractApplicationContext . close ( ) ; } }  <METHOD_END>
