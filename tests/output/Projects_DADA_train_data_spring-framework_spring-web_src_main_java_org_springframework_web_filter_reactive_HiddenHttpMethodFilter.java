<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.filter.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.filter.reactive.Mono<java.lang.Void> ( ServerWebExchange org.springframework.web.filter.reactive.ServerWebExchange , WebFilterChain org.springframework.web.filter.reactive.WebFilterChain ) { if ( org.springframework.web.filter.reactive.ServerWebExchange . getRequest ( ) . getMethod ( ) != HttpMethod . POST ) { return org.springframework.web.filter.reactive.WebFilterChain . filter ( org.springframework.web.filter.reactive.ServerWebExchange ) ; } return org.springframework.web.filter.reactive.ServerWebExchange . getFormData ( ) . map ( formData -> { String method = formData . getFirst ( this . methodParamName ) ; return StringUtils . hasLength ( method ) ? mapExchange ( exchange , method ) : exchange ; } ) . then ( ( exchange1 ) -> chain . filter ( exchange1 ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.filter.reactive.ServerWebExchange org.springframework.web.filter.reactive.ServerWebExchange ( ServerWebExchange org.springframework.web.filter.reactive.ServerWebExchange , java.lang.String java.lang.String ) { HttpMethod org.springframework.web.filter.reactive.HttpMethod = HttpMethod . resolve ( java.lang.String . java.lang.String ( java.util.Locale . java.util.Locale ) ) ; Assert . notNull ( org.springframework.web.filter.reactive.HttpMethod , ( ) STRING + methodParamValue + STRING ) ; return org.springframework.web.filter.reactive.ServerWebExchange . mutate ( ) . request ( builder -> builder . method ( httpMethod ) ) . build ( ) ; }  <METHOD_END>
