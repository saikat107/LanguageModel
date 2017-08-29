<METHOD_START> public void ( S S , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> < Region < S , E > > java.util.Collection<org.springframework.statemachine.state.Region<S,E>> ) { super( S , null , null , null , null , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> ); }  <METHOD_END>
<METHOD_START> public void ( S S , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> < Region < S , E > > java.util.Collection<org.springframework.statemachine.state.Region<S,E>> , java.util.Collection<E> < E > java.util.Collection<E> ) { super( S , java.util.Collection<E> , null , null , null , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> ); }  <METHOD_END>
<METHOD_START> public void ( S S , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> < Region < S , E > > java.util.Collection<org.springframework.statemachine.state.Region<S,E>> , PseudoState < S , E > org.springframework.statemachine.state.PseudoState<S,E> ) { super( S , null , null , null , org.springframework.statemachine.state.PseudoState<S,E> , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> ); }  <METHOD_END>
<METHOD_START> public void ( S S , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> < Region < S , E > > java.util.Collection<org.springframework.statemachine.state.Region<S,E>> , java.util.Collection<E> < E > java.util.Collection<E> , java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> , java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> , PseudoState < S , E > org.springframework.statemachine.state.PseudoState<S,E> ) { super( S , java.util.Collection<E> , java.util.Collection<> , java.util.Collection<> , org.springframework.statemachine.state.PseudoState<S,E> , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> ); }  <METHOD_END>
<METHOD_START> public void ( S S , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> < Region < S , E > > java.util.Collection<org.springframework.statemachine.state.Region<S,E>> , java.util.Collection<E> < E > java.util.Collection<E> , java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> , java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> < ? extends Action < S , E > > java.util.Collection<? extends org.springframework.statemachine.state.Action<S,E>> ) { super( S , java.util.Collection<E> , java.util.Collection<> , java.util.Collection<> , null , java.util.Collection<org.springframework.statemachine.state.Region<S,E>> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Message < E > org.springframework.statemachine.state.Message<E> ) { boolean boolean = false ; if ( getRegions ( ) != null ) { for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { boolean |= org.springframework.statemachine.state.Region<S,E> . sendEvent ( org.springframework.statemachine.state.Message<E> ) ; } } return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Message < E > org.springframework.statemachine.state.Message<E> ) { boolean boolean = true ; if ( getRegions ( ) != null ) { for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { State < S , E > org.springframework.statemachine.state.State<S,E> = org.springframework.statemachine.state.Region<S,E> . getState ( ) ; if ( org.springframework.statemachine.state.State<S,E> != null ) { if ( org.springframework.statemachine.state.State<S,E> . getDeferredEvents ( ) . contains ( org.springframework.statemachine.state.Message<E> . getPayload ( ) ) ) { boolean = boolean & true ; } else { boolean = false ; } } } } return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < S , E > org.springframework.statemachine.state.StateContext<S,E> ) { super. exit ( org.springframework.statemachine.state.StateContext<S,E> ) ; for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { if ( org.springframework.statemachine.state.Region<S,E> . getState ( ) != null ) { org.springframework.statemachine.state.Region<S,E> . getState ( ) . exit ( org.springframework.statemachine.state.StateContext<S,E> ) ; } org.springframework.statemachine.state.Region<S,E> . stop ( ) ; } for ( Action < S , E > org.springframework.statemachine.state.Action<S,E> : getExitActions ( ) ) { executeAction ( org.springframework.statemachine.state.Action<S,E> , org.springframework.statemachine.state.StateContext<S,E> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < S , E > org.springframework.statemachine.state.StateContext<S,E> ) { super. entry ( org.springframework.statemachine.state.StateContext<S,E> ) ; for ( Action < S , E > org.springframework.statemachine.state.Action<S,E> : getEntryActions ( ) ) { executeAction ( org.springframework.statemachine.state.Action<S,E> , org.springframework.statemachine.state.StateContext<S,E> ) ; } if ( getPseudoState ( ) != null && getPseudoState ( ) . getKind ( ) == PseudoStateKind . INITIAL ) { for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { boolean boolean = true ; if ( StateMachineUtils . containsAtleastOne ( org.springframework.statemachine.state.Region<S,E> . getStates ( ) , org.springframework.statemachine.state.StateContext<S,E> . getTargets ( ) ) ) { boolean = false ; } if ( boolean ) { org.springframework.statemachine.state.Region<S,E> . start ( ) ; } } } else { for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { if ( org.springframework.statemachine.state.Region<S,E> . getState ( ) != null ) { org.springframework.statemachine.state.Region<S,E> . getState ( ) . entry ( org.springframework.statemachine.state.StateContext<S,E> ) ; } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<S> < S > java.util.Collection<S> ( ) { java.util.ArrayList<S> < S > java.util.ArrayList<S> = new java.util.ArrayList<S> < S > ( ) ; if ( getId ( ) != null ) { java.util.ArrayList<S> . boolean ( getId ( ) ) ; } for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { State < S , E > org.springframework.statemachine.state.State<S,E> = org.springframework.statemachine.state.Region<S,E> . getState ( ) ; if ( org.springframework.statemachine.state.State<S,E> != null ) { java.util.ArrayList<S> . boolean ( org.springframework.statemachine.state.State<S,E> . getIds ( ) ) ; } } return java.util.ArrayList<S> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.statemachine.state.State<S,E>> < State < S , E > > java.util.Collection<org.springframework.statemachine.state.State<S,E>> ( ) { java.util.ArrayList<org.springframework.statemachine.state.State<S,E>> < State < S , E > > java.util.ArrayList<org.springframework.statemachine.state.State<S,E>> = new java.util.ArrayList<org.springframework.statemachine.state.State<S,E>> < State < S , E > > ( ) ; java.util.ArrayList<org.springframework.statemachine.state.State<S,E>> . add ( this ) ; for ( Region < S , E > org.springframework.statemachine.state.Region<S,E> : getRegions ( ) ) { for ( State < S , E > org.springframework.statemachine.state.State<S,E> : org.springframework.statemachine.state.Region<S,E> . getStates ( ) ) { java.util.ArrayList<org.springframework.statemachine.state.State<S,E>> . addAll ( org.springframework.statemachine.state.State<S,E> . getStates ( ) ) ; } } return java.util.ArrayList<org.springframework.statemachine.state.State<S,E>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + java.util.Collection<S> ( ) + STRING + java.lang.Class<? extends org.springframework.statemachine.state.RegionState> ( ) + STRING + int ( ) + STRING + super. java.lang.String ( ) + STRING ; }  <METHOD_END>