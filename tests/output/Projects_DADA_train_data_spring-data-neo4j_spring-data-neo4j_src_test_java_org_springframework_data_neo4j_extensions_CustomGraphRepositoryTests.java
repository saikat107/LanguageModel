<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.data.neo4j.extensions.UserRepository . sharedCustomMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.neo4j.extensions.PlatformTransactionManager org.springframework.data.neo4j.extensions.PlatformTransactionManager ( ) { return new Neo4jTransactionManager ( org.springframework.data.neo4j.extensions.SessionFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.neo4j.extensions.SessionFactory org.springframework.data.neo4j.extensions.SessionFactory ( ) { return new SessionFactory ( getBaseConfiguration ( ) . build ( ) , STRING ) ; }  <METHOD_END>
