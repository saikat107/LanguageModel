<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> < Message < ? > > java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> ( STRING ) ; java.lang.Object java.lang.Object = java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> . get ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( STRING , ( ( Message < ? > ) java.lang.Object ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.Error java.lang.Error = new java.lang.Error ( STRING ) ; DirectChannel org.springframework.integration.gateway.DirectChannel = new DirectChannel ( ) { @ java.lang.Override protected boolean boolean ( Message < ? > org.springframework.integration.gateway.Message<?> , long long ) { throw java.lang.Error ; } } ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.DirectChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> < Message < ? > > java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> ( STRING ) ; try { java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> . get ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; fail ( STRING ) ; } catch ( java.util.concurrent.ExecutionException java.util.concurrent.ExecutionException ) { assertEquals ( java.lang.Error , java.util.concurrent.ExecutionException . java.lang.Throwable ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( Message < ? > org.springframework.integration.gateway.Message<?> , long long ) { throw java.lang.Error ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; ListenableFuture < Message < ? > > org.springframework.integration.gateway.ListenableFuture<org.springframework.integration.gateway.Message<?>> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . org.springframework.integration.gateway.ListenableFuture<org.springframework.integration.gateway.Message<?>> ( STRING ) ; long long = java.lang.System . long ( ) ; final java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> < Message < ? > > java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> = new java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> < Message < ? > > ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.gateway.ListenableFuture<org.springframework.integration.gateway.Message<?>> . addCallback ( new ListenableFutureCallback < Message < ? > > ( ) { @ java.lang.Override public void void ( Message < ? > org.springframework.integration.gateway.Message<?> ) { java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> . set ( org.springframework.integration.gateway.Message<> ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) {			} } ) ; assertTrue ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; long long = java.lang.System . long ( ) - long ; assertTrue ( long >= NUMBER ) ; assertEquals ( STRING , java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> . get ( ) . getPayload ( ) ) ; java.lang.Object java.lang.Object = java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> . get ( ) . getHeaders ( ) . get ( STRING ) ; assertNotEquals ( java.lang.Thread . java.lang.Thread ( ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.gateway.Message<?> ) { java.util.concurrent.atomic.AtomicReference<org.springframework.integration.gateway.Message<?>> . set ( org.springframework.integration.gateway.Message<> ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) {			}  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture ( STRING ) ; java.lang.String java.lang.String = org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture . java.lang.String ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( STRING , java.lang.String ) ; assertEquals ( java.lang.Thread . java.lang.Thread ( ) , org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture . java.lang.Thread ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setAsyncExecutor ( null ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture = ( org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture ) org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . java.util.concurrent.Future<?> ( STRING ) ; java.lang.String java.lang.String = org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture . java.lang.String ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( STRING , java.lang.String ) ; assertEquals ( java.lang.Thread . java.lang.Thread ( ) , org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture . java.lang.Thread ) ; }  <METHOD_END>
<METHOD_START> protected void void ( QueueChannel org.springframework.integration.gateway.QueueChannel ) { org.springframework.integration.gateway.QueueChannel . addInterceptor ( new ChannelInterceptorAdapter ( ) { @ java.lang.Override public org.springframework.integration.gateway.Message<?> < ? > org.springframework.integration.gateway.Message<?> ( Message < ? > org.springframework.integration.gateway.Message<?> , MessageChannel org.springframework.integration.gateway.MessageChannel ) { return MessageBuilder . fromMessage ( org.springframework.integration.gateway.Message<> ) . setHeader ( STRING , java.lang.Thread . java.lang.Thread ( ) ) . build ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.gateway.Message<?> < ? > org.springframework.integration.gateway.Message<?> ( Message < ? > org.springframework.integration.gateway.Message<?> , MessageChannel org.springframework.integration.gateway.MessageChannel ) { return MessageBuilder . fromMessage ( org.springframework.integration.gateway.Message<> ) . setHeader ( STRING , java.lang.Thread . java.lang.Thread ( ) ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; java.util.concurrent.Future<java.lang.String> < java.lang.String > java.util.concurrent.Future<java.lang.String> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . java.util.concurrent.Future<java.lang.String> ( STRING ) ; java.lang.Object java.lang.Object = java.util.concurrent.Future<java.lang.String> . java.lang.String ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; java.util.concurrent.Future<?> < ? > java.util.concurrent.Future<?> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . java.util.concurrent.Future<?> ( STRING ) ; java.lang.Object java.lang.Object = java.util.concurrent.Future<> . get ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertTrue ( java.lang.Object instanceof java.lang.String ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; Mono < Message < ? > > org.springframework.integration.gateway.Mono<org.springframework.integration.gateway.Message<?>> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . org.springframework.integration.gateway.Mono<org.springframework.integration.gateway.Message<?>> ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.gateway.Mono<org.springframework.integration.gateway.Message<?>> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( STRING , ( ( Message < ? > ) java.lang.Object ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; Mono < java.lang.String > org.springframework.integration.gateway.Mono<java.lang.String> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . org.springframework.integration.gateway.Mono<java.lang.String> ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.gateway.Mono<java.lang.String> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; Mono < ? > org.springframework.integration.gateway.Mono<?> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . org.springframework.integration.gateway.Mono<?> ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.gateway.Mono<> . block ( java.time.Duration . java.time.Duration ( NUMBER ) ) ; assertNotNull ( java.lang.Object ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { QueueChannel org.springframework.integration.gateway.QueueChannel = new QueueChannel ( ) ; void ( org.springframework.integration.gateway.QueueChannel ) ; GatewayProxyFactoryBean org.springframework.integration.gateway.GatewayProxyFactoryBean = new GatewayProxyFactoryBean ( ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setDefaultRequestChannel ( org.springframework.integration.gateway.QueueChannel ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setServiceInterface ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService .class ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . setBeanName ( STRING ) ; org.springframework.integration.gateway.GatewayProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService = ( org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService ) org.springframework.integration.gateway.GatewayProxyFactoryBean . getObject ( ) ; Mono < java.lang.String > org.springframework.integration.gateway.Mono<java.lang.String> = org.springframework.integration.gateway.AsyncGatewayTests.TestEchoService . org.springframework.integration.gateway.Mono<java.lang.String> ( STRING ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = new java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; org.springframework.integration.gateway.Mono<java.lang.String> . subscribe ( s -> { result . set ( s ) ; latch . countDown ( ) ; } ) ; java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( STRING , java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private static void void ( final PollableChannel org.springframework.integration.gateway.PollableChannel ) { new java.lang.Thread ( ( ) { Message < ? > org.springframework.integration.gateway.Message<?> = org.springframework.integration.gateway.PollableChannel . receive ( ) ; java.lang.String java.lang.String = org.springframework.integration.gateway.Message<> . getPayload ( ) + STRING ; Message < ? > org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( java.lang.String ) . copyHeaders ( org.springframework.integration.gateway.Message<> . getHeaders ( ) ) . build ( ) ; try { java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; return; } java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ; if ( java.lang.String != null && java.lang.String . boolean ( STRING ) ) { org.springframework.integration.gateway.Message<?> = MessageBuilder . withPayload ( new org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture ( java.lang.String , ( java.lang.Thread ) org.springframework.integration.gateway.Message<> . getHeaders ( ) . get ( STRING ) ) ) . copyHeaders ( org.springframework.integration.gateway.Message<> . getHeaders ( ) ) . build ( ) ; } ( ( MessageChannel ) org.springframework.integration.gateway.Message<> . getHeaders ( ) . getReplyChannel ( ) ) . send ( org.springframework.integration.gateway.Message<> ) ; } ) . void ( ) ; }  <METHOD_END>
<METHOD_START> java.util.concurrent.Future<java.lang.String> < java.lang.String > java.util.concurrent.Future<java.lang.String> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> < Message < ? > > java.util.concurrent.Future<org.springframework.integration.gateway.Message<?>> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> java.util.concurrent.Future<?> < ? > java.util.concurrent.Future<?> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.integration.gateway.ListenableFuture<org.springframework.integration.gateway.Message<?>> < Message < ? > > org.springframework.integration.gateway.ListenableFuture<org.springframework.integration.gateway.Message<?>> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Gateway ( headers = @ GatewayHeader ( name = STRING , expression = STRING ) ) org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture org.springframework.integration.gateway.AsyncGatewayTests.CustomFuture ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Gateway ( headers = @ GatewayHeader ( name = STRING , expression = STRING ) ) java.util.concurrent.Future<?> < ? > java.util.concurrent.Future<?> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.integration.gateway.Mono<java.lang.String> < java.lang.String > org.springframework.integration.gateway.Mono<java.lang.String> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.integration.gateway.Mono<org.springframework.integration.gateway.Message<?>> < Message < ? > > org.springframework.integration.gateway.Mono<org.springframework.integration.gateway.Message<?>> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.integration.gateway.Mono<?> < ? > org.springframework.integration.gateway.Mono<?> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String , java.lang.Thread java.lang.Thread ) { this . java.lang.String = java.lang.String ; this . java.lang.Thread = java.lang.Thread ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( boolean boolean ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) java.lang.InterruptedException , java.util.concurrent.ExecutionException { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) throws java.lang.InterruptedException , java.util.concurrent.ExecutionException , java.util.concurrent.TimeoutException { return java.lang.String ; }  <METHOD_END>
