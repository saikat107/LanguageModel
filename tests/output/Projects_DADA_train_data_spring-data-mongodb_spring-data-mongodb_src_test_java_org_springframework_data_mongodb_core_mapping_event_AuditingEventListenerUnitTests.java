<METHOD_START> @ Before public void void ( ) { MongoMappingContext org.springframework.data.mongodb.core.mapping.event.MongoMappingContext = new MongoMappingContext ( ) ; org.springframework.data.mongodb.core.mapping.event.MongoMappingContext . getPersistentEntity ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample .class ) ; org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler = spy ( new IsNewAwareAuditingHandler ( new PersistentEntities ( java.util.Arrays . java.util.List ( org.springframework.data.mongodb.core.mapping.event.MongoMappingContext ) ) ) ) ; doNothing ( ) . when ( org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler ) . markCreated ( any ( ) ) ; doNothing ( ) . when ( org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler ) . markModified ( any ( ) ) ; org.springframework.data.mongodb.core.mapping.event.AuditingEventListener = new AuditingEventListener ( ( ) handler ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new AuditingEventListener ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample = new org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample ( ) ; org.springframework.data.mongodb.core.mapping.event.AuditingEventListener . onApplicationEvent ( new BeforeConvertEvent < java.lang.Object > ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample , STRING ) ) ; verify ( org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler , times ( NUMBER ) ) . markCreated ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample ) ; verify ( org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler , times ( NUMBER ) ) . markModified ( any ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample = new org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample ( ) ; org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample . java.lang.String = STRING ; org.springframework.data.mongodb.core.mapping.event.AuditingEventListener . onApplicationEvent ( new BeforeConvertEvent < java.lang.Object > ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample , STRING ) ) ; verify ( org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler , times ( NUMBER ) ) . markCreated ( any ( ) ) ; verify ( org.springframework.data.mongodb.core.mapping.event.IsNewAwareAuditingHandler , times ( NUMBER ) ) . markModified ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListenerUnitTests.Sample ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListener , is ( instanceOf ( Ordered .class ) ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.event.AuditingEventListener . getOrder ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
