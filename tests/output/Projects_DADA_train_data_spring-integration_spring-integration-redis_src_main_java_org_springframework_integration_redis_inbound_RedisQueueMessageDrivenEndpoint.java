<METHOD_START> public void ( java.lang.String java.lang.String , RedisConnectionFactory org.springframework.integration.redis.inbound.RedisConnectionFactory ) { Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.integration.redis.inbound.RedisConnectionFactory , STRING ) ; RedisTemplate < java.lang.String , byte [] > org.springframework.integration.redis.inbound.RedisTemplate<java.lang.String,byte[]> = new RedisTemplate < java.lang.String , byte [] > ( ) ; org.springframework.integration.redis.inbound.RedisTemplate<java.lang.String,byte[]> . setConnectionFactory ( org.springframework.integration.redis.inbound.RedisConnectionFactory ) ; org.springframework.integration.redis.inbound.RedisTemplate<java.lang.String,byte[]> . setEnableDefaultSerializer ( false ) ; org.springframework.integration.redis.inbound.RedisTemplate<java.lang.String,byte[]> . setKeySerializer ( new StringRedisSerializer ( ) ) ; org.springframework.integration.redis.inbound.RedisTemplate<java.lang.String,byte[]> . afterPropertiesSet ( ) ; this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> = org.springframework.integration.redis.inbound.RedisTemplate<java.lang.String,byte[]> . boundListOps ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEventPublisher org.springframework.integration.redis.inbound.ApplicationEventPublisher ) { this . org.springframework.integration.redis.inbound.ApplicationEventPublisher = org.springframework.integration.redis.inbound.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> public void void ( RedisSerializer < ? > org.springframework.integration.redis.inbound.RedisSerializer<?> ) { this . org.springframework.integration.redis.inbound.RedisSerializer<?> = org.springframework.integration.redis.inbound.RedisSerializer<> ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { Assert . isTrue ( long > NUMBER , STRING ) ; this . long = long ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.concurrent.Executor java.util.concurrent.Executor ) { this . java.util.concurrent.Executor = java.util.concurrent.Executor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageChannel org.springframework.integration.redis.inbound.MessageChannel ) { super. setErrorChannel ( org.springframework.integration.redis.inbound.MessageChannel ) ; this . org.springframework.integration.redis.inbound.MessageChannel = org.springframework.integration.redis.inbound.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. onInit ( ) ; if ( this . boolean ) { Assert . notNull ( this . org.springframework.integration.redis.inbound.RedisSerializer<> , STRING ) ; } if ( this . java.util.concurrent.Executor == null ) { java.lang.String java.lang.String = this . getComponentName ( ) ; this . java.util.concurrent.Executor = new SimpleAsyncTaskExecutor ( ( java.lang.String == null ? STRING : java.lang.String + STRING ) + this . java.lang.String ( ) ) ; } if ( ! ( this . java.util.concurrent.Executor instanceof ErrorHandlingTaskExecutor ) && this . getBeanFactory ( ) != null ) { MessagePublishingErrorHandler org.springframework.integration.redis.inbound.MessagePublishingErrorHandler = new MessagePublishingErrorHandler ( new BeanFactoryChannelResolver ( this . getBeanFactory ( ) ) ) ; org.springframework.integration.redis.inbound.MessagePublishingErrorHandler . setDefaultErrorChannel ( this . org.springframework.integration.redis.inbound.MessageChannel ) ; this . java.util.concurrent.Executor = new ErrorHandlingTaskExecutor ( this . java.util.concurrent.Executor , org.springframework.integration.redis.inbound.MessagePublishingErrorHandler ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( ) { Message < java.lang.Object > org.springframework.integration.redis.inbound.Message<java.lang.Object> = null ; byte [] byte[] = null ; try { if ( this . boolean ) { byte[] = this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . rightPop ( this . long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } else { byte[] = this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . leftPop ( this . long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } } catch ( java.lang.Exception java.lang.Exception ) { this . boolean = false ; if ( this . boolean ) { logger . error ( STRING + this . long + STRING , java.lang.Exception ) ; this . void ( java.lang.Exception ) ; this . void ( ) ; } else { logger . debug ( STRING + java.lang.Exception . java.lang.Class<? extends java.lang.Exception> ( ) + STRING + java.lang.Exception . java.lang.String ( ) ) ; } return; } if ( byte[] != null ) { if ( this . boolean ) { try { org.springframework.integration.redis.inbound.Message<java.lang.Object> = ( Message < java.lang.Object > ) this . org.springframework.integration.redis.inbound.RedisSerializer<> . deserialize ( byte[] ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MessagingException ( STRING , java.lang.Exception ) ; } } else { java.lang.Object java.lang.Object = byte[] ; if ( this . org.springframework.integration.redis.inbound.RedisSerializer<> != null ) { java.lang.Object = this . org.springframework.integration.redis.inbound.RedisSerializer<> . deserialize ( byte[] ) ; } org.springframework.integration.redis.inbound.Message<java.lang.Object> = this . getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . build ( ) ; } } if ( org.springframework.integration.redis.inbound.Message<java.lang.Object> != null ) { if ( this . boolean ) { this . sendMessage ( org.springframework.integration.redis.inbound.Message<java.lang.Object> ) ; } else { if ( this . boolean ) { this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . rightPush ( byte[] ) ; } else { this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . leftPush ( byte[] ) ; } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( ! this . boolean ) { this . boolean = true ; this . void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( this . long > NUMBER ) { try { java.lang.Thread . void ( this . long ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { logger . debug ( STRING ) ; java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Exception java.lang.Exception ) { if ( this . org.springframework.integration.redis.inbound.ApplicationEventPublisher != null ) { this . org.springframework.integration.redis.inbound.ApplicationEventPublisher . publishEvent ( new RedisExceptionEvent ( this , java.lang.Exception ) ) ; } else { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.Exception . java.lang.String ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( ) { this . java.util.concurrent.Executor . void ( new org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint.ListenerTask ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Runnable java.lang.Runnable ) { this . java.lang.Runnable = java.lang.Runnable ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStop ( ) ; this . boolean = this . boolean = false ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ ManagedMetric public long long ( ) { return this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . size ( ) ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation public void void ( ) { this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . getOperations ( ) . delete ( this . org.springframework.integration.redis.inbound.BoundListOperations<java.lang.String,byte[]> . getKey ( ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { try { while ( org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . boolean ) { org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . boolean = true ; org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . void ( ) ; } } finally { if ( org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . boolean ) { org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . void ( ) ; } else if ( org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . java.lang.Runnable != null ) { org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . java.lang.Runnable . void ( ) ; org.springframework.integration.redis.inbound.RedisQueueMessageDrivenEndpoint .this . java.lang.Runnable = null ; } } }  <METHOD_END>