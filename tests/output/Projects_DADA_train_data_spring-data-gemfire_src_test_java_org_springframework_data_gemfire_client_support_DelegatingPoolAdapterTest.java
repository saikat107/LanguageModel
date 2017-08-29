<METHOD_START> protected java.net.InetSocketAddress java.net.InetSocketAddress ( java.lang.String java.lang.String , int int ) { return new java.net.InetSocketAddress ( java.lang.String , int ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { when ( org.springframework.data.gemfire.client.support.Pool . isDestroyed ( ) ) . thenReturn ( false ) ; when ( org.springframework.data.gemfire.client.support.Pool . getFreeConnectionTimeout ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getIdleTimeout ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getLoadConditioningInterval ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getLocators ( ) ) . thenReturn ( java.util.Collections . java.util.List<java.net.InetSocketAddress> ( java.net.InetSocketAddress ( STRING , NUMBER ) ) ) ; when ( org.springframework.data.gemfire.client.support.Pool . getMaxConnections ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getMinConnections ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getMultiuserAuthentication ( ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.client.support.Pool . getName ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.client.support.Pool . getPendingEventCount ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getPingInterval ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getPRSingleHopEnabled ( ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.client.support.Pool . getQueryService ( ) ) . thenReturn ( org.springframework.data.gemfire.client.support.QueryService ) ; when ( org.springframework.data.gemfire.client.support.Pool . getReadTimeout ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getRetryAttempts ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getServerGroup ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.client.support.Pool . getServers ( ) ) . thenReturn ( java.util.Collections . java.util.List<java.net.InetSocketAddress> ( java.net.InetSocketAddress ( STRING , NUMBER ) ) ) ; when ( org.springframework.data.gemfire.client.support.Pool . getSocketBufferSize ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getStatisticInterval ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionAckInterval ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionEnabled ( ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionMessageTrackingTimeout ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionRedundancy ( ) ) . thenReturn ( NUMBER ) ; when ( org.springframework.data.gemfire.client.support.Pool . getThreadLocalConnections ( ) ) . thenReturn ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( DelegatingPoolAdapter . from ( org.springframework.data.gemfire.client.support.Pool ) . getDelegate ( ) , is ( equalTo ( org.springframework.data.gemfire.client.support.Pool ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Pool org.springframework.data.gemfire.client.support.Pool = DelegatingPoolAdapter . from ( org.springframework.data.gemfire.client.support.Pool ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . isDestroyed ( ) , is ( equalTo ( false ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getFreeConnectionTimeout ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getIdleTimeout ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getLoadConditioningInterval ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getMaxConnections ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getMinConnections ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getMultiuserAuthentication ( ) , is ( equalTo ( true ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getLocators ( ) , is ( equalTo ( java.util.Collections . java.util.List<java.net.InetSocketAddress> ( java.net.InetSocketAddress ( STRING , NUMBER ) ) ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getName ( ) , is ( equalTo ( STRING ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getPendingEventCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getPingInterval ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getPRSingleHopEnabled ( ) , is ( equalTo ( true ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getQueryService ( ) , is ( equalTo ( org.springframework.data.gemfire.client.support.QueryService ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getReadTimeout ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getRetryAttempts ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getServerGroup ( ) , is ( equalTo ( STRING ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getServers ( ) , is ( equalTo ( java.util.Collections . java.util.List<java.net.InetSocketAddress> ( java.net.InetSocketAddress ( STRING , NUMBER ) ) ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSocketBufferSize ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getStatisticInterval ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionAckInterval ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionEnabled ( ) , is ( equalTo ( true ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionMessageTrackingTimeout ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionRedundancy ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getThreadLocalConnections ( ) , is ( equalTo ( false ) ) ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . isDestroyed ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getFreeConnectionTimeout ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getIdleTimeout ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getLoadConditioningInterval ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getLocators ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getMaxConnections ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getMinConnections ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getMultiuserAuthentication ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getName ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getPendingEventCount ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getPingInterval ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getPRSingleHopEnabled ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getQueryService ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getReadTimeout ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getRetryAttempts ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getServerGroup ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getServers ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getSocketBufferSize ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getStatisticInterval ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getSubscriptionAckInterval ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getSubscriptionEnabled ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getSubscriptionMessageTrackingTimeout ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getSubscriptionRedundancy ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . getThreadLocalConnections ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DelegatingPoolAdapter . from ( org.springframework.data.gemfire.client.support.Pool ) . destroy ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DelegatingPoolAdapter . from ( org.springframework.data.gemfire.client.support.Pool ) . destroy ( true ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . destroy ( eq ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DelegatingPoolAdapter . from ( org.springframework.data.gemfire.client.support.Pool ) . releaseThreadLocalConnection ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , times ( NUMBER ) ) . releaseThreadLocalConnection ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Pool org.springframework.data.gemfire.client.support.Pool = DelegatingPoolAdapter . from ( null ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getFreeConnectionTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_FREE_CONNECTION_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getIdleTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_IDLE_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getLoadConditioningInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_LOAD_CONDITIONING_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getMaxConnections ( ) , is ( equalTo ( PoolFactory . DEFAULT_MAX_CONNECTIONS ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getMinConnections ( ) , is ( equalTo ( PoolFactory . DEFAULT_MIN_CONNECTIONS ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getMultiuserAuthentication ( ) , is ( equalTo ( PoolFactory . DEFAULT_MULTIUSER_AUTHENTICATION ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getPingInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_PING_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getPRSingleHopEnabled ( ) , is ( equalTo ( PoolFactory . DEFAULT_PR_SINGLE_HOP_ENABLED ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getReadTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_READ_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getRetryAttempts ( ) , is ( equalTo ( PoolFactory . DEFAULT_RETRY_ATTEMPTS ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getServerGroup ( ) , is ( equalTo ( PoolFactory . DEFAULT_SERVER_GROUP ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSocketBufferSize ( ) , is ( equalTo ( PoolFactory . DEFAULT_SOCKET_BUFFER_SIZE ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getStatisticInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_STATISTIC_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionAckInterval ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_ACK_INTERVAL ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionEnabled ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_ENABLED ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionMessageTrackingTimeout ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_MESSAGE_TRACKING_TIMEOUT ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getSubscriptionRedundancy ( ) , is ( equalTo ( PoolFactory . DEFAULT_SUBSCRIPTION_REDUNDANCY ) ) ) ; assertThat ( org.springframework.data.gemfire.client.support.Pool . getThreadLocalConnections ( ) , is ( equalTo ( PoolFactory . DEFAULT_THREAD_LOCAL_CONNECTIONS ) ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.client.support.Pool ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.client.support.ExpectedException . expect ( java.lang.UnsupportedOperationException .class ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.client.support.ExpectedException . expectMessage ( is ( equalTo ( DelegatingPoolAdapter . NOT_IMPLEMENTED ) ) ) ; DelegatingPoolAdapter . from ( null ) . isDestroyed ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( DelegatingPoolAdapter . from ( null ) . getLocators ( ) , is ( equalTo ( java.util.Collections .< java.net.InetSocketAddress > java.util.List<java.net.InetSocketAddress> ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( DelegatingPoolAdapter . from ( null ) . getName ( ) , is ( equalTo ( DelegatingPoolAdapter . DEFAULT_POOL_NAME ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( DelegatingPoolAdapter . from ( null ) . getPendingEventCount ( ) , is ( equalTo ( NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( DelegatingPoolAdapter . from ( null ) . getQueryService ( ) , is ( nullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( DelegatingPoolAdapter . from ( null ) . getServers ( ) , is ( equalTo ( java.util.Collections . java.util.List ( java.net.InetSocketAddress ( STRING , GemfireUtils . DEFAULT_CACHE_SERVER_PORT ) ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DelegatingPoolAdapter . from ( null ) . destroy ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , never ( ) ) . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DelegatingPoolAdapter . from ( null ) . destroy ( false ) ; verify ( org.springframework.data.gemfire.client.support.Pool , never ( ) ) . destroy ( anyBoolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DelegatingPoolAdapter . from ( null ) . releaseThreadLocalConnection ( ) ; verify ( org.springframework.data.gemfire.client.support.Pool , never ( ) ) . releaseThreadLocalConnection ( ) ; }  <METHOD_END>
