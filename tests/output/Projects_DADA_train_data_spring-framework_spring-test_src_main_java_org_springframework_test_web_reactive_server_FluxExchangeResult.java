<METHOD_START> void ( ExchangeResult org.springframework.test.web.reactive.server.ExchangeResult , Flux < T > org.springframework.test.web.reactive.server.Flux<T> , java.time.Duration java.time.Duration ) { super( org.springframework.test.web.reactive.server.ExchangeResult ); this . org.springframework.test.web.reactive.server.Flux<T> = org.springframework.test.web.reactive.server.Flux<T> ; this . java.time.Duration = java.time.Duration ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.reactive.server.Flux<T> < T > org.springframework.test.web.reactive.server.Flux<T> ( ) { return this . org.springframework.test.web.reactive.server.Flux<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public byte [] byte[] ( ) { return this . org.springframework.test.web.reactive.server.Flux<T> . ignoreElements ( ) . timeout ( this . java.time.Duration , Mono . error ( java.lang.IllegalStateException ) ) . then ( ( ) Mono . just ( super. getResponseBodyContent ( ) ) ) . block ( ) ; }  <METHOD_END>
