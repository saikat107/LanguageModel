<METHOD_START> public void ( java.util.Map<java.lang.String,org.springframework.web.reactive.accept.MediaType> < java.lang.String , MediaType > java.util.Map<java.lang.String,org.springframework.web.reactive.accept.MediaType> ) { super( java.util.Map<java.lang.String,org.springframework.web.reactive.accept.MediaType> ); }  <METHOD_END>
<METHOD_START> public void ( ) { super( null ); }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ServerWebExchange org.springframework.web.reactive.accept.ServerWebExchange ) { java.lang.String java.lang.String = org.springframework.web.reactive.accept.ServerWebExchange . getRequest ( ) . getURI ( ) . getRawPath ( ) ; java.lang.String java.lang.String = UriUtils . extractFileExtension ( java.lang.String ) ; return ( StringUtils . hasText ( java.lang.String ) ) ? java.lang.String . java.lang.String ( java.util.Locale . java.util.Locale ) : null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.accept.MediaType org.springframework.web.reactive.accept.MediaType ( java.lang.String java.lang.String ) throws org.springframework.web.reactive.accept.NotAcceptableStatusException { if ( ! this . boolean ) { java.util.Optional<org.springframework.web.reactive.accept.MediaType> < MediaType > java.util.Optional<org.springframework.web.reactive.accept.MediaType> = MediaTypeFactory . getMediaType ( STRING + java.lang.String ) ; if ( java.util.Optional<org.springframework.web.reactive.accept.MediaType> . isPresent ( ) ) { return java.util.Optional<org.springframework.web.reactive.accept.MediaType> . get ( ) ; } } if ( this . boolean ) { return null ; } throw new NotAcceptableStatusException ( getAllMediaTypes ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.accept.MediaType org.springframework.web.reactive.accept.MediaType ( Resource org.springframework.web.reactive.accept.Resource ) { Assert . notNull ( org.springframework.web.reactive.accept.Resource , STRING ) ; MediaType org.springframework.web.reactive.accept.MediaType = null ; java.lang.String java.lang.String = org.springframework.web.reactive.accept.Resource . getFilename ( ) ; java.lang.String java.lang.String = StringUtils . getFilenameExtension ( java.lang.String ) ; if ( java.lang.String != null ) { org.springframework.web.reactive.accept.MediaType = getMediaType ( java.lang.String ) ; } if ( org.springframework.web.reactive.accept.MediaType == null ) { org.springframework.web.reactive.accept.MediaType = MediaTypeFactory . getMediaType ( java.lang.String ) . orElse ( null ) ; } return org.springframework.web.reactive.accept.MediaType ; }  <METHOD_END>