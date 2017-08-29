<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertTrue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; assertEquals ( HttpStatus . BAD_REQUEST . value ( ) , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertTrue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; assertEquals ( HttpStatus . BAD_REQUEST . value ( ) , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ResponseStatusHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertTrue ( this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; assertEquals ( HttpStatus . BAD_REQUEST . value ( ) , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolverComposite . addResolver ( new ServletResponseMethodArgumentResolver ( ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING , HttpServletResponse .class ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertTrue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest . addHeader ( STRING , NUMBER * NUMBER * NUMBER ) ; int int = NUMBER * NUMBER ; this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest . checkNotModified ( int ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertTrue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertTrue ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . isRequestHandled ( ) ) ; assertEquals ( HttpStatus . BAD_REQUEST . value ( ) , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getErrorMessage ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = HttpMessageNotWritableException .class ) public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ExceptionRaisingReturnValueHandler ( ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolverComposite . addResolver ( new RequestParamMethodArgumentResolver ( null , false ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new ViewMethodReturnValueHandler ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new ViewNameMethodReturnValueHandler ( ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.Handler ( ) , STRING , java.lang.String .class ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertNotNull ( this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getView ( ) ) ; assertEquals ( RedirectView .class , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getView ( ) . getClass ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest . setParameter ( STRING , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . getViewName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.MethodLevelResponseBodyHandler ( ) , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.MethodLevelResponseBodyHandler ( ) , null , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.TypeLevelResponseBodyHandler ( ) , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.TypeLevelResponseBodyHandler ( ) , null , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.DeferredResultSubclassHandler ( ) , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.DeferredResultSubclassHandler ( ) , null , org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.CustomDeferredResult .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , java.lang.Class<?> < ? > java.lang.Class<?> )			throws java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new ModelAndViewMethodReturnValueHandler ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new RequestResponseBodyMethodProcessor ( this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( java.lang.Object , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( java.lang.Object ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( ( java.lang.Object != null ? java.lang.Object . java.lang.String ( ) : STRING ) , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; assertEquals ( java.lang.Class<> , org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . getReturnValueType ( java.lang.Object ) . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new HttpEntityMethodProcessor ( this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ResponseEntityHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( new ResponseEntity <> ( STRING , HttpStatus . OK ) ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new HttpEntityMethodProcessor ( this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ResponseEntityHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( new ResponseEntity <> ( HttpStatus . OK ) ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new HttpEntityMethodProcessor ( this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ResponseEntityHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( null ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new ResponseBodyEmitterReturnValueHandler ( this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.StreamingHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( null ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new StreamingResponseBodyReturnValueHandler ( ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.StreamingHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( null ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> < HttpMessageConverter < ? > > java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> = java.util.Collections . java.util.List ( new MappingJackson2HttpMessageConverter ( ) ) ; this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletRequest . addHeader ( STRING , STRING ) ; ReactiveTypeHandler . ReactiveTypeHandler ReactiveTypeHandler.CollectedValuesList = new ReactiveTypeHandler . ReactiveTypeHandler ( ) ; ReactiveTypeHandler.CollectedValuesList . add ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; ReactiveTypeHandler.CollectedValuesList . add ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; ContentNegotiationManager org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager = new ContentNegotiationManager ( ) ; this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new RequestResponseBodyMethodProcessor ( java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> , org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.MethodLevelResponseBodyHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . wrapConcurrentResult ( ReactiveTypeHandler.CollectedValuesList ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite . addHandler ( new HttpEntityMethodProcessor ( this . java.util.List<org.springframework.web.servlet.mvc.method.annotation.HttpMessageConverter<?>> ) ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ResponseEntityHandler ( ) , STRING ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . invokeAndHandle ( this . org.springframework.web.servlet.mvc.method.annotation.ServletWebRequest , this . org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; assertEquals ( NUMBER , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , this . org.springframework.web.servlet.mvc.method.annotation.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) throws java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; ServletInvocableHandlerMethod org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod = new ServletInvocableHandlerMethod ( java.lang.Object , java.lang.reflect.Method ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . setHandlerMethodArgumentResolvers ( this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodArgumentResolverComposite ) ; org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod . setHandlerMethodReturnValueHandlers ( this . org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite ) ; return org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ ResponseStatus ( HttpStatus . BAD_REQUEST ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ ResponseStatus ( code = HttpStatus . BAD_REQUEST , reason = STRING ) public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.ComposedResponseStatus ( org.springframework.web.servlet.mvc.method.annotation.HttpStatus = HttpStatus . BAD_REQUEST ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> public void void ( HttpServletResponse org.springframework.web.servlet.mvc.method.annotation.HttpServletResponse ) {		}  <METHOD_END>
<METHOD_START> public void void ( ) {		}  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( @ RequestParam ( required = false ) java.lang.String java.lang.String ) { return ( java.lang.String != null ) ? STRING : new RedirectView ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ ResponseBody public org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.String> < java.lang.String > org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.String> ( ) { return new DeferredResult <> ( ) ; }  <METHOD_END>
<METHOD_START> @ ResponseBody public org.springframework.web.servlet.mvc.method.annotation.Flux<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > org.springframework.web.servlet.mvc.method.annotation.Flux<java.util.List<java.lang.String>> ( ) { return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.String> < java.lang.String > org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.String> ( ) { return new DeferredResult <> ( ) ; }  <METHOD_END>
<METHOD_START> @ ResponseBody public org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.CustomDeferredResult org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.CustomDeferredResult ( ) { return new org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethodTests.CustomDeferredResult ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.DeferredResult<org.springframework.web.servlet.mvc.method.annotation.ResponseEntity<java.lang.String>> < ResponseEntity < java.lang.String > > org.springframework.web.servlet.mvc.method.annotation.DeferredResult<org.springframework.web.servlet.mvc.method.annotation.ResponseEntity<java.lang.String>> ( ) { return new DeferredResult <> ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.ResponseEntity<java.lang.Void> < java.lang.Void > org.springframework.web.servlet.mvc.method.annotation.ResponseEntity<java.lang.Void> ( ) { return ResponseEntity . ok ( ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) throws java.lang.Exception { throw new HttpMessageNotWritableException ( STRING ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) { return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody ( ) { return null ; }  <METHOD_END>