<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.actuator.ResponseEntity<java.lang.String> = this . sample.actuator.TestRestTemplate . getForEntity ( STRING , java.lang.String .class ) ; assertThat ( sample.actuator.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . OK ) ; assertThat ( sample.actuator.ResponseEntity<java.lang.String> . getBody ( ) ) . doesNotContain ( STRING ) ; }  <METHOD_END>
