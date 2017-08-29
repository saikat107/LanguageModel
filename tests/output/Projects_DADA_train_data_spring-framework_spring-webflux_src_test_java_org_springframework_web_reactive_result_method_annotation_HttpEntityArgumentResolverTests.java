<METHOD_START> private org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver ( ) { java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> = new java.util.ArrayList<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> <> ( ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> . add ( new DecoderHttpMessageReader <> ( StringDecoder . allMimeTypes ( true ) ) ) ; return new HttpEntityArgumentResolver ( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> , new ReactiveAdapterRegistry ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( Mono .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( Single .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( io . io . io .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( Maybe .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.util.concurrent.CompletableFuture .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( Flux .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( Observable .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( io . io . io .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ( Flowable .class , java.lang.String .class ) ) ) ; void ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( forClassWithGenerics ( RequestEntity .class , java.lang.String .class ) ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { assertTrue ( this . org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver . supportsParameter ( org.springframework.web.reactive.result.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertFalse ( this . org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver . supportsParameter ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( Mono .class , java.lang.String .class ) ) ) ; assertFalse ( this . org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver . supportsParameter ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( java.lang.String .class ) ) ) ; try { this . org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver . supportsParameter ( this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( Mono .class , org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.lang.String .class ) ) ) ; fail ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertTrue ( STRING + java.lang.IllegalStateException . java.lang.String ( ) , java.lang.IllegalStateException . java.lang.String ( ) . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.lang.String .class ) ; HttpEntity < java.lang.Object > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.Object> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertNull ( org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.Object> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Mono .class , java.lang.String .class ) ; HttpEntity < Mono < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String>> . getBody ( ) ) . expectNextCount ( NUMBER ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Flux .class , java.lang.String .class ) ; HttpEntity < Flux < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flux<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flux<java.lang.String>> . getBody ( ) ) . expectNextCount ( NUMBER ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Single .class , java.lang.String .class ) ; HttpEntity < Single < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Single<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( RxReactiveStreams . toPublisher ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Single<java.lang.String>> . getBody ( ) ) ) . expectNextCount ( NUMBER ) . expectError ( ServerWebInputException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( io . io . io .class , java.lang.String .class ) ; HttpEntity < io . io . io < java.lang.String > > entity = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( entity . getBody ( ) . toFlowable ( ) ) . expectNextCount ( NUMBER ) . expectError ( ServerWebInputException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Maybe .class , java.lang.String .class ) ; HttpEntity < Maybe < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Maybe<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Maybe<java.lang.String>> . getBody ( ) . toFlowable ( ) ) . expectNextCount ( NUMBER ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Observable .class , java.lang.String .class ) ; HttpEntity < Observable < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Observable<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( RxReactiveStreams . toPublisher ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Observable<java.lang.String>> . getBody ( ) ) ) . expectNextCount ( NUMBER ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( io . io . io .class , java.lang.String .class ) ; HttpEntity < io . io . io < java.lang.String > > entity = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( entity . getBody ( ) . toFlowable ( BackpressureStrategy . BUFFER ) ) . expectNextCount ( NUMBER ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Flowable .class , java.lang.String .class ) ; HttpEntity < Flowable < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flowable<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flowable<java.lang.String>> . getBody ( ) ) . expectNextCount ( NUMBER ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.util.concurrent.CompletableFuture .class , java.lang.String .class ) ; HttpEntity < java.util.concurrent.CompletableFuture<java.lang.String> < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.util.concurrent.CompletableFuture<java.lang.String>> = org.springframework.web.reactive.result.method.annotation.HttpEntity ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; org.springframework.web.reactive.result.method.annotation.HttpEntity<java.util.concurrent.CompletableFuture<java.lang.String>> . getBody ( ) . whenComplete ( ( body , ex ) -> { assertNull ( body ) ; assertNull ( ex ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.lang.String .class ) ; HttpEntity < java.lang.String > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> . getHeaders ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Mono .class , java.lang.String .class ) ; HttpEntity < Mono < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String>> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String>> . getHeaders ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String>> . getBody ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Single .class , java.lang.String .class ) ; HttpEntity < Single < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Single<java.lang.String>> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Single<java.lang.String>> . getHeaders ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Single<java.lang.String>> . getBody ( ) . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( io . io . io .class , java.lang.String .class ) ; HttpEntity < io . io . io < java.lang.String > > httpEntity = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , httpEntity . getHeaders ( ) ) ; assertEquals ( STRING , httpEntity . getBody ( ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Maybe .class , java.lang.String .class ) ; HttpEntity < Maybe < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Maybe<java.lang.String>> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Maybe<java.lang.String>> . getHeaders ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Maybe<java.lang.String>> . getBody ( ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.util.concurrent.CompletableFuture .class , java.lang.String .class ) ; HttpEntity < java.util.concurrent.CompletableFuture<java.lang.String> < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.util.concurrent.CompletableFuture<java.lang.String>> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<java.util.concurrent.CompletableFuture<java.lang.String>> . getHeaders ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.HttpEntity<java.util.concurrent.CompletableFuture<java.lang.String>> . getBody ( ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = org.springframework.web.reactive.result.method.annotation.ResolvableType ( Flux .class , java.lang.String .class ) ; HttpEntity < Flux < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flux<java.lang.String>> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flux<java.lang.String>> . getHeaders ( ) ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flux<java.lang.String>> . getBody ( ) ) . expectNext ( STRING ) . expectNext ( STRING ) . expectNext ( STRING ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( RequestEntity .class , java.lang.String .class ) ; RequestEntity < java.lang.String > org.springframework.web.reactive.result.method.annotation.RequestEntity<java.lang.String> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange , org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getMethod ( ) , org.springframework.web.reactive.result.method.annotation.RequestEntity<java.lang.String> . getMethod ( ) ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getURI ( ) , org.springframework.web.reactive.result.method.annotation.RequestEntity<java.lang.String> . getUrl ( ) ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.RequestEntity<java.lang.String> . getHeaders ( ) ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.RequestEntity<java.lang.String> . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.method.annotation.MockServerWebExchange org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ( java.lang.String java.lang.String ) { return post ( STRING ) . header ( STRING , STRING ) . contentType ( TEXT_PLAIN ) . body ( java.lang.String ) . toExchange ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.method.annotation.ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { return ResolvableType . forClassWithGenerics ( HttpEntity .class , ObjectUtils . isEmpty ( java.lang.Class<?>[] ) ? ResolvableType . forClass ( java.lang.Class<> ) : ResolvableType . forClassWithGenerics ( java.lang.Class<> , java.lang.Class<?>[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private < T > T T ( ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange , ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType ) { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) ; java.lang.Object java.lang.Object = org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertNotNull ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.web.reactive.result.method.annotation.MethodParameter . getParameterType ( ) . isAssignableFrom ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; return ( T ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private < T > org.springframework.web.reactive.result.method.annotation.HttpEntity<T> < T > org.springframework.web.reactive.result.method.annotation.HttpEntity<T> ( ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType ) { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = post ( STRING ) . toExchange ( ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.HttpEntityArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) ; HttpEntity < java.lang.String > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> = ( HttpEntity < java.lang.String > ) org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getRequest ( ) . getHeaders ( ) , org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> . getHeaders ( ) ) ; return ( HttpEntity < T > ) org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) void handle ( java.lang.String java.lang.String , Mono < java.lang.String > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String> , HttpEntity < java.lang.String > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String> , HttpEntity < Mono < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Mono<java.lang.String>> , HttpEntity < Flux < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flux<java.lang.String>> , HttpEntity < Single < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Single<java.lang.String>> , HttpEntity < io . io . io < java.lang.String > > rxJava2SingleBody , HttpEntity < Maybe < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Maybe<java.lang.String>> , HttpEntity < Observable < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Observable<java.lang.String>> , HttpEntity < io . io . io < java.lang.String > > rxJava2ObservableBody , HttpEntity < Flowable < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<org.springframework.web.reactive.result.method.annotation.Flowable<java.lang.String>> , HttpEntity < java.util.concurrent.CompletableFuture<java.lang.String> < java.lang.String > > org.springframework.web.reactive.result.method.annotation.HttpEntity<java.util.concurrent.CompletableFuture<java.lang.String>> , RequestEntity < java.lang.String > org.springframework.web.reactive.result.method.annotation.RequestEntity<java.lang.String> , Mono < HttpEntity < java.lang.String > > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.HttpEntity<java.lang.String>> ) {}  <METHOD_END>
