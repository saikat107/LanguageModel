<METHOD_START> @ Test ( expected = HttpRequestMethodNotSupportedException .class ) public void void ( ) java.lang.Exception { org.springframework.data.rest.webmvc.AddressRepository . save ( new Address ( ) ) ; RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Address .class ) ; org.springframework.data.rest.webmvc.RepositoryEntityController . getCollectionResource ( org.springframework.data.rest.webmvc.RootResourceInformation , null , null , null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = HttpRequestMethodNotSupportedException .class ) public void void ( ) java.lang.Exception { RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Address .class ) ; org.springframework.data.rest.webmvc.RepositoryEntityController . postCollectionResource ( org.springframework.data.rest.webmvc.RootResourceInformation , null , null , MediaType . APPLICATION_JSON_VALUE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Order .class ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = PersistentEntityResource . build ( new Order ( new Person ( ) ) , org.springframework.data.rest.webmvc.PersistentEntities . getRequiredPersistentEntity ( Order .class ) ) . build ( ) ; ResponseEntity < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . putItemResource ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource , NUMBER , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , ETag . NO_ETAG , MediaType . APPLICATION_JSON_VALUE ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<> . getHeaders ( ) . getLocation ( ) . toString ( ) , not ( Matchers . endsWith ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResponseEntity < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . headCollectionResource ( getResourceInformation ( Person .class ) , new DefaultedPageable ( null , false ) ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . NO_CONTENT ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = ResourceNotFoundException .class ) public void void ( ) java.lang.Exception { org.springframework.data.rest.webmvc.RepositoryEntityController . headCollectionResource ( getResourceInformation ( CreditCard .class ) , new DefaultedPageable ( null , false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Address org.springframework.data.rest.webmvc.Address = org.springframework.data.rest.webmvc.AddressRepository . save ( new Address ( ) ) ; ResponseEntity < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . headForItemResource ( getResourceInformation ( Address .class ) , address . id , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<> . getStatusCode ( ) ) . isEqualTo ( HttpStatus . NO_CONTENT ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = ResourceNotFoundException .class ) public void void ( ) java.lang.Exception { org.springframework.data.rest.webmvc.RepositoryEntityController . headForItemResource ( getResourceInformation ( CreditCard .class ) , NUMBER , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { HttpEntity < ? > org.springframework.data.rest.webmvc.HttpEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . optionsForCollectionResource ( getResourceInformation ( Address .class ) ) ; assertAllowHeaders ( org.springframework.data.rest.webmvc.HttpEntity<> , OPTIONS ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { HttpEntity < ? > org.springframework.data.rest.webmvc.HttpEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . optionsForCollectionResource ( getResourceInformation ( Person .class ) ) ; assertAllowHeaders ( org.springframework.data.rest.webmvc.HttpEntity<> , GET , POST , HEAD , OPTIONS ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { HttpEntity < ? > org.springframework.data.rest.webmvc.HttpEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . optionsForItemResource ( getResourceInformation ( Person .class ) ) ; assertAllowHeaders ( org.springframework.data.rest.webmvc.HttpEntity<> , GET , PUT , PATCH , DELETE , HEAD , OPTIONS ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ResponseEntity < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> = org.springframework.data.rest.webmvc.RepositoryEntityController . optionsForItemResource ( getResourceInformation ( Person .class ) ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.data.rest.webmvc.ResponseEntity<> . getHeaders ( ) . get ( STRING ) ; assertThat ( java.util.List<java.lang.String> ) . hasSize ( NUMBER ) ; assertThat ( java.util.List<java.lang.String> , hasItems ( RestMediaTypes . JSON_PATCH_JSON . toString ( ) , RestMediaTypes . MERGE_PATCH_JSON . toString ( ) , MediaType . APPLICATION_JSON_VALUE ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Order .class ) ; Order org.springframework.data.rest.webmvc.Order = org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) . invokeSave ( new Order ( new Person ( ) ) ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = PersistentEntityResource . build ( new Order ( new Person ( ) ) , org.springframework.data.rest.webmvc.PersistentEntities . getRequiredPersistentEntity ( Order .class ) ) . build ( ) ; assertThat ( org.springframework.data.rest.webmvc.RepositoryEntityController . putItemResource ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource , org.springframework.data.rest.webmvc.Order . getId ( ) , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , ETag . NO_ETAG , MediaType . APPLICATION_JSON_VALUE ) . hasBody ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Order .class ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = PersistentEntityResource . build ( new Order ( new Person ( ) ) , org.springframework.data.rest.webmvc.PersistentEntities . getRequiredPersistentEntity ( Order .class ) ) . build ( ) ; assertThat ( org.springframework.data.rest.webmvc.RepositoryEntityController . putItemResource ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource , NUMBER , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , ETag . NO_ETAG , MediaType . APPLICATION_JSON_VALUE ) . hasBody ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Order .class ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = PersistentEntityResource . build ( new Order ( new Person ( ) ) , org.springframework.data.rest.webmvc.PersistentEntities . getRequiredPersistentEntity ( Order .class ) ) . build ( ) ; assertThat ( org.springframework.data.rest.webmvc.RepositoryEntityController . postCollectionResource ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , MediaType . APPLICATION_JSON_VALUE ) . hasBody ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Order .class ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = PersistentEntityResource . build ( new Order ( new Person ( ) ) , org.springframework.data.rest.webmvc.PersistentEntities . getRequiredPersistentEntity ( Order .class ) ) . build ( ) ; assertThat ( org.springframework.data.rest.webmvc.RepositoryEntityController . postCollectionResource ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , null ) . hasBody ( ) , is ( false ) ) ; assertThat ( org.springframework.data.rest.webmvc.RepositoryEntityController . postCollectionResource ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , STRING ) . hasBody ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Address org.springframework.data.rest.webmvc.Address = org.springframework.data.rest.webmvc.AddressRepository . save ( new Address ( ) ) ; PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler = Mockito . mock ( PersistentEntityResourceAssembler .class ) ; org.springframework.data.rest.webmvc.RepositoryEntityControllerIntegrationTests.AddressProjection org.springframework.data.rest.webmvc.RepositoryEntityControllerIntegrationTests.AddressProjection = new SpelAwareProxyProjectionFactory ( ) . createProjection ( org.springframework.data.rest.webmvc.RepositoryEntityControllerIntegrationTests.AddressProjection .class ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = PersistentEntityResource . build ( org.springframework.data.rest.webmvc.RepositoryEntityControllerIntegrationTests.AddressProjection , org.springframework.data.rest.webmvc.PersistentEntities . getRequiredPersistentEntity ( Address .class ) ) . build ( ) ; Mockito . when ( org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler . toFullResource ( Mockito . any ( java.lang.Object .class ) ) ) . thenReturn ( org.springframework.data.rest.webmvc.PersistentEntityResource ) ; ResponseEntity < Resource < ? > > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.Resource<?>> = org.springframework.data.rest.webmvc.RepositoryEntityController . getItemResource ( getResourceInformation ( Address .class ) , address . id , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , new HttpHeaders ( ) ) ; assertThat ( org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.Resource<?>> . getHeaders ( ) . getETag ( ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Address org.springframework.data.rest.webmvc.Address = org.springframework.data.rest.webmvc.AddressRepository . save ( new Address ( ) ) ; assertThat ( org.springframework.data.rest.webmvc.AddressRepository . findOne ( address . id ) ) . isNotNull ( ) ; RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = getResourceInformation ( Address .class ) ; RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker = spy ( org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) ) ; doReturn ( java.util.Optional . java.util.Optional ( org.springframework.data.rest.webmvc.Address ) ) . when ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . invokeFindOne ( STRING ) ; RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation = Mockito . spy ( org.springframework.data.rest.webmvc.RootResourceInformation ) ; doReturn ( org.springframework.data.rest.webmvc.RepositoryInvoker ) . when ( org.springframework.data.rest.webmvc.RootResourceInformation ) . getInvoker ( ) ; org.springframework.data.rest.webmvc.RepositoryEntityController . deleteItemResource ( org.springframework.data.rest.webmvc.RootResourceInformation , STRING , ETag . from ( STRING ) ) ; assertThat ( org.springframework.data.rest.webmvc.AddressRepository . findOne ( address . id ) ) . isEmpty ( ) ; }  <METHOD_END>
