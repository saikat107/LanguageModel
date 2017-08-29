<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver = new RequestParamMapMethodArgumentResolver ( ) ; org.springframework.web.method.annotation.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.method.annotation.NativeWebRequest = new ServletWebRequest ( org.springframework.web.method.annotation.MockHttpServletRequest , new MockHttpServletResponse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MethodParameter org.springframework.web.method.annotation.MethodParameter = this . org.springframework.web.method.annotation.ResolvableMethod . annot ( requestParam ( ) . noName ( ) ) . arg ( java.util.Map .class ) ; assertTrue ( org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; org.springframework.web.method.annotation.MethodParameter = this . org.springframework.web.method.annotation.ResolvableMethod . annotPresent ( RequestParam .class ) . arg ( MultiValueMap .class ) ; assertTrue ( org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; org.springframework.web.method.annotation.MethodParameter = this . org.springframework.web.method.annotation.ResolvableMethod . annot ( requestParam ( ) . name ( STRING ) ) . arg ( java.util.Map .class ) ; assertFalse ( org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; org.springframework.web.method.annotation.MethodParameter = this . org.springframework.web.method.annotation.ResolvableMethod . annotNotPresent ( RequestParam .class ) . arg ( java.util.Map .class ) ; assertFalse ( org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; org.springframework.web.method.annotation.MockHttpServletRequest . addParameter ( java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( java.lang.String , java.lang.String ) ; MethodParameter org.springframework.web.method.annotation.MethodParameter = this . org.springframework.web.method.annotation.ResolvableMethod . annot ( requestParam ( ) . noName ( ) ) . arg ( java.util.Map .class ) ; java.lang.Object java.lang.Object = org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , null , org.springframework.web.method.annotation.NativeWebRequest , null ) ; assertTrue ( java.lang.Object instanceof java.util.Map ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.String> , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; org.springframework.web.method.annotation.MockHttpServletRequest . addParameter ( java.lang.String , java.lang.String , java.lang.String ) ; MultiValueMap < java.lang.String , java.lang.String > org.springframework.web.method.annotation.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( NUMBER ) ; org.springframework.web.method.annotation.MultiValueMap<java.lang.String,java.lang.String> . add ( java.lang.String , java.lang.String ) ; org.springframework.web.method.annotation.MultiValueMap<java.lang.String,java.lang.String> . add ( java.lang.String , java.lang.String ) ; MethodParameter org.springframework.web.method.annotation.MethodParameter = this . org.springframework.web.method.annotation.ResolvableMethod . annotPresent ( RequestParam .class ) . arg ( MultiValueMap .class ) ; java.lang.Object java.lang.Object = org.springframework.web.method.annotation.RequestParamMapMethodArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , null , org.springframework.web.method.annotation.NativeWebRequest , null ) ; assertTrue ( java.lang.Object instanceof MultiValueMap ) ; assertEquals ( STRING , org.springframework.web.method.annotation.MultiValueMap<java.lang.String,java.lang.String> , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( @ RequestParam java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , @ RequestParam MultiValueMap < ? , ? > org.springframework.web.method.annotation.MultiValueMap<?,?> , @ RequestParam ( STRING ) java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) {	}  <METHOD_END>
