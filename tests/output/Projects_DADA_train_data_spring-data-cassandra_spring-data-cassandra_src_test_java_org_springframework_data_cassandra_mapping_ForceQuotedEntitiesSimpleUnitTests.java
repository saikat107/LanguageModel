<METHOD_START> @ Test public void void ( ) { BasicCassandraPersistentEntity < org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted > org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted> = new BasicCassandraPersistentEntity <> ( ClassTypeInformation . from ( org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted .class ) ) ; assertThat ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted> . getTableName ( ) . toCql ( ) ) . isEqualTo ( STRING + org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted .class . java.lang.String ( ) + STRING ) ; assertThat ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted> . getTableName ( ) . getUnquoted ( ) ) . isEqualTo ( org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ImplicitTableNameForceQuoted .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BasicCassandraPersistentEntity < org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ExplicitTableNameForceQuoted > org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ExplicitTableNameForceQuoted> = new BasicCassandraPersistentEntity <> ( ClassTypeInformation . from ( org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ExplicitTableNameForceQuoted .class ) ) ; assertThat ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ExplicitTableNameForceQuoted> . getTableName ( ) . toCql ( ) ) . isEqualTo ( STRING + java.lang.String + STRING ) ; assertThat ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.ExplicitTableNameForceQuoted> . getTableName ( ) . getUnquoted ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BasicCassandraPersistentEntity < org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted > org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted> = new BasicCassandraPersistentEntity <> ( ClassTypeInformation . from ( org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted .class ) ) ; assertThat ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted> . getTableName ( ) . toCql ( ) ) . isEqualTo ( org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted .class . java.lang.String ( ) . java.lang.String ( ) ) ; assertThat ( org.springframework.data.cassandra.mapping.BasicCassandraPersistentEntity<org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted> . getTableName ( ) . getUnquoted ( ) ) . isEqualTo ( org.springframework.data.cassandra.mapping.ForceQuotedEntitiesSimpleUnitTests.DefaultTableNameForceQuoted .class . java.lang.String ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
