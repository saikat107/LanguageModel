<METHOD_START> @ Before public void void ( ) { org.springframework.data.cassandra.mapping.CassandraPersistentEntity<org.springframework.data.cassandra.mapping.CompoundPrimaryKeyUnitTests.TimelineKey> = new BasicCassandraPersistentEntity <> ( ClassTypeInformation . from ( org.springframework.data.cassandra.mapping.CompoundPrimaryKeyUnitTests.TimelineKey .class ) ) ; org.springframework.data.cassandra.mapping.CassandraPersistentEntity<org.springframework.data.cassandra.mapping.CompoundPrimaryKeyUnitTests.Timeline> = new BasicCassandraPersistentEntity <> ( ClassTypeInformation . from ( org.springframework.data.cassandra.mapping.CompoundPrimaryKeyUnitTests.Timeline .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.cassandra.mapping.CompoundPrimaryKeyUnitTests.Timeline .class , STRING ) ; CassandraPersistentProperty org.springframework.data.cassandra.mapping.CassandraPersistentProperty = org.springframework.data.cassandra.mapping.CassandraPersistentProperty ( Property . of ( java.lang.reflect.Field ) ) ; assertThat ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty . isIdProperty ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.cassandra.mapping.CassandraPersistentProperty . isCompositePrimaryKey ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.cassandra.mapping.CassandraPersistentProperty org.springframework.data.cassandra.mapping.CassandraPersistentProperty ( Property org.springframework.data.cassandra.mapping.Property ) { return new BasicCassandraPersistentProperty ( org.springframework.data.cassandra.mapping.Property , org.springframework.data.cassandra.mapping.CassandraPersistentEntity<org.springframework.data.cassandra.mapping.CompoundPrimaryKeyUnitTests.Timeline> , new CassandraSimpleTypeHolder ( ) ) ; }  <METHOD_END>
