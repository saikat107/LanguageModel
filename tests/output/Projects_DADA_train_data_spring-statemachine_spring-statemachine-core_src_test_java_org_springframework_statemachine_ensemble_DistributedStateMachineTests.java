<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.ensemble.AnnotationConfigApplicationContext org.springframework.statemachine.ensemble.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( org.springframework.statemachine.ensemble.DistributedStateMachineTests.Config1 .class , org.springframework.statemachine.ensemble.DistributedStateMachineTests.Config2 .class ) ; context . refresh ( ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> = context . getBean ( STRING , StateMachine .class ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> = context . getBean ( STRING , StateMachine .class ) ; StateMachineEnsemble < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachineEnsemble<java.lang.String,java.lang.String> = new InMemoryStateMachineEnsemble < java.lang.String , java.lang.String > ( ) ; DistributedStateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> = new DistributedStateMachine < java.lang.String , java.lang.String > ( org.springframework.statemachine.ensemble.StateMachineEnsemble<java.lang.String,java.lang.String> , org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> ) ; DistributedStateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> = new DistributedStateMachine < java.lang.String , java.lang.String > ( org.springframework.statemachine.ensemble.StateMachineEnsemble<java.lang.String,java.lang.String> , org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . afterPropertiesSet ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . afterPropertiesSet ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . start ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . start ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; assertThat ( org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; assertThat ( org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( org.springframework.statemachine.ensemble.DistributedStateMachineTests.Config1 .class , org.springframework.statemachine.ensemble.DistributedStateMachineTests.Config2 .class ) ; context . refresh ( ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> = context . getBean ( STRING , StateMachine .class ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> = context . getBean ( STRING , StateMachine .class ) ; StateMachineEnsemble < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachineEnsemble<java.lang.String,java.lang.String> = new InMemoryStateMachineEnsemble < java.lang.String , java.lang.String > ( ) ; DistributedStateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> = new DistributedStateMachine < java.lang.String , java.lang.String > ( org.springframework.statemachine.ensemble.StateMachineEnsemble<java.lang.String,java.lang.String> , org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . afterPropertiesSet ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . start ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; DistributedStateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> = new DistributedStateMachine < java.lang.String , java.lang.String > ( org.springframework.statemachine.ensemble.StateMachineEnsemble<java.lang.String,java.lang.String> , org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . afterPropertiesSet ( ) ; org.springframework.statemachine.ensemble.DistributedStateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.ensemble.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachineStateConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.ensemble.StateMachineStateConfigurer<java.lang.String,java.lang.String> . withStates ( ) . initial ( STRING ) . state ( STRING ) . state ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.ensemble.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.ensemble.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; }  <METHOD_END>
