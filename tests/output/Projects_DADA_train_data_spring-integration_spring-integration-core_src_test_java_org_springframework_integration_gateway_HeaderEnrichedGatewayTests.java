<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object = STRING ; org.springframework.integration.gateway.HeaderEnrichedGatewayTests.SampleGateway . void ( ( java.lang.String ) java.lang.Object ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( java.lang.Object , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertNull ( org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object = NUMBER ; org.springframework.integration.gateway.HeaderEnrichedGatewayTests.SampleGateway . void ( ( java.lang.Integer ) java.lang.Object ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( java.lang.Object , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertNull ( org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object = STRING ; org.springframework.integration.gateway.HeaderEnrichedGatewayTests.SampleGateway . void ( ( java.lang.String ) java.lang.Object , STRING , STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object = STRING ; org.springframework.integration.gateway.HeaderEnrichedGatewayTests.SampleGateway . void ( ( java.lang.String ) java.lang.Object ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( java.lang.Object , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertNull ( org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object = NUMBER ; org.springframework.integration.gateway.HeaderEnrichedGatewayTests.SampleGateway . void ( ( java.lang.Integer ) java.lang.Object ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( java.lang.Object , org.springframework.integration.gateway.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertNull ( org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; java.lang.Object = STRING ; org.springframework.integration.gateway.HeaderEnrichedGatewayTests.SampleGateway . void ( ( java.lang.String ) java.lang.Object , STRING , STRING ) ; Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( java.lang.Integer java.lang.Integer );  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String , @ Header ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
