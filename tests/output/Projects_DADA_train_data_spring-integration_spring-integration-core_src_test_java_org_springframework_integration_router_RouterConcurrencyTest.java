<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger = new java.util.concurrent.atomic.AtomicInteger ( ) ; final java.util.concurrent.Semaphore java.util.concurrent.Semaphore = new java.util.concurrent.Semaphore ( NUMBER ) ; final AbstractMessageRouter org.springframework.integration.router.AbstractMessageRouter = new AbstractMessageRouter ( ) { @ java.lang.Override protected java.util.Collection<org.springframework.integration.router.MessageChannel> < MessageChannel > java.util.Collection<org.springframework.integration.router.MessageChannel> ( Message < ? > org.springframework.integration.router.Message<?> ) { return null ; } @ java.lang.Override protected void void ( ConversionService org.springframework.integration.router.ConversionService ) { try { if ( java.util.concurrent.atomic.AtomicInteger . int ( ) > NUMBER ) { java.lang.Thread . void ( NUMBER ) ; } super. setConversionService ( org.springframework.integration.router.ConversionService ) ; java.util.concurrent.Semaphore . void ( ) ; java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } } ; final java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger = new java.util.concurrent.atomic.AtomicInteger ( ) ; BeanFactory org.springframework.integration.router.BeanFactory = mock ( BeanFactory .class ) ; doAnswer ( invocation -> { if ( beanCounter . getAndIncrement ( ) < NUMBER ) { semaphore . tryAcquire ( NUMBER , TimeUnit . SECONDS ) ; } return false ; } ) . when ( org.springframework.integration.router.BeanFactory ) . containsBean ( IntegrationUtils . INTEGRATION_CONVERSION_SERVICE_BEAN_NAME ) ; org.springframework.integration.router.AbstractMessageRouter . setBeanFactory ( org.springframework.integration.router.BeanFactory ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( NUMBER ) ; final java.util.List<org.springframework.integration.router.ConversionService> < ConversionService > java.util.List<org.springframework.integration.router.ConversionService> = java.util.Collections . java.util.List<org.springframework.integration.router.ConversionService> ( new java.util.ArrayList<org.springframework.integration.router.ConversionService> < ConversionService > ( ) ) ; java.lang.Runnable java.lang.Runnable = ( ) { ConversionService org.springframework.integration.router.ConversionService = org.springframework.integration.router.AbstractMessageRouter . getRequiredConversionService ( ) ; java.util.List<org.springframework.integration.router.ConversionService> . add ( org.springframework.integration.router.ConversionService ) ; } ; java.util.concurrent.ExecutorService . void ( java.lang.Runnable ) ; java.util.concurrent.ExecutorService . void ( java.lang.Runnable ) ; java.util.concurrent.ExecutorService . void ( ) ; java.util.concurrent.ExecutorService . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.router.ConversionService> . size ( ) ) ; assertNotNull ( java.util.List<org.springframework.integration.router.ConversionService> . get ( NUMBER ) ) ; assertNotNull ( java.util.List<org.springframework.integration.router.ConversionService> . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<org.springframework.integration.router.MessageChannel> < MessageChannel > java.util.Collection<org.springframework.integration.router.MessageChannel> ( Message < ? > org.springframework.integration.router.Message<?> ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ConversionService org.springframework.integration.router.ConversionService ) { try { if ( java.util.concurrent.atomic.AtomicInteger . int ( ) > NUMBER ) { java.lang.Thread . void ( NUMBER ) ; } super. setConversionService ( org.springframework.integration.router.ConversionService ) ; java.util.concurrent.Semaphore . void ( ) ; java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } }  <METHOD_END>