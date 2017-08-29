<METHOD_START> @ Autowired public void ( Repositories org.springframework.data.rest.webmvc.Repositories , RepositoryRestConfiguration org.springframework.data.rest.webmvc.RepositoryRestConfiguration , RepositoryEntityLinks org.springframework.data.rest.webmvc.RepositoryEntityLinks , PagedResourcesAssembler < java.lang.Object > org.springframework.data.rest.webmvc.PagedResourcesAssembler<java.lang.Object> , HttpHeadersPreparer org.springframework.data.rest.webmvc.HttpHeadersPreparer ) { super( org.springframework.data.rest.webmvc.PagedResourcesAssembler<java.lang.Object> ); this . org.springframework.data.rest.webmvc.RepositoryEntityLinks = org.springframework.data.rest.webmvc.RepositoryEntityLinks ; this . org.springframework.data.rest.webmvc.RepositoryRestConfiguration = org.springframework.data.rest.webmvc.RepositoryRestConfiguration ; this . org.springframework.data.rest.webmvc.HttpHeadersPreparer = org.springframework.data.rest.webmvc.HttpHeadersPreparer ; this . org.springframework.data.rest.webmvc.ResourceStatus = ResourceStatus . of ( org.springframework.data.rest.webmvc.HttpHeadersPreparer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEventPublisher org.springframework.data.rest.webmvc.ApplicationEventPublisher ) { this . org.springframework.data.rest.webmvc.ApplicationEventPublisher = org.springframework.data.rest.webmvc.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String , method = RequestMethod . OPTIONS ) public org.springframework.data.rest.webmvc.ResponseEntity<?> < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation ) { HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders = new HttpHeaders ( ) ; SupportedHttpMethods org.springframework.data.rest.webmvc.SupportedHttpMethods = org.springframework.data.rest.webmvc.RootResourceInformation . getSupportedMethods ( ) ; org.springframework.data.rest.webmvc.HttpHeaders . setAllow ( org.springframework.data.rest.webmvc.SupportedHttpMethods . getMethodsFor ( ResourceType . COLLECTION ) ) ; return new ResponseEntity < java.lang.Object > ( org.springframework.data.rest.webmvc.HttpHeaders , HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String , method = RequestMethod . HEAD ) public org.springframework.data.rest.webmvc.ResponseEntity<?> < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , DefaultedPageable org.springframework.data.rest.webmvc.DefaultedPageable ) throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . HEAD , ResourceType . COLLECTION ) ; RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker = org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) ; if ( null == org.springframework.data.rest.webmvc.RepositoryInvoker ) { throw new ResourceNotFoundException ( ) ; } java.util.List<org.springframework.data.rest.webmvc.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.Link> = java.util.List<org.springframework.data.rest.webmvc.Link> ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.DefaultedPageable ) ; java.util.List<org.springframework.data.rest.webmvc.Link> . add ( NUMBER , getDefaultSelfLink ( ) ) ; HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders = new HttpHeaders ( ) ; org.springframework.data.rest.webmvc.HttpHeaders . add ( java.lang.String , new Links ( java.util.List<org.springframework.data.rest.webmvc.Link> ) . java.lang.String ( ) ) ; return new ResponseEntity < java.lang.Object > ( org.springframework.data.rest.webmvc.HttpHeaders , HttpStatus . NO_CONTENT ) ; }  <METHOD_END>
<METHOD_START> @ ResponseBody @ RequestMapping ( value = java.lang.String , method = RequestMethod . GET ) public org.springframework.data.rest.webmvc.Resources<?> < ? > org.springframework.data.rest.webmvc.Resources<?> ( @ QuerydslPredicate RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , DefaultedPageable org.springframework.data.rest.webmvc.DefaultedPageable , Sort org.springframework.data.rest.webmvc.Sort , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler )			throws org.springframework.data.rest.webmvc.ResourceNotFoundException , org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . GET , ResourceType . COLLECTION ) ; RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker = org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) ; if ( null == org.springframework.data.rest.webmvc.RepositoryInvoker ) { throw new ResourceNotFoundException ( ) ; } java.lang.Iterable<?> < ? > java.lang.Iterable<?> = org.springframework.data.rest.webmvc.DefaultedPageable . getPageable ( ) != null ? org.springframework.data.rest.webmvc.RepositoryInvoker . invokeFindAll ( org.springframework.data.rest.webmvc.DefaultedPageable . getPageable ( ) ) : org.springframework.data.rest.webmvc.RepositoryInvoker . invokeFindAll ( org.springframework.data.rest.webmvc.Sort ) ; ResourceMetadata org.springframework.data.rest.webmvc.ResourceMetadata = org.springframework.data.rest.webmvc.RootResourceInformation . getResourceMetadata ( ) ; Link org.springframework.data.rest.webmvc.Link = org.springframework.data.rest.webmvc.RepositoryEntityLinks . linkToPagedResource ( org.springframework.data.rest.webmvc.RootResourceInformation . getDomainType ( ) , org.springframework.data.rest.webmvc.DefaultedPageable . isDefault ( ) ? null : org.springframework.data.rest.webmvc.DefaultedPageable . getPageable ( ) ) ; Resources < ? > org.springframework.data.rest.webmvc.Resources<?> = toResources ( java.lang.Iterable<> , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , org.springframework.data.rest.webmvc.ResourceMetadata . getDomainType ( ) , org.springframework.data.rest.webmvc.Link ) ; org.springframework.data.rest.webmvc.Resources<> . add ( java.util.List<org.springframework.data.rest.webmvc.Link> ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.DefaultedPageable ) ) ; return org.springframework.data.rest.webmvc.Resources<> ; }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.data.rest.webmvc.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.Link> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , DefaultedPageable org.springframework.data.rest.webmvc.DefaultedPageable ) { ResourceMetadata org.springframework.data.rest.webmvc.ResourceMetadata = org.springframework.data.rest.webmvc.RootResourceInformation . getResourceMetadata ( ) ; SearchResourceMappings org.springframework.data.rest.webmvc.SearchResourceMappings = org.springframework.data.rest.webmvc.ResourceMetadata . getSearchResourceMappings ( ) ; java.util.List<org.springframework.data.rest.webmvc.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.Link> = new java.util.ArrayList<org.springframework.data.rest.webmvc.Link> < Link > ( ) ; java.util.List<org.springframework.data.rest.webmvc.Link> . add ( new Link ( ProfileController . getPath ( this . org.springframework.data.rest.webmvc.RepositoryRestConfiguration , org.springframework.data.rest.webmvc.ResourceMetadata ) , ProfileResourceProcessor . PROFILE_REL ) ) ; if ( org.springframework.data.rest.webmvc.SearchResourceMappings . isExported ( ) ) { java.util.List<org.springframework.data.rest.webmvc.Link> . add ( org.springframework.data.rest.webmvc.RepositoryEntityLinks . linkFor ( org.springframework.data.rest.webmvc.ResourceMetadata . getDomainType ( ) ) . slash ( org.springframework.data.rest.webmvc.SearchResourceMappings . getPath ( ) ) . withRel ( org.springframework.data.rest.webmvc.SearchResourceMappings . getRel ( ) ) ) ; } return java.util.List<org.springframework.data.rest.webmvc.Link> ; }  <METHOD_END>
<METHOD_START> @ ResponseBody @ java.lang.SuppressWarnings ( { STRING } ) @ RequestMapping ( value = java.lang.String , method = RequestMethod . GET , produces = { STRING , STRING } ) public org.springframework.data.rest.webmvc.Resources<?> < ? > org.springframework.data.rest.webmvc.Resources<?> ( @ QuerydslPredicate RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , DefaultedPageable org.springframework.data.rest.webmvc.DefaultedPageable , Sort org.springframework.data.rest.webmvc.Sort , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler )			throws org.springframework.data.rest.webmvc.ResourceNotFoundException , org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { Resources < ? > org.springframework.data.rest.webmvc.Resources<?> = org.springframework.data.rest.webmvc.Resources<?> ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.DefaultedPageable , org.springframework.data.rest.webmvc.Sort , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler ) ; java.util.List<org.springframework.data.rest.webmvc.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.Link> = new java.util.ArrayList<org.springframework.data.rest.webmvc.Link> < Link > ( org.springframework.data.rest.webmvc.Resources<> . getLinks ( ) ) ; for ( Resource < ? > org.springframework.data.rest.webmvc.Resource<?> : ( ( Resources < Resource < ? > > ) org.springframework.data.rest.webmvc.Resources<> ) . getContent ( ) ) { PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = ( PersistentEntityResource ) org.springframework.data.rest.webmvc.Resource<> ; java.util.List<org.springframework.data.rest.webmvc.Link> . add ( resourceLink ( org.springframework.data.rest.webmvc.RootResourceInformation , org.springframework.data.rest.webmvc.PersistentEntityResource ) ) ; } if ( org.springframework.data.rest.webmvc.Resources<> instanceof PagedResources ) { return new PagedResources < java.lang.Object > ( java.util.Collections . java.util.List<java.lang.Object> ( ) , ( ( PagedResources < ? > ) org.springframework.data.rest.webmvc.Resources<> ) . getMetadata ( ) , java.util.List<org.springframework.data.rest.webmvc.Link> ) ; } else { return new Resources < java.lang.Object > ( java.util.Collections . java.util.List<java.lang.Object> ( ) , java.util.List<org.springframework.data.rest.webmvc.Link> ) ; } }  <METHOD_END>
<METHOD_START> @ ResponseBody @ RequestMapping ( value = java.lang.String , method = RequestMethod . POST ) public org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> < ResourceSupport > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , @ RequestHeader ( value = java.lang.String , required = false ) java.lang.String java.lang.String )			throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . POST , ResourceType . COLLECTION ) ; return org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( org.springframework.data.rest.webmvc.PersistentEntityResource . getContent ( ) , org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , org.springframework.data.rest.webmvc.RepositoryRestConfiguration . returnBodyOnCreate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String + STRING , method = RequestMethod . OPTIONS ) public org.springframework.data.rest.webmvc.ResponseEntity<?> < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation ) { HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders = new HttpHeaders ( ) ; SupportedHttpMethods org.springframework.data.rest.webmvc.SupportedHttpMethods = org.springframework.data.rest.webmvc.RootResourceInformation . getSupportedMethods ( ) ; org.springframework.data.rest.webmvc.HttpHeaders . setAllow ( org.springframework.data.rest.webmvc.SupportedHttpMethods . getMethodsFor ( ResourceType . ITEM ) ) ; org.springframework.data.rest.webmvc.HttpHeaders . put ( STRING , java.util.List<java.lang.String> ) ; return new ResponseEntity < java.lang.Object > ( org.springframework.data.rest.webmvc.HttpHeaders , HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String + STRING , method = RequestMethod . HEAD ) public org.springframework.data.rest.webmvc.ResponseEntity<?> < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , @ BackendId java.io.Serializable java.io.Serializable , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler ) throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { return java.util.Optional<java.lang.Object> ( org.springframework.data.rest.webmvc.RootResourceInformation , java.io.Serializable ) . map ( it -> { Links links = new Links ( assembler . toResource ( it ) . getLinks ( ) ) ; HttpHeaders headers = headersPreparer . prepareHeaders ( resourceInformation . getPersistentEntity ( ) , it ) ; headers . add ( LINK_HEADER , links . toString ( ) ) ; return new ResponseEntity < Object > ( headers , HttpStatus . NO_CONTENT ) ; } ) . orElseThrow ( ( ) new ResourceNotFoundException ( ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String + STRING , method = RequestMethod . GET ) public org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.Resource<?>> < Resource < ? > > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.Resource<?>> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , @ BackendId java.io.Serializable java.io.Serializable , final PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , @ RequestHeader HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders )			throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { return java.util.Optional<java.lang.Object> ( org.springframework.data.rest.webmvc.RootResourceInformation , java.io.Serializable ) . map ( it -> { PersistentEntity < ? , ? > entity = resourceInformation . getPersistentEntity ( ) ; return resourceStatus . getStatusAndHeaders ( headers , it , entity ) . toResponseEntity ( ( ) assembler . toFullResource ( it ) ) ; } ) . orElseGet ( ( ) new ResponseEntity < Resource < ? > > ( HttpStatus . NOT_FOUND ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String + STRING , method = RequestMethod . PUT ) public org.springframework.data.rest.webmvc.ResponseEntity<? extends org.springframework.data.rest.webmvc.ResourceSupport> < ? extends ResourceSupport > org.springframework.data.rest.webmvc.ResponseEntity<? extends org.springframework.data.rest.webmvc.ResourceSupport> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource , @ BackendId java.io.Serializable java.io.Serializable , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , ETag org.springframework.data.rest.webmvc.ETag , @ RequestHeader ( value = java.lang.String , required = false ) java.lang.String java.lang.String )			throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . PUT , ResourceType . ITEM ) ; RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker = org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) ; java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.PersistentEntityResource . getContent ( ) ; org.springframework.data.rest.webmvc.ETag . verify ( org.springframework.data.rest.webmvc.RootResourceInformation . getPersistentEntity ( ) , java.lang.Object ) ; return org.springframework.data.rest.webmvc.PersistentEntityResource . isNew ( ) ? org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( java.lang.Object , org.springframework.data.rest.webmvc.RepositoryInvoker , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , org.springframework.data.rest.webmvc.RepositoryRestConfiguration . returnBodyOnCreate ( java.lang.String ) ) : org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( java.lang.Object , org.springframework.data.rest.webmvc.RepositoryInvoker , PUT , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , org.springframework.data.rest.webmvc.RepositoryRestConfiguration . returnBodyOnUpdate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String + STRING , method = RequestMethod . PATCH ) public org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> < ResourceSupport > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource , @ BackendId java.io.Serializable java.io.Serializable , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , ETag org.springframework.data.rest.webmvc.ETag , @ RequestHeader ( value = java.lang.String , required = false ) java.lang.String java.lang.String )			throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException , org.springframework.data.rest.webmvc.ResourceNotFoundException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . PATCH , ResourceType . ITEM ) ; java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.PersistentEntityResource . getContent ( ) ; org.springframework.data.rest.webmvc.ETag . verify ( org.springframework.data.rest.webmvc.RootResourceInformation . getPersistentEntity ( ) , java.lang.Object ) ; return org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( java.lang.Object , org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) , PATCH , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , org.springframework.data.rest.webmvc.RepositoryRestConfiguration . returnBodyOnUpdate ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = java.lang.String + STRING , method = RequestMethod . DELETE ) public org.springframework.data.rest.webmvc.ResponseEntity<?> < ? > org.springframework.data.rest.webmvc.ResponseEntity<?> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , @ BackendId java.io.Serializable java.io.Serializable , ETag org.springframework.data.rest.webmvc.ETag ) throws org.springframework.data.rest.webmvc.ResourceNotFoundException , org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . DELETE , ResourceType . ITEM ) ; RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker = org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) ; java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> = org.springframework.data.rest.webmvc.RepositoryInvoker . invokeFindOne ( java.io.Serializable ) ; return java.util.Optional<java.lang.Object> . java.util.Optional<java.lang.Object> ( java.lang.Object -> { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.RootResourceInformation . getPersistentEntity ( ) ; org.springframework.data.rest.webmvc.ETag . verify ( org.springframework.data.rest.webmvc.PersistentEntity<,> , java.lang.Object ) ; org.springframework.data.rest.webmvc.ApplicationEventPublisher . publishEvent ( new BeforeDeleteEvent ( java.lang.Object ) ) ; org.springframework.data.rest.webmvc.RepositoryInvoker . invokeDelete ( ( java.io.Serializable ) org.springframework.data.rest.webmvc.PersistentEntity<,> . getIdentifierAccessor ( java.lang.Object ) . getIdentifier ( ) . orElse ( null ) ) ; org.springframework.data.rest.webmvc.ApplicationEventPublisher . publishEvent ( new AfterDeleteEvent ( java.lang.Object ) ) ; return new ResponseEntity < java.lang.Object > ( HttpStatus . NO_CONTENT ) ; } ) . orElseThrow ( ( ) new ResourceNotFoundException ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> < ResourceSupport > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( java.lang.Object java.lang.Object , RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker , HttpMethod org.springframework.data.rest.webmvc.HttpMethod , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , boolean boolean ) { org.springframework.data.rest.webmvc.ApplicationEventPublisher . publishEvent ( new BeforeSaveEvent ( java.lang.Object ) ) ; java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.RepositoryInvoker . invokeSave ( java.lang.Object ) ; org.springframework.data.rest.webmvc.ApplicationEventPublisher . publishEvent ( new AfterSaveEvent ( java.lang.Object ) ) ; PersistentEntityResource org.springframework.data.rest.webmvc.PersistentEntityResource = org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler . toFullResource ( java.lang.Object ) ; HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders = org.springframework.data.rest.webmvc.HttpHeadersPreparer . prepareHeaders ( java.util.Optional . java.util.Optional ( org.springframework.data.rest.webmvc.PersistentEntityResource ) ) ; if ( PUT . equals ( org.springframework.data.rest.webmvc.HttpMethod ) ) { void ( org.springframework.data.rest.webmvc.HttpHeaders , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , java.lang.Object ) ; } if ( boolean ) { return ControllerUtils . toResponseEntity ( HttpStatus . OK , org.springframework.data.rest.webmvc.HttpHeaders , org.springframework.data.rest.webmvc.PersistentEntityResource ) ; } else { return ControllerUtils . toEmptyResponse ( HttpStatus . NO_CONTENT , org.springframework.data.rest.webmvc.HttpHeaders ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> < ResourceSupport > org.springframework.data.rest.webmvc.ResponseEntity<org.springframework.data.rest.webmvc.ResourceSupport> ( java.lang.Object java.lang.Object , RepositoryInvoker org.springframework.data.rest.webmvc.RepositoryInvoker , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , boolean boolean ) { org.springframework.data.rest.webmvc.ApplicationEventPublisher . publishEvent ( new BeforeCreateEvent ( java.lang.Object ) ) ; java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.RepositoryInvoker . invokeSave ( java.lang.Object ) ; org.springframework.data.rest.webmvc.ApplicationEventPublisher . publishEvent ( new AfterCreateEvent ( java.lang.Object ) ) ; java.util.Optional<org.springframework.data.rest.webmvc.PersistentEntityResource> < PersistentEntityResource > java.util.Optional<org.springframework.data.rest.webmvc.PersistentEntityResource> = java.util.Optional . java.util.Optional ( boolean ? org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler . toFullResource ( java.lang.Object ) : null ) ; HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders = org.springframework.data.rest.webmvc.HttpHeadersPreparer . prepareHeaders ( java.util.Optional<org.springframework.data.rest.webmvc.PersistentEntityResource> ) ; void ( org.springframework.data.rest.webmvc.HttpHeaders , org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , java.lang.Object ) ; return ControllerUtils . toResponseEntity ( HttpStatus . CREATED , org.springframework.data.rest.webmvc.HttpHeaders , java.util.Optional<org.springframework.data.rest.webmvc.PersistentEntityResource> ) ; }  <METHOD_END>
<METHOD_START> private void void ( HttpHeaders org.springframework.data.rest.webmvc.HttpHeaders , PersistentEntityResourceAssembler org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler , java.lang.Object java.lang.Object ) { java.lang.String java.lang.String = org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler . getSelfLinkFor ( java.lang.Object ) . getHref ( ) ; org.springframework.data.rest.webmvc.HttpHeaders . setLocation ( new UriTemplate ( java.lang.String ) . expand ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( RootResourceInformation org.springframework.data.rest.webmvc.RootResourceInformation , java.io.Serializable java.io.Serializable )			throws org.springframework.data.rest.webmvc.HttpRequestMethodNotSupportedException , org.springframework.data.rest.webmvc.ResourceNotFoundException { org.springframework.data.rest.webmvc.RootResourceInformation . verifySupportedMethod ( HttpMethod . GET , ResourceType . ITEM ) ; return org.springframework.data.rest.webmvc.RootResourceInformation . getInvoker ( ) . invokeFindOne ( java.io.Serializable ) ; }  <METHOD_END>