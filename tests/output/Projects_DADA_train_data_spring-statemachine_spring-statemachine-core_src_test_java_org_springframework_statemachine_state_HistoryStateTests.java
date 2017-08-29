<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.state.AnnotationConfigApplicationContext org.springframework.statemachine.state.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( BaseConfig .class , org.springframework.statemachine.state.HistoryStateTests.Config1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E2 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E3 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E4 ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 , TestStates . S21 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( BaseConfig .class , org.springframework.statemachine.state.HistoryStateTests.Config1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E4 ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 , TestStates . S20 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( BaseConfig .class , org.springframework.statemachine.state.HistoryStateTests.Config2 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E2 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E3 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E4 ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 , TestStates . S21 , TestStates . S212 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( BaseConfig .class , org.springframework.statemachine.state.HistoryStateTests.Config3 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E2 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E3 ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E4 ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 , TestStates . S21 , TestStates . S211 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( BaseConfig .class , org.springframework.statemachine.state.HistoryStateTests.Config4 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . EH ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S3 , TestStates . S33 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { context . register ( BaseConfig .class , org.springframework.statemachine.state.HistoryStateTests.Config4 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S3 , TestStates . S30 ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . EF ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S3 , TestStates . SF ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . E4 ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . sendEvent ( TestEvents . EH ) ; assertThat ( org.springframework.statemachine.state.ObjectStateMachine<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S3 , TestStates . S33 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S20 ) . state ( TestStates . S21 ) . history ( TestStates . SH , History . SHALLOW ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S20 ) . target ( TestStates . S21 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S1 ) . event ( TestEvents . E3 ) . and ( ) . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . SH ) . event ( TestEvents . E4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S20 ) . state ( TestStates . S21 ) . history ( TestStates . SH , History . DEEP ) . and ( ) . withStates ( ) . parent ( TestStates . S21 ) . initial ( TestStates . S211 ) . state ( TestStates . S211 ) . state ( TestStates . S212 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S211 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S211 ) . target ( TestStates . S212 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S212 ) . target ( TestStates . S1 ) . event ( TestEvents . E3 ) . and ( ) . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . SH ) . event ( TestEvents . E4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S20 ) . state ( TestStates . S21 ) . history ( TestStates . SH , History . SHALLOW ) . and ( ) . withStates ( ) . parent ( TestStates . S21 ) . initial ( TestStates . S211 ) . state ( TestStates . S211 ) . state ( TestStates . S212 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S211 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S211 ) . target ( TestStates . S212 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S212 ) . target ( TestStates . S1 ) . event ( TestEvents . E3 ) . and ( ) . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . SH ) . event ( TestEvents . E4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineStateConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S3 ) . and ( ) . withStates ( ) . parent ( TestStates . S3 ) . initial ( TestStates . S30 ) . state ( TestStates . S31 ) . state ( TestStates . S32 ) . state ( TestStates . S33 ) . end ( TestStates . SF ) . history ( TestStates . SH , History . SHALLOW ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.state.StateMachineTransitionConfigurer<org.springframework.statemachine.state.TestStates,org.springframework.statemachine.state.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S3 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S30 ) . target ( TestStates . S31 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S31 ) . target ( TestStates . S32 ) . event ( TestEvents . E3 ) . and ( ) . withExternal ( ) . source ( TestStates . S30 ) . target ( TestStates . SF ) . event ( TestEvents . EF ) . and ( ) . withExternal ( ) . source ( TestStates . S3 ) . target ( TestStates . S1 ) . event ( TestEvents . E4 ) . and ( ) . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . SH ) . event ( TestEvents . EH ) . and ( ) . withHistory ( ) . source ( TestStates . SH ) . target ( TestStates . S33 ) ; }  <METHOD_END>
