<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { Assert . isTrue ( int >= NUMBER , STRING ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> protected int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , HttpServletResponse org.springframework.web.filter.HttpServletResponse , FilterChain org.springframework.web.filter.FilterChain )			throws org.springframework.web.filter.ServletException , java.io.IOException { boolean boolean = ! isAsyncDispatch ( org.springframework.web.filter.HttpServletRequest ) ; HttpServletRequest org.springframework.web.filter.HttpServletRequest = org.springframework.web.filter.HttpServletRequest ; if ( boolean ( ) && boolean && ! ( org.springframework.web.filter.HttpServletRequest instanceof ContentCachingRequestWrapper ) ) { org.springframework.web.filter.HttpServletRequest = new ContentCachingRequestWrapper ( org.springframework.web.filter.HttpServletRequest , int ( ) ) ; } boolean boolean = boolean ( org.springframework.web.filter.HttpServletRequest ) ; if ( boolean && boolean ) { void ( org.springframework.web.filter.HttpServletRequest , java.lang.String ( org.springframework.web.filter.HttpServletRequest ) ) ; } try { org.springframework.web.filter.FilterChain . doFilter ( org.springframework.web.filter.HttpServletRequest , org.springframework.web.filter.HttpServletResponse ) ; } finally { if ( boolean && ! isAsyncStarted ( org.springframework.web.filter.HttpServletRequest ) ) { void ( org.springframework.web.filter.HttpServletRequest , java.lang.String ( org.springframework.web.filter.HttpServletRequest ) ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( HttpServletRequest org.springframework.web.filter.HttpServletRequest ) { return java.lang.String ( org.springframework.web.filter.HttpServletRequest , this . java.lang.String , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( HttpServletRequest org.springframework.web.filter.HttpServletRequest ) { return java.lang.String ( org.springframework.web.filter.HttpServletRequest , this . java.lang.String , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( org.springframework.web.filter.HttpServletRequest . getRequestURI ( ) ) ; if ( boolean ( ) ) { java.lang.String java.lang.String = org.springframework.web.filter.HttpServletRequest . getQueryString ( ) ; if ( java.lang.String != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( '?' ) . java.lang.StringBuilder ( java.lang.String ) ; } } if ( boolean ( ) ) { java.lang.String java.lang.String = org.springframework.web.filter.HttpServletRequest . getRemoteAddr ( ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ) ; } HttpSession org.springframework.web.filter.HttpSession = org.springframework.web.filter.HttpServletRequest . getSession ( false ) ; if ( org.springframework.web.filter.HttpSession != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( org.springframework.web.filter.HttpSession . getId ( ) ) ; } java.lang.String java.lang.String = org.springframework.web.filter.HttpServletRequest . getRemoteUser ( ) ; if ( java.lang.String != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ) ; } } if ( boolean ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( new ServletServerHttpRequest ( org.springframework.web.filter.HttpServletRequest ) . getHeaders ( ) ) ; } if ( boolean ( ) ) { ContentCachingRequestWrapper org.springframework.web.filter.ContentCachingRequestWrapper = WebUtils . getNativeRequest ( org.springframework.web.filter.HttpServletRequest , ContentCachingRequestWrapper .class ) ; if ( org.springframework.web.filter.ContentCachingRequestWrapper != null ) { byte [] byte[] = org.springframework.web.filter.ContentCachingRequestWrapper . getContentAsByteArray ( ) ; if ( byte[] . int > NUMBER ) { int int = java.lang.Math . int ( byte[] . int , int ( ) ) ; java.lang.String java.lang.String ; try { java.lang.String = new java.lang.String ( byte[] , NUMBER , int , org.springframework.web.filter.ContentCachingRequestWrapper . getCharacterEncoding ( ) ) ; } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { java.lang.String = STRING ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( java.lang.String ) ; } } } java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( HttpServletRequest org.springframework.web.filter.HttpServletRequest ) { return true ; }  <METHOD_END>
<METHOD_START> protected abstract void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> protected abstract void void ( HttpServletRequest org.springframework.web.filter.HttpServletRequest , java.lang.String java.lang.String );  <METHOD_END>
