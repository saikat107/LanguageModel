<METHOD_START> public org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite ( HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ) { this . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . add ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite ( HandlerMethodArgumentResolver ... org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver[] ) { if ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver[] != null ) { for ( HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver : org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver[] ) { this . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . add ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ) ; } } return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolverComposite ( java.util.List<? extends org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> < ? extends HandlerMethodArgumentResolver > java.util.List<? extends org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ) { if ( java.util.List<> != null ) { for ( HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver : java.util.List<> ) { this . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . add ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ) ; } } return this ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ( ) { return java.util.Collections . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ( this . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.messaging.handler.invocation.MethodParameter ) { return org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ( org.springframework.messaging.handler.invocation.MethodParameter ) != null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodParameter org.springframework.messaging.handler.invocation.MethodParameter , Message < ? > org.springframework.messaging.handler.invocation.Message<?> ) throws java.lang.Exception { HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver = org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ( org.springframework.messaging.handler.invocation.MethodParameter ) ; Assert . notNull ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver , STRING + org.springframework.messaging.handler.invocation.MethodParameter . getParameterType ( ) . getName ( ) + STRING ) ; return org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver . resolveArgument ( org.springframework.messaging.handler.invocation.MethodParameter , org.springframework.messaging.handler.invocation.Message<> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ( MethodParameter org.springframework.messaging.handler.invocation.MethodParameter ) { HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver = this . java.util.Map<org.springframework.messaging.handler.invocation.MethodParameter,org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . get ( org.springframework.messaging.handler.invocation.MethodParameter ) ; if ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver == null ) { for ( HandlerMethodArgumentResolver org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver : this . java.util.List<org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> ) { if ( org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver . supportsParameter ( org.springframework.messaging.handler.invocation.MethodParameter ) ) { org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver = org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ; this . java.util.Map<org.springframework.messaging.handler.invocation.MethodParameter,org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver> . put ( org.springframework.messaging.handler.invocation.MethodParameter , org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ) ; break; } } } return org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver ; }  <METHOD_END>
