<METHOD_START> public void ( java.io.File java.io.File , long long , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( java.io.File , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.io.File = java.io.File ; this . long = long ; this . byte[] = null ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( byte [] byte[] , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( byte[] , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . byte[] = byte[] ; this . long = byte[] . int ; this . java.io.File = null ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public byte [] byte[] ( ) java.io.IOException { if ( this . byte[] != null ) { return this . byte[] ; } return FileCopyUtils . copyToByteArray ( this . java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { if ( this . byte[] != null ) { return new java.io.ByteArrayInputStream ( this . byte[] ) ; } return new java.io.BufferedInputStream ( new java.io.FileInputStream ( this . java.io.File ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . long == NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.File java.io.File ) throws java.io.IOException , java.lang.IllegalStateException { if ( this . byte[] != null ) { FileCopyUtils . copy ( this . byte[] , java.io.File ) ; } else { FileCopyUtils . copy ( this . java.io.File , java.io.File ) ; } }  <METHOD_END>