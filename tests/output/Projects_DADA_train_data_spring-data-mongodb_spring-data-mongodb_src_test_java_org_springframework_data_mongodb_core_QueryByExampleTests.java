<METHOD_START> @ Before public void void ( ) java.net.UnknownHostException { org.springframework.data.mongodb.core.MongoOperations = new MongoTemplate ( new MongoClient ( ) , STRING ) ; org.springframework.data.mongodb.core.MongoOperations . remove ( new Query ( ) , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.MongoOperations . save ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ; org.springframework.data.mongodb.core.MongoOperations . save ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ; org.springframework.data.mongodb.core.MongoOperations . save ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; Query org.springframework.data.mongodb.core.Query = new Query ( new Criteria ( ) . alike ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasItems ( org.springframework.data.mongodb.core.QueryByExampleTests.Person , org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; Query org.springframework.data.mongodb.core.Query = new Query ( new Criteria ( ) . alike ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasItem ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.MongoOperations . save ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String ; Query org.springframework.data.mongodb.core.Query = new Query ( new Criteria ( ) . alike ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasItem ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; Query org.springframework.data.mongodb.core.Query = new Query ( new Criteria ( ) . alike ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , is ( empty ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; Query org.springframework.data.mongodb.core.Query = new Query ( new Criteria ( ) . alike ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasItems ( org.springframework.data.mongodb.core.QueryByExampleTests.Person , org.springframework.data.mongodb.core.QueryByExampleTests.Person , org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; Query org.springframework.data.mongodb.core.Query = new Query ( new Criteria ( ) . alike ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) . and ( STRING ) . regex ( STRING ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> . int ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.QueryByExampleTests.Person org.springframework.data.mongodb.core.QueryByExampleTests.Person = new org.springframework.data.mongodb.core.QueryByExampleTests.Person ( ) ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; org.springframework.data.mongodb.core.QueryByExampleTests.Person . java.lang.String = STRING ; Query org.springframework.data.mongodb.core.Query = Query . query ( Criteria . byExample ( Example . of ( org.springframework.data.mongodb.core.QueryByExampleTests.Person , ExampleMatcher . matchingAny ( ) ) ) ) ; java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> < org.springframework.data.mongodb.core.QueryByExampleTests.Person > java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> = org.springframework.data.mongodb.core.MongoOperations . find ( org.springframework.data.mongodb.core.Query , org.springframework.data.mongodb.core.QueryByExampleTests.Person .class ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.data.mongodb.core.QueryByExampleTests.Person> , hasItems ( org.springframework.data.mongodb.core.QueryByExampleTests.Person , org.springframework.data.mongodb.core.QueryByExampleTests.Person ) ) ; }  <METHOD_END>
