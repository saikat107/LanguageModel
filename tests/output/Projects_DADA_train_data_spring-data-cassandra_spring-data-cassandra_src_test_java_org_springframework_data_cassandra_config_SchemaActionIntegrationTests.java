<METHOD_START> protected org.springframework.data.cassandra.config.ConfigurableApplicationContext org.springframework.data.cassandra.config.ConfigurableApplicationContext ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { AnnotationConfigApplicationContext org.springframework.data.cassandra.config.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<?>[] ) ; org.springframework.data.cassandra.config.AnnotationConfigApplicationContext . registerShutdownHook ( ) ; return org.springframework.data.cassandra.config.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> protected < T > T T ( java.lang.Class<?> < ? > java.lang.Class<?> , SessionCallback < T > org.springframework.data.cassandra.config.SessionCallback<T> ) { ConfigurableApplicationContext org.springframework.data.cassandra.config.ConfigurableApplicationContext = null ; try { org.springframework.data.cassandra.config.ConfigurableApplicationContext = org.springframework.data.cassandra.config.ConfigurableApplicationContext ( java.lang.Class<> ) ; return org.springframework.data.cassandra.config.SessionCallback<T> . doInSession ( org.springframework.data.cassandra.config.ConfigurableApplicationContext . getBean ( Session .class ) ) ; } finally { if ( org.springframework.data.cassandra.config.ConfigurableApplicationContext != null ) { org.springframework.data.cassandra.config.ConfigurableApplicationContext . close ( ) ; } } }  <METHOD_END>
<METHOD_START> protected void void ( Session org.springframework.data.cassandra.config.Session , java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { Metadata org.springframework.data.cassandra.config.Metadata = org.springframework.data.cassandra.config.Session . getCluster ( ) . getMetadata ( ) ; KeyspaceMetadata org.springframework.data.cassandra.config.KeyspaceMetadata = org.springframework.data.cassandra.config.Metadata . getKeyspace ( java.lang.String ) ; assertThat ( org.springframework.data.cassandra.config.KeyspaceMetadata ) . isNotNull ( ) ; TableMetadata org.springframework.data.cassandra.config.TableMetadata = org.springframework.data.cassandra.config.KeyspaceMetadata . getTable ( java.lang.String ) ; assertThat ( org.springframework.data.cassandra.config.TableMetadata ) . isNotNull ( ) ; assertThat ( org.springframework.data.cassandra.config.TableMetadata . getColumns ( ) ) . hasSize ( java.lang.String[] . int ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { assertThat ( org.springframework.data.cassandra.config.TableMetadata . getColumn ( java.lang.String ) ) . isNotNull ( ) ; } assertThat ( org.springframework.data.cassandra.config.TableMetadata . getColumns ( ) ) . hasSize ( java.lang.String[] . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { T ( org.springframework.data.cassandra.config.SchemaActionIntegrationTests.CreateWithNoExistingTableConfiguration .class , ( SessionCallback < java.lang.Void > ) session -> { assertHasTableWithColumns ( session , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ; return null ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { T ( org.springframework.data.cassandra.config.SchemaActionIntegrationTests.CreateWithExistingTableConfiguration .class , s -> { fail ( String . format ( STRING , CreateWithExistingTableConfiguration .class . getSimpleName ( ) ) ) ; return null ; } ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.data.cassandra.config.BeanCreationException ) { assertThat ( org.springframework.data.cassandra.config.BeanCreationException ) . hasMessageContaining ( java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { T ( org.springframework.data.cassandra.config.SchemaActionIntegrationTests.CreateIfNotExistsWithNoExistingTableConfiguration .class , ( SessionCallback < java.lang.Void > ) session -> { assertHasTableWithColumns ( session , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ; return null ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { T ( org.springframework.data.cassandra.config.SchemaActionIntegrationTests.CreateIfNotExistsWithExistingTableConfiguration .class , ( SessionCallback < java.lang.Void > ) session -> { assertHasTableWithColumns ( session , STRING , STRING , STRING , STRING ) ; return null ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { T ( org.springframework.data.cassandra.config.SchemaActionIntegrationTests.RecreateSchemaActionWithExistingTableConfiguration .class , ( SessionCallback < java.lang.Void > ) session -> { assertHasTableWithColumns ( session , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ; return null ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.SchemaAction org.springframework.data.cassandra.config.SchemaAction ( ) { return SchemaAction . CREATE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.SchemaAction org.springframework.data.cassandra.config.SchemaAction ( ) { return SchemaAction . CREATE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.Collections . java.util.List<java.lang.String> ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.SchemaAction org.springframework.data.cassandra.config.SchemaAction ( ) { return SchemaAction . CREATE_IF_NOT_EXISTS ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.SchemaAction org.springframework.data.cassandra.config.SchemaAction ( ) { return SchemaAction . CREATE_IF_NOT_EXISTS ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.Collections . java.util.List<java.lang.String> ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.SchemaAction org.springframework.data.cassandra.config.SchemaAction ( ) { return SchemaAction . RECREATE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.Collections . java.util.List<java.lang.String> ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.Override public org.springframework.data.cassandra.config.CassandraCqlClusterFactoryBean org.springframework.data.cassandra.config.CassandraCqlClusterFactoryBean ( ) { return new CassandraCqlClusterFactoryBean ( ) { @ java.lang.Override public void void ( ) java.lang.Exception { } @ java.lang.Override public org.springframework.data.cassandra.config.Cluster org.springframework.data.cassandra.config.Cluster ( ) { return cassandraEnvironment . getCluster ( ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.Cluster org.springframework.data.cassandra.config.Cluster ( ) { return cassandraEnvironment . getCluster ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return new java.lang.String [] { Person .class . java.lang.Package ( ) . java.lang.String ( ) } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>