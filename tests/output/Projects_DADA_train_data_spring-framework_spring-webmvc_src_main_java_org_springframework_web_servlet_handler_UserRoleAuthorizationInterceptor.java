<METHOD_START> public final void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final boolean boolean ( HttpServletRequest org.springframework.web.servlet.handler.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.handler.HttpServletResponse , java.lang.Object java.lang.Object )			throws org.springframework.web.servlet.handler.ServletException , java.io.IOException { if ( this . java.lang.String[] != null ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { if ( org.springframework.web.servlet.handler.HttpServletRequest . isUserInRole ( java.lang.String ) ) { return true ; } } } void ( org.springframework.web.servlet.handler.HttpServletRequest , org.springframework.web.servlet.handler.HttpServletResponse , java.lang.Object ) ; return false ; }  <METHOD_END>
<METHOD_START> protected void void ( HttpServletRequest org.springframework.web.servlet.handler.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.handler.HttpServletResponse , java.lang.Object java.lang.Object )			throws org.springframework.web.servlet.handler.ServletException , java.io.IOException { org.springframework.web.servlet.handler.HttpServletResponse . sendError ( HttpServletResponse . SC_FORBIDDEN ) ; }  <METHOD_END>
