<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < org.springframework.integration.config.xml.ObjectToStringTransformerParserTests.TestBean > ( new org.springframework.integration.config.xml.ObjectToStringTransformerParserTests.TestBean ( ) ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.xml.MessageChannel . send ( new GenericMessage < org.springframework.integration.config.xml.ObjectToStringTransformerParserTests.TestBean > ( new org.springframework.integration.config.xml.ObjectToStringTransformerParserTests.TestBean ( ) ) ) ; Message < ? > org.springframework.integration.config.xml.Message<?> = org.springframework.integration.config.xml.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.xml.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , TestUtils . getPropertyValue ( this . org.springframework.integration.config.xml.AbstractEndpoint , STRING ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
