<METHOD_START> public void ( Session org.springframework.data.neo4j.repository.support.Session ) { Assert . notNull ( org.springframework.data.neo4j.repository.support.Session , STRING ) ; this . org.springframework.data.neo4j.repository.support.Session = org.springframework.data.neo4j.repository.support.Session ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { super. setBeanClassLoader ( java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T , ID extends java.io.Serializable > org.springframework.data.neo4j.repository.support.EntityInformation<T,ID> < T , ID > org.springframework.data.neo4j.repository.support.EntityInformation<T,ID> ( java.lang.Class<T> < T > java.lang.Class<T> ) { Assert . notNull ( java.lang.Class<T> , STRING ) ; Assert . notNull ( org.springframework.data.neo4j.repository.support.Session , STRING ) ; return new GraphEntityInformation ( ( ( Neo4jSession ) org.springframework.data.neo4j.repository.support.Session ) . metaData ( ) , java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( RepositoryInformation org.springframework.data.neo4j.repository.support.RepositoryInformation ) { return getTargetRepositoryViaReflection ( org.springframework.data.neo4j.repository.support.RepositoryInformation , org.springframework.data.neo4j.repository.support.RepositoryInformation . getDomainType ( ) , org.springframework.data.neo4j.repository.support.Session ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( RepositoryMetadata org.springframework.data.neo4j.repository.support.RepositoryMetadata ) { return SimpleNeo4jRepository .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Optional<org.springframework.data.neo4j.repository.support.QueryLookupStrategy> < QueryLookupStrategy > java.util.Optional<org.springframework.data.neo4j.repository.support.QueryLookupStrategy> ( QueryLookupStrategy . QueryLookupStrategy QueryLookupStrategy.Key , EvaluationContextProvider org.springframework.data.neo4j.repository.support.EvaluationContextProvider ) { return java.util.Optional . java.util.Optional<T> ( new GraphQueryLookupStrategy ( org.springframework.data.neo4j.repository.support.Session ) ) ; }  <METHOD_END>