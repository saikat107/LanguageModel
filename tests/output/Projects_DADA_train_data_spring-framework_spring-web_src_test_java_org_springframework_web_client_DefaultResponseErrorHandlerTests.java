<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( org.springframework.web.client.ClientHttpResponse . getStatusCode ( ) ) . willReturn ( HttpStatus . NOT_FOUND ) ; assertTrue ( org.springframework.web.client.DefaultResponseErrorHandler . hasError ( org.springframework.web.client.ClientHttpResponse ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( org.springframework.web.client.ClientHttpResponse . getStatusCode ( ) ) . willReturn ( HttpStatus . OK ) ; assertFalse ( org.springframework.web.client.DefaultResponseErrorHandler . hasError ( org.springframework.web.client.ClientHttpResponse ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpHeaders org.springframework.web.client.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.client.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusCode ( ) ) . willReturn ( HttpStatus . NOT_FOUND ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusText ( ) ) . willReturn ( STRING ) ; given ( org.springframework.web.client.ClientHttpResponse . getHeaders ( ) ) . willReturn ( org.springframework.web.client.HttpHeaders ) ; given ( org.springframework.web.client.ClientHttpResponse . getBody ( ) ) . willReturn ( new java.io.ByteArrayInputStream ( STRING . byte[] ( STRING ) ) ) ; try { org.springframework.web.client.DefaultResponseErrorHandler . handleError ( org.springframework.web.client.ClientHttpResponse ) ; fail ( STRING ) ; } catch ( HttpClientErrorException org.springframework.web.client.HttpClientErrorException ) { assertSame ( org.springframework.web.client.HttpHeaders , org.springframework.web.client.HttpClientErrorException . getResponseHeaders ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test ( expected = HttpClientErrorException .class ) public void void ( ) java.lang.Exception { HttpHeaders org.springframework.web.client.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.client.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusCode ( ) ) . willReturn ( HttpStatus . NOT_FOUND ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusText ( ) ) . willReturn ( STRING ) ; given ( org.springframework.web.client.ClientHttpResponse . getHeaders ( ) ) . willReturn ( org.springframework.web.client.HttpHeaders ) ; given ( org.springframework.web.client.ClientHttpResponse . getBody ( ) ) . willThrow ( new java.io.IOException ( ) ) ; org.springframework.web.client.DefaultResponseErrorHandler . handleError ( org.springframework.web.client.ClientHttpResponse ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = HttpClientErrorException .class ) public void void ( ) java.lang.Exception { HttpHeaders org.springframework.web.client.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.client.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusCode ( ) ) . willReturn ( HttpStatus . NOT_FOUND ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusText ( ) ) . willReturn ( STRING ) ; given ( org.springframework.web.client.ClientHttpResponse . getHeaders ( ) ) . willReturn ( org.springframework.web.client.HttpHeaders ) ; org.springframework.web.client.DefaultResponseErrorHandler . handleError ( org.springframework.web.client.ClientHttpResponse ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = UnknownHttpStatusCodeException .class ) public void void ( ) java.lang.Exception { HttpHeaders org.springframework.web.client.HttpHeaders = new HttpHeaders ( ) ; org.springframework.web.client.HttpHeaders . setContentType ( MediaType . TEXT_PLAIN ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusCode ( ) ) . willThrow ( new java.lang.IllegalArgumentException ( STRING ) ) ; given ( org.springframework.web.client.ClientHttpResponse . getRawStatusCode ( ) ) . willReturn ( NUMBER ) ; given ( org.springframework.web.client.ClientHttpResponse . getStatusText ( ) ) . willReturn ( STRING ) ; given ( org.springframework.web.client.ClientHttpResponse . getHeaders ( ) ) . willReturn ( org.springframework.web.client.HttpHeaders ) ; org.springframework.web.client.DefaultResponseErrorHandler . handleError ( org.springframework.web.client.ClientHttpResponse ) ; }  <METHOD_END>
