<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.MapMethodProcessor = new MapMethodProcessor ( ) ; org.springframework.web.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.method.annotation.MapMethodProcessorTests> ( ) . java.lang.reflect.Method ( STRING , java.util.Map .class ) ; org.springframework.web.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; org.springframework.web.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; org.springframework.web.method.annotation.NativeWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.web.method.annotation.MapMethodProcessor . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.web.method.annotation.MapMethodProcessor . supportsReturnType ( org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertSame ( org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) , org.springframework.web.method.annotation.MapMethodProcessor . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.ModelAndViewContainer , org.springframework.web.method.annotation.NativeWebRequest , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new ModelMap ( STRING , STRING ) ; org.springframework.web.method.annotation.MapMethodProcessor . handleReturnValue ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.ModelAndViewContainer , org.springframework.web.method.annotation.NativeWebRequest ) ; assertEquals ( STRING , org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return null ; }  <METHOD_END>
