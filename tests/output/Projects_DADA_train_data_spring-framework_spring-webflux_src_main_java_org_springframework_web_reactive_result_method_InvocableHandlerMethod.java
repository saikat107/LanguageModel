<METHOD_START> public void ( HandlerMethod org.springframework.web.reactive.result.method.HandlerMethod ) { super( org.springframework.web.reactive.result.method.HandlerMethod ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method ) { super( java.lang.Object , java.lang.reflect.Method ); }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> ) { this . java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> . clear ( ) ; this . java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> . addAll ( java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> ( ) { return this . java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> ; }  <METHOD_END>
<METHOD_START> public void void ( ParameterNameDiscoverer org.springframework.web.reactive.result.method.ParameterNameDiscoverer ) { this . org.springframework.web.reactive.result.method.ParameterNameDiscoverer = org.springframework.web.reactive.result.method.ParameterNameDiscoverer ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.result.method.ParameterNameDiscoverer org.springframework.web.reactive.result.method.ParameterNameDiscoverer ( ) { return this . org.springframework.web.reactive.result.method.ParameterNameDiscoverer ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.result.method.Mono<org.springframework.web.reactive.result.method.HandlerResult> < HandlerResult > org.springframework.web.reactive.result.method.Mono<org.springframework.web.reactive.result.method.HandlerResult> ( ServerWebExchange org.springframework.web.reactive.result.method.ServerWebExchange , BindingContext org.springframework.web.reactive.result.method.BindingContext , java.lang.Object ... java.lang.Object[] ) { return org.springframework.web.reactive.result.method.Mono<java.lang.Object[]> ( org.springframework.web.reactive.result.method.ServerWebExchange , org.springframework.web.reactive.result.method.BindingContext , java.lang.Object[] ) . then ( args -> { try { Object value = doInvoke ( args ) ; HandlerResult result = new HandlerResult ( this , value , getReturnType ( ) , bindingContext ) ; HttpStatus status = getResponseStatus ( ) ; if ( status != null ) { exchange . getResponse ( ) . setStatusCode ( status ) ; } return Mono . just ( result ) ; } catch ( InvocationTargetException ex ) { return Mono . error ( ex . getTargetException ( ) ) ; } catch ( Throwable ex ) { return Mono . error ( new IllegalStateException ( getInvocationErrorMessage ( args ) ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.method.Mono<java.lang.Object[]> < java.lang.Object [] > org.springframework.web.reactive.result.method.Mono<java.lang.Object[]> ( ServerWebExchange org.springframework.web.reactive.result.method.ServerWebExchange , BindingContext org.springframework.web.reactive.result.method.BindingContext , java.lang.Object ... java.lang.Object[] ) { if ( ObjectUtils . isEmpty ( getMethodParameters ( ) ) ) { return org.springframework.web.reactive.result.method.Mono<java.lang.Object[]> ; } try { java.util.List<org.springframework.web.reactive.result.method.Mono<java.lang.Object>> < Mono < java.lang.Object > > java.util.List<org.springframework.web.reactive.result.method.Mono<java.lang.Object>> = java.util.stream.Stream . java.util.stream.Stream ( getMethodParameters ( ) ) . map ( param -> { param . initParameterNameDiscovery ( this . parameterNameDiscoverer ) ; return findProvidedArgument ( param , providedArgs ) . map ( Mono :: just ) . orElseGet ( ( ) { HandlerMethodArgumentResolver resolver = findResolver ( param ) ; return resolveArg ( resolver , param , bindingContext , exchange ) ; } ) ; } ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; return Mono . when ( java.util.List<org.springframework.web.reactive.result.method.Mono<java.lang.Object>> , argValues -> Stream . of ( argValues ) . map ( o -> o != NO_ARG_VALUE ? o : null ) . toArray ( ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { return Mono . error ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> private java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( MethodParameter org.springframework.web.reactive.result.method.MethodParameter , java.lang.Object ... java.lang.Object[] ) { if ( ObjectUtils . isEmpty ( java.lang.Object[] ) ) { return java.util.Optional . java.util.Optional<java.lang.Object> ( ) ; } return java.util.Arrays . java.util.stream.Stream<java.lang.Object> ( java.lang.Object[] ) . java.util.stream.Stream<java.lang.Object> ( java.lang.Object -> org.springframework.web.reactive.result.method.MethodParameter . getParameterType ( ) . isInstance ( java.lang.Object ) ) . java.util.Optional<java.lang.Object> ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver ( MethodParameter org.springframework.web.reactive.result.method.MethodParameter ) { return this . java.util.List<org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver> . stream ( ) . filter ( r -> r . supportsParameter ( param ) ) . findFirst ( ) . orElseThrow ( ( ) getArgumentError ( STRING , param , null ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.method.Mono<java.lang.Object> < java.lang.Object > org.springframework.web.reactive.result.method.Mono<java.lang.Object> ( HandlerMethodArgumentResolver org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver , MethodParameter org.springframework.web.reactive.result.method.MethodParameter , BindingContext org.springframework.web.reactive.result.method.BindingContext , ServerWebExchange org.springframework.web.reactive.result.method.ServerWebExchange ) { try { return org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.MethodParameter , org.springframework.web.reactive.result.method.BindingContext , org.springframework.web.reactive.result.method.ServerWebExchange ) . defaultIfEmpty ( java.lang.Object ) . doOnError ( cause -> { if ( logger . isDebugEnabled ( ) ) { logger . debug ( getDetailedErrorMessage ( STRING , parameter ) , cause ) ; } } ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw java.lang.IllegalStateException ( STRING , org.springframework.web.reactive.result.method.MethodParameter , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.IllegalStateException java.lang.IllegalStateException ( java.lang.String java.lang.String , MethodParameter org.springframework.web.reactive.result.method.MethodParameter , java.lang.Throwable java.lang.Throwable ) { return new java.lang.IllegalStateException ( java.lang.String ( java.lang.String , org.springframework.web.reactive.result.method.MethodParameter ) , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , MethodParameter org.springframework.web.reactive.result.method.MethodParameter ) { return java.lang.String + STRING + org.springframework.web.reactive.result.method.MethodParameter . getParameterIndex ( ) + STRING + org.springframework.web.reactive.result.method.MethodParameter . getParameterType ( ) . getName ( ) + STRING + getBridgedMethod ( ) . toGenericString ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) throws java.lang.Exception { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + ClassUtils . getQualifiedMethodName ( getMethod ( ) , getBeanType ( ) ) + STRING + java.util.Arrays . java.lang.String ( java.lang.Object[] ) ) ; } ReflectionUtils . makeAccessible ( getBridgedMethod ( ) ) ; java.lang.Object java.lang.Object = getBridgedMethod ( ) . invoke ( getBean ( ) , java.lang.Object[] ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + ClassUtils . getQualifiedMethodName ( getMethod ( ) , getBeanType ( ) ) + STRING + java.lang.Object + STRING ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object [] java.lang.Object[] ) { java.lang.String java.lang.String = java.util.stream.IntStream . java.util.stream.IntStream ( NUMBER , java.lang.Object[] . int ) . java.util.stream.Stream<java.lang.String> ( int -> ( java.lang.Object[] [ int ] != null ? STRING + int + STRING + java.lang.Object[] [ int ] . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING + java.lang.Object[] [ int ] + STRING : STRING + int + STRING ) ) . java.lang.String ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.CharSequence,?,java.lang.String> ( STRING , STRING , STRING ) ) ; return STRING + java.lang.String + STRING + getBridgedMethod ( ) . toGenericString ( ) ; }  <METHOD_END>
