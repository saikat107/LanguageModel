<METHOD_START> public void ( CouchbaseEnvironment org.springframework.data.couchbase.config.CouchbaseEnvironment ) { this . org.springframework.data.couchbase.config.CouchbaseEnvironment = org.springframework.data.couchbase.config.CouchbaseEnvironment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.Observable<java.lang.Boolean> < java.lang.Boolean > org.springframework.data.couchbase.config.Observable<java.lang.Boolean> ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . shutdownAsync ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.EventLoopGroup org.springframework.data.couchbase.config.EventLoopGroup ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . ioPool ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.EventLoopGroup org.springframework.data.couchbase.config.EventLoopGroup ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . kvIoPool ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.Scheduler org.springframework.data.couchbase.config.Scheduler ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . scheduler ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . dcpEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . sslEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . sslKeystoreFile ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . sslKeystorePassword ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bootstrapHttpEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bootstrapCarrierEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bootstrapHttpDirectPort ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bootstrapHttpSslPort ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bootstrapCarrierDirectPort ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bootstrapCarrierSslPort ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . ioPoolSize ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . computationPoolSize ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.Delay org.springframework.data.couchbase.config.Delay ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . observeIntervalDelay ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.Delay org.springframework.data.couchbase.config.Delay ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . reconnectDelay ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.Delay org.springframework.data.couchbase.config.Delay ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . retryDelay ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . requestBufferSize ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . responseBufferSize ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . dcpConnectionBufferSize ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public double double ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . dcpConnectionBufferAckThreshold ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . kvEndpoints ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . viewEndpoints ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . queryEndpoints ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . userAgent ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . packageNameAndVersion ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.RetryStrategy org.springframework.data.couchbase.config.RetryStrategy ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . retryStrategy ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . maxRequestLifetime ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . autoreleaseAfter ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . keepAliveInterval ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.EventBus org.springframework.data.couchbase.config.EventBus ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . eventBus ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . bufferPoolingEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . managementTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . queryTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . viewTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . kvTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . connectTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . disconnectTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . dnsSrvEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.NetworkLatencyMetricsCollector org.springframework.data.couchbase.config.NetworkLatencyMetricsCollector ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . networkLatencyMetricsCollector ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . socketConnectTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.MetricsCollector org.springframework.data.couchbase.config.MetricsCollector ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . runtimeMetricsCollector ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . mutationTokensEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . tcpNodelayEnabled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . callbacksOnIoPool ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . coreBuild ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . coreVersion ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . dcpConnectionName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . searchEndpoints ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . clientBuild ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . clientVersion ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . searchTimeout ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.WaitStrategyFactory org.springframework.data.couchbase.config.WaitStrategyFactory ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . requestBufferWaitStrategy ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.EventLoopGroup org.springframework.data.couchbase.config.EventLoopGroup ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . viewIoPool ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.EventLoopGroup org.springframework.data.couchbase.config.EventLoopGroup ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . searchIoPool ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.EventLoopGroup org.springframework.data.couchbase.config.EventLoopGroup ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . queryIoPool ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.security.KeyStore java.security.KeyStore ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . sslKeystore ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . shutdown ( long , java.util.concurrent.TimeUnit ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.MemcachedHashingStrategy org.springframework.data.couchbase.config.MemcachedHashingStrategy ( ) { return org.springframework.data.couchbase.config.CouchbaseEnvironment . memcachedHashingStrategy ( ) ; }  <METHOD_END>
