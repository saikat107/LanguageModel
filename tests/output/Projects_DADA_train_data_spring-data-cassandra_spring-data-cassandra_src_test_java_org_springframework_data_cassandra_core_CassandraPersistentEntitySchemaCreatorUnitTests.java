<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.data.cassandra.core.BasicCassandraMappingContext . setUserTypeResolver ( typeName -> { throw new IllegalArgumentException ( String . format ( STRING , typeName ) ) ; } ) ; when ( org.springframework.data.cassandra.core.CassandraAdminOperations . getCqlOperations ( ) ) . thenReturn ( org.springframework.data.cassandra.core.CqlOperations ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.core.BasicCassandraMappingContext . getPersistentEntity ( org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreatorUnitTests.MoonType .class ) ; org.springframework.data.cassandra.core.BasicCassandraMappingContext . getPersistentEntity ( org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreatorUnitTests.PlanetType .class ) ; CassandraPersistentEntitySchemaCreator org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator = new CassandraPersistentEntitySchemaCreator ( org.springframework.data.cassandra.core.BasicCassandraMappingContext , org.springframework.data.cassandra.core.CassandraAdminOperations ) ; org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator . createUserTypes ( false ) ; void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.core.BasicCassandraMappingContext . getPersistentEntity ( org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreatorUnitTests.PlanetType .class ) ; CassandraPersistentEntitySchemaCreator org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator = new CassandraPersistentEntitySchemaCreator ( org.springframework.data.cassandra.core.BasicCassandraMappingContext , org.springframework.data.cassandra.core.CassandraAdminOperations ) ; org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator . createUserTypes ( false ) ; verify ( org.springframework.data.cassandra.core.CqlOperations ) . execute ( matches ( STRING ) ) ; void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.core.BasicCassandraMappingContext . getPersistentEntity ( org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreatorUnitTests.SpaceAgencyType .class ) ; CassandraPersistentEntitySchemaCreator org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator = new CassandraPersistentEntitySchemaCreator ( org.springframework.data.cassandra.core.BasicCassandraMappingContext , org.springframework.data.cassandra.core.CassandraAdminOperations ) ; org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator . createUserTypes ( false ) ; verify ( org.springframework.data.cassandra.core.CqlOperations ) . execute ( matches ( STRING ) ) ; void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.core.BasicCassandraMappingContext . getPersistentEntity ( org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreatorUnitTests.PlanetType .class ) ; CassandraPersistentEntitySchemaCreator org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator = new CassandraPersistentEntitySchemaCreator ( org.springframework.data.cassandra.core.BasicCassandraMappingContext , org.springframework.data.cassandra.core.CassandraAdminOperations ) ; org.springframework.data.cassandra.core.CassandraPersistentEntitySchemaCreator . createUserTypes ( false ) ; void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { InOrder org.springframework.data.cassandra.core.InOrder = Mockito . inOrder ( org.springframework.data.cassandra.core.CqlOperations ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { org.springframework.data.cassandra.core.InOrder . verify ( org.springframework.data.cassandra.core.CqlOperations ) . execute ( Mockito . contains ( STRING + java.lang.String ) ) ; } }  <METHOD_END>
