<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; this . org.springframework.integration.transformer.MessageChannel . send ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
