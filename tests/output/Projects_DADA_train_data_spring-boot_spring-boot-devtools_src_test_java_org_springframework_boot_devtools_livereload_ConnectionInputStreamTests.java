<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.lang.String += STRING + int + STRING ; } java.lang.String java.lang.String = java.lang.String + STRING + STRING ; ConnectionInputStream org.springframework.boot.devtools.livereload.ConnectionInputStream = new ConnectionInputStream ( new java.io.ByteArrayInputStream ( java.lang.String . byte[] ( ) ) ) ; assertThat ( org.springframework.boot.devtools.livereload.ConnectionInputStream . readHeader ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( ) ; org.springframework.boot.devtools.livereload.ConnectionInputStreamTests.LimitedInputStream org.springframework.boot.devtools.livereload.ConnectionInputStreamTests.LimitedInputStream = new org.springframework.boot.devtools.livereload.ConnectionInputStreamTests.LimitedInputStream ( new java.io.ByteArrayInputStream ( byte[] ) , NUMBER ) ; ConnectionInputStream org.springframework.boot.devtools.livereload.ConnectionInputStream = new ConnectionInputStream ( org.springframework.boot.devtools.livereload.ConnectionInputStreamTests.LimitedInputStream ) ; byte [] byte[] = new byte [ byte[] . int ] ; org.springframework.boot.devtools.livereload.ConnectionInputStream . readFully ( byte[] , NUMBER , byte[] . int ) ; assertThat ( byte[] ) . isEqualTo ( byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConnectionInputStream org.springframework.boot.devtools.livereload.ConnectionInputStream = new ConnectionInputStream ( new java.io.ByteArrayInputStream ( byte[] ) ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expect ( java.io.IOException .class ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expectMessage ( STRING ) ; org.springframework.boot.devtools.livereload.ConnectionInputStream . checkedRead ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConnectionInputStream org.springframework.boot.devtools.livereload.ConnectionInputStream = new ConnectionInputStream ( new java.io.ByteArrayInputStream ( byte[] ) ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expect ( java.io.IOException .class ) ; this . org.springframework.boot.devtools.livereload.ExpectedException . expectMessage ( STRING ) ; byte [] byte[] = new byte [ NUMBER ] ; org.springframework.boot.devtools.livereload.ConnectionInputStream . checkedRead ( byte[] , NUMBER , byte[] . int ) ; }  <METHOD_END>
<METHOD_START> protected void ( java.io.InputStream java.io.InputStream , int int ) { super( java.io.InputStream ); this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( byte [] byte[] , int int , int int ) throws java.io.IOException { return super. int ( byte[] , int , java.lang.Math . int ( int , this . int ) ) ; }  <METHOD_END>