<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver = new ServletResponseMethodArgumentResolver ( ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) , org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse ) ; java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolverTests> ( ) . java.lang.reflect.Method ( STRING , ServletResponse .class , java.io.OutputStream .class , java.io.Writer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; assertTrue ( STRING , org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; java.lang.Object java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . resolveArgument ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ; assertSame ( STRING , org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse , java.lang.Object ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; assertTrue ( STRING , org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; java.lang.Object java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . resolveArgument ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , null , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ; assertSame ( STRING , org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; assertTrue ( STRING , org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; java.lang.Object java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . resolveArgument ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ; assertSame ( STRING , org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getOutputStream ( ) , java.lang.Object ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; assertTrue ( STRING , org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; java.lang.Object java.lang.Object = org.springframework.web.servlet.mvc.method.annotation.ServletResponseMethodArgumentResolver . resolveArgument ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ; assertSame ( STRING , org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getWriter ( ) , java.lang.Object ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( ServletResponse org.springframework.web.servlet.mvc.method.annotation.ServletResponse , java.io.OutputStream java.io.OutputStream , java.io.Writer java.io.Writer ) {	}  <METHOD_END>