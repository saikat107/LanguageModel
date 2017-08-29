<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = java.util.Arrays . java.util.List<java.lang.Integer> ( NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER ) ; this . org.springframework.integration.jms.MessageChannel . send ( new GenericMessage < java.util.List<java.lang.Integer> < java.lang.Integer > > ( java.util.List<java.lang.Integer> ) ) ; Message < ? > org.springframework.integration.jms.Message<?> = this . org.springframework.integration.jms.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.jms.Message<> ) ; java.util.Collections . void ( ( ( java.util.List<java.lang.Integer> < java.lang.Integer > ) org.springframework.integration.jms.Message<> . getPayload ( ) ) ) ; assertEquals ( java.util.List<java.lang.Integer> , org.springframework.integration.jms.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Splitter ( inputChannel = STRING ) public org.springframework.integration.jms.MessageHandler org.springframework.integration.jms.MessageHandler ( ) { DefaultMessageSplitter org.springframework.integration.jms.DefaultMessageSplitter = new DefaultMessageSplitter ( ) ; org.springframework.integration.jms.DefaultMessageSplitter . setOutputChannelName ( STRING ) ; return org.springframework.integration.jms.DefaultMessageSplitter ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) public org.springframework.integration.jms.MessageHandler org.springframework.integration.jms.MessageHandler ( ) { JmsSendingMessageHandler org.springframework.integration.jms.JmsSendingMessageHandler = new JmsSendingMessageHandler ( new JmsTemplate ( connectionFactory ) ) ; org.springframework.integration.jms.JmsSendingMessageHandler . setDestinationName ( STRING ) ; return org.springframework.integration.jms.JmsSendingMessageHandler ; }  <METHOD_END>
<METHOD_START> @ Bean @ InboundChannelAdapter ( value = STRING , poller = @ Poller ( fixedDelay = STRING , maxMessagesPerPoll = STRING ) ) public org.springframework.integration.jms.MessageSource<java.lang.Object> < java.lang.Object > org.springframework.integration.jms.MessageSource<java.lang.Object> ( ) { JmsDestinationPollingSource org.springframework.integration.jms.JmsDestinationPollingSource = new JmsDestinationPollingSource ( new JmsTemplate ( connectionFactory ) ) ; org.springframework.integration.jms.JmsDestinationPollingSource . setDestinationName ( STRING ) ; return org.springframework.integration.jms.JmsDestinationPollingSource ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.jms.MessageChannel org.springframework.integration.jms.MessageChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) public org.springframework.integration.jms.MessageHandler org.springframework.integration.jms.MessageHandler ( ) { AggregatingMessageHandler org.springframework.integration.jms.AggregatingMessageHandler = new AggregatingMessageHandler ( new DefaultAggregatingMessageGroupProcessor ( ) ) ; org.springframework.integration.jms.AggregatingMessageHandler . setOutputChannel ( org.springframework.integration.jms.PollableChannel ( ) ) ; return org.springframework.integration.jms.AggregatingMessageHandler ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.jms.PollableChannel org.springframework.integration.jms.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
