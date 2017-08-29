<METHOD_START> @ java.lang.Override public void void ( ServletRequest org.springframework.web.servlet.resource.ServletRequest , ServletResponse org.springframework.web.servlet.resource.ServletResponse , FilterChain org.springframework.web.servlet.resource.FilterChain )			throws java.io.IOException , org.springframework.web.servlet.resource.ServletException { if ( ! ( org.springframework.web.servlet.resource.ServletRequest instanceof HttpServletRequest ) || ! ( org.springframework.web.servlet.resource.ServletResponse instanceof HttpServletResponse ) ) { throw new ServletException ( STRING ) ; } HttpServletRequest org.springframework.web.servlet.resource.HttpServletRequest = ( HttpServletRequest ) org.springframework.web.servlet.resource.ServletRequest ; HttpServletResponse org.springframework.web.servlet.resource.HttpServletResponse = ( HttpServletResponse ) org.springframework.web.servlet.resource.ServletResponse ; org.springframework.web.servlet.resource.FilterChain . doFilter ( org.springframework.web.servlet.resource.HttpServletRequest , new org.springframework.web.servlet.resource.ResourceUrlEncodingFilter.ResourceUrlEncodingResponseWrapper ( org.springframework.web.servlet.resource.HttpServletRequest , org.springframework.web.servlet.resource.HttpServletResponse ) ) ; }  <METHOD_END>
<METHOD_START> public void ( HttpServletRequest org.springframework.web.servlet.resource.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.resource.HttpServletResponse ) { super( org.springframework.web.servlet.resource.HttpServletResponse ); this . org.springframework.web.servlet.resource.HttpServletRequest = org.springframework.web.servlet.resource.HttpServletRequest ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { ResourceUrlProvider org.springframework.web.servlet.resource.ResourceUrlProvider = org.springframework.web.servlet.resource.ResourceUrlProvider ( ) ; if ( org.springframework.web.servlet.resource.ResourceUrlProvider == null ) { org.springframework.web.servlet.resource.Log . debug ( STRING ) ; return super. encodeURL ( java.lang.String ) ; } void ( org.springframework.web.servlet.resource.ResourceUrlProvider ) ; if ( java.lang.String . boolean ( this . java.lang.String ) ) { int int = int ( java.lang.String ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( this . java.lang.Integer , int ) ; java.lang.String = org.springframework.web.servlet.resource.ResourceUrlProvider . getForLookupPath ( java.lang.String ) ; if ( java.lang.String != null ) { return super. encodeURL ( this . java.lang.String + java.lang.String + java.lang.String ) ; } } return super. encodeURL ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.resource.ResourceUrlProvider org.springframework.web.servlet.resource.ResourceUrlProvider ( ) { return ( ResourceUrlProvider ) this . org.springframework.web.servlet.resource.HttpServletRequest . getAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR ) ; }  <METHOD_END>
<METHOD_START> private void void ( ResourceUrlProvider org.springframework.web.servlet.resource.ResourceUrlProvider ) { if ( this . java.lang.Integer == null ) { UrlPathHelper org.springframework.web.servlet.resource.UrlPathHelper = org.springframework.web.servlet.resource.ResourceUrlProvider . getUrlPathHelper ( ) ; java.lang.String java.lang.String = org.springframework.web.servlet.resource.UrlPathHelper . getRequestUri ( this . org.springframework.web.servlet.resource.HttpServletRequest ) ; java.lang.String java.lang.String = org.springframework.web.servlet.resource.UrlPathHelper . getLookupPathForRequest ( this . org.springframework.web.servlet.resource.HttpServletRequest ) ; this . java.lang.Integer = java.lang.String . int ( java.lang.String ) ; this . java.lang.String = java.lang.String . java.lang.String ( NUMBER , this . java.lang.Integer ) ; if ( STRING . boolean ( java.lang.String ) && ! STRING . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = org.springframework.web.servlet.resource.UrlPathHelper . getContextPath ( this . org.springframework.web.servlet.resource.HttpServletRequest ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { this . java.lang.Integer = java.lang.String . int ( ) ; this . java.lang.String = java.lang.String ; } } } }  <METHOD_END>
<METHOD_START> private int int ( java.lang.String java.lang.String ) { int int = java.lang.String . int ( STRING ) ; return ( int > NUMBER ? int : java.lang.String . int ( ) ) ; }  <METHOD_END>
