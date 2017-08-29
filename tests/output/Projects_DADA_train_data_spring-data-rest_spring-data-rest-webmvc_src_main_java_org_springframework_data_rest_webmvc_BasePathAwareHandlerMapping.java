<METHOD_START> public void ( RepositoryRestConfiguration org.springframework.data.rest.webmvc.RepositoryRestConfiguration ) { Assert . notNull ( org.springframework.data.rest.webmvc.RepositoryRestConfiguration , STRING ) ; this . org.springframework.data.rest.webmvc.RepositoryRestConfiguration = org.springframework.data.rest.webmvc.RepositoryRestConfiguration ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.rest.webmvc.HandlerMethod org.springframework.data.rest.webmvc.HandlerMethod ( java.lang.String java.lang.String , HttpServletRequest org.springframework.data.rest.webmvc.HttpServletRequest ) throws java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.MediaType> < MediaType > java.util.List<org.springframework.data.rest.webmvc.MediaType> = new java.util.ArrayList<org.springframework.data.rest.webmvc.MediaType> < MediaType > ( ) ; boolean boolean = false ; for ( MediaType org.springframework.data.rest.webmvc.MediaType : MediaType . parseMediaTypes ( org.springframework.data.rest.webmvc.HttpServletRequest . getHeader ( HttpHeaders . ACCEPT ) ) ) { MediaType org.springframework.data.rest.webmvc.MediaType = org.springframework.data.rest.webmvc.MediaType . removeQualityValue ( ) ; if ( org.springframework.data.rest.webmvc.MediaType . equals ( org.springframework.data.rest.webmvc.RepositoryRestConfiguration . getDefaultMediaType ( ) ) ) { boolean = true ; } if ( ! org.springframework.data.rest.webmvc.MediaType . equals ( MediaType . ALL ) ) { java.util.List<org.springframework.data.rest.webmvc.MediaType> . add ( org.springframework.data.rest.webmvc.MediaType ) ; } } if ( ! boolean ) { java.util.List<org.springframework.data.rest.webmvc.MediaType> . add ( org.springframework.data.rest.webmvc.RepositoryRestConfiguration . getDefaultMediaType ( ) ) ; } return super. lookupHandlerMethod ( java.lang.String , new org.springframework.data.rest.webmvc.BasePathAwareHandlerMapping.CustomAcceptHeaderHttpServletRequest ( org.springframework.data.rest.webmvc.HttpServletRequest , java.util.List<org.springframework.data.rest.webmvc.MediaType> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.rest.webmvc.RequestMappingInfo org.springframework.data.rest.webmvc.RequestMappingInfo ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> ) { RequestMappingInfo org.springframework.data.rest.webmvc.RequestMappingInfo = super. getMappingForMethod ( java.lang.reflect.Method , java.lang.Class<> ) ; if ( org.springframework.data.rest.webmvc.RequestMappingInfo == null ) { return null ; } PatternsRequestCondition org.springframework.data.rest.webmvc.PatternsRequestCondition = org.springframework.data.rest.webmvc.PatternsRequestCondition ( org.springframework.data.rest.webmvc.RequestMappingInfo . getPatternsCondition ( ) , java.lang.String ) ; ProducesRequestCondition org.springframework.data.rest.webmvc.ProducesRequestCondition = org.springframework.data.rest.webmvc.ProducesRequestCondition ( org.springframework.data.rest.webmvc.RequestMappingInfo . getProducesCondition ( ) ) ; return new RequestMappingInfo ( org.springframework.data.rest.webmvc.PatternsRequestCondition , org.springframework.data.rest.webmvc.RequestMappingInfo . getMethodsCondition ( ) , org.springframework.data.rest.webmvc.RequestMappingInfo . getParamsCondition ( ) , org.springframework.data.rest.webmvc.RequestMappingInfo . getHeadersCondition ( ) , org.springframework.data.rest.webmvc.RequestMappingInfo . getConsumesCondition ( ) , org.springframework.data.rest.webmvc.ProducesRequestCondition , org.springframework.data.rest.webmvc.RequestMappingInfo . getCustomCondition ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.rest.webmvc.PatternsRequestCondition org.springframework.data.rest.webmvc.PatternsRequestCondition ( PatternsRequestCondition org.springframework.data.rest.webmvc.PatternsRequestCondition , java.lang.String java.lang.String ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = org.springframework.data.rest.webmvc.PatternsRequestCondition . getPatterns ( ) ; java.lang.String [] java.lang.String[] = new java.lang.String [ java.util.Set<java.lang.String> . int ( ) ] ; int int = NUMBER ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { java.lang.String[] [ int ++ ] = java.lang.String . java.lang.String ( java.lang.String ) ; } return new PatternsRequestCondition ( java.lang.String[] , getUrlPathHelper ( ) , getPathMatcher ( ) , useSuffixPatternMatch ( ) , useTrailingSlashMatch ( ) , getFileExtensions ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.rest.webmvc.ProducesRequestCondition org.springframework.data.rest.webmvc.ProducesRequestCondition ( ProducesRequestCondition org.springframework.data.rest.webmvc.ProducesRequestCondition ) { return org.springframework.data.rest.webmvc.ProducesRequestCondition ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.lang.Class<> . A ( BasePathAwareController .class ) != null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.net.URI java.net.URI = org.springframework.data.rest.webmvc.RepositoryRestConfiguration . getBaseUri ( ) ; if ( java.net.URI . boolean ( ) ) { HttpServletRequest org.springframework.data.rest.webmvc.HttpServletRequest = new org.springframework.data.rest.webmvc.BasePathAwareHandlerMapping.UriAwareHttpServletRequest ( getServletContext ( ) , java.net.URI ) ; this . java.lang.String = org.springframework.data.rest.webmvc.UrlPathHelper . getPathWithinApplication ( org.springframework.data.rest.webmvc.HttpServletRequest ) ; } else { this . java.lang.String = java.net.URI . java.lang.String ( ) ; } super. afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ServletContext org.springframework.data.rest.webmvc.ServletContext , java.net.URI java.net.URI ) { this . org.springframework.data.rest.webmvc.ServletContext = org.springframework.data.rest.webmvc.ServletContext ; this . java.lang.String = java.net.URI . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.io.UnsupportedEncodingException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.ServletInputStream org.springframework.data.rest.webmvc.ServletInputStream ( ) java.io.IOException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.String[]> < java.lang.String , java.lang.String [] > java.util.Map<java.lang.String,java.lang.String[]> ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.BufferedReader java.io.BufferedReader ( ) java.io.IOException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Locale java.util.Locale ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.util.Locale> < java.util.Locale > java.util.Enumeration<java.util.Locale> ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.RequestDispatcher org.springframework.data.rest.webmvc.RequestDispatcher ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.ServletContext org.springframework.data.rest.webmvc.ServletContext ( ) { return org.springframework.data.rest.webmvc.ServletContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.AsyncContext org.springframework.data.rest.webmvc.AsyncContext ( ) java.lang.IllegalStateException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.AsyncContext org.springframework.data.rest.webmvc.AsyncContext ( ServletRequest org.springframework.data.rest.webmvc.ServletRequest , ServletResponse org.springframework.data.rest.webmvc.ServletResponse )				throws java.lang.IllegalStateException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.AsyncContext org.springframework.data.rest.webmvc.AsyncContext ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.DispatcherType org.springframework.data.rest.webmvc.DispatcherType ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.Cookie [] org.springframework.data.rest.webmvc.Cookie[] ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.rest.webmvc.ServletContext . getContextPath ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.security.Principal java.security.Principal ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.StringBuffer java.lang.StringBuffer ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.HttpSession org.springframework.data.rest.webmvc.HttpSession ( boolean boolean ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.HttpSession org.springframework.data.rest.webmvc.HttpSession ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( HttpServletResponse org.springframework.data.rest.webmvc.HttpServletResponse ) throws java.io.IOException , org.springframework.data.rest.webmvc.ServletException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.springframework.data.rest.webmvc.ServletException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) org.springframework.data.rest.webmvc.ServletException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.data.rest.webmvc.Part> < Part > java.util.Collection<org.springframework.data.rest.webmvc.Part> ( ) java.io.IOException , org.springframework.data.rest.webmvc.ServletException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.Part org.springframework.data.rest.webmvc.Part ( java.lang.String java.lang.String ) throws java.io.IOException , org.springframework.data.rest.webmvc.ServletException { throw new java.lang.UnsupportedOperationException ( ) ; }  <METHOD_END>
<METHOD_START> public void ( HttpServletRequest org.springframework.data.rest.webmvc.HttpServletRequest , java.util.List<org.springframework.data.rest.webmvc.MediaType> < MediaType > java.util.List<org.springframework.data.rest.webmvc.MediaType> ) { super( org.springframework.data.rest.webmvc.HttpServletRequest ); Assert . notEmpty ( java.util.List<org.springframework.data.rest.webmvc.MediaType> , STRING ) ; this . java.util.List<org.springframework.data.rest.webmvc.MediaType> = java.util.List<org.springframework.data.rest.webmvc.MediaType> ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( java.util.List<org.springframework.data.rest.webmvc.MediaType> . size ( ) ) ; for ( MediaType org.springframework.data.rest.webmvc.MediaType : java.util.List<org.springframework.data.rest.webmvc.MediaType> ) { java.util.List<java.lang.String> . boolean ( org.springframework.data.rest.webmvc.MediaType . toString ( ) ) ; } this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { if ( HttpHeaders . ACCEPT . equalsIgnoreCase ( java.lang.String ) && java.util.List<org.springframework.data.rest.webmvc.MediaType> != null ) { return StringUtils . collectionToCommaDelimitedString ( java.util.List<org.springframework.data.rest.webmvc.MediaType> ) ; } return super. getHeader ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> ( java.lang.String java.lang.String ) { if ( HttpHeaders . ACCEPT . equalsIgnoreCase ( java.lang.String ) && java.util.List<org.springframework.data.rest.webmvc.MediaType> != null ) { return java.util.Collections . java.util.Enumeration<java.lang.String> ( java.util.List<java.lang.String> ) ; } return super. getHeaders ( java.lang.String ) ; }  <METHOD_END>
