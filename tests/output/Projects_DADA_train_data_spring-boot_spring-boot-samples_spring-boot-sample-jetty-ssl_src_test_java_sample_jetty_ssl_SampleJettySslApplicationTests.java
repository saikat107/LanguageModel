<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestRestTemplate sample.jetty.ssl.TestRestTemplate = new TestRestTemplate ( HttpClientOption . SSL ) ; ResponseEntity < java.lang.String > sample.jetty.ssl.ResponseEntity<java.lang.String> = sample.jetty.ssl.TestRestTemplate . getForEntity ( STRING + this . int , java.lang.String .class ) ; assertThat ( sample.jetty.ssl.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.jetty.ssl.ResponseEntity<java.lang.String> . getBody ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
