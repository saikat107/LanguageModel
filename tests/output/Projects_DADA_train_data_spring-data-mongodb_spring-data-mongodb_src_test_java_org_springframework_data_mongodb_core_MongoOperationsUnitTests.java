<METHOD_START> @ Before public final void void ( ) { org.springframework.data.mongodb.core.Person = new Person ( STRING ) ; java.util.List<org.springframework.data.mongodb.core.Person> = java.util.Arrays . java.util.List ( org.springframework.data.mongodb.core.Person ) ; org.springframework.data.mongodb.core.MongoConverter = new AbstractMongoConverter ( null ) { public void void ( java.lang.Object java.lang.Object , Bson org.springframework.data.mongodb.core.Bson ) { ( ( Document ) org.springframework.data.mongodb.core.Bson ) . put ( STRING , org.springframework.data.mongodb.core.Person . getFirstName ( ) ) ; } @ java.lang.SuppressWarnings ( STRING ) public < S extends java.lang.Object > S S ( java.lang.Class<S> < S > java.lang.Class<S> , Bson org.springframework.data.mongodb.core.Bson ) { return ( S ) org.springframework.data.mongodb.core.Person ; } public org.springframework.data.mongodb.core.MappingContext<? extends org.springframework.data.mongodb.core.MongoPersistentEntity<?>,org.springframework.data.mongodb.core.MongoPersistentProperty> < ? extends MongoPersistentEntity < ? > , MongoPersistentProperty > org.springframework.data.mongodb.core.MappingContext<? extends org.springframework.data.mongodb.core.MongoPersistentEntity<?>,org.springframework.data.mongodb.core.MongoPersistentProperty> ( ) { return null ; } public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeInformation < ? > org.springframework.data.mongodb.core.TypeInformation<?> ) { return null ; } public org.springframework.data.mongodb.core.DBRef org.springframework.data.mongodb.core.DBRef ( java.lang.Object java.lang.Object , MongoPersistentProperty org.springframework.data.mongodb.core.MongoPersistentProperty ) { return null ; } @ java.lang.Override public org.springframework.data.mongodb.core.MongoTypeMapper org.springframework.data.mongodb.core.MongoTypeMapper ( ) { return null ; } } ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object , Bson org.springframework.data.mongodb.core.Bson ) { ( ( Document ) org.springframework.data.mongodb.core.Bson ) . put ( STRING , org.springframework.data.mongodb.core.Person . getFirstName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < S extends java.lang.Object > S S ( java.lang.Class<S> < S > java.lang.Class<S> , Bson org.springframework.data.mongodb.core.Bson ) { return ( S ) org.springframework.data.mongodb.core.Person ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.MappingContext<? extends org.springframework.data.mongodb.core.MongoPersistentEntity<?>,org.springframework.data.mongodb.core.MongoPersistentProperty> < ? extends MongoPersistentEntity < ? > , MongoPersistentProperty > org.springframework.data.mongodb.core.MappingContext<? extends org.springframework.data.mongodb.core.MongoPersistentEntity<?>,org.springframework.data.mongodb.core.MongoPersistentProperty> ( ) { return null ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeInformation < ? > org.springframework.data.mongodb.core.TypeInformation<?> ) { return null ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.core.DBRef org.springframework.data.mongodb.core.DBRef ( java.lang.Object java.lang.Object , MongoPersistentProperty org.springframework.data.mongodb.core.MongoPersistentProperty ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.MongoTypeMapper org.springframework.data.mongodb.core.MongoTypeMapper ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { org.springframework.data.mongodb.core.MongoOperations ( ) . execute ( STRING , ( CollectionCallback ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { org.springframework.data.mongodb.core.MongoOperations ( ) . execute ( STRING , ( CollectionCallback ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { org.springframework.data.mongodb.core.MongoOperations ( ) . execute ( ( DbCallback ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . collectionExists ( STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . collectionExists ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . createCollection ( STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . createCollection ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . createCollection ( STRING , new CollectionOptions ( NUMBER , NUMBER , true ) ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . createCollection ( STRING , new CollectionOptions ( NUMBER , NUMBER , true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . dropCollection ( STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . dropCollection ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . execute ( STRING , org.springframework.data.mongodb.core.CollectionCallback<java.lang.Object> ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . execute ( STRING , org.springframework.data.mongodb.core.CollectionCallback<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . execute ( org.springframework.data.mongodb.core.DbCallback<java.lang.Object> ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . execute ( org.springframework.data.mongodb.core.DbCallback<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . execute ( STRING , org.springframework.data.mongodb.core.CollectionCallback<java.lang.Object> ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . execute ( STRING , org.springframework.data.mongodb.core.CollectionCallback<java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . executeCommand ( new Document ( ) ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . executeCommand ( new Document ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . executeCommand ( STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . executeCommand ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . findAll ( java.lang.Object .class ) ; } } . void ( java.lang.IllegalArgumentException .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . findAll ( java.lang.Object .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . getCollection ( STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . getCollection ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . findAll ( java.lang.Object .class , STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . findAll ( java.lang.Object .class , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . findAll ( java.lang.Object .class , STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . findAll ( java.lang.Object .class , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . getCollectionNames ( ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . getCollectionNames ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insert ( org.springframework.data.mongodb.core.Person ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insert ( org.springframework.data.mongodb.core.Person ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insert ( org.springframework.data.mongodb.core.Person , STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insert ( org.springframework.data.mongodb.core.Person , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insertAll ( java.util.List<org.springframework.data.mongodb.core.Person> ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insertAll ( java.util.List<org.springframework.data.mongodb.core.Person> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insert ( java.util.List<org.springframework.data.mongodb.core.Person> , STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . insert ( java.util.List<org.springframework.data.mongodb.core.Person> , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( null , Person .class ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( null , Person .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( null , Person .class , STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( null , Person .class , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final NearQuery org.springframework.data.mongodb.core.NearQuery = NearQuery . near ( new Point ( NUMBER , NUMBER ) ) ; new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( org.springframework.data.mongodb.core.NearQuery , null ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( org.springframework.data.mongodb.core.NearQuery , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final NearQuery org.springframework.data.mongodb.core.NearQuery = NearQuery . near ( new Point ( NUMBER , NUMBER ) ) ; new org.springframework.data.mongodb.core.MongoOperationsUnitTests.Execution ( ) { @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( org.springframework.data.mongodb.core.NearQuery , null , STRING ) ; } } . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { org.springframework.data.mongodb.core.MongoOperations . geoNear ( org.springframework.data.mongodb.core.NearQuery , null , STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { void ( DataAccessException .class ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<? extends java.lang.Exception> < ? extends java.lang.Exception > java.lang.Class<? extends java.lang.Exception> ) { try { void ( org.springframework.data.mongodb.core.MongoOperations ( ) ) ; fail ( STRING + java.lang.Class<> + STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertTrue ( STRING + java.lang.Class<> + STRING + java.lang.Exception , java.lang.Class<> . boolean ( java.lang.Exception ) ) ; } }  <METHOD_END>
<METHOD_START> public abstract void void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations );  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.mongodb.core.MongoOperations org.springframework.data.mongodb.core.MongoOperations ( )  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.mongodb.core.MongoOperations org.springframework.data.mongodb.core.MongoOperations ( )  <METHOD_END>
