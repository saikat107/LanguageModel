<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . setVerifier ( new org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.NoOpVerifier ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.MyInterface .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.Animal .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.Person .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.NonPersistentClass .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.TooManyAnnotations .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.NoPartitionKey .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.NoPrimaryKey .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntityMetadataVerifierUnitTests.PrimaryKeyAndPrimaryKeyColumn .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CassandraPersistentEntity < ? > org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ) throws org.springframework.data.cassandra.mapping.MappingException {}  <METHOD_END>
