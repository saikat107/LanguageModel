<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = this . sample.hypermedia.ui.secure.TestRestTemplate . getForObject ( STRING , java.lang.String .class ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < java.lang.String > sample.hypermedia.ui.secure.ResponseEntity<java.lang.String> = this . sample.hypermedia.ui.secure.TestRestTemplate . getForEntity ( STRING , java.lang.String .class ) ; assertThat ( sample.hypermedia.ui.secure.ResponseEntity<java.lang.String> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . UNAUTHORIZED ) ; }  <METHOD_END>