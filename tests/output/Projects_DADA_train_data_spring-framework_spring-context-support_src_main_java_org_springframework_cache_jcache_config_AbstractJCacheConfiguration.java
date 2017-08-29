<METHOD_START> @ java.lang.Override protected void void ( CachingConfigurer org.springframework.cache.jcache.config.CachingConfigurer ) { super. useCachingConfigurer ( org.springframework.cache.jcache.config.CachingConfigurer ) ; if ( org.springframework.cache.jcache.config.CachingConfigurer instanceof JCacheConfigurer ) { this . org.springframework.cache.jcache.config.CacheResolver = ( ( JCacheConfigurer ) org.springframework.cache.jcache.config.CachingConfigurer ) . exceptionCacheResolver ( ) ; } }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) @ Role ( BeanDefinition . ROLE_INFRASTRUCTURE ) public org.springframework.cache.jcache.config.JCacheOperationSource org.springframework.cache.jcache.config.JCacheOperationSource ( ) { DefaultJCacheOperationSource org.springframework.cache.jcache.config.DefaultJCacheOperationSource = new DefaultJCacheOperationSource ( ) ; if ( this . cacheManager != null ) { org.springframework.cache.jcache.config.DefaultJCacheOperationSource . setCacheManager ( this . cacheManager ) ; } if ( this . keyGenerator != null ) { org.springframework.cache.jcache.config.DefaultJCacheOperationSource . setKeyGenerator ( this . keyGenerator ) ; } if ( this . cacheResolver != null ) { org.springframework.cache.jcache.config.DefaultJCacheOperationSource . setCacheResolver ( this . cacheResolver ) ; } if ( this . org.springframework.cache.jcache.config.CacheResolver != null ) { org.springframework.cache.jcache.config.DefaultJCacheOperationSource . setExceptionCacheResolver ( this . org.springframework.cache.jcache.config.CacheResolver ) ; } return org.springframework.cache.jcache.config.DefaultJCacheOperationSource ; }  <METHOD_END>
