<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.groovy.Message<?> = MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ; Message < ? > org.springframework.integration.groovy.Message<?> = MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ; this . org.springframework.integration.groovy.MessageChannel . send ( org.springframework.integration.groovy.Message<> ) ; this . org.springframework.integration.groovy.MessageChannel . send ( org.springframework.integration.groovy.Message<> ) ; assertEquals ( STRING , this . org.springframework.integration.groovy.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( this . org.springframework.integration.groovy.PollableChannel . receive ( NUMBER ) ) ; assertEquals ( STRING , this . org.springframework.integration.groovy.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( this . org.springframework.integration.groovy.PollableChannel . receive ( NUMBER ) ) ; MessageProcessor < ? > org.springframework.integration.groovy.MessageProcessor<?> = TestUtils . getPropertyValue ( this . org.springframework.integration.groovy.MessageProcessor<> , STRING , MessageProcessor .class ) ; assertThat ( org.springframework.integration.groovy.MessageProcessor<> , instanceOf ( GroovyScriptExecutingMessageProcessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.groovy.PollableChannel org.springframework.integration.groovy.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.groovy.Resource org.springframework.integration.groovy.Resource ( ) { return new ByteArrayResource ( STRING . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.groovy.IntegrationFlow org.springframework.integration.groovy.IntegrationFlow ( ) { return f -> f . filter ( Scripts . processor ( scriptResource ( ) ) . lang ( STRING ) , e -> e . discardChannel ( STRING ) ) . channel ( c -> c . queue ( STRING ) ) ; }  <METHOD_END>