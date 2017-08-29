<METHOD_START> protected void ( HttpStatus org.springframework.test.web.client.response.HttpStatus ) { Assert . notNull ( org.springframework.test.web.client.response.HttpStatus , STRING ) ; this . org.springframework.test.web.client.response.HttpStatus = org.springframework.test.web.client.response.HttpStatus ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.response.DefaultResponseCreator org.springframework.test.web.client.response.DefaultResponseCreator ( java.lang.String java.lang.String ) { this . byte[] = java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.response.DefaultResponseCreator org.springframework.test.web.client.response.DefaultResponseCreator ( byte [] byte[] ) { this . byte[] = byte[] ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.response.DefaultResponseCreator org.springframework.test.web.client.response.DefaultResponseCreator ( Resource org.springframework.test.web.client.response.Resource ) { this . org.springframework.test.web.client.response.Resource = org.springframework.test.web.client.response.Resource ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.response.DefaultResponseCreator org.springframework.test.web.client.response.DefaultResponseCreator ( MediaType org.springframework.test.web.client.response.MediaType ) { if ( org.springframework.test.web.client.response.MediaType != null ) { this . org.springframework.test.web.client.response.HttpHeaders . setContentType ( org.springframework.test.web.client.response.MediaType ) ; } return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.response.DefaultResponseCreator org.springframework.test.web.client.response.DefaultResponseCreator ( java.net.URI java.net.URI ) { this . org.springframework.test.web.client.response.HttpHeaders . setLocation ( java.net.URI ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.client.response.DefaultResponseCreator org.springframework.test.web.client.response.DefaultResponseCreator ( HttpHeaders org.springframework.test.web.client.response.HttpHeaders ) { for ( java.lang.String java.lang.String : org.springframework.test.web.client.response.HttpHeaders . keySet ( ) ) { for ( java.lang.String java.lang.String : org.springframework.test.web.client.response.HttpHeaders . get ( java.lang.String ) ) { this . org.springframework.test.web.client.response.HttpHeaders . add ( java.lang.String , java.lang.String ) ; } } return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.web.client.response.ClientHttpResponse org.springframework.test.web.client.response.ClientHttpResponse ( ClientHttpRequest org.springframework.test.web.client.response.ClientHttpRequest ) throws java.io.IOException { MockClientHttpResponse org.springframework.test.web.client.response.MockClientHttpResponse ; if ( this . org.springframework.test.web.client.response.Resource != null ) { java.io.InputStream java.io.InputStream = this . org.springframework.test.web.client.response.Resource . getInputStream ( ) ; org.springframework.test.web.client.response.MockClientHttpResponse = new MockClientHttpResponse ( java.io.InputStream , this . org.springframework.test.web.client.response.HttpStatus ) ; } else { org.springframework.test.web.client.response.MockClientHttpResponse = new MockClientHttpResponse ( this . byte[] , this . org.springframework.test.web.client.response.HttpStatus ) ; } org.springframework.test.web.client.response.MockClientHttpResponse . getHeaders ( ) . putAll ( this . org.springframework.test.web.client.response.HttpHeaders ) ; return org.springframework.test.web.client.response.MockClientHttpResponse ; }  <METHOD_END>
