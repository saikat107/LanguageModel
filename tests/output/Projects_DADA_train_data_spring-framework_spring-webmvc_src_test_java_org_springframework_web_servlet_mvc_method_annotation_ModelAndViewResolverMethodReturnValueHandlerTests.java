<METHOD_START> @ Before public void void ( ) { java.util.List<org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolver> = new java.util.ArrayList <> ( ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler = new ModelAndViewResolverMethodReturnValueHandler ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolver> ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( STRING ) , - NUMBER ) ; java.util.List<org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolver> . add ( new org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests.TestModelAndViewResolver ( TestBean .class ) ) ; TestBean org.springframework.web.servlet.mvc.method.annotation.TestBean = new TestBean ( STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler . handleReturnValue ( org.springframework.web.servlet.mvc.method.annotation.TestBean , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertEquals ( STRING , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.TestBean , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getModel ( ) . get ( STRING ) ) ; assertFalse ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( STRING ) , - NUMBER ) ; java.util.List<org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolver> . add ( new org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests.TestModelAndViewResolver ( TestBean .class ) ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler . handleReturnValue ( NUMBER , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( STRING ) , - NUMBER ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler . handleReturnValue ( null , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertNull ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getView ( ) ) ; assertNull ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getModel ( ) . isEmpty ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( STRING ) , - NUMBER ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler . handleReturnValue ( NUMBER , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandlerTests> ( ) . java.lang.reflect.Method ( STRING ) , - NUMBER ) ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler . handleReturnValue ( new TestBean ( ) , org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . containsAttribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.web.servlet.mvc.method.annotation.TestBean org.springframework.web.servlet.mvc.method.annotation.TestBean ( ) { return null ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.web.servlet.mvc.method.annotation.ModelAndView org.springframework.web.servlet.mvc.method.annotation.ModelAndView ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Object java.lang.Object , ExtendedModelMap org.springframework.web.servlet.mvc.method.annotation.ExtendedModelMap , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) { if ( java.lang.Object != null && java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( java.lang.Class<> ) ) { return new ModelAndView ( STRING , STRING , java.lang.Object ) ; } else { return ModelAndViewResolver . UNRESOLVED ; } }  <METHOD_END>
