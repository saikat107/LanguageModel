<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( new org.springframework.integration.transformer.DynamicExpressionTransformerIntegrationTests.TestBean ( ) ) . setHeader ( STRING , NUMBER ) . build ( ) ; this . org.springframework.integration.transformer.MessageChannel . send ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
