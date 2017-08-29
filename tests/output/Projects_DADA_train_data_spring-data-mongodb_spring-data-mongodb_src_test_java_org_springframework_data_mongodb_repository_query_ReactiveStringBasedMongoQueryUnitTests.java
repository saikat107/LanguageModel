<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.mongodb.repository.query.MongoConverter = new MappingMongoConverter ( org.springframework.data.mongodb.repository.query.DbRefResolver , new MongoMappingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , java.lang.String .class ) ; ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , STRING ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = new BasicQuery ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , Address .class ) ; Address org.springframework.data.mongodb.repository.query.Address = new Address ( STRING , STRING , STRING ) ; ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , org.springframework.data.mongodb.repository.query.Address ) ; Document org.springframework.data.mongodb.repository.query.Document = new Document ( ) ; org.springframework.data.mongodb.repository.query.MongoConverter . write ( org.springframework.data.mongodb.repository.query.Address , org.springframework.data.mongodb.repository.query.Document ) ; org.springframework.data.mongodb.repository.query.Document . remove ( DefaultMongoTypeMapper . DEFAULT_TYPE_KEY ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; Document org.springframework.data.mongodb.repository.query.Document = new Document ( STRING , org.springframework.data.mongodb.repository.query.Document ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = new BasicQuery ( org.springframework.data.mongodb.repository.query.Document ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) , is ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , java.lang.String .class ) ; assertThat ( org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . isDeleteQuery ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , new Document ( STRING , STRING ) . append ( STRING , STRING ) , java.util.Collections . java.util.Map<java.lang.String,java.lang.Integer> ( STRING , NUMBER ) ) ; ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , Document .class , java.util.Map .class ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( new BasicQuery ( STRING ) . getQueryObject ( ) ) ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getFieldsObject ( ) , is ( new BasicQuery ( null , STRING ) . getFieldsObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , NUMBER , NUMBER , NUMBER , NUMBER ) ; ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , int .class , int .class , int .class , int .class ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( new BasicQuery ( STRING ) . getQueryObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , java.lang.String .class , java.lang.String .class ) ; ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , STRING , STRING ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( new Document ( ) . append ( STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , STRING ) ; ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , java.lang.String .class ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = new BasicQuery ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , true , STRING , STRING ) ; ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , boolean .class , java.lang.String .class ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = new BasicQuery ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , true , STRING , STRING ) ; ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , boolean .class , java.lang.String .class , java.lang.String .class ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = new BasicQuery ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( STRING ) ; ConvertingParameterAccessor org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor = StubParameterAccessor . getAccessor ( org.springframework.data.mongodb.repository.query.MongoConverter , byte[] ) ; ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( STRING , byte [] .class ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery . createQuery ( org.springframework.data.mongodb.repository.query.ConvertingParameterAccessor ) ; org . springframework . data . mongodb . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core . org.springframework.data.mongodb.core org.springframework.data.mongodb.core.query.Query = new BasicQuery ( STRING + javax.xml.bind.DatatypeConverter . java.lang.String ( byte[] ) + STRING + BSON . B_GENERAL + STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) , is ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQuery ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; ProjectionFactory org.springframework.data.mongodb.repository.query.ProjectionFactory = new SpelAwareProxyProjectionFactory ( ) ; ReactiveMongoQueryMethod org.springframework.data.mongodb.repository.query.ReactiveMongoQueryMethod = new ReactiveMongoQueryMethod ( java.lang.reflect.Method , new DefaultRepositoryMetadata ( org.springframework.data.mongodb.repository.query.ReactiveStringBasedMongoQueryUnitTests.SampleRepository .class ) , org.springframework.data.mongodb.repository.query.ProjectionFactory , org.springframework.data.mongodb.repository.query.MongoConverter . getMappingContext ( ) ) ; return new ReactiveStringBasedMongoQuery ( org.springframework.data.mongodb.repository.query.ReactiveMongoQueryMethod , org.springframework.data.mongodb.repository.query.ReactiveMongoOperations , org.springframework.data.mongodb.repository.query.SpelExpressionParser , DefaultEvaluationContextProvider . INSTANCE ) ; }  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Person> < Person > org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Person> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Person> < Person > org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Person> ( byte [] byte[] );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Person> < Person > org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Person> ( Address org.springframework.data.mongodb.repository.query.Address );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , delete = true ) org.springframework.data.mongodb.repository.query.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.mongodb.repository.query.Mono<java.lang.Void> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , delete = true , count = true ) org.springframework.data.mongodb.repository.query.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.mongodb.repository.query.Mono<java.lang.Void> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , fields = STRING ) org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Document> < Document > org.springframework.data.mongodb.repository.query.Mono<org.springframework.data.mongodb.repository.query.Document> ( Document org.springframework.data.mongodb.repository.query.Document , java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Document> < Document > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Document> ( int int , int int , int int , int int );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Mono<java.lang.Object> < java.lang.Object > org.springframework.data.mongodb.repository.query.Mono<java.lang.Object> ( java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Person> < Person > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Person> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Person> < Person > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Person> ( boolean boolean , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Person> < Person > org.springframework.data.mongodb.repository.query.Flux<org.springframework.data.mongodb.repository.query.Person> ( boolean boolean , java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
