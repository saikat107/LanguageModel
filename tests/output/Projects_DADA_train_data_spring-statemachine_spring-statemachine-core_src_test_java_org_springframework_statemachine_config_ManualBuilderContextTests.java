<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.AnnotationConfigApplicationContext org.springframework.statemachine.config.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.config.ManualBuilderContextTests.Config1 .class ) ; context . refresh ( ) ; org.springframework.statemachine.config.ManualBuilderContextTests.TestListener org.springframework.statemachine.config.ManualBuilderContextTests.TestListener = context . getBean ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener .class ) ; @ java.lang.SuppressWarnings ( STRING ) StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> = context . getBean ( StateMachine .class ) ; assertThat ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . void ( NUMBER ) ; org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.config.ManualBuilderContextTests.Config2 .class ) ; context . refresh ( ) ; org.springframework.statemachine.config.ManualBuilderContextTests.TestListener org.springframework.statemachine.config.ManualBuilderContextTests.TestListener = context . getBean ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener .class ) ; @ java.lang.SuppressWarnings ( STRING ) StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> = context . getBean ( StateMachine .class ) ; org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . void ( NUMBER ) ; org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener . int , is ( NUMBER ) ) ; assertThat ( org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , containsInAnyOrder ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureConfiguration ( ) . withConfiguration ( ) . autoStartup ( true ) . listener ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener ( ) ) . taskExecutor ( new SyncTaskExecutor ( ) ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureTransitions ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> = org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; return org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.statemachine.config.ManualBuilderContextTests.TestListener org.springframework.statemachine.config.ManualBuilderContextTests.TestListener ( ) { return new org.springframework.statemachine.config.ManualBuilderContextTests.TestListener ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { Builder < java.lang.String , java.lang.String > org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureConfiguration ( ) . withConfiguration ( ) . autoStartup ( false ) . listener ( org.springframework.statemachine.config.ManualBuilderContextTests.TestListener ( ) ) . taskExecutor ( new SyncTaskExecutor ( ) ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) ; org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . configureTransitions ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) . and ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> = org.springframework.statemachine.config.Builder<java.lang.String,java.lang.String> . build ( ) ; return org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.statemachine.config.ManualBuilderContextTests.TestListener org.springframework.statemachine.config.ManualBuilderContextTests.TestListener ( ) { return new org.springframework.statemachine.config.ManualBuilderContextTests.TestListener ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.StateMachine<java.lang.String,java.lang.String> ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( State < java.lang.String , java.lang.String > org.springframework.statemachine.config.State<java.lang.String,java.lang.String> , State < java.lang.String , java.lang.String > org.springframework.statemachine.config.State<java.lang.String,java.lang.String> ) { int ++ ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { int = NUMBER ; java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( int ) ; }  <METHOD_END>
