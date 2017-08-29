<METHOD_START> public void void ( JCacheOperationSource org.springframework.cache.jcache.interceptor.JCacheOperationSource ) { Assert . notNull ( org.springframework.cache.jcache.interceptor.JCacheOperationSource , STRING ) ; this . org.springframework.cache.jcache.interceptor.JCacheOperationSource = org.springframework.cache.jcache.interceptor.JCacheOperationSource ; }  <METHOD_END>
<METHOD_START> public org.springframework.cache.jcache.interceptor.JCacheOperationSource org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) { return this . org.springframework.cache.jcache.interceptor.JCacheOperationSource ; }  <METHOD_END>
<METHOD_START> public void void ( ) { Assert . state ( org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) != null , STRING + STRING ) ; Assert . state ( getErrorHandler ( ) != null , STRING ) ; this . org.springframework.cache.jcache.interceptor.CacheResultInterceptor = new CacheResultInterceptor ( getErrorHandler ( ) ) ; this . org.springframework.cache.jcache.interceptor.CachePutInterceptor = new CachePutInterceptor ( getErrorHandler ( ) ) ; this . org.springframework.cache.jcache.interceptor.CacheRemoveEntryInterceptor = new CacheRemoveEntryInterceptor ( getErrorHandler ( ) ) ; this . org.springframework.cache.jcache.interceptor.CacheRemoveAllInterceptor = new CacheRemoveAllInterceptor ( getErrorHandler ( ) ) ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker , java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) { if ( this . boolean ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( java.lang.Object ) ; JCacheOperation < ? > org.springframework.cache.jcache.interceptor.JCacheOperation<?> = org.springframework.cache.jcache.interceptor.JCacheOperationSource ( ) . getCacheOperation ( java.lang.reflect.Method , java.lang.Class<> ) ; if ( org.springframework.cache.jcache.interceptor.JCacheOperation<> != null ) { CacheOperationInvocationContext < ? > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<?> = org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<?> ( java.lang.Object , java.lang.Object[] , org.springframework.cache.jcache.interceptor.JCacheOperation<> ) ; return java.lang.Object ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<> , org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; } } return org.springframework.cache.jcache.interceptor.CacheOperationInvoker . invoke ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<?> < ? > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<?> ( java.lang.Object java.lang.Object , java.lang.Object [] java.lang.Object[] , JCacheOperation < ? > org.springframework.cache.jcache.interceptor.JCacheOperation<?> ) { return new DefaultCacheInvocationContext <> ( ( JCacheOperation < java.lang.annotation.Annotation > ) org.springframework.cache.jcache.interceptor.JCacheOperation<> , java.lang.Object , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Object java.lang.Object ) { java.lang.Class<?> < ? > java.lang.Class<?> = AopProxyUtils . ultimateTargetClass ( java.lang.Object ) ; if ( java.lang.Class<> == null && java.lang.Object != null ) { java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; } return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.lang.Object java.lang.Object ( CacheOperationInvocationContext < ? > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<?> , CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) { CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker = new org.springframework.cache.jcache.interceptor.JCacheAspectSupport.CacheOperationInvokerAdapter ( org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; BasicOperation org.springframework.cache.jcache.interceptor.BasicOperation = org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<> . getOperation ( ) ; if ( org.springframework.cache.jcache.interceptor.BasicOperation instanceof CacheResultOperation ) { return this . org.springframework.cache.jcache.interceptor.CacheResultInterceptor . invoke ( ( CacheOperationInvocationContext < CacheResultOperation > ) org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<> , org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; } else if ( org.springframework.cache.jcache.interceptor.BasicOperation instanceof CachePutOperation ) { return this . org.springframework.cache.jcache.interceptor.CachePutInterceptor . invoke ( ( CacheOperationInvocationContext < CachePutOperation > ) org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<> , org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; } else if ( org.springframework.cache.jcache.interceptor.BasicOperation instanceof CacheRemoveOperation ) { return this . org.springframework.cache.jcache.interceptor.CacheRemoveEntryInterceptor . invoke ( ( CacheOperationInvocationContext < CacheRemoveOperation > ) org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<> , org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; } else if ( org.springframework.cache.jcache.interceptor.BasicOperation instanceof CacheRemoveAllOperation ) { return this . org.springframework.cache.jcache.interceptor.CacheRemoveAllInterceptor . invoke ( ( CacheOperationInvocationContext < CacheRemoveAllOperation > ) org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<> , org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.cache.jcache.interceptor.BasicOperation ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) { return org.springframework.cache.jcache.interceptor.CacheOperationInvoker . invoke ( ) ; }  <METHOD_END>
<METHOD_START> public void ( CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) { this . org.springframework.cache.jcache.interceptor.CacheOperationInvoker = org.springframework.cache.jcache.interceptor.CacheOperationInvoker ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) org.springframework.cache.jcache.interceptor.ThrowableWrapper { return java.lang.Object ( this . org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) ; }  <METHOD_END>
