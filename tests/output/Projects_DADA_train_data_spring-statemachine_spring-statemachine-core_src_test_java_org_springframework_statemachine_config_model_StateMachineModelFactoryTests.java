<METHOD_START> @ Test public void void ( ) { context . register ( org.springframework.statemachine.config.model.StateMachineModelFactoryTests.Config1 .class ) ; context . refresh ( ) ; org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory = new org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory ( ) ; org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory . void ( context ) ; ObjectStateMachineFactory < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.ObjectStateMachineFactory<java.lang.String,java.lang.String> = new ObjectStateMachineFactory <> ( org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory . org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> ( ) ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> = org.springframework.statemachine.config.model.ObjectStateMachineFactory<java.lang.String,java.lang.String> . getStateMachine ( ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { context . register ( org.springframework.statemachine.config.model.StateMachineModelFactoryTests.Config2 .class ) ; context . refresh ( ) ; @ java.lang.SuppressWarnings ( STRING ) StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> = context . getBean ( StateMachine .class ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { context . register ( org.springframework.statemachine.config.model.StateMachineModelFactoryTests.Config3 .class ) ; context . refresh ( ) ; @ java.lang.SuppressWarnings ( STRING ) StateMachineFactory < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineFactory<java.lang.String,java.lang.String> = context . getBean ( StateMachineFactory .class ) ; StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> = org.springframework.statemachine.config.model.StateMachineFactory<java.lang.String,java.lang.String> . getStateMachine ( ) ; org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory = context . getBean ( org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory .class ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . stop ( ) ; org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory . java.lang.String = STRING ; org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory . java.lang.String = STRING ; org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory . java.lang.String = STRING ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> = org.springframework.statemachine.config.model.StateMachineFactory<java.lang.String,java.lang.String> . getStateMachine ( ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . start ( ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . sendEvent ( STRING ) ; assertThat ( org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . getState ( ) . getIds ( ) , contains ( STRING ) ) ; org.springframework.statemachine.config.model.StateMachine<java.lang.String,java.lang.String> . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> ( ) { return new Action < java.lang.String , java.lang.String > ( ) { @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateContext<java.lang.String,java.lang.String> ) {				} } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateContext<java.lang.String,java.lang.String> ) {				}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineModelConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModelConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.config.model.StateMachineModelConfigurer<java.lang.String,java.lang.String> . withModel ( ) . factory ( org.springframework.statemachine.config.model.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.config.model.StateMachineModelFactory<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) { return new org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> ( ) { return new Action < java.lang.String , java.lang.String > ( ) { @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateContext<java.lang.String,java.lang.String> ) {				} } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateContext<java.lang.String,java.lang.String> ) {				}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineModelConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModelConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.config.model.StateMachineModelConfigurer<java.lang.String,java.lang.String> . withModel ( ) . factory ( org.springframework.statemachine.config.model.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.config.model.StateMachineModelFactory<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) { return new org.springframework.statemachine.config.model.StateMachineModelFactoryTests.TestStateMachineModelFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> ( ) { return new Action < java.lang.String , java.lang.String > ( ) { @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateContext<java.lang.String,java.lang.String> ) {				} } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateContext<java.lang.String,java.lang.String> ) {				}  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> ( ) { Action < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> = org.springframework.statemachine.config.model.BeanFactory . getBean ( STRING , Action .class ) ; java.util.Collection<org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String>> < Action < java.lang.String , java.lang.String > > java.util.Collection<org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String>> = new java.util.ArrayList<org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String>> <> ( ) ; java.util.Collection<org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String>> . add ( org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String> ) ; ConfigurationData < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.ConfigurationData<java.lang.String,java.lang.String> = new ConfigurationData <> ( ) ; java.util.Collection<org.springframework.statemachine.config.model.StateData<java.lang.String,java.lang.String>> < StateData < java.lang.String , java.lang.String > > java.util.Collection<org.springframework.statemachine.config.model.StateData<java.lang.String,java.lang.String>> = new java.util.ArrayList<org.springframework.statemachine.config.model.StateData<java.lang.String,java.lang.String>> <> ( ) ; java.util.Collection<org.springframework.statemachine.config.model.StateData<java.lang.String,java.lang.String>> . add ( new StateData < java.lang.String , java.lang.String > ( java.lang.String , true ) ) ; java.util.Collection<org.springframework.statemachine.config.model.StateData<java.lang.String,java.lang.String>> . add ( new StateData < java.lang.String , java.lang.String > ( null , null , java.lang.String , null , java.util.Collection<org.springframework.statemachine.config.model.Action<java.lang.String,java.lang.String>> , null ) ) ; StatesData < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StatesData<java.lang.String,java.lang.String> = new StatesData <> ( java.util.Collection<org.springframework.statemachine.config.model.StateData<java.lang.String,java.lang.String>> ) ; java.util.Collection<org.springframework.statemachine.config.model.TransitionData<java.lang.String,java.lang.String>> < TransitionData < java.lang.String , java.lang.String > > java.util.Collection<org.springframework.statemachine.config.model.TransitionData<java.lang.String,java.lang.String>> = new java.util.ArrayList<org.springframework.statemachine.config.model.TransitionData<java.lang.String,java.lang.String>> <> ( ) ; java.util.Collection<org.springframework.statemachine.config.model.TransitionData<java.lang.String,java.lang.String>> . add ( new TransitionData < java.lang.String , java.lang.String > ( java.lang.String , java.lang.String , java.lang.String ) ) ; TransitionsData < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.TransitionsData<java.lang.String,java.lang.String> = new TransitionsData <> ( java.util.Collection<org.springframework.statemachine.config.model.TransitionData<java.lang.String,java.lang.String>> ) ; StateMachineModel < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> = new DefaultStateMachineModel <> ( org.springframework.statemachine.config.model.ConfigurationData<java.lang.String,java.lang.String> , org.springframework.statemachine.config.model.StatesData<java.lang.String,java.lang.String> , org.springframework.statemachine.config.model.TransitionsData<java.lang.String,java.lang.String> ) ; return org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.statemachine.config.model.BeanFactory ) throws org.springframework.statemachine.config.model.BeansException { this . org.springframework.statemachine.config.model.BeanFactory = org.springframework.statemachine.config.model.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> ( java.lang.String java.lang.String ) { return org.springframework.statemachine.config.model.StateMachineModel<java.lang.String,java.lang.String> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.model.AnnotationConfigApplicationContext org.springframework.statemachine.config.model.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
