<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) ) ; assertNull ( org.springframework.integration.groovy.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( this . org.springframework.integration.groovy.config.MessageHandler instanceof MethodInvokingRouter ) ; @ java.lang.SuppressWarnings ( STRING ) MessageProcessor org.springframework.integration.groovy.config.MessageProcessor = TestUtils . getPropertyValue ( this . org.springframework.integration.groovy.config.MessageHandler , STRING , MessageProcessor .class ) ; assertTrue ( org.springframework.integration.groovy.config.MessageProcessor instanceof GroovyScriptExecutingMessageProcessor ) ; }  <METHOD_END>
