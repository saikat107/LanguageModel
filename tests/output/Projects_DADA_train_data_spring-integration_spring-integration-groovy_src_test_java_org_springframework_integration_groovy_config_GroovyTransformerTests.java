<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.groovy.config.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.groovy.config.QueueChannel . setBeanName ( STRING ) ; for ( int int = NUMBER ; int <= NUMBER ; int ++ ) { Message < ? > org.springframework.integration.groovy.config.Message<?> = MessageBuilder . withPayload ( STRING + int ) . setReplyChannel ( org.springframework.integration.groovy.config.QueueChannel ) . build ( ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; } assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.groovy.config.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.groovy.config.QueueChannel . setBeanName ( STRING ) ; for ( int int = NUMBER ; int <= NUMBER ; int ++ ) { Message < ? > org.springframework.integration.groovy.config.Message<?> = MessageBuilder . withPayload ( STRING + int ) . setReplyChannel ( org.springframework.integration.groovy.config.QueueChannel ) . build ( ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; } assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( this . org.springframework.integration.groovy.config.MessageHandler instanceof MessageTransformingHandler ) ; Transformer org.springframework.integration.groovy.config.Transformer = TestUtils . getPropertyValue ( this . org.springframework.integration.groovy.config.MessageHandler , STRING , Transformer .class ) ; assertTrue ( org.springframework.integration.groovy.config.Transformer instanceof AbstractMessageProcessingTransformer ) ; @ java.lang.SuppressWarnings ( STRING ) MessageProcessor org.springframework.integration.groovy.config.MessageProcessor = TestUtils . getPropertyValue ( org.springframework.integration.groovy.config.Transformer , STRING , MessageProcessor .class ) ; assertTrue ( org.springframework.integration.groovy.config.MessageProcessor instanceof GroovyScriptExecutingMessageProcessor ) ; }  <METHOD_END>
