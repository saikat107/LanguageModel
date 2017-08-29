<METHOD_START> protected void ( CacheMethodDetails < A > org.springframework.cache.jcache.interceptor.CacheMethodDetails<A> , CacheResolver org.springframework.cache.jcache.interceptor.CacheResolver , KeyGenerator org.springframework.cache.jcache.interceptor.KeyGenerator ) { super( org.springframework.cache.jcache.interceptor.CacheMethodDetails<A> , org.springframework.cache.jcache.interceptor.CacheResolver ); this . org.springframework.cache.jcache.interceptor.KeyGenerator = org.springframework.cache.jcache.interceptor.KeyGenerator ; this . java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> = java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> ( this . allParameterDetails ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.cache.jcache.interceptor.KeyGenerator org.springframework.cache.jcache.interceptor.KeyGenerator ( ) { return this . org.springframework.cache.jcache.interceptor.KeyGenerator ; }  <METHOD_END>
<METHOD_START> public org.springframework.cache.jcache.interceptor.CacheInvocationParameter [] org.springframework.cache.jcache.interceptor.CacheInvocationParameter[] ( java.lang.Object ... java.lang.Object[] ) { java.util.List<org.springframework.cache.jcache.interceptor.CacheInvocationParameter> < CacheInvocationParameter > java.util.List<org.springframework.cache.jcache.interceptor.CacheInvocationParameter> = new java.util.ArrayList<org.springframework.cache.jcache.interceptor.CacheInvocationParameter> <> ( ) ; for ( CacheParameterDetail org.springframework.cache.jcache.interceptor.CacheParameterDetail : this . java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> ) { int int = org.springframework.cache.jcache.interceptor.CacheParameterDetail . getParameterPosition ( ) ; if ( int >= java.lang.Object[] . int ) { throw new java.lang.IllegalStateException ( STRING + int + STRING + java.lang.Object[] . int + STRING ) ; } java.util.List<org.springframework.cache.jcache.interceptor.CacheInvocationParameter> . add ( org.springframework.cache.jcache.interceptor.CacheParameterDetail . toCacheInvocationParameter ( java.lang.Object[] [ int ] ) ) ; } return java.util.List<org.springframework.cache.jcache.interceptor.CacheInvocationParameter> . toArray ( new CacheInvocationParameter [ java.util.List<org.springframework.cache.jcache.interceptor.CacheInvocationParameter> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> private static java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> < CacheParameterDetail > java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> ( java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> < CacheParameterDetail > java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> ) { java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> < CacheParameterDetail > java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> = new java.util.ArrayList<org.springframework.cache.jcache.interceptor.CacheParameterDetail> <> ( ) ; java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> < CacheParameterDetail > java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> = new java.util.ArrayList<org.springframework.cache.jcache.interceptor.CacheParameterDetail> <> ( ) ; for ( CacheParameterDetail org.springframework.cache.jcache.interceptor.CacheParameterDetail : java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> ) { if ( ! org.springframework.cache.jcache.interceptor.CacheParameterDetail . isValue ( ) ) { java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> . add ( org.springframework.cache.jcache.interceptor.CacheParameterDetail ) ; } if ( org.springframework.cache.jcache.interceptor.CacheParameterDetail . isKey ( ) ) { java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> . add ( org.springframework.cache.jcache.interceptor.CacheParameterDetail ) ; } } return ( java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> . isEmpty ( ) ? java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> : java.util.List<org.springframework.cache.jcache.interceptor.CacheParameterDetail> ) ; }  <METHOD_END>
