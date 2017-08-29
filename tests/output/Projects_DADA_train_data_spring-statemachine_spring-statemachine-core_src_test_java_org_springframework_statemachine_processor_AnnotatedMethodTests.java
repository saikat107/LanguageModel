<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.processor.AnnotationConfigApplicationContext org.springframework.statemachine.processor.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config1 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config2 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E3 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config3 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E3 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config4 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E3 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config5 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E3 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config1 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig2 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config6 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig3 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S2 ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E2 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; assertThat ( org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . getState ( ) . getIds ( ) , containsInAnyOrder ( TestStates . S3 ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.processor.AnnotatedMethodTests.Config7 .class , org.springframework.statemachine.processor.AnnotatedMethodTests.BeanConfig1 .class ) ; context . refresh ( ) ; ObjectStateMachine < TestStates , TestEvents > org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINE , ObjectStateMachine .class ) ; org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 = context . getBean ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 .class ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( false ) ) ; org.springframework.statemachine.processor.ObjectStateMachine<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.processor.AnnotatedMethodTests.StatesOnTransition ( org.springframework.statemachine.processor.TestStates[] = TestStates . S20 , org.springframework.statemachine.processor.TestStates[] = TestStates . S21 ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.processor.AnnotatedMethodTests.StatesOnTransition ( org.springframework.statemachine.processor.TestStates[] = TestStates . S30 , org.springframework.statemachine.processor.TestStates[] = TestStates . S31 ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.processor.AnnotatedMethodTests.StatesOnTransition ( org.springframework.statemachine.processor.TestStates[] = TestStates . S21 ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.processor.AnnotatedMethodTests.StatesOnTransition ( org.springframework.statemachine.processor.TestStates[] = TestStates . S31 ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.processor.AnnotatedMethodTests.StatesOnTransition ( org.springframework.statemachine.processor.TestStates[] = TestStates . S20 ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.processor.AnnotatedMethodTests.StatesOnTransition ( org.springframework.statemachine.processor.TestStates[] = TestStates . S30 ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new java.lang.RuntimeException ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new java.lang.Error ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new java.lang.Error ( ) ; }  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new java.lang.RuntimeException ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 ( ) { return new org.springframework.statemachine.processor.AnnotatedMethodTests.Bean1 ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 ( ) { return new org.springframework.statemachine.processor.AnnotatedMethodTests.Bean2 ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 ( ) { return new org.springframework.statemachine.processor.AnnotatedMethodTests.Bean3 ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . SI ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S20 ) . state ( TestStates . S21 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S30 ) . state ( TestStates . S30 ) . state ( TestStates . S31 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . SI ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S20 ) . target ( TestStates . S21 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S30 ) . target ( TestStates . S31 ) . event ( TestEvents . E3 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . SI ) . state ( TestStates . S2 ) . join ( TestStates . S3 ) . state ( TestStates . S4 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . end ( TestStates . S21 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S30 ) . end ( TestStates . S31 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . SI ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S20 ) . target ( TestStates . S21 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S30 ) . target ( TestStates . S31 ) . event ( TestEvents . E3 ) . and ( ) . withJoin ( ) . source ( TestStates . S21 ) . source ( TestStates . S31 ) . target ( TestStates . S3 ) . and ( ) . withExternal ( ) . source ( TestStates . S3 ) . target ( TestStates . S4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . SI ) . state ( TestStates . S2 ) . join ( TestStates . S3 ) . state ( TestStates . S4 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . end ( TestStates . S21 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S30 ) . end ( TestStates . S31 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . SI ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S20 ) . target ( TestStates . S21 ) . event ( TestEvents . E2 ) . and ( ) . withExternal ( ) . source ( TestStates . S30 ) . target ( TestStates . S31 ) . event ( TestEvents . E3 ) . and ( ) . withJoin ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . and ( ) . withExternal ( ) . source ( TestStates . S3 ) . target ( TestStates . S4 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . SI ) . fork ( TestStates . S1 ) . state ( TestStates . S2 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S20 ) . state ( TestStates . S21 ) . and ( ) . withStates ( ) . parent ( TestStates . S2 ) . initial ( TestStates . S30 ) . state ( TestStates . S31 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . SI ) . target ( TestStates . S1 ) . event ( TestEvents . E1 ) . and ( ) . withFork ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) . and ( ) . withExternal ( ) . source ( TestStates . S2 ) . target ( TestStates . S3 ) . event ( TestEvents . E2 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineConfigurationConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineConfigurationConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> )				throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineConfigurationConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withConfiguration ( ) . autoStartup ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineStateConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.processor.StateMachineTransitionConfigurer<org.springframework.statemachine.processor.TestStates,org.springframework.statemachine.processor.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
