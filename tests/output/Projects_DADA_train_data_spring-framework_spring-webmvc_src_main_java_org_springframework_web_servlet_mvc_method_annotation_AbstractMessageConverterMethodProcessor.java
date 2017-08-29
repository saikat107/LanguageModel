<METHOD_START> protected void ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) { this( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , null ); }  <METHOD_END>
<METHOD_START> protected void ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , ContentNegotiationManager org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager ) { this( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager , null ); }  <METHOD_END>
<METHOD_START> protected void ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , ContentNegotiationManager org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager , java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ) { super( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , java.util.List<java.lang.Object> ); this . org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager = ( org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager != null ? org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager : new ContentNegotiationManager ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy = org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy ( this . org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager ) ; this . java.util.Set<java.lang.String> . boolean ( this . org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager . getAllFileExtensions ( ) ) ; this . java.util.Set<java.lang.String> . boolean ( java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy ( ContentNegotiationManager org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager ) { java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy> < PathExtensionContentNegotiationStrategy > java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy> = PathExtensionContentNegotiationStrategy .class ; PathExtensionContentNegotiationStrategy org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy = org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager . getStrategy ( java.lang.Class<org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy> ) ; return ( org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy != null ? org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy : new PathExtensionContentNegotiationStrategy ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ( NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) { HttpServletResponse org.springframework.web.servlet.mvc.method.annotation.HttpServletResponse = org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest . getNativeResponse ( HttpServletResponse .class ) ; return new ServletServerHttpResponse ( org.springframework.web.servlet.mvc.method.annotation.HttpServletResponse ) ; }  <METHOD_END>
<METHOD_START> protected < T > void void ( T T , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest )			throws java.io.IOException , org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotAcceptableException , org.springframework.web.servlet.mvc.method.annotation.HttpMessageNotWritableException { ServletServerHttpRequest org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest = createInputMessage ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; ServletServerHttpResponse org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse = org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; void ( T , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > void void ( T T , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , ServletServerHttpRequest org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , ServletServerHttpResponse org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse )			throws java.io.IOException , org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotAcceptableException , org.springframework.web.servlet.mvc.method.annotation.HttpMessageNotWritableException { java.lang.Object java.lang.Object ; java.lang.Class<?> < ? > java.lang.Class<?> ; java.lang.reflect.Type java.lang.reflect.Type ; if ( T instanceof java.lang.CharSequence ) { java.lang.Object = T . java.lang.String ( ) ; java.lang.Class<?> = java.lang.String .class ; java.lang.reflect.Type = java.lang.String .class ; } else { java.lang.Object = T ; java.lang.Class<?> = java.lang.Class<?> ( java.lang.Object , org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ; java.lang.reflect.Type = java.lang.reflect.Type ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ; } HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest = org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest . getServletRequest ( ) ; java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest ) ; java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.Class<> , java.lang.reflect.Type ) ; if ( java.lang.Object != null && java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> . isEmpty ( ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Class<> ) ; } java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> = new java.util.LinkedHashSet<org.springframework.web.servlet.mvc.method.annotation.MediaType> <> ( ) ; for ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType : java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) { for ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType : java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) { if ( org.springframework.web.servlet.mvc.method.annotation.MediaType . isCompatibleWith ( org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> . add ( org.springframework.web.servlet.mvc.method.annotation.MediaType ( org.springframework.web.servlet.mvc.method.annotation.MediaType , org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) ; } } } if ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> . isEmpty ( ) ) { if ( java.lang.Object != null ) { throw new HttpMediaTypeNotAcceptableException ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; } return; } java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = new java.util.ArrayList <> ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; MediaType . sortBySpecificityAndQuality ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType = null ; for ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType : java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) { if ( org.springframework.web.servlet.mvc.method.annotation.MediaType . isConcrete ( ) ) { org.springframework.web.servlet.mvc.method.annotation.MediaType = org.springframework.web.servlet.mvc.method.annotation.MediaType ; break; } else if ( org.springframework.web.servlet.mvc.method.annotation.MediaType . equals ( MediaType . ALL ) || org.springframework.web.servlet.mvc.method.annotation.MediaType . equals ( org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { org.springframework.web.servlet.mvc.method.annotation.MediaType = MediaType . APPLICATION_OCTET_STREAM ; break; } } if ( org.springframework.web.servlet.mvc.method.annotation.MediaType != null ) { org.springframework.web.servlet.mvc.method.annotation.MediaType = org.springframework.web.servlet.mvc.method.annotation.MediaType . removeQualityValue ( ) ; for ( HttpMessageConverter < ? > org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?> : this . messageConverters ) { if ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> instanceof GenericHttpMessageConverter ) { if ( ( ( GenericHttpMessageConverter ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> ) . canWrite ( java.lang.reflect.Type , java.lang.Class<> , org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { java.lang.Object = ( T ) getAdvice ( ) . beforeBodyWrite ( java.lang.Object , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.MediaType , ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < ? extends HttpMessageConverter < ? > > ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . getClass ( ) , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; if ( java.lang.Object != null ) { void ( org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; ( ( GenericHttpMessageConverter ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> ) . write ( java.lang.Object , java.lang.reflect.Type , org.springframework.web.servlet.mvc.method.annotation.MediaType , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.Object + STRING + org.springframework.web.servlet.mvc.method.annotation.MediaType + STRING + org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> + STRING ) ; } } return; } } else if ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . canWrite ( java.lang.Class<> , org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { java.lang.Object = ( T ) getAdvice ( ) . beforeBodyWrite ( java.lang.Object , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.MediaType , ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < ? extends HttpMessageConverter < ? > > ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . getClass ( ) , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; if ( java.lang.Object != null ) { void ( org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; ( ( HttpMessageConverter ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> ) . write ( java.lang.Object , org.springframework.web.servlet.mvc.method.annotation.MediaType , org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.Object + STRING + org.springframework.web.servlet.mvc.method.annotation.MediaType + STRING + org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> + STRING ) ; } } return; } } } if ( java.lang.Object != null ) { throw new HttpMediaTypeNotAcceptableException ( this . allSupportedMediaTypes ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { return ( java.lang.Object != null ? java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) : org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.reflect.Type java.lang.reflect.Type ( MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { if ( HttpEntity .class . boolean ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterType ( ) ) ) { return ResolvableType . forType ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getGenericParameterType ( ) ) . getGeneric ( NUMBER ) . getType ( ) ; } else { return org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getGenericParameterType ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) protected java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.Class<> , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.reflect.Type java.lang.reflect.Type ) { java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> = ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > ) org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest . getAttribute ( HandlerMapping . PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE ) ; if ( ! CollectionUtils . isEmpty ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ) { return new java.util.ArrayList <> ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; } else if ( ! this . allSupportedMediaTypes . isEmpty ( ) ) { java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = new java.util.ArrayList<org.springframework.web.servlet.mvc.method.annotation.MediaType> <> ( ) ; for ( HttpMessageConverter < ? > org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?> : this . messageConverters ) { if ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> instanceof GenericHttpMessageConverter && java.lang.reflect.Type != null ) { if ( ( ( GenericHttpMessageConverter < ? > ) org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> ) . canWrite ( java.lang.reflect.Type , java.lang.Class<> , null ) ) { java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> . addAll ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . getSupportedMediaTypes ( ) ) ; } } else if ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . canWrite ( java.lang.Class<> , null ) ) { java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> . addAll ( org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<> . getSupportedMediaTypes ( ) ) ; } } return java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ; } else { return java.util.Collections . java.util.List ( MediaType . ALL ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest ) throws org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotAcceptableException { java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = this . org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager . resolveMediaTypes ( new ServletWebRequest ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest ) ) ; return ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> . isEmpty ( ) ? java.util.Collections . java.util.List ( MediaType . ALL ) : java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.method.annotation.MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType , MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType ) { MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType = org.springframework.web.servlet.mvc.method.annotation.MediaType . copyQualityValue ( org.springframework.web.servlet.mvc.method.annotation.MediaType ) ; return ( MediaType . SPECIFICITY_COMPARATOR . compare ( org.springframework.web.servlet.mvc.method.annotation.MediaType , org.springframework.web.servlet.mvc.method.annotation.MediaType ) <= NUMBER ? org.springframework.web.servlet.mvc.method.annotation.MediaType : org.springframework.web.servlet.mvc.method.annotation.MediaType ) ; }  <METHOD_END>
<METHOD_START> private void void ( ServletServerHttpRequest org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest , ServletServerHttpResponse org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse ) { HttpHeaders org.springframework.web.servlet.mvc.method.annotation.HttpHeaders = org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse . getHeaders ( ) ; if ( org.springframework.web.servlet.mvc.method.annotation.HttpHeaders . containsKey ( HttpHeaders . CONTENT_DISPOSITION ) ) { return; } try { int int = org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpResponse . getServletResponse ( ) . getStatus ( ) ; if ( int < NUMBER || int > NUMBER ) { return; } } catch ( java.lang.Throwable java.lang.Throwable ) { } HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest = org.springframework.web.servlet.mvc.method.annotation.ServletServerHttpRequest . getServletRequest ( ) ; java.lang.String java.lang.String = org.springframework.web.servlet.mvc.method.annotation.UrlPathHelper . getOriginatingRequestUri ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest ) ; int int = java.lang.String . int ( '/' ) + NUMBER ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int ) ; java.lang.String java.lang.String = STRING ; int = java.lang.String . int ( ';' ) ; if ( int != - NUMBER ) { java.lang.String = java.lang.String . java.lang.String ( int ) ; java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) ; } java.lang.String = org.springframework.web.servlet.mvc.method.annotation.UrlPathHelper . decodeRequestString ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.String ) ; java.lang.String java.lang.String = StringUtils . getFilenameExtension ( java.lang.String ) ; java.lang.String = org.springframework.web.servlet.mvc.method.annotation.UrlPathHelper . decodeRequestString ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.String ) ; java.lang.String java.lang.String = StringUtils . getFilenameExtension ( java.lang.String ) ; if ( ! boolean ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.String ) || ! boolean ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.String ) ) { org.springframework.web.servlet.mvc.method.annotation.HttpHeaders . add ( HttpHeaders . CONTENT_DISPOSITION , STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private boolean boolean ( HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , java.lang.String java.lang.String ) { if ( ! StringUtils . hasText ( java.lang.String ) ) { return true ; } java.lang.String = java.lang.String . java.lang.String ( java.util.Locale . java.util.Locale ) ; if ( this . java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { return true ; } java.lang.String java.lang.String = ( java.lang.String ) org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest . getAttribute ( HandlerMapping . BEST_MATCHING_PATTERN_ATTRIBUTE ) ; if ( java.lang.String != null && java.lang.String . boolean ( STRING + java.lang.String ) ) { return true ; } if ( java.lang.String . boolean ( STRING ) ) { java.lang.String java.lang.String = HandlerMapping . PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE ; java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> = ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > ) org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest . getAttribute ( java.lang.String ) ; if ( ! CollectionUtils . isEmpty ( java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) && java.util.Set<org.springframework.web.servlet.mvc.method.annotation.MediaType> . contains ( MediaType . TEXT_HTML ) ) { return true ; } } return boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = null ; try { java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> = this . org.springframework.web.servlet.mvc.method.annotation.PathExtensionContentNegotiationStrategy . resolveMediaTypeKey ( null , java.lang.String ) ; } catch ( HttpMediaTypeNotAcceptableException org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotAcceptableException ) { } if ( CollectionUtils . isEmpty ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ) { return false ; } for ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType : java.util.List<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) { if ( ! boolean ( org.springframework.web.servlet.mvc.method.annotation.MediaType ) ) { return false ; } } return true ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType ) { return ( java.util.Set<java.lang.String> . boolean ( org.springframework.web.servlet.mvc.method.annotation.MediaType . getType ( ) ) || org.springframework.web.servlet.mvc.method.annotation.MediaType . getSubtype ( ) . endsWith ( STRING ) ) ; }  <METHOD_END>
