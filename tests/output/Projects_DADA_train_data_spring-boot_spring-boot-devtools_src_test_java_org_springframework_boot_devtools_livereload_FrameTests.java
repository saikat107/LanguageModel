<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.livereload.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expectMessage ( STRING ) ; new Frame ( ( java.lang.String ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.livereload.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expectMessage ( STRING ) ; new Frame ( ( Frame . Frame ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Frame org.springframework.boot.devtools.livereload.Frame = new Frame ( STRING ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . TEXT ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getPayload ( ) ) . isEqualTo ( STRING . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Frame org.springframework.boot.devtools.livereload.Frame = new Frame ( Frame . Type . CLOSE ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . CLOSE ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getPayload ( ) ) . isEqualTo ( new byte [] {} ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( NUMBER ) ; Frame org.springframework.boot.devtools.livereload.Frame = new Frame ( java.lang.String ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; org.springframework.boot.devtools.livereload.Frame . write ( java.io.ByteArrayOutputStream ) ; assertThat ( java.io.ByteArrayOutputStream . byte[] ( ) ) . isEqualTo ( new byte [] { ( byte ) NUMBER , NUMBER , NUMBER } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( NUMBER ) ; Frame org.springframework.boot.devtools.livereload.Frame = new Frame ( java.lang.String ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; org.springframework.boot.devtools.livereload.Frame . write ( java.io.ByteArrayOutputStream ) ; byte [] byte[] = java.io.ByteArrayOutputStream . byte[] ( ) ; assertThat ( byte[] . int ) . isEqualTo ( NUMBER ) ; assertThat ( byte[] [ NUMBER ] ) . isEqualTo ( ( byte ) NUMBER ) ; assertThat ( byte[] [ NUMBER ] ) . isEqualTo ( ( byte ) NUMBER ) ; assertThat ( byte[] [ NUMBER ] ) . isEqualTo ( ( byte ) NUMBER ) ; assertThat ( byte[] [ NUMBER ] ) . isEqualTo ( ( byte ) NUMBER ) ; assertThat ( byte[] [ NUMBER ] ) . isEqualTo ( ( byte ) NUMBER ) ; assertThat ( byte[] [ NUMBER ] ) . isEqualTo ( ( byte ) NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { NUMBER } ; this . org.springframework.boot.devtools.livereload.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expectMessage ( STRING ) ; Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER } ; this . org.springframework.boot.devtools.livereload.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expectMessage ( STRING ) ; Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER , NUMBER , NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . TEXT ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getPayload ( ) ) . isEqualTo ( new byte [] { NUMBER , NUMBER } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . TEXT ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getPayload ( ) ) . isEqualTo ( new byte [] { NUMBER , NUMBER } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [ NUMBER ] ; java.util.Arrays . void ( byte[] , ( byte ) NUMBER ) ; byte[] [ NUMBER ] = ( byte ) NUMBER ; byte[] [ NUMBER ] = ( byte ) NUMBER ; byte[] [ NUMBER ] = NUMBER ; byte[] [ NUMBER ] = NUMBER ; byte[] [ NUMBER ] = NUMBER ; byte[] [ NUMBER ] = NUMBER ; byte[] [ NUMBER ] = NUMBER ; byte[] [ NUMBER ] = NUMBER ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . TEXT ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getPayload ( ) ) . isEqualTo ( java.lang.String ( NUMBER ) . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . CONTINUATION ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . BINARY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . CLOSE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . PING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [] { ( byte ) NUMBER , ( byte ) NUMBER } ; Frame org.springframework.boot.devtools.livereload.Frame = Frame . read ( org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte[] ) ) ; assertThat ( org.springframework.boot.devtools.livereload.Frame . getType ( ) ) . isEqualTo ( Frame . Type . PONG ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.devtools.livereload.ConnectionInputStream org.springframework.boot.devtools.livereload.ConnectionInputStream ( byte [] byte[] ) { return new ConnectionInputStream ( new java.io.ByteArrayInputStream ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( int int ) { char [] char[] = new char [ int ] ; java.util.Arrays . void ( char[] , 'A' ) ; return new java.lang.String ( char[] ) ; }  <METHOD_END>
