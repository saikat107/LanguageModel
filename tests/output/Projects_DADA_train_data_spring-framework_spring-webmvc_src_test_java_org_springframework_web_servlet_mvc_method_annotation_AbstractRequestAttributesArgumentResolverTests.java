<METHOD_START> @ Before public void void ( ) java.lang.Exception { HttpServletRequest org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest = new MockHttpServletRequest ( ) ; HttpServletResponse org.springframework.web.servlet.mvc.method.annotation.HttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest = new ServletWebRequest ( org.springframework.web.servlet.mvc.method.annotation.HttpServletRequest , org.springframework.web.servlet.mvc.method.annotation.HttpServletResponse ) ; this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver = org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver ( ) ; this . java.lang.reflect.Method = org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests .class . java.lang.reflect.Method ( java.lang.String ( ) , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo .class , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo .class , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo .class , java.util.Optional .class ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver ( )  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> protected abstract int int ( )  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver . supportsParameter ( new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ) ) ; assertFalse ( this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver . supportsParameter ( new MethodParameter ( this . java.lang.reflect.Method , - NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( NUMBER ) ; try { java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ; fail ( STRING ) ; } catch ( ServletRequestBindingException org.springframework.web.servlet.mvc.method.annotation.ServletRequestBindingException ) { assertTrue ( org.springframework.web.servlet.mvc.method.annotation.ServletRequestBindingException . getMessage ( ) . startsWith ( STRING ) ) ; } org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo = new org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest . setAttribute ( STRING , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , int ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( NUMBER ) ; org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo = new org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest . setAttribute ( STRING , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , int ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( NUMBER ) ; assertNull ( java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo = new org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest . setAttribute ( STRING , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , int ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebDataBinder org.springframework.web.servlet.mvc.method.annotation.WebDataBinder = new WebRequestDataBinder ( null ) ; org.springframework.web.servlet.mvc.method.annotation.WebDataBinder . setConversionService ( new DefaultConversionService ( ) ) ; WebDataBinderFactory org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , null , STRING ) ) . willReturn ( org.springframework.web.servlet.mvc.method.annotation.WebDataBinder ) ; MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( NUMBER ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( java.util.Optional .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; assertFalse ( ( ( java.util.Optional ) java.lang.Object ) . boolean ( ) ) ; org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo = new org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest . setAttribute ( STRING , org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , int ( ) ) ; java.lang.Object = java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( java.util.Optional .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; assertTrue ( ( ( java.util.Optional ) java.lang.Object ) . boolean ( ) ) ; assertSame ( org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , ( ( java.util.Optional ) java.lang.Object ) . java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) throws java.lang.Exception { return java.lang.Object ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , null ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , WebDataBinderFactory org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory ) throws java.lang.Exception { ModelAndViewContainer org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; return this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver . resolveArgument ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , org.springframework.web.servlet.mvc.method.annotation.WebDataBinderFactory ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.method.annotation.MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ( int int ) { MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter = new SynthesizingMethodParameter ( this . java.lang.reflect.Method , int ) ; org.springframework.web.servlet.mvc.method.annotation.MethodParameter . initParameterNameDiscovery ( new DefaultParameterNameDiscoverer ( ) ) ; GenericTypeResolver . resolveParameterType ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter , this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolver . getClass ( ) ) ; return org.springframework.web.servlet.mvc.method.annotation.MethodParameter ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( @ RequestAttribute org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , @ RequestAttribute ( STRING ) org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , @ RequestAttribute ( name = STRING , required = false ) org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , @ RequestAttribute ( name = STRING ) java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo> < org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo > java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo> ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( @ SessionAttribute org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , @ SessionAttribute ( STRING ) org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , @ SessionAttribute ( name = STRING , required = false ) org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo , @ SessionAttribute ( name = STRING ) java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo> < org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo > java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.AbstractRequestAttributesArgumentResolverTests.Foo> ) {	}  <METHOD_END>
