<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; this . org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; this . org.springframework.integration.config.xml.PollingConsumer . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BarrierMessageHandler org.springframework.integration.config.xml.BarrierMessageHandler = TestUtils . getPropertyValue ( this . org.springframework.integration.config.xml.PollingConsumer , STRING , BarrierMessageHandler .class ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.config.xml.BarrierMessageHandler , STRING ) ) ; assertTrue ( TestUtils . getPropertyValue ( org.springframework.integration.config.xml.BarrierMessageHandler , STRING , java.lang.Boolean .class ) ) ; assertThat ( TestUtils . getPropertyValue ( this . org.springframework.integration.config.xml.PollingConsumer , STRING ) , instanceOf ( HeaderAttributeCorrelationStrategy .class ) ) ; assertThat ( TestUtils . getPropertyValue ( this . org.springframework.integration.config.xml.EventDrivenConsumer , STRING ) , instanceOf ( org.springframework.integration.config.xml.BarrierParserTests.TestMGP .class ) ) ; assertThat ( TestUtils . getPropertyValue ( this . org.springframework.integration.config.xml.EventDrivenConsumer , STRING ) , instanceOf ( org.springframework.integration.config.xml.BarrierParserTests.TestCS .class ) ) ; assertSame ( org.springframework.integration.config.xml.BarrierMessageHandler . getDiscardChannel ( ) , this . org.springframework.integration.config.xml.PollableChannel ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MessageGroup org.springframework.integration.config.xml.MessageGroup ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.config.xml.Message<?> ) { return null ; }  <METHOD_END>
