<METHOD_START> public void ( MessageConsumer org.springframework.jms.connection.MessageConsumer ) { this . org.springframework.jms.connection.MessageConsumer = org.springframework.jms.connection.MessageConsumer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) org.springframework.jms.connection.JMSException { return this . org.springframework.jms.connection.MessageConsumer . getMessageSelector ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Queue org.springframework.jms.connection.Queue ( ) org.springframework.jms.connection.JMSException { return ( this . org.springframework.jms.connection.MessageConsumer instanceof QueueReceiver ? ( ( QueueReceiver ) this . org.springframework.jms.connection.MessageConsumer ) . getQueue ( ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Topic org.springframework.jms.connection.Topic ( ) org.springframework.jms.connection.JMSException { return ( this . org.springframework.jms.connection.MessageConsumer instanceof TopicSubscriber ? ( ( TopicSubscriber ) this . org.springframework.jms.connection.MessageConsumer ) . getTopic ( ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) org.springframework.jms.connection.JMSException { return ( this . org.springframework.jms.connection.MessageConsumer instanceof TopicSubscriber && ( ( TopicSubscriber ) this . org.springframework.jms.connection.MessageConsumer ) . getNoLocal ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.MessageListener org.springframework.jms.connection.MessageListener ( ) org.springframework.jms.connection.JMSException { return this . org.springframework.jms.connection.MessageConsumer . getMessageListener ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageListener org.springframework.jms.connection.MessageListener ) throws org.springframework.jms.connection.JMSException { this . org.springframework.jms.connection.MessageConsumer . setMessageListener ( org.springframework.jms.connection.MessageListener ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Message org.springframework.jms.connection.Message ( ) org.springframework.jms.connection.JMSException { return this . org.springframework.jms.connection.MessageConsumer . receive ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Message org.springframework.jms.connection.Message ( long long ) throws org.springframework.jms.connection.JMSException { return this . org.springframework.jms.connection.MessageConsumer . receive ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.connection.Message org.springframework.jms.connection.Message ( ) org.springframework.jms.connection.JMSException { return this . org.springframework.jms.connection.MessageConsumer . receiveNoWait ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) org.springframework.jms.connection.JMSException { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . org.springframework.jms.connection.MessageConsumer ; }  <METHOD_END>