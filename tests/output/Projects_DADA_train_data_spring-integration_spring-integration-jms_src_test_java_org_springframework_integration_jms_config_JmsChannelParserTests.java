<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; AbstractMessageListenerContainer org.springframework.integration.jms.config.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( org.springframework.integration.jms.config.Queue , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestination ( ) ) ; assertEquals ( org.springframework.integration.jms.config.Queue , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getDestination ( ) ) ; assertEquals ( true , TestUtils . getPropertyValue ( org.springframework.integration.jms.config.JmsTemplate , STRING ) ) ; assertEquals ( DeliveryMode . PERSISTENT , TestUtils . getPropertyValue ( org.springframework.integration.jms.config.JmsTemplate , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.jms.config.JmsTemplate , STRING ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.jms.config.JmsTemplate , STRING ) ) ; assertEquals ( java.lang.Integer . int , TestUtils . getPropertyValue ( TestUtils . getPropertyValue ( org.springframework.integration.jms.config.SubscribableJmsChannel , STRING ) , STRING , java.lang.Integer .class ) . intValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; AbstractMessageListenerContainer org.springframework.integration.jms.config.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestinationName ( ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getDestinationName ( ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( TestUtils . getPropertyValue ( org.springframework.integration.jms.config.SubscribableJmsChannel , STRING ) , STRING , java.lang.Integer .class ) . intValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; AbstractMessageListenerContainer org.springframework.integration.jms.config.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestinationName ( ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; AbstractMessageListenerContainer org.springframework.integration.jms.config.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( org.springframework.integration.jms.config.Topic , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestination ( ) ) ; assertEquals ( org.springframework.integration.jms.config.Topic , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getDestination ( ) ) ; assertSame ( this . org.springframework.integration.jms.config.MessageBuilderFactory , TestUtils . getPropertyValue ( org.springframework.integration.jms.config.SubscribableJmsChannel , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; AbstractMessageListenerContainer org.springframework.integration.jms.config.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestinationName ( ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getDestinationName ( ) ) ; assertTrue ( org.springframework.integration.jms.config.AbstractMessageListenerContainer . isSubscriptionShared ( ) ) ; assertTrue ( org.springframework.integration.jms.config.AbstractMessageListenerContainer . isSubscriptionDurable ( ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getSubscriptionName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; AbstractMessageListenerContainer org.springframework.integration.jms.config.AbstractMessageListenerContainer = ( AbstractMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestinationName ( ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.AbstractMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; DefaultMessageListenerContainer org.springframework.integration.jms.config.DefaultMessageListenerContainer = ( DefaultMessageListenerContainer ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( NUMBER , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getConcurrentConsumers ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getMaxConcurrentConsumers ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> < ChannelInterceptor > java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> = ( java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> < ChannelInterceptor > ) new DirectFieldAccessor ( org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) . getPropertyValue ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> . size ( ) ) ; assertEquals ( org.springframework.integration.jms.config.JmsChannelParserTests.TestInterceptor .class , java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> . get ( NUMBER ) . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { assertEquals ( SubscribableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; SubscribableJmsChannel org.springframework.integration.jms.config.SubscribableJmsChannel = ( SubscribableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.SubscribableJmsChannel ) ; java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> < ChannelInterceptor > java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> = ( java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> < ChannelInterceptor > ) new DirectFieldAccessor ( org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) . getPropertyValue ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> . size ( ) ) ; assertEquals ( org.springframework.integration.jms.config.JmsChannelParserTests.TestInterceptor .class , java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> . get ( NUMBER ) . getClass ( ) ) ; assertEquals ( org.springframework.integration.jms.config.JmsChannelParserTests.TestInterceptor .class , java.util.List<org.springframework.integration.jms.config.ChannelInterceptor> . get ( NUMBER ) . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( PollableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; PollableJmsChannel org.springframework.integration.jms.config.PollableJmsChannel = ( PollableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.PollableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( org.springframework.integration.jms.config.Queue , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestination ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( PollableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; PollableJmsChannel org.springframework.integration.jms.config.PollableJmsChannel = ( PollableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.PollableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( PollableJmsChannel .class , org.springframework.integration.jms.config.MessageChannel . getClass ( ) ) ; PollableJmsChannel org.springframework.integration.jms.config.PollableJmsChannel = ( PollableJmsChannel ) org.springframework.integration.jms.config.MessageChannel ; DirectFieldAccessor org.springframework.integration.jms.config.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.jms.config.PollableJmsChannel ) ; JmsTemplate org.springframework.integration.jms.config.JmsTemplate = ( JmsTemplate ) org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( org.springframework.integration.jms.config.Queue , org.springframework.integration.jms.config.JmsTemplate . getDefaultDestination ( ) ) ; assertEquals ( STRING , org.springframework.integration.jms.config.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultMessageListenerContainer org.springframework.integration.jms.config.DefaultMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.config.MessageChannel , STRING , DefaultMessageListenerContainer .class ) ; assertEquals ( STRING , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getDestination ( ) . toString ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getConcurrentConsumers ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getMaxConcurrentConsumers ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultMessageListenerContainer org.springframework.integration.jms.config.DefaultMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.config.MessageChannel , STRING , DefaultMessageListenerContainer .class ) ; assertEquals ( STRING , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultMessageListenerContainer org.springframework.integration.jms.config.DefaultMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.config.MessageChannel , STRING , DefaultMessageListenerContainer .class ) ; assertEquals ( STRING , org.springframework.integration.jms.config.DefaultMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleMessageListenerContainer org.springframework.integration.jms.config.SimpleMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.config.MessageChannel , STRING , SimpleMessageListenerContainer .class ) ; assertEquals ( STRING , org.springframework.integration.jms.config.SimpleMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.config.MessageChannel , STRING , org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer .class ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer = TestUtils . getPropertyValue ( org.springframework.integration.jms.config.MessageChannel , STRING , org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer .class ) ; assertEquals ( STRING , org.springframework.integration.jms.config.JmsChannelParserTests.CustomTestMessageListenerContainer . getDestinationName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jms.config.Destination org.springframework.integration.jms.config.Destination ( Session org.springframework.integration.jms.config.Session , java.lang.String java.lang.String , boolean boolean )				throws org.springframework.integration.jms.config.JMSException { if ( ! STRING . boolean ( java.lang.String ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } return boolean ? org.springframework.integration.jms.config.Topic : org.springframework.integration.jms.config.Queue ; }  <METHOD_END>