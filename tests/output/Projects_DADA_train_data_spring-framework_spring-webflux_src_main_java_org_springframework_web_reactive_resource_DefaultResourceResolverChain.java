<METHOD_START> public void ( java.util.List<? extends org.springframework.web.reactive.resource.ResourceResolver> < ? extends ResourceResolver > java.util.List<? extends org.springframework.web.reactive.resource.ResourceResolver> ) { if ( java.util.List<> != null ) { this . java.util.List<org.springframework.web.reactive.resource.ResourceResolver> . addAll ( java.util.List<> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.resource.Mono<org.springframework.web.reactive.resource.Resource> < Resource > org.springframework.web.reactive.resource.Mono<org.springframework.web.reactive.resource.Resource> ( ServerWebExchange org.springframework.web.reactive.resource.ServerWebExchange , java.lang.String java.lang.String , java.util.List<? extends org.springframework.web.reactive.resource.Resource> < ? extends Resource > java.util.List<? extends org.springframework.web.reactive.resource.Resource> ) { ResourceResolver org.springframework.web.reactive.resource.ResourceResolver = org.springframework.web.reactive.resource.ResourceResolver ( ) ; if ( org.springframework.web.reactive.resource.ResourceResolver == null ) { return null ; } try { return org.springframework.web.reactive.resource.ResourceResolver . resolveResource ( org.springframework.web.reactive.resource.ServerWebExchange , java.lang.String , java.util.List<> , this ) ; } finally { this . int -- ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.resource.Mono<java.lang.String> < java.lang.String > org.springframework.web.reactive.resource.Mono<java.lang.String> ( java.lang.String java.lang.String , java.util.List<? extends org.springframework.web.reactive.resource.Resource> < ? extends Resource > java.util.List<? extends org.springframework.web.reactive.resource.Resource> ) { ResourceResolver org.springframework.web.reactive.resource.ResourceResolver = org.springframework.web.reactive.resource.ResourceResolver ( ) ; if ( org.springframework.web.reactive.resource.ResourceResolver == null ) { return null ; } try { return org.springframework.web.reactive.resource.ResourceResolver . resolveUrlPath ( java.lang.String , java.util.List<> , this ) ; } finally { this . int -- ; } }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.resource.ResourceResolver org.springframework.web.reactive.resource.ResourceResolver ( ) { Assert . state ( this . int <= this . java.util.List<org.springframework.web.reactive.resource.ResourceResolver> . size ( ) , STRING ) ; if ( this . int == ( this . java.util.List<org.springframework.web.reactive.resource.ResourceResolver> . size ( ) - NUMBER ) ) { return null ; } this . int ++ ; return this . java.util.List<org.springframework.web.reactive.resource.ResourceResolver> . get ( this . int ) ; }  <METHOD_END>
