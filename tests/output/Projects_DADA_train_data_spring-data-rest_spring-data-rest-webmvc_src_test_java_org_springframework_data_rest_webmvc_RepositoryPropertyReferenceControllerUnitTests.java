<METHOD_START> @ Test public void void ( ) java.lang.Exception { KeyValuePersistentEntity < ? , ? > org.springframework.data.rest.webmvc.KeyValuePersistentEntity<?,?> = org.springframework.data.rest.webmvc.KeyValueMappingContext<,> . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Sample .class ) ; ResourceMappings org.springframework.data.rest.webmvc.ResourceMappings = new PersistentEntitiesResourceMappings ( new PersistentEntities ( java.util.Collections . java.util.Set ( org.springframework.data.rest.webmvc.KeyValueMappingContext<,> ) ) ) ; ResourceMetadata org.springframework.data.rest.webmvc.ResourceMetadata = spy ( org.springframework.data.rest.webmvc.ResourceMappings . getMetadataFor ( org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Sample .class ) ) ; when ( org.springframework.data.rest.webmvc.ResourceMetadata . getSupportedHttpMethods ( ) ) . thenReturn ( org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.AllSupportedHttpMethods . org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.AllSupportedHttpMethods ) ; RepositoryPropertyReferenceController org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController = new RepositoryPropertyReferenceController ( org.springframework.data.rest.webmvc.Repositories , org.springframework.data.rest.webmvc.RepositoryInvokerFactory , org.springframework.data.rest.webmvc.PagedResourcesAssembler<java.lang.Object> ) ; org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController . setApplicationEventPublisher ( org.springframework.data.rest.webmvc.ApplicationEventPublisher ) ; doReturn ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . when ( org.springframework.data.rest.webmvc.RepositoryInvokerFactory ) . getInvokerFor ( org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Reference .class ) ; doReturn ( java.util.Optional . java.util.Optional<org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Sample> ( new org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Sample ( ) ) ) . when ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . invokeFindOne ( NUMBER ) ; doReturn ( java.util.Optional . java.util.Optional<org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Reference> ( new org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Reference ( ) ) ) . when ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . invokeFindOne ( STRING ) ; doReturn ( new org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Sample ( ) ) . when ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . invokeSave ( any ( java.lang.Object .class ) ) ; RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = new RootResourceInformation ( org.springframework.data.rest.webmvc.ResourceMetadata , org.springframework.data.rest.webmvc.KeyValuePersistentEntity<,> , org.springframework.data.rest.webmvc.RepositoryInvoker ) ; Resources < java.lang.Object > org.springframework.data.rest.webmvc.Resources<java.lang.Object> = new Resources < java.lang.Object > ( java.util.Collections . java.util.Set<java.lang.Object> ( ) , new Link ( STRING ) ) ; org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController . createPropertyReference ( org.springframework.data.rest.webmvc.RootResourceInformation , HttpMethod . POST , org.springframework.data.rest.webmvc.Resources<java.lang.Object> , NUMBER , STRING ) ; verify ( org.springframework.data.rest.webmvc.RepositoryInvokerFactory ) . getInvokerFor ( org.springframework.data.rest.webmvc.RepositoryPropertyReferenceControllerUnitTests.Reference .class ) ; verify ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . invokeFindOne ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.data.rest.webmvc.HttpMethod> < HttpMethod > java.util.Set<org.springframework.data.rest.webmvc.HttpMethod> ( PersistentProperty < ? > org.springframework.data.rest.webmvc.PersistentProperty<?> ) { return java.util.Set<org.springframework.data.rest.webmvc.HttpMethod> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.data.rest.webmvc.HttpMethod> < HttpMethod > java.util.Set<org.springframework.data.rest.webmvc.HttpMethod> ( ResourceType org.springframework.data.rest.webmvc.ResourceType ) { return java.util.Set<org.springframework.data.rest.webmvc.HttpMethod> ; }  <METHOD_END>