<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( ) { java.util.List<java.lang.String> . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > demo.deploy.StateContext<java.lang.String,java.lang.String> ) { if ( demo.deploy.StateContext<java.lang.String,java.lang.String> . getStage ( ) == Stage . STATE_ENTRY ) { java.util.List<java.lang.String> . boolean ( STRING + demo.deploy.StateContext<java.lang.String,java.lang.String> . getTarget ( ) . getId ( ) ) ; if ( demo.deploy.StateContext<java.lang.String,java.lang.String> . getTarget ( ) . getId ( ) . equals ( STRING ) ) { java.util.List<java.lang.String> . boolean ( STRING + demo.deploy.StateContext<java.lang.String,java.lang.String> . getExtendedState ( ) . getVariables ( ) . get ( STRING ) ) ; } } else if ( demo.deploy.StateContext<java.lang.String,java.lang.String> . getStage ( ) == Stage . STATE_EXIT ) { java.util.List<java.lang.String> . boolean ( STRING + demo.deploy.StateContext<java.lang.String,java.lang.String> . getSource ( ) . getId ( ) ) ; } }  <METHOD_END>
