<METHOD_START> protected void ( CacheErrorHandler org.springframework.cache.jcache.interceptor.CacheErrorHandler ) { super( org.springframework.cache.jcache.interceptor.CacheErrorHandler ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( CacheOperationInvocationContext < CacheRemoveOperation > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> , CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) { CacheRemoveOperation org.springframework.cache.jcache.interceptor.CacheRemoveOperation = org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> . getOperation ( ) ; final boolean boolean = org.springframework.cache.jcache.interceptor.CacheRemoveOperation . isEarlyRemove ( ) ; if ( boolean ) { void ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> ) ; } try { java.lang.Object java.lang.Object = org.springframework.cache.jcache.interceptor.CacheOperationInvoker . invoke ( ) ; if ( ! boolean ) { void ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> ) ; } return java.lang.Object ; } catch ( CacheOperationInvoker . CacheOperationInvoker CacheOperationInvoker.ThrowableWrapper ) { java.lang.Throwable java.lang.Throwable = CacheOperationInvoker.ThrowableWrapper . getOriginal ( ) ; if ( ! boolean && org.springframework.cache.jcache.interceptor.CacheRemoveOperation . getExceptionTypeFilter ( ) . match ( java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) ) ) { void ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> ) ; } throw CacheOperationInvoker.ThrowableWrapper ; } }  <METHOD_END>
<METHOD_START> private void void ( CacheOperationInvocationContext < CacheRemoveOperation > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> ) { java.lang.Object java.lang.Object = generateKey ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> ) ; Cache org.springframework.cache.jcache.interceptor.Cache = resolveCache ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.lang.Object + STRING + org.springframework.cache.jcache.interceptor.Cache . getName ( ) + STRING + org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheRemoveOperation> . getOperation ( ) ) ; } doEvict ( org.springframework.cache.jcache.interceptor.Cache , java.lang.Object ) ; }  <METHOD_END>
