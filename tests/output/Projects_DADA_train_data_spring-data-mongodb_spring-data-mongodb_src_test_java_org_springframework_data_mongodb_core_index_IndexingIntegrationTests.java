<METHOD_START> @ After public void void ( ) { org.springframework.data.mongodb.core.index.MongoOperations . dropCollection ( org.springframework.data.mongodb.core.index.IndexingIntegrationTests.IndexedPerson .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) { org.springframework.data.mongodb.core.index.MongoOperations . getConverter ( ) . getMappingContext ( ) . getPersistentEntity ( org.springframework.data.mongodb.core.index.IndexingIntegrationTests.IndexedPerson .class ) ; assertThat ( boolean ( STRING , org.springframework.data.mongodb.core.index.IndexingIntegrationTests.IndexedPerson .class ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) { org.springframework.data.mongodb.core.index.MongoOperations . getConverter ( ) . getMappingContext ( ) . getPersistentEntity ( org.springframework.data.mongodb.core.index.IndexingIntegrationTests.IndexedPerson .class ) ; assertThat ( boolean ( STRING , org.springframework.data.mongodb.core.index.IndexingIntegrationTests.IndexedPerson .class ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( final java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.mongodb.core.index.MongoOperations . execute ( java.lang.Class<> , new CollectionCallback < java.lang.Boolean > ( ) { public java.lang.Boolean java.lang.Boolean ( MongoCollection < org . org.bson . org.bson > org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> )					throws org.springframework.data.mongodb.core.index.MongoException , org.springframework.data.mongodb.core.index.DataAccessException { java.util.List<org.bson.Document> < org . org.bson . org.bson > java.util.List<org.bson.Document> = new java.util.ArrayList<org.bson.Document> < org . org.bson . org.bson > ( ) ; org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> . listIndexes ( org . org.bson . org.bson .class ) . into ( java.util.List<org.bson.Document> ) ; for ( org . org.bson . org.bson org.bson.Document : java.util.List<org.bson.Document> ) { if ( java.lang.String . boolean ( org.bson.Document . get ( STRING ) ) ) { return true ; } } return false ; } } ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Boolean java.lang.Boolean ( MongoCollection < org . org.bson . org.bson > org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> )					throws org.springframework.data.mongodb.core.index.MongoException , org.springframework.data.mongodb.core.index.DataAccessException { java.util.List<org.bson.Document> < org . org.bson . org.bson > java.util.List<org.bson.Document> = new java.util.ArrayList<org.bson.Document> < org . org.bson . org.bson > ( ) ; org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> . listIndexes ( org . org.bson . org.bson .class ) . into ( java.util.List<org.bson.Document> ) ; for ( org . org.bson . org.bson org.bson.Document : java.util.List<org.bson.Document> ) { if ( java.lang.String . boolean ( org.bson.Document . get ( STRING ) ) ) { return true ; } } return false ; }  <METHOD_END>
