<METHOD_START> @ Test public void void ( ) { AmqpInboundChannelAdapter org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter = new AmqpInboundChannelAdapter ( this . org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer ) ; org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter . setOutputChannel ( org.springframework.integration.amqp.inbound.MessageChannel ) ; org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter . afterPropertiesSet ( ) ; org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter . start ( ) ; this . org.springframework.integration.amqp.inbound.RabbitTemplate . convertAndSend ( STRING ) ; Message < ? > org.springframework.integration.amqp.inbound.Message<?> = org.springframework.integration.amqp.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.amqp.inbound.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.amqp.inbound.Message<> . getPayload ( ) ) ; org.springframework.integration.amqp.inbound.Message<?> = org.springframework.integration.amqp.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.amqp.inbound.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.amqp.inbound.Message<> . getPayload ( ) ) ; org.springframework.integration.amqp.inbound.Message<?> = org.springframework.integration.amqp.inbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.amqp.inbound.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.amqp.inbound.Message<> . getPayload ( ) ) ; org.springframework.integration.amqp.inbound.Message<?> = org.springframework.integration.amqp.inbound.PollableChannel . receive ( NUMBER ) ; assertNull ( org.springframework.integration.amqp.inbound.Message<> ) ; org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator ( inputChannel = STRING , outputChannel = STRING ) public java.lang.Integer java.lang.Integer ( @ Payload java.lang.String java.lang.String , @ Header ( AmqpHeaders . CHANNEL ) Channel org.springframework.integration.amqp.inbound.Channel , @ Header ( AmqpHeaders . DELIVERY_TAG ) java.lang.Long java.lang.Long ) throws java.lang.Exception { if ( ++ int > NUMBER ) { org.springframework.integration.amqp.inbound.Channel . basicAck ( java.lang.Long , false ) ; } else { org.springframework.integration.amqp.inbound.Channel . basicNack ( java.lang.Long , false , true ) ; } return int ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.amqp.inbound.QueueChannel org.springframework.integration.amqp.inbound.QueueChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.amqp.inbound.CachingConnectionFactory org.springframework.integration.amqp.inbound.CachingConnectionFactory ( ) { CachingConnectionFactory org.springframework.integration.amqp.inbound.CachingConnectionFactory = new CachingConnectionFactory ( ) ; org.springframework.integration.amqp.inbound.CachingConnectionFactory . setHost ( STRING ) ; return org.springframework.integration.amqp.inbound.CachingConnectionFactory ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.amqp.inbound.Queue org.springframework.integration.amqp.inbound.Queue ( ) { return new AnonymousQueue ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer ( ) { SimpleMessageListenerContainer org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.inbound.CachingConnectionFactory ( ) ) ; org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer . setQueues ( org.springframework.integration.amqp.inbound.Queue ( ) ) ; org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer . setAcknowledgeMode ( AcknowledgeMode . MANUAL ) ; org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer . setAutoStartup ( false ) ; return org.springframework.integration.amqp.inbound.SimpleMessageListenerContainer ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.amqp.inbound.RabbitTemplate org.springframework.integration.amqp.inbound.RabbitTemplate ( ) { RabbitTemplate org.springframework.integration.amqp.inbound.RabbitTemplate = new RabbitTemplate ( org.springframework.integration.amqp.inbound.CachingConnectionFactory ( ) ) ; org.springframework.integration.amqp.inbound.RabbitTemplate . setRoutingKey ( org.springframework.integration.amqp.inbound.Queue ( ) . getName ( ) ) ; return org.springframework.integration.amqp.inbound.RabbitTemplate ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.amqp.inbound.RabbitAdmin org.springframework.integration.amqp.inbound.RabbitAdmin ( ) { return new RabbitAdmin ( org.springframework.integration.amqp.inbound.CachingConnectionFactory ( ) ) ; }  <METHOD_END>
