<METHOD_START> @ java.lang.Override public final org.springframework.integration.channel.interceptor.Message<?> < ? > org.springframework.integration.channel.interceptor.Message<?> ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel ) { S S = S ( org.springframework.integration.channel.interceptor.Message<> , org.springframework.integration.channel.interceptor.MessageChannel ) ; if ( S != null ) { return new org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState<S> < S > ( org.springframework.integration.channel.interceptor.Message<> , S ) ; } else { return org.springframework.integration.channel.interceptor.Message<> ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public final org.springframework.integration.channel.interceptor.Message<?> < ? > org.springframework.integration.channel.interceptor.Message<?> ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel ) { if ( org.springframework.integration.channel.interceptor.Message<> instanceof org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState ) { org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState<S> < S > org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState<S> = ( org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState<S> < S > ) org.springframework.integration.channel.interceptor.Message<> ; Message < ? > org.springframework.integration.channel.interceptor.Message<?> = org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState<S> . org.springframework.integration.channel.interceptor.Message<java.lang.Object> ; void ( org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState<S> . S , org.springframework.integration.channel.interceptor.Message<> , org.springframework.integration.channel.interceptor.MessageChannel ) ; return org.springframework.integration.channel.interceptor.Message<> ; } return org.springframework.integration.channel.interceptor.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final org.springframework.integration.channel.interceptor.Message<?> < ? > org.springframework.integration.channel.interceptor.Message<?> ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel , MessageHandler org.springframework.integration.channel.interceptor.MessageHandler ) { return org.springframework.integration.channel.interceptor.Message<?> ( org.springframework.integration.channel.interceptor.Message<> , org.springframework.integration.channel.interceptor.MessageChannel ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel , MessageHandler org.springframework.integration.channel.interceptor.MessageHandler , java.lang.Exception java.lang.Exception ) { }  <METHOD_END>
<METHOD_START> protected abstract S S ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel );  <METHOD_END>
<METHOD_START> protected abstract void void ( S S , Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel );  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) void ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , S S ) { this . org.springframework.integration.channel.interceptor.Message<java.lang.Object> = ( Message < java.lang.Object > ) org.springframework.integration.channel.interceptor.Message<> ; this . S = S ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return this . org.springframework.integration.channel.interceptor.Message<java.lang.Object> . getPayload ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.channel.interceptor.MessageHeaders org.springframework.integration.channel.interceptor.MessageHeaders ( ) { return this . org.springframework.integration.channel.interceptor.Message<java.lang.Object> . getHeaders ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.channel.interceptor.Message<?> < ? > org.springframework.integration.channel.interceptor.Message<?> ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> ) { return new org.springframework.integration.channel.interceptor.ThreadStatePropagationChannelInterceptor.MessageWithThreadState <> ( org.springframework.integration.channel.interceptor.Message<> , this . S ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + STRING + this . org.springframework.integration.channel.interceptor.Message<java.lang.Object> + STRING + this . S + '}' ; }  <METHOD_END>
