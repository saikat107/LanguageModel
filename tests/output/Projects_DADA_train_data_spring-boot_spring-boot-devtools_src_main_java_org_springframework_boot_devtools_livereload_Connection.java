<METHOD_START> void ( java.net.Socket java.net.Socket , java.io.InputStream java.io.InputStream , java.io.OutputStream java.io.OutputStream )			throws java.io.IOException { this . java.net.Socket = java.net.Socket ; this . org.springframework.boot.devtools.livereload.ConnectionInputStream = new ConnectionInputStream ( java.io.InputStream ) ; this . org.springframework.boot.devtools.livereload.ConnectionOutputStream = new ConnectionOutputStream ( java.io.OutputStream ) ; this . java.lang.String = this . org.springframework.boot.devtools.livereload.ConnectionInputStream . readHeader ( ) ; org.springframework.boot.devtools.livereload.Log . debug ( STRING + this . java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { if ( this . java.lang.String . boolean ( STRING ) && this . java.lang.String . boolean ( STRING ) ) { void ( this . java.lang.String ) ; } if ( this . java.lang.String . boolean ( STRING ) ) { this . org.springframework.boot.devtools.livereload.ConnectionOutputStream . writeHttp ( java.lang.Class<? extends org.springframework.boot.devtools.livereload.Connection> ( ) . java.io.InputStream ( STRING ) , STRING ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( ) ; this . org.springframework.boot.devtools.livereload.ConnectionOutputStream . writeHeaders ( STRING , STRING , STRING , STRING + java.lang.String ) ; new Frame ( STRING + STRING + STRING ) . write ( this . org.springframework.boot.devtools.livereload.ConnectionOutputStream ) ; java.lang.Thread . void ( NUMBER ) ; this . boolean = true ; while ( this . boolean ) { void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) java.io.IOException { try { Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( this . org.springframework.boot.devtools.livereload.ConnectionInputStream ) ; if ( org.springframework.boot.devtools.livereload.Frame . getType ( ) == Frame . Type . PING ) { void ( new Frame ( Frame . Type . PONG ) ) ; } else if ( org.springframework.boot.devtools.livereload.Frame . getType ( ) == Frame . Type . CLOSE ) { throw new ConnectionClosedException ( ) ; } else if ( org.springframework.boot.devtools.livereload.Frame . getType ( ) == Frame . Type . TEXT ) { org.springframework.boot.devtools.livereload.Log . debug ( STRING + org.springframework.boot.devtools.livereload.Frame ) ; } else { throw new java.io.IOException ( STRING + org.springframework.boot.devtools.livereload.Frame . getType ( ) ) ; } } catch ( java.net.SocketTimeoutException java.net.SocketTimeoutException ) { void ( new Frame ( Frame . Type . PING ) ) ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( this . org.springframework.boot.devtools.livereload.ConnectionInputStream ) ; if ( org.springframework.boot.devtools.livereload.Frame . getType ( ) != Frame . Type . PONG ) { throw new java.lang.IllegalStateException ( STRING ) ; } } }  <METHOD_END>
<METHOD_START> public void void ( ) java.io.IOException { if ( this . boolean ) { org.springframework.boot.devtools.livereload.Log . debug ( STRING ) ; void ( new Frame ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Frame org.springframework.boot.devtools.livereload.Frame ) throws java.io.IOException { org.springframework.boot.devtools.livereload.Frame . write ( this . org.springframework.boot.devtools.livereload.ConnectionOutputStream ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) java.security.NoSuchAlgorithmException { java.util.regex.Matcher java.util.regex.Matcher = java.util.regex.Pattern . java.util.regex.Matcher ( this . java.lang.String ) ; if ( ! java.util.regex.Matcher . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.lang.String java.lang.String = java.util.regex.Matcher . java.lang.String ( NUMBER ) . java.lang.String ( ) + java.lang.String ; java.security.MessageDigest java.security.MessageDigest = java.security.MessageDigest . java.security.MessageDigest ( STRING ) ; java.security.MessageDigest . void ( java.lang.String . byte[] ( ) , NUMBER , java.lang.String . int ( ) ) ; return Base64Utils . encodeToString ( java.security.MessageDigest . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.io.IOException { this . boolean = false ; this . java.net.Socket . void ( ) ; }  <METHOD_END>