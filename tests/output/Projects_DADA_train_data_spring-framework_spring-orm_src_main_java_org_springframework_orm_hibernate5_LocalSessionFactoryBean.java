<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . javax.sql.DataSource = javax.sql.DataSource ; }  <METHOD_END>
<METHOD_START> public void void ( Resource org.springframework.orm.hibernate5.Resource ) { this . org.springframework.orm.hibernate5.Resource[] = new Resource [] { org.springframework.orm.hibernate5.Resource } ; }  <METHOD_END>
<METHOD_START> public void void ( Resource ... org.springframework.orm.hibernate5.Resource[] ) { this . org.springframework.orm.hibernate5.Resource[] = org.springframework.orm.hibernate5.Resource[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( Resource ... org.springframework.orm.hibernate5.Resource[] ) { this . org.springframework.orm.hibernate5.Resource[] = org.springframework.orm.hibernate5.Resource[] ; }  <METHOD_END>
<METHOD_START> public void void ( Resource ... org.springframework.orm.hibernate5.Resource[] ) { this . org.springframework.orm.hibernate5.Resource[] = org.springframework.orm.hibernate5.Resource[] ; }  <METHOD_END>
<METHOD_START> public void void ( Resource ... org.springframework.orm.hibernate5.Resource[] ) { this . org.springframework.orm.hibernate5.Resource[] = org.springframework.orm.hibernate5.Resource[] ; }  <METHOD_END>
<METHOD_START> public void void ( Resource ... org.springframework.orm.hibernate5.Resource[] ) { this . org.springframework.orm.hibernate5.Resource[] = org.springframework.orm.hibernate5.Resource[] ; }  <METHOD_END>
<METHOD_START> public void void ( Interceptor org.springframework.orm.hibernate5.Interceptor ) { this . org.springframework.orm.hibernate5.Interceptor = org.springframework.orm.hibernate5.Interceptor ; }  <METHOD_END>
<METHOD_START> public void void ( ImplicitNamingStrategy org.springframework.orm.hibernate5.ImplicitNamingStrategy ) { this . org.springframework.orm.hibernate5.ImplicitNamingStrategy = org.springframework.orm.hibernate5.ImplicitNamingStrategy ; }  <METHOD_END>
<METHOD_START> public void void ( PhysicalNamingStrategy org.springframework.orm.hibernate5.PhysicalNamingStrategy ) { this . org.springframework.orm.hibernate5.PhysicalNamingStrategy = org.springframework.orm.hibernate5.PhysicalNamingStrategy ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( MultiTenantConnectionProvider org.springframework.orm.hibernate5.MultiTenantConnectionProvider ) { this . org.springframework.orm.hibernate5.MultiTenantConnectionProvider = org.springframework.orm.hibernate5.MultiTenantConnectionProvider ; }  <METHOD_END>
<METHOD_START> public void void ( CurrentTenantIdentifierResolver org.springframework.orm.hibernate5.CurrentTenantIdentifierResolver ) { this . org.springframework.orm.hibernate5.CurrentTenantIdentifierResolver = org.springframework.orm.hibernate5.CurrentTenantIdentifierResolver ; }  <METHOD_END>
<METHOD_START> public void void ( TypeFilter ... org.springframework.orm.hibernate5.TypeFilter[] ) { this . org.springframework.orm.hibernate5.TypeFilter[] = org.springframework.orm.hibernate5.TypeFilter[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { this . java.util.Properties = java.util.Properties ; }  <METHOD_END>
<METHOD_START> public java.util.Properties java.util.Properties ( ) { if ( this . java.util.Properties == null ) { this . java.util.Properties = new java.util.Properties ( ) ; } return this . java.util.Properties ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { this . java.lang.Class<?>[] = java.lang.Class<?>[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( AsyncTaskExecutor org.springframework.orm.hibernate5.AsyncTaskExecutor ) { this . org.springframework.orm.hibernate5.AsyncTaskExecutor = org.springframework.orm.hibernate5.AsyncTaskExecutor ; }  <METHOD_END>
<METHOD_START> public void void ( MetadataSources org.springframework.orm.hibernate5.MetadataSources ) { Assert . notNull ( org.springframework.orm.hibernate5.MetadataSources , STRING ) ; this . boolean = true ; this . org.springframework.orm.hibernate5.MetadataSources = org.springframework.orm.hibernate5.MetadataSources ; }  <METHOD_END>
<METHOD_START> public org.springframework.orm.hibernate5.MetadataSources org.springframework.orm.hibernate5.MetadataSources ( ) { this . boolean = true ; if ( this . org.springframework.orm.hibernate5.MetadataSources == null ) { BootstrapServiceRegistryBuilder org.springframework.orm.hibernate5.BootstrapServiceRegistryBuilder = new BootstrapServiceRegistryBuilder ( ) ; if ( this . org.springframework.orm.hibernate5.ResourcePatternResolver != null ) { org.springframework.orm.hibernate5.BootstrapServiceRegistryBuilder = org.springframework.orm.hibernate5.BootstrapServiceRegistryBuilder . applyClassLoader ( this . org.springframework.orm.hibernate5.ResourcePatternResolver . getClassLoader ( ) ) ; } this . org.springframework.orm.hibernate5.MetadataSources = new MetadataSources ( org.springframework.orm.hibernate5.BootstrapServiceRegistryBuilder . build ( ) ) ; } return this . org.springframework.orm.hibernate5.MetadataSources ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceLoader org.springframework.orm.hibernate5.ResourceLoader ) { this . org.springframework.orm.hibernate5.ResourcePatternResolver = ResourcePatternUtils . getResourcePatternResolver ( org.springframework.orm.hibernate5.ResourceLoader ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.orm.hibernate5.ResourceLoader org.springframework.orm.hibernate5.ResourceLoader ( ) { if ( this . org.springframework.orm.hibernate5.ResourcePatternResolver == null ) { this . org.springframework.orm.hibernate5.ResourcePatternResolver = new PathMatchingResourcePatternResolver ( ) ; } return this . org.springframework.orm.hibernate5.ResourcePatternResolver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { if ( this . org.springframework.orm.hibernate5.MetadataSources != null && ! this . boolean ) { this . org.springframework.orm.hibernate5.MetadataSources = null ; } LocalSessionFactoryBuilder org.springframework.orm.hibernate5.LocalSessionFactoryBuilder = new LocalSessionFactoryBuilder ( this . javax.sql.DataSource , org.springframework.orm.hibernate5.ResourceLoader ( ) , org.springframework.orm.hibernate5.MetadataSources ( ) ) ; if ( this . org.springframework.orm.hibernate5.Resource[] != null ) { for ( Resource org.springframework.orm.hibernate5.Resource : this . org.springframework.orm.hibernate5.Resource[] ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . configure ( org.springframework.orm.hibernate5.Resource . getURL ( ) ) ; } } if ( this . java.lang.String[] != null ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { Resource org.springframework.orm.hibernate5.Resource = new ClassPathResource ( java.lang.String . java.lang.String ( ) , this . org.springframework.orm.hibernate5.ResourcePatternResolver . getClassLoader ( ) ) ; org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addInputStream ( org.springframework.orm.hibernate5.Resource . getInputStream ( ) ) ; } } if ( this . org.springframework.orm.hibernate5.Resource[] != null ) { for ( Resource org.springframework.orm.hibernate5.Resource : this . org.springframework.orm.hibernate5.Resource[] ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addInputStream ( org.springframework.orm.hibernate5.Resource . getInputStream ( ) ) ; } } if ( this . org.springframework.orm.hibernate5.Resource[] != null ) { for ( Resource org.springframework.orm.hibernate5.Resource : this . org.springframework.orm.hibernate5.Resource[] ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addCacheableFile ( org.springframework.orm.hibernate5.Resource . getFile ( ) ) ; } } if ( this . org.springframework.orm.hibernate5.Resource[] != null ) { for ( Resource org.springframework.orm.hibernate5.Resource : this . org.springframework.orm.hibernate5.Resource[] ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addJar ( org.springframework.orm.hibernate5.Resource . getFile ( ) ) ; } } if ( this . org.springframework.orm.hibernate5.Resource[] != null ) { for ( Resource org.springframework.orm.hibernate5.Resource : this . org.springframework.orm.hibernate5.Resource[] ) { java.io.File java.io.File = org.springframework.orm.hibernate5.Resource . getFile ( ) ; if ( ! java.io.File . boolean ( ) ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.orm.hibernate5.Resource + STRING ) ; } org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addDirectory ( java.io.File ) ; } } if ( this . org.springframework.orm.hibernate5.Interceptor != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setInterceptor ( this . org.springframework.orm.hibernate5.Interceptor ) ; } if ( this . org.springframework.orm.hibernate5.ImplicitNamingStrategy != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setImplicitNamingStrategy ( this . org.springframework.orm.hibernate5.ImplicitNamingStrategy ) ; } if ( this . org.springframework.orm.hibernate5.PhysicalNamingStrategy != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setPhysicalNamingStrategy ( this . org.springframework.orm.hibernate5.PhysicalNamingStrategy ) ; } if ( this . java.lang.Object != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setJtaTransactionManager ( this . java.lang.Object ) ; } if ( this . org.springframework.orm.hibernate5.MultiTenantConnectionProvider != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setMultiTenantConnectionProvider ( this . org.springframework.orm.hibernate5.MultiTenantConnectionProvider ) ; } if ( this . org.springframework.orm.hibernate5.CurrentTenantIdentifierResolver != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setCurrentTenantIdentifierResolver ( this . org.springframework.orm.hibernate5.CurrentTenantIdentifierResolver ) ; } if ( this . org.springframework.orm.hibernate5.TypeFilter[] != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . setEntityTypeFilters ( this . org.springframework.orm.hibernate5.TypeFilter[] ) ; } if ( this . java.util.Properties != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addProperties ( this . java.util.Properties ) ; } if ( this . java.lang.Class<?>[] != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addAnnotatedClasses ( this . java.lang.Class<?>[] ) ; } if ( this . java.lang.String[] != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . addPackages ( this . java.lang.String[] ) ; } if ( this . java.lang.String[] != null ) { org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . scanPackages ( this . java.lang.String[] ) ; } this . org.springframework.orm.hibernate5.Configuration = org.springframework.orm.hibernate5.LocalSessionFactoryBuilder ; this . org.springframework.orm.hibernate5.SessionFactory = org.springframework.orm.hibernate5.SessionFactory ( org.springframework.orm.hibernate5.LocalSessionFactoryBuilder ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.orm.hibernate5.SessionFactory org.springframework.orm.hibernate5.SessionFactory ( LocalSessionFactoryBuilder org.springframework.orm.hibernate5.LocalSessionFactoryBuilder ) { return ( this . org.springframework.orm.hibernate5.AsyncTaskExecutor != null ? org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . buildSessionFactory ( this . org.springframework.orm.hibernate5.AsyncTaskExecutor ) : org.springframework.orm.hibernate5.LocalSessionFactoryBuilder . buildSessionFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> public final org.springframework.orm.hibernate5.Configuration org.springframework.orm.hibernate5.Configuration ( ) { if ( this . org.springframework.orm.hibernate5.Configuration == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } return this . org.springframework.orm.hibernate5.Configuration ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.orm.hibernate5.SessionFactory org.springframework.orm.hibernate5.SessionFactory ( ) { return this . org.springframework.orm.hibernate5.SessionFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return ( this . org.springframework.orm.hibernate5.SessionFactory != null ? this . org.springframework.orm.hibernate5.SessionFactory . getClass ( ) : SessionFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.orm.hibernate5.SessionFactory . close ( ) ; }  <METHOD_END>
