<METHOD_START> public void ( ) { this( ResourceEncoder . DEFAULT_BUFFER_SIZE ); }  <METHOD_END>
<METHOD_START> public void ( int int ) { this . org.springframework.http.codec.ResourceEncoder = new ResourceEncoder ( int ) ; this . org.springframework.http.codec.ResourceRegionEncoder = new ResourceRegionEncoder ( int ) ; this . java.util.List<org.springframework.http.codec.MediaType> = MediaType . asMediaTypes ( this . org.springframework.http.codec.ResourceEncoder . getEncodableMimeTypes ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ResolvableType org.springframework.http.codec.ResolvableType , MediaType org.springframework.http.codec.MediaType ) { return this . org.springframework.http.codec.ResourceEncoder . canEncode ( org.springframework.http.codec.ResolvableType , org.springframework.http.codec.MediaType ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.http.codec.MediaType> < MediaType > java.util.List<org.springframework.http.codec.MediaType> ( ) { return this . java.util.List<org.springframework.http.codec.MediaType> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.http.codec.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.codec.Mono<java.lang.Void> ( Publisher < ? extends Resource > org.springframework.http.codec.Publisher<? extends org.springframework.http.codec.Resource> , ResolvableType org.springframework.http.codec.ResolvableType , MediaType org.springframework.http.codec.MediaType , ReactiveHttpOutputMessage org.springframework.http.codec.ReactiveHttpOutputMessage , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return Mono . from ( org.springframework.http.codec.Publisher<> ) . then ( resource -> writeResource ( resource , elementType , mediaType , message , hints ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.codec.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.codec.Mono<java.lang.Void> ( Resource org.springframework.http.codec.Resource , ResolvableType org.springframework.http.codec.ResolvableType , MediaType org.springframework.http.codec.MediaType , ReactiveHttpOutputMessage org.springframework.http.codec.ReactiveHttpOutputMessage , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { HttpHeaders org.springframework.http.codec.HttpHeaders = org.springframework.http.codec.ReactiveHttpOutputMessage . getHeaders ( ) ; MediaType org.springframework.http.codec.MediaType = org.springframework.http.codec.MediaType ( org.springframework.http.codec.MediaType , org.springframework.http.codec.Resource ) ; org.springframework.http.codec.HttpHeaders . setContentType ( org.springframework.http.codec.MediaType ) ; if ( org.springframework.http.codec.HttpHeaders . getContentLength ( ) < NUMBER ) { java.util.OptionalLong ( org.springframework.http.codec.Resource ) . ifPresent ( org.springframework.http.codec.HttpHeaders :: setContentLength ) ; } return java.util.Optional<org.springframework.http.codec.Mono<java.lang.Void>> ( org.springframework.http.codec.Resource , null , org.springframework.http.codec.ReactiveHttpOutputMessage ) . orElseGet ( ( ) { Mono < Resource > input = Mono . just ( resource ) ; DataBufferFactory factory = message . bufferFactory ( ) ; Flux < DataBuffer > body = this . encoder . encode ( input , factory , type , resourceMediaType , hints ) ; return message . writeWith ( body ) ; } ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.http.codec.MediaType org.springframework.http.codec.MediaType ( MediaType org.springframework.http.codec.MediaType , Resource org.springframework.http.codec.Resource ) { if ( org.springframework.http.codec.MediaType != null && org.springframework.http.codec.MediaType . isConcrete ( ) && ! org.springframework.http.codec.MediaType . equals ( MediaType . APPLICATION_OCTET_STREAM ) ) { return org.springframework.http.codec.MediaType ; } return MediaTypeFactory . getMediaType ( org.springframework.http.codec.Resource ) . orElse ( MediaType . APPLICATION_OCTET_STREAM ) ; }  <METHOD_END>
<METHOD_START> private static java.util.OptionalLong java.util.OptionalLong ( Resource org.springframework.http.codec.Resource ) { if ( InputStreamResource .class != org.springframework.http.codec.Resource . getClass ( ) ) { try { return java.util.OptionalLong . java.util.OptionalLong ( org.springframework.http.codec.Resource . contentLength ( ) ) ; } catch ( java.io.IOException java.io.IOException ) {			} } return java.util.OptionalLong . java.util.OptionalLong ( ) ; }  <METHOD_END>
<METHOD_START> private static java.util.Optional<org.springframework.http.codec.Mono<java.lang.Void>> < Mono < java.lang.Void > > java.util.Optional<org.springframework.http.codec.Mono<java.lang.Void>> ( Resource org.springframework.http.codec.Resource , ResourceRegion org.springframework.http.codec.ResourceRegion , ReactiveHttpOutputMessage org.springframework.http.codec.ReactiveHttpOutputMessage ) { if ( org.springframework.http.codec.ReactiveHttpOutputMessage instanceof ZeroCopyHttpOutputMessage ) { if ( org.springframework.http.codec.Resource . isFile ( ) ) { try { java.io.File java.io.File = org.springframework.http.codec.Resource . getFile ( ) ; long long = org.springframework.http.codec.ResourceRegion != null ? org.springframework.http.codec.ResourceRegion . getPosition ( ) : NUMBER ; long long = org.springframework.http.codec.ResourceRegion != null ? org.springframework.http.codec.ResourceRegion . getCount ( ) : java.io.File . long ( ) ; return java.util.Optional . java.util.Optional ( ( ( ZeroCopyHttpOutputMessage ) org.springframework.http.codec.ReactiveHttpOutputMessage ) . writeWith ( java.io.File , long , long ) ) ; } catch ( java.io.IOException java.io.IOException ) { } } } return java.util.Optional . java.util.Optional<org.springframework.http.codec.Mono<java.lang.Void>> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.http.codec.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.codec.Mono<java.lang.Void> ( Publisher < ? extends Resource > org.springframework.http.codec.Publisher<? extends org.springframework.http.codec.Resource> , ResolvableType org.springframework.http.codec.ResolvableType , ResolvableType org.springframework.http.codec.ResolvableType , MediaType org.springframework.http.codec.MediaType , ServerHttpRequest org.springframework.http.codec.ServerHttpRequest , ServerHttpResponse org.springframework.http.codec.ServerHttpResponse , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { HttpHeaders org.springframework.http.codec.HttpHeaders = org.springframework.http.codec.ServerHttpResponse . getHeaders ( ) ; org.springframework.http.codec.HttpHeaders . set ( HttpHeaders . ACCEPT_RANGES , STRING ) ; java.util.List<org.springframework.http.codec.HttpRange> < HttpRange > java.util.List<org.springframework.http.codec.HttpRange> ; try { java.util.List<org.springframework.http.codec.HttpRange> = org.springframework.http.codec.ServerHttpRequest . getHeaders ( ) . getRange ( ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { org.springframework.http.codec.ServerHttpResponse . setStatusCode ( HttpStatus . REQUESTED_RANGE_NOT_SATISFIABLE ) ; return org.springframework.http.codec.ServerHttpResponse . setComplete ( ) ; } return Mono . from ( org.springframework.http.codec.Publisher<> ) . then ( resource -> { if ( ranges . isEmpty ( ) ) { return writeResource ( resource , elementType , mediaType , response , hints ) ; } response . setStatusCode ( HttpStatus . PARTIAL_CONTENT ) ; List < ResourceRegion > regions = HttpRange . toResourceRegions ( ranges , resource ) ; MediaType resourceMediaType = getResourceMediaType ( mediaType , resource ) ; if ( regions . size ( ) == NUMBER ) { ResourceRegion region = regions . get ( NUMBER ) ; headers . setContentType ( resourceMediaType ) ; lengthOf ( resource ) . ifPresent ( length -> { long start = region . getPosition ( ) ; long end = start + region . getCount ( ) - NUMBER ; end = Math . min ( end , length - NUMBER ) ; headers . add ( STRING , STRING + start + '-' + end + '/' + length ) ; headers . setContentLength ( end - start + NUMBER ) ; } ) ; return writeSingleRegion ( region , response ) ; } else { String boundary = MimeTypeUtils . generateMultipartBoundaryString ( ) ; MediaType multipartType = MediaType . parseMediaType ( STRING + boundary ) ; headers . setContentType ( multipartType ) ; Map < String , Object > theHints = new HashMap <> ( hints ) ; theHints . put ( ResourceRegionEncoder . BOUNDARY_STRING_HINT , boundary ) ; return encodeAndWriteRegions ( Flux . fromIterable ( regions ) , resourceMediaType , response , theHints ) ; } } ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.codec.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.codec.Mono<java.lang.Void> ( ResourceRegion org.springframework.http.codec.ResourceRegion , ReactiveHttpOutputMessage org.springframework.http.codec.ReactiveHttpOutputMessage ) { return java.util.Optional<org.springframework.http.codec.Mono<java.lang.Void>> ( org.springframework.http.codec.ResourceRegion . getResource ( ) , org.springframework.http.codec.ResourceRegion , org.springframework.http.codec.ReactiveHttpOutputMessage ) . orElseGet ( ( ) { Publisher < ? extends ResourceRegion > input = Mono . just ( region ) ; MediaType mediaType = message . getHeaders ( ) . getContentType ( ) ; return encodeAndWriteRegions ( input , mediaType , message , emptyMap ( ) ) ; } ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.http.codec.Mono<java.lang.Void> < java.lang.Void > org.springframework.http.codec.Mono<java.lang.Void> ( Publisher < ? extends ResourceRegion > org.springframework.http.codec.Publisher<? extends org.springframework.http.codec.ResourceRegion> , MediaType org.springframework.http.codec.MediaType , ReactiveHttpOutputMessage org.springframework.http.codec.ReactiveHttpOutputMessage , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { Flux < DataBuffer > org.springframework.http.codec.Flux<org.springframework.http.codec.DataBuffer> = this . org.springframework.http.codec.ResourceRegionEncoder . encode ( org.springframework.http.codec.Publisher<> , org.springframework.http.codec.ReactiveHttpOutputMessage . bufferFactory ( ) , org.springframework.http.codec.ResolvableType , org.springframework.http.codec.MediaType , java.util.Map<java.lang.String,java.lang.Object> ) ; return org.springframework.http.codec.ReactiveHttpOutputMessage . writeWith ( org.springframework.http.codec.Flux<org.springframework.http.codec.DataBuffer> ) ; }  <METHOD_END>
