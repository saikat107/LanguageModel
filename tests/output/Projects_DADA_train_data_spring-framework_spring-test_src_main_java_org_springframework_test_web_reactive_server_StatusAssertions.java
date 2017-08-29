<METHOD_START> void ( ExchangeResult org.springframework.test.web.reactive.server.ExchangeResult , WebTestClient . WebTestClient WebTestClient.ResponseSpec ) { this . org.springframework.test.web.reactive.server.ExchangeResult = org.springframework.test.web.reactive.server.ExchangeResult ; this . WebTestClient.ResponseSpec = WebTestClient.ResponseSpec ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( HttpStatus org.springframework.test.web.reactive.server.HttpStatus ) { return WebTestClient.ResponseSpec ( org.springframework.test.web.reactive.server.HttpStatus . value ( ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( int int ) { int int = this . org.springframework.test.web.reactive.server.ExchangeResult . getStatus ( ) . value ( ) ; this . org.springframework.test.web.reactive.server.ExchangeResult . assertWithDiagnostics ( ( ) assertEquals ( STRING , status , actual ) ) ; return this . WebTestClient.ResponseSpec ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { HttpStatus org.springframework.test.web.reactive.server.HttpStatus = HttpStatus . CREATED ; return WebTestClient.ResponseSpec ( org.springframework.test.web.reactive.server.HttpStatus ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . ACCEPTED ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . NO_CONTENT ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . FOUND ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . SEE_OTHER ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . NOT_MODIFIED ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . TEMPORARY_REDIRECT ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . PERMANENT_REDIRECT ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . BAD_REQUEST ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . UNAUTHORIZED ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . NOT_FOUND ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = this . org.springframework.test.web.reactive.server.ExchangeResult . getStatus ( ) . getReasonPhrase ( ) ; java.lang.String java.lang.String = STRING ; this . org.springframework.test.web.reactive.server.ExchangeResult . assertWithDiagnostics ( ( ) assertEquals ( message , reason , actual ) ) ; return this . WebTestClient.ResponseSpec ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . Series . INFORMATIONAL ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . Series . SUCCESSFUL ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . Series . REDIRECTION ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { return WebTestClient.ResponseSpec ( HttpStatus . Series . CLIENT_ERROR ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ) { HttpStatus . HttpStatus HttpStatus.Series = HttpStatus . Series . SERVER_ERROR ; return WebTestClient.ResponseSpec ( HttpStatus.Series ) ; }  <METHOD_END>
<METHOD_START> private WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( HttpStatus org.springframework.test.web.reactive.server.HttpStatus ) { HttpStatus org.springframework.test.web.reactive.server.HttpStatus = this . org.springframework.test.web.reactive.server.ExchangeResult . getStatus ( ) ; this . org.springframework.test.web.reactive.server.ExchangeResult . assertWithDiagnostics ( ( ) assertEquals ( STRING , expected , actual ) ) ; return this . WebTestClient.ResponseSpec ; }  <METHOD_END>
<METHOD_START> private WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( HttpStatus . HttpStatus HttpStatus.Series ) { HttpStatus org.springframework.test.web.reactive.server.HttpStatus = this . org.springframework.test.web.reactive.server.ExchangeResult . getStatus ( ) ; java.lang.String java.lang.String = STRING + org.springframework.test.web.reactive.server.HttpStatus ; this . org.springframework.test.web.reactive.server.ExchangeResult . assertWithDiagnostics ( ( ) assertEquals ( message , expected , status . series ( ) ) ) ; return this . WebTestClient.ResponseSpec ; }  <METHOD_END>
