<METHOD_START> @ java.lang.Override public void void ( MessageSource org.springframework.web.servlet.mvc.annotation.MessageSource ) { this . org.springframework.web.servlet.mvc.annotation.MessageSource = org.springframework.web.servlet.mvc.annotation.MessageSource ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.mvc.annotation.ModelAndView org.springframework.web.servlet.mvc.annotation.ModelAndView ( HttpServletRequest org.springframework.web.servlet.mvc.annotation.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.mvc.annotation.HttpServletResponse , java.lang.Object java.lang.Object , java.lang.Exception java.lang.Exception ) { try { if ( java.lang.Exception instanceof ResponseStatusException ) { return org.springframework.web.servlet.mvc.annotation.ModelAndView ( ( ResponseStatusException ) java.lang.Exception , org.springframework.web.servlet.mvc.annotation.HttpServletRequest , org.springframework.web.servlet.mvc.annotation.HttpServletResponse , java.lang.Object ) ; } ResponseStatus org.springframework.web.servlet.mvc.annotation.ResponseStatus = AnnotatedElementUtils . findMergedAnnotation ( java.lang.Exception . java.lang.Class<? extends java.lang.Exception> ( ) , ResponseStatus .class ) ; if ( org.springframework.web.servlet.mvc.annotation.ResponseStatus != null ) { return org.springframework.web.servlet.mvc.annotation.ModelAndView ( org.springframework.web.servlet.mvc.annotation.ResponseStatus , org.springframework.web.servlet.mvc.annotation.HttpServletRequest , org.springframework.web.servlet.mvc.annotation.HttpServletResponse , java.lang.Object , java.lang.Exception ) ; } if ( java.lang.Exception . java.lang.Throwable ( ) instanceof java.lang.Exception ) { java.lang.Exception = ( java.lang.Exception ) java.lang.Exception . java.lang.Throwable ( ) ; return org.springframework.web.servlet.mvc.annotation.ModelAndView ( org.springframework.web.servlet.mvc.annotation.HttpServletRequest , org.springframework.web.servlet.mvc.annotation.HttpServletResponse , java.lang.Object , java.lang.Exception ) ; } } catch ( java.lang.Exception java.lang.Exception ) { logger . warn ( STRING , java.lang.Exception ) ; } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.annotation.ModelAndView org.springframework.web.servlet.mvc.annotation.ModelAndView ( ResponseStatus org.springframework.web.servlet.mvc.annotation.ResponseStatus , HttpServletRequest org.springframework.web.servlet.mvc.annotation.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.mvc.annotation.HttpServletResponse , java.lang.Object java.lang.Object , java.lang.Exception java.lang.Exception )			throws java.lang.Exception { int int = org.springframework.web.servlet.mvc.annotation.ResponseStatus . code ( ) . value ( ) ; java.lang.String java.lang.String = org.springframework.web.servlet.mvc.annotation.ResponseStatus . reason ( ) ; return org.springframework.web.servlet.mvc.annotation.ModelAndView ( int , java.lang.String , org.springframework.web.servlet.mvc.annotation.HttpServletResponse ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.annotation.ModelAndView org.springframework.web.servlet.mvc.annotation.ModelAndView ( ResponseStatusException org.springframework.web.servlet.mvc.annotation.ResponseStatusException , HttpServletRequest org.springframework.web.servlet.mvc.annotation.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.mvc.annotation.HttpServletResponse , java.lang.Object java.lang.Object ) throws java.lang.Exception { int int = org.springframework.web.servlet.mvc.annotation.ResponseStatusException . getStatus ( ) . value ( ) ; java.lang.String java.lang.String = org.springframework.web.servlet.mvc.annotation.ResponseStatusException . getReason ( ) ; org.springframework.web.servlet.mvc.annotation.ModelAndView ( int , java.lang.String , org.springframework.web.servlet.mvc.annotation.HttpServletResponse ) ; return new ModelAndView ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.annotation.ModelAndView org.springframework.web.servlet.mvc.annotation.ModelAndView ( int int , java.lang.String java.lang.String , HttpServletResponse org.springframework.web.servlet.mvc.annotation.HttpServletResponse )			throws java.io.IOException { if ( this . org.springframework.web.servlet.mvc.annotation.MessageSource != null ) { java.lang.String = this . org.springframework.web.servlet.mvc.annotation.MessageSource . getMessage ( java.lang.String , null , java.lang.String , LocaleContextHolder . getLocale ( ) ) ; } if ( ! StringUtils . hasLength ( java.lang.String ) ) { org.springframework.web.servlet.mvc.annotation.HttpServletResponse . sendError ( int ) ; } else { org.springframework.web.servlet.mvc.annotation.HttpServletResponse . sendError ( int , java.lang.String ) ; } return new ModelAndView ( ) ; }  <METHOD_END>
