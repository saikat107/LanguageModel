<METHOD_START> @ Test public void void ( ) { MongoMappingEvent < Person > org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Person> = new BeforeConvertEvent < Person > ( new Person ( STRING , STRING ) , STRING ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Person> ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AbstractApplicationContext org.springframework.data.mongodb.core.mapping.event.AbstractApplicationContext = new ClassPathXmlApplicationContext ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractApplicationContext . refresh ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractApplicationContext . addApplicationListener ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ) ; org.springframework.data.mongodb.core.mapping.event.AbstractApplicationContext . publishEvent ( new BeforeConvertEvent < Person > ( new Person ( STRING , STRING ) , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( true ) ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean = false ; org.springframework.data.mongodb.core.mapping.event.AbstractApplicationContext . publishEvent ( new BeforeConvertEvent < java.lang.String > ( STRING , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( false ) ) ; org.springframework.data.mongodb.core.mapping.event.AbstractApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( new AfterLoadEvent < Person > ( new Document ( ) , Person .class , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleAccountEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleAccountEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleAccountEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( new AfterLoadEvent < Person > ( new Document ( ) , Person .class , STRING ) ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleAccountEventListener . onApplicationEvent ( new AfterLoadEvent < Person > ( new Document ( ) , Person .class , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleAccountEventListener . boolean , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( new AfterLoadEvent < Person > ( new Document ( ) , Person .class , STRING ) ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener . onApplicationEvent ( new AfterLoadEvent < Person > ( new Document ( ) , Person .class , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener . boolean , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( new AfterLoadEvent < Contact > ( new Document ( ) , Contact .class , STRING ) ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener . onApplicationEvent ( new AfterLoadEvent < Contact > ( new Document ( ) , Contact .class , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( false ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener . boolean , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.UntypedEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.UntypedEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.UntypedEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.UntypedEventListener . onApplicationEvent ( new MongoMappingEvent ( new java.lang.Object ( ) , new Document ( ) , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingEvent < Document > org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> = new BeforeDeleteEvent < Person > ( new Document ( ) , Person .class , STRING ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener . onApplicationEvent ( org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SampleContactEventListener . boolean , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingEvent < Document > org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> = new BeforeDeleteEvent < Person > ( new Document ( ) , Person .class , STRING ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingEvent < Document > org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> = new BeforeDeleteEvent < Account > ( new Document ( ) , Account .class , STRING ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoMappingEvent < Document > org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> = new BeforeDeleteEvent < Account > ( new Document ( ) , null , STRING ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener = new org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener ( ) ; org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . onApplicationEvent ( org.springframework.data.mongodb.core.mapping.event.MongoMappingEvent<org.springframework.data.mongodb.core.mapping.event.Document> ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListenerUnitTests.SamplePersonEventListener . boolean , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeforeConvertEvent < Person > org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent<org.springframework.data.mongodb.core.mapping.event.Person> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AfterLoadEvent < Person > org.springframework.data.mongodb.core.mapping.event.AfterLoadEvent<org.springframework.data.mongodb.core.mapping.event.Person> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AfterDeleteEvent < Person > org.springframework.data.mongodb.core.mapping.event.AfterDeleteEvent<org.springframework.data.mongodb.core.mapping.event.Person> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeforeDeleteEvent < Person > org.springframework.data.mongodb.core.mapping.event.BeforeDeleteEvent<org.springframework.data.mongodb.core.mapping.event.Person> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeforeConvertEvent < Contact > org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent<org.springframework.data.mongodb.core.mapping.event.Contact> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AfterLoadEvent < Contact > org.springframework.data.mongodb.core.mapping.event.AfterLoadEvent<org.springframework.data.mongodb.core.mapping.event.Contact> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AfterDeleteEvent < Contact > org.springframework.data.mongodb.core.mapping.event.AfterDeleteEvent<org.springframework.data.mongodb.core.mapping.event.Contact> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeforeDeleteEvent < Contact > org.springframework.data.mongodb.core.mapping.event.BeforeDeleteEvent<org.springframework.data.mongodb.core.mapping.event.Contact> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeforeConvertEvent < Account > org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent<org.springframework.data.mongodb.core.mapping.event.Account> ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AfterLoadEvent < Account > org.springframework.data.mongodb.core.mapping.event.AfterLoadEvent<org.springframework.data.mongodb.core.mapping.event.Account> ) { boolean = true ; }  <METHOD_END>
