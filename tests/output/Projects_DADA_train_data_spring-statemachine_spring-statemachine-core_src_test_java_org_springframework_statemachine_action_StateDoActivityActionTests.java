<METHOD_START> @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.action.StateDoActivityActionTests.Config1 .class ) ; context . refresh ( ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; TestAction org.springframework.statemachine.action.TestAction = context . getBean ( STRING , TestAction .class ) ; TestAction org.springframework.statemachine.action.TestAction = context . getBean ( STRING , TestAction .class ) ; assertThat ( org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . start ( ) ; assertThat ( testActionS1 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( testActionS2 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E2 ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.action.StateDoActivityActionTests.Config2 .class ) ; context . refresh ( ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; TestSleepAction org.springframework.statemachine.action.TestSleepAction = context . getBean ( STRING , TestSleepAction .class ) ; TestSleepAction org.springframework.statemachine.action.TestSleepAction = context . getBean ( STRING , TestSleepAction .class ) ; assertThat ( org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . start ( ) ; assertThat ( testActionS1 . onExecuteStartLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( testActionS1 . interruptedLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS1 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS2 . onExecuteStartLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( testActionS2 . interruptedLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS2 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S3 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.action.StateDoActivityActionTests.Config3 .class ) ; context . refresh ( ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , StateMachine .class ) ; TestSleepAction org.springframework.statemachine.action.TestSleepAction = context . getBean ( STRING , TestSleepAction .class ) ; TestSleepAction org.springframework.statemachine.action.TestSleepAction = context . getBean ( STRING , TestSleepAction .class ) ; TestAction org.springframework.statemachine.action.TestAction = context . getBean ( STRING , TestAction .class ) ; TestAction org.springframework.statemachine.action.TestAction = context . getBean ( STRING , TestAction .class ) ; assertThat ( org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . start ( ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E3 ) ; assertThat ( testActionS1I . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS1 . interruptedLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E4 ) ; assertThat ( testActionS2I . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS2 . interruptedLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( testActionS1 . interruptedLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS2 . interruptedLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS1 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testActionS2 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.action.StateMachine<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S3 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 , org.springframework.statemachine.action.TestAction ( ) ) . state ( TestStates . S2 , org.springframework.statemachine.action.TestAction ( ) ) . state ( TestStates . S3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestAction org.springframework.statemachine.action.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestAction org.springframework.statemachine.action.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 , org.springframework.statemachine.action.TestSleepAction ( ) ) . state ( TestStates . S2 , org.springframework.statemachine.action.TestSleepAction ( ) ) . state ( TestStates . S3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestSleepAction org.springframework.statemachine.action.TestSleepAction ( ) { return new TestSleepAction ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestSleepAction org.springframework.statemachine.action.TestSleepAction ( ) { return new TestSleepAction ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineStateConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 , org.springframework.statemachine.action.TestSleepAction ( ) ) . state ( TestStates . S2 , org.springframework.statemachine.action.TestSleepAction ( ) ) . state ( TestStates . S3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.action.StateMachineTransitionConfigurer<org.springframework.statemachine.action.TestStates,org.springframework.statemachine.action.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) . and ( ) . withInternal ( ) . source ( TestStates . S1 ) . event ( TestEvents . E3 ) . action ( org.springframework.statemachine.action.TestAction ( ) ) . and ( ) . withInternal ( ) . source ( TestStates . S2 ) . event ( TestEvents . E4 ) . action ( org.springframework.statemachine.action.TestAction ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestSleepAction org.springframework.statemachine.action.TestSleepAction ( ) { return new TestSleepAction ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestSleepAction org.springframework.statemachine.action.TestSleepAction ( ) { return new TestSleepAction ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestAction org.springframework.statemachine.action.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.action.TestAction org.springframework.statemachine.action.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.action.AnnotationConfigApplicationContext org.springframework.statemachine.action.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
