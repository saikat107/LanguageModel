<METHOD_START> @ Before public void void ( ) { org.springframework.integration.aggregator.Message<?> = MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . setHeader ( STRING , STRING ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingCorrelationStrategy org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy = new MethodInvokingCorrelationStrategy ( new org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.SimpleMessageCorrelator ( ) , STRING ) ; assertEquals ( STRING , org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingCorrelationStrategy org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy = new MethodInvokingCorrelationStrategy ( new org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.SimpleMessageCorrelator ( ) , ReflectionUtils . findMethod ( org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.SimpleMessageCorrelator .class , STRING , Message .class ) ) ; assertEquals ( STRING , org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingCorrelationStrategy org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy = new MethodInvokingCorrelationStrategy ( new org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.SimplePojoCorrelator ( ) , STRING ) ; assertEquals ( STRING , org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingCorrelationStrategy org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy = new MethodInvokingCorrelationStrategy ( new org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.SimpleHeaderCorrelator ( ) , STRING ) ; assertEquals ( STRING , org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodInvokingCorrelationStrategy org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy = new MethodInvokingCorrelationStrategy ( new org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.MultiHeaderCorrelator ( ) , ReflectionUtils . findMethod ( org.springframework.integration.aggregator.CorrelationStrategyAdapterTests.MultiHeaderCorrelator .class , STRING , java.lang.String .class , java.lang.String .class ) ) ; assertEquals ( STRING , org.springframework.integration.aggregator.MethodInvokingCorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( @ Header ( STRING ) java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String ) { return java.lang.String + java.lang.String ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( @ Header ( STRING ) java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < ? > org.springframework.integration.aggregator.Message<?> ) { return ( java.lang.String ) org.springframework.integration.aggregator.Message<> . getHeaders ( ) . get ( STRING ) ; }  <METHOD_END>
