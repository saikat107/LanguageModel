<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.web.staticcontent.ResponseEntity<java.lang.String> = this . sample.web.staticcontent.TestRestTemplate . getForEntity ( STRING , java.lang.String .class ) ; assertThat ( sample.web.staticcontent.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.web.staticcontent.ResponseEntity<java.lang.String> . getBody ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.web.staticcontent.ResponseEntity<java.lang.String> = this . sample.web.staticcontent.TestRestTemplate . getForEntity ( STRING , java.lang.String .class ) ; assertThat ( sample.web.staticcontent.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.web.staticcontent.ResponseEntity<java.lang.String> . getBody ( ) ) . contains ( STRING ) ; assertThat ( sample.web.staticcontent.ResponseEntity<java.lang.String> . getHeaders ( ) . getContentType ( ) ) . isEqualTo ( MediaType . valueOf ( STRING ) ) ; }  <METHOD_END>
