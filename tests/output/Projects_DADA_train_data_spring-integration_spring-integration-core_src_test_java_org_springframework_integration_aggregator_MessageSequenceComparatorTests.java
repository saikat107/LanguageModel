<METHOD_START> @ Test public void void ( ) { MessageSequenceComparator org.springframework.integration.aggregator.MessageSequenceComparator = new MessageSequenceComparator ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; assertEquals ( - NUMBER , org.springframework.integration.aggregator.MessageSequenceComparator . compare ( org.springframework.integration.aggregator.Message<java.lang.String> , org.springframework.integration.aggregator.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageSequenceComparator org.springframework.integration.aggregator.MessageSequenceComparator = new MessageSequenceComparator ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.MessageSequenceComparator . compare ( org.springframework.integration.aggregator.Message<java.lang.String> , org.springframework.integration.aggregator.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageSequenceComparator org.springframework.integration.aggregator.MessageSequenceComparator = new MessageSequenceComparator ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.MessageSequenceComparator . compare ( org.springframework.integration.aggregator.Message<java.lang.String> , org.springframework.integration.aggregator.Message<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageSequenceComparator org.springframework.integration.aggregator.MessageSequenceComparator = new MessageSequenceComparator ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; Message < java.lang.String > org.springframework.integration.aggregator.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.MessageSequenceComparator . compare ( org.springframework.integration.aggregator.Message<java.lang.String> , org.springframework.integration.aggregator.Message<java.lang.String> ) ) ; }  <METHOD_END>