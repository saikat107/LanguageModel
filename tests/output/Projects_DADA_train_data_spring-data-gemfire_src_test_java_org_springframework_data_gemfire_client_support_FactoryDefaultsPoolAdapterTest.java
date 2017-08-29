<METHOD_START> protected java.net.InetSocketAddress java.net.InetSocketAddress ( java.lang.String java.lang.String , int int ) { return new java.net.InetSocketAddress ( java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getFreeConnectionTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_FREE_CONNECTION_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getIdleTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_IDLE_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getLoadConditioningInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_LOAD_CONDITIONING_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getMaxConnections ( ) , is ( equalTo ( PoolFactory . DEFAULT_MAX_CONNECTIONS ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getMinConnections ( ) , is ( equalTo ( PoolFactory . DEFAULT_MIN_CONNECTIONS ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getMultiuserAuthentication ( ) , is ( equalTo ( PoolFactory . DEFAULT_MULTIUSER_AUTHENTICATION ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getPRSingleHopEnabled ( ) , is ( equalTo ( PoolFactory . DEFAULT_PR_SINGLE_HOP_ENABLED ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getPingInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_PING_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getReadTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_READ_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getRetryAttempts ( ) , is ( equalTo ( PoolFactory . DEFAULT_RETRY_ATTEMPTS ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getServerGroup ( ) , is ( equalTo ( PoolFactory . DEFAULT_SERVER_GROUP ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getSocketBufferSize ( ) , is ( equalTo ( PoolFactory . DEFAULT_SOCKET_BUFFER_SIZE ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getStatisticInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_STATISTIC_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getSubscriptionAckInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_ACK_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getSubscriptionEnabled ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_ENABLED ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getSubscriptionMessageTrackingTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_MESSAGE_TRACKING_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getSubscriptionRedundancy ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_REDUNDANCY ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getThreadLocalConnections ( ) , is ( equalTo ( PoolFactory . DEFAULT_THREAD_LOCAL_CONNECTIONS ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getLocators ( ) , is ( equalTo ( java.util.Collections .< java.net.InetSocketAddress > java.util.List<java.net.InetSocketAddress> ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getName ( ) , is ( equalTo ( FactoryDefaultsPoolAdapter . DEFAULT_POOL_NAME ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getQueryService ( ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getServers ( ) , is ( equalTo ( java.util.Collections . java.util.List<java.net.InetSocketAddress> ( java.net.InetSocketAddress ( STRING , int ) ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.client.support.ExpectedException . expect ( java.lang.UnsupportedOperationException .class ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectMessage ( FactoryDefaultsPoolAdapter . NOT_IMPLEMENTED ) ; org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . isDestroyed ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.client.support.ExpectedException . expect ( java.lang.UnsupportedOperationException .class ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectMessage ( FactoryDefaultsPoolAdapter . NOT_IMPLEMENTED ) ; org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . getPendingEventCount ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.client.support.ExpectedException . expect ( java.lang.UnsupportedOperationException .class ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectMessage ( FactoryDefaultsPoolAdapter . NOT_IMPLEMENTED ) ; org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.client.support.ExpectedException . expect ( java.lang.UnsupportedOperationException .class ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectMessage ( FactoryDefaultsPoolAdapter . NOT_IMPLEMENTED ) ; org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . destroy ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.client.support.ExpectedException . expect ( java.lang.UnsupportedOperationException .class ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectMessage ( FactoryDefaultsPoolAdapter . NOT_IMPLEMENTED ) ; org.springframework.data.gemfire.client.support.FactoryDefaultsPoolAdapter . releaseThreadLocalConnection ( ) ; }  <METHOD_END>
