<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineConfigurationConfigurer<java.lang.String,java.lang.String> )				throws java.lang.Exception { org.springframework.statemachine.docs.StateMachineConfigurationConfigurer<java.lang.String,java.lang.String> . withMonitoring ( ) . monitor ( org.springframework.statemachine.docs.StateMachineMonitor<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineStateConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.docs.StateMachineStateConfigurer<java.lang.String,java.lang.String> . withStates ( ) . initial ( STRING ) . state ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.docs.StateMachineTransitionConfigurer<java.lang.String,java.lang.String> . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.docs.StateMachineMonitor<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineMonitor<java.lang.String,java.lang.String> ( ) { return new org.springframework.statemachine.docs.DocsConfigurationSampleTests9.TestStateMachineMonitor ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> , Transition < java.lang.String , java.lang.String > org.springframework.statemachine.docs.Transition<java.lang.String,java.lang.String> , long long ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> , Action < java.lang.String , java.lang.String > org.springframework.statemachine.docs.Action<java.lang.String,java.lang.String> , long long ) {		}  <METHOD_END>
