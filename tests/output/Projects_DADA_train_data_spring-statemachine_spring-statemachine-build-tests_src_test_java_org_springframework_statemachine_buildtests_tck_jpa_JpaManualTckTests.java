<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.jpa.AnnotationConfigApplicationContext org.springframework.statemachine.buildtests.tck.jpa.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.jpa.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.jpa.StateMachine<java.lang.String,java.lang.String> ( ) { context . register ( org.springframework.statemachine.buildtests.tck.jpa.JpaManualTckTests.TestConfig .class , org.springframework.statemachine.buildtests.tck.jpa.JpaManualTckTests.StateMachineFactoryConfig .class ) ; context . refresh ( ) ; JpaStateRepository org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository = context . getBean ( JpaStateRepository .class ) ; JpaTransitionRepository org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository = context . getBean ( JpaTransitionRepository .class ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; return getStateMachineFactoryFromContext ( ) . getStateMachine ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.jpa.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.jpa.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { context . register ( org.springframework.statemachine.buildtests.tck.jpa.JpaManualTckTests.TestConfig .class , org.springframework.statemachine.buildtests.tck.jpa.JpaManualTckTests.StateMachineFactoryConfig .class ) ; context . refresh ( ) ; JpaStateRepository org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository = context . getBean ( JpaStateRepository .class ) ; JpaTransitionRepository org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository = context . getBean ( JpaTransitionRepository .class ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; return getStateMachineFactoryFromContext ( ) . getStateMachine ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.jpa.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.jpa.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { context . register ( ShowcaseMachineBeansConfig .class , org.springframework.statemachine.buildtests.tck.jpa.JpaManualTckTests.TestConfig .class , org.springframework.statemachine.buildtests.tck.jpa.JpaManualTckTests.StateMachineFactoryConfig .class ) ; context . refresh ( ) ; JpaStateRepository org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository = context . getBean ( JpaStateRepository .class ) ; JpaTransitionRepository org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository = context . getBean ( JpaTransitionRepository .class ) ; JpaActionRepository org.springframework.statemachine.buildtests.tck.jpa.JpaActionRepository = context . getBean ( JpaActionRepository .class ) ; JpaGuardRepository org.springframework.statemachine.buildtests.tck.jpa.JpaGuardRepository = context . getBean ( JpaGuardRepository .class ) ; JpaRepositoryGuard org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard = new JpaRepositoryGuard ( ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard . setName ( STRING ) ; JpaRepositoryGuard org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard = new JpaRepositoryGuard ( ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard . setName ( STRING ) ; JpaRepositoryAction org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryAction = new JpaRepositoryAction ( ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryAction . setName ( STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaGuardRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaGuardRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaActionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryAction ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setInitialAction ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryAction ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryState org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState = new JpaRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaStateRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setGuard ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setKind ( TransitionKind . INTERNAL ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setGuard ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setActions ( new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryAction ) ) ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setKind ( TransitionKind . INTERNAL ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setKind ( TransitionKind . INTERNAL ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setGuard ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition . setActions ( new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryAction ) ) ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; JpaRepositoryTransition org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition = new JpaRepositoryTransition ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.jpa.JpaTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.jpa.JpaRepositoryTransition ) ; return getStateMachineFactoryFromContext ( ) . getStateMachine ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineModelConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.jpa.StateMachineModelConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.buildtests.tck.jpa.StateMachineModelConfigurer<java.lang.String,java.lang.String> . withModel ( ) . factory ( org.springframework.statemachine.buildtests.tck.jpa.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.buildtests.tck.jpa.StateMachineModelFactory<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.jpa.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) { return new RepositoryStateMachineModelFactory ( org.springframework.statemachine.buildtests.tck.jpa.StateRepository<> , org.springframework.statemachine.buildtests.tck.jpa.TransitionRepository<> ) ; }  <METHOD_END>
