<METHOD_START> void ( CacheProperties org.springframework.boot.autoconfigure.cache.CacheProperties , CacheManagerCustomizers org.springframework.boot.autoconfigure.cache.CacheManagerCustomizers ) { this . org.springframework.boot.autoconfigure.cache.CacheProperties = org.springframework.boot.autoconfigure.cache.CacheProperties ; this . org.springframework.boot.autoconfigure.cache.CacheManagerCustomizers = org.springframework.boot.autoconfigure.cache.CacheManagerCustomizers ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.cache.RedisCacheManager org.springframework.boot.autoconfigure.cache.RedisCacheManager ( RedisTemplate < java.lang.Object , java.lang.Object > org.springframework.boot.autoconfigure.cache.RedisTemplate<java.lang.Object,java.lang.Object> ) { RedisCacheManager org.springframework.boot.autoconfigure.cache.RedisCacheManager = new RedisCacheManager ( org.springframework.boot.autoconfigure.cache.RedisTemplate<java.lang.Object,java.lang.Object> ) ; org.springframework.boot.autoconfigure.cache.RedisCacheManager . setUsePrefix ( true ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = this . org.springframework.boot.autoconfigure.cache.CacheProperties . getCacheNames ( ) ; if ( ! java.util.List<java.lang.String> . boolean ( ) ) { org.springframework.boot.autoconfigure.cache.RedisCacheManager . setCacheNames ( java.util.List<java.lang.String> ) ; } return this . org.springframework.boot.autoconfigure.cache.CacheManagerCustomizers . customize ( org.springframework.boot.autoconfigure.cache.RedisCacheManager ) ; }  <METHOD_END>
