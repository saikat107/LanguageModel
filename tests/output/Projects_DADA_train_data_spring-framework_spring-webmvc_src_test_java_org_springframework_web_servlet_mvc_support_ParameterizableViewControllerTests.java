<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertNull ( org.springframework.web.servlet.mvc.support.ModelAndView . getViewName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setViewName ( STRING ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.mvc.support.ModelAndView . getViewName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setViewName ( STRING ) ; this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setStatusCode ( HttpStatus . NOT_FOUND ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.mvc.support.ModelAndView . getViewName ( ) ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setStatusCode ( HttpStatus . NO_CONTENT ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertNull ( org.springframework.web.servlet.mvc.support.ModelAndView ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setStatusCode ( HttpStatus . PERMANENT_REDIRECT ) ; this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setViewName ( STRING ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.mvc.support.ModelAndView . getViewName ( ) ) ; assertEquals ( STRING , NUMBER , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( HttpStatus . PERMANENT_REDIRECT , this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest . getAttribute ( View . RESPONSE_STATUS_ATTRIBUTE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setStatusCode ( HttpStatus . PERMANENT_REDIRECT ) ; this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setViewName ( STRING ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertEquals ( STRING , org.springframework.web.servlet.mvc.support.ModelAndView . getViewName ( ) ) ; assertEquals ( STRING , NUMBER , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( HttpStatus . PERMANENT_REDIRECT , this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest . getAttribute ( View . RESPONSE_STATUS_ATTRIBUTE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.mvc.support.RedirectView = new RedirectView ( STRING ) ; this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setView ( org.springframework.web.servlet.mvc.support.RedirectView ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertSame ( org.springframework.web.servlet.mvc.support.RedirectView , org.springframework.web.servlet.mvc.support.ModelAndView . getView ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setStatusCode ( HttpStatus . NOT_FOUND ) ; this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . setStatusOnly ( true ) ; ModelAndView org.springframework.web.servlet.mvc.support.ModelAndView = this . org.springframework.web.servlet.mvc.support.ParameterizableViewController . handleRequest ( this . org.springframework.web.servlet.mvc.support.MockHttpServletRequest , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse ) ; assertNull ( org.springframework.web.servlet.mvc.support.ModelAndView ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.support.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>