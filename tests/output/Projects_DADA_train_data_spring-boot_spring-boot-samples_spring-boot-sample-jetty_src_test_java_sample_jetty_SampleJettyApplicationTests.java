<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.jetty.ResponseEntity<java.lang.String> = this . sample.jetty.TestRestTemplate . getForEntity ( STRING , java.lang.String .class ) ; assertThat ( sample.jetty.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.jetty.ResponseEntity<java.lang.String> . getBody ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders sample.jetty.HttpHeaders = new HttpHeaders ( ) ; sample.jetty.HttpHeaders . set ( STRING , STRING ) ; HttpEntity < ? > sample.jetty.HttpEntity<?> = new HttpEntity <> ( sample.jetty.HttpHeaders ) ; ResponseEntity < byte [] > sample.jetty.ResponseEntity<byte[]> = this . sample.jetty.TestRestTemplate . exchange ( STRING , HttpMethod . GET , sample.jetty.HttpEntity<> , byte [] .class ) ; assertThat ( sample.jetty.ResponseEntity<byte[]> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; java.util.zip.GZIPInputStream java.util.zip.GZIPInputStream = new java.util.zip.GZIPInputStream ( new java.io.ByteArrayInputStream ( sample.jetty.ResponseEntity<byte[]> . getBody ( ) ) ) ; try { assertThat ( StreamUtils . copyToString ( java.util.zip.GZIPInputStream , java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) ) ) . isEqualTo ( STRING ) ; } finally { java.util.zip.GZIPInputStream . void ( ) ; } }  <METHOD_END>