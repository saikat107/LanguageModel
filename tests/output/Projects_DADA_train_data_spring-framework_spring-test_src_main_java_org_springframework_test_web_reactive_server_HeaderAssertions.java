<METHOD_START> void ( ExchangeResult org.springframework.test.web.reactive.server.ExchangeResult , WebTestClient . WebTestClient WebTestClient.ResponseSpec ) { this . org.springframework.test.web.reactive.server.ExchangeResult = org.springframework.test.web.reactive.server.ExchangeResult ; this . WebTestClient.ResponseSpec = WebTestClient.ResponseSpec ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { return WebTestClient.ResponseSpec ( java.lang.String , java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) , org.springframework.test.web.reactive.server.HttpHeaders ( ) . get ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.lang.String java.lang.String = org.springframework.test.web.reactive.server.HttpHeaders ( ) . getFirst ( java.lang.String ) ; assertTrue ( java.lang.String ( java.lang.String ) + STRING , java.lang.String != null ) ; boolean boolean = java.util.regex.Pattern . java.util.regex.Pattern ( java.lang.String ) . java.util.regex.Matcher ( java.lang.String ) . boolean ( ) ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) + STRING + java.lang.String + STRING + java.lang.String + STRING ; this . org.springframework.test.web.reactive.server.ExchangeResult . assertWithDiagnostics ( ( ) assertTrue ( message , match ) ) ; return this . WebTestClient.ResponseSpec ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( CacheControl org.springframework.test.web.reactive.server.CacheControl ) { return WebTestClient.ResponseSpec ( STRING , org.springframework.test.web.reactive.server.CacheControl . getHeaderValue ( ) , org.springframework.test.web.reactive.server.HttpHeaders ( ) . getCacheControl ( ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( ContentDisposition org.springframework.test.web.reactive.server.ContentDisposition ) { return WebTestClient.ResponseSpec ( STRING , org.springframework.test.web.reactive.server.ContentDisposition , org.springframework.test.web.reactive.server.HttpHeaders ( ) . getContentDisposition ( ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( long long ) { return WebTestClient.ResponseSpec ( STRING , long , org.springframework.test.web.reactive.server.HttpHeaders ( ) . getContentLength ( ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( MediaType org.springframework.test.web.reactive.server.MediaType ) { return WebTestClient.ResponseSpec ( STRING , org.springframework.test.web.reactive.server.MediaType , org.springframework.test.web.reactive.server.HttpHeaders ( ) . getContentType ( ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( int int ) { return WebTestClient.ResponseSpec ( STRING , int , org.springframework.test.web.reactive.server.HttpHeaders ( ) . getExpires ( ) ) ; }  <METHOD_END>
<METHOD_START> public WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( int int ) { return WebTestClient.ResponseSpec ( STRING , int , org.springframework.test.web.reactive.server.HttpHeaders ( ) . getLastModified ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.reactive.server.HttpHeaders org.springframework.test.web.reactive.server.HttpHeaders ( ) { return this . org.springframework.test.web.reactive.server.ExchangeResult . getResponseHeaders ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return STRING + java.lang.String + STRING ; }  <METHOD_END>
<METHOD_START> private WebTestClient . WebTestClient.ResponseSpec WebTestClient.ResponseSpec ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { this . org.springframework.test.web.reactive.server.ExchangeResult . assertWithDiagnostics ( ( ) assertEquals ( getMessage ( name ) , expected , actual ) ) ; return this . WebTestClient.ResponseSpec ; }  <METHOD_END>
