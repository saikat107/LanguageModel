<METHOD_START> void ( S S ) { super( S ); }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.SplitterEndpointSpec<S> < S > org.springframework.integration.dsl.SplitterEndpointSpec<S> ( boolean boolean ) { this . handler . setApplySequence ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.SplitterEndpointSpec<S> < S > org.springframework.integration.dsl.SplitterEndpointSpec<S> ( java.lang.String java.lang.String ) { if ( this . handler instanceof DefaultMessageSplitter ) { ( ( DefaultMessageSplitter ) this . handler ) . setDelimiters ( java.lang.String ) ; } else { logger . warn ( STRING ) ; } return this ; }  <METHOD_END>
