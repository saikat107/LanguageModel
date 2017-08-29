<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.servlet.mvc.method.annotation.ViewMethodReturnValueHandler = new ViewMethodReturnValueHandler ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.servlet.mvc.method.annotation.ViewMethodReturnValueHandler . supportsReturnType ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { InternalResourceView org.springframework.web.servlet.mvc.method.annotation.InternalResourceView = new InternalResourceView ( STRING ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewMethodReturnValueHandler . handleReturnValue ( org.springframework.web.servlet.mvc.method.annotation.InternalResourceView , org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( STRING ) , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.InternalResourceView , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getView ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.mvc.method.annotation.RedirectView = new RedirectView ( STRING ) ; ModelMap org.springframework.web.servlet.mvc.method.annotation.ModelMap = new RedirectAttributesModelMap ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . setRedirectModel ( org.springframework.web.servlet.mvc.method.annotation.ModelMap ) ; MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( STRING ) ; this . org.springframework.web.servlet.mvc.method.annotation.ViewMethodReturnValueHandler . handleReturnValue ( org.springframework.web.servlet.mvc.method.annotation.RedirectView , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.RedirectView , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getView ( ) ) ; assertSame ( STRING , org.springframework.web.servlet.mvc.method.annotation.ModelMap , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getModel ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.method.annotation.MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ViewMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( java.lang.String ) ; return new MethodParameter ( java.lang.reflect.Method , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> org.springframework.web.servlet.mvc.method.annotation.View org.springframework.web.servlet.mvc.method.annotation.View ( ) { return null ; }  <METHOD_END>
