<METHOD_START> protected void void ( Index org.springframework.data.gemfire.Index , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String , IndexType org.springframework.data.gemfire.IndexType ) { assertThat ( org.springframework.data.gemfire.Index , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.gemfire.Index . getName ( ) , is ( equalTo ( java.lang.String ) ) ) ; assertThat ( org.springframework.data.gemfire.Index . getIndexedExpression ( ) , is ( equalTo ( java.lang.String ) ) ) ; assertThat ( org.springframework.data.gemfire.Index . getFromClause ( ) , is ( equalTo ( java.lang.String ) ) ) ; assertThat ( IndexType . valueOf ( org.springframework.data.gemfire.Index . getType ( ) ) , is ( equalTo ( org.springframework.data.gemfire.IndexType ) ) ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext ) { if ( org.springframework.data.gemfire.ConfigurableApplicationContext != null ) { org.springframework.data.gemfire.ConfigurableApplicationContext . close ( ) ; return ! ( org.springframework.data.gemfire.ConfigurableApplicationContext . isActive ( ) || org.springframework.data.gemfire.ConfigurableApplicationContext . isRunning ( ) ) ; } return true ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { java.lang.System . java.util.Properties ( ) . java.lang.Object ( STRING ) ; assertThat ( java.lang.System . java.util.Properties ( ) . boolean ( STRING ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BeanCreationException .class ) public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { org.springframework.data.gemfire.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexDefinitionConflictGemFireConfiguration .class ) ; } catch ( BeanCreationException org.springframework.data.gemfire.BeanCreationException ) { assertThat ( org.springframework.data.gemfire.BeanCreationException . getMessage ( ) , containsString ( STRING + STRING + STRING ) ) ; assertThat ( org.springframework.data.gemfire.BeanCreationException . getCause ( ) , is ( instanceOf ( GemfireIndexException .class ) ) ) ; assertThat ( org.springframework.data.gemfire.BeanCreationException . getCause ( ) . getMessage ( ) , containsString ( STRING + STRING ) ) ; assertThat ( org.springframework.data.gemfire.BeanCreationException . getCause ( ) . getCause ( ) , is ( instanceOf ( IndexExistsException .class ) ) ) ; assertThat ( org.springframework.data.gemfire.BeanCreationException . getCause ( ) . getCause ( ) . getMessage ( ) , is ( equalTo ( STRING ) ) ) ; throw org.springframework.data.gemfire.BeanCreationException ; } finally { assertThat ( boolean ( org.springframework.data.gemfire.ConfigurableApplicationContext ) , is ( true ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { org.springframework.data.gemfire.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexNameConflictGemFireConfiguration .class ) ; assertThat ( org.springframework.data.gemfire.ConfigurableApplicationContext . getBeansOfType ( Index .class ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; Cache org.springframework.data.gemfire.Cache = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Cache .class ) ; assertThat ( org.springframework.data.gemfire.Cache . getQueryService ( ) . getIndexes ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; Index org.springframework.data.gemfire.Index = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Index .class ) ; void ( org.springframework.data.gemfire.Index , org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexNameConflictGemFireConfiguration . java.lang.String , STRING , STRING , IndexType . HASH ) ; Index org.springframework.data.gemfire.Index = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Index .class ) ; void ( org.springframework.data.gemfire.Index , org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexNameConflictGemFireConfiguration . java.lang.String , STRING , STRING , IndexType . FUNCTIONAL ) ; assertThat ( org.springframework.data.gemfire.Index , is ( not ( sameInstance ( org.springframework.data.gemfire.Index ) ) ) ) ; assertThat ( org.springframework.data.gemfire.Cache . getQueryService ( ) . getIndexes ( ) . iterator ( ) . next ( ) , is ( sameInstance ( org.springframework.data.gemfire.Index ) ) ) ; } finally { assertThat ( boolean ( org.springframework.data.gemfire.ConfigurableApplicationContext ) , is ( true ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { java.lang.System . java.lang.String ( STRING , java.lang.Boolean . java.lang.Boolean . java.lang.String ( ) ) ; assertThat ( java.lang.System . java.lang.String ( STRING , STRING ) , is ( equalTo ( java.lang.Boolean . java.lang.Boolean . java.lang.String ( ) ) ) ) ; org.springframework.data.gemfire.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexNameConflictGemFireConfiguration .class ) ; assertThat ( org.springframework.data.gemfire.ConfigurableApplicationContext . getBeansOfType ( Index .class ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; Cache org.springframework.data.gemfire.Cache = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Cache .class ) ; assertThat ( org.springframework.data.gemfire.Cache . getQueryService ( ) . getIndexes ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; Index org.springframework.data.gemfire.Index = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Index .class ) ; void ( org.springframework.data.gemfire.Index , org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexNameConflictGemFireConfiguration . java.lang.String , STRING , STRING , IndexType . HASH ) ; Index org.springframework.data.gemfire.Index = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Index .class ) ; void ( org.springframework.data.gemfire.Index , org.springframework.data.gemfire.IndexConflictsIntegrationTest.IndexNameConflictGemFireConfiguration . java.lang.String , STRING , STRING , IndexType . HASH ) ; assertThat ( org.springframework.data.gemfire.Index , is ( sameInstance ( org.springframework.data.gemfire.Index ) ) ) ; assertThat ( org.springframework.data.gemfire.Cache . getQueryService ( ) . getIndexes ( ) . iterator ( ) . next ( ) , is ( sameInstance ( org.springframework.data.gemfire.Index ) ) ) ; } finally { java.lang.System . java.util.Properties ( ) . java.lang.Object ( STRING ) ; if ( org.springframework.data.gemfire.ConfigurableApplicationContext != null ) { org.springframework.data.gemfire.ConfigurableApplicationContext . close ( ) ; } } }  <METHOD_END>
<METHOD_START> @ Bean public java.util.Properties java.util.Properties ( ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( STRING , org.springframework.data.gemfire.IndexConflictsIntegrationTest .class . java.lang.String ( ) ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; java.util.Properties . java.lang.Object ( STRING , STRING ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.gemfire.CacheFactoryBean org.springframework.data.gemfire.CacheFactoryBean ( ) { CacheFactoryBean org.springframework.data.gemfire.CacheFactoryBean = new CacheFactoryBean ( ) ; org.springframework.data.gemfire.CacheFactoryBean . setProperties ( java.util.Properties ( ) ) ; org.springframework.data.gemfire.CacheFactoryBean . setUseBeanFactoryLocator ( false ) ; return org.springframework.data.gemfire.CacheFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = STRING ) public org.springframework.data.gemfire.ReplicatedRegionFactoryBean org.springframework.data.gemfire.ReplicatedRegionFactoryBean ( Cache org.springframework.data.gemfire.Cache ) { ReplicatedRegionFactoryBean org.springframework.data.gemfire.ReplicatedRegionFactoryBean = new ReplicatedRegionFactoryBean ( ) ; org.springframework.data.gemfire.ReplicatedRegionFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.ReplicatedRegionFactoryBean . setName ( STRING ) ; org.springframework.data.gemfire.ReplicatedRegionFactoryBean . setPersistent ( false ) ; return org.springframework.data.gemfire.ReplicatedRegionFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.gemfire.IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean ( Cache org.springframework.data.gemfire.Cache ) { IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean = new IndexFactoryBean ( ) ; org.springframework.data.gemfire.IndexFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.IndexFactoryBean . setExpression ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setFrom ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setType ( IndexType . PRIMARY_KEY ) ; return org.springframework.data.gemfire.IndexFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean @ DependsOn ( STRING ) public org.springframework.data.gemfire.IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean ( Cache org.springframework.data.gemfire.Cache ) { IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean = new IndexFactoryBean ( ) ; org.springframework.data.gemfire.IndexFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.IndexFactoryBean . setExpression ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setFrom ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setType ( IndexType . PRIMARY_KEY ) ; return org.springframework.data.gemfire.IndexFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.gemfire.PropertyPlaceholderConfigurer org.springframework.data.gemfire.PropertyPlaceholderConfigurer ( ) { return new PropertyPlaceholderConfigurer ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.gemfire.IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean ( Cache org.springframework.data.gemfire.Cache , @ Value ( STRING ) boolean boolean ) { IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean = new IndexFactoryBean ( ) ; org.springframework.data.gemfire.IndexFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.IndexFactoryBean . setExpression ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setFrom ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setName ( java.lang.String ) ; org.springframework.data.gemfire.IndexFactoryBean . setOverride ( boolean ) ; org.springframework.data.gemfire.IndexFactoryBean . setType ( IndexType . HASH ) ; return org.springframework.data.gemfire.IndexFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean @ DependsOn ( STRING ) public org.springframework.data.gemfire.IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean ( Cache org.springframework.data.gemfire.Cache , @ Value ( STRING ) boolean boolean ) { IndexFactoryBean org.springframework.data.gemfire.IndexFactoryBean = new IndexFactoryBean ( ) ; org.springframework.data.gemfire.IndexFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.IndexFactoryBean . setExpression ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setFrom ( STRING ) ; org.springframework.data.gemfire.IndexFactoryBean . setName ( java.lang.String ) ; org.springframework.data.gemfire.IndexFactoryBean . setOverride ( boolean ) ; org.springframework.data.gemfire.IndexFactoryBean . setType ( IndexType . FUNCTIONAL ) ; return org.springframework.data.gemfire.IndexFactoryBean ; }  <METHOD_END>
