<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( org.springframework.integration.ftp.config.PublishSubscribeChannel , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING ) ) ; assertEquals ( STRING , org.springframework.integration.ftp.config.EventDrivenConsumer . getComponentName ( ) ) ; FileTransferringMessageHandler < ? > org.springframework.integration.ftp.config.FileTransferringMessageHandler<?> = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING , FileTransferringMessageHandler .class ) ; java.lang.String java.lang.String = ( java.lang.String ) TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ; assertNotNull ( java.lang.String ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING , java.lang.String .class ) ) ; assertEquals ( STRING , java.lang.String ) ; assertEquals ( this . org.springframework.integration.ftp.config.FileNameGenerator , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ) ; assertNotNull ( TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ) ; assertNotNull ( TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ) ; assertEquals ( FtpRemoteFileTemplate . ExistsMode . NLST , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ; assertEquals ( DefaultFtpSessionFactory .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; DefaultFtpSessionFactory org.springframework.integration.ftp.config.DefaultFtpSessionFactory = ( DefaultFtpSessionFactory ) java.lang.Object ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.DefaultFtpSessionFactory , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.DefaultFtpSessionFactory , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING ) ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.PublishSubscribeChannel , STRING ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Set<org.springframework.integration.ftp.config.MessageHandler> < MessageHandler > java.util.Set<org.springframework.integration.ftp.config.MessageHandler> = ( java.util.Set<org.springframework.integration.ftp.config.MessageHandler> < MessageHandler > ) TestUtils . getPropertyValue ( java.lang.Object , STRING ) ; java.util.Iterator<org.springframework.integration.ftp.config.MessageHandler> < MessageHandler > java.util.Iterator<org.springframework.integration.ftp.config.MessageHandler> = java.util.Set<org.springframework.integration.ftp.config.MessageHandler> . iterator ( ) ; assertSame ( TestUtils . getPropertyValue ( this . org.springframework.integration.ftp.config.EventDrivenConsumer , STRING ) , java.util.Iterator<org.springframework.integration.ftp.config.MessageHandler> . next ( ) ) ; assertSame ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , java.util.Iterator<org.springframework.integration.ftp.config.MessageHandler> . next ( ) ) ; assertEquals ( FileExistsMode . APPEND , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanCreationException .class ) public void void ( ) java.lang.Exception { new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.ftp.config.FtpOutboundChannelAdapterParserTests> ( ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING ) ; assertEquals ( CachingSessionFactory .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; java.lang.Object java.lang.Object = TestUtils . getPropertyValue ( java.lang.Object , STRING ) ; assertEquals ( DefaultFtpSessionFactory .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; assertEquals ( FileExistsMode . REPLACE , TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHandler org.springframework.integration.ftp.config.MessageHandler = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING , MessageHandler .class ) ; org.springframework.integration.ftp.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FileTransferringMessageHandler < ? > org.springframework.integration.ftp.config.FileTransferringMessageHandler<?> = ( FileTransferringMessageHandler < ? > ) TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.PollingConsumer , STRING ) ; assertFalse ( TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING , java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FileTransferringMessageHandler < ? > org.springframework.integration.ftp.config.FileTransferringMessageHandler<?> = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.EventDrivenConsumer , STRING , FileTransferringMessageHandler .class ) ; ExpressionEvaluatingMessageProcessor < ? > org.springframework.integration.ftp.config.ExpressionEvaluatingMessageProcessor<?> = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING , ExpressionEvaluatingMessageProcessor .class ) ; assertNotNull ( org.springframework.integration.ftp.config.ExpressionEvaluatingMessageProcessor<> ) ; Message < java.lang.String > org.springframework.integration.ftp.config.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; assertEquals ( STRING , org.springframework.integration.ftp.config.ExpressionEvaluatingMessageProcessor<> . processMessage ( org.springframework.integration.ftp.config.Message<java.lang.String> ) ) ; ExpressionEvaluatingMessageProcessor < ? > org.springframework.integration.ftp.config.ExpressionEvaluatingMessageProcessor<?> = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING , ExpressionEvaluatingMessageProcessor .class ) ; assertNotNull ( org.springframework.integration.ftp.config.ExpressionEvaluatingMessageProcessor<> ) ; assertEquals ( STRING , org.springframework.integration.ftp.config.ExpressionEvaluatingMessageProcessor<> . processMessage ( org.springframework.integration.ftp.config.Message<java.lang.String> ) ) ; DefaultFileNameGenerator org.springframework.integration.ftp.config.DefaultFileNameGenerator = TestUtils . getPropertyValue ( org.springframework.integration.ftp.config.FileTransferringMessageHandler<> , STRING , DefaultFileNameGenerator .class ) ; assertNotNull ( org.springframework.integration.ftp.config.DefaultFileNameGenerator ) ; assertEquals ( STRING , org.springframework.integration.ftp.config.DefaultFileNameGenerator . generateFileName ( org.springframework.integration.ftp.config.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.ftp.config.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.ftp.config.Message<?> ) throws java.lang.Exception { int ++ ; return null ; }  <METHOD_END>
