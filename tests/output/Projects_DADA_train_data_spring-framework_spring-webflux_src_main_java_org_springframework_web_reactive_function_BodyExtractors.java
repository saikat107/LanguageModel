<METHOD_START> public static < T > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Mono<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> < Mono < T > , ReactiveHttpInputMessage > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Mono<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return org.springframework.web.reactive.function.BodyExtractor ( ResolvableType . forClass ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Mono<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> < Mono < T > , ReactiveHttpInputMessage > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Mono<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> ( ResolvableType org.springframework.web.reactive.function.ResolvableType ) { Assert . notNull ( org.springframework.web.reactive.function.ResolvableType , STRING ) ; return ( inputMessage , context ) -> readWithMessageReaders ( inputMessage , context , elementType , reader -> { Optional < ServerHttpResponse > serverResponse = context . serverResponse ( ) ; if ( serverResponse . isPresent ( ) && inputMessage instanceof ServerHttpRequest ) { return reader . readMono ( elementType , elementType , ( ServerHttpRequest ) inputMessage , serverResponse . get ( ) , context . hints ( ) ) ; } else { return reader . readMono ( elementType , inputMessage , context . hints ( ) ) ; } } , Mono :: error ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Flux<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> < Flux < T > , ReactiveHttpInputMessage > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Flux<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; return org.springframework.web.reactive.function.BodyExtractor ( ResolvableType . forClass ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> public static < T > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Flux<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> < Flux < T > , ReactiveHttpInputMessage > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Flux<T>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> ( ResolvableType org.springframework.web.reactive.function.ResolvableType ) { Assert . notNull ( org.springframework.web.reactive.function.ResolvableType , STRING ) ; return ( inputMessage , context ) -> readWithMessageReaders ( inputMessage , context , elementType , reader -> { Optional < ServerHttpResponse > serverResponse = context . serverResponse ( ) ; if ( serverResponse . isPresent ( ) && inputMessage instanceof ServerHttpRequest ) { return reader . read ( elementType , elementType , ( ServerHttpRequest ) inputMessage , serverResponse . get ( ) , context . hints ( ) ) ; } else { return reader . read ( elementType , inputMessage , context . hints ( ) ) ; } } , Flux :: error ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Mono<org.springframework.web.reactive.function.MultiValueMap<java.lang.String,java.lang.String>>,org.springframework.web.reactive.function.ServerHttpRequest> < Mono < MultiValueMap < java.lang.String , java.lang.String > > , ServerHttpRequest > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Mono<org.springframework.web.reactive.function.MultiValueMap<java.lang.String,java.lang.String>>,org.springframework.web.reactive.function.ServerHttpRequest> ( ) { return ( serverRequest , context ) -> { HttpMessageReader < MultiValueMap < String , String > > messageReader = formMessageReader ( context ) ; return context . serverResponse ( ) . map ( serverResponse -> messageReader . readMono ( FORM_TYPE , FORM_TYPE , serverRequest , serverResponse , context . hints ( ) ) ) . orElseGet ( ( ) messageReader . readMono ( FORM_TYPE , serverRequest , context . hints ( ) ) ) ; } ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Flux<org.springframework.web.reactive.function.DataBuffer>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> < Flux < DataBuffer > , ReactiveHttpInputMessage > org.springframework.web.reactive.function.BodyExtractor<org.springframework.web.reactive.function.Flux<org.springframework.web.reactive.function.DataBuffer>,org.springframework.web.reactive.function.ReactiveHttpInputMessage> ( ) { return ( inputMessage , context ) -> inputMessage . getBody ( ) ; }  <METHOD_END>
<METHOD_START> private static < T , S extends org.springframework.web.reactive.function.Publisher<T> < T > > S S ( ReactiveHttpInputMessage org.springframework.web.reactive.function.ReactiveHttpInputMessage , BodyExtractor . BodyExtractor BodyExtractor.Context , ResolvableType org.springframework.web.reactive.function.ResolvableType , java.util.function.Function<org.springframework.web.reactive.function.HttpMessageReader<T>,S> < HttpMessageReader < T > , S > java.util.function.Function<org.springframework.web.reactive.function.HttpMessageReader<T>,S> , java.util.function.Function<java.lang.Throwable,S> < java.lang.Throwable , S > java.util.function.Function<java.lang.Throwable,S> ) { MediaType org.springframework.web.reactive.function.MediaType = org.springframework.web.reactive.function.MediaType ( org.springframework.web.reactive.function.ReactiveHttpInputMessage ) ; java.util.function.Supplier<java.util.stream.Stream<org.springframework.web.reactive.function.HttpMessageReader<?>>> < java.util.stream.Stream<org.springframework.web.reactive.function.HttpMessageReader<?>> < HttpMessageReader < ? > > > java.util.function.Supplier<java.util.stream.Stream<org.springframework.web.reactive.function.HttpMessageReader<?>>> = BodyExtractor.Context . messageReaders ( ) ; return java.util.function.Supplier<java.util.stream.Stream<org.springframework.web.reactive.function.HttpMessageReader<?>>> . get ( ) . filter ( r -> r . canRead ( elementType , contentType ) ) . findFirst ( ) . map ( org.springframework.web.reactive.function.BodyExtractors ::< T > org.springframework.web.reactive.function.HttpMessageReader<T> ) . map ( java.util.function.Function<org.springframework.web.reactive.function.HttpMessageReader<T>,S> ) . orElseGet ( ( ) { List < MediaType > supportedMediaTypes = messageReaders . get ( ) . flatMap ( reader -> reader . getReadableMediaTypes ( ) . stream ( ) ) . collect ( Collectors . toList ( ) ) ; UnsupportedMediaTypeException error = new UnsupportedMediaTypeException ( contentType , supportedMediaTypes ) ; return unsupportedError . apply ( error ) ; } ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.web.reactive.function.HttpMessageReader<org.springframework.web.reactive.function.MultiValueMap<java.lang.String,java.lang.String>> < MultiValueMap < java.lang.String , java.lang.String > > org.springframework.web.reactive.function.HttpMessageReader<org.springframework.web.reactive.function.MultiValueMap<java.lang.String,java.lang.String>> ( BodyExtractor . BodyExtractor BodyExtractor.Context ) { return BodyExtractor.Context . messageReaders ( ) . get ( ) . filter ( messageReader -> messageReader . canRead ( FORM_TYPE , MediaType . APPLICATION_FORM_URLENCODED ) ) . findFirst ( ) . map ( org.springframework.web.reactive.function.BodyExtractors ::< MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.reactive.function.HttpMessageReader<org.springframework.web.reactive.function.MultiValueMap<java.lang.String,java.lang.String>> , String>>cast ) . orElseThrow ( ( ) new IllegalStateException ( STRING + MediaType . APPLICATION_FORM_URLENCODED_VALUE ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.web.reactive.function.MediaType org.springframework.web.reactive.function.MediaType ( HttpMessage org.springframework.web.reactive.function.HttpMessage ) { MediaType org.springframework.web.reactive.function.MediaType = org.springframework.web.reactive.function.HttpMessage . getHeaders ( ) . getContentType ( ) ; return org.springframework.web.reactive.function.MediaType != null ? org.springframework.web.reactive.function.MediaType : MediaType . APPLICATION_OCTET_STREAM ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static < T > org.springframework.web.reactive.function.HttpMessageReader<T> < T > org.springframework.web.reactive.function.HttpMessageReader<T> ( HttpMessageReader < ? > org.springframework.web.reactive.function.HttpMessageReader<?> ) { return ( HttpMessageReader < T > ) org.springframework.web.reactive.function.HttpMessageReader<> ; }  <METHOD_END>
