<METHOD_START> @ java.lang.Override protected boolean boolean ( HttpServletRequest org.springframework.web.servlet.handler.HttpServletRequest , java.lang.Object java.lang.Object ) { if ( java.lang.Object == null ) { return super. shouldApplyTo ( org.springframework.web.servlet.handler.HttpServletRequest , java.lang.Object ) ; } else if ( java.lang.Object instanceof HandlerMethod ) { HandlerMethod org.springframework.web.servlet.handler.HandlerMethod = ( HandlerMethod ) java.lang.Object ; java.lang.Object = org.springframework.web.servlet.handler.HandlerMethod . getBean ( ) ; return super. shouldApplyTo ( org.springframework.web.servlet.handler.HttpServletRequest , java.lang.Object ) ; } else { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final org.springframework.web.servlet.handler.ModelAndView org.springframework.web.servlet.handler.ModelAndView ( HttpServletRequest org.springframework.web.servlet.handler.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.handler.HttpServletResponse , java.lang.Object java.lang.Object , java.lang.Exception java.lang.Exception ) { return org.springframework.web.servlet.handler.ModelAndView ( org.springframework.web.servlet.handler.HttpServletRequest , org.springframework.web.servlet.handler.HttpServletResponse , ( HandlerMethod ) java.lang.Object , java.lang.Exception ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.web.servlet.handler.ModelAndView org.springframework.web.servlet.handler.ModelAndView ( HttpServletRequest org.springframework.web.servlet.handler.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.handler.HttpServletResponse , HandlerMethod org.springframework.web.servlet.handler.HandlerMethod , java.lang.Exception java.lang.Exception );  <METHOD_END>