<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andRespond ( withSuccess ( STRING , MediaType . TEXT_HTML ) ) ; assertThat ( this . org.springframework.boot.test.autoconfigure.web.client.ExampleRestClient . test ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andRespond ( withSuccess ( STRING , MediaType . TEXT_HTML ) ) ; assertThat ( this . org.springframework.boot.test.autoconfigure.web.client.ExampleRestClient . test ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServer . expect ( requestTo ( STRING ) ) . andExpect ( content ( ) . string ( STRING ) ) . andRespond ( withSuccess ( STRING , MediaType . TEXT_HTML ) ) ; this . org.springframework.boot.test.autoconfigure.web.client.ExampleRestClient . testPostWithBody ( STRING ) ; }  <METHOD_END>
