<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( ApplicationEventPublisher org.springframework.statemachine.event.ApplicationEventPublisher ) { this . org.springframework.statemachine.event.ApplicationEventPublisher = org.springframework.statemachine.event.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEventPublisher org.springframework.statemachine.event.ApplicationEventPublisher ) { this . org.springframework.statemachine.event.ApplicationEventPublisher = org.springframework.statemachine.event.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , State < ? , ? > org.springframework.statemachine.event.State<?,?> , State < ? , ? > org.springframework.statemachine.event.State<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnStateChangedEvent ( java.lang.Object , org.springframework.statemachine.event.State<,> , org.springframework.statemachine.event.State<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , State < ? , ? > org.springframework.statemachine.event.State<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnStateEntryEvent ( java.lang.Object , org.springframework.statemachine.event.State<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , State < ? , ? > org.springframework.statemachine.event.State<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnStateExitEvent ( java.lang.Object , org.springframework.statemachine.event.State<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Message < ? > org.springframework.statemachine.event.Message<?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnEventNotAcceptedEvent ( java.lang.Object , org.springframework.statemachine.event.Message<> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Transition < ? , ? > org.springframework.statemachine.event.Transition<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnTransitionStartEvent ( java.lang.Object , org.springframework.statemachine.event.Transition<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Transition < ? , ? > org.springframework.statemachine.event.Transition<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnTransitionEndEvent ( java.lang.Object , org.springframework.statemachine.event.Transition<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Transition < ? , ? > org.springframework.statemachine.event.Transition<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnTransitionEvent ( java.lang.Object , org.springframework.statemachine.event.Transition<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , StateMachine < ? , ? > org.springframework.statemachine.event.StateMachine<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnStateMachineStart ( java.lang.Object , org.springframework.statemachine.event.StateMachine<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , StateMachine < ? , ? > org.springframework.statemachine.event.StateMachine<?,?> ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnStateMachineStop ( java.lang.Object , org.springframework.statemachine.event.StateMachine<,> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , StateMachine < ? , ? > org.springframework.statemachine.event.StateMachine<?,?> , java.lang.Exception java.lang.Exception ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnStateMachineError ( java.lang.Object , org.springframework.statemachine.event.StateMachine<,> , java.lang.Exception ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { if ( org.springframework.statemachine.event.ApplicationEventPublisher != null ) { org.springframework.statemachine.event.ApplicationEventPublisher . publishEvent ( new OnExtendedStateChanged ( java.lang.Object , java.lang.Object , java.lang.Object ) ) ; } }  <METHOD_END>