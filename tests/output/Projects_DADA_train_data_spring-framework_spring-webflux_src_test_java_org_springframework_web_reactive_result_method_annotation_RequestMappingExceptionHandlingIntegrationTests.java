<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.result.method.annotation.ApplicationContext org.springframework.web.reactive.result.method.annotation.ApplicationContext ( ) { AnnotationConfigApplicationContext org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext . register ( org.springframework.web.reactive.result.method.annotation.RequestMappingExceptionHandlingIntegrationTests.WebConfig .class ) ; org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext . refresh ( ) ; return org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performGet ( STRING , new HttpHeaders ( ) , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performGet ( STRING , new HttpHeaders ( ) , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) public org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String> < java.lang.String > org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String> ( ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) public org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String> < java.lang.String > org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String> ( ) { return Mono . error ( new java.lang.IllegalArgumentException ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ ExceptionHandler public org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String> < java.lang.String > org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String> ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { return Mono . just ( STRING + java.lang.IllegalArgumentException . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ ExceptionHandler public org.springframework.web.reactive.result.method.annotation.ResponseEntity<org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String>> < Publisher < java.lang.String > > org.springframework.web.reactive.result.method.annotation.ResponseEntity<org.springframework.web.reactive.result.method.annotation.Publisher<java.lang.String>> ( java.lang.IllegalStateException java.lang.IllegalStateException ) { return ResponseEntity . ok ( Mono . just ( STRING + java.lang.IllegalStateException . java.lang.String ( ) ) ) ; }  <METHOD_END>