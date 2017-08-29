<METHOD_START> @ Test @ DirtiesContext public void void ( ) java.lang.Exception { org.springframework.integration.config.MessageChannel . send ( org.springframework.integration.config.Message<java.lang.String> ( STRING , STRING , NUMBER , NUMBER , null ) ) ; org.springframework.integration.config.TestHandler . getLatch ( ) . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( STRING , STRING , org.springframework.integration.config.TestHandler . getMessageString ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.MessageGroupStore . getMessageGroup ( STRING ) . size ( ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.MessageGroupStore . getMessageGroup ( java.lang.String + STRING ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) { assertSame ( this . org.springframework.integration.config.MessageGroupStore , TestUtils . getPropertyValue ( this . org.springframework.integration.config.PollableChannel , STRING ) ) ; assertThat ( this . org.springframework.integration.config.PollableChannel , instanceOf ( PriorityChannel .class ) ) ; }  <METHOD_END>
<METHOD_START> private static < T > org.springframework.integration.config.Message<T> < T > org.springframework.integration.config.Message<T> ( T T , java.lang.Object java.lang.Object , int int , int int , MessageChannel org.springframework.integration.config.MessageChannel ) { return MessageBuilder . withPayload ( T ) . setCorrelationId ( java.lang.Object ) . setSequenceSize ( int ) . setSequenceNumber ( int ) . setReplyChannel ( org.springframework.integration.config.MessageChannel ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
