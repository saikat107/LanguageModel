<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( ) { return request -> true ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod org.springframework.web.reactive.function.server.HttpMethod ) { return new org.springframework.web.reactive.function.server.RequestPredicates.HttpMethodPredicate ( org.springframework.web.reactive.function.server.HttpMethod ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; return java.util.function.Function<java.lang.String,org.springframework.web.reactive.function.server.RequestPredicate> ( org.springframework.web.reactive.function.server.PathPatternParser ) . apply ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.util.function.Function<java.lang.String,org.springframework.web.reactive.function.server.RequestPredicate> < java.lang.String , RequestPredicate > java.util.function.Function<java.lang.String,org.springframework.web.reactive.function.server.RequestPredicate> ( PathPatternParser org.springframework.web.reactive.function.server.PathPatternParser ) { Assert . notNull ( org.springframework.web.reactive.function.server.PathPatternParser , STRING ) ; return java.lang.String -> { synchronized ( org.springframework.web.reactive.function.server.PathPatternParser ) { return new org.springframework.web.reactive.function.server.RequestPredicates.PathPatternPredicate ( org.springframework.web.reactive.function.server.PathPatternParser . parse ( java.lang.String ) ) ; } } ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.util.function.Predicate<ServerRequest.Headers> < ServerRequest . ServerRequest > java.util.function.Predicate<ServerRequest.Headers> ) { return new org.springframework.web.reactive.function.server.RequestPredicates.HeadersPredicate ( java.util.function.Predicate<ServerRequest.Headers> ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( MediaType ... org.springframework.web.reactive.function.server.MediaType[] ) { Assert . notEmpty ( org.springframework.web.reactive.function.server.MediaType[] , STRING ) ; java.util.Set<org.springframework.web.reactive.function.server.MediaType> < MediaType > java.util.Set<org.springframework.web.reactive.function.server.MediaType> = new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.web.reactive.function.server.MediaType[] ) ) ; return org.springframework.web.reactive.function.server.RequestPredicate ( new java.util.function.Predicate<ServerRequest.Headers> < ServerRequest . ServerRequest > ( ) { @ java.lang.Override public boolean boolean ( ServerRequest . ServerRequest ServerRequest.Headers ) { MediaType org.springframework.web.reactive.function.server.MediaType = ServerRequest.Headers . contentType ( ) . orElse ( MediaType . APPLICATION_OCTET_STREAM ) ; boolean boolean = java.util.Set<org.springframework.web.reactive.function.server.MediaType> . stream ( ) . anyMatch ( mediaType -> mediaType . includes ( contentType ) ) ; void ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> , org.springframework.web.reactive.function.server.MediaType , boolean ) ; return boolean ; } @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest . ServerRequest ServerRequest.Headers ) { MediaType org.springframework.web.reactive.function.server.MediaType = ServerRequest.Headers . contentType ( ) . orElse ( MediaType . APPLICATION_OCTET_STREAM ) ; boolean boolean = java.util.Set<org.springframework.web.reactive.function.server.MediaType> . stream ( ) . anyMatch ( mediaType -> mediaType . includes ( contentType ) ) ; void ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> , org.springframework.web.reactive.function.server.MediaType , boolean ) ; return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( MediaType ... org.springframework.web.reactive.function.server.MediaType[] ) { Assert . notEmpty ( org.springframework.web.reactive.function.server.MediaType[] , STRING ) ; java.util.Set<org.springframework.web.reactive.function.server.MediaType> < MediaType > java.util.Set<org.springframework.web.reactive.function.server.MediaType> = new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.web.reactive.function.server.MediaType[] ) ) ; return org.springframework.web.reactive.function.server.RequestPredicate ( new java.util.function.Predicate<ServerRequest.Headers> < ServerRequest . ServerRequest > ( ) { @ java.lang.Override public boolean boolean ( ServerRequest . ServerRequest ServerRequest.Headers ) { java.util.List<org.springframework.web.reactive.function.server.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.function.server.MediaType> = ServerRequest.Headers . accept ( ) ; if ( java.util.List<org.springframework.web.reactive.function.server.MediaType> . isEmpty ( ) ) { java.util.List<org.springframework.web.reactive.function.server.MediaType> = java.util.Collections . java.util.List ( MediaType . ALL ) ; } else { MediaType . sortBySpecificityAndQuality ( java.util.List<org.springframework.web.reactive.function.server.MediaType> ) ; } boolean boolean = java.util.List<org.springframework.web.reactive.function.server.MediaType> . stream ( ) . anyMatch ( acceptedMediaType -> mediaTypeSet . stream ( ) . anyMatch ( acceptedMediaType :: isCompatibleWith ) ) ; void ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> , java.util.List<org.springframework.web.reactive.function.server.MediaType> , boolean ) ; return boolean ; } @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest . ServerRequest ServerRequest.Headers ) { java.util.List<org.springframework.web.reactive.function.server.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.function.server.MediaType> = ServerRequest.Headers . accept ( ) ; if ( java.util.List<org.springframework.web.reactive.function.server.MediaType> . isEmpty ( ) ) { java.util.List<org.springframework.web.reactive.function.server.MediaType> = java.util.Collections . java.util.List ( MediaType . ALL ) ; } else { MediaType . sortBySpecificityAndQuality ( java.util.List<org.springframework.web.reactive.function.server.MediaType> ) ; } boolean boolean = java.util.List<org.springframework.web.reactive.function.server.MediaType> . stream ( ) . anyMatch ( acceptedMediaType -> mediaTypeSet . stream ( ) . anyMatch ( acceptedMediaType :: isCompatibleWith ) ) ; void ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> , java.util.List<org.springframework.web.reactive.function.server.MediaType> , boolean ) ; return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , java.util.Set<org.springframework.web.reactive.function.server.MediaType> ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . GET ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . HEAD ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . POST ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . PUT ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . PATCH ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . DELETE ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { return org.springframework.web.reactive.function.server.RequestPredicate ( HttpMethod . OPTIONS ) . and ( org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; return org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String -> { boolean boolean = java.lang.String . boolean ( java.lang.String ) ; void ( STRING , java.lang.String , java.lang.String , boolean ) ; return boolean ; } ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.util.function.Predicate<java.lang.String> < java.lang.String > java.util.function.Predicate<java.lang.String> ) { Assert . notNull ( java.util.function.Predicate<java.lang.String> , STRING ) ; return request -> { String pathExtension = UriUtils . extractFileExtension ( request . path ( ) ) ; return extensionPredicate . test ( pathExtension ) ; } ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ( java.lang.String java.lang.String , java.util.function.Predicate<java.lang.String> < java.lang.String > java.util.function.Predicate<java.lang.String> ) { return request -> { Optional < String > s = request . queryParam ( name ) ; return s . filter ( predicate ) . isPresent ( ) ; } ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , boolean boolean ) { if ( org.springframework.web.reactive.function.server.Log . isTraceEnabled ( ) ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING , java.lang.String , java.lang.Object , boolean ? STRING : STRING , java.lang.Object ) ; org.springframework.web.reactive.function.server.Log . trace ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public void ( HttpMethod org.springframework.web.reactive.function.server.HttpMethod ) { Assert . notNull ( org.springframework.web.reactive.function.server.HttpMethod , STRING ) ; this . org.springframework.web.reactive.function.server.HttpMethod = org.springframework.web.reactive.function.server.HttpMethod ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { boolean boolean = this . org.springframework.web.reactive.function.server.HttpMethod == org.springframework.web.reactive.function.server.ServerRequest . method ( ) ; void ( STRING , this . org.springframework.web.reactive.function.server.HttpMethod , org.springframework.web.reactive.function.server.ServerRequest . method ( ) , boolean ) ; return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.web.reactive.function.server.HttpMethod . toString ( ) ; }  <METHOD_END>
<METHOD_START> public void ( PathPattern org.springframework.web.reactive.function.server.PathPattern ) { Assert . notNull ( org.springframework.web.reactive.function.server.PathPattern , STRING ) ; this . org.springframework.web.reactive.function.server.PathPattern = org.springframework.web.reactive.function.server.PathPattern ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { java.lang.String java.lang.String = org.springframework.web.reactive.function.server.ServerRequest . path ( ) ; boolean boolean = this . org.springframework.web.reactive.function.server.PathPattern . matches ( java.lang.String ) ; void ( STRING , this . org.springframework.web.reactive.function.server.PathPattern . getPatternString ( ) , java.lang.String , boolean ) ; if ( boolean ) { void ( org.springframework.web.reactive.function.server.ServerRequest ) ; return true ; } else { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> < ServerRequest > java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { java.lang.String java.lang.String = this . org.springframework.web.reactive.function.server.PathPattern . getPathRemaining ( org.springframework.web.reactive.function.server.ServerRequest . path ( ) ) ; return java.util.Optional . java.util.Optional<java.lang.String> ( java.lang.String ) . java.util.Optional<java.lang.String> ( java.lang.String -> ! java.lang.String . boolean ( STRING ) ? STRING + java.lang.String : java.lang.String ) . java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> ( java.lang.String -> { return new org.springframework.web.reactive.function.server.RequestPredicates.SubPathServerRequestWrapper ( org.springframework.web.reactive.function.server.ServerRequest , java.lang.String ) ; } ) ; }  <METHOD_END>
<METHOD_START> private void void ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = this . org.springframework.web.reactive.function.server.PathPattern . matchAndExtract ( org.springframework.web.reactive.function.server.ServerRequest . path ( ) ) ; if ( ! java.util.Map<java.lang.String,java.lang.String> . boolean ( ) ) { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = org.springframework.web.reactive.function.server.ServerRequest . pathVariables ( ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.LinkedHashMap<java.lang.String,java.lang.String> <> ( java.util.Map<java.lang.String,java.lang.String> ) ; java.util.Map<java.lang.String,java.lang.String> . void ( java.util.Map<java.lang.String,java.lang.String> ) ; org.springframework.web.reactive.function.server.ServerRequest . attributes ( ) . put ( RouterFunctions . URI_TEMPLATE_VARIABLES_ATTRIBUTE , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( java.util.Map<java.lang.String,java.lang.String> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.web.reactive.function.server.PathPattern . getPatternString ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.function.Predicate<ServerRequest.Headers> < ServerRequest . ServerRequest > java.util.function.Predicate<ServerRequest.Headers> ) { Assert . notNull ( java.util.function.Predicate<ServerRequest.Headers> , STRING ) ; this . java.util.function.Predicate<ServerRequest.Headers> = java.util.function.Predicate<ServerRequest.Headers> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { return this . java.util.function.Predicate<ServerRequest.Headers> . test ( org.springframework.web.reactive.function.server.ServerRequest . headers ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.util.function.Predicate<ServerRequest.Headers> . toString ( ) ; }  <METHOD_END>
<METHOD_START> public void ( RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate , RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ) { this . org.springframework.web.reactive.function.server.RequestPredicate = org.springframework.web.reactive.function.server.RequestPredicate ; this . org.springframework.web.reactive.function.server.RequestPredicate = org.springframework.web.reactive.function.server.RequestPredicate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { return this . org.springframework.web.reactive.function.server.RequestPredicate . test ( org.springframework.web.reactive.function.server.ServerRequest ) && this . org.springframework.web.reactive.function.server.RequestPredicate . test ( org.springframework.web.reactive.function.server.ServerRequest ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> < ServerRequest > java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { return this . org.springframework.web.reactive.function.server.RequestPredicate . nest ( org.springframework.web.reactive.function.server.ServerRequest ) . flatMap ( this . org.springframework.web.reactive.function.server.RequestPredicate :: nest ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , this . org.springframework.web.reactive.function.server.RequestPredicate , this . org.springframework.web.reactive.function.server.RequestPredicate ) ; }  <METHOD_END>
<METHOD_START> public void ( RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate , RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate ) { this . org.springframework.web.reactive.function.server.RequestPredicate = org.springframework.web.reactive.function.server.RequestPredicate ; this . org.springframework.web.reactive.function.server.RequestPredicate = org.springframework.web.reactive.function.server.RequestPredicate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { return this . org.springframework.web.reactive.function.server.RequestPredicate . test ( org.springframework.web.reactive.function.server.ServerRequest ) || this . org.springframework.web.reactive.function.server.RequestPredicate . test ( org.springframework.web.reactive.function.server.ServerRequest ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> < ServerRequest > java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> < ServerRequest > java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> = this . org.springframework.web.reactive.function.server.RequestPredicate . nest ( org.springframework.web.reactive.function.server.ServerRequest ) ; if ( java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> . isPresent ( ) ) { return java.util.Optional<org.springframework.web.reactive.function.server.ServerRequest> ; } else { return this . org.springframework.web.reactive.function.server.RequestPredicate . nest ( org.springframework.web.reactive.function.server.ServerRequest ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( STRING , this . org.springframework.web.reactive.function.server.RequestPredicate , this . org.springframework.web.reactive.function.server.RequestPredicate ) ; }  <METHOD_END>
<METHOD_START> public void ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest , java.lang.String java.lang.String ) { this . org.springframework.web.reactive.function.server.ServerRequest = org.springframework.web.reactive.function.server.ServerRequest ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.HttpMethod org.springframework.web.reactive.function.server.HttpMethod ( ) { return this . org.springframework.web.reactive.function.server.ServerRequest . method ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . org.springframework.web.reactive.function.server.ServerRequest . uri ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.Headers org.springframework.web.reactive.function.server.Headers ( ) { return this . org.springframework.web.reactive.function.server.ServerRequest . headers ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( BodyExtractor < T , ? super ServerHttpRequest > org.springframework.web.reactive.function.server.BodyExtractor<T,? super org.springframework.web.reactive.function.server.ServerHttpRequest> ) { return this . org.springframework.web.reactive.function.server.ServerRequest . body ( org.springframework.web.reactive.function.server.BodyExtractor<T,> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( BodyExtractor < T , ? super ServerHttpRequest > org.springframework.web.reactive.function.server.BodyExtractor<T,? super org.springframework.web.reactive.function.server.ServerHttpRequest> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return this . org.springframework.web.reactive.function.server.ServerRequest . body ( org.springframework.web.reactive.function.server.BodyExtractor<T,> , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.web.reactive.function.server.Mono<T> < T > org.springframework.web.reactive.function.server.Mono<T> ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { return this . org.springframework.web.reactive.function.server.ServerRequest . bodyToMono ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.web.reactive.function.server.Flux<T> < T > org.springframework.web.reactive.function.server.Flux<T> ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { return this . org.springframework.web.reactive.function.server.ServerRequest . bodyToFlux ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.Optional<T> < T > java.util.Optional<T> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.ServerRequest . attribute ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this . org.springframework.web.reactive.function.server.ServerRequest . attributes ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.ServerRequest . queryParam ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.ServerRequest . queryParams ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.ServerRequest . pathVariable ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return this . org.springframework.web.reactive.function.server.ServerRequest . pathVariables ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.WebSession> < WebSession > org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.WebSession> ( ) { return this . org.springframework.web.reactive.function.server.ServerRequest . session ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.web.reactive.function.server.HttpMethod ( ) + STRING + java.lang.String ( ) ; }  <METHOD_END>
