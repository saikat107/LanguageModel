<METHOD_START> public void ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { super( java.lang.Class<> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.repository.support.RepositoryFactorySupport org.springframework.data.cassandra.repository.support.RepositoryFactorySupport ( ) { return new CassandraRepositoryFactory ( org.springframework.data.cassandra.repository.support.CassandraTemplate ) ; }  <METHOD_END>
<METHOD_START> public void void ( CassandraTemplate org.springframework.data.cassandra.repository.support.CassandraTemplate ) { this . org.springframework.data.cassandra.repository.support.CassandraTemplate = org.springframework.data.cassandra.repository.support.CassandraTemplate ; setMappingContext ( org.springframework.data.cassandra.repository.support.CassandraTemplate . getConverter ( ) . getMappingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { super. afterPropertiesSet ( ) ; Assert . notNull ( org.springframework.data.cassandra.repository.support.CassandraTemplate , STRING ) ; }  <METHOD_END>
