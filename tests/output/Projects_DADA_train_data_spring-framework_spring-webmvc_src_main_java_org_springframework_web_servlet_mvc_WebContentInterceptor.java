<METHOD_START> public void ( ) { super( false ); }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.web.servlet.mvc.UrlPathHelper . setAlwaysUseFullPath ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.web.servlet.mvc.UrlPathHelper . setUrlDecode ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( UrlPathHelper org.springframework.web.servlet.mvc.UrlPathHelper ) { Assert . notNull ( org.springframework.web.servlet.mvc.UrlPathHelper , STRING ) ; this . org.springframework.web.servlet.mvc.UrlPathHelper = org.springframework.web.servlet.mvc.UrlPathHelper ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { this . java.util.Map<java.lang.String,java.lang.Integer> . void ( ) ; java.util.Enumeration<?> < ? > java.util.Enumeration<?> = java.util.Properties . java.util.Enumeration<?> ( ) ; while ( java.util.Enumeration<> . boolean ( ) ) { java.lang.String java.lang.String = ( java.lang.String ) java.util.Enumeration<> . nextElement ( ) ; int int = java.lang.Integer . java.lang.Integer ( java.util.Properties . java.lang.String ( java.lang.String ) ) ; this . java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( java.lang.String , int ) ; } }  <METHOD_END>
<METHOD_START> public void void ( CacheControl org.springframework.web.servlet.mvc.CacheControl , java.lang.String ... java.lang.String[] ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { this . java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.CacheControl> . put ( java.lang.String , org.springframework.web.servlet.mvc.CacheControl ) ; } }  <METHOD_END>
<METHOD_START> public void void ( PathMatcher org.springframework.web.servlet.mvc.PathMatcher ) { Assert . notNull ( org.springframework.web.servlet.mvc.PathMatcher , STRING ) ; this . org.springframework.web.servlet.mvc.PathMatcher = org.springframework.web.servlet.mvc.PathMatcher ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( HttpServletRequest org.springframework.web.servlet.mvc.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.mvc.HttpServletResponse , java.lang.Object java.lang.Object )			throws org.springframework.web.servlet.mvc.ServletException { checkRequest ( org.springframework.web.servlet.mvc.HttpServletRequest ) ; java.lang.String java.lang.String = this . org.springframework.web.servlet.mvc.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.servlet.mvc.HttpServletRequest ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } CacheControl org.springframework.web.servlet.mvc.CacheControl = org.springframework.web.servlet.mvc.CacheControl ( java.lang.String ) ; java.lang.Integer java.lang.Integer = java.lang.Integer ( java.lang.String ) ; if ( org.springframework.web.servlet.mvc.CacheControl != null ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } applyCacheControl ( org.springframework.web.servlet.mvc.HttpServletResponse , org.springframework.web.servlet.mvc.CacheControl ) ; } else if ( java.lang.Integer != null ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } applyCacheSeconds ( org.springframework.web.servlet.mvc.HttpServletResponse , java.lang.Integer ) ; } else { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } prepareResponse ( org.springframework.web.servlet.mvc.HttpServletResponse ) ; } return true ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.CacheControl org.springframework.web.servlet.mvc.CacheControl ( java.lang.String java.lang.String ) { CacheControl org.springframework.web.servlet.mvc.CacheControl = this . java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.CacheControl> . get ( java.lang.String ) ; if ( org.springframework.web.servlet.mvc.CacheControl != null ) { return org.springframework.web.servlet.mvc.CacheControl ; } for ( java.lang.String java.lang.String : this . java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.CacheControl> . keySet ( ) ) { if ( this . org.springframework.web.servlet.mvc.PathMatcher . match ( java.lang.String , java.lang.String ) ) { return this . java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.CacheControl> . get ( java.lang.String ) ; } } return null ; }  <METHOD_END>
<METHOD_START> protected java.lang.Integer java.lang.Integer ( java.lang.String java.lang.String ) { java.lang.Integer java.lang.Integer = this . java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( java.lang.String ) ; if ( java.lang.Integer != null ) { return java.lang.Integer ; } for ( java.lang.String java.lang.String : this . java.util.Map<java.lang.String,java.lang.Integer> . java.util.Set<java.lang.String> ( ) ) { if ( this . org.springframework.web.servlet.mvc.PathMatcher . match ( java.lang.String , java.lang.String ) ) { return this . java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( java.lang.String ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( HttpServletRequest org.springframework.web.servlet.mvc.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.mvc.HttpServletResponse , java.lang.Object java.lang.Object , ModelAndView org.springframework.web.servlet.mvc.ModelAndView )			throws java.lang.Exception {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( HttpServletRequest org.springframework.web.servlet.mvc.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.mvc.HttpServletResponse , java.lang.Object java.lang.Object , java.lang.Exception java.lang.Exception )			throws java.lang.Exception {	}  <METHOD_END>
