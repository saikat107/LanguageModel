<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; MockServerHttpResponse org.springframework.web.reactive.result.view.script.MockServerHttpResponse = org.springframework.web.reactive.result.view.script.MockServerHttpResponse ( STRING , java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.reactive.result.view.script.NashornScriptTemplateTests.ScriptTemplatingConfiguration .class ) ; assertEquals ( STRING , org.springframework.web.reactive.result.view.script.MockServerHttpResponse . getBodyAsString ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockServerHttpResponse org.springframework.web.reactive.result.view.script.MockServerHttpResponse = org.springframework.web.reactive.result.view.script.MockServerHttpResponse ( STRING , null , org.springframework.web.reactive.result.view.script.NashornScriptTemplateTests.ScriptTemplatingWithUrlConfiguration .class ) ; assertEquals ( STRING , org.springframework.web.reactive.result.view.script.MockServerHttpResponse . getBodyAsString ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.view.script.MockServerHttpResponse org.springframework.web.reactive.result.view.script.MockServerHttpResponse ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.Class<?> < ? > java.lang.Class<?> ) throws java.lang.Exception { ScriptTemplateView org.springframework.web.reactive.result.view.script.ScriptTemplateView = org.springframework.web.reactive.result.view.script.ScriptTemplateView ( java.lang.String , java.lang.Class<> ) ; MockServerWebExchange org.springframework.web.reactive.result.view.script.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateView . renderInternal ( java.util.Map<java.lang.String,java.lang.Object> , MediaType . TEXT_HTML , org.springframework.web.reactive.result.view.script.MockServerWebExchange ) . block ( ) ; return org.springframework.web.reactive.result.view.script.MockServerWebExchange . getResponse ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.view.script.ScriptTemplateView org.springframework.web.reactive.result.view.script.ScriptTemplateView ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) throws java.lang.Exception { AnnotationConfigApplicationContext org.springframework.web.reactive.result.view.script.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.web.reactive.result.view.script.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; org.springframework.web.reactive.result.view.script.AnnotationConfigApplicationContext . refresh ( ) ; ScriptTemplateView org.springframework.web.reactive.result.view.script.ScriptTemplateView = new ScriptTemplateView ( ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateView . setApplicationContext ( org.springframework.web.reactive.result.view.script.AnnotationConfigApplicationContext ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateView . setUrl ( java.lang.String ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateView . afterPropertiesSet ( ) ; return org.springframework.web.reactive.result.view.script.ScriptTemplateView ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer ( ) { ScriptTemplateConfigurer org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer = new ScriptTemplateConfigurer ( ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer . setEngineName ( STRING ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer . setScripts ( STRING ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer . setRenderFunction ( STRING ) ; return org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer ( ) { ScriptTemplateConfigurer org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer = new ScriptTemplateConfigurer ( ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer . setEngineName ( STRING ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer . setScripts ( STRING ) ; org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer . setRenderFunction ( STRING ) ; return org.springframework.web.reactive.result.view.script.ScriptTemplateConfigurer ; }  <METHOD_END>