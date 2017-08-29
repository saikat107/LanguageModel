<METHOD_START> public void ( java.net.URI java.net.URI ) { this( new ValueExpression <> ( java.net.URI ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , null ); }  <METHOD_END>
<METHOD_START> public void ( Expression org.springframework.integration.http.outbound.Expression ) { this( org.springframework.integration.http.outbound.Expression , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , WebClient org.springframework.integration.http.outbound.WebClient ) { this( new LiteralExpression ( java.lang.String ) , org.springframework.integration.http.outbound.WebClient ); Assert . hasText ( java.lang.String , STRING ) ; }  <METHOD_END>
<METHOD_START> public void ( Expression org.springframework.integration.http.outbound.Expression , WebClient org.springframework.integration.http.outbound.WebClient ) { super( org.springframework.integration.http.outbound.Expression ); this . org.springframework.integration.http.outbound.WebClient = ( org.springframework.integration.http.outbound.WebClient == null ? WebClient . create ( ) : org.springframework.integration.http.outbound.WebClient ) ; this . setAsync ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return ( isExpectReply ( ) ? STRING : STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.util.function.Supplier<java.net.URI> < java.net.URI > java.util.function.Supplier<java.net.URI> , HttpMethod org.springframework.integration.http.outbound.HttpMethod , HttpEntity < ? > org.springframework.integration.http.outbound.HttpEntity<?> , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.http.outbound.Message<?> ) { WebClient . WebClient WebClient.RequestBodySpec = this . org.springframework.integration.http.outbound.WebClient . method ( org.springframework.integration.http.outbound.HttpMethod ) . uri ( b -> uriSupplier . get ( ) ) . headers ( org.springframework.integration.http.outbound.HttpEntity<> . getHeaders ( ) ) ; if ( org.springframework.integration.http.outbound.HttpEntity<> . hasBody ( ) ) { WebClient.RequestBodySpec . body ( org.springframework.integration.http.outbound.HttpEntity<> . getBody ( ) ) ; } Mono < ClientResponse > org.springframework.integration.http.outbound.Mono<org.springframework.integration.http.outbound.ClientResponse> = WebClient.RequestBodySpec . exchange ( ) . doOnNext ( response -> { HttpStatus httpStatus = response . statusCode ( ) ; if ( httpStatus . is4xxClientError ( ) || httpStatus . is5xxServerError ( ) ) { throw new WebClientException ( STRING + httpStatus . value ( ) + STRING + httpStatus . getReasonPhrase ( ) ) ; } } ) ; if ( isExpectReply ( ) ) { ResolvableType org.springframework.integration.http.outbound.ResolvableType ; if ( java.lang.Object instanceof ParameterizedTypeReference < ? > ) { org.springframework.integration.http.outbound.ResolvableType = ResolvableType . forType ( ( ( ParameterizedTypeReference < ? > ) java.lang.Object ) . getType ( ) ) ; } else if ( java.lang.Object != null ) { org.springframework.integration.http.outbound.ResolvableType = ResolvableType . forClass ( ( java.lang.Class<?> < ? > ) java.lang.Object ) ; } else { org.springframework.integration.http.outbound.ResolvableType = null ; } return org.springframework.integration.http.outbound.Mono<org.springframework.integration.http.outbound.ClientResponse> . map ( response -> new ResponseEntity <> ( responseType != null ? response . body ( BodyExtractors . toMono ( responseType ) ) . block ( ) : null , response . headers ( ) . asHttpHeaders ( ) , response . statusCode ( ) ) ) . map ( this :: getReply ) ; } else { org.springframework.integration.http.outbound.Mono<org.springframework.integration.http.outbound.ClientResponse> . subscribe ( v -> { } , ex -> sendErrorMessage ( requestMessage , ex ) ) ; return null ; } }  <METHOD_END>
