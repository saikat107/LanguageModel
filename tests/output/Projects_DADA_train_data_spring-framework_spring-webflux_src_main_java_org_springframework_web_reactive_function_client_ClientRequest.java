<METHOD_START> org.springframework.web.reactive.function.client.HttpMethod org.springframework.web.reactive.function.client.HttpMethod ( )  <METHOD_END>
<METHOD_START> java.net.URI java.net.URI ( )  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.HttpHeaders org.springframework.web.reactive.function.client.HttpHeaders ( )  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.MultiValueMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.web.reactive.function.client.MultiValueMap<java.lang.String,java.lang.String> ( )  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.BodyInserter<?,? super org.springframework.web.reactive.function.client.ClientHttpRequest> < ? , ? super ClientHttpRequest > org.springframework.web.reactive.function.client.BodyInserter<?,? super org.springframework.web.reactive.function.client.ClientHttpRequest> ( )  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.function.client.Mono<java.lang.Void> ( ClientHttpRequest org.springframework.web.reactive.function.client.ClientHttpRequest , ExchangeStrategies org.springframework.web.reactive.function.client.ExchangeStrategies );  <METHOD_END>
<METHOD_START> static org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( org.springframework.web.reactive.function.client.ClientRequest org.springframework.web.reactive.function.client.ClientRequest ) { Assert . notNull ( org.springframework.web.reactive.function.client.ClientRequest , STRING ) ; return new DefaultClientRequestBuilder ( org.springframework.web.reactive.function.client.ClientRequest . org.springframework.web.reactive.function.client.HttpMethod ( ) , org.springframework.web.reactive.function.client.ClientRequest . java.net.URI ( ) ) . headers ( org.springframework.web.reactive.function.client.ClientRequest . org.springframework.web.reactive.function.client.HttpHeaders ( ) ) . cookies ( org.springframework.web.reactive.function.client.ClientRequest . org.springframework.web.reactive.function.client.MultiValueMap<java.lang.String,java.lang.String> ( ) ) . body ( org.springframework.web.reactive.function.client.ClientRequest . org.springframework.web.reactive.function.client.BodyInserter<?,? super org.springframework.web.reactive.function.client.ClientHttpRequest> ( ) ) ; }  <METHOD_END>
<METHOD_START> static org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( HttpMethod org.springframework.web.reactive.function.client.HttpMethod , java.net.URI java.net.URI ) { return new DefaultClientRequestBuilder ( org.springframework.web.reactive.function.client.HttpMethod , java.net.URI ) ; }  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( java.lang.String java.lang.String , java.lang.String ... java.lang.String[] );  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( HttpHeaders org.springframework.web.reactive.function.client.HttpHeaders );  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.reactive.function.client.MultiValueMap<java.lang.String,java.lang.String> );  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( BodyInserter < ? , ? super ClientHttpRequest > org.springframework.web.reactive.function.client.BodyInserter<?,? super org.springframework.web.reactive.function.client.ClientHttpRequest> );  <METHOD_END>
<METHOD_START> < S , P extends org.springframework.web.reactive.function.client.Publisher<S> < S > > org.springframework.web.reactive.function.client.ClientRequest.Builder org.springframework.web.reactive.function.client.ClientRequest.Builder ( P P , java.lang.Class<S> < S > java.lang.Class<S> );  <METHOD_END>
<METHOD_START> org.springframework.web.reactive.function.client.ClientRequest org.springframework.web.reactive.function.client.ClientRequest ( )  <METHOD_END>
