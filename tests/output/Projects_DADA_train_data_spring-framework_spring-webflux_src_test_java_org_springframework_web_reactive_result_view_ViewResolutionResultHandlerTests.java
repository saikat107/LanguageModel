<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotNotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , java.lang.String .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Rendering .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , Rendering .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( View .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , View .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( void .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , java.lang.Void .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Completable .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Model .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.util.Map .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotNotPresent ( ModelAttribute .class ) . resolveReturnType ( java.util.Map .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.Long .class ) ) ; void ( on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotNotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.Long .class ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( MethodParameter org.springframework.web.reactive.result.view.MethodParameter ) { void ( org.springframework.web.reactive.result.view.MethodParameter , true ) ; }  <METHOD_END>
<METHOD_START> private void void ( MethodParameter org.springframework.web.reactive.result.view.MethodParameter ) { void ( org.springframework.web.reactive.result.view.MethodParameter , false ) ; }  <METHOD_END>
<METHOD_START> private void void ( MethodParameter org.springframework.web.reactive.result.view.MethodParameter , boolean boolean ) { ViewResolutionResultHandler org.springframework.web.reactive.result.view.ViewResolutionResultHandler = org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( mock ( ViewResolver .class ) ) ; HandlerResult org.springframework.web.reactive.result.view.HandlerResult = new HandlerResult ( new java.lang.Object ( ) , null , org.springframework.web.reactive.result.view.MethodParameter , this . org.springframework.web.reactive.result.view.BindingContext ) ; assertEquals ( boolean , org.springframework.web.reactive.result.view.ViewResolutionResultHandler . supports ( org.springframework.web.reactive.result.view.HandlerResult ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver . void ( NUMBER ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver . void ( NUMBER ) ; java.util.List<org.springframework.web.reactive.result.view.ViewResolver> < ViewResolver > java.util.List<org.springframework.web.reactive.result.view.ViewResolver> = org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver , org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ) . getViewResolvers ( ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver> ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver , org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ) , java.util.List<org.springframework.web.reactive.result.view.ViewResolver> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object ; MethodParameter org.springframework.web.reactive.result.view.MethodParameter ; ViewResolver org.springframework.web.reactive.result.view.ViewResolver = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( View .class ) ; java.lang.Object = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView ( STRING ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , View .class ) ; java.lang.Object = Mono . just ( new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView ( STRING ) ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotNotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ; java.lang.Object = STRING ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ; java.lang.Object = STRING ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , java.lang.String .class ) ; java.lang.Object = Mono . just ( STRING ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Model .class ) ; java.lang.Object = new ConcurrentModel ( ) . addAttribute ( STRING , STRING ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; ResolvableType . clearCache ( ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotNotPresent ( ModelAttribute .class ) . resolveReturnType ( java.util.Map .class ) ; java.lang.Object = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; ResolvableType . clearCache ( ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.util.Map .class ) ; java.lang.Object = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean .class ) ; java.lang.Object = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean ( STRING ) ; java.lang.String java.lang.String = STRING + STRING + STRING + STRING ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , java.lang.String , org.springframework.web.reactive.result.view.ViewResolver ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.Long .class ) ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , NUMBER , STRING , org.springframework.web.reactive.result.view.ViewResolver ) ; org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Rendering .class ) ; HttpStatus org.springframework.web.reactive.result.view.HttpStatus = HttpStatus . UNPROCESSABLE_ENTITY ; java.lang.Object = Rendering . view ( STRING ) . modelAttribute ( STRING , STRING ) . status ( org.springframework.web.reactive.result.view.HttpStatus ) . header ( STRING , STRING ) . build ( ) ; java.lang.String java.lang.String = STRING ; ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange = org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , java.lang.String , org.springframework.web.reactive.result.view.ViewResolver ) ; assertEquals ( org.springframework.web.reactive.result.view.HttpStatus , org.springframework.web.reactive.result.view.ServerWebExchange . getResponse ( ) . getStatusCode ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.view.ServerWebExchange . getResponse ( ) . getHeaders ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = STRING ; MethodParameter org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotNotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ; ViewResolver [] org.springframework.web.reactive.result.view.ViewResolver[] = { new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) , new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) } ; org.springframework.web.reactive.result.view.ServerWebExchange ( STRING , org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object , STRING , org.springframework.web.reactive.result.view.ViewResolver[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( null , on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ) ; void ( Mono . empty ( ) , on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , java.lang.String .class ) ) ; void ( Mono . empty ( ) , on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Mono .class , java.lang.Void .class ) ) ; void ( Completable . complete ( ) , on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( Completable .class ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.reactive.result.view.MethodParameter ) throws java.net.URISyntaxException { this . org.springframework.web.reactive.result.view.BindingContext . getModel ( ) . addAttribute ( STRING , STRING ) ; HandlerResult org.springframework.web.reactive.result.view.HandlerResult = new HandlerResult ( new java.lang.Object ( ) , java.lang.Object , org.springframework.web.reactive.result.view.MethodParameter , this . org.springframework.web.reactive.result.view.BindingContext ) ; ViewResolutionResultHandler org.springframework.web.reactive.result.view.ViewResolutionResultHandler = org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) ) ; MockServerWebExchange org.springframework.web.reactive.result.view.MockServerWebExchange = get ( STRING ) . toExchange ( ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandler . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; void ( org.springframework.web.reactive.result.view.MockServerWebExchange , STRING ) ; org.springframework.web.reactive.result.view.MockServerWebExchange = get ( STRING ) . toExchange ( ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandler . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; void ( org.springframework.web.reactive.result.view.MockServerWebExchange , STRING ) ; org.springframework.web.reactive.result.view.MockServerWebExchange = get ( STRING ) . toExchange ( ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandler . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; void ( org.springframework.web.reactive.result.view.MockServerWebExchange , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; MethodParameter org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . annotPresent ( ModelAttribute .class ) . resolveReturnType ( java.lang.String .class ) ; HandlerResult org.springframework.web.reactive.result.view.HandlerResult = new HandlerResult ( new java.lang.Object ( ) , java.lang.String , org.springframework.web.reactive.result.view.MethodParameter , this . org.springframework.web.reactive.result.view.BindingContext ) ; MockServerWebExchange org.springframework.web.reactive.result.view.MockServerWebExchange = get ( STRING ) . toExchange ( ) ; Mono < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> = org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( ) . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) ; StepVerifier . create ( org.springframework.web.reactive.result.view.Mono<java.lang.Void> ) . expectNextCount ( NUMBER ) . expectErrorMessage ( STRING ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean ( STRING ) ; MethodParameter org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean .class ) ; HandlerResult org.springframework.web.reactive.result.view.HandlerResult = new HandlerResult ( new java.lang.Object ( ) , org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean , org.springframework.web.reactive.result.view.MethodParameter , this . org.springframework.web.reactive.result.view.BindingContext ) ; MockServerWebExchange org.springframework.web.reactive.result.view.MockServerWebExchange = get ( STRING ) . accept ( APPLICATION_JSON ) . toExchange ( ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView ( STRING , APPLICATION_JSON ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( java.util.Collections . java.util.List<org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView> ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView ) , new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) ) . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( APPLICATION_JSON , org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getContentType ( ) ) ; void ( org.springframework.web.reactive.result.view.MockServerWebExchange , STRING + STRING + STRING + STRING + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean = new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean ( STRING ) ; MethodParameter org.springframework.web.reactive.result.view.MethodParameter = on ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.Handler .class ) . resolveReturnType ( org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean .class ) ; HandlerResult org.springframework.web.reactive.result.view.HandlerResult = new HandlerResult ( new java.lang.Object ( ) , org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean , org.springframework.web.reactive.result.view.MethodParameter , this . org.springframework.web.reactive.result.view.BindingContext ) ; MockServerWebExchange org.springframework.web.reactive.result.view.MockServerWebExchange = get ( STRING ) . accept ( APPLICATION_JSON ) . toExchange ( ) ; ViewResolutionResultHandler org.springframework.web.reactive.result.view.ViewResolutionResultHandler = org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestViewResolver ( STRING ) ) ; Mono < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> = org.springframework.web.reactive.result.view.ViewResolutionResultHandler . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) ; StepVerifier . create ( org.springframework.web.reactive.result.view.Mono<java.lang.Void> ) . expectNextCount ( NUMBER ) . expectError ( NotAcceptableStatusException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.view.ViewResolutionResultHandler org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( ViewResolver ... org.springframework.web.reactive.result.view.ViewResolver[] ) { return org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( java.util.Collections . java.util.List<java.lang.Object> ( ) , org.springframework.web.reactive.result.view.ViewResolver[] ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.view.ViewResolutionResultHandler org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( java.util.List<org.springframework.web.reactive.result.view.View> < View > java.util.List<org.springframework.web.reactive.result.view.View> , ViewResolver ... org.springframework.web.reactive.result.view.ViewResolver[] ) { java.util.List<org.springframework.web.reactive.result.view.ViewResolver> < ViewResolver > java.util.List<org.springframework.web.reactive.result.view.ViewResolver> = java.util.Arrays . java.util.List ( org.springframework.web.reactive.result.view.ViewResolver[] ) ; RequestedContentTypeResolver org.springframework.web.reactive.result.view.RequestedContentTypeResolver = new HeaderContentTypeResolver ( ) ; ViewResolutionResultHandler org.springframework.web.reactive.result.view.ViewResolutionResultHandler = new ViewResolutionResultHandler ( java.util.List<org.springframework.web.reactive.result.view.ViewResolver> , org.springframework.web.reactive.result.view.RequestedContentTypeResolver ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandler . setDefaultViews ( java.util.List<org.springframework.web.reactive.result.view.View> ) ; return org.springframework.web.reactive.result.view.ViewResolutionResultHandler ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.view.ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange ( java.lang.String java.lang.String , MethodParameter org.springframework.web.reactive.result.view.MethodParameter , java.lang.Object java.lang.Object , java.lang.String java.lang.String , ViewResolver ... org.springframework.web.reactive.result.view.ViewResolver[] ) throws java.net.URISyntaxException { Model org.springframework.web.reactive.result.view.Model = this . org.springframework.web.reactive.result.view.BindingContext . getModel ( ) ; org.springframework.web.reactive.result.view.Model . asMap ( ) . clear ( ) ; org.springframework.web.reactive.result.view.Model . addAttribute ( STRING , STRING ) ; HandlerResult org.springframework.web.reactive.result.view.HandlerResult = new HandlerResult ( new java.lang.Object ( ) , java.lang.Object , org.springframework.web.reactive.result.view.MethodParameter , this . org.springframework.web.reactive.result.view.BindingContext ) ; MockServerWebExchange org.springframework.web.reactive.result.view.MockServerWebExchange = get ( java.lang.String ) . toExchange ( ) ; org.springframework.web.reactive.result.view.ViewResolutionResultHandler ( org.springframework.web.reactive.result.view.ViewResolver[] ) . handleResult ( org.springframework.web.reactive.result.view.MockServerWebExchange , org.springframework.web.reactive.result.view.HandlerResult ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; void ( org.springframework.web.reactive.result.view.MockServerWebExchange , java.lang.String ) ; return org.springframework.web.reactive.result.view.MockServerWebExchange ; }  <METHOD_END>
<METHOD_START> private void void ( MockServerWebExchange org.springframework.web.reactive.result.view.MockServerWebExchange , java.lang.String java.lang.String ) { StepVerifier . create ( org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getBody ( ) ) . consumeNextWith ( buf -> assertEquals ( responseBody , DataBufferTestUtils . dumpString ( buf , UTF_8 ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String ... java.lang.String[] ) { java.util.Arrays . java.util.stream.Stream<java.lang.String> ( java.lang.String[] ) . void ( java.lang.String -> this . java.util.Map<java.lang.String,org.springframework.web.reactive.result.view.View> . put ( java.lang.String , new org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestView ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.View> < View > org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.View> ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) { View org.springframework.web.reactive.result.view.View = this . java.util.Map<java.lang.String,org.springframework.web.reactive.result.view.View> . get ( java.lang.String ) ; return Mono . justOrEmpty ( org.springframework.web.reactive.result.view.View ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.util.List<org.springframework.web.reactive.result.view.MediaType> = java.util.Collections . java.util.List ( MediaType . TEXT_HTML ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String , MediaType ... org.springframework.web.reactive.result.view.MediaType[] ) { this . java.lang.String = java.lang.String ; this . java.util.List<org.springframework.web.reactive.result.view.MediaType> = java.util.Arrays . java.util.List ( org.springframework.web.reactive.result.view.MediaType[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.reactive.result.view.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.result.view.MediaType> ( ) { return this . java.util.List<org.springframework.web.reactive.result.view.MediaType> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.view.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , MediaType org.springframework.web.reactive.result.view.MediaType , ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange ) { ServerHttpResponse org.springframework.web.reactive.result.view.ServerHttpResponse = org.springframework.web.reactive.result.view.ServerWebExchange . getResponse ( ) ; if ( org.springframework.web.reactive.result.view.MediaType != null ) { org.springframework.web.reactive.result.view.ServerHttpResponse . getHeaders ( ) . setContentType ( org.springframework.web.reactive.result.view.MediaType ) ; } java.util.Map<java.lang.String,?> = new java.util.TreeMap<java.lang.String,> <> ( java.util.Map<java.lang.String,> ) ; java.lang.String java.lang.String = this . java.lang.String + STRING + java.util.Map<java.lang.String,> . java.lang.String ( ) ; java.nio.ByteBuffer java.nio.ByteBuffer = java.nio.ByteBuffer . java.nio.ByteBuffer ( java.lang.String . byte[] ( java.nio.charset.Charset ) ) ; DataBuffer org.springframework.web.reactive.result.view.DataBuffer = new DefaultDataBufferFactory ( ) . wrap ( java.nio.ByteBuffer ) ; return org.springframework.web.reactive.result.view.ServerHttpResponse . writeWith ( Flux . just ( org.springframework.web.reactive.result.view.DataBuffer ) ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String + STRING ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Mono<java.lang.String> < java.lang.String > org.springframework.web.reactive.result.view.Mono<java.lang.String> ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ ModelAttribute ( STRING ) java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Rendering org.springframework.web.reactive.result.view.Rendering ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.Rendering> < Rendering > org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.Rendering> ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.View org.springframework.web.reactive.result.view.View ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.View> < View > org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.View> ( ) { return null ; }  <METHOD_END>
<METHOD_START> void void ( ) { }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Completable org.springframework.web.reactive.result.view.Completable ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.Model org.springframework.web.reactive.result.view.Model ( ) { return null ; }  <METHOD_END>
<METHOD_START> java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ ModelAttribute ( STRING ) java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean org.springframework.web.reactive.result.view.ViewResolutionResultHandlerTests.TestBean ( ) { return null ; }  <METHOD_END>
<METHOD_START> java.lang.Long java.lang.Long ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ ModelAttribute ( STRING ) java.lang.Long java.lang.Long ( ) { return null ; }  <METHOD_END>
