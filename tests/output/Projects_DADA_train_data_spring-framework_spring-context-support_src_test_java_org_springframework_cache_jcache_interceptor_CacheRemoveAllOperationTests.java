<METHOD_START> @ java.lang.Override protected org.springframework.cache.jcache.interceptor.CacheRemoveAllOperation org.springframework.cache.jcache.interceptor.CacheRemoveAllOperation ( ) { CacheMethodDetails < CacheRemoveAll > org.springframework.cache.jcache.interceptor.CacheMethodDetails<org.springframework.cache.jcache.interceptor.CacheRemoveAll> = create ( CacheRemoveAll .class , SampleObject .class , STRING ) ; return new CacheRemoveAllOperation ( org.springframework.cache.jcache.interceptor.CacheMethodDetails<org.springframework.cache.jcache.interceptor.CacheRemoveAll> , defaultCacheResolver ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CacheRemoveAllOperation org.springframework.cache.jcache.interceptor.CacheRemoveAllOperation = org.springframework.cache.jcache.interceptor.CacheRemoveAllOperation ( ) ; CacheInvocationParameter [] org.springframework.cache.jcache.interceptor.CacheInvocationParameter[] = org.springframework.cache.jcache.interceptor.CacheRemoveAllOperation . getAllParameters ( ) ; assertEquals ( NUMBER , allParameters . length ) ; }  <METHOD_END>