<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.statemachine.listener.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.statemachine.listener.ListenerTests.Config1 .class ) ; assertTrue ( org.springframework.statemachine.listener.AnnotationConfigApplicationContext . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; @ java.lang.SuppressWarnings ( STRING ) ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> = org.springframework.statemachine.listener.AnnotationConfigApplicationContext . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . start ( ) ; org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener = new org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener ( ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . addStateListener ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener ) ; assertThat ( org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> , notNullValue ( ) ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E1 ) . setHeader ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . int ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder ( NUMBER ) . org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . getIds ( ) , contains ( TestStates . S1 ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder ( NUMBER ) . org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . getIds ( ) , contains ( TestStates . S2 ) ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E2 ) . setHeader ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . int ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder ( NUMBER ) . org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . getIds ( ) , contains ( TestStates . S2 ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder ( NUMBER ) . org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . getIds ( ) , contains ( TestStates . S3 ) ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . sendEvent ( MessageBuilder . withPayload ( TestEvents . E4 ) . setHeader ( STRING , STRING ) . build ( ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . int ( ) , is ( NUMBER ) ) ; org.springframework.statemachine.listener.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.statemachine.listener.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.statemachine.listener.ListenerTests.Config2 .class ) ; assertTrue ( org.springframework.statemachine.listener.AnnotationConfigApplicationContext . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; @ java.lang.SuppressWarnings ( STRING ) ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> = org.springframework.statemachine.listener.AnnotationConfigApplicationContext . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener = new org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener ( ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . addStateListener ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . start ( ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . int , is ( NUMBER ) ) ; org.springframework.statemachine.listener.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.statemachine.listener.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.statemachine.listener.ListenerTests.Config2 .class ) ; assertTrue ( org.springframework.statemachine.listener.AnnotationConfigApplicationContext . containsBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE ) ) ; @ java.lang.SuppressWarnings ( STRING ) ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> = org.springframework.statemachine.listener.AnnotationConfigApplicationContext . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener = new org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener ( ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . addStateListener ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . start ( ) ; org.springframework.statemachine.listener.ObjectStateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . getExtendedState ( ) . getVariables ( ) . put ( STRING , STRING ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2> . int ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2> . org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2 ( NUMBER ) . java.lang.Object , is ( STRING ) ) ; assertThat ( org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener . java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2> . org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2 ( NUMBER ) . java.lang.Object , is ( STRING ) ) ; org.springframework.statemachine.listener.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.listener.StateContext<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) { org.springframework.statemachine.listener.Log . info ( STRING + java.lang.String + STRING + org.springframework.statemachine.listener.StateContext<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . getMessageHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates , TestEvents > org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> , State < TestStates , TestEvents > org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) { java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder> . boolean ( new org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder ( org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> , org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates , TestEvents > org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < TestStates , TestEvents > org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> public void ( State < TestStates , TestEvents > org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> , State < TestStates , TestEvents > org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) { this . org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> = org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ; this . org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> = org.springframework.statemachine.listener.State<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < TestEvents > org.springframework.statemachine.listener.Message<org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Transition < TestStates , TestEvents > org.springframework.statemachine.listener.Transition<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Transition < TestStates , TestEvents > org.springframework.statemachine.listener.Transition<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Transition < TestStates , TestEvents > org.springframework.statemachine.listener.Transition<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachine < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) { int ++ ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachine < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachine < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachine<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> , java.lang.Exception java.lang.Exception ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { java.util.ArrayList<org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2> . boolean ( new org.springframework.statemachine.listener.ListenerTests.TestStateMachineListener.Holder2 ( java.lang.Object , java.lang.Object ) ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < TestStates , TestEvents > org.springframework.statemachine.listener.StateContext<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachineStateConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.listener.StateMachineStateConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) . state ( TestStates . S3 , TestEvents . E4 ) . state ( TestStates . S4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachineTransitionConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.listener.StateMachineTransitionConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . action ( org.springframework.statemachine.listener.ListenerTests.LoggingAction ( ) ) . action ( org.springframework.statemachine.listener.ListenerTests.LoggingAction ( ) ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) . action ( org.springframework.statemachine.listener.ListenerTests.LoggingAction ( ) ) . and ( ) . withExternal ( ) . source ( TestStates . S3 ) . target ( TestStates . S4 ) . event ( TestEvents . E3 ) . action ( org.springframework.statemachine.listener.ListenerTests.LoggingAction ( ) ) . and ( ) . withExternal ( ) . source ( TestStates . S4 ) . target ( TestStates . S3 ) . event ( TestEvents . E4 ) . action ( org.springframework.statemachine.listener.ListenerTests.LoggingAction ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.listener.ListenerTests.LoggingAction org.springframework.statemachine.listener.ListenerTests.LoggingAction ( ) { return new org.springframework.statemachine.listener.ListenerTests.LoggingAction ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.listener.TaskExecutor org.springframework.statemachine.listener.TaskExecutor ( ) { return new SyncTaskExecutor ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachineStateConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.listener.StateMachineStateConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . end ( TestStates . S3 ) . state ( TestStates . S1 ) . state ( TestStates . S2 ) . state ( TestStates . S3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.listener.StateMachineTransitionConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.listener.StateMachineTransitionConfigurer<org.springframework.statemachine.listener.TestStates,org.springframework.statemachine.listener.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.listener.TaskExecutor org.springframework.statemachine.listener.TaskExecutor ( ) { return new SyncTaskExecutor ( ) ; }  <METHOD_END>