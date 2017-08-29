<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.docs.AnnotationConfigApplicationContext org.springframework.statemachine.docs.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.docs.DocsConfigurationSampleTests5.Config1 .class , org.springframework.statemachine.docs.DocsConfigurationSampleTests5.Config2 .class ) ; context . refresh ( ) ; org.springframework.statemachine.docs.DocsConfigurationSampleTests5.InMemoryStateMachinePersist org.springframework.statemachine.docs.DocsConfigurationSampleTests5.InMemoryStateMachinePersist = new org.springframework.statemachine.docs.DocsConfigurationSampleTests5.InMemoryStateMachinePersist ( ) ; StateMachinePersister < java.lang.String , java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachinePersister<java.lang.String,java.lang.String,java.lang.String> = new DefaultStateMachinePersister <> ( org.springframework.statemachine.docs.DocsConfigurationSampleTests5.InMemoryStateMachinePersist ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> = context . getBean ( STRING , StateMachine .class ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> = context . getBean ( STRING , StateMachine .class ) ; org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> . start ( ) ; org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.docs.StateMachinePersister<java.lang.String,java.lang.String,java.lang.String> . persist ( org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> , STRING ) ; org.springframework.statemachine.docs.StateMachinePersister<java.lang.String,java.lang.String,java.lang.String> . restore ( org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> , STRING ) ; assertThat ( org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineStateConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.docs.StateMachineStateConfigurer<java.lang.String,java.lang.String> . withStates ( ) . initial ( STRING ) . state ( STRING ) . state ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.docs.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineContext < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineContext<java.lang.String,java.lang.String> , java.lang.String java.lang.String ) throws java.lang.Exception { java.util.HashMap<java.lang.String,org.springframework.statemachine.docs.StateMachineContext<java.lang.String,java.lang.String>> . put ( java.lang.String , org.springframework.statemachine.docs.StateMachineContext<java.lang.String,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.docs.StateMachineContext<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineContext<java.lang.String,java.lang.String> ( java.lang.String java.lang.String ) throws java.lang.Exception { return java.util.HashMap<java.lang.String,org.springframework.statemachine.docs.StateMachineContext<java.lang.String,java.lang.String>> . get ( java.lang.String ) ; }  <METHOD_END>
