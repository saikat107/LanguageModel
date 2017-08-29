<METHOD_START> public void ( Session org.springframework.data.cassandra.core.Session , CassandraConverter org.springframework.data.cassandra.core.CassandraConverter ) { super( org.springframework.data.cassandra.core.Session , org.springframework.data.cassandra.core.CassandraConverter ); }  <METHOD_END>
<METHOD_START> public void ( SessionFactory org.springframework.data.cassandra.core.SessionFactory , CassandraConverter org.springframework.data.cassandra.core.CassandraConverter ) { super( org.springframework.data.cassandra.core.SessionFactory , org.springframework.data.cassandra.core.CassandraConverter ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean , CqlIdentifier org.springframework.data.cassandra.core.CqlIdentifier , java.lang.Class<?> < ? > java.lang.Class<?> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { CassandraPersistentEntity < ? > org.springframework.data.cassandra.core.CassandraPersistentEntity<?> = getConverter ( ) . getMappingContext ( ) . getRequiredPersistentEntity ( java.lang.Class<> ) ; CreateTableSpecification org.springframework.data.cassandra.core.CreateTableSpecification = getConverter ( ) . getMappingContext ( ) . getCreateTableSpecificationFor ( org.springframework.data.cassandra.core.CassandraPersistentEntity<> ) . ifNotExists ( boolean ) ; getCqlOperations ( ) . execute ( CreateTableCqlGenerator . toCql ( org.springframework.data.cassandra.core.CreateTableSpecification ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { void ( getTableName ( java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CqlIdentifier org.springframework.data.cassandra.core.CqlIdentifier ) { getCqlOperations ( ) . execute ( DropTableCqlGenerator . toCql ( DropTableSpecification . dropTable ( org.springframework.data.cassandra.core.CqlIdentifier ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CqlIdentifier org.springframework.data.cassandra.core.CqlIdentifier ) { Assert . notNull ( org.springframework.data.cassandra.core.CqlIdentifier , STRING ) ; getCqlOperations ( ) . execute ( DropUserTypeCqlGenerator . toCql ( DropUserTypeSpecification . dropType ( org.springframework.data.cassandra.core.CqlIdentifier ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.data.cassandra.core.TableMetadata> < TableMetadata > java.util.Optional<org.springframework.data.cassandra.core.TableMetadata> ( java.lang.String java.lang.String , CqlIdentifier org.springframework.data.cassandra.core.CqlIdentifier ) { Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.data.cassandra.core.CqlIdentifier , STRING ) ; return java.util.Optional . java.util.Optional ( getCqlOperations ( ) . execute ( ( SessionCallback < TableMetadata > ) session -> session . getCluster ( ) . getMetadata ( ) . getKeyspace ( keyspace ) . getTable ( tableName . toCql ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.core.KeyspaceMetadata org.springframework.data.cassandra.core.KeyspaceMetadata ( ) { return getCqlOperations ( ) . execute ( ( SessionCallback < KeyspaceMetadata > ) session -> { KeyspaceMetadata keyspaceMetadata = session . getCluster ( ) . getMetadata ( ) . getKeyspace ( session . getLoggedKeyspace ( ) ) ; Assert . state ( keyspaceMetadata != null , String . format ( STRING , session . getLoggedKeyspace ( ) ) ) ; return keyspaceMetadata ; } ) ; }  <METHOD_END>