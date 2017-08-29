<METHOD_START> @ Before public void void ( ) java.lang.NoSuchMethodException { this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler = new ViewNameMethodReturnValueHandler ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( STRING ) , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . supportsReturnType ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . handleReturnValue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.web.servlet.mvc.method.annotation.ModelMap = new RedirectAttributesModelMap ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . setRedirectModel ( org.springframework.web.servlet.mvc.method.annotation.ModelMap ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . handleReturnValue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.ModelMap , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getModel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.web.servlet.mvc.method.annotation.ModelMap = new RedirectAttributesModelMap ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . setRedirectModel ( org.springframework.web.servlet.mvc.method.annotation.ModelMap ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . setRedirectPatterns ( STRING ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . handleReturnValue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.ModelMap , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getModel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelMap org.springframework.web.servlet.mvc.method.annotation.ModelMap = new RedirectAttributesModelMap ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . setRedirectModel ( org.springframework.web.servlet.mvc.method.annotation.ModelMap ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . setRedirectPatterns ( STRING ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewNameMethodReturnValueHandler . handleReturnValue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.ModelMap , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getModel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
