<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.mail.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.mail.config.MailOutboundChannelAdapterParserTests> ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.mail.config.ConfigurableApplicationContext . getBean ( STRING ) ; MailSendingMessageHandler org.springframework.integration.mail.config.MailSendingMessageHandler = ( MailSendingMessageHandler ) new DirectFieldAccessor ( java.lang.Object ) . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.mail.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.mail.config.MailSendingMessageHandler ) ; MailSender org.springframework.integration.mail.config.MailSender = ( MailSender ) org.springframework.integration.mail.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( org.springframework.integration.mail.config.MailSender ) ; assertEquals ( NUMBER , org.springframework.integration.mail.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; org.springframework.integration.mail.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.mail.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.mail.config.MailOutboundChannelAdapterParserTests> ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.mail.config.ConfigurableApplicationContext . getBean ( STRING ) ; MessageHandler org.springframework.integration.mail.config.MessageHandler = ( MessageHandler ) new DirectFieldAccessor ( java.lang.Object ) . getPropertyValue ( STRING ) ; org.springframework.integration.mail.config.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( NUMBER , int ) ; org.springframework.integration.mail.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.mail.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.mail.config.MailOutboundChannelAdapterParserTests> ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.mail.config.ConfigurableApplicationContext . getBean ( STRING ) ; MailSendingMessageHandler org.springframework.integration.mail.config.MailSendingMessageHandler = ( MailSendingMessageHandler ) new DirectFieldAccessor ( java.lang.Object ) . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.mail.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.mail.config.MailSendingMessageHandler ) ; MailSender org.springframework.integration.mail.config.MailSender = ( MailSender ) org.springframework.integration.mail.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( org.springframework.integration.mail.config.MailSender ) ; org.springframework.integration.mail.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.mail.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.mail.config.MailOutboundChannelAdapterParserTests> ( ) ) ; PollingConsumer org.springframework.integration.mail.config.PollingConsumer = org.springframework.integration.mail.config.ConfigurableApplicationContext . getBean ( STRING , PollingConsumer .class ) ; QueueChannel org.springframework.integration.mail.config.QueueChannel = TestUtils . getPropertyValue ( org.springframework.integration.mail.config.PollingConsumer , STRING , QueueChannel .class ) ; assertEquals ( STRING , org.springframework.integration.mail.config.QueueChannel . getComponentName ( ) ) ; org.springframework.integration.mail.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.mail.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.mail.config.MailOutboundChannelAdapterParserTests> ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.mail.config.ConfigurableApplicationContext . getBean ( STRING ) ; MailSendingMessageHandler org.springframework.integration.mail.config.MailSendingMessageHandler = ( MailSendingMessageHandler ) new DirectFieldAccessor ( java.lang.Object ) . getPropertyValue ( STRING ) ; DirectFieldAccessor org.springframework.integration.mail.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.mail.config.MailSendingMessageHandler ) ; MailSender org.springframework.integration.mail.config.MailSender = ( MailSender ) org.springframework.integration.mail.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertNotNull ( org.springframework.integration.mail.config.MailSender ) ; java.util.Properties java.util.Properties = ( java.util.Properties ) TestUtils . getPropertyValue ( org.springframework.integration.mail.config.MailSender , STRING ) ; assertEquals ( NUMBER , java.util.Properties . int ( ) ) ; assertNotNull ( java.util.Properties ) ; assertEquals ( STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; org.springframework.integration.mail.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.mail.config.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.mail.config.Message<?> ) throws java.lang.Exception { int ++ ; return null ; }  <METHOD_END>