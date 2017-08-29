<METHOD_START> public void ( StateMachineModel < S , E > org.springframework.statemachine.config.StateMachineModel<S,E> ) { this( org.springframework.statemachine.config.StateMachineModel<S,E> , null ); }  <METHOD_END>
<METHOD_START> public void ( StateMachineModel < S , E > org.springframework.statemachine.config.StateMachineModel<S,E> , StateMachineModelFactory < S , E > org.springframework.statemachine.config.StateMachineModelFactory<S,E> ) { super( org.springframework.statemachine.config.StateMachineModel<S,E> , org.springframework.statemachine.config.StateMachineModelFactory<S,E> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.StateMachine<S,E> < S , E > org.springframework.statemachine.config.StateMachine<S,E> ( java.util.Collection<org.springframework.statemachine.config.State<S,E>> < State < S , E > > java.util.Collection<org.springframework.statemachine.config.State<S,E>> , java.util.Collection<org.springframework.statemachine.config.Transition<S,E>> < Transition < S , E > > java.util.Collection<org.springframework.statemachine.config.Transition<S,E>> , State < S , E > org.springframework.statemachine.config.State<S,E> , Transition < S , E > org.springframework.statemachine.config.Transition<S,E> , Message < E > org.springframework.statemachine.config.Message<E> , ExtendedState org.springframework.statemachine.config.ExtendedState , PseudoState < S , E > org.springframework.statemachine.config.PseudoState<S,E> , java.lang.Boolean java.lang.Boolean , BeanFactory org.springframework.statemachine.config.BeanFactory , TaskExecutor org.springframework.statemachine.config.TaskExecutor , TaskScheduler org.springframework.statemachine.config.TaskScheduler , java.lang.String java.lang.String , java.lang.String java.lang.String , java.util.UUID java.util.UUID , StateMachineModel < S , E > org.springframework.statemachine.config.StateMachineModel<S,E> ) { ObjectStateMachine < S , E > org.springframework.statemachine.config.ObjectStateMachine<S,E> = new ObjectStateMachine < S , E > ( java.util.Collection<org.springframework.statemachine.config.State<S,E>> , java.util.Collection<org.springframework.statemachine.config.Transition<S,E>> , org.springframework.statemachine.config.State<S,E> , org.springframework.statemachine.config.Transition<S,E> , org.springframework.statemachine.config.Message<E> , org.springframework.statemachine.config.ExtendedState , java.util.UUID ) ; org.springframework.statemachine.config.ObjectStateMachine<S,E> . setId ( java.lang.String ) ; org.springframework.statemachine.config.ObjectStateMachine<S,E> . setHistoryState ( org.springframework.statemachine.config.PseudoState<S,E> ) ; if ( java.lang.Boolean != null ) { org.springframework.statemachine.config.ObjectStateMachine<S,E> . setContextEventsEnabled ( java.lang.Boolean ) ; } if ( org.springframework.statemachine.config.BeanFactory != null ) { org.springframework.statemachine.config.ObjectStateMachine<S,E> . setBeanFactory ( org.springframework.statemachine.config.BeanFactory ) ; } if ( org.springframework.statemachine.config.TaskExecutor != null ) { org.springframework.statemachine.config.ObjectStateMachine<S,E> . setTaskExecutor ( org.springframework.statemachine.config.TaskExecutor ) ; } if ( org.springframework.statemachine.config.TaskScheduler != null ) { org.springframework.statemachine.config.ObjectStateMachine<S,E> . setTaskScheduler ( org.springframework.statemachine.config.TaskScheduler ) ; } if ( org.springframework.statemachine.config.ObjectStateMachine<S,E> instanceof BeanNameAware ) { ( ( BeanNameAware ) org.springframework.statemachine.config.ObjectStateMachine<S,E> ) . setBeanName ( java.lang.String ) ; } org.springframework.statemachine.config.ObjectStateMachine<S,E> . afterPropertiesSet ( ) ; return org.springframework.statemachine.config.ObjectStateMachine<S,E> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.State<S,E> < S , E > org.springframework.statemachine.config.State<S,E> ( S S , java.util.Collection<E> < E > java.util.Collection<E> , java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> , java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> , java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> , PseudoState < S , E > org.springframework.statemachine.config.PseudoState<S,E> , StateMachineModel < S , E > org.springframework.statemachine.config.StateMachineModel<S,E> ) { ObjectState < S , E > org.springframework.statemachine.config.ObjectState<S,E> = new ObjectState < S , E > ( S , java.util.Collection<E> , java.util.Collection<> , java.util.Collection<> , java.util.Collection<> , org.springframework.statemachine.config.PseudoState<S,E> , null , null ) ; BeanFactory org.springframework.statemachine.config.BeanFactory = resolveBeanFactory ( org.springframework.statemachine.config.StateMachineModel<S,E> ) ; if ( org.springframework.statemachine.config.BeanFactory != null ) { org.springframework.statemachine.config.ObjectState<S,E> . setBeanFactory ( org.springframework.statemachine.config.BeanFactory ) ; } TaskExecutor org.springframework.statemachine.config.TaskExecutor = resolveTaskExecutor ( org.springframework.statemachine.config.StateMachineModel<S,E> ) ; if ( org.springframework.statemachine.config.TaskExecutor != null ) { org.springframework.statemachine.config.ObjectState<S,E> . setTaskExecutor ( org.springframework.statemachine.config.TaskExecutor ) ; } TaskScheduler org.springframework.statemachine.config.TaskScheduler = resolveTaskScheduler ( org.springframework.statemachine.config.StateMachineModel<S,E> ) ; if ( org.springframework.statemachine.config.TaskScheduler != null ) { org.springframework.statemachine.config.ObjectState<S,E> . setTaskScheduler ( org.springframework.statemachine.config.TaskScheduler ) ; } return org.springframework.statemachine.config.ObjectState<S,E> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.RegionState<S,E> < S , E > org.springframework.statemachine.config.RegionState<S,E> ( S S , java.util.Collection<org.springframework.statemachine.config.Region<S,E>> < Region < S , E > > java.util.Collection<org.springframework.statemachine.config.Region<S,E>> , java.util.Collection<E> < E > java.util.Collection<E> , java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> , java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.config.Action<S,E>> , PseudoState < S , E > org.springframework.statemachine.config.PseudoState<S,E> ) { return new RegionState < S , E > ( S , java.util.Collection<org.springframework.statemachine.config.Region<S,E>> , java.util.Collection<E> , java.util.Collection<> , java.util.Collection<> , org.springframework.statemachine.config.PseudoState<S,E> ) ; }  <METHOD_END>