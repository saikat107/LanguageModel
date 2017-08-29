<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . void ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer = new PollingConsumer ( org.springframework.integration.endpoint.PollableChannel , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer ) ; org.springframework.integration.endpoint.ThreadPoolTaskScheduler . setPoolSize ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . setErrorHandler ( org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestErrorHandler ) ; org.springframework.integration.endpoint.PollingConsumer . setTaskScheduler ( org.springframework.integration.endpoint.ThreadPoolTaskScheduler ) ; org.springframework.integration.endpoint.PollingConsumer . setTrigger ( org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger ) ; org.springframework.integration.endpoint.PollingConsumer . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.endpoint.PollingConsumer . setReceiveTimeout ( - NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . afterPropertiesSet ( ) ; org.springframework.integration.endpoint.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; Mockito . reset ( org.springframework.integration.endpoint.PollableChannel ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { org.springframework.integration.endpoint.ThreadPoolTaskScheduler . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( ) ) . thenReturn ( org.springframework.integration.endpoint.Message ) ; org.springframework.integration.endpoint.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( ) ) . thenReturn ( org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message ) ; org.springframework.integration.endpoint.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( ) ) . thenReturn ( org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , org.springframework.integration.endpoint.Message , null ) ; org.springframework.integration.endpoint.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { for ( int int = NUMBER ; int < NUMBER ; int ++ ) { this . void ( ) ; this . void ( ) ; this . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageRejectedException .class ) public void void ( ) java.lang.Throwable { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( ) ) . thenReturn ( org.springframework.integration.endpoint.Message ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestErrorHandler . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageRejectedException .class ) public void void ( ) java.lang.Throwable { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( ) ) . thenReturn ( org.springframework.integration.endpoint.Message ) ; org.springframework.integration.endpoint.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestErrorHandler . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( ) ) . thenReturn ( null ) ; org.springframework.integration.endpoint.PollingConsumer . setReceiveTimeout ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.integration.endpoint.PollableChannel . receive ( Mockito . eq ( NUMBER ) ) ) . thenReturn ( org.springframework.integration.endpoint.Message ) ; org.springframework.integration.endpoint.PollingConsumer . setReceiveTimeout ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . setMaxMessagesPerPoll ( NUMBER ) ; org.springframework.integration.endpoint.PollingConsumer . start ( ) ; org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestTrigger . void ( ) ; org.springframework.integration.endpoint.PollingConsumer . stop ( ) ; assertEquals ( NUMBER , org.springframework.integration.endpoint.PollingConsumerEndpointTests.TestConsumer . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; if ( STRING . boolean ( org.springframework.integration.endpoint.Message<> . getPayload ( ) . toString ( ) ) ) { throw new MessageRejectedException ( org.springframework.integration.endpoint.Message<> , STRING ) ; } }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Date java.util.Date ( TriggerContext org.springframework.integration.endpoint.TriggerContext ) { if ( ! this . java.util.concurrent.atomic.AtomicBoolean . boolean ( true ) ) { return new java.util.Date ( ) ; } this . java.util.concurrent.CountDownLatch . void ( ) ; return null ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; this . java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { try { this . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; if ( java.util.concurrent.CountDownLatch . long ( ) != NUMBER ) { throw new java.lang.RuntimeException ( STRING ) ; } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { throw new java.lang.RuntimeException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { this . java.lang.Throwable = java.lang.Throwable ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Throwable { java.lang.Throwable java.lang.Throwable = this . java.lang.Throwable ; this . java.lang.Throwable = null ; throw java.lang.Throwable ; }  <METHOD_END>
