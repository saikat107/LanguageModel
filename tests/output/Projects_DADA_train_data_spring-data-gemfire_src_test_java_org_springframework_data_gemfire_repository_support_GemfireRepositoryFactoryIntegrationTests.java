<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.repository.support.PersonRepository org.springframework.data.gemfire.repository.support.PersonRepository ( Regions org.springframework.data.gemfire.repository.support.Regions ) { return new GemfireRepositoryFactory ( org.springframework.data.gemfire.repository.support.Regions , org.springframework.data.gemfire.repository.support.GemfireMappingContext ) . getRepository ( PersonRepository .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { new GemfireRepositoryFactory ( java.util.Collections . java.util.Set<java.lang.Object> ( ) , org.springframework.data.gemfire.repository.support.GemfireMappingContext ) . getRepository ( PersonRepository .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Repositories org.springframework.data.gemfire.repository.support.Repositories = new Repositories ( org.springframework.data.gemfire.repository.support.ApplicationContext ) ; PersistentEntity < ? , ? > org.springframework.data.gemfire.repository.support.PersistentEntity<?,?> = org.springframework.data.gemfire.repository.support.Repositories . getPersistentEntity ( Person .class ) ; assertThat ( org.springframework.data.gemfire.repository.support.PersistentEntity<,> , is ( notNullValue ( ) ) ) ; }  <METHOD_END>