<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr11124Config .class ) ; org.springframework.cache.CacheReproTests.Spr11124Service org.springframework.cache.CacheReproTests.Spr11124Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr11124Service .class ) ; org.springframework.cache.CacheReproTests.Spr11124Service . java.util.List<java.lang.String> ( NUMBER ) ; org.springframework.cache.CacheReproTests.Spr11124Service . java.util.List<java.lang.String> ( NUMBER ) ; org.springframework.cache.CacheReproTests.Spr11124Service . java.util.List<java.lang.String> ( NUMBER ) ; org.springframework.cache.CacheReproTests.Spr11124Service . java.util.List<java.lang.String> ( NUMBER ) ; org.springframework.cache.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr11249Config .class ) ; org.springframework.cache.CacheReproTests.Spr11249Service org.springframework.cache.CacheReproTests.Spr11249Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr11249Service .class ) ; java.lang.Object java.lang.Object = org.springframework.cache.CacheReproTests.Spr11249Service . java.lang.Object ( STRING , NUMBER , NUMBER ) ; assertSame ( java.lang.Object , org.springframework.cache.CacheReproTests.Spr11249Service . java.lang.Object ( STRING , NUMBER , NUMBER ) ) ; org.springframework.cache.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr11592Config .class ) ; org.springframework.cache.CacheReproTests.Spr11592Service org.springframework.cache.CacheReproTests.Spr11592Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr11592Service .class ) ; Cache org.springframework.cache.Cache = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( STRING , Cache .class ) ; java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = org.springframework.cache.CacheReproTests.Spr11592Service . java.lang.Object ( STRING ) ; verify ( org.springframework.cache.Cache , times ( NUMBER ) ) . get ( java.lang.String ) ; java.lang.Object java.lang.Object = org.springframework.cache.CacheReproTests.Spr11592Service . java.lang.Object ( STRING ) ; assertSame ( java.lang.Object , java.lang.Object ) ; verify ( org.springframework.cache.Cache , times ( NUMBER ) ) . get ( java.lang.String ) ; org.springframework.cache.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr11592Config .class ) ; org.springframework.cache.CacheReproTests.Spr11592Service org.springframework.cache.CacheReproTests.Spr11592Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr11592Service .class ) ; Cache org.springframework.cache.Cache = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( STRING , Cache .class ) ; java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = org.springframework.cache.CacheReproTests.Spr11592Service . java.lang.Object ( STRING ) ; verify ( org.springframework.cache.Cache , times ( NUMBER ) ) . get ( java.lang.String ) ; java.lang.Object java.lang.Object = org.springframework.cache.CacheReproTests.Spr11592Service . java.lang.Object ( STRING ) ; assertNotSame ( java.lang.Object , java.lang.Object ) ; verify ( org.springframework.cache.Cache , times ( NUMBER ) ) . get ( java.lang.String ) ; org.springframework.cache.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr13081Config .class ) ; org.springframework.cache.CacheReproTests.MyCacheResolver org.springframework.cache.CacheReproTests.MyCacheResolver = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.MyCacheResolver .class ) ; org.springframework.cache.CacheReproTests.Spr13081Service org.springframework.cache.CacheReproTests.Spr13081Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr13081Service .class ) ; assertNull ( org.springframework.cache.CacheReproTests.MyCacheResolver . org.springframework.cache.Cache ( STRING ) . get ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.cache.CacheReproTests.Spr13081Service . java.lang.Object ( STRING ) ; assertEquals ( java.lang.Object , org.springframework.cache.CacheReproTests.MyCacheResolver . org.springframework.cache.Cache ( STRING ) . get ( STRING ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr13081Config .class ) ; org.springframework.cache.CacheReproTests.Spr13081Service org.springframework.cache.CacheReproTests.Spr13081Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr13081Service .class ) ; this . org.springframework.cache.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.cache.ExpectedException . expectMessage ( org.springframework.cache.CacheReproTests.MyCacheResolver .class . java.lang.String ( ) ) ; org.springframework.cache.CacheReproTests.Spr13081Service . java.lang.Object ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr14230Config .class ) ; org.springframework.cache.CacheReproTests.Spr14230Service org.springframework.cache.CacheReproTests.Spr14230Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr14230Service .class ) ; Cache org.springframework.cache.Cache = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( CacheManager .class ) . getCache ( STRING ) ; TestBean org.springframework.cache.TestBean = new TestBean ( STRING ) ; org.springframework.cache.CacheReproTests.Spr14230Service . org.springframework.cache.TestBean ( org.springframework.cache.TestBean ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.CacheReproTests.Spr14230Service . java.util.Optional<org.springframework.cache.TestBean> ( STRING ) . get ( ) ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.Cache . get ( STRING ) . get ( ) ) ; org.springframework.cache.Cache . clear ( ) ; TestBean org.springframework.cache.TestBean = org.springframework.cache.CacheReproTests.Spr14230Service . java.util.Optional<org.springframework.cache.TestBean> ( STRING ) . get ( ) ; assertNotSame ( org.springframework.cache.TestBean , org.springframework.cache.TestBean ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.Cache . get ( STRING ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr14853Config .class ) ; org.springframework.cache.CacheReproTests.Spr14853Service org.springframework.cache.CacheReproTests.Spr14853Service = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr14853Service .class ) ; Cache org.springframework.cache.Cache = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( CacheManager .class ) . getCache ( STRING ) ; TestBean org.springframework.cache.TestBean = new TestBean ( STRING ) ; org.springframework.cache.CacheReproTests.Spr14853Service . org.springframework.cache.TestBean ( org.springframework.cache.TestBean ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.CacheReproTests.Spr14853Service . java.util.Optional<org.springframework.cache.TestBean> ( STRING ) . get ( ) ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.Cache . get ( STRING ) . get ( ) ) ; org.springframework.cache.Cache . clear ( ) ; TestBean org.springframework.cache.TestBean = org.springframework.cache.CacheReproTests.Spr14853Service . java.util.Optional<org.springframework.cache.TestBean> ( STRING ) . get ( ) ; assertNotSame ( org.springframework.cache.TestBean , org.springframework.cache.TestBean ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.Cache . get ( STRING ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr15271ConfigA .class ) ; org.springframework.cache.CacheReproTests.Spr15271Interface org.springframework.cache.CacheReproTests.Spr15271Interface = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr15271Interface .class ) ; Cache org.springframework.cache.Cache = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( CacheManager .class ) . getCache ( STRING ) ; TestBean org.springframework.cache.TestBean = new TestBean ( STRING ) ; org.springframework.cache.CacheReproTests.Spr15271Interface . org.springframework.cache.TestBean ( org.springframework.cache.TestBean ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.CacheReproTests.Spr15271Interface . java.util.Optional<org.springframework.cache.TestBean> ( STRING ) . get ( ) ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.Cache . get ( STRING ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) { AnnotationConfigApplicationContext org.springframework.cache.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.cache.CacheReproTests.Spr15271ConfigB .class ) ; org.springframework.cache.CacheReproTests.Spr15271Interface org.springframework.cache.CacheReproTests.Spr15271Interface = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( org.springframework.cache.CacheReproTests.Spr15271Interface .class ) ; Cache org.springframework.cache.Cache = org.springframework.cache.AnnotationConfigApplicationContext . getBean ( CacheManager .class ) . getCache ( STRING ) ; TestBean org.springframework.cache.TestBean = new TestBean ( STRING ) ; org.springframework.cache.CacheReproTests.Spr15271Interface . org.springframework.cache.TestBean ( org.springframework.cache.TestBean ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.CacheReproTests.Spr15271Interface . java.util.Optional<org.springframework.cache.TestBean> ( STRING ) . get ( ) ) ; assertSame ( org.springframework.cache.TestBean , org.springframework.cache.Cache . get ( STRING ) . get ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { return new ConcurrentMapCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr11124Service org.springframework.cache.CacheReproTests.Spr11124Service ( ) { return new org.springframework.cache.CacheReproTests.Spr11124ServiceImpl ( ) ; }  <METHOD_END>
<METHOD_START> java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( int int );  <METHOD_END>
<METHOD_START> java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( int int );  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Cacheable ( STRING ) public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( int int ) { if ( this . int > NUMBER ) { fail ( STRING ) ; } this . int ++ ; return java.util.Collections . java.util.List<java.lang.String> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Caching ( cacheable = { @ Cacheable ( cacheNames = STRING , unless = STRING ) , @ Cacheable ( cacheNames = STRING , unless = STRING ) } ) public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( int int ) { if ( this . int > NUMBER ) { fail ( STRING ) ; } this . int ++ ; return java.util.Collections . java.util.List<java.lang.String> ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { return new ConcurrentMapCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr11249Service org.springframework.cache.CacheReproTests.Spr11249Service ( ) { return new org.springframework.cache.CacheReproTests.Spr11249Service ( ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable ( STRING ) public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , int ... int[] ) { return new java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { SimpleCacheManager org.springframework.cache.SimpleCacheManager = new SimpleCacheManager ( ) ; org.springframework.cache.SimpleCacheManager . setCaches ( java.util.Collections . java.util.List ( org.springframework.cache.Cache ( ) ) ) ; return org.springframework.cache.SimpleCacheManager ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.Cache org.springframework.cache.Cache ( ) { Cache org.springframework.cache.Cache = new ConcurrentMapCache ( STRING ) ; return Mockito . spy ( org.springframework.cache.Cache ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr11592Service org.springframework.cache.CacheReproTests.Spr11592Service ( ) { return new org.springframework.cache.CacheReproTests.Spr11592Service ( ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable ( STRING ) public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return new java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable ( cacheNames = STRING , condition = STRING ) public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return new java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.Override public org.springframework.cache.CacheResolver org.springframework.cache.CacheResolver ( ) { return new org.springframework.cache.CacheReproTests.MyCacheResolver ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr13081Service org.springframework.cache.CacheReproTests.Spr13081Service ( ) { return new org.springframework.cache.CacheReproTests.Spr13081Service ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { super( new ConcurrentMapCacheManager ( ) ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> ( CacheOperationInvocationContext < ? > org.springframework.cache.CacheOperationInvocationContext<?> ) { java.lang.String java.lang.String = ( java.lang.String ) org.springframework.cache.CacheOperationInvocationContext<> . getArgs ( ) [ NUMBER ] ; if ( java.lang.String != null ) { return java.util.Collections . java.util.Set<java.lang.String> ( java.lang.String ) ; } return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.cache.Cache org.springframework.cache.Cache ( java.lang.String java.lang.String ) { return getCacheManager ( ) . getCache ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return new java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable ( STRING ) public java.util.Optional<org.springframework.cache.TestBean> < TestBean > java.util.Optional<org.springframework.cache.TestBean> ( java.lang.String java.lang.String ) { return java.util.Optional . java.util.Optional ( new TestBean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ CachePut ( cacheNames = STRING , key = STRING ) public org.springframework.cache.TestBean org.springframework.cache.TestBean ( TestBean org.springframework.cache.TestBean ) { return org.springframework.cache.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { return new ConcurrentMapCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr14230Service org.springframework.cache.CacheReproTests.Spr14230Service ( ) { return new org.springframework.cache.CacheReproTests.Spr14230Service ( ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable ( value = STRING , sync = true ) public java.util.Optional<org.springframework.cache.TestBean> < TestBean > java.util.Optional<org.springframework.cache.TestBean> ( java.lang.String java.lang.String ) { return java.util.Optional . java.util.Optional ( new TestBean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ CachePut ( cacheNames = STRING , key = STRING ) public org.springframework.cache.TestBean org.springframework.cache.TestBean ( TestBean org.springframework.cache.TestBean ) { return org.springframework.cache.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { return new ConcurrentMapCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr14853Service org.springframework.cache.CacheReproTests.Spr14853Service ( ) { return new org.springframework.cache.CacheReproTests.Spr14853Service ( ) ; }  <METHOD_END>
<METHOD_START> @ Cacheable ( value = STRING , sync = true ) java.util.Optional<org.springframework.cache.TestBean> < TestBean > java.util.Optional<org.springframework.cache.TestBean> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ CachePut ( cacheNames = STRING , key = STRING ) org.springframework.cache.TestBean org.springframework.cache.TestBean ( TestBean org.springframework.cache.TestBean );  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.cache.TestBean> < TestBean > java.util.Optional<org.springframework.cache.TestBean> ( java.lang.String java.lang.String ) { return java.util.Optional . java.util.Optional ( new TestBean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cache.TestBean org.springframework.cache.TestBean ( TestBean org.springframework.cache.TestBean ) { return org.springframework.cache.TestBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { return new ConcurrentMapCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr15271Interface org.springframework.cache.CacheReproTests.Spr15271Interface ( ) { return new org.springframework.cache.CacheReproTests.Spr15271Service ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheManager org.springframework.cache.CacheManager ( ) { return new ConcurrentMapCacheManager ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.cache.CacheReproTests.Spr15271Interface org.springframework.cache.CacheReproTests.Spr15271Interface ( ) { return new org.springframework.cache.CacheReproTests.Spr15271Service ( ) ; }  <METHOD_END>