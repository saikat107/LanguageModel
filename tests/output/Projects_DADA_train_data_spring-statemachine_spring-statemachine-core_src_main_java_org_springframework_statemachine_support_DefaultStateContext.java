<METHOD_START> public void ( Stage org.springframework.statemachine.support.Stage , Message < E > org.springframework.statemachine.support.Message<E> , MessageHeaders org.springframework.statemachine.support.MessageHeaders , ExtendedState org.springframework.statemachine.support.ExtendedState , Transition < S , E > org.springframework.statemachine.support.Transition<S,E> , StateMachine < S , E > org.springframework.statemachine.support.StateMachine<S,E> , State < S , E > org.springframework.statemachine.support.State<S,E> , State < S , E > org.springframework.statemachine.support.State<S,E> , java.lang.Exception java.lang.Exception ) { this . org.springframework.statemachine.support.Stage = org.springframework.statemachine.support.Stage ; this . org.springframework.statemachine.support.Message<E> = org.springframework.statemachine.support.Message<E> ; this . org.springframework.statemachine.support.MessageHeaders = org.springframework.statemachine.support.MessageHeaders ; this . org.springframework.statemachine.support.ExtendedState = org.springframework.statemachine.support.ExtendedState ; this . org.springframework.statemachine.support.Transition<S,E> = org.springframework.statemachine.support.Transition<S,E> ; this . org.springframework.statemachine.support.StateMachine<S,E> = org.springframework.statemachine.support.StateMachine<S,E> ; this . org.springframework.statemachine.support.State<S,E> = org.springframework.statemachine.support.State<S,E> ; this . org.springframework.statemachine.support.State<S,E> = org.springframework.statemachine.support.State<S,E> ; this . java.lang.Exception = java.lang.Exception ; this . java.util.Collection<org.springframework.statemachine.support.State<S,E>> = null ; this . java.util.Collection<org.springframework.statemachine.support.State<S,E>> = null ; }  <METHOD_END>
<METHOD_START> public void ( Stage org.springframework.statemachine.support.Stage , Message < E > org.springframework.statemachine.support.Message<E> , MessageHeaders org.springframework.statemachine.support.MessageHeaders , ExtendedState org.springframework.statemachine.support.ExtendedState , Transition < S , E > org.springframework.statemachine.support.Transition<S,E> , StateMachine < S , E > org.springframework.statemachine.support.StateMachine<S,E> , State < S , E > org.springframework.statemachine.support.State<S,E> , State < S , E > org.springframework.statemachine.support.State<S,E> , java.util.Collection<org.springframework.statemachine.support.State<S,E>> < State < S , E > > java.util.Collection<org.springframework.statemachine.support.State<S,E>> , java.util.Collection<org.springframework.statemachine.support.State<S,E>> < State < S , E > > java.util.Collection<org.springframework.statemachine.support.State<S,E>> , java.lang.Exception java.lang.Exception ) { this . org.springframework.statemachine.support.Stage = org.springframework.statemachine.support.Stage ; this . org.springframework.statemachine.support.Message<E> = org.springframework.statemachine.support.Message<E> ; this . org.springframework.statemachine.support.MessageHeaders = org.springframework.statemachine.support.MessageHeaders ; this . org.springframework.statemachine.support.ExtendedState = org.springframework.statemachine.support.ExtendedState ; this . org.springframework.statemachine.support.Transition<S,E> = org.springframework.statemachine.support.Transition<S,E> ; this . org.springframework.statemachine.support.StateMachine<S,E> = org.springframework.statemachine.support.StateMachine<S,E> ; this . org.springframework.statemachine.support.State<S,E> = org.springframework.statemachine.support.State<S,E> ; this . org.springframework.statemachine.support.State<S,E> = org.springframework.statemachine.support.State<S,E> ; this . java.util.Collection<org.springframework.statemachine.support.State<S,E>> = java.util.Collection<org.springframework.statemachine.support.State<S,E>> ; this . java.util.Collection<org.springframework.statemachine.support.State<S,E>> = java.util.Collection<org.springframework.statemachine.support.State<S,E>> ; this . java.lang.Exception = java.lang.Exception ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.Stage org.springframework.statemachine.support.Stage ( ) { return org.springframework.statemachine.support.Stage ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public E E ( ) { return org.springframework.statemachine.support.Message<E> != null ? org.springframework.statemachine.support.Message<E> . getPayload ( ) : null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.Message<E> < E > org.springframework.statemachine.support.Message<E> ( ) { return org.springframework.statemachine.support.Message<E> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.MessageHeaders org.springframework.statemachine.support.MessageHeaders ( ) { return org.springframework.statemachine.support.MessageHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof java.lang.String ) { return org.springframework.statemachine.support.MessageHeaders . get ( ( java.lang.String ) java.lang.Object ) ; } else if ( java.lang.Object instanceof java.lang.Enum<?> < ? > ) { return org.springframework.statemachine.support.MessageHeaders . get ( ( ( java.lang.Enum<?> < ? > ) java.lang.Object ) . java.lang.String ( ) ) ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.ExtendedState org.springframework.statemachine.support.ExtendedState ( ) { return org.springframework.statemachine.support.ExtendedState ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.Transition<S,E> < S , E > org.springframework.statemachine.support.Transition<S,E> ( ) { return org.springframework.statemachine.support.Transition<S,E> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.StateMachine<S,E> < S , E > org.springframework.statemachine.support.StateMachine<S,E> ( ) { return org.springframework.statemachine.support.StateMachine<S,E> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.State<S,E> < S , E > org.springframework.statemachine.support.State<S,E> ( ) { return org.springframework.statemachine.support.State<S,E> != null ? org.springframework.statemachine.support.State<S,E> : ( org.springframework.statemachine.support.Transition<S,E> != null ? org.springframework.statemachine.support.Transition<S,E> . getSource ( ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.statemachine.support.State<S,E>> < State < S , E > > java.util.Collection<org.springframework.statemachine.support.State<S,E>> ( ) { return java.util.Collection<org.springframework.statemachine.support.State<S,E>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.support.State<S,E> < S , E > org.springframework.statemachine.support.State<S,E> ( ) { return org.springframework.statemachine.support.State<S,E> != null ? org.springframework.statemachine.support.State<S,E> : ( org.springframework.statemachine.support.Transition<S,E> != null ? org.springframework.statemachine.support.Transition<S,E> . getTarget ( ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.statemachine.support.State<S,E>> < State < S , E > > java.util.Collection<org.springframework.statemachine.support.State<S,E>> ( ) { return java.util.Collection<org.springframework.statemachine.support.State<S,E>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Exception java.lang.Exception ( ) { return java.lang.Exception ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + org.springframework.statemachine.support.Stage + STRING + org.springframework.statemachine.support.Message<E> + STRING + org.springframework.statemachine.support.MessageHeaders + STRING + org.springframework.statemachine.support.ExtendedState + STRING + org.springframework.statemachine.support.Transition<S,E> + STRING + org.springframework.statemachine.support.StateMachine<S,E> + STRING + org.springframework.statemachine.support.State<S,E> + STRING + org.springframework.statemachine.support.State<S,E> + STRING + java.util.Collection<org.springframework.statemachine.support.State<S,E>> + STRING + java.util.Collection<org.springframework.statemachine.support.State<S,E>> + STRING + java.lang.Exception + STRING ; }  <METHOD_END>