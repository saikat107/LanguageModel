<METHOD_START> @ Before public void void ( ) { org.springframework.data.neo4j.repositories.support.Neo4jRepositoryFactory = new Neo4jRepositoryFactory ( org.neo4j.ogm.session.Session ) {		} ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNotNull ( org.springframework.data.neo4j.repositories.support.Neo4jRepositoryFactory . getRepository ( org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository = org.springframework.data.neo4j.repositories.support.Neo4jRepositoryFactory . getRepository ( org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository .class ) ; org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository . int ( ) ; org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository . java.lang.String ( ) ; org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository . boolean ( org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.neo4j.repositories.support.Neo4jRepositoryFactory . setRepositoryBaseClass ( org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.CustomNeo4jRepository .class ) ; org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository = org.springframework.data.neo4j.repositories.support.Neo4jRepositoryFactory . getRepository ( org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository .class ) ; assertEquals ( org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.CustomNeo4jRepository .class , ( ( Advised ) org.springframework.data.neo4j.repositories.support.GraphRepositoryFactoryTests.ObjectRepository ) . getTargetClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Transactional java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<T> < T > java.lang.Class<T> , Session org.springframework.data.neo4j.repositories.support.Session ) { super( java.lang.Class<T> , org.springframework.data.neo4j.repositories.support.Session ); }  <METHOD_END>