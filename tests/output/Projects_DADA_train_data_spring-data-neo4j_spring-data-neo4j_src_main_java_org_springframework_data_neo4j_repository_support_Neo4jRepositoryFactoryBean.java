<METHOD_START> public void ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { super( java.lang.Class<> ); }  <METHOD_END>
<METHOD_START> @ Autowired public void void ( Session org.springframework.data.neo4j.repository.support.Session ) { this . org.springframework.data.neo4j.repository.support.Session = org.springframework.data.neo4j.repository.support.Session ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MappingContext < ? , ? > org.springframework.data.neo4j.repository.support.MappingContext<?,?> ) { super. setMappingContext ( org.springframework.data.neo4j.repository.support.MappingContext<,> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { Assert . notNull ( org.springframework.data.neo4j.repository.support.Session , STRING ) ; super. afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.neo4j.repository.support.RepositoryFactorySupport org.springframework.data.neo4j.repository.support.RepositoryFactorySupport ( ) { return org.springframework.data.neo4j.repository.support.RepositoryFactorySupport ( org.springframework.data.neo4j.repository.support.Session ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.neo4j.repository.support.RepositoryFactorySupport org.springframework.data.neo4j.repository.support.RepositoryFactorySupport ( Session org.springframework.data.neo4j.repository.support.Session ) { return new Neo4jRepositoryFactory ( org.springframework.data.neo4j.repository.support.Session ) ; }  <METHOD_END>
