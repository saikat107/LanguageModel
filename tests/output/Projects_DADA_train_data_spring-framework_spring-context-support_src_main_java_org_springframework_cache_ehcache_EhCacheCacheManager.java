<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( net . net . net . net net.sf.ehcache.CacheManager ) { this . net.sf.ehcache.CacheManager = net.sf.ehcache.CacheManager ; }  <METHOD_END>
<METHOD_START> public void void ( net . net . net . net net.sf.ehcache.CacheManager ) { this . net.sf.ehcache.CacheManager = net.sf.ehcache.CacheManager ; }  <METHOD_END>
<METHOD_START> public net . net . net . net.sf.ehcache.CacheManager net.sf.ehcache.CacheManager ( ) { return this . net.sf.ehcache.CacheManager ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( net.sf.ehcache.CacheManager ( ) == null ) { void ( EhCacheManagerUtils . buildCacheManager ( ) ) ; } super. afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<org.springframework.cache.ehcache.Cache> < Cache > java.util.Collection<org.springframework.cache.ehcache.Cache> ( ) { Status org.springframework.cache.ehcache.Status = net.sf.ehcache.CacheManager ( ) . getStatus ( ) ; if ( ! Status . STATUS_ALIVE . equals ( org.springframework.cache.ehcache.Status ) ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.cache.ehcache.Status . toString ( ) ) ; } java.lang.String [] java.lang.String[] = net.sf.ehcache.CacheManager ( ) . getCacheNames ( ) ; java.util.Collection<org.springframework.cache.ehcache.Cache> < Cache > java.util.Collection<org.springframework.cache.ehcache.Cache> = new java.util.LinkedHashSet<org.springframework.cache.ehcache.Cache> <> ( java.lang.String[] . int ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.Collection<org.springframework.cache.ehcache.Cache> . add ( new EhCacheCache ( net.sf.ehcache.CacheManager ( ) . getEhcache ( java.lang.String ) ) ) ; } return java.util.Collection<org.springframework.cache.ehcache.Cache> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.cache.ehcache.Cache org.springframework.cache.ehcache.Cache ( java.lang.String java.lang.String ) { Ehcache org.springframework.cache.ehcache.Ehcache = net.sf.ehcache.CacheManager ( ) . getEhcache ( java.lang.String ) ; if ( org.springframework.cache.ehcache.Ehcache != null ) { return new EhCacheCache ( org.springframework.cache.ehcache.Ehcache ) ; } return null ; }  <METHOD_END>
