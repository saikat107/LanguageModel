<METHOD_START> private org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler ( org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?> < ? > ... org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>[] ) { java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> < HttpMessageWriter < ? > > java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> ; if ( ObjectUtils . isEmpty ( org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>[] ) ) { java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> = new java.util.ArrayList <> ( ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> . add ( new EncoderHttpMessageWriter <> ( new ByteBufferEncoder ( ) ) ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> . add ( new EncoderHttpMessageWriter <> ( CharSequenceEncoder . allMimeTypes ( ) ) ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> . add ( new ResourceHttpMessageWriter ( ) ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> . add ( new EncoderHttpMessageWriter <> ( new Jaxb2XmlEncoder ( ) ) ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> . add ( new EncoderHttpMessageWriter <> ( new Jackson2JsonEncoder ( ) ) ) ; } else { java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> = java.util.Arrays . java.util.List ( org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>[] ) ; } RequestedContentTypeResolver org.springframework.web.reactive.result.method.annotation.RequestedContentTypeResolver = new RequestedContentTypeResolverBuilder ( ) . build ( ) ; return new AbstractMessageWriterResultHandler ( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?>> , org.springframework.web.reactive.result.method.annotation.RequestedContentTypeResolver ) {} ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.web.reactive.result.method.annotation.Resource = new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests> ( ) ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( Resource .class ) ; this . org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler . writeBody ( org.springframework.web.reactive.result.method.annotation.Resource , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( STRING , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getFirst ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getAttributes ( ) . put ( PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE , java.util.Collections . java.util.Set ( APPLICATION_JSON ) ) ; java.lang.String java.lang.String = STRING ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( java.lang.String .class ) ; this . org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler . writeBody ( java.lang.String , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( APPLICATION_JSON_UTF8 , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getContentType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( null , on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( void .class ) ) ; void ( Mono . empty ( ) , on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( Mono .class , java.lang.Void .class ) ) ; void ( Flux . empty ( ) , on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( Flux .class , java.lang.Void .class ) ) ; void ( Completable . complete ( ) , on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( Completable .class ) ) ; void ( Observable . empty ( ) , on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( Observable .class , java.lang.Void .class ) ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( io . io . io .class ) ; void ( io . reactivex . Completable . complete ( ) , org.springframework.web.reactive.result.method.annotation.MethodParameter ) ; org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( io . io . io .class , java.lang.Void .class ) ; void ( io . reactivex . Observable . empty ( ) , org.springframework.web.reactive.result.method.annotation.MethodParameter ) ; org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( Flowable .class , java.lang.Void .class ) ; void ( Flowable . empty ( ) , org.springframework.web.reactive.result.method.annotation.MethodParameter ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { this . org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler . writeBody ( java.lang.Object , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertNull ( this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . get ( STRING ) ) ; StepVerifier . create ( this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getBody ( ) ) . expectErrorMatches ( ex -> ex . getMessage ( ) . startsWith ( STRING ) ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( java.io.OutputStream .class ) ; HttpMessageWriter < ? > org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<?> = new EncoderHttpMessageWriter <> ( new ByteBufferEncoder ( ) ) ; Mono < java.lang.Void > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Void> = org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler ( org.springframework.web.reactive.result.method.annotation.HttpMessageWriter<> ) . writeBody ( java.io.ByteArrayOutputStream , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Void> ) . expectError ( java.lang.IllegalStateException .class ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( java.util.List .class , org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass .class ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass> < org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass > java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass> = java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass> ( new org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Foo ( STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Bar ( STRING ) ) ; this . org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler . writeBody ( java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass> , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( APPLICATION_JSON_UTF8 , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getContentType ( ) ) ; void ( STRING + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean = new org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean ( NUMBER , STRING ) ; MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable .class ) ; this . org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler . writeBody ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( APPLICATION_JSON_UTF8 , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getContentType ( ) ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = on ( org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.TestController .class ) . resolveReturnType ( java.util.List .class , org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable .class ) ; java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean> < org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean > java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean> = java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean> ( new org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean ( NUMBER , STRING ) , new org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean ( NUMBER , STRING ) ) ; this . org.springframework.web.reactive.result.method.annotation.AbstractMessageWriterResultHandler . writeBody ( java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.SimpleBean> , org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( APPLICATION_JSON_UTF8 , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getContentType ( ) ) ; void ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { StepVerifier . create ( this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getResponse ( ) . getBody ( ) ) . consumeNextWith ( buf -> assertEquals ( responseBody , dumpString ( buf , StandardCharsets . UTF_8 ) ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) java.lang.Long java.lang.Long ( )  <METHOD_END>
<METHOD_START> void ( java.lang.Long java.lang.Long , java.lang.String java.lang.String ) { this . java.lang.Long = java.lang.Long ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Long java.lang.Long ( ) { return java.lang.Long ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.Resource org.springframework.web.reactive.result.method.annotation.Resource ( ) { return null ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> void void ( ) { }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Void> ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.Completable org.springframework.web.reactive.result.method.annotation.Completable ( ) { return null ; }  <METHOD_END>
<METHOD_START> io . io . io.reactivex.Completable io.reactivex.Completable ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.Flux<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.method.annotation.Flux<java.lang.Void> ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.Observable<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.method.annotation.Observable<java.lang.Void> ( ) { return null ; }  <METHOD_END>
<METHOD_START> io . io . io < java.lang.Void > rxJava2ObservableVoid ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.Flowable<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.method.annotation.Flowable<java.lang.Void> ( ) { return null ; }  <METHOD_END>
<METHOD_START> java.io.OutputStream java.io.OutputStream ( ) { return null ; }  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass> < org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass > java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.ParentClass> ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable ( ) { return null ; }  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable> < org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable > java.util.List<org.springframework.web.reactive.result.method.annotation.MessageWriterResultHandlerTests.Identifiable> ( ) { return null ; }  <METHOD_END>
