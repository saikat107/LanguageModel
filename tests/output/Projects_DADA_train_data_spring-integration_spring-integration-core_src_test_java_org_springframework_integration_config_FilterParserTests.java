<METHOD_START> @ Test public void void ( ) { assertFalse ( TestUtils . getPropertyValue ( this . org.springframework.integration.config.MessageFilter , STRING , java.lang.Boolean .class ) ) ; assertTrue ( TestUtils . getPropertyValue ( this . org.springframework.integration.config.MessageFilter , STRING , java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int = NUMBER ; org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNull ( org.springframework.integration.config.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNull ( org.springframework.integration.config.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageRejectedException .class ) public void void ( ) { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; assertNull ( org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageRejectedException .class ) public void void ( ) java.lang.Exception { java.lang.Exception java.lang.Exception = null ; try { org.springframework.integration.config.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception = java.lang.Exception ; } Message < ? > org.springframework.integration.config.Message<?> = org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.config.Message<> ) ; assertEquals ( STRING , org.springframework.integration.config.Message<> . getPayload ( ) ) ; assertNull ( org.springframework.integration.config.PollableChannel . receive ( NUMBER ) ) ; throw java.lang.Exception ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.String java.lang.String ) { return StringUtils . hasText ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( Message < ? > org.springframework.integration.config.Message<?> ) { if ( org.springframework.integration.config.Message<> != null && org.springframework.integration.config.Message<> . getPayload ( ) instanceof java.lang.String ) { return StringUtils . hasText ( ( java.lang.String ) org.springframework.integration.config.Message<> . getPayload ( ) ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.config.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.config.Message<?> ) throws java.lang.Exception { int ++ ; return org.springframework.integration.config.ExecutionCallback . execute ( ) ; }  <METHOD_END>
