<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.transition.AnnotationConfigApplicationContext org.springframework.statemachine.transition.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config1 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.TransitionTests.TestListener org.springframework.statemachine.transition.TransitionTests.TestListener = new org.springframework.statemachine.transition.TransitionTests.TestListener ( ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . addStateListener ( org.springframework.statemachine.transition.TransitionTests.TestListener ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.transition.TransitionTests.TestListener . void ( NUMBER ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S3 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config3 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config4 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . SF ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . isComplete ( ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . isRunning ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config5 .class ) ; context . refresh ( ) ; TestAction org.springframework.statemachine.transition.TestAction = context . getBean ( STRING , TestAction .class ) ; TestAction org.springframework.statemachine.transition.TestAction = context . getBean ( STRING , TestAction .class ) ; TestAction org.springframework.statemachine.transition.TestAction = context . getBean ( STRING , TestAction .class ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( testAction1 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testAction1 . stateContexts . size ( ) , is ( NUMBER ) ) ; assertThat ( testAction20 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testAction20 . stateContexts . size ( ) , is ( NUMBER ) ) ; assertThat ( testAction21 . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testAction21 . stateContexts . size ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S2 , TestStates . S201 , TestStates . S211 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config6 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . build ( ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S2 , TestStates . S201 , TestStates . S211 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING } ) @ Test public void void ( ) java.lang.Exception { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config2 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . start ( ) ; TestExitAction org.springframework.statemachine.transition.TestExitAction = context . getBean ( STRING , TestExitAction .class ) ; TestEntryAction org.springframework.statemachine.transition.TestEntryAction = context . getBean ( STRING , TestEntryAction .class ) ; TestAction org.springframework.statemachine.transition.TestAction = context . getBean ( STRING , TestAction .class ) ; TestAction org.springframework.statemachine.transition.TestAction = context . getBean ( STRING , TestAction .class ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; assertThat ( testExitAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; assertThat ( testEntryAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( testExitAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; assertThat ( testEntryAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; assertThat ( internalTestAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( testExitAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( testEntryAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( externalTestAction . onExecuteLatch . await ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config7 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; @ java.lang.SuppressWarnings ( STRING ) ObjectStateMachine < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.TransitionTests.TestListener2 org.springframework.statemachine.transition.TransitionTests.TestListener2 = new org.springframework.statemachine.transition.TransitionTests.TestListener2 ( ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . addStateListener ( org.springframework.statemachine.transition.TransitionTests.TestListener2 ) ; org.springframework.statemachine.transition.TransitionTests.TestListener2 . void ( NUMBER ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . start ( ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . getState ( ) . getIds ( ) , contains ( TestStates2 . IDLE , TestStates2 . CLOSED ) ) ; org.springframework.statemachine.transition.TransitionTests.TestListener2 . void ( NUMBER , NUMBER ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . sendEvent ( TestEvents2 . PAUSE ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . getState ( ) . getIds ( ) , contains ( TestStates2 . BUSY , TestStates2 . PAUSED ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { context . register ( BaseConfig .class , org.springframework.statemachine.transition.TransitionTests.Config8 .class ) ; context . refresh ( ) ; assertTrue ( context . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; @ java.lang.SuppressWarnings ( STRING ) ObjectStateMachine < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.transition.TransitionTests.TestListener2 org.springframework.statemachine.transition.TransitionTests.TestListener2 = new org.springframework.statemachine.transition.TransitionTests.TestListener2 ( ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . addStateListener ( org.springframework.statemachine.transition.TransitionTests.TestListener2 ) ; org.springframework.statemachine.transition.TransitionTests.TestListener2 . void ( NUMBER ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . start ( ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . getState ( ) . getIds ( ) , contains ( TestStates2 . IDLE , TestStates2 . CLOSED ) ) ; org.springframework.statemachine.transition.TransitionTests.TestListener2 . void ( NUMBER , NUMBER ) ; org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . sendEvent ( TestEvents2 . PAUSE ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.transition.TransitionTests.TestListener2 . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.transition.ObjectStateMachine<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . getState ( ) . getIds ( ) , contains ( TestStates2 . BUSY , TestStates2 . PAUSED , TestStates2 . PAUSED2 ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { java.util.Collection<org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents>> < Action < TestStates , TestEvents > > java.util.Collection<org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents>> = java.util.Arrays . java.util.List ( org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) ) ; java.util.Collection<org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents>> < Action < TestStates , TestEvents > > java.util.Collection<org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents>> = java.util.Arrays . java.util.List ( org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) ) ; org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 , null , java.util.Collection<org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents>> ) . state ( TestStates . S2 , java.util.Collection<org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents>> , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withInternal ( ) . source ( TestStates . S1 ) . event ( TestEvents . E1 ) . action ( org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) ) . and ( ) . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E2 ) . action ( org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> < TestStates , TestEvents > org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) { return new TestEntryAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> < TestStates , TestEvents > org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) { return new TestExitAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> < TestStates , TestEvents > org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> < TestStates , TestEvents > org.springframework.statemachine.transition.Action<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . SF ) . end ( TestStates . SF ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . SF ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S201 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S21 ) . state ( TestStates . S211 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . action ( org.springframework.statemachine.transition.TestAction ( ) ) . and ( ) . withExternal ( ) . state ( TestStates . S2 ) . source ( TestStates . S20 ) . target ( TestStates . S201 ) . action ( org.springframework.statemachine.transition.TestAction ( ) ) . and ( ) . withExternal ( ) . state ( TestStates . S2 ) . source ( TestStates . S21 ) . target ( TestStates . S211 ) . action ( org.springframework.statemachine.transition.TestAction ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.TestAction org.springframework.statemachine.transition.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.TestAction org.springframework.statemachine.transition.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.transition.TestAction org.springframework.statemachine.transition.TestAction ( ) { return new TestAction ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S201 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S21 ) . state ( TestStates . S211 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S20 ) . target ( TestStates . S201 ) . and ( ) . withExternal ( ) . source ( TestStates . S21 ) . target ( TestStates . S211 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . withStates ( ) . initial ( TestStates2 . IDLE ) . state ( TestStates2 . IDLE ) . and ( ) . withStates ( ) . parent ( TestStates2 . IDLE ) . initial ( TestStates2 . CLOSED ) . state ( TestStates2 . CLOSED ) . state ( TestStates2 . OPEN ) . and ( ) . withStates ( ) . state ( TestStates2 . BUSY ) . and ( ) . withStates ( ) . parent ( TestStates2 . BUSY ) . initial ( TestStates2 . PLAYING ) . state ( TestStates2 . PLAYING ) . state ( TestStates2 . PAUSED ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . withExternal ( ) . source ( TestStates2 . CLOSED ) . target ( TestStates2 . OPEN ) . event ( TestEvents2 . EJECT ) . and ( ) . withExternal ( ) . source ( TestStates2 . OPEN ) . target ( TestStates2 . CLOSED ) . event ( TestEvents2 . EJECT ) . and ( ) . withExternal ( ) . source ( TestStates2 . CLOSED ) . target ( TestStates2 . PAUSED ) . event ( TestEvents2 . PAUSE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineStateConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . withStates ( ) . initial ( TestStates2 . IDLE ) . state ( TestStates2 . IDLE ) . and ( ) . withStates ( ) . parent ( TestStates2 . IDLE ) . initial ( TestStates2 . CLOSED ) . state ( TestStates2 . OPEN ) . and ( ) . withStates ( ) . state ( TestStates2 . BUSY ) . and ( ) . withStates ( ) . parent ( TestStates2 . BUSY ) . initial ( TestStates2 . PLAYING ) . state ( TestStates2 . PAUSED ) . and ( ) . withStates ( ) . parent ( TestStates2 . PAUSED ) . initial ( TestStates2 . PAUSED1 ) . state ( TestStates2 . PAUSED2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> ) throws java.lang.Exception { org.springframework.statemachine.transition.StateMachineTransitionConfigurer<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> . withExternal ( ) . source ( TestStates2 . CLOSED ) . target ( TestStates2 . OPEN ) . event ( TestEvents2 . EJECT ) . and ( ) . withExternal ( ) . source ( TestStates2 . OPEN ) . target ( TestStates2 . CLOSED ) . event ( TestEvents2 . EJECT ) . and ( ) . withExternal ( ) . source ( TestStates2 . CLOSED ) . target ( TestStates2 . PAUSED2 ) . event ( TestEvents2 . PAUSE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates , TestEvents > org.springframework.statemachine.transition.State<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> , State < TestStates , TestEvents > org.springframework.statemachine.transition.State<org.springframework.statemachine.transition.TestStates,org.springframework.statemachine.transition.TestEvents> ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; int = NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.State<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> , State < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.State<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates2 , TestEvents2 > org.springframework.statemachine.transition.State<org.springframework.statemachine.transition.TestStates2,org.springframework.statemachine.transition.TestEvents2> ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { void ( int , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int , int int ) { java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; int = NUMBER ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; int = NUMBER ; }  <METHOD_END>