<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( HttpServletRequest org.springframework.web.servlet.theme.HttpServletRequest ) { java.lang.String java.lang.String = ( java.lang.String ) WebUtils . getSessionAttribute ( org.springframework.web.servlet.theme.HttpServletRequest , java.lang.String ) ; return ( java.lang.String != null ? java.lang.String : getDefaultThemeName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( HttpServletRequest org.springframework.web.servlet.theme.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.theme.HttpServletResponse , java.lang.String java.lang.String ) { WebUtils . setSessionAttribute ( org.springframework.web.servlet.theme.HttpServletRequest , java.lang.String , ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : null ) ) ; }  <METHOD_END>
