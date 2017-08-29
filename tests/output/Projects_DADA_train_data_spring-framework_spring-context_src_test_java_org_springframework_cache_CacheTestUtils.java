<METHOD_START> public static org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( java.lang.String ... java.lang.String[] ) { SimpleCacheManager org.springframework.cache.SimpleCacheManager = new SimpleCacheManager ( ) ; java.util.List<org.springframework.cache.Cache> < Cache > java.util.List<org.springframework.cache.Cache> = new java.util.ArrayList<org.springframework.cache.Cache> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.List<org.springframework.cache.Cache> . add ( new ConcurrentMapCache ( java.lang.String ) ) ; } org.springframework.cache.SimpleCacheManager . setCaches ( java.util.List<org.springframework.cache.Cache> ) ; org.springframework.cache.SimpleCacheManager . afterPropertiesSet ( ) ; return org.springframework.cache.SimpleCacheManager ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.Object java.lang.Object , Cache ... org.springframework.cache.Cache[] ) { for ( Cache org.springframework.cache.Cache : org.springframework.cache.Cache[] ) { assertNull ( STRING + org.springframework.cache.Cache + STRING + java.lang.Object , org.springframework.cache.Cache . get ( java.lang.Object ) ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , Cache ... org.springframework.cache.Cache[] ) { for ( Cache org.springframework.cache.Cache : org.springframework.cache.Cache[] ) { Cache . Cache Cache.ValueWrapper = org.springframework.cache.Cache . get ( java.lang.Object ) ; assertNotNull ( STRING + org.springframework.cache.Cache + STRING + java.lang.Object , Cache.ValueWrapper ) ; assertEquals ( STRING + org.springframework.cache.Cache + STRING + java.lang.Object , java.lang.Object , Cache.ValueWrapper . get ( ) ) ; } }  <METHOD_END>
