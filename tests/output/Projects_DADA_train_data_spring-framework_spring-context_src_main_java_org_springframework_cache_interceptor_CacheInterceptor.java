<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( final MethodInvocation org.springframework.cache.interceptor.MethodInvocation ) throws java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.cache.interceptor.MethodInvocation . getMethod ( ) ; CacheOperationInvoker org.springframework.cache.interceptor.CacheOperationInvoker = new CacheOperationInvoker ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( ) { try { return org.springframework.cache.interceptor.MethodInvocation . proceed ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new ThrowableWrapper ( java.lang.Throwable ) ; } } } ; try { return execute ( org.springframework.cache.interceptor.CacheOperationInvoker , org.springframework.cache.interceptor.MethodInvocation . getThis ( ) , java.lang.reflect.Method , org.springframework.cache.interceptor.MethodInvocation . getArguments ( ) ) ; } catch ( CacheOperationInvoker . CacheOperationInvoker CacheOperationInvoker.ThrowableWrapper ) { throw CacheOperationInvoker.ThrowableWrapper . getOriginal ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { try { return org.springframework.cache.interceptor.MethodInvocation . proceed ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new ThrowableWrapper ( java.lang.Throwable ) ; } }  <METHOD_END>