<METHOD_START> @ Test public void void ( ) { JmsTemplate org.springframework.integration.jms.JmsTemplate = new JmsTemplate ( connectionFactory ) ; org.springframework.integration.jms.JmsTemplate . convertAndSend ( STRING , STRING ) ; assertNotNull ( org.springframework.integration.jms.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.jms.ConnectionFactory org.springframework.integration.jms.ConnectionFactory ( ) { return amqFactory ; }  <METHOD_END>