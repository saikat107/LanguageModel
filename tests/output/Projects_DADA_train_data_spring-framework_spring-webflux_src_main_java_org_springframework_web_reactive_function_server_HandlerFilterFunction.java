<METHOD_START> org.springframework.web.reactive.function.server.Mono<R> < R > org.springframework.web.reactive.function.server.Mono<R> ( ServerRequest org.springframework.web.reactive.function.server.ServerRequest , HandlerFunction < T > org.springframework.web.reactive.function.server.HandlerFunction<T> );  <METHOD_END>
<METHOD_START> default org.springframework.web.reactive.function.server.HandlerFilterFunction<T,R> < T , R > org.springframework.web.reactive.function.server.HandlerFilterFunction<T,R> ( org.springframework.web.reactive.function.server.HandlerFilterFunction<T,T> < T , T > org.springframework.web.reactive.function.server.HandlerFilterFunction<T,T> ) { Assert . notNull ( org.springframework.web.reactive.function.server.HandlerFilterFunction<T,T> , STRING ) ; return ( org.springframework.web.reactive.function.server.ServerRequest , org.springframework.web.reactive.function.server.HandlerFunction<T> ) -> { HandlerFunction < T > org.springframework.web.reactive.function.server.HandlerFunction<T> = handlerRequest -> after . filter ( handlerRequest , next ) ; return org.springframework.web.reactive.function.server.Mono<R> ( org.springframework.web.reactive.function.server.ServerRequest , org.springframework.web.reactive.function.server.HandlerFunction<T> ) ; } ; }  <METHOD_END>
<METHOD_START> default org.springframework.web.reactive.function.server.HandlerFunction<R> < R > org.springframework.web.reactive.function.server.HandlerFunction<R> ( HandlerFunction < T > org.springframework.web.reactive.function.server.HandlerFunction<T> ) { Assert . notNull ( org.springframework.web.reactive.function.server.HandlerFunction<T> , STRING ) ; return request -> this . filter ( request , handler ) ; }  <METHOD_END>
<METHOD_START> static org.springframework.web.reactive.function.server.HandlerFilterFunction<?,?> < ? , ? > org.springframework.web.reactive.function.server.HandlerFilterFunction<?,?> ( java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerRequest>> < ServerRequest , Mono < ServerRequest > > java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerRequest>> ) { Assert . notNull ( java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerRequest>> , STRING ) ; return ( org.springframework.web.reactive.function.server.ServerRequest , org.springframework.web.reactive.function.server.HandlerFunction<org.springframework.web.reactive.function.server.ServerResponse> ) -> java.util.function.Function<org.springframework.web.reactive.function.server.ServerRequest,org.springframework.web.reactive.function.server.Mono<org.springframework.web.reactive.function.server.ServerRequest>> . apply ( org.springframework.web.reactive.function.server.ServerRequest ) . then ( org.springframework.web.reactive.function.server.HandlerFunction<org.springframework.web.reactive.function.server.ServerResponse> :: handle ) ; }  <METHOD_END>
<METHOD_START> static < T extends org.springframework.web.reactive.function.server.ServerResponse , R extends org.springframework.web.reactive.function.server.ServerResponse > org.springframework.web.reactive.function.server.HandlerFilterFunction<T,R> < T , R > org.springframework.web.reactive.function.server.HandlerFilterFunction<T,R> ( java.util.function.Function<T,org.springframework.web.reactive.function.server.Mono<R>> < T , Mono < R > > java.util.function.Function<T,org.springframework.web.reactive.function.server.Mono<R>> ) { Assert . notNull ( java.util.function.Function<T,org.springframework.web.reactive.function.server.Mono<R>> , STRING ) ; return ( request , next ) -> next . handle ( request ) . then ( responseProcessor ) ; }  <METHOD_END>
