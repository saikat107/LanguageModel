<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> ) { java.lang.Object java.lang.Object = this . java.lang.Object ( org.springframework.integration.handler.Message<> ) ; if ( this . boolean || ! this . hasAdviceChain ( ) ) { this . postProcess ( org.springframework.integration.handler.Message<> , java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> ) { java.lang.Object java.lang.Object = super. doInvokeAdvisedRequestHandler ( org.springframework.integration.handler.Message<> ) ; if ( ! this . boolean ) { this . postProcess ( org.springframework.integration.handler.Message<> , java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> );  <METHOD_END>