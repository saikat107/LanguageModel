<METHOD_START> @ Test public void void ( ) java.lang.Exception { context . register ( org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.BeanConfig1 .class , org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Config1 .class ) ; context . refresh ( ) ; org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 = context . getBean ( org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 .class ) ; StateMachineFactory < TestStates , TestEvents > org.springframework.statemachine.annotation.StateMachineFactory<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> = context . getBean ( StateMachineSystemConstants . DEFAULT_ID_STATEMACHINEFACTORY , StateMachineFactory .class ) ; StateMachine < TestStates , TestEvents > org.springframework.statemachine.annotation.StateMachine<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> = org.springframework.statemachine.annotation.StateMachineFactory<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . getStateMachine ( STRING ) ; org.springframework.statemachine.annotation.StateMachine<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . start ( ) ; assertThat ( org.springframework.statemachine.annotation.StateMachine<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S1 ) ) ; org.springframework.statemachine.annotation.StateMachine<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . sendEvent ( TestEvents . E1 ) ; assertThat ( org.springframework.statemachine.annotation.StateMachine<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . getState ( ) . getIds ( ) , contains ( TestStates . S2 ) ) ; assertThat ( org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ OnStateChanged public void void ( ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 ( ) { return new org.springframework.statemachine.annotation.MethodAnnotationWithFactoryTests.Bean1 ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < TestStates , TestEvents > org.springframework.statemachine.annotation.StateMachineStateConfigurer<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.annotation.StateMachineStateConfigurer<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . withStates ( ) . initial ( TestStates . S1 ) . states ( java.util.EnumSet . java.util.EnumSet<E> ( TestStates .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < TestStates , TestEvents > org.springframework.statemachine.annotation.StateMachineTransitionConfigurer<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> ) throws java.lang.Exception { org.springframework.statemachine.annotation.StateMachineTransitionConfigurer<org.springframework.statemachine.annotation.TestStates,org.springframework.statemachine.annotation.TestEvents> . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.annotation.AnnotationConfigApplicationContext org.springframework.statemachine.annotation.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
