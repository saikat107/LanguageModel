<METHOD_START> public void ( ) { this( new HttpHeaders ( ) ); }  <METHOD_END>
<METHOD_START> public void ( HttpHeaders org.springframework.http.client.reactive.HttpHeaders ) { Assert . notNull ( org.springframework.http.client.reactive.HttpHeaders , STRING ) ; this . org.springframework.http.client.reactive.HttpHeaders = org.springframework.http.client.reactive.HttpHeaders ; this . org.springframework.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.http.client.reactive.HttpCookie> = new LinkedMultiValueMap <> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.reactive.HttpHeaders org.springframework.http.client.reactive.HttpHeaders ( ) { if ( org.springframework.http.client.reactive.AbstractClientHttpRequest.State . org.springframework.http.client.reactive.AbstractClientHttpRequest.State . boolean ( this . java.util.concurrent.atomic.AtomicReference<org.springframework.http.client.reactive.AbstractClientHttpRequest.State> . org.springframework.http.client.reactive.AbstractClientHttpRequest.State ( ) ) ) { return HttpHeaders . readOnlyHttpHeaders ( this . org.springframework.http.client.reactive.HttpHeaders ) ; } return this . org.springframework.http.client.reactive.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.http.client.reactive.HttpCookie> < java.lang.String , HttpCookie > org.springframework.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.http.client.reactive.HttpCookie> ( ) { if ( org.springframework.http.client.reactive.AbstractClientHttpRequest.State . org.springframework.http.client.reactive.AbstractClientHttpRequest.State . boolean ( this . java.util.concurrent.atomic.AtomicReference<org.springframework.http.client.reactive.AbstractClientHttpRequest.State> . org.springframework.http.client.reactive.AbstractClientHttpRequest.State ( ) ) ) { return CollectionUtils . unmodifiableMultiValueMap ( this . org.springframework.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.http.client.reactive.HttpCookie> ) ; } return this . org.springframework.http.client.reactive.MultiValueMap<java.lang.String,org.springframework.http.client.reactive.HttpCookie> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>> < ? extends Mono < java.lang.Void > > java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>> ) { Assert . notNull ( java.util.function.Supplier<> , STRING ) ; this . java.util.List<java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>>> . add ( java.util.function.Supplier<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . java.util.concurrent.atomic.AtomicReference<org.springframework.http.client.reactive.AbstractClientHttpRequest.State> . org.springframework.http.client.reactive.AbstractClientHttpRequest.State ( ) != org.springframework.http.client.reactive.AbstractClientHttpRequest.State . org.springframework.http.client.reactive.AbstractClientHttpRequest.State ; }  <METHOD_END>
<METHOD_START> protected org.springframework.http.client.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.client.reactive.Mono<java.lang.Void> ( ) { return org.springframework.http.client.reactive.Mono<java.lang.Void> ( null ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.http.client.reactive.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.client.reactive.Mono<java.lang.Void> ( java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>> < ? extends Mono < java.lang.Void > > java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>> ) { if ( ! this . java.util.concurrent.atomic.AtomicReference<org.springframework.http.client.reactive.AbstractClientHttpRequest.State> . boolean ( org.springframework.http.client.reactive.AbstractClientHttpRequest.State . org.springframework.http.client.reactive.AbstractClientHttpRequest.State , org.springframework.http.client.reactive.AbstractClientHttpRequest.State . org.springframework.http.client.reactive.AbstractClientHttpRequest.State ) ) { return Mono . empty ( ) ; } this . java.util.List<java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>>> . add ( ( ) { applyHeaders ( ) ; applyCookies ( ) ; this . state . set ( State . COMMITTED ) ; return Mono . empty ( ) ; } ) ; if ( java.util.function.Supplier<> != null ) { this . java.util.List<java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>>> . add ( java.util.function.Supplier<> ) ; } java.util.List<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>> < ? extends Mono < java.lang.Void > > java.util.List<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>> = this . java.util.List<java.util.function.Supplier<? extends org.springframework.http.client.reactive.Mono<java.lang.Void>>> . stream ( ) . map ( java.util.function.Supplier :: get ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; return Flux . concat ( java.util.List<> ) . next ( ) ; }  <METHOD_END>
<METHOD_START> protected abstract void void ( )  <METHOD_END>
<METHOD_START> protected abstract void void ( )  <METHOD_END>
