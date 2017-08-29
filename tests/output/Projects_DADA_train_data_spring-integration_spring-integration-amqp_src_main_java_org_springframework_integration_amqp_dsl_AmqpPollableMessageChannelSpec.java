<METHOD_START> void ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { this( new AmqpChannelFactoryBean ( false ) , org.springframework.integration.amqp.dsl.ConnectionFactory ); }  <METHOD_END>
<METHOD_START> void ( AmqpChannelFactoryBean org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean , ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean = org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean ; this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setConnectionFactory ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setSingleton ( false ) ; this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setPubSub ( false ) ; this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setBeanFactory ( new DefaultListableBeanFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected S S ( java.lang.String java.lang.String ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setBeanName ( java.lang.String ) ; return super. id ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { if ( getId ( ) == null ) { S ( java.lang.String + STRING ) ; } this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setQueueName ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.lang.String java.lang.String ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setEncoding ( java.lang.String ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( MessageConverter org.springframework.integration.amqp.dsl.MessageConverter ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setMessageConverter ( org.springframework.integration.amqp.dsl.MessageConverter ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setChannelTransacted ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setTemplateChannelTransacted ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( MessagePropertiesConverter org.springframework.integration.amqp.dsl.MessagePropertiesConverter ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setMessagePropertiesConverter ( org.springframework.integration.amqp.dsl.MessagePropertiesConverter ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( MessageDeliveryMode org.springframework.integration.amqp.dsl.MessageDeliveryMode ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setDefaultDeliveryMode ( org.springframework.integration.amqp.dsl.MessageDeliveryMode ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setExtractPayload ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( AmqpHeaderMapper org.springframework.integration.amqp.dsl.AmqpHeaderMapper ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setOutboundHeaderMapper ( org.springframework.integration.amqp.dsl.AmqpHeaderMapper ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( AmqpHeaderMapper org.springframework.integration.amqp.dsl.AmqpHeaderMapper ) { this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . setInboundHeaderMapper ( org.springframework.integration.amqp.dsl.AmqpHeaderMapper ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . target . setHeadersMappedLast ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.amqp.dsl.AbstractAmqpChannel org.springframework.integration.amqp.dsl.AbstractAmqpChannel ( ) { Assert . notNull ( getId ( ) , STRING ) ; try { this . channel = this . org.springframework.integration.amqp.dsl.AmqpChannelFactoryBean . getObject ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new BeanCreationException ( STRING , java.lang.Exception ) ; } return super. doGet ( ) ; }  <METHOD_END>