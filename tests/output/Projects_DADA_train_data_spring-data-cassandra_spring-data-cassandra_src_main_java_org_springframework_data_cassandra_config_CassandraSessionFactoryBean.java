<METHOD_START> public void void ( CassandraConverter org.springframework.data.cassandra.config.CassandraConverter ) { Assert . notNull ( org.springframework.data.cassandra.config.CassandraConverter , STRING ) ; this . org.springframework.data.cassandra.config.CassandraConverter = org.springframework.data.cassandra.config.CassandraConverter ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.cassandra.config.CassandraConverter org.springframework.data.cassandra.config.CassandraConverter ( ) { return this . org.springframework.data.cassandra.config.CassandraConverter ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.cassandra.config.CassandraMappingContext org.springframework.data.cassandra.config.CassandraMappingContext ( ) { return org.springframework.data.cassandra.config.CassandraConverter ( ) . getMappingContext ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( SchemaAction org.springframework.data.cassandra.config.SchemaAction ) { Assert . notNull ( org.springframework.data.cassandra.config.SchemaAction , STRING ) ; this . org.springframework.data.cassandra.config.SchemaAction = org.springframework.data.cassandra.config.SchemaAction ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.cassandra.config.SchemaAction org.springframework.data.cassandra.config.SchemaAction ( ) { return org.springframework.data.cassandra.config.SchemaAction ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { Assert . state ( org.springframework.data.cassandra.config.CassandraConverter != null , STRING ) ; super. afterPropertiesSet ( ) ; org.springframework.data.cassandra.config.CassandraAdminOperations = new CassandraAdminTemplate ( getObject ( ) , org.springframework.data.cassandra.config.CassandraConverter ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { boolean boolean = false ; boolean boolean = boolean ; boolean boolean = boolean ; boolean boolean = boolean ; switch ( org.springframework.data.cassandra.config.SchemaAction ) { case RECREATE_DROP_UNUSED : boolean = true ; case RECREATE : boolean = true ; case CREATE_IF_NOT_EXISTS : boolean = SchemaAction . CREATE_IF_NOT_EXISTS . equals ( org.springframework.data.cassandra.config.SchemaAction ) ; case CREATE : boolean = true ; case NONE : default: } if ( boolean ) { void ( boolean , boolean , boolean ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( boolean boolean , boolean boolean , boolean boolean ) { void ( boolean , boolean , boolean ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean , boolean boolean , boolean boolean ) { CassandraPersistentEntitySchemaCreator org.springframework.data.cassandra.config.CassandraPersistentEntitySchemaCreator = new CassandraPersistentEntitySchemaCreator ( org.springframework.data.cassandra.config.CassandraMappingContext ( ) , org.springframework.data.cassandra.config.CassandraAdminOperations ( ) ) ; if ( boolean ) { CassandraPersistentEntitySchemaDropper org.springframework.data.cassandra.config.CassandraPersistentEntitySchemaDropper = new CassandraPersistentEntitySchemaDropper ( org.springframework.data.cassandra.config.CassandraMappingContext ( ) , org.springframework.data.cassandra.config.CassandraAdminOperations ( ) ) ; org.springframework.data.cassandra.config.CassandraPersistentEntitySchemaDropper . dropTables ( boolean ) ; org.springframework.data.cassandra.config.CassandraPersistentEntitySchemaDropper . dropUserTypes ( boolean ) ; } org.springframework.data.cassandra.config.CassandraPersistentEntitySchemaCreator . createUserTypes ( boolean ) ; org.springframework.data.cassandra.config.CassandraPersistentEntitySchemaCreator . createTables ( boolean ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.cassandra.config.CassandraAdminOperations org.springframework.data.cassandra.config.CassandraAdminOperations ( ) { return this . org.springframework.data.cassandra.config.CassandraAdminOperations ; }  <METHOD_END>
