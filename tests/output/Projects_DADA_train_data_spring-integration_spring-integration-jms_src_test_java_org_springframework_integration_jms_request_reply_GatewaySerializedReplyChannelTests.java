<METHOD_START> @ Test public void void ( ) { org.springframework.integration.jms.request_reply.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.jms.request_reply.Message<?> = org.springframework.integration.jms.request_reply.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.jms.request_reply.Message<> ) ; assertEquals ( STRING , org.springframework.integration.jms.request_reply.Message<> . getPayload ( ) ) ; }  <METHOD_END>
