<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.web.method.support.HandlerMethodArgumentResolverComposite = new HandlerMethodArgumentResolverComposite ( ) ; java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.method.support.HandlerMethodArgumentResolverCompositeTests> ( ) . java.lang.reflect.Method ( STRING , java.lang.Integer .class , java.lang.String .class ) ; org.springframework.web.method.support.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; org.springframework.web.method.support.MethodParameter = new MethodParameter ( java.lang.reflect.Method , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.support.StubArgumentResolver ( java.lang.Integer .class , null ) ; assertTrue ( this . org.springframework.web.method.support.HandlerMethodArgumentResolverComposite . supportsParameter ( org.springframework.web.method.support.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.support.HandlerMethodArgumentResolverComposite . supportsParameter ( org.springframework.web.method.support.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.support.StubArgumentResolver ( java.lang.Integer .class , java.lang.Integer . java.lang.Integer ( NUMBER ) ) ; java.lang.Object java.lang.Object = this . org.springframework.web.method.support.HandlerMethodArgumentResolverComposite . resolveArgument ( org.springframework.web.method.support.MethodParameter , null , null , null ) ; assertEquals ( java.lang.Integer . java.lang.Integer ( NUMBER ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.support.StubArgumentResolver ( java.lang.Integer .class , java.lang.Integer . java.lang.Integer ( NUMBER ) ) ; org.springframework.web.method.support.StubArgumentResolver ( java.lang.Integer .class , java.lang.Integer . java.lang.Integer ( NUMBER ) ) ; java.lang.Object java.lang.Object = this . org.springframework.web.method.support.HandlerMethodArgumentResolverComposite . resolveArgument ( org.springframework.web.method.support.MethodParameter , null , null , null ) ; assertEquals ( STRING , java.lang.Integer . java.lang.Integer ( NUMBER ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { this . org.springframework.web.method.support.HandlerMethodArgumentResolverComposite . resolveArgument ( org.springframework.web.method.support.MethodParameter , null , null , null ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.method.support.StubArgumentResolver org.springframework.web.method.support.StubArgumentResolver ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Object java.lang.Object ) { StubArgumentResolver org.springframework.web.method.support.StubArgumentResolver = new StubArgumentResolver ( java.lang.Class<> , java.lang.Object ) ; this . org.springframework.web.method.support.HandlerMethodArgumentResolverComposite . addResolver ( org.springframework.web.method.support.StubArgumentResolver ) ; return org.springframework.web.method.support.StubArgumentResolver ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( java.lang.Integer java.lang.Integer , java.lang.String java.lang.String ) {	}  <METHOD_END>
