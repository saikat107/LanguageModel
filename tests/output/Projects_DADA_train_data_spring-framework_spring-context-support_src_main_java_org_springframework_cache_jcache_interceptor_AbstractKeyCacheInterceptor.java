<METHOD_START> protected void ( CacheErrorHandler org.springframework.cache.jcache.interceptor.CacheErrorHandler ) { super( org.springframework.cache.jcache.interceptor.CacheErrorHandler ); }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( CacheOperationInvocationContext < O > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> ) { KeyGenerator org.springframework.cache.jcache.interceptor.KeyGenerator = org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getOperation ( ) . getKeyGenerator ( ) ; java.lang.Object java.lang.Object = org.springframework.cache.jcache.interceptor.KeyGenerator . generate ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getTarget ( ) , org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getMethod ( ) , org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getArgs ( ) ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.lang.Object + STRING + org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getOperation ( ) ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<A> < A > org.springframework.cache.jcache.interceptor.CacheKeyInvocationContext<A> ( CacheOperationInvocationContext < O > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> ) { return new DefaultCacheKeyInvocationContext <> ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getOperation ( ) , org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getTarget ( ) , org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<O> . getArgs ( ) ) ; }  <METHOD_END>
