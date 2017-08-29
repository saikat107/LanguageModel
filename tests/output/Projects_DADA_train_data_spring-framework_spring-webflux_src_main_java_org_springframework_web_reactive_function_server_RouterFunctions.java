<METHOD_START> public static < T extends org.springframework.web.reactive.function.server.ServerResponse > org.springframework.web.reactive.function.server.RouterFunction<T> < T > org.springframework.web.reactive.function.server.RouterFunction<T> ( RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate , HandlerFunction < T > org.springframework.web.reactive.function.server.HandlerFunction<T> ) { Assert . notNull ( org.springframework.web.reactive.function.server.RequestPredicate , STRING ) ; Assert . notNull ( org.springframework.web.reactive.function.server.HandlerFunction<T> , STRING ) ; return request -> { if ( predicate . test ( request ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( String . format ( STRING , predicate , request ) ) ; } return Mono . just ( handlerFunction ) ; } else { return Mono . empty ( ) ; } } ; }  <METHOD_END>
<METHOD_START> public static < T extends org.springframework.web.reactive.function.server.ServerResponse > org.springframework.web.reactive.function.server.RouterFunction<T> < T > org.springframework.web.reactive.function.server.RouterFunction<T> ( RequestPredicate org.springframework.web.reactive.function.server.RequestPredicate , RouterFunction < T > org.springframework.web.reactive.function.server.RouterFunction<T> ) { Assert . notNull ( org.springframework.web.reactive.function.server.RequestPredicate , STRING ) ; Assert . notNull ( org.springframework.web.reactive.function.server.RouterFunction<T> , STRING ) ; return request -> predicate . nest ( request ) . map ( nestedRequest -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( String . format ( STRING , predicate , request ) ) ; } return routerFunction . route ( nestedRequest ) ; } ) . orElseGet ( Mono :: empty ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RouterFunction<org.springframework.web.reactive.function.server.ServerResponse> < ServerResponse > org.springframework.web.reactive.function.server.RouterFunction<org.springframework.web.reactive.function.server.ServerResponse> ( java.lang.String java.lang.String , Resource org.springframework.web.reactive.function.server.Resource ) { Assert . hasLength ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.web.reactive.function.server.Resource , STRING ) ; return org.springframework.web.reactive.function.server.RouterFunction<org.springframework.web.reactive.function.server.ServerResponse> ( new PathResourceLookupFunction ( java.lang.String , org.springframework.web.reactive.function.server.Resource ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.RouterFunction<org.springframework.web.reactive.function.server.ServerResponse> < ServerResponse > org.springframework.web.reactive.function.server.RouterFunction<org.springframework.web.reactive.function.server.ServerResponse> ( java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource>> < ServerRequest , Mono < Resource > > java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource>> ) { Assert . notNull ( java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.Resource>> , STRING ) ; return request -> lookupFunction . apply ( request ) . map ( ResourceHandlerFunction ::new ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.HttpWebHandlerAdapter org.springframework.web.reactive.function.server.HttpWebHandlerAdapter ( RouterFunction < ? > org.springframework.web.reactive.function.server.RouterFunction<?> ) { return org.springframework.web.reactive.function.server.HttpWebHandlerAdapter ( org.springframework.web.reactive.function.server.RouterFunction<> , HandlerStrategies . withDefaults ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.HttpWebHandlerAdapter org.springframework.web.reactive.function.server.HttpWebHandlerAdapter ( RouterFunction < ? > org.springframework.web.reactive.function.server.RouterFunction<?> , HandlerStrategies org.springframework.web.reactive.function.server.HandlerStrategies ) { Assert . notNull ( org.springframework.web.reactive.function.server.RouterFunction<> , STRING ) ; Assert . notNull ( org.springframework.web.reactive.function.server.HandlerStrategies , STRING ) ; return new HttpWebHandlerAdapter ( exchange -> { ServerRequest request = new DefaultServerRequest ( exchange , strategies ) ; addAttributes ( exchange , request ) ; return routerFunction . route ( request ) . defaultIfEmpty ( notFound ( ) ) . then ( handlerFunction -> wrapException ( ( ) handlerFunction . handle ( request ) ) ) . then ( response -> wrapException ( ( ) response . writeTo ( exchange , strategies ) ) ) . otherwise ( ResponseStatusException .class , ex -> { exchange . getResponse ( ) . setStatusCode ( ex . getStatus ( ) ) ; if ( ex . getMessage ( ) != null ) { logger . error ( ex . getMessage ( ) ) ; } return Mono . empty ( ) ; } ) ; } ) ; }  <METHOD_END>
<METHOD_START> private static < T > org.springframework.web.reactive.function.server.Mono<T> < T > org.springframework.web.reactive.function.server.Mono<T> ( java.util.function.Supplier<org.springframework.web.reactive.function.server.Mono<T>> < Mono < T > > java.util.function.Supplier<org.springframework.web.reactive.function.server.Mono<T>> ) { try { return java.util.function.Supplier<org.springframework.web.reactive.function.server.Mono<T>> . get ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { return Mono . error ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.HandlerMapping org.springframework.web.reactive.function.server.HandlerMapping ( RouterFunction < ? > org.springframework.web.reactive.function.server.RouterFunction<?> ) { return org.springframework.web.reactive.function.server.HandlerMapping ( org.springframework.web.reactive.function.server.RouterFunction<> , HandlerStrategies . withDefaults ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.server.HandlerMapping org.springframework.web.reactive.function.server.HandlerMapping ( RouterFunction < ? > org.springframework.web.reactive.function.server.RouterFunction<?> , HandlerStrategies org.springframework.web.reactive.function.server.HandlerStrategies ) { Assert . notNull ( org.springframework.web.reactive.function.server.RouterFunction<> , STRING ) ; Assert . notNull ( org.springframework.web.reactive.function.server.HandlerStrategies , STRING ) ; return exchange -> { ServerRequest request = new DefaultServerRequest ( exchange , strategies ) ; addAttributes ( exchange , request ) ; return routerFunction . route ( request ) . map ( handlerFunction -> ( Object ) handlerFunction ) ; } ; }  <METHOD_END>
<METHOD_START> private static void void ( ServerWebExchange org.springframework.web.reactive.function.server.ServerWebExchange , ServerRequest org.springframework.web.reactive.function.server.ServerRequest ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.web.reactive.function.server.ServerWebExchange . getAttributes ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , org.springframework.web.reactive.function.server.ServerRequest ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static < T extends org.springframework.web.reactive.function.server.ServerResponse > org.springframework.web.reactive.function.server.HandlerFunction<T> < T > org.springframework.web.reactive.function.server.HandlerFunction<T> ( ) { return ( HandlerFunction < T > ) org.springframework.web.reactive.function.server.HandlerFunction<org.springframework.web.reactive.function.server.ServerResponse> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) static < T extends org.springframework.web.reactive.function.server.ServerResponse > org.springframework.web.reactive.function.server.HandlerFunction<T> < T > org.springframework.web.reactive.function.server.HandlerFunction<T> ( HandlerFunction < ? > org.springframework.web.reactive.function.server.HandlerFunction<?> ) { return ( HandlerFunction < T > ) org.springframework.web.reactive.function.server.HandlerFunction<> ; }  <METHOD_END>
