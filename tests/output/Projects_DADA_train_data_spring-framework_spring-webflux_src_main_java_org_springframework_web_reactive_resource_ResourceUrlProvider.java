<METHOD_START> public void void ( HttpRequestPathHelper org.springframework.web.reactive.resource.HttpRequestPathHelper ) { this . org.springframework.web.reactive.resource.HttpRequestPathHelper = org.springframework.web.reactive.resource.HttpRequestPathHelper ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.resource.HttpRequestPathHelper org.springframework.web.reactive.resource.HttpRequestPathHelper ( ) { return this . org.springframework.web.reactive.resource.HttpRequestPathHelper ; }  <METHOD_END>
<METHOD_START> public void void ( PathMatcher org.springframework.web.reactive.resource.PathMatcher ) { this . org.springframework.web.reactive.resource.PathMatcher = org.springframework.web.reactive.resource.PathMatcher ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.resource.PathMatcher org.springframework.web.reactive.resource.PathMatcher ( ) { return this . org.springframework.web.reactive.resource.PathMatcher ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> < java.lang.String , ResourceWebHandler > java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> ) { if ( java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> != null ) { this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . clear ( ) ; this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . putAll ( java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> ) ; this . boolean = false ; } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> < java.lang.String , ResourceWebHandler > java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> ( ) { return this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ContextRefreshedEvent org.springframework.web.reactive.resource.ContextRefreshedEvent ) { if ( boolean ( ) ) { this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . clear ( ) ; void ( org.springframework.web.reactive.resource.ContextRefreshedEvent . getApplicationContext ( ) ) ; if ( this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . isEmpty ( ) && org.springframework.web.reactive.resource.Log . isDebugEnabled ( ) ) { org.springframework.web.reactive.resource.Log . debug ( STRING ) ; } if ( ! this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . isEmpty ( ) ) { this . boolean = false ; } } }  <METHOD_END>
<METHOD_START> protected void void ( ApplicationContext org.springframework.web.reactive.resource.ApplicationContext ) { org.springframework.web.reactive.resource.Log . debug ( STRING ) ; java.util.Map<java.lang.String,org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> < java.lang.String , SimpleUrlHandlerMapping > java.util.Map<java.lang.String,org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> = org.springframework.web.reactive.resource.ApplicationContext . getBeansOfType ( SimpleUrlHandlerMapping .class ) ; java.util.List<org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> < SimpleUrlHandlerMapping > java.util.List<org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> = new java.util.ArrayList <> ( java.util.Map<java.lang.String,org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> . values ( ) ) ; AnnotationAwareOrderComparator . sort ( java.util.List<org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> ) ; for ( SimpleUrlHandlerMapping org.springframework.web.reactive.resource.SimpleUrlHandlerMapping : java.util.List<org.springframework.web.reactive.resource.SimpleUrlHandlerMapping> ) { for ( java.lang.String java.lang.String : org.springframework.web.reactive.resource.SimpleUrlHandlerMapping . getHandlerMap ( ) . keySet ( ) ) { java.lang.Object java.lang.Object = org.springframework.web.reactive.resource.SimpleUrlHandlerMapping . getHandlerMap ( ) . get ( java.lang.String ) ; if ( java.lang.Object instanceof ResourceWebHandler ) { ResourceWebHandler org.springframework.web.reactive.resource.ResourceWebHandler = ( ResourceWebHandler ) java.lang.Object ; if ( org.springframework.web.reactive.resource.Log . isDebugEnabled ( ) ) { org.springframework.web.reactive.resource.Log . debug ( STRING + java.lang.String + STRING + STRING + org.springframework.web.reactive.resource.ResourceWebHandler . getLocations ( ) + STRING + STRING + org.springframework.web.reactive.resource.ResourceWebHandler . getResourceResolvers ( ) ) ; } this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . put ( java.lang.String , org.springframework.web.reactive.resource.ResourceWebHandler ) ; } } } }  <METHOD_END>
<METHOD_START> public final org.springframework.web.reactive.resource.Mono<java.lang.String> < java.lang.String > org.springframework.web.reactive.resource.Mono<java.lang.String> ( ServerWebExchange org.springframework.web.reactive.resource.ServerWebExchange , java.lang.String java.lang.String ) { if ( org.springframework.web.reactive.resource.Log . isTraceEnabled ( ) ) { org.springframework.web.reactive.resource.Log . trace ( STRING + java.lang.String + STRING ) ; } int int = int ( org.springframework.web.reactive.resource.ServerWebExchange ) ; int int = int ( java.lang.String ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int , int ) ; return org.springframework.web.reactive.resource.Mono<java.lang.String> ( java.lang.String ) . map ( resolvedPath -> prefix + resolvedPath + suffix ) ; }  <METHOD_END>
<METHOD_START> private int int ( ServerWebExchange org.springframework.web.reactive.resource.ServerWebExchange ) { ServerHttpRequest org.springframework.web.reactive.resource.ServerHttpRequest = org.springframework.web.reactive.resource.ServerWebExchange . getRequest ( ) ; java.lang.String java.lang.String = org.springframework.web.reactive.resource.ServerHttpRequest . getURI ( ) . getPath ( ) ; java.lang.String java.lang.String = org.springframework.web.reactive.resource.HttpRequestPathHelper ( ) . getLookupPathForRequest ( org.springframework.web.reactive.resource.ServerWebExchange ) ; return java.lang.String . int ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.String java.lang.String ) { int int = java.lang.String . int ( ) ; int int = java.lang.String . int ( STRING ) ; if( int > NUMBER ) { int = int ; } int int = java.lang.String . int ( STRING ) ; if( int > NUMBER ) { int = java.lang.Math . int ( int , int ) ; } return int ; }  <METHOD_END>
<METHOD_START> public final org.springframework.web.reactive.resource.Mono<java.lang.String> < java.lang.String > org.springframework.web.reactive.resource.Mono<java.lang.String> ( java.lang.String java.lang.String ) { if ( org.springframework.web.reactive.resource.Log . isTraceEnabled ( ) ) { org.springframework.web.reactive.resource.Log . trace ( STRING + java.lang.String + STRING ) ; } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : this . java.util.Map<java.lang.String,org.springframework.web.reactive.resource.ResourceWebHandler> . keySet ( ) ) { if ( org.springframework.web.reactive.resource.PathMatcher ( ) . match ( java.lang.String , java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } if ( java.util.List<java.lang.String> . boolean ( ) ) { return Mono . empty ( ) ; } java.util.Comparator<java.lang.String> < java.lang.String > java.util.Comparator<java.lang.String> = org.springframework.web.reactive.resource.PathMatcher ( ) . getPatternComparator ( java.lang.String ) ; java.util.Collections . void ( java.util.List<java.lang.String> , java.util.Comparator<java.lang.String> ) ; return Flux . fromIterable ( java.util.List<java.lang.String> ) . concatMap ( pattern -> { String pathWithinMapping = getPathMatcher ( ) . extractPathWithinPattern ( pattern , lookupPath ) ; String pathMapping = lookupPath . substring ( NUMBER , lookupPath . indexOf ( pathWithinMapping ) ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + pattern + STRING ) ; } ResourceWebHandler handler = this . handlerMap . get ( pattern ) ; ResourceResolverChain chain = new DefaultResourceResolverChain ( handler . getResourceResolvers ( ) ) ; return chain . resolveUrlPath ( pathWithinMapping , handler . getLocations ( ) ) . map ( resolvedPath -> { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + resolvedPath + STRING ) ; } return pathMapping + resolvedPath ; } ) ; } ) . next ( ) ; }  <METHOD_END>
