<METHOD_START> public void ( Session org.springframework.data.neo4j.repository.query.Session ) { this . org.springframework.data.neo4j.repository.query.Session = org.springframework.data.neo4j.repository.query.Session ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.neo4j.repository.query.RepositoryQuery org.springframework.data.neo4j.repository.query.RepositoryQuery ( java.lang.reflect.Method java.lang.reflect.Method , RepositoryMetadata org.springframework.data.neo4j.repository.query.RepositoryMetadata , ProjectionFactory org.springframework.data.neo4j.repository.query.ProjectionFactory , NamedQueries org.springframework.data.neo4j.repository.query.NamedQueries ) { GraphQueryMethod org.springframework.data.neo4j.repository.query.GraphQueryMethod = new GraphQueryMethod ( java.lang.reflect.Method , org.springframework.data.neo4j.repository.query.RepositoryMetadata , org.springframework.data.neo4j.repository.query.ProjectionFactory ) ; java.lang.String java.lang.String = org.springframework.data.neo4j.repository.query.GraphQueryMethod . getNamedQueryName ( ) ; if ( org.springframework.data.neo4j.repository.query.NamedQueries . hasQuery ( java.lang.String ) ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; } else if ( org.springframework.data.neo4j.repository.query.GraphQueryMethod . hasAnnotatedQuery ( ) ) { return new GraphRepositoryQuery ( org.springframework.data.neo4j.repository.query.GraphQueryMethod , org.springframework.data.neo4j.repository.query.Session ) ; } else { return new DerivedGraphRepositoryQuery ( org.springframework.data.neo4j.repository.query.GraphQueryMethod , org.springframework.data.neo4j.repository.query.Session ) ; } }  <METHOD_END>
