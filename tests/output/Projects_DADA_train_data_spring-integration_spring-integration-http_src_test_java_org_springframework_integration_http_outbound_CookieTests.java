<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.http.outbound.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Assert . assertNotNull ( org.springframework.integration.http.outbound.QueueChannel . receive ( ) ) ; java.io.ByteArrayOutputStream . void ( ) ; java.io.BufferedReader java.io.BufferedReader = new java.io.BufferedReader ( new java.io.InputStreamReader ( new java.io.ByteArrayInputStream ( java.io.ByteArrayOutputStream . byte[] ( ) ) ) ) ; java.lang.String java.lang.String = java.io.BufferedReader . java.lang.String ( ) ; assertEquals ( STRING , java.lang.String ) ; assertNull ( java.io.BufferedReader . java.lang.String ( ) ) ; java.io.BufferedReader . void ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . size ( ) ) ; assertFalse ( java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . get ( NUMBER ) . containsKey ( STRING ) ) ; assertTrue ( java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . get ( NUMBER ) . containsKey ( STRING ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . get ( NUMBER ) . get ( STRING ) . get ( NUMBER ) ) ; assertTrue ( java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . get ( NUMBER ) . containsKey ( STRING ) ) ; assertEquals ( STRING , java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . get ( NUMBER ) . get ( STRING ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.http.outbound.ClientHttpRequest org.springframework.integration.http.outbound.ClientHttpRequest ( java.net.URI java.net.URI , HttpMethod org.springframework.integration.http.outbound.HttpMethod )				throws java.io.IOException { return new ClientHttpRequest ( ) { private org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = new HttpHeaders ( ) ; public org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders ( ) { return org.springframework.integration.http.outbound.HttpHeaders ; } public java.io.OutputStream java.io.OutputStream ( ) java.io.IOException { return java.io.ByteArrayOutputStream ; } public java.net.URI java.net.URI ( ) { return null ; } public org.springframework.integration.http.outbound.HttpMethod org.springframework.integration.http.outbound.HttpMethod ( ) { return null ; } public org.springframework.integration.http.outbound.ClientHttpResponse org.springframework.integration.http.outbound.ClientHttpResponse ( ) java.io.IOException { java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . add ( org.springframework.integration.http.outbound.HttpHeaders ) ; return new ClientHttpResponse ( ) { public org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders ( ) { HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = new HttpHeaders ( ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING + int ++ ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING ) ; return org.springframework.integration.http.outbound.HttpHeaders ; } public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) ; } public java.lang.String java.lang.String ( ) java.io.IOException { return STRING ; } public org.springframework.integration.http.outbound.HttpStatus org.springframework.integration.http.outbound.HttpStatus ( ) java.io.IOException { return HttpStatus . OK ; } public void void ( ) {						} public int int ( ) java.io.IOException { return NUMBER ; } } ; } } ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders ( ) { return org.springframework.integration.http.outbound.HttpHeaders ; }  <METHOD_END>
<METHOD_START> public java.io.OutputStream java.io.OutputStream ( ) java.io.IOException { return java.io.ByteArrayOutputStream ; }  <METHOD_END>
<METHOD_START> public java.net.URI java.net.URI ( ) { return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.http.outbound.HttpMethod org.springframework.integration.http.outbound.HttpMethod ( ) { return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.http.outbound.ClientHttpResponse org.springframework.integration.http.outbound.ClientHttpResponse ( ) java.io.IOException { java.util.List<org.springframework.integration.http.outbound.HttpHeaders> . add ( org.springframework.integration.http.outbound.HttpHeaders ) ; return new ClientHttpResponse ( ) { public org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders ( ) { HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = new HttpHeaders ( ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING + int ++ ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING ) ; return org.springframework.integration.http.outbound.HttpHeaders ; } public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) ; } public java.lang.String java.lang.String ( ) java.io.IOException { return STRING ; } public org.springframework.integration.http.outbound.HttpStatus org.springframework.integration.http.outbound.HttpStatus ( ) java.io.IOException { return HttpStatus . OK ; } public void void ( ) {						} public int int ( ) java.io.IOException { return NUMBER ; } } ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders ( ) { HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = new HttpHeaders ( ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING + int ++ ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING ) ; org.springframework.integration.http.outbound.HttpHeaders . set ( STRING , STRING ) ; return org.springframework.integration.http.outbound.HttpHeaders ; }  <METHOD_END>
<METHOD_START> public java.io.InputStream java.io.InputStream ( ) java.io.IOException { return new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) java.io.IOException { return STRING ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.http.outbound.HttpStatus org.springframework.integration.http.outbound.HttpStatus ( ) java.io.IOException { return HttpStatus . OK ; }  <METHOD_END>
<METHOD_START> public void void ( ) {						}  <METHOD_END>
<METHOD_START> public int int ( ) java.io.IOException { return NUMBER ; }  <METHOD_END>