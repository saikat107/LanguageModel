<METHOD_START> public static org.springframework.cache.ehcache.CacheManager org.springframework.cache.ehcache.CacheManager ( ) org.springframework.cache.ehcache.CacheException { return new CacheManager ( ConfigurationFactory . parseConfiguration ( ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.cache.ehcache.CacheManager org.springframework.cache.ehcache.CacheManager ( java.lang.String java.lang.String ) throws org.springframework.cache.ehcache.CacheException { Configuration org.springframework.cache.ehcache.Configuration = ConfigurationFactory . parseConfiguration ( ) ; org.springframework.cache.ehcache.Configuration . setName ( java.lang.String ) ; return new CacheManager ( org.springframework.cache.ehcache.Configuration ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.cache.ehcache.CacheManager org.springframework.cache.ehcache.CacheManager ( Resource org.springframework.cache.ehcache.Resource ) throws org.springframework.cache.ehcache.CacheException { return new CacheManager ( org.springframework.cache.ehcache.Configuration ( org.springframework.cache.ehcache.Resource ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.cache.ehcache.CacheManager org.springframework.cache.ehcache.CacheManager ( java.lang.String java.lang.String , Resource org.springframework.cache.ehcache.Resource ) throws org.springframework.cache.ehcache.CacheException { Configuration org.springframework.cache.ehcache.Configuration = org.springframework.cache.ehcache.Configuration ( org.springframework.cache.ehcache.Resource ) ; org.springframework.cache.ehcache.Configuration . setName ( java.lang.String ) ; return new CacheManager ( org.springframework.cache.ehcache.Configuration ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.cache.ehcache.Configuration org.springframework.cache.ehcache.Configuration ( Resource org.springframework.cache.ehcache.Resource ) throws org.springframework.cache.ehcache.CacheException { java.io.InputStream java.io.InputStream = null ; try { java.io.InputStream = org.springframework.cache.ehcache.Resource . getInputStream ( ) ; return ConfigurationFactory . parseConfiguration ( java.io.InputStream ) ; } catch ( java.io.IOException java.io.IOException ) { throw new CacheException ( STRING , java.io.IOException ) ; } finally { if ( java.io.InputStream != null ) { try { java.io.InputStream . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { } } } }  <METHOD_END>