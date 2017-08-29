<METHOD_START> @ Before public void void ( ) { org.springframework.statemachine.config.MockMvc = MockMvcBuilders . webAppContextSetup ( org.springframework.statemachine.config.WebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpSession org.springframework.statemachine.config.MockHttpSession = new MockHttpSession ( ) ; MockHttpSession org.springframework.statemachine.config.MockHttpSession = new MockHttpSession ( ) ; org.springframework.statemachine.config.MockMvc . perform ( get ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( is ( STRING ) ) ) ; org.springframework.statemachine.config.MockMvc . perform ( get ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( is ( STRING ) ) ) ; org.springframework.statemachine.config.MockMvc . perform ( post ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) . param ( STRING , STRING ) ) . andExpect ( status ( ) . isAccepted ( ) ) ; org.springframework.statemachine.config.MockMvc . perform ( post ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) . param ( STRING , STRING ) ) . andExpect ( status ( ) . isAccepted ( ) ) ; org.springframework.statemachine.config.MockMvc . perform ( get ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( is ( STRING ) ) ) ; org.springframework.statemachine.config.MockMvc . perform ( get ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( is ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpSession org.springframework.statemachine.config.MockHttpSession = new MockHttpSession ( ) ; org.springframework.statemachine.config.MockMvc . perform ( get ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( is ( STRING ) ) ) ; java.lang.Object java.lang.Object = org.springframework.statemachine.config.MockHttpSession . getAttribute ( STRING ) ; assertThat ( java.lang.Object , notNullValue ( ) ) ; assertThat ( TestUtils . readField ( STRING , java.lang.Object ) , is ( true ) ) ; org.springframework.statemachine.config.MockHttpSession . invalidate ( ) ; assertThat ( TestUtils . readField ( STRING , java.lang.Object ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpSession org.springframework.statemachine.config.MockHttpSession = new MockHttpSession ( ) ; org.springframework.statemachine.config.MockMvc . perform ( get ( STRING ) . session ( org.springframework.statemachine.config.MockHttpSession ) ) . andExpect ( status ( ) . isOk ( ) ) ; java.lang.Object java.lang.Object = org.springframework.statemachine.config.MockHttpSession . getAttribute ( STRING ) ; assertThat ( java.lang.Object , notNullValue ( ) ) ; assertThat ( TestUtils . callMethod ( STRING , java.lang.Object ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( scopeName = STRING , proxyMode = ScopedProxyMode . TARGET_CLASS ) org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureConfiguration ( ) . withConfiguration ( ) . autoStartup ( true ) . taskExecutor ( new SyncTaskExecutor ( ) ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureTransitions ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> = org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; return org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.statemachine.config.SessionScopedManualTests.TestController org.springframework.statemachine.config.SessionScopedManualTests.TestController ( ) { return new org.springframework.statemachine.config.SessionScopedManualTests.TestController ( ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( path = STRING , method = RequestMethod . GET ) public org.springframework.statemachine.config.HttpEntity<java.lang.Void> < java.lang.Void > org.springframework.statemachine.config.HttpEntity<java.lang.Void> ( ) { org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . getState ( ) ; return new ResponseEntity < java.lang.Void > ( HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( path = STRING , method = RequestMethod . POST ) public org.springframework.statemachine.config.HttpEntity<java.lang.Void> < java.lang.Void > org.springframework.statemachine.config.HttpEntity<java.lang.Void> ( @ RequestParam ( STRING ) java.lang.String java.lang.String ) { org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . sendEvent ( java.lang.String ) ; return new ResponseEntity < java.lang.Void > ( HttpStatus . ACCEPTED ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( path = STRING , method = RequestMethod . GET ) @ ResponseBody public java.lang.String java.lang.String ( ) { return org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getId ( ) ; }  <METHOD_END>
