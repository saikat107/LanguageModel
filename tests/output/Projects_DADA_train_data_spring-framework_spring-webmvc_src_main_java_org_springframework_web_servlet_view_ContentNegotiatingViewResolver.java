<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( ContentNegotiationManager org.springframework.web.servlet.view.ContentNegotiationManager ) { this . org.springframework.web.servlet.view.ContentNegotiationManager = org.springframework.web.servlet.view.ContentNegotiationManager ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.view.ContentNegotiationManager org.springframework.web.servlet.view.ContentNegotiationManager ( ) { return this . org.springframework.web.servlet.view.ContentNegotiationManager ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.web.servlet.view.View> < View > java.util.List<org.springframework.web.servlet.view.View> ) { this . java.util.List<org.springframework.web.servlet.view.View> = java.util.List<org.springframework.web.servlet.view.View> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.web.servlet.view.View> < View > java.util.List<org.springframework.web.servlet.view.View> ( ) { return java.util.Collections . java.util.List<org.springframework.web.servlet.view.View> ( this . java.util.List<org.springframework.web.servlet.view.View> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.web.servlet.view.ViewResolver> < ViewResolver > java.util.List<org.springframework.web.servlet.view.ViewResolver> ) { this . java.util.List<org.springframework.web.servlet.view.ViewResolver> = java.util.List<org.springframework.web.servlet.view.ViewResolver> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.web.servlet.view.ViewResolver> < ViewResolver > java.util.List<org.springframework.web.servlet.view.ViewResolver> ( ) { return java.util.Collections . java.util.List<org.springframework.web.servlet.view.ViewResolver> ( this . java.util.List<org.springframework.web.servlet.view.ViewResolver> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ServletContext org.springframework.web.servlet.view.ServletContext ) { java.util.Collection<org.springframework.web.servlet.view.ViewResolver> < ViewResolver > java.util.Collection<org.springframework.web.servlet.view.ViewResolver> = BeanFactoryUtils . beansOfTypeIncludingAncestors ( getApplicationContext ( ) , ViewResolver .class ) . values ( ) ; if ( this . java.util.List<org.springframework.web.servlet.view.ViewResolver> == null ) { this . java.util.List<org.springframework.web.servlet.view.ViewResolver> = new java.util.ArrayList <> ( java.util.Collection<org.springframework.web.servlet.view.ViewResolver> . size ( ) ) ; for ( ViewResolver org.springframework.web.servlet.view.ViewResolver : java.util.Collection<org.springframework.web.servlet.view.ViewResolver> ) { if ( this != org.springframework.web.servlet.view.ViewResolver ) { this . java.util.List<org.springframework.web.servlet.view.ViewResolver> . add ( org.springframework.web.servlet.view.ViewResolver ) ; } } } else { for ( int int = NUMBER ; int < java.util.List<org.springframework.web.servlet.view.ViewResolver> . size ( ) ; int ++ ) { if ( java.util.Collection<org.springframework.web.servlet.view.ViewResolver> . contains ( java.util.List<org.springframework.web.servlet.view.ViewResolver> . get ( int ) ) ) { continue; } java.lang.String java.lang.String = java.util.List<org.springframework.web.servlet.view.ViewResolver> . get ( int ) . getClass ( ) . getName ( ) + int ; getApplicationContext ( ) . getAutowireCapableBeanFactory ( ) . initializeBean ( java.util.List<org.springframework.web.servlet.view.ViewResolver> . get ( int ) , java.lang.String ) ; } } if ( this . java.util.List<org.springframework.web.servlet.view.ViewResolver> . isEmpty ( ) ) { logger . warn ( STRING + STRING ) ; } AnnotationAwareOrderComparator . sort ( this . java.util.List<org.springframework.web.servlet.view.ViewResolver> ) ; this . org.springframework.web.servlet.view.ContentNegotiationManagerFactoryBean . setServletContext ( org.springframework.web.servlet.view.ServletContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.web.servlet.view.ContentNegotiationManager == null ) { this . org.springframework.web.servlet.view.ContentNegotiationManagerFactoryBean . afterPropertiesSet ( ) ; this . org.springframework.web.servlet.view.ContentNegotiationManager = this . org.springframework.web.servlet.view.ContentNegotiationManagerFactoryBean . getObject ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.view.View org.springframework.web.servlet.view.View ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) throws java.lang.Exception { RequestAttributes org.springframework.web.servlet.view.RequestAttributes = RequestContextHolder . getRequestAttributes ( ) ; Assert . state ( org.springframework.web.servlet.view.RequestAttributes instanceof ServletRequestAttributes , STRING ) ; java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> = java.util.List<org.springframework.web.servlet.view.MediaType> ( ( ( ServletRequestAttributes ) org.springframework.web.servlet.view.RequestAttributes ) . getRequest ( ) ) ; if ( java.util.List<org.springframework.web.servlet.view.MediaType> != null ) { java.util.List<org.springframework.web.servlet.view.View> < View > java.util.List<org.springframework.web.servlet.view.View> = java.util.List<org.springframework.web.servlet.view.View> ( java.lang.String , java.util.Locale , java.util.List<org.springframework.web.servlet.view.MediaType> ) ; View org.springframework.web.servlet.view.View = org.springframework.web.servlet.view.View ( java.util.List<org.springframework.web.servlet.view.View> , java.util.List<org.springframework.web.servlet.view.MediaType> , org.springframework.web.servlet.view.RequestAttributes ) ; if ( org.springframework.web.servlet.view.View != null ) { return org.springframework.web.servlet.view.View ; } } if ( this . boolean ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } return org.springframework.web.servlet.view.View ; } else { logger . debug ( STRING ) ; return null ; } }  <METHOD_END>
<METHOD_START> protected java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> ( HttpServletRequest org.springframework.web.servlet.view.HttpServletRequest ) { try { ServletWebRequest org.springframework.web.servlet.view.ServletWebRequest = new ServletWebRequest ( org.springframework.web.servlet.view.HttpServletRequest ) ; java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> = this . org.springframework.web.servlet.view.ContentNegotiationManager . resolveMediaTypes ( org.springframework.web.servlet.view.ServletWebRequest ) ; java.util.List<org.springframework.web.servlet.view.MediaType> = ( ! java.util.List<org.springframework.web.servlet.view.MediaType> . isEmpty ( ) ? java.util.List<org.springframework.web.servlet.view.MediaType> : java.util.Collections . java.util.List ( MediaType . ALL ) ) ; java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> = java.util.List<org.springframework.web.servlet.view.MediaType> ( org.springframework.web.servlet.view.HttpServletRequest ) ; java.util.Set<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.view.MediaType> = new java.util.LinkedHashSet<org.springframework.web.servlet.view.MediaType> <> ( ) ; for ( MediaType org.springframework.web.servlet.view.MediaType : java.util.List<org.springframework.web.servlet.view.MediaType> ) { for ( MediaType org.springframework.web.servlet.view.MediaType : java.util.List<org.springframework.web.servlet.view.MediaType> ) { if ( org.springframework.web.servlet.view.MediaType . isCompatibleWith ( org.springframework.web.servlet.view.MediaType ) ) { java.util.Set<org.springframework.web.servlet.view.MediaType> . add ( org.springframework.web.servlet.view.MediaType ( org.springframework.web.servlet.view.MediaType , org.springframework.web.servlet.view.MediaType ) ) ; } } } java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> = new java.util.ArrayList <> ( java.util.Set<org.springframework.web.servlet.view.MediaType> ) ; MediaType . sortBySpecificityAndQuality ( java.util.List<org.springframework.web.servlet.view.MediaType> ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.util.List<org.springframework.web.servlet.view.MediaType> + STRING + STRING + java.util.List<org.springframework.web.servlet.view.MediaType> + STRING ) ; } return java.util.List<org.springframework.web.servlet.view.MediaType> ; } catch ( HttpMediaTypeNotAcceptableException org.springframework.web.servlet.view.HttpMediaTypeNotAcceptableException ) { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> ( HttpServletRequest org.springframework.web.servlet.view.HttpServletRequest ) { java.util.Set<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.Set<org.springframework.web.servlet.view.MediaType> = ( java.util.Set<org.springframework.web.servlet.view.MediaType> < MediaType > ) org.springframework.web.servlet.view.HttpServletRequest . getAttribute ( HandlerMapping . PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE ) ; if ( ! CollectionUtils . isEmpty ( java.util.Set<org.springframework.web.servlet.view.MediaType> ) ) { return new java.util.ArrayList <> ( java.util.Set<org.springframework.web.servlet.view.MediaType> ) ; } else { return java.util.Collections . java.util.List ( MediaType . ALL ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.view.MediaType org.springframework.web.servlet.view.MediaType ( MediaType org.springframework.web.servlet.view.MediaType , MediaType org.springframework.web.servlet.view.MediaType ) { org.springframework.web.servlet.view.MediaType = org.springframework.web.servlet.view.MediaType . copyQualityValue ( org.springframework.web.servlet.view.MediaType ) ; return ( MediaType . SPECIFICITY_COMPARATOR . compare ( org.springframework.web.servlet.view.MediaType , org.springframework.web.servlet.view.MediaType ) < NUMBER ? org.springframework.web.servlet.view.MediaType : org.springframework.web.servlet.view.MediaType ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.web.servlet.view.View> < View > java.util.List<org.springframework.web.servlet.view.View> ( java.lang.String java.lang.String , java.util.Locale java.util.Locale , java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> )			throws java.lang.Exception { java.util.List<org.springframework.web.servlet.view.View> < View > java.util.List<org.springframework.web.servlet.view.View> = new java.util.ArrayList<org.springframework.web.servlet.view.View> <> ( ) ; for ( ViewResolver org.springframework.web.servlet.view.ViewResolver : this . java.util.List<org.springframework.web.servlet.view.ViewResolver> ) { View org.springframework.web.servlet.view.View = org.springframework.web.servlet.view.ViewResolver . resolveViewName ( java.lang.String , java.util.Locale ) ; if ( org.springframework.web.servlet.view.View != null ) { java.util.List<org.springframework.web.servlet.view.View> . add ( org.springframework.web.servlet.view.View ) ; } for ( MediaType org.springframework.web.servlet.view.MediaType : java.util.List<org.springframework.web.servlet.view.MediaType> ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = this . org.springframework.web.servlet.view.ContentNegotiationManager . resolveFileExtensions ( org.springframework.web.servlet.view.MediaType ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.String java.lang.String = java.lang.String + '.' + java.lang.String ; org.springframework.web.servlet.view.View = org.springframework.web.servlet.view.ViewResolver . resolveViewName ( java.lang.String , java.util.Locale ) ; if ( org.springframework.web.servlet.view.View != null ) { java.util.List<org.springframework.web.servlet.view.View> . add ( org.springframework.web.servlet.view.View ) ; } } } } if ( ! CollectionUtils . isEmpty ( this . java.util.List<org.springframework.web.servlet.view.View> ) ) { java.util.List<org.springframework.web.servlet.view.View> . addAll ( this . java.util.List<org.springframework.web.servlet.view.View> ) ; } return java.util.List<org.springframework.web.servlet.view.View> ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.view.View org.springframework.web.servlet.view.View ( java.util.List<org.springframework.web.servlet.view.View> < View > java.util.List<org.springframework.web.servlet.view.View> , java.util.List<org.springframework.web.servlet.view.MediaType> < MediaType > java.util.List<org.springframework.web.servlet.view.MediaType> , RequestAttributes org.springframework.web.servlet.view.RequestAttributes ) { for ( View org.springframework.web.servlet.view.View : java.util.List<org.springframework.web.servlet.view.View> ) { if ( org.springframework.web.servlet.view.View instanceof SmartView ) { SmartView org.springframework.web.servlet.view.SmartView = ( SmartView ) org.springframework.web.servlet.view.View ; if ( org.springframework.web.servlet.view.SmartView . isRedirectView ( ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.web.servlet.view.View + STRING ) ; } return org.springframework.web.servlet.view.View ; } } } for ( MediaType org.springframework.web.servlet.view.MediaType : java.util.List<org.springframework.web.servlet.view.MediaType> ) { for ( View org.springframework.web.servlet.view.View : java.util.List<org.springframework.web.servlet.view.View> ) { if ( StringUtils . hasText ( org.springframework.web.servlet.view.View . getContentType ( ) ) ) { MediaType org.springframework.web.servlet.view.MediaType = MediaType . parseMediaType ( org.springframework.web.servlet.view.View . getContentType ( ) ) ; if ( org.springframework.web.servlet.view.MediaType . isCompatibleWith ( org.springframework.web.servlet.view.MediaType ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.web.servlet.view.View + STRING + org.springframework.web.servlet.view.MediaType + STRING ) ; } org.springframework.web.servlet.view.RequestAttributes . setAttribute ( View . SELECTED_CONTENT_TYPE , org.springframework.web.servlet.view.MediaType , RequestAttributes . SCOPE_REQUEST ) ; return org.springframework.web.servlet.view.View ; } } } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , HttpServletRequest org.springframework.web.servlet.view.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.view.HttpServletResponse ) { org.springframework.web.servlet.view.HttpServletResponse . setStatus ( HttpServletResponse . SC_NOT_ACCEPTABLE ) ; }  <METHOD_END>
