<METHOD_START> @ java.lang.Override public org.springframework.boot.actuate.cache.CacheStatistics org.springframework.boot.actuate.cache.CacheStatistics ( CacheManager org.springframework.boot.actuate.cache.CacheManager , HazelcastCache org.springframework.boot.actuate.cache.HazelcastCache ) { DefaultCacheStatistics org.springframework.boot.actuate.cache.DefaultCacheStatistics = new DefaultCacheStatistics ( ) ; LocalMapStats org.springframework.boot.actuate.cache.LocalMapStats = ( ( IMap < ? , ? > ) org.springframework.boot.actuate.cache.HazelcastCache . getNativeCache ( ) ) . getLocalMapStats ( ) ; org.springframework.boot.actuate.cache.DefaultCacheStatistics . setSize ( org.springframework.boot.actuate.cache.LocalMapStats . getOwnedEntryCount ( ) ) ; org.springframework.boot.actuate.cache.DefaultCacheStatistics . setGetCacheCounts ( org.springframework.boot.actuate.cache.LocalMapStats . getHits ( ) , org.springframework.boot.actuate.cache.LocalMapStats . getGetOperationCount ( ) - org.springframework.boot.actuate.cache.LocalMapStats . getHits ( ) ) ; return org.springframework.boot.actuate.cache.DefaultCacheStatistics ; }  <METHOD_END>
