<METHOD_START> public void ( CacheErrorHandler org.springframework.cache.jcache.interceptor.CacheErrorHandler ) { super( org.springframework.cache.jcache.interceptor.CacheErrorHandler ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( CacheOperationInvocationContext < CacheResultOperation > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> , CacheOperationInvoker org.springframework.cache.jcache.interceptor.CacheOperationInvoker ) { CacheResultOperation org.springframework.cache.jcache.interceptor.CacheResultOperation = org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> . getOperation ( ) ; java.lang.Object java.lang.Object = generateKey ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> ) ; Cache org.springframework.cache.jcache.interceptor.Cache = resolveCache ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> ) ; Cache org.springframework.cache.jcache.interceptor.Cache = org.springframework.cache.jcache.interceptor.Cache ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> ) ; if ( ! org.springframework.cache.jcache.interceptor.CacheResultOperation . isAlwaysInvoked ( ) ) { Cache . Cache Cache.ValueWrapper = doGet ( org.springframework.cache.jcache.interceptor.Cache , java.lang.Object ) ; if ( Cache.ValueWrapper != null ) { return Cache.ValueWrapper . get ( ) ; } void ( org.springframework.cache.jcache.interceptor.Cache , java.lang.Object ) ; } try { java.lang.Object java.lang.Object = org.springframework.cache.jcache.interceptor.CacheOperationInvoker . invoke ( ) ; doPut ( org.springframework.cache.jcache.interceptor.Cache , java.lang.Object , java.lang.Object ) ; return java.lang.Object ; } catch ( CacheOperationInvoker . CacheOperationInvoker CacheOperationInvoker.ThrowableWrapper ) { java.lang.Throwable java.lang.Throwable = CacheOperationInvoker.ThrowableWrapper . getOriginal ( ) ; void ( org.springframework.cache.jcache.interceptor.Cache , org.springframework.cache.jcache.interceptor.CacheResultOperation . getExceptionTypeFilter ( ) , java.lang.Object , java.lang.Throwable ) ; throw CacheOperationInvoker.ThrowableWrapper ; } }  <METHOD_END>
<METHOD_START> protected void void ( Cache org.springframework.cache.jcache.interceptor.Cache , java.lang.Object java.lang.Object ) { if ( org.springframework.cache.jcache.interceptor.Cache == null ) { return; } Cache . Cache Cache.ValueWrapper = doGet ( org.springframework.cache.jcache.interceptor.Cache , java.lang.Object ) ; if ( Cache.ValueWrapper != null ) { throw CacheOperationInvoker.ThrowableWrapper ( ( java.lang.Throwable ) Cache.ValueWrapper . get ( ) , java.lang.Class<? extends org.springframework.cache.jcache.interceptor.CacheResultInterceptor> ( ) . java.lang.String ( ) , STRING ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( Cache org.springframework.cache.jcache.interceptor.Cache , ExceptionTypeFilter org.springframework.cache.jcache.interceptor.ExceptionTypeFilter , java.lang.Object java.lang.Object , java.lang.Throwable java.lang.Throwable ) { if ( org.springframework.cache.jcache.interceptor.Cache == null ) { return; } if ( org.springframework.cache.jcache.interceptor.ExceptionTypeFilter . match ( java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) ) ) { doPut ( org.springframework.cache.jcache.interceptor.Cache , java.lang.Object , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.cache.jcache.interceptor.Cache org.springframework.cache.jcache.interceptor.Cache ( CacheOperationInvocationContext < CacheResultOperation > org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> ) { CacheResolver org.springframework.cache.jcache.interceptor.CacheResolver = org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> . getOperation ( ) . getExceptionCacheResolver ( ) ; if ( org.springframework.cache.jcache.interceptor.CacheResolver != null ) { return extractFrom ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> . getOperation ( ) . getExceptionCacheResolver ( ) . resolveCaches ( org.springframework.cache.jcache.interceptor.CacheOperationInvocationContext<org.springframework.cache.jcache.interceptor.CacheResultOperation> ) ) ; } return null ; }  <METHOD_END>
<METHOD_START> private static CacheOperationInvoker . CacheOperationInvoker.ThrowableWrapper CacheOperationInvoker.ThrowableWrapper ( java.lang.Throwable java.lang.Throwable , java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.lang.Throwable java.lang.Throwable = java.lang.Throwable ( java.lang.Throwable ) ; if ( java.lang.Throwable == null ) { return new CacheOperationInvoker . CacheOperationInvoker ( java.lang.Throwable ) ; } java.lang.StackTraceElement [] java.lang.StackTraceElement[] = new java.lang.Exception ( ) . java.lang.StackTraceElement[] ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Throwable . java.lang.StackTraceElement[] ( ) ; int int = int ( java.lang.StackTraceElement[] , java.lang.String , java.lang.String ) ; int int = int ( java.lang.StackTraceElement[] , java.lang.String , java.lang.String ) ; if ( int == - NUMBER || int == - NUMBER ) { return new CacheOperationInvoker . CacheOperationInvoker ( java.lang.Throwable ) ; } java.lang.StackTraceElement [] java.lang.StackTraceElement[] = new java.lang.StackTraceElement [ int + java.lang.StackTraceElement[] . int - int ] ; java.lang.System . void ( java.lang.StackTraceElement[] , NUMBER , java.lang.StackTraceElement[] , NUMBER , int ) ; java.lang.System . void ( java.lang.StackTraceElement[] , int , java.lang.StackTraceElement[] , int , java.lang.StackTraceElement[] . int - int ) ; java.lang.Throwable . void ( java.lang.StackTraceElement[] ) ; return new CacheOperationInvoker . CacheOperationInvoker ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private static < T extends java.lang.Throwable > T T ( T T ) { try { return ( T ) SerializationUtils . deserialize ( SerializationUtils . serialize ( T ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { return null ; } }  <METHOD_END>
<METHOD_START> private static int int ( java.lang.StackTraceElement [] java.lang.StackTraceElement[] , java.lang.String java.lang.String , java.lang.String java.lang.String ) { for ( int int = NUMBER ; int < java.lang.StackTraceElement[] . int ; int ++ ) { java.lang.StackTraceElement java.lang.StackTraceElement = java.lang.StackTraceElement[] [ int ] ; if ( java.lang.String . boolean ( java.lang.StackTraceElement . java.lang.String ( ) ) && java.lang.String . boolean ( java.lang.StackTraceElement . java.lang.String ( ) ) ) { return int ; } } return - NUMBER ; }  <METHOD_END>
