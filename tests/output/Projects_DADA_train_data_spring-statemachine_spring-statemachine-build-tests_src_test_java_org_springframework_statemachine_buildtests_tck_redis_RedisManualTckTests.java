<METHOD_START> @ java.lang.Override protected void void ( ) { AnnotationConfigApplicationContext org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext . register ( org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.TestConfig .class ) ; org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext . refresh ( ) ; KeyValueTemplate org.springframework.statemachine.buildtests.tck.redis.KeyValueTemplate = org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext . getBean ( KeyValueTemplate .class ) ; org.springframework.statemachine.buildtests.tck.redis.KeyValueTemplate . delete ( RedisRepositoryAction .class ) ; org.springframework.statemachine.buildtests.tck.redis.KeyValueTemplate . delete ( RedisRepositoryGuard .class ) ; org.springframework.statemachine.buildtests.tck.redis.KeyValueTemplate . delete ( RedisRepositoryState .class ) ; org.springframework.statemachine.buildtests.tck.redis.KeyValueTemplate . delete ( RedisRepositoryTransition .class ) ; org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext org.springframework.statemachine.buildtests.tck.redis.AnnotationConfigApplicationContext ( ) { return new AnnotationConfigApplicationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.redis.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.redis.StateMachine<java.lang.String,java.lang.String> ( ) { context . register ( org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.TestConfig .class , org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.StateMachineFactoryConfig .class ) ; context . refresh ( ) ; RedisStateRepository org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository = context . getBean ( RedisStateRepository .class ) ; RedisTransitionRepository org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository = context . getBean ( RedisTransitionRepository .class ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; return getStateMachineFactoryFromContext ( ) . getStateMachine ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.redis.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.redis.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { context . register ( org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.TestConfig .class , org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.StateMachineFactoryConfig .class ) ; context . refresh ( ) ; RedisStateRepository org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository = context . getBean ( RedisStateRepository .class ) ; RedisTransitionRepository org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository = context . getBean ( RedisTransitionRepository .class ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; return getStateMachineFactoryFromContext ( ) . getStateMachine ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.buildtests.tck.redis.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.redis.StateMachine<java.lang.String,java.lang.String> ( ) java.lang.Exception { context . register ( ShowcaseMachineBeansConfig .class , org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.TestConfig .class , org.springframework.statemachine.buildtests.tck.redis.RedisManualTckTests.StateMachineFactoryConfig .class ) ; context . refresh ( ) ; RedisStateRepository org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository = context . getBean ( RedisStateRepository .class ) ; RedisTransitionRepository org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository = context . getBean ( RedisTransitionRepository .class ) ; RedisActionRepository org.springframework.statemachine.buildtests.tck.redis.RedisActionRepository = context . getBean ( RedisActionRepository .class ) ; RedisGuardRepository org.springframework.statemachine.buildtests.tck.redis.RedisGuardRepository = context . getBean ( RedisGuardRepository .class ) ; RedisRepositoryGuard org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard = new RedisRepositoryGuard ( ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard . setName ( STRING ) ; RedisRepositoryGuard org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard = new RedisRepositoryGuard ( ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard . setName ( STRING ) ; RedisRepositoryAction org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryAction = new RedisRepositoryAction ( ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryAction . setName ( STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisGuardRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.redis.RedisGuardRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.redis.RedisActionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryAction ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setInitialAction ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryAction ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING , true ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryState org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState = new RedisRepositoryState ( STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState . setParentState ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; org.springframework.statemachine.buildtests.tck.redis.RedisStateRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setGuard ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setKind ( TransitionKind . INTERNAL ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setGuard ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setActions ( new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryAction ) ) ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setKind ( TransitionKind . INTERNAL ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setKind ( TransitionKind . INTERNAL ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setGuard ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryGuard ) ; org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition . setActions ( new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryAction ) ) ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; RedisRepositoryTransition org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition = new RedisRepositoryTransition ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryState , STRING ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; org.springframework.statemachine.buildtests.tck.redis.RedisTransitionRepository . save ( org.springframework.statemachine.buildtests.tck.redis.RedisRepositoryTransition ) ; return getStateMachineFactoryFromContext ( ) . getStateMachine ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineModelConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.redis.StateMachineModelConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.buildtests.tck.redis.StateMachineModelConfigurer<java.lang.String,java.lang.String> . withModel ( ) . factory ( org.springframework.statemachine.buildtests.tck.redis.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.buildtests.tck.redis.StateMachineModelFactory<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.buildtests.tck.redis.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) { return new RepositoryStateMachineModelFactory ( org.springframework.statemachine.buildtests.tck.redis.StateRepository<> , org.springframework.statemachine.buildtests.tck.redis.TransitionRepository<> ) ; }  <METHOD_END>