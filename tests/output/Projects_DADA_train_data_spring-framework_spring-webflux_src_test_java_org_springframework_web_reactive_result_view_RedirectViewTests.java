<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.reactive.result.view.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . contextPath ( STRING ) . toExchange ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( null ) ; org.springframework.web.reactive.result.view.RedirectView . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( java.lang.String ) ; org.springframework.web.reactive.result.view.RedirectView . render ( new java.util.HashMap <> ( ) , MediaType . TEXT_HTML , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( HttpStatus . SEE_OTHER , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getStatusCode ( ) ) ; assertEquals ( java.net.URI . java.net.URI ( java.lang.String ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( java.lang.String , HttpStatus . FOUND ) ; org.springframework.web.reactive.result.view.RedirectView . render ( new java.util.HashMap <> ( ) , MediaType . TEXT_HTML , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( HttpStatus . FOUND , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getStatusCode ( ) ) ; assertEquals ( java.net.URI . java.net.URI ( java.lang.String ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( java.lang.String ) ; org.springframework.web.reactive.result.view.RedirectView . render ( new java.util.HashMap <> ( ) , MediaType . TEXT_HTML , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( java.net.URI . java.net.URI ( STRING ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( java.lang.String ) ; org.springframework.web.reactive.result.view.RedirectView . render ( new java.util.HashMap <> ( ) , MediaType . TEXT_HTML , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( java.net.URI . java.net.URI ( STRING ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( STRING ) ; assertFalse ( org.springframework.web.reactive.result.view.RedirectView . isRemoteHost ( STRING ) ) ; assertFalse ( org.springframework.web.reactive.result.view.RedirectView . isRemoteHost ( STRING ) ) ; assertFalse ( org.springframework.web.reactive.result.view.RedirectView . isRemoteHost ( STRING ) ) ; org.springframework.web.reactive.result.view.RedirectView . setHosts ( STRING ) ; assertFalse ( org.springframework.web.reactive.result.view.RedirectView . isRemoteHost ( STRING ) ) ; assertFalse ( org.springframework.web.reactive.result.view.RedirectView . isRemoteHost ( STRING ) ) ; assertTrue ( org.springframework.web.reactive.result.view.RedirectView . isRemoteHost ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( java.lang.String ) ; org.springframework.web.reactive.result.view.RedirectView . render ( java.util.Map<java.lang.String,java.lang.String> , MediaType . TEXT_HTML , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( java.net.URI . java.net.URI ( STRING ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; this . org.springframework.web.reactive.result.view.MockServerWebExchange . getAttributes ( ) . put ( HandlerMapping . URI_TEMPLATE_VARIABLES_ATTRIBUTE , java.util.Map<java.lang.String,java.lang.String> ) ; RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( java.lang.String ) ; org.springframework.web.reactive.result.view.RedirectView . render ( new java.util.HashMap <> ( ) , MediaType . TEXT_HTML , org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( java.net.URI . java.net.URI ( STRING ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.reactive.result.view.RedirectView = new RedirectView ( STRING ) ; org.springframework.web.reactive.result.view.RedirectView . setPropagateQuery ( true ) ; this . org.springframework.web.reactive.result.view.MockServerWebExchange = MockServerHttpRequest . get ( STRING ) . toExchange ( ) ; org.springframework.web.reactive.result.view.RedirectView . render ( new java.util.HashMap <> ( ) , MediaType . TEXT_HTML , this . org.springframework.web.reactive.result.view.MockServerWebExchange ) . block ( ) ; assertEquals ( HttpStatus . SEE_OTHER , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getStatusCode ( ) ) ; assertEquals ( java.net.URI . java.net.URI ( STRING ) , this . org.springframework.web.reactive.result.view.MockServerWebExchange . getResponse ( ) . getHeaders ( ) . getLocation ( ) ) ; }  <METHOD_END>