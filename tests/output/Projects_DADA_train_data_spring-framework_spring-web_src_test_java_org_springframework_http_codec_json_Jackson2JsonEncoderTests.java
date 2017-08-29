<METHOD_START> @ Test public void void ( ) { ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( Pojo .class ) ; assertTrue ( this . org.springframework.http.codec.json.Jackson2JsonEncoder . canEncode ( org.springframework.http.codec.json.ResolvableType , APPLICATION_JSON ) ) ; assertTrue ( this . org.springframework.http.codec.json.Jackson2JsonEncoder . canEncode ( org.springframework.http.codec.json.ResolvableType , null ) ) ; assertFalse ( this . org.springframework.http.codec.json.Jackson2JsonEncoder . canEncode ( org.springframework.http.codec.json.ResolvableType , APPLICATION_XML ) ) ; ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( ServerSentEvent .class ) ; assertFalse ( this . org.springframework.http.codec.json.Jackson2JsonEncoder . canEncode ( org.springframework.http.codec.json.ResolvableType , APPLICATION_JSON ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Flux < Pojo > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.Pojo> = Flux . just ( new Pojo ( STRING , STRING ) , new Pojo ( STRING , STRING ) , new Pojo ( STRING , STRING ) ) ; ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( Pojo .class ) ; Flux < DataBuffer > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> = this . org.springframework.http.codec.json.Jackson2JsonEncoder . encode ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.Pojo> , this . bufferFactory , org.springframework.http.codec.json.ResolvableType , null , java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; StepVerifier . create ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> ) . consumeNextWith ( stringConsumer ( STRING ) ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Flux < org.springframework.http.codec.json.Jackson2JsonEncoderTests.ParentClass > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.Jackson2JsonEncoderTests.ParentClass> = Flux . just ( new org.springframework.http.codec.json.Jackson2JsonEncoderTests.Foo ( ) , new org.springframework.http.codec.json.Jackson2JsonEncoderTests.Bar ( ) ) ; ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( org.springframework.http.codec.json.Jackson2JsonEncoderTests.ParentClass .class ) ; Flux < DataBuffer > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> = this . org.springframework.http.codec.json.Jackson2JsonEncoder . encode ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.Jackson2JsonEncoderTests.ParentClass> , this . bufferFactory , org.springframework.http.codec.json.ResolvableType , null , java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; StepVerifier . create ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> ) . consumeNextWith ( stringConsumer ( STRING ) ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Flux < Pojo > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.Pojo> = Flux . just ( new Pojo ( STRING , STRING ) , new Pojo ( STRING , STRING ) , new Pojo ( STRING , STRING ) ) ; ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( Pojo .class ) ; Flux < DataBuffer > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> = this . org.springframework.http.codec.json.Jackson2JsonEncoder . encode ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.Pojo> , this . bufferFactory , org.springframework.http.codec.json.ResolvableType , APPLICATION_STREAM_JSON , java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; StepVerifier . create ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> ) . consumeNextWith ( stringConsumer ( STRING ) ) . consumeNextWith ( stringConsumer ( STRING ) ) . consumeNextWith ( stringConsumer ( STRING ) ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JacksonViewBean org.springframework.http.codec.json.JacksonViewBean = new JacksonViewBean ( ) ; org.springframework.http.codec.json.JacksonViewBean . setWithView1 ( STRING ) ; org.springframework.http.codec.json.JacksonViewBean . setWithView2 ( STRING ) ; org.springframework.http.codec.json.JacksonViewBean . setWithoutView ( STRING ) ; ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( JacksonViewBean .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map ( JSON_VIEW_HINT , MyJacksonView1 .class ) ; Flux < DataBuffer > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> = this . org.springframework.http.codec.json.Jackson2JsonEncoder . encode ( Mono . just ( org.springframework.http.codec.json.JacksonViewBean ) , this . bufferFactory , org.springframework.http.codec.json.ResolvableType , null , java.util.Map<java.lang.String,java.lang.Object> ) ; StepVerifier . create ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> ) . consumeNextWith ( stringConsumer ( STRING ) ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JacksonViewBean org.springframework.http.codec.json.JacksonViewBean = new JacksonViewBean ( ) ; org.springframework.http.codec.json.JacksonViewBean . setWithView1 ( STRING ) ; org.springframework.http.codec.json.JacksonViewBean . setWithView2 ( STRING ) ; org.springframework.http.codec.json.JacksonViewBean . setWithoutView ( STRING ) ; ResolvableType org.springframework.http.codec.json.ResolvableType = ResolvableType . forClass ( JacksonViewBean .class ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map ( JSON_VIEW_HINT , MyJacksonView3 .class ) ; Flux < DataBuffer > org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> = this . org.springframework.http.codec.json.Jackson2JsonEncoder . encode ( Mono . just ( org.springframework.http.codec.json.JacksonViewBean ) , this . bufferFactory , org.springframework.http.codec.json.ResolvableType , null , java.util.Map<java.lang.String,java.lang.Object> ) ; StepVerifier . create ( org.springframework.http.codec.json.Flux<org.springframework.http.codec.json.DataBuffer> ) . consumeNextWith ( stringConsumer ( STRING ) ) . verifyComplete ( ) ; }  <METHOD_END>