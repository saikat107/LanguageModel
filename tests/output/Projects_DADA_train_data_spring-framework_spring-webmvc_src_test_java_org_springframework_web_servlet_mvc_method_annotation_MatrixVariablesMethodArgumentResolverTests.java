<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver = new MatrixVariableMethodArgumentResolver ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest = new MockHttpServletRequest ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest = new ServletWebRequest ( org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest , new MockHttpServletResponse ( ) ) ; java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> < java.lang.String , MultiValueMap < java.lang.String , java.lang.String > > java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> = new java.util.LinkedHashMap<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> <> ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest . setAttribute ( HandlerMapping . MATRIX_VARIABLES_ATTRIBUTE , java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.servlet.mvc.method.annotation.MatrixVariablesMethodArgumentResolverTests> ( ) . java.lang.reflect.Method ( STRING , java.lang.String .class , java.util.List .class , int .class ) ; this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter . initParameterNameDiscovery ( new LocalVariableTableParameterNameDiscoverer ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; assertTrue ( org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . supportsParameter ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( STRING ) ; org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; assertEquals ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) , this . org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . resolveArgument ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( STRING ) . add ( STRING , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( STRING ) . add ( STRING , STRING ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . resolveArgument ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( STRING , org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . resolveArgument ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = ServletRequestBindingException .class ) public void void ( ) java.lang.Exception { org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( STRING ) . add ( STRING , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( STRING ) . add ( STRING , STRING ) ; this . org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . resolveArgument ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = ServletRequestBindingException .class ) public void void ( ) java.lang.Exception { org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . resolveArgument ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> = org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( STRING ) ; org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MatrixVariableMethodArgumentResolver . resolveArgument ( this . org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ( java.lang.String java.lang.String ) { java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> < java.lang.String , MultiValueMap < java.lang.String , java.lang.String > > java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> = ( java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> < java.lang.String , MultiValueMap < java.lang.String , java.lang.String > > ) this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest . getAttribute ( HandlerMapping . MATRIX_VARIABLES_ATTRIBUTE ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; java.util.Map<java.lang.String,org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String>> . put ( java.lang.String , org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ) ; return org.springframework.web.servlet.mvc.method.annotation.MultiValueMap<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , @ MatrixVariable java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> , @ MatrixVariable ( name = STRING , pathVar = STRING , required = false , defaultValue = STRING ) int int ) {	}  <METHOD_END>