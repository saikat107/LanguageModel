<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.AnnotationConfigApplicationContext org.springframework.statemachine.config.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.statemachine.config.ExpectedException . expectCause ( isA ( MalformedConfigurationException .class ) ) ; context . register ( org.springframework.statemachine.config.ConfigurationErrorTests.Config1 .class ) ; context . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.statemachine.config.ExpectedException . expectCause ( isA ( MalformedConfigurationException .class ) ) ; Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . state ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureTransitions ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.statemachine.config.ExpectedException . expectCause ( isA ( MalformedConfigurationException .class ) ) ; Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureConfiguration ( ) . withVerifier ( ) . enabled ( false ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.statemachine.config.ConfigurationErrorTests.TestStateMachineModelVerifier org.springframework.statemachine.config.ConfigurationErrorTests.TestStateMachineModelVerifier = new org.springframework.statemachine.config.ConfigurationErrorTests.TestStateMachineModelVerifier ( ) ; Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureConfiguration ( ) . withVerifier ( ) . verifier ( org.springframework.statemachine.config.ConfigurationErrorTests.TestStateMachineModelVerifier ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; assertThat ( org.springframework.statemachine.config.ConfigurationErrorTests.TestStateMachineModelVerifier . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachineStateConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.config.StateMachineStateConfigurer<java.lang.String,java.lang.String> . withStates ( ) . state ( STRING ) . state ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.config.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineModel < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachineModel<java.lang.String,java.lang.String> ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>