<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.groovy.config.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.groovy.config.QueueChannel . setBeanName ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.groovy.config.QueueChannel ) . setHeader ( STRING , STRING ) . build ( ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.groovy.config.QueueChannel ) . setHeader ( STRING , java.lang.Math . double ) . build ( ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.groovy.config.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.groovy.config.QueueChannel . setBeanName ( STRING ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.groovy.config.QueueChannel ) . build ( ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.groovy.config.QueueChannel ) . build ( ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; this . org.springframework.integration.groovy.config.MessageChannel . send ( org.springframework.integration.groovy.config.Message<> ) ; Message < ? > org.springframework.integration.groovy.config.Message<?> = org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.groovy.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.groovy.config.Message<> . getPayload ( ) ) ; assertEquals ( org.springframework.integration.groovy.config.Message<> , org.springframework.integration.groovy.config.Message<> ) ; assertNull ( org.springframework.integration.groovy.config.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( this . org.springframework.integration.groovy.config.MessageHandler instanceof MessageFilter ) ; MessageSelector org.springframework.integration.groovy.config.MessageSelector = TestUtils . getPropertyValue ( this . org.springframework.integration.groovy.config.MessageHandler , STRING , MethodInvokingSelector .class ) ; @ java.lang.SuppressWarnings ( STRING ) MessageProcessor org.springframework.integration.groovy.config.MessageProcessor = TestUtils . getPropertyValue ( org.springframework.integration.groovy.config.MessageSelector , STRING , MessageProcessor .class ) ; assertTrue ( org.springframework.integration.groovy.config.MessageProcessor instanceof GroovyScriptExecutingMessageProcessor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { this . org.springframework.integration.groovy.config.MessageChannel . send ( new GenericMessage < java.lang.Object > ( STRING ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageHandlingException .class ) ) ; assertThat ( java.lang.Exception . java.lang.Throwable ( ) , instanceOf ( MultipleCompilationErrorsException .class ) ) ; assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.groovy.config.CompilerConfiguration org.springframework.integration.groovy.config.CompilerConfiguration ( ) { CompilerConfiguration org.springframework.integration.groovy.config.CompilerConfiguration = new CompilerConfiguration ( ) ; ImportCustomizer org.springframework.integration.groovy.config.ImportCustomizer = new ImportCustomizer ( ) ; org.springframework.integration.groovy.config.ImportCustomizer . addStaticImport ( STRING , STRING , STRING ) ; org.springframework.integration.groovy.config.CompilerConfiguration . addCompilationCustomizers ( org.springframework.integration.groovy.config.ImportCustomizer ) ; return org.springframework.integration.groovy.config.CompilerConfiguration ; }  <METHOD_END>
