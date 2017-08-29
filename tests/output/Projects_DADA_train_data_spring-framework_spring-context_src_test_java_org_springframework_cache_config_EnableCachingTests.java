<METHOD_START> @ java.lang.Override protected org.springframework.cache.config.ConfigurableApplicationContext org.springframework.cache.config.ConfigurableApplicationContext ( ) { return new AnnotationConfigApplicationContext ( org.springframework.cache.config.EnableCachingTests.EnableCachingConfig .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CacheInterceptor org.springframework.cache.config.CacheInterceptor = this . ctx . getBean ( CacheInterceptor .class ) ; assertSame ( this . ctx . getBean ( STRING , KeyGenerator .class ) , org.springframework.cache.config.CacheInterceptor . getKeyGenerator ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { CacheInterceptor org.springframework.cache.config.CacheInterceptor = this . ctx . getBean ( CacheInterceptor .class ) ; assertSame ( this . ctx . getBean ( STRING , CacheErrorHandler .class ) , org.springframework.cache.config.CacheInterceptor . getErrorHandler ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { AnnotationConfigApplicationContext org.springframework.cache.config.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . register ( org.springframework.cache.config.EnableCachingTests.SingleCacheManagerConfig .class ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Throwable { AnnotationConfigApplicationContext org.springframework.cache.config.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . register ( org.springframework.cache.config.EnableCachingTests.MultiCacheManagerConfig .class ) ; try { org.springframework.cache.config.AnnotationConfigApplicationContext . refresh ( ) ; } catch ( BeanCreationException org.springframework.cache.config.BeanCreationException ) { java.lang.Throwable java.lang.Throwable = org.springframework.cache.config.BeanCreationException . getRootCause ( ) ; assertTrue ( java.lang.Throwable . java.lang.String ( ) . boolean ( STRING ) ) ; throw java.lang.Throwable ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.config.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . register ( org.springframework.cache.config.EnableCachingTests.MultiCacheManagerConfigurer .class ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Throwable { AnnotationConfigApplicationContext org.springframework.cache.config.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . register ( org.springframework.cache.config.EnableCachingTests.MultiCacheManagerConfigurer .class , org.springframework.cache.config.EnableCachingTests.EnableCachingConfig .class ) ; try { org.springframework.cache.config.AnnotationConfigApplicationContext . refresh ( ) ; } catch ( BeanCreationException org.springframework.cache.config.BeanCreationException ) { java.lang.Throwable java.lang.Throwable = org.springframework.cache.config.BeanCreationException . getRootCause ( ) ; assertTrue ( java.lang.Throwable . java.lang.String ( ) . boolean ( STRING ) ) ; throw java.lang.Throwable ; } }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Throwable { AnnotationConfigApplicationContext org.springframework.cache.config.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.cache.config.AnnotationConfigApplicationContext . register ( org.springframework.cache.config.EnableCachingTests.EmptyConfig .class ) ; try { org.springframework.cache.config.AnnotationConfigApplicationContext . refresh ( ) ; } catch ( BeanCreationException org.springframework.cache.config.BeanCreationException ) { java.lang.Throwable java.lang.Throwable = org.springframework.cache.config.BeanCreationException . getRootCause ( ) ; assertTrue ( java.lang.Throwable . java.lang.String ( ) . boolean ( STRING ) ) ; throw java.lang.Throwable ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.cache.config.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.config.EnableCachingTests.EmptyConfigSupportConfig .class ) ; CacheInterceptor org.springframework.cache.config.CacheInterceptor = org.springframework.cache.config.ConfigurableApplicationContext . getBean ( CacheInterceptor .class ) ; assertNotNull ( org.springframework.cache.config.CacheInterceptor . getCacheResolver ( ) ) ; assertEquals ( SimpleCacheResolver .class , org.springframework.cache.config.CacheInterceptor . getCacheResolver ( ) . getClass ( ) ) ; assertSame ( org.springframework.cache.config.ConfigurableApplicationContext . getBean ( CacheManager .class ) , ( ( SimpleCacheResolver ) org.springframework.cache.config.CacheInterceptor . getCacheResolver ( ) ) . getCacheManager ( ) ) ; org.springframework.cache.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.cache.config.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.config.EnableCachingTests.FullCachingConfig .class ) ; CacheInterceptor org.springframework.cache.config.CacheInterceptor = org.springframework.cache.config.ConfigurableApplicationContext . getBean ( CacheInterceptor .class ) ; assertSame ( org.springframework.cache.config.ConfigurableApplicationContext . getBean ( STRING ) , org.springframework.cache.config.CacheInterceptor . getCacheResolver ( ) ) ; assertSame ( org.springframework.cache.config.ConfigurableApplicationContext . getBean ( STRING ) , org.springframework.cache.config.CacheInterceptor . getKeyGenerator ( ) ) ; org.springframework.cache.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return CacheTestUtils . createSimpleCacheManager ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheableService<?> < ? > org.springframework.cache.config.CacheableService<?> ( ) { return new DefaultCacheableService ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheableService<?> < ? > org.springframework.cache.config.CacheableService<?> ( ) { return new AnnotatedClassCacheableService ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.cache.config.KeyGenerator org.springframework.cache.config.KeyGenerator ( ) { return new SomeKeyGenerator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.cache.config.CacheErrorHandler org.springframework.cache.config.CacheErrorHandler ( ) { return new SimpleCacheErrorHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.KeyGenerator org.springframework.cache.config.KeyGenerator ( ) { return new SomeCustomKeyGenerator ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return CacheTestUtils . createSimpleCacheManager ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return org.springframework.cache.config.CacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cache.config.KeyGenerator org.springframework.cache.config.KeyGenerator ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.cache.config.CacheManager org.springframework.cache.config.CacheManager ( ) { return new NoOpCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.cache.config.KeyGenerator org.springframework.cache.config.KeyGenerator ( ) { return new SomeKeyGenerator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.cache.config.CacheResolver org.springframework.cache.config.CacheResolver ( ) { return new NamedCacheResolver ( org.springframework.cache.config.CacheManager ( ) , STRING ) ; }  <METHOD_END>