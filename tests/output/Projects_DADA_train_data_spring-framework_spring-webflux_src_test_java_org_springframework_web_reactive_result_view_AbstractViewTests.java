<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.reactive.result.view.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.web.reactive.result.view.TestBean = new TestBean ( STRING ) ; TestBean org.springframework.web.reactive.result.view.TestBean = new TestBean ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , Mono . just ( org.springframework.web.reactive.result.view.TestBean ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , Flux . just ( org.springframework.web.reactive.result.view.TestBean , org.springframework.web.reactive.result.view.TestBean ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , Single . just ( org.springframework.web.reactive.result.view.TestBean ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , Observable . just ( org.springframework.web.reactive.result.view.TestBean , org.springframework.web.reactive.result.view.TestBean ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , Mono . empty ( ) ) ; org.springframework.web.reactive.result.view.AbstractViewTests.TestView org.springframework.web.reactive.result.view.AbstractViewTests.TestView = new org.springframework.web.reactive.result.view.AbstractViewTests.TestView ( ) ; StepVerifier . create ( org.springframework.web.reactive.result.view.AbstractViewTests.TestView . render ( java.util.Map<java.lang.String,java.lang.Object> , null , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) ) . verifyComplete ( ) ; assertEquals ( org.springframework.web.reactive.result.view.TestBean , org.springframework.web.reactive.result.view.AbstractViewTests.TestView . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertArrayEquals ( new TestBean [] { org.springframework.web.reactive.result.view.TestBean , org.springframework.web.reactive.result.view.TestBean } , ( ( java.util.List<org.springframework.web.reactive.result.view.TestBean> < TestBean > ) org.springframework.web.reactive.result.view.AbstractViewTests.TestView . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object[] ( ) ) ; assertEquals ( org.springframework.web.reactive.result.view.TestBean , org.springframework.web.reactive.result.view.AbstractViewTests.TestView . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertArrayEquals ( new TestBean [] { org.springframework.web.reactive.result.view.TestBean , org.springframework.web.reactive.result.view.TestBean } , ( ( java.util.List<org.springframework.web.reactive.result.view.TestBean> < TestBean > ) org.springframework.web.reactive.result.view.AbstractViewTests.TestView . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object[] ( ) ) ; assertNull ( org.springframework.web.reactive.result.view.AbstractViewTests.TestView . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.result.view.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , MediaType org.springframework.web.reactive.result.view.MediaType , ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange ) { this . java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ; return Mono . empty ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this . java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
