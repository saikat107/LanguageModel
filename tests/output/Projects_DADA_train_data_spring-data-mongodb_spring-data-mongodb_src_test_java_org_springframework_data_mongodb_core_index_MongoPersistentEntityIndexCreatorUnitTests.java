<METHOD_START> @ Before public void void ( ) { org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> = ArgumentCaptor . forClass ( org . org.bson . org.bson .class ) ; org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> = ArgumentCaptor . forClass ( IndexOptions .class ) ; org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> = ArgumentCaptor . forClass ( java.lang.String .class ) ; when ( org.springframework.data.mongodb.core.index.MongoDbFactory . getDb ( ) ) . thenReturn ( org.springframework.data.mongodb.core.index.MongoDatabase ) ; when ( org.springframework.data.mongodb.core.index.MongoDbFactory . getExceptionTranslator ( ) ) . thenReturn ( new MongoExceptionTranslator ( ) ) ; when ( org.springframework.data.mongodb.core.index.MongoDatabase . getCollection ( org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> . capture ( ) ) ) . thenReturn ( org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> ) ; org.springframework.data.mongodb.core.index.MongoTemplate = new MongoTemplate ( org.springframework.data.mongodb.core.index.MongoDbFactory ) ; when ( org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> . createIndex ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . capture ( ) , org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . capture ( ) ) ) . thenReturn ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Person .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) . keySet ( ) , hasItem ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . isBackground ( ) , is ( false ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . getExpireAfter ( java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = new MongoMappingContext ( ) ; MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Person .class ) ; MongoPersistentEntityIndexCreator org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator = new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; MongoPersistentEntity < ? > org.springframework.data.mongodb.core.index.MongoPersistentEntity<?> = org.springframework.data.mongodb.core.index.MongoMappingContext . getRequiredPersistentEntity ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Person .class ) ; MappingContextEvent < MongoPersistentEntity < ? > , MongoPersistentProperty > org.springframework.data.mongodb.core.index.MappingContextEvent<org.springframework.data.mongodb.core.index.MongoPersistentEntity<?>,org.springframework.data.mongodb.core.index.MongoPersistentProperty> = new MappingContextEvent < MongoPersistentEntity < ? > , MongoPersistentProperty > ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoPersistentEntity<> ) ; org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator . onApplicationEvent ( org.springframework.data.mongodb.core.index.MappingContextEvent<org.springframework.data.mongodb.core.index.MongoPersistentEntity<?>,org.springframework.data.mongodb.core.index.MongoPersistentProperty> ) ; verifyZeroInteractions ( org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = new MongoMappingContext ( ) ; org.springframework.data.mongodb.core.index.MongoMappingContext . initialize ( ) ; MongoPersistentEntityIndexCreator org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator = new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; assertThat ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator . isIndexCreatorFor ( org.springframework.data.mongodb.core.index.MongoMappingContext ) , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreator . isIndexCreatorFor ( new MongoMappingContext ( ) ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.AnotherPerson .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) . keySet ( ) , hasItem ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . getName ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . isBackground ( ) , IsEqual .< java.lang.Object > equalTo ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . getExpireAfter ( java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Milk .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) . keySet ( ) , hasItem ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . getExpireAfter ( java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) , IsEqual .< java.lang.Object > equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Wrapper .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) , equalTo ( new org . org.bson . org.bson ( ) . append ( STRING , STRING ) ) ) ; IndexOptions org.springframework.data.mongodb.core.index.IndexOptions = org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) ; assertThat ( org.springframework.data.mongodb.core.index.IndexOptions . getName ( ) , is ( equalTo ( STRING ) ) ) ; assertThat ( org.springframework.data.mongodb.core.index.IndexOptions . getMin ( ) , IsCloseTo . closeTo ( - NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.core.index.IndexOptions . getMax ( ) , IsCloseTo . closeTo ( NUMBER , NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.core.index.IndexOptions . getBits ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.EntityWithGeneratedIndexName .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) . containsKey ( STRING ) , is ( false ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.bson.Document> . getValue ( ) . keySet ( ) , hasItem ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<org.springframework.data.mongodb.core.index.IndexOptions> . getValue ( ) . getName ( ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Wrapper .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; ArgumentCaptor < java.lang.String > org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> = ArgumentCaptor . forClass ( java.lang.String .class ) ; verify ( org.springframework.data.mongodb.core.index.MongoDatabase , times ( NUMBER ) ) . getCollection ( org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> . capture ( ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> . getValue ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.IndexedDocumentWrapper .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; ArgumentCaptor < java.lang.String > org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> = ArgumentCaptor . forClass ( java.lang.String .class ) ; verify ( org.springframework.data.mongodb.core.index.MongoDatabase , times ( NUMBER ) ) . getCollection ( org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> . capture ( ) ) ; assertThat ( org.springframework.data.mongodb.core.index.ArgumentCaptor<java.lang.String> . getValue ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = DataAccessException .class ) public void void ( ) { when ( org.springframework.data.mongodb.core.index.MongoDbFactory . getExceptionTranslator ( ) ) . thenReturn ( new MongoExceptionTranslator ( ) ) ; doThrow ( new MongoException ( NUMBER , STRING ) ) . when ( org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> ) . createIndex ( Mockito . any ( org . org.bson . org.bson .class ) , Mockito . any ( IndexOptions .class ) ) ; MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Person .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.ClassCastException .class ) public void void ( ) { when ( org.springframework.data.mongodb.core.index.MongoDbFactory . getExceptionTranslator ( ) ) . thenReturn ( new MongoExceptionTranslator ( ) ) ; doThrow ( new java.lang.ClassCastException ( STRING ) ) . when ( org.springframework.data.mongodb.core.index.MongoCollection<org.bson.Document> ) . createIndex ( Mockito . any ( org . org.bson . org.bson .class ) , Mockito . any ( IndexOptions .class ) ) ; MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = org.springframework.data.mongodb.core.index.MongoMappingContext ( org.springframework.data.mongodb.core.index.MongoPersistentEntityIndexCreatorUnitTests.Person .class ) ; new MongoPersistentEntityIndexCreator ( org.springframework.data.mongodb.core.index.MongoMappingContext , org.springframework.data.mongodb.core.index.MongoTemplate ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.index.MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext ( java.lang.Class<?> < ? > java.lang.Class<?> ) { MongoMappingContext org.springframework.data.mongodb.core.index.MongoMappingContext = new MongoMappingContext ( ) ; org.springframework.data.mongodb.core.index.MongoMappingContext . setInitialEntitySet ( java.util.Collections . java.util.Set<java.lang.Class<>> ( java.lang.Class<> ) ) ; org.springframework.data.mongodb.core.index.MongoMappingContext . initialize ( ) ; return org.springframework.data.mongodb.core.index.MongoMappingContext ; }  <METHOD_END>
