<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.multipart.support.HttpServletRequest , HttpServletResponse org.springframework.web.multipart.support.HttpServletResponse , FilterChain org.springframework.web.multipart.support.FilterChain )			throws org.springframework.web.multipart.support.ServletException , java.io.IOException { MultipartResolver org.springframework.web.multipart.support.MultipartResolver = org.springframework.web.multipart.support.MultipartResolver ( org.springframework.web.multipart.support.HttpServletRequest ) ; HttpServletRequest org.springframework.web.multipart.support.HttpServletRequest = org.springframework.web.multipart.support.HttpServletRequest ; if ( org.springframework.web.multipart.support.MultipartResolver . isMultipart ( org.springframework.web.multipart.support.HttpServletRequest ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.web.multipart.support.HttpServletRequest . getRequestURI ( ) + STRING ) ; } org.springframework.web.multipart.support.HttpServletRequest = org.springframework.web.multipart.support.MultipartResolver . resolveMultipart ( org.springframework.web.multipart.support.HttpServletRequest ) ; } else { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.web.multipart.support.HttpServletRequest . getRequestURI ( ) + STRING ) ; } } try { org.springframework.web.multipart.support.FilterChain . doFilter ( org.springframework.web.multipart.support.HttpServletRequest , org.springframework.web.multipart.support.HttpServletResponse ) ; } finally { if ( org.springframework.web.multipart.support.HttpServletRequest instanceof MultipartHttpServletRequest ) { org.springframework.web.multipart.support.MultipartResolver . cleanupMultipart ( ( MultipartHttpServletRequest ) org.springframework.web.multipart.support.HttpServletRequest ) ; } } }  <METHOD_END>
<METHOD_START> protected org.springframework.web.multipart.support.MultipartResolver org.springframework.web.multipart.support.MultipartResolver ( HttpServletRequest org.springframework.web.multipart.support.HttpServletRequest ) { return org.springframework.web.multipart.support.MultipartResolver ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.multipart.support.MultipartResolver org.springframework.web.multipart.support.MultipartResolver ( ) { WebApplicationContext org.springframework.web.multipart.support.WebApplicationContext = WebApplicationContextUtils . getWebApplicationContext ( getServletContext ( ) ) ; java.lang.String java.lang.String = java.lang.String ( ) ; if ( org.springframework.web.multipart.support.WebApplicationContext != null && org.springframework.web.multipart.support.WebApplicationContext . containsBean ( java.lang.String ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } return org.springframework.web.multipart.support.WebApplicationContext . getBean ( java.lang.String , MultipartResolver .class ) ; } else { return this . org.springframework.web.multipart.support.MultipartResolver ; } }  <METHOD_END>
