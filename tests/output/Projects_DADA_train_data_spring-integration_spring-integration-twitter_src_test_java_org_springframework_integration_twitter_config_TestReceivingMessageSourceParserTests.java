<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.twitter.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , java.lang.Class<? extends org.springframework.integration.twitter.config.TestReceivingMessageSourceParserTests> ( ) ) ; SourcePollingChannelAdapter org.springframework.integration.twitter.config.SourcePollingChannelAdapter = org.springframework.integration.twitter.config.ConfigurableApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; MentionsReceivingMessageSource org.springframework.integration.twitter.config.MentionsReceivingMessageSource = TestUtils . getPropertyValue ( org.springframework.integration.twitter.config.SourcePollingChannelAdapter , STRING , MentionsReceivingMessageSource .class ) ; assertEquals ( java.lang.Integer . java.lang.Integer ( NUMBER ) , TestUtils . getPropertyValue ( org.springframework.integration.twitter.config.MentionsReceivingMessageSource , STRING , java.lang.Integer .class ) ) ; assertNotNull ( org.springframework.integration.twitter.config.MentionsReceivingMessageSource ) ; org.springframework.integration.twitter.config.SourcePollingChannelAdapter = org.springframework.integration.twitter.config.ConfigurableApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; DirectMessageReceivingMessageSource org.springframework.integration.twitter.config.DirectMessageReceivingMessageSource = TestUtils . getPropertyValue ( org.springframework.integration.twitter.config.SourcePollingChannelAdapter , STRING , DirectMessageReceivingMessageSource .class ) ; assertNotNull ( org.springframework.integration.twitter.config.DirectMessageReceivingMessageSource ) ; assertEquals ( java.lang.Integer . java.lang.Integer ( NUMBER ) , TestUtils . getPropertyValue ( org.springframework.integration.twitter.config.DirectMessageReceivingMessageSource , STRING , java.lang.Integer .class ) ) ; org.springframework.integration.twitter.config.SourcePollingChannelAdapter = org.springframework.integration.twitter.config.ConfigurableApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; TimelineReceivingMessageSource org.springframework.integration.twitter.config.TimelineReceivingMessageSource = TestUtils . getPropertyValue ( org.springframework.integration.twitter.config.SourcePollingChannelAdapter , STRING , TimelineReceivingMessageSource .class ) ; assertEquals ( java.lang.Integer . java.lang.Integer ( NUMBER ) , TestUtils . getPropertyValue ( org.springframework.integration.twitter.config.TimelineReceivingMessageSource , STRING , java.lang.Integer .class ) ) ; assertNotNull ( org.springframework.integration.twitter.config.TimelineReceivingMessageSource ) ; org.springframework.integration.twitter.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.twitter.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.twitter.config.TestReceivingMessageSourceParserTests> ( ) ) ; MentionsReceivingMessageSource org.springframework.integration.twitter.config.MentionsReceivingMessageSource = org.springframework.integration.twitter.config.ConfigurableApplicationContext . getBean ( STRING , MentionsReceivingMessageSource .class ) ; assertNotNull ( org.springframework.integration.twitter.config.MentionsReceivingMessageSource ) ; DirectMessageReceivingMessageSource org.springframework.integration.twitter.config.DirectMessageReceivingMessageSource = org.springframework.integration.twitter.config.ConfigurableApplicationContext . getBean ( STRING , DirectMessageReceivingMessageSource .class ) ; assertNotNull ( org.springframework.integration.twitter.config.DirectMessageReceivingMessageSource ) ; TimelineReceivingMessageSource org.springframework.integration.twitter.config.TimelineReceivingMessageSource = org.springframework.integration.twitter.config.ConfigurableApplicationContext . getBean ( STRING , TimelineReceivingMessageSource .class ) ; assertNotNull ( org.springframework.integration.twitter.config.TimelineReceivingMessageSource ) ; org.springframework.integration.twitter.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>