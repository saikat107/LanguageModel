<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( new org.springframework.integration.transformer.SpelTransformerIntegrationTests.TestBean ( ) ) . setHeader ( STRING , NUMBER ) . build ( ) ; this . org.springframework.integration.transformer.MessageChannel . send ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; this . org.springframework.integration.transformer.MessageChannel . send ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { this . org.springframework.integration.transformer.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; } catch ( ReplyRequiredException org.springframework.integration.transformer.ReplyRequiredException ) { assertThat ( org.springframework.integration.transformer.ReplyRequiredException . getMessage ( ) , Matchers . containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.transformer.AbstractReplyProducingMessageHandler . setOutputChannel ( org.springframework.integration.transformer.QueueChannel ) ; org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo = new org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo ( STRING ) ; org.springframework.integration.transformer.AbstractReplyProducingMessageHandler . handleMessage ( new GenericMessage < org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo > ( org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo ) ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.transformer.Message<> ) ; assertTrue ( org.springframework.integration.transformer.Message<> . getPayload ( ) instanceof java.lang.String ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( this . org.springframework.integration.transformer.IntegrationEvaluationContextFactoryBean , STRING , java.util.Map .class ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.transformer.AbstractReplyProducingMessageHandler . setOutputChannel ( org.springframework.integration.transformer.QueueChannel ) ; org.springframework.integration.transformer.AbstractReplyProducingMessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.transformer.Message<> ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; this . org.springframework.integration.transformer.MessageChannel . send ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( ) { return new java.lang.Class<?> < ? > [] { org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo .class } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( EvaluationContext org.springframework.integration.transformer.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.integration.transformer.AccessException { return STRING . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.transformer.TypedValue org.springframework.integration.transformer.TypedValue ( EvaluationContext org.springframework.integration.transformer.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.integration.transformer.AccessException { Assert . isInstanceOf ( org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo .class , java.lang.Object ) ; return new TypedValue ( ( ( org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo ) java.lang.Object ) . java.lang.String ( ) , TypeDescriptor . valueOf ( java.lang.String .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( EvaluationContext org.springframework.integration.transformer.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.integration.transformer.AccessException { return STRING . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EvaluationContext org.springframework.integration.transformer.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.Object java.lang.Object )				throws org.springframework.integration.transformer.AccessException { Assert . isInstanceOf ( org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo .class , java.lang.Object ) ; Assert . isInstanceOf ( java.lang.String .class , java.lang.Object ) ; ( ( org.springframework.integration.transformer.SpelTransformerIntegrationTests.Foo ) java.lang.Object ) . void ( ( java.lang.String ) java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return STRING ; }  <METHOD_END>