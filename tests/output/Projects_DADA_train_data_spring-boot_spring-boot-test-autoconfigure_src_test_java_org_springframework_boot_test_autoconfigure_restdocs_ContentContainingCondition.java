<METHOD_START> void ( java.lang.String java.lang.String ) { super( new TextDescription ( STRING , java.lang.String ) ); this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.io.File java.io.File ) { java.io.Reader java.io.Reader = null ; try { java.io.Reader = new java.io.FileReader ( java.io.File ) ; java.lang.String java.lang.String = FileCopyUtils . copyToString ( java.io.Reader ) ; return java.lang.String . boolean ( this . java.lang.String ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( java.io.IOException ) ; } finally { if ( java.io.Reader != null ) { try { java.io.Reader . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { } } } }  <METHOD_END>