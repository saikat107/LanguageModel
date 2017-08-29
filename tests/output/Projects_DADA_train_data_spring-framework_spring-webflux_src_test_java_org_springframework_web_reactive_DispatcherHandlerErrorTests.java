<METHOD_START> @ Before public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.web.reactive.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.web.reactive.AnnotationConfigApplicationContext . register ( org.springframework.web.reactive.DispatcherHandlerErrorTests.TestConfig .class ) ; org.springframework.web.reactive.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.web.reactive.DispatcherHandler = new DispatcherHandler ( org.springframework.web.reactive.AnnotationConfigApplicationContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> = this . org.springframework.web.reactive.DispatcherHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.Mono<java.lang.Void> ) . consumeErrorWith ( error -> { assertThat ( error , instanceOf ( ResponseStatusException .class ) ) ; assertThat ( error . getMessage ( ) , is ( STRING ) ) ; } ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> = this . org.springframework.web.reactive.DispatcherHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.Mono<java.lang.Void> ) . consumeErrorWith ( error -> assertSame ( EXCEPTION , error . getCause ( ) ) ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> = this . org.springframework.web.reactive.DispatcherHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.Mono<java.lang.Void> ) . consumeErrorWith ( error -> assertSame ( EXCEPTION , error ) ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> = this . org.springframework.web.reactive.DispatcherHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.Mono<java.lang.Void> ) . consumeErrorWith ( error -> { assertThat ( error , instanceOf ( IllegalStateException .class ) ) ; assertThat ( error . getMessage ( ) , startsWith ( STRING ) ) ; } ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . post ( STRING ) . accept ( APPLICATION_JSON ) . body ( STRING ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> = this . org.springframework.web.reactive.DispatcherHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.Mono<java.lang.Void> ) . consumeErrorWith ( error -> assertThat ( error , instanceOf ( NotAcceptableStatusException .class ) ) ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . post ( STRING ) . body ( Mono . error ( java.lang.IllegalStateException ) ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> = this . org.springframework.web.reactive.DispatcherHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.Mono<java.lang.Void> ) . consumeErrorWith ( error -> { assertThat ( error , instanceOf ( ServerWebInputException .class ) ) ; assertSame ( EXCEPTION , error . getCause ( ) ) ; } ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.ServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; java.util.List<org.springframework.web.reactive.WebExceptionHandler> < WebExceptionHandler > java.util.List<org.springframework.web.reactive.WebExceptionHandler> = java.util.Collections . java.util.List<org.springframework.web.reactive.DispatcherHandlerErrorTests.ServerError500ExceptionHandler> ( new org.springframework.web.reactive.DispatcherHandlerErrorTests.ServerError500ExceptionHandler ( ) ) ; WebHandler org.springframework.web.reactive.WebHandler = new ExceptionHandlingWebHandler ( this . org.springframework.web.reactive.DispatcherHandler , java.util.List<org.springframework.web.reactive.WebExceptionHandler> ) ; org.springframework.web.reactive.WebHandler . handle ( org.springframework.web.reactive.ServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( HttpStatus . INTERNAL_SERVER_ERROR , org.springframework.web.reactive.ServerWebExchange . getResponse ( ) . getStatusCode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.reactive.RequestMappingHandlerMapping org.springframework.web.reactive.RequestMappingHandlerMapping ( ) { return new RequestMappingHandlerMapping ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.reactive.RequestMappingHandlerAdapter org.springframework.web.reactive.RequestMappingHandlerAdapter ( ) { return new RequestMappingHandlerAdapter ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.reactive.ResponseBodyResultHandler org.springframework.web.reactive.ResponseBodyResultHandler ( ) { return new ResponseBodyResultHandler ( java.util.Collections . java.util.List<java.lang.Object> ( new EncoderHttpMessageWriter <> ( CharSequenceEncoder . textPlainOnly ( ) ) ) , new HeaderContentTypeResolver ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.reactive.DispatcherHandlerErrorTests.TestController org.springframework.web.reactive.DispatcherHandlerErrorTests.TestController ( ) { return new org.springframework.web.reactive.DispatcherHandlerErrorTests.TestController ( ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) @ ResponseBody public org.springframework.web.reactive.Publisher<java.lang.String> < java.lang.String > org.springframework.web.reactive.Publisher<java.lang.String> ( ) { return Mono . error ( java.lang.IllegalStateException ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public void void ( ) java.lang.Exception { throw java.lang.IllegalStateException ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public org.springframework.web.reactive.DispatcherHandlerErrorTests.Foo org.springframework.web.reactive.DispatcherHandlerErrorTests.Foo ( ) java.lang.Exception { return new org.springframework.web.reactive.DispatcherHandlerErrorTests.Foo ( ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) @ ResponseBody public org.springframework.web.reactive.Publisher<java.lang.String> < java.lang.String > org.springframework.web.reactive.Publisher<java.lang.String> ( @ RequestBody Publisher < java.lang.String > org.springframework.web.reactive.Publisher<java.lang.String> ) { return Mono . from ( org.springframework.web.reactive.Publisher<java.lang.String> ) . map ( s -> STRING + s ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.Mono<java.lang.Void> ( ServerWebExchange org.springframework.web.reactive.ServerWebExchange , java.lang.Throwable java.lang.Throwable ) { org.springframework.web.reactive.ServerWebExchange . getResponse ( ) . setStatusCode ( HttpStatus . INTERNAL_SERVER_ERROR ) ; return Mono . empty ( ) ; }  <METHOD_END>
