<METHOD_START> @ Before public void void ( ) { void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { try { long long = ( java.lang.System . long ( ) + long ) ; while ( CacheFactory . getAnyInstance ( ) != null && java.lang.System . long ( ) < long ) { synchronized ( java.lang.Object ) { try { java.lang.System . java.io.PrintStream . java.io.PrintStream ( STRING ) ; java.lang.Object . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) {					} } } fail ( java.lang.String . java.lang.String ( STRING , ( long / NUMBER ) ) ) ; } catch ( CacheClosedException org.springframework.data.gemfire.support.CacheClosedException ) {		} }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { SpringContextBootstrappingInitializer . getApplicationContext ( ) . close ( ) ; org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader> . void ( null ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { try { Cache org.springframework.data.gemfire.support.Cache = CacheFactory . getAnyInstance ( ) ; if ( org.springframework.data.gemfire.support.Cache != null ) { java.lang.System . java.io.PrintStream . java.io.PrintStream ( STRING ) ; org.springframework.data.gemfire.support.Cache . close ( ) ; synchronized ( java.lang.Object ) { while ( ! org.springframework.data.gemfire.support.Cache . isClosed ( ) ) { try { java.lang.System . java.io.PrintStream . java.io.PrintStream ( STRING ) ; java.lang.Object . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) {						} } java.lang.Object . void ( ) ; } } } catch ( CacheClosedException org.springframework.data.gemfire.support.CacheClosedException ) { } }  <METHOD_END>
<METHOD_START> protected void void ( final java.lang.String java.lang.String ) { Cache org.springframework.data.gemfire.support.Cache = new CacheFactory ( ) . set ( STRING , java.lang.String ) . set ( STRING , java.lang.String ) . set ( STRING , java.lang.String ) . set ( STRING , java.lang.String ) . create ( ) ; assertNotNull ( STRING , org.springframework.data.gemfire.support.Cache ) ; assertFalse ( STRING , org.springframework.data.gemfire.support.Cache . isClosed ( ) ) ; java.util.Set<org.springframework.data.gemfire.support.Region<?,?>> < Region < ? , ? > > java.util.Set<org.springframework.data.gemfire.support.Region<?,?>> = org.springframework.data.gemfire.support.Cache . rootRegions ( ) ; assertNotNull ( java.util.Set<org.springframework.data.gemfire.support.Region<?,?>> ) ; assertFalse ( java.util.Set<org.springframework.data.gemfire.support.Region<?,?>> . isEmpty ( ) ) ; assertEquals ( NUMBER , java.util.Set<org.springframework.data.gemfire.support.Region<?,?>> . size ( ) ) ; assertNotNull ( org.springframework.data.gemfire.support.Cache . getRegion ( STRING ) ) ; assertNotNull ( org.springframework.data.gemfire.support.Cache . getRegion ( STRING ) ) ; ConfigurableApplicationContext org.springframework.data.gemfire.support.ConfigurableApplicationContext = SpringContextBootstrappingInitializer . getApplicationContext ( ) ; assertNotNull ( org.springframework.data.gemfire.support.ConfigurableApplicationContext ) ; assertTrue ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . containsBean ( GemfireConstants . DEFAULT_GEMFIRE_CACHE_NAME ) ) ; assertTrue ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertFalse ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.support.ConfigurableApplicationContext . containsBean ( STRING ) ) ; javax.sql.DataSource javax.sql.DataSource = org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ; TestUserDao org.springframework.data.gemfire.support.TestUserDao = org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBean ( STRING , TestUserDao .class ) ; TestUserService org.springframework.data.gemfire.support.TestUserService = org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBean ( STRING , TestUserService .class ) ; assertSame ( javax.sql.DataSource , org.springframework.data.gemfire.support.TestUserDao . getDataSource ( ) ) ; assertSame ( org.springframework.data.gemfire.support.TestUserDao , org.springframework.data.gemfire.support.TestUserService . getUserDao ( ) ) ; org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader = org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ( ) ; assertSame ( javax.sql.DataSource , org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . javax.sql.DataSource ( ) ) ; Region < java.lang.String , User > org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> = org.springframework.data.gemfire.support.Cache . getRegion ( STRING ) ; assertNotNull ( org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> ) ; assertEquals ( STRING , org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . getFullPath ( ) ) ; assertTrue ( org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . isEmpty ( ) ) ; assertEquals ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . java.util.Map<java.lang.String,org.springframework.data.gemfire.support.User> . get ( STRING ) , org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . get ( STRING ) ) ; assertEquals ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . java.util.Map<java.lang.String,org.springframework.data.gemfire.support.User> . get ( STRING ) , org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . get ( STRING ) ) ; assertEquals ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . java.util.Map<java.lang.String,org.springframework.data.gemfire.support.User> . get ( STRING ) , org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . get ( STRING ) ) ; assertFalse ( org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . isEmpty ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.support.Region<java.lang.String,org.springframework.data.gemfire.support.User> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SpringContextBootstrappingInitializer . register ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.TestAppConfig .class ) ; new SpringContextBootstrappingInitializer ( ) . init ( new java.util.Properties ( ) ) ; ConfigurableApplicationContext org.springframework.data.gemfire.support.ConfigurableApplicationContext = SpringContextBootstrappingInitializer . getApplicationContext ( ) ; org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader = org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBean ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader .class ) ; javax.sql.DataSource javax.sql.DataSource = org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBean ( javax.sql.DataSource .class ) ; assertSame ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ( ) , org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ) ; assertSame ( org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader . javax.sql.DataSource ( ) , javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { return new org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.TestDataSource ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ( ) { return new org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ( ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.support.User org.springframework.data.gemfire.support.User ( java.lang.String java.lang.String ) { return org.springframework.data.gemfire.support.User ( java.lang.String , true , java.util.Calendar . java.util.Calendar ( ) , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.support.User org.springframework.data.gemfire.support.User ( java.lang.String java.lang.String , java.lang.Boolean java.lang.Boolean ) { return org.springframework.data.gemfire.support.User ( java.lang.String , java.lang.Boolean , java.util.Calendar . java.util.Calendar ( ) , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.support.User org.springframework.data.gemfire.support.User ( java.lang.String java.lang.String , java.lang.Boolean java.lang.Boolean , java.util.Calendar java.util.Calendar ) { return org.springframework.data.gemfire.support.User ( java.lang.String , java.lang.Boolean , java.util.Calendar , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> protected static org.springframework.data.gemfire.support.User org.springframework.data.gemfire.support.User ( java.lang.String java.lang.String , java.lang.Boolean java.lang.Boolean , java.util.Calendar java.util.Calendar , java.lang.String java.lang.String ) { User org.springframework.data.gemfire.support.User = new User ( java.lang.String ) ; org.springframework.data.gemfire.support.User . setActive ( java.lang.Boolean ) ; org.springframework.data.gemfire.support.User . setEmail ( java.lang.String ) ; org.springframework.data.gemfire.support.User . setSince ( java.util.Calendar ) ; return org.springframework.data.gemfire.support.User ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ( ) { return java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader> . org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { Assert . state ( java.util.concurrent.atomic.AtomicReference<org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader> . boolean ( null , this ) , java.lang.String . java.lang.String ( STRING , java.lang.Class<? extends org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader> ( ) . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. assertInitialized ( ) ; Assert . state ( javax.sql.DataSource != null , java.lang.String . java.lang.String ( STRING , java.lang.Class<? extends org.springframework.data.gemfire.support.SpringContextBootstrappingInitializerIntegrationTest.UserDataStoreCacheLoader> ( ) . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected javax.sql.DataSource javax.sql.DataSource ( ) { return javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { javax.sql.DataSource = null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.gemfire.support.User org.springframework.data.gemfire.support.User ( final LoaderHelper < java.lang.String , User > org.springframework.data.gemfire.support.LoaderHelper<java.lang.String,org.springframework.data.gemfire.support.User> ) throws org.springframework.data.gemfire.support.CacheLoaderException { void ( ) ; return java.util.Map<java.lang.String,org.springframework.data.gemfire.support.User> . get ( org.springframework.data.gemfire.support.LoaderHelper<java.lang.String,org.springframework.data.gemfire.support.User> . getKey ( ) ) ; }  <METHOD_END>