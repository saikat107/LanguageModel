<METHOD_START> public void ( java.lang.String ... java.lang.String[] ) { super( new SimpleCommandLineArgsParser ( ) . parse ( java.lang.String[] ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String [] java.lang.String[] ) { super( java.lang.String , new SimpleCommandLineArgsParser ( ) . parse ( java.lang.String[] ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return source . getOptionNames ( ) . toArray ( new java.lang.String [ source . getOptionNames ( ) . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.String java.lang.String ) { return this . source . containsOption ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.lang.String java.lang.String ) { return this . source . getOptionValues ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . source . getNonOptionArgs ( ) ; }  <METHOD_END>