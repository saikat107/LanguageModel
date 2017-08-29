<METHOD_START> public void ( WebApplicationContext org.springframework.test.web.servlet.WebApplicationContext ) { super( org.springframework.test.web.servlet.WebApplicationContext ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.test.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.test.web.servlet.HttpServletResponse )			throws org.springframework.test.web.servlet.ServletException , java.io.IOException { void ( org.springframework.test.web.servlet.HttpServletRequest ) ; super. service ( org.springframework.test.web.servlet.HttpServletRequest , org.springframework.test.web.servlet.HttpServletResponse ) ; }  <METHOD_END>
<METHOD_START> private void void ( final HttpServletRequest org.springframework.test.web.servlet.HttpServletRequest ) { WebAsyncManager org.springframework.test.web.servlet.WebAsyncManager = WebAsyncUtils . getAsyncManager ( org.springframework.test.web.servlet.HttpServletRequest ) ; org.springframework.test.web.servlet.WebAsyncManager . registerCallableInterceptor ( java.lang.String , new CallableProcessingInterceptorAdapter ( ) { @ java.lang.Override public < T > void void ( NativeWebRequest org.springframework.test.web.servlet.NativeWebRequest , java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> , java.lang.Object java.lang.Object ) throws java.lang.Exception { org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) . setAsyncResult ( java.lang.Object ) ; } } ) ; org.springframework.test.web.servlet.WebAsyncManager . registerDeferredResultInterceptor ( java.lang.String , new DeferredResultProcessingInterceptorAdapter ( ) { @ java.lang.Override public < T > void void ( NativeWebRequest org.springframework.test.web.servlet.NativeWebRequest , DeferredResult < T > org.springframework.test.web.servlet.DeferredResult<T> , java.lang.Object java.lang.Object ) throws java.lang.Exception { org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) . setAsyncResult ( java.lang.Object ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > void void ( NativeWebRequest org.springframework.test.web.servlet.NativeWebRequest , java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> , java.lang.Object java.lang.Object ) throws java.lang.Exception { org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) . setAsyncResult ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > void void ( NativeWebRequest org.springframework.test.web.servlet.NativeWebRequest , DeferredResult < T > org.springframework.test.web.servlet.DeferredResult<T> , java.lang.Object java.lang.Object ) throws java.lang.Exception { org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) . setAsyncResult ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.web.servlet.DefaultMvcResult org.springframework.test.web.servlet.DefaultMvcResult ( ServletRequest org.springframework.test.web.servlet.ServletRequest ) { return ( DefaultMvcResult ) org.springframework.test.web.servlet.ServletRequest . getAttribute ( MockMvc . MVC_RESULT_ATTRIBUTE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.web.servlet.HandlerExecutionChain org.springframework.test.web.servlet.HandlerExecutionChain ( HttpServletRequest org.springframework.test.web.servlet.HttpServletRequest ) throws java.lang.Exception { HandlerExecutionChain org.springframework.test.web.servlet.HandlerExecutionChain = super. getHandler ( org.springframework.test.web.servlet.HttpServletRequest ) ; if ( org.springframework.test.web.servlet.HandlerExecutionChain != null ) { DefaultMvcResult org.springframework.test.web.servlet.DefaultMvcResult = org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) ; org.springframework.test.web.servlet.DefaultMvcResult . setHandler ( org.springframework.test.web.servlet.HandlerExecutionChain . getHandler ( ) ) ; org.springframework.test.web.servlet.DefaultMvcResult . setInterceptors ( org.springframework.test.web.servlet.HandlerExecutionChain . getInterceptors ( ) ) ; } return org.springframework.test.web.servlet.HandlerExecutionChain ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ModelAndView org.springframework.test.web.servlet.ModelAndView , HttpServletRequest org.springframework.test.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.test.web.servlet.HttpServletResponse )			throws java.lang.Exception { DefaultMvcResult org.springframework.test.web.servlet.DefaultMvcResult = org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) ; org.springframework.test.web.servlet.DefaultMvcResult . setModelAndView ( org.springframework.test.web.servlet.ModelAndView ) ; super. render ( org.springframework.test.web.servlet.ModelAndView , org.springframework.test.web.servlet.HttpServletRequest , org.springframework.test.web.servlet.HttpServletResponse ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.web.servlet.ModelAndView org.springframework.test.web.servlet.ModelAndView ( HttpServletRequest org.springframework.test.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.test.web.servlet.HttpServletResponse , java.lang.Object java.lang.Object , java.lang.Exception java.lang.Exception ) throws java.lang.Exception { ModelAndView org.springframework.test.web.servlet.ModelAndView = super. processHandlerException ( org.springframework.test.web.servlet.HttpServletRequest , org.springframework.test.web.servlet.HttpServletResponse , java.lang.Object , java.lang.Exception ) ; DefaultMvcResult org.springframework.test.web.servlet.DefaultMvcResult = org.springframework.test.web.servlet.DefaultMvcResult ( org.springframework.test.web.servlet.HttpServletRequest ) ; org.springframework.test.web.servlet.DefaultMvcResult . setResolvedException ( java.lang.Exception ) ; org.springframework.test.web.servlet.DefaultMvcResult . setModelAndView ( org.springframework.test.web.servlet.ModelAndView ) ; return org.springframework.test.web.servlet.ModelAndView ; }  <METHOD_END>
