<METHOD_START> @ java.lang.Override public org.springframework.boot.actuate.cache.CacheStatistics org.springframework.boot.actuate.cache.CacheStatistics ( CacheManager org.springframework.boot.actuate.cache.CacheManager , CaffeineCache org.springframework.boot.actuate.cache.CaffeineCache ) { DefaultCacheStatistics org.springframework.boot.actuate.cache.DefaultCacheStatistics = new DefaultCacheStatistics ( ) ; org.springframework.boot.actuate.cache.DefaultCacheStatistics . setSize ( org.springframework.boot.actuate.cache.CaffeineCache . getNativeCache ( ) . estimatedSize ( ) ) ; CacheStats org.springframework.boot.actuate.cache.CacheStats = org.springframework.boot.actuate.cache.CaffeineCache . getNativeCache ( ) . stats ( ) ; if ( org.springframework.boot.actuate.cache.CacheStats . requestCount ( ) > NUMBER ) { org.springframework.boot.actuate.cache.DefaultCacheStatistics . setHitRatio ( org.springframework.boot.actuate.cache.CacheStats . hitRate ( ) ) ; org.springframework.boot.actuate.cache.DefaultCacheStatistics . setMissRatio ( org.springframework.boot.actuate.cache.CacheStats . missRate ( ) ) ; } return org.springframework.boot.actuate.cache.DefaultCacheStatistics ; }  <METHOD_END>
