<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.state.SubmachineRefEnumTests.Config2 .class , org.springframework.statemachine.state.SubmachineRefEnumTests.Config1 .class ) ; context . refresh ( ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; assertThat ( org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S1 ) ) ; org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S2 , TestStates . S20 ) ) ; org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S2 , TestStates . S21 , TestStates . S30 ) ) ; org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E3 ) ; assertThat ( org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S2 , TestStates . S21 , TestStates . S31 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.state.SubmachineRefEnumTests.Config4 .class , org.springframework.statemachine.state.SubmachineRefEnumTests.Config3 .class ) ; context . refresh ( ) ; StateMachine < java.lang.Object , java.lang.Object > org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> , notNullValue ( ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . start ( ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . getState ( ) . getIds ( ) , containsInAnyOrder ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . sendEvent ( org.springframework.statemachine.state.SubmachineRefEnumTests.Events1 . org.springframework.statemachine.state.SubmachineRefEnumTests.Events1 ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . getState ( ) . getIds ( ) , containsInAnyOrder ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 , org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . sendEvent ( org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 . org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . getState ( ) . getIds ( ) , containsInAnyOrder ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 , org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 , org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . sendEvent ( org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 . org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> . getState ( ) . getIds ( ) , containsInAnyOrder ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 , org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 , org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S2 , org.springframework.statemachine.state.StateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withStates ( ) . initial ( TestStates . S20 ) . state ( TestStates . S21 ) . and ( ) . withStates ( ) . parent ( TestStates . S21 ) . initial ( TestStates . S30 ) . state ( TestStates . S31 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withExternal ( ) . source ( TestStates . S20 ) . target ( TestStates . S21 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S30 ) . target ( TestStates . S31 ) . event ( TestEvents . E3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.Object , java.lang.Object > org.springframework.statemachine.state.StateMachineStateConfigurer<java.lang.Object,java.lang.Object> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<java.lang.Object,java.lang.Object> . withStates ( ) . initial ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 ) . state ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 , org.springframework.statemachine.state.StateMachine<java.lang.Object,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.Object , java.lang.Object > org.springframework.statemachine.state.StateMachineTransitionConfigurer<java.lang.Object,java.lang.Object> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<java.lang.Object,java.lang.Object> . withExternal ( ) . source ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 ) . target ( org.springframework.statemachine.state.SubmachineRefEnumTests.States1 . org.springframework.statemachine.state.SubmachineRefEnumTests.States1 ) . event ( org.springframework.statemachine.state.SubmachineRefEnumTests.Events1 . org.springframework.statemachine.state.SubmachineRefEnumTests.Events1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.Object , java.lang.Object > org.springframework.statemachine.state.StateMachineStateConfigurer<java.lang.Object,java.lang.Object> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<java.lang.Object,java.lang.Object> . withStates ( ) . initial ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . state ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . and ( ) . withStates ( ) . parent ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . initial ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . state ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.Object , java.lang.Object > org.springframework.statemachine.state.StateMachineTransitionConfigurer<java.lang.Object,java.lang.Object> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<java.lang.Object,java.lang.Object> . withExternal ( ) . source ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . target ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . event ( org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 . org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 ) . and ( ) . withExternal ( ) . source ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . target ( org.springframework.statemachine.state.SubmachineRefEnumTests.States2 . org.springframework.statemachine.state.SubmachineRefEnumTests.States2 ) . event ( org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 . org.springframework.statemachine.state.SubmachineRefEnumTests.Events2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.state.AnnotationConfigApplicationContext org.springframework.statemachine.state.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>