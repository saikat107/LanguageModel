<METHOD_START> @ Before public void void ( ) java.lang.Exception { ConfigurableWebBindingInitializer org.springframework.web.reactive.result.method.annotation.ConfigurableWebBindingInitializer = new ConfigurableWebBindingInitializer ( ) ; org.springframework.web.reactive.result.method.annotation.ConfigurableWebBindingInitializer . setValidator ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBeanValidator ( ) ) ; this . org.springframework.web.reactive.result.method.annotation.BindingContext = new BindingContext ( org.springframework.web.reactive.result.method.annotation.ConfigurableWebBindingInitializer ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = post ( STRING ) . body ( STRING ) . toExchange ( ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Mono .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.AbstractMessageReaderArgumentResolver . readBody ( org.springframework.web.reactive.result.method.annotation.MethodParameter , true , this . org.springframework.web.reactive.result.method.annotation.BindingContext , org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> ) . expectError ( UnsupportedMediaTypeStatusException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = post ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) . toExchange ( ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Mono .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> = ( Mono < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > ) this . org.springframework.web.reactive.result.method.annotation.AbstractMessageReaderArgumentResolver . readBody ( org.springframework.web.reactive.result.method.annotation.MethodParameter , true , this . org.springframework.web.reactive.result.method.annotation.BindingContext , org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) . block ( ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ) . expectError ( ServerWebInputException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Mono .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Flux .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Flux < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) , org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> . collectList ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Single .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Single < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Single<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , org.springframework.web.reactive.result.method.annotation.Single<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( io . io . io .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; io . io . io < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > single = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , single . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Maybe .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Maybe < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Maybe<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , org.springframework.web.reactive.result.method.annotation.Maybe<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Observable .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Observable < ? > org.springframework.web.reactive.result.method.annotation.Observable<?> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) , org.springframework.web.reactive.result.method.annotation.Observable<> . toList ( ) . toBlocking ( ) . first ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( io . io . io .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; io . io . io < ? > observable = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) , observable . toList ( ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Flowable .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Flowable < ? > org.springframework.web.reactive.result.method.annotation.Flowable<?> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) , org.springframework.web.reactive.result.method.annotation.Flowable<> . toList ( ) . blockingGet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( java.util.concurrent.CompletableFuture .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; java.util.concurrent.CompletableFuture<?> < ? > java.util.concurrent.CompletableFuture<?> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , java.util.concurrent.CompletableFuture<> . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( java.util.Map .class , java.lang.String .class , java.lang.String .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( java.util.Map<java.lang.String,java.lang.String> , java.util.Map<java.lang.String,java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( java.util.List .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; java.util.List<?> < ? > java.util.List<?> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) , java.util.List<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Mono .class , forClassWithGenerics ( java.util.List .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < ? > org.springframework.web.reactive.result.method.annotation.Mono<?> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; java.util.List<?> < ? > java.util.List<?> = ( java.util.List<?> < ? > ) org.springframework.web.reactive.result.method.annotation.Mono<> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) , java.util.List<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean [] .class ) ; org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean [] org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean[] = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; assertArrayEquals ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean [] { new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) } , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean[] ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Mono .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Mono < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ) . expectNextCount ( NUMBER ) . expectError ( ServerWebInputException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; ResolvableType org.springframework.web.reactive.result.method.annotation.ResolvableType = forClassWithGenerics ( Flux .class , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = this . org.springframework.web.reactive.result.method.annotation.ResolvableMethod . arg ( org.springframework.web.reactive.result.method.annotation.ResolvableType ) ; Flux < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> ) . expectNext ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ( STRING , STRING ) ) . expectError ( ServerWebInputException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.AbstractParameterizedController .class . java.lang.reflect.Method ( STRING , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.Identifiable .class ) ; HandlerMethod org.springframework.web.reactive.result.method.annotation.HandlerMethod = new HandlerMethod ( new org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.ConcreteParameterizedController ( ) , java.lang.reflect.Method ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.HandlerMethod . getMethodParameters ( ) [ NUMBER ] ; org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.SimpleBean org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.SimpleBean = java.lang.Object ( org.springframework.web.reactive.result.method.annotation.MethodParameter , STRING ) ; assertEquals ( STRING , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.SimpleBean . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private < T > T T ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter , java.lang.String java.lang.String ) { ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange = post ( STRING ) . contentType ( MediaType . APPLICATION_JSON ) . body ( java.lang.String ) . toExchange ( ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.AbstractMessageReaderArgumentResolver . readBody ( org.springframework.web.reactive.result.method.annotation.MethodParameter , true , this . org.springframework.web.reactive.result.method.annotation.BindingContext , org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) ; java.lang.Object java.lang.Object = org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertNotNull ( java.lang.Object ) ; assertTrue ( STRING + java.lang.Object , org.springframework.web.reactive.result.method.annotation.MethodParameter . getParameterType ( ) . isAssignableFrom ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; return ( T ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.web.reactive.result.method.annotation.AbstractMessageReaderArgumentResolver org.springframework.web.reactive.result.method.annotation.AbstractMessageReaderArgumentResolver ( org.springframework.web.reactive.result.method.annotation.Decoder<?> < ? > ... org.springframework.web.reactive.result.method.annotation.Decoder<?>[] ) { java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> = new java.util.ArrayList<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> <> ( ) ; java.util.Arrays . java.util.List ( org.springframework.web.reactive.result.method.annotation.Decoder<?>[] ) . forEach ( decoder -> readers . add ( new DecoderHttpMessageReader <> ( decoder ) ) ) ; return new AbstractMessageReaderArgumentResolver ( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> ) { @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { return false ; } @ java.lang.Override public org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter , BindingContext org.springframework.web.reactive.result.method.annotation.BindingContext , ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) { return null ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter , BindingContext org.springframework.web.reactive.result.method.annotation.BindingContext , ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void handle ( @ Validated Mono < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , @ Validated Flux < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , Single < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Single<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , io . io . io < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > rxJava2SingleTestBean , Maybe < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Maybe<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , Observable < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Observable<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , io . io . io < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > rxJava2ObservableTestBean , Flowable < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > org.springframework.web.reactive.result.method.annotation.Flowable<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , java.util.concurrent.CompletableFuture<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > java.util.concurrent.CompletableFuture<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean , java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> , java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , Mono < java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > > org.springframework.web.reactive.result.method.annotation.Mono<java.util.List<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean>> , java.util.Set<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> < org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean > java.util.Set<org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean> , org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean [] org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean[] ) {	}  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( java.lang.Object instanceof org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ) { org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean = ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ) java.lang.Object ; return this . java.lang.String . boolean ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean . java.lang.String ) && this . java.lang.String . boolean ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean . java.lang.String ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER * java.lang.String . int ( ) + java.lang.String . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String + STRING + STRING + this . java.lang.String + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<> . boolean ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Errors org.springframework.web.reactive.result.method.annotation.Errors ) { org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean = ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean ) java.lang.Object ; if ( org.springframework.web.reactive.result.method.annotation.MessageReaderArgumentResolverTests.TestBean . java.lang.String ( ) == null ) { org.springframework.web.reactive.result.method.annotation.Errors . rejectValue ( STRING , STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( DTO DTO ) {}  <METHOD_END>
<METHOD_START> java.lang.Long java.lang.Long ( )  <METHOD_END>
<METHOD_START> void void ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Long java.lang.Long ( ) { return java.lang.Long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
