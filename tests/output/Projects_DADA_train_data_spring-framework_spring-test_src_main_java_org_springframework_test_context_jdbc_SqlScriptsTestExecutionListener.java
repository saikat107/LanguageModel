<METHOD_START> @ java.lang.Override public final int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.jdbc.TestContext ) throws java.lang.Exception { void ( org.springframework.test.context.jdbc.TestContext , ExecutionPhase . BEFORE_TEST_METHOD ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.jdbc.TestContext ) throws java.lang.Exception { void ( org.springframework.test.context.jdbc.TestContext , ExecutionPhase . AFTER_TEST_METHOD ) ; }  <METHOD_END>
<METHOD_START> private void void ( TestContext org.springframework.test.context.jdbc.TestContext , ExecutionPhase org.springframework.test.context.jdbc.ExecutionPhase ) throws java.lang.Exception { boolean boolean = false ; java.util.Set<org.springframework.test.context.jdbc.Sql> < Sql > java.util.Set<org.springframework.test.context.jdbc.Sql> = AnnotatedElementUtils . getMergedRepeatableAnnotations ( org.springframework.test.context.jdbc.TestContext . getTestMethod ( ) , Sql .class , SqlGroup .class ) ; if ( java.util.Set<org.springframework.test.context.jdbc.Sql> . isEmpty ( ) ) { java.util.Set<org.springframework.test.context.jdbc.Sql> = AnnotatedElementUtils . getMergedRepeatableAnnotations ( org.springframework.test.context.jdbc.TestContext . getTestClass ( ) , Sql .class , SqlGroup .class ) ; if ( ! java.util.Set<org.springframework.test.context.jdbc.Sql> . isEmpty ( ) ) { boolean = true ; } } for ( Sql org.springframework.test.context.jdbc.Sql : java.util.Set<org.springframework.test.context.jdbc.Sql> ) { void ( org.springframework.test.context.jdbc.Sql , org.springframework.test.context.jdbc.ExecutionPhase , org.springframework.test.context.jdbc.TestContext , boolean ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Sql org.springframework.test.context.jdbc.Sql , ExecutionPhase org.springframework.test.context.jdbc.ExecutionPhase , TestContext org.springframework.test.context.jdbc.TestContext , boolean boolean )			throws java.lang.Exception { if ( org.springframework.test.context.jdbc.ExecutionPhase != org.springframework.test.context.jdbc.Sql . executionPhase ( ) ) { return; } MergedSqlConfig org.springframework.test.context.jdbc.MergedSqlConfig = new MergedSqlConfig ( org.springframework.test.context.jdbc.Sql . config ( ) , org.springframework.test.context.jdbc.TestContext . getTestClass ( ) ) ; if ( org.springframework.test.context.jdbc.Log . isDebugEnabled ( ) ) { org.springframework.test.context.jdbc.Log . debug ( java.lang.String . java.lang.String ( STRING , org.springframework.test.context.jdbc.MergedSqlConfig , org.springframework.test.context.jdbc.ExecutionPhase , org.springframework.test.context.jdbc.TestContext ) ) ; } final ResourceDatabasePopulator org.springframework.test.context.jdbc.ResourceDatabasePopulator = new ResourceDatabasePopulator ( ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setSqlScriptEncoding ( org.springframework.test.context.jdbc.MergedSqlConfig . getEncoding ( ) ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setSeparator ( org.springframework.test.context.jdbc.MergedSqlConfig . getSeparator ( ) ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setCommentPrefix ( org.springframework.test.context.jdbc.MergedSqlConfig . getCommentPrefix ( ) ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setBlockCommentStartDelimiter ( org.springframework.test.context.jdbc.MergedSqlConfig . getBlockCommentStartDelimiter ( ) ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setBlockCommentEndDelimiter ( org.springframework.test.context.jdbc.MergedSqlConfig . getBlockCommentEndDelimiter ( ) ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setContinueOnError ( org.springframework.test.context.jdbc.MergedSqlConfig . getErrorMode ( ) == ErrorMode . CONTINUE_ON_ERROR ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . setIgnoreFailedDrops ( org.springframework.test.context.jdbc.MergedSqlConfig . getErrorMode ( ) == ErrorMode . IGNORE_FAILED_DROPS ) ; java.lang.String [] java.lang.String[] = java.lang.String[] ( org.springframework.test.context.jdbc.Sql , org.springframework.test.context.jdbc.TestContext , boolean ) ; java.lang.String[] = TestContextResourceUtils . convertToClasspathResourcePaths ( org.springframework.test.context.jdbc.TestContext . getTestClass ( ) , java.lang.String[] ) ; java.util.List<org.springframework.test.context.jdbc.Resource> < Resource > java.util.List<org.springframework.test.context.jdbc.Resource> = TestContextResourceUtils . convertToResourceList ( org.springframework.test.context.jdbc.TestContext . getApplicationContext ( ) , java.lang.String[] ) ; for ( java.lang.String java.lang.String : org.springframework.test.context.jdbc.Sql . statements ( ) ) { if ( StringUtils . hasText ( java.lang.String ) ) { java.lang.String = java.lang.String . java.lang.String ( ) ; java.util.List<org.springframework.test.context.jdbc.Resource> . add ( new ByteArrayResource ( java.lang.String . byte[] ( ) , STRING + java.lang.String ) ) ; } } org.springframework.test.context.jdbc.ResourceDatabasePopulator . setScripts ( java.util.List<org.springframework.test.context.jdbc.Resource> . toArray ( new Resource [ java.util.List<org.springframework.test.context.jdbc.Resource> . size ( ) ] ) ) ; if ( org.springframework.test.context.jdbc.Log . isDebugEnabled ( ) ) { org.springframework.test.context.jdbc.Log . debug ( STRING + ObjectUtils . nullSafeToString ( java.util.List<org.springframework.test.context.jdbc.Resource> ) ) ; } java.lang.String java.lang.String = org.springframework.test.context.jdbc.MergedSqlConfig . getDataSource ( ) ; java.lang.String java.lang.String = org.springframework.test.context.jdbc.MergedSqlConfig . getTransactionManager ( ) ; javax.sql.DataSource javax.sql.DataSource = TestContextTransactionUtils . retrieveDataSource ( org.springframework.test.context.jdbc.TestContext , java.lang.String ) ; PlatformTransactionManager org.springframework.test.context.jdbc.PlatformTransactionManager = TestContextTransactionUtils . retrieveTransactionManager ( org.springframework.test.context.jdbc.TestContext , java.lang.String ) ; boolean boolean = ( org.springframework.test.context.jdbc.MergedSqlConfig . getTransactionMode ( ) == TransactionMode . ISOLATED ) ; if ( org.springframework.test.context.jdbc.PlatformTransactionManager == null ) { Assert . state ( ! boolean , ( ) String . format ( STRING + STRING + STRING , testContext , TransactionMode . ISOLATED ) ) ; Assert . state ( javax.sql.DataSource != null , ( ) String . format ( STRING + STRING , testContext ) ) ; org.springframework.test.context.jdbc.ResourceDatabasePopulator . execute ( javax.sql.DataSource ) ; } else { javax.sql.DataSource javax.sql.DataSource = javax.sql.DataSource ( org.springframework.test.context.jdbc.PlatformTransactionManager ) ; if ( javax.sql.DataSource != null && javax.sql.DataSource != null && ! javax.sql.DataSource . boolean ( javax.sql.DataSource ) ) { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING + STRING + STRING , org.springframework.test.context.jdbc.TestContext , javax.sql.DataSource . java.lang.Class<? extends javax.sql.DataSource> ( ) . java.lang.String ( ) , java.lang.String , org.springframework.test.context.jdbc.PlatformTransactionManager . getClass ( ) . getName ( ) , java.lang.String ) ) ; } if ( javax.sql.DataSource == null ) { javax.sql.DataSource = javax.sql.DataSource ; Assert . state ( javax.sql.DataSource != null , ( ) String . format ( STRING + STRING , testContext , txMgr . getClass ( ) . getName ( ) , tmName ) ) ; } final javax.sql.DataSource javax.sql.DataSource = javax.sql.DataSource ; int int = ( boolean ? TransactionDefinition . PROPAGATION_REQUIRES_NEW : TransactionDefinition . PROPAGATION_REQUIRED ) ; TransactionAttribute org.springframework.test.context.jdbc.TransactionAttribute = TestContextTransactionUtils . createDelegatingTransactionAttribute ( org.springframework.test.context.jdbc.TestContext , new DefaultTransactionAttribute ( int ) ) ; new TransactionTemplate ( org.springframework.test.context.jdbc.PlatformTransactionManager , org.springframework.test.context.jdbc.TransactionAttribute ) . execute ( status -> { populator . execute ( finalDataSource ) ; return null ; } ) ; } }  <METHOD_END>
<METHOD_START> private javax.sql.DataSource javax.sql.DataSource ( PlatformTransactionManager org.springframework.test.context.jdbc.PlatformTransactionManager ) { try { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.test.context.jdbc.PlatformTransactionManager . getClass ( ) . getMethod ( STRING ) ; java.lang.Object java.lang.Object = ReflectionUtils . invokeMethod ( java.lang.reflect.Method , org.springframework.test.context.jdbc.PlatformTransactionManager ) ; if ( java.lang.Object instanceof javax.sql.DataSource ) { return ( javax.sql.DataSource ) java.lang.Object ; } } catch ( java.lang.Exception java.lang.Exception ) { } return null ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( Sql org.springframework.test.context.jdbc.Sql , TestContext org.springframework.test.context.jdbc.TestContext , boolean boolean ) { java.lang.String [] java.lang.String[] = org.springframework.test.context.jdbc.Sql . scripts ( ) ; if ( ObjectUtils . isEmpty ( java.lang.String[] ) && ObjectUtils . isEmpty ( org.springframework.test.context.jdbc.Sql . statements ( ) ) ) { java.lang.String[] = new java.lang.String [] { java.lang.String ( org.springframework.test.context.jdbc.TestContext , boolean ) } ; } return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( TestContext org.springframework.test.context.jdbc.TestContext , boolean boolean ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.test.context.jdbc.TestContext . getTestClass ( ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.test.context.jdbc.TestContext . getTestMethod ( ) ; java.lang.String java.lang.String = ( boolean ? STRING : STRING ) ; java.lang.String java.lang.String = ( boolean ? java.lang.Class<> . java.lang.String ( ) : java.lang.reflect.Method . java.lang.String ( ) ) ; java.lang.String java.lang.String = ClassUtils . convertClassNameToResourcePath ( java.lang.Class<> . java.lang.String ( ) ) ; if ( ! boolean ) { java.lang.String += STRING + java.lang.reflect.Method . java.lang.String ( ) ; } java.lang.String += STRING ; java.lang.String java.lang.String = ResourceUtils . CLASSPATH_URL_PREFIX + java.lang.String ; ClassPathResource org.springframework.test.context.jdbc.ClassPathResource = new ClassPathResource ( java.lang.String ) ; if ( org.springframework.test.context.jdbc.ClassPathResource . exists ( ) ) { if ( org.springframework.test.context.jdbc.Log . isInfoEnabled ( ) ) { org.springframework.test.context.jdbc.Log . info ( java.lang.String . java.lang.String ( STRING , java.lang.String , java.lang.String , java.lang.String ) ) ; } return java.lang.String ; } else { java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING + STRING + STRING , java.lang.String , java.lang.String , org.springframework.test.context.jdbc.ClassPathResource ) ; org.springframework.test.context.jdbc.Log . error ( java.lang.String ) ; throw new java.lang.IllegalStateException ( java.lang.String ) ; } }  <METHOD_END>