<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . java.net.HttpURLConnection = mock ( java.net.HttpURLConnection .class ) ; this . org.springframework.http.client.SimpleClientHttpResponse = new SimpleClientHttpResponse ( this . java.net.HttpURLConnection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream = new org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; given ( this . java.net.HttpURLConnection . java.io.InputStream ( ) ) . willReturn ( null ) ; given ( this . java.net.HttpURLConnection . java.io.InputStream ( ) ) . willReturn ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream ) ; java.io.InputStream java.io.InputStream = this . org.springframework.http.client.SimpleClientHttpResponse . getBody ( ) ; assertThat ( StreamUtils . copyToString ( java.io.InputStream , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , is ( STRING ) ) ; this . org.springframework.http.client.SimpleClientHttpResponse . close ( ) ; assertTrue ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . boolean ( ) ) ; verify ( this . java.net.HttpURLConnection , never ( ) ) . disconnect ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [ NUMBER ] ; org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream = new org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; given ( this . java.net.HttpURLConnection . java.io.InputStream ( ) ) . willReturn ( null ) ; given ( this . java.net.HttpURLConnection . java.io.InputStream ( ) ) . willReturn ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream ) ; java.io.InputStream java.io.InputStream = this . org.springframework.http.client.SimpleClientHttpResponse . getBody ( ) ; java.io.InputStream . int ( byte[] ) ; assertThat ( new java.lang.String ( byte[] , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , is ( STRING ) ) ; assertThat ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . int ( ) , is ( NUMBER ) ) ; this . org.springframework.http.client.SimpleClientHttpResponse . close ( ) ; assertThat ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . int ( ) , is ( NUMBER ) ) ; assertTrue ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . boolean ( ) ) ; verify ( this . java.net.HttpURLConnection , never ( ) ) . disconnect ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = new byte [ NUMBER ] ; org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream = new org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; given ( this . java.net.HttpURLConnection . java.io.InputStream ( ) ) . willReturn ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream ) ; java.io.InputStream java.io.InputStream = this . org.springframework.http.client.SimpleClientHttpResponse . getBody ( ) ; java.io.InputStream . int ( byte[] ) ; assertThat ( new java.lang.String ( byte[] , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) , is ( STRING ) ) ; assertThat ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . int ( ) , is ( NUMBER ) ) ; this . org.springframework.http.client.SimpleClientHttpResponse . close ( ) ; assertThat ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . int ( ) , is ( NUMBER ) ) ; assertTrue ( org.springframework.http.client.SimpleClientHttpResponseTests.TestByteArrayInputStream . boolean ( ) ) ; verify ( this . java.net.HttpURLConnection , never ( ) ) . disconnect ( ) ; }  <METHOD_END>
<METHOD_START> public void ( byte [] byte[] ) { super( byte[] ); this . boolean = false ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { super. void ( ) ; this . boolean = true ; }  <METHOD_END>
