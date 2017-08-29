<METHOD_START> protected org.springframework.integration.mongodb.rules.MongoDbFactory org.springframework.integration.mongodb.rules.MongoDbFactory ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { MongoDbFactory org.springframework.integration.mongodb.rules.MongoDbFactory = new SimpleMongoDbFactory ( new MongoClient ( ) , STRING ) ; void ( org.springframework.integration.mongodb.rules.MongoDbFactory , java.lang.String[] ) ; return org.springframework.integration.mongodb.rules.MongoDbFactory ; }  <METHOD_END>
<METHOD_START> protected void void ( MongoDbFactory org.springframework.integration.mongodb.rules.MongoDbFactory , java.lang.String ... java.lang.String[] ) { MongoTemplate org.springframework.integration.mongodb.rules.MongoTemplate = new MongoTemplate ( org.springframework.integration.mongodb.rules.MongoDbFactory ) ; org.springframework.integration.mongodb.rules.MongoTemplate . dropCollection ( STRING ) ; org.springframework.integration.mongodb.rules.MongoTemplate . dropCollection ( STRING ) ; org.springframework.integration.mongodb.rules.MongoTemplate . dropCollection ( STRING ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { org.springframework.integration.mongodb.rules.MongoTemplate . dropCollection ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person ( ) { org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address = new org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ( ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address . void ( STRING ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address . void ( STRING ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address . void ( STRING ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person = new org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person ( ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person . void ( org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person . void ( STRING ) ; return org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person ( java.lang.String java.lang.String ) { org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address = new org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ( ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address . void ( STRING ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address . void ( STRING ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address . void ( STRING ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person = new org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person ( ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person . void ( org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ) ; org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person . void ( java.lang.String ) ; return org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Person ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ( ) { return org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ) { this . org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address = org.springframework.integration.mongodb.rules.MongoDbAvailableTests.Address ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.rules.MongoDbFactory , MappingContext < ? extends MongoPersistentEntity < ? > , MongoPersistentProperty > org.springframework.integration.mongodb.rules.MappingContext<? extends org.springframework.integration.mongodb.rules.MongoPersistentEntity<?>,org.springframework.integration.mongodb.rules.MongoPersistentProperty> ) { super( new DefaultDbRefResolver ( org.springframework.integration.mongodb.rules.MongoDbFactory ) , org.springframework.integration.mongodb.rules.MappingContext<,org.springframework.integration.mongodb.rules.MongoPersistentProperty> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Bson org.springframework.integration.mongodb.rules.Bson ) { super. write ( java.lang.Object , org.springframework.integration.mongodb.rules.Bson ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S > S S ( java.lang.Class<S> < S > java.lang.Class<S> , Bson org.springframework.integration.mongodb.rules.Bson ) { return super. read ( java.lang.Class<S> , org.springframework.integration.mongodb.rules.Bson ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Long java.lang.Long ( MongoCollection < Document > org.springframework.integration.mongodb.rules.MongoCollection<org.springframework.integration.mongodb.rules.Document> ) throws org.springframework.integration.mongodb.rules.MongoException , org.springframework.integration.mongodb.rules.DataAccessException { return org.springframework.integration.mongodb.rules.MongoCollection<org.springframework.integration.mongodb.rules.Document> . count ( ) ; }  <METHOD_END>
