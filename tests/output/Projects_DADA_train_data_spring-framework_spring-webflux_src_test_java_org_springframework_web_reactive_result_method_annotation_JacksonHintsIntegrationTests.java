<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.result.method.annotation.ApplicationContext org.springframework.web.reactive.result.method.annotation.ApplicationContext ( ) { AnnotationConfigApplicationContext org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext . register ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.WebConfig .class ) ; org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext . refresh ( ) ; return org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performGet ( STRING , MediaType . APPLICATION_JSON_UTF8 , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performGet ( STRING , MediaType . APPLICATION_JSON_UTF8 , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performGet ( STRING , MediaType . APPLICATION_JSON_UTF8 , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performPost ( STRING , MediaType . APPLICATION_JSON , new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) , MediaType . APPLICATION_JSON_UTF8 , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , performPost ( STRING , MediaType . APPLICATION_JSON , new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) , MediaType . APPLICATION_JSON_UTF8 , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING + STRING ; java.util.List<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > java.util.List<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> = java.util.Arrays . java.util.List<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ( new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) ) ; assertEquals ( java.lang.String , performPost ( STRING , MediaType . APPLICATION_JSON , java.util.List<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> , MediaType . APPLICATION_JSON_UTF8 , java.lang.String .class ) . getBody ( ) ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) @ JsonView ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.MyJacksonView1 .class ) public org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( ) { return new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) @ JsonView ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.MyJacksonView1 .class ) public org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ( ) { return Mono . just ( new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) @ JsonView ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.MyJacksonView1 .class ) public org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ( ) { return Flux . just ( new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) , new org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( STRING , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ PostMapping ( STRING ) public org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ( @ JsonView ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.MyJacksonView1 .class ) @ RequestBody org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ) { return org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean ; }  <METHOD_END>
<METHOD_START> @ PostMapping ( STRING ) public org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ( @ JsonView ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.MyJacksonView1 .class ) @ RequestBody Mono < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ) { return org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ; }  <METHOD_END>
<METHOD_START> @ PostMapping ( STRING ) public org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ( @ JsonView ( org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.MyJacksonView1 .class ) @ RequestBody Flux < org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean > org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ) { return org.springframework.web.reactive.result.method.annotation.Flux<org.springframework.web.reactive.result.method.annotation.JacksonHintsIntegrationTests.JacksonViewBean> ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
