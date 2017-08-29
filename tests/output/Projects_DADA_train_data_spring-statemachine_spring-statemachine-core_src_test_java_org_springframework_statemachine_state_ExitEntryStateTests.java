<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { context . register ( org.springframework.statemachine.state.ExitEntryStateTests.Config1 .class ) ; context . refresh ( ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> , notNullValue ( ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING , STRING ) ) ; org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.state.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.state.StateMachineStateConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<java.lang.String,java.lang.String> . withStates ( ) . initial ( STRING ) . state ( STRING ) . state ( STRING ) . state ( STRING ) . state ( STRING ) . and ( ) . withStates ( ) . parent ( STRING ) . initial ( STRING ) . entry ( STRING ) . entry ( STRING ) . exit ( STRING ) . exit ( STRING ) . state ( STRING ) . state ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.state.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withEntry ( ) . source ( STRING ) . target ( STRING ) . and ( ) . withEntry ( ) . source ( STRING ) . target ( STRING ) . and ( ) . withExit ( ) . source ( STRING ) . target ( STRING ) . and ( ) . withExit ( ) . source ( STRING ) . target ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.state.AnnotationConfigApplicationContext org.springframework.statemachine.state.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
