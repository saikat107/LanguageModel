<METHOD_START> @ Test @ DirtiesContext public void void ( ) { org.springframework.integration.config.MessageChannel . send ( org.springframework.integration.config.Message<java.lang.String> ( STRING , STRING , NUMBER , NUMBER , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.MessageGroupStore . getMessageGroup ( STRING ) . size ( ) ) ; org.springframework.integration.config.MessageChannel . send ( org.springframework.integration.config.Message<java.lang.String> ( STRING , STRING , NUMBER , NUMBER , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.MessageGroupStore . getMessageGroup ( STRING ) . size ( ) ) ; org.springframework.integration.config.MessageChannel . send ( org.springframework.integration.config.Message<java.lang.String> ( STRING , STRING , NUMBER , NUMBER , null ) ) ; assertEquals ( STRING , NUMBER , org.springframework.integration.config.TestAggregatorBean . getAggregatedMessages ( ) . size ( ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.TestAggregatorBean . getAggregatedMessages ( ) . get ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) { org.springframework.integration.config.MessageChannel . send ( org.springframework.integration.config.Message<java.lang.String> ( STRING , STRING , NUMBER , NUMBER , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.MessageGroupStore . getMessageGroup ( STRING ) . size ( ) ) ; org.springframework.integration.config.MessageChannel . send ( org.springframework.integration.config.Message<java.lang.String> ( STRING , STRING , NUMBER , NUMBER , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.config.MessageGroupStore . getMessageGroup ( STRING ) . size ( ) ) ; this . org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.Object > ( STRING ) ) ; assertEquals ( STRING , NUMBER , org.springframework.integration.config.TestAggregatorBean . getAggregatedMessages ( ) . size ( ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.TestAggregatorBean . getAggregatedMessages ( ) . get ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> private static < T > org.springframework.integration.config.Message<T> < T > org.springframework.integration.config.Message<T> ( T T , java.lang.Object java.lang.Object , int int , int int , MessageChannel org.springframework.integration.config.MessageChannel ) { return MessageBuilder . withPayload ( T ) . setCorrelationId ( java.lang.Object ) . setSequenceSize ( int ) . setSequenceNumber ( int ) . setReplyChannel ( org.springframework.integration.config.MessageChannel ) . build ( ) ; }  <METHOD_END>