<METHOD_START> @ Bean public org.springframework.data.rest.tests.Repositories org.springframework.data.rest.tests.Repositories ( ) { return new Repositories ( org.springframework.data.rest.tests.ApplicationContext ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.tests.RepositoryRestConfiguration org.springframework.data.rest.tests.RepositoryRestConfiguration ( ) { return new RepositoryRestConfiguration ( new ProjectionDefinitionConfiguration ( ) , new MetadataConfiguration ( ) , mock ( EnumTranslationConfiguration .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.tests.DefaultFormattingConversionService org.springframework.data.rest.tests.DefaultFormattingConversionService ( ) { DefaultFormattingConversionService org.springframework.data.rest.tests.DefaultFormattingConversionService = new DefaultFormattingConversionService ( ) ; DomainClassConverter < FormattingConversionService > org.springframework.data.rest.tests.DomainClassConverter<org.springframework.data.rest.tests.FormattingConversionService> = new DomainClassConverter < FormattingConversionService > ( org.springframework.data.rest.tests.DefaultFormattingConversionService ) ; org.springframework.data.rest.tests.DomainClassConverter<org.springframework.data.rest.tests.FormattingConversionService> . setApplicationContext ( org.springframework.data.rest.tests.ApplicationContext ) ; return org.springframework.data.rest.tests.DefaultFormattingConversionService ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.tests.PersistentEntities org.springframework.data.rest.tests.PersistentEntities ( ) { return new PersistentEntities ( java.util.List<org.springframework.data.rest.tests.MappingContext<?,?>> ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.tests.Module org.springframework.data.rest.tests.Module ( ) { RepositoryResourceMappings org.springframework.data.rest.tests.RepositoryResourceMappings = new RepositoryResourceMappings ( org.springframework.data.rest.tests.Repositories ( ) , org.springframework.data.rest.tests.PersistentEntities ( ) , org.springframework.data.rest.tests.RepositoryRestConfiguration ( ) . getRepositoryDetectionStrategy ( ) ) ; EntityLinks org.springframework.data.rest.tests.EntityLinks = new RepositoryEntityLinks ( org.springframework.data.rest.tests.Repositories ( ) , org.springframework.data.rest.tests.RepositoryResourceMappings , org.springframework.data.rest.tests.RepositoryRestConfiguration ( ) , mock ( PagingAndSortingTemplateVariables .class ) , Java8PluginRegistry . of ( java.util.Arrays . java.util.List ( DefaultIdConverter . INSTANCE ) ) ) ; SelfLinkProvider org.springframework.data.rest.tests.SelfLinkProvider = new DefaultSelfLinkProvider ( org.springframework.data.rest.tests.PersistentEntities ( ) , org.springframework.data.rest.tests.EntityLinks , java.util.Collections .< EntityLookup < ? > > java.util.List<org.springframework.data.rest.tests.EntityLookup<?>> ( ) ) ; DefaultRepositoryInvokerFactory org.springframework.data.rest.tests.DefaultRepositoryInvokerFactory = new DefaultRepositoryInvokerFactory ( org.springframework.data.rest.tests.Repositories ( ) ) ; UriToEntityConverter org.springframework.data.rest.tests.UriToEntityConverter = new UriToEntityConverter ( org.springframework.data.rest.tests.PersistentEntities ( ) , org.springframework.data.rest.tests.DefaultRepositoryInvokerFactory , org.springframework.data.rest.tests.Repositories ( ) ) ; Associations org.springframework.data.rest.tests.Associations = new Associations ( org.springframework.data.rest.tests.RepositoryResourceMappings , org.springframework.data.rest.tests.RepositoryRestConfiguration ( ) ) ; LinkCollector org.springframework.data.rest.tests.LinkCollector = new LinkCollector ( org.springframework.data.rest.tests.PersistentEntities ( ) , org.springframework.data.rest.tests.SelfLinkProvider , org.springframework.data.rest.tests.Associations ) ; return new PersistentEntityJackson2Module ( org.springframework.data.rest.tests.Associations , org.springframework.data.rest.tests.PersistentEntities ( ) , org.springframework.data.rest.tests.UriToEntityConverter , org.springframework.data.rest.tests.LinkCollector , org.springframework.data.rest.tests.DefaultRepositoryInvokerFactory , mock ( LookupObjectSerializer .class ) , new ResourceProcessorInvoker ( java.util.Collections .< ResourceProcessor < ? > > java.util.List<org.springframework.data.rest.tests.ResourceProcessor<?>> ( ) ) , new EmbeddedResourcesAssembler ( org.springframework.data.rest.tests.PersistentEntities ( ) , org.springframework.data.rest.tests.Associations , mock ( ExcerptProjector .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.tests.ObjectMapper org.springframework.data.rest.tests.ObjectMapper ( ) { RelProvider org.springframework.data.rest.tests.RelProvider = new EvoInflectorRelProvider ( ) ; ObjectMapper org.springframework.data.rest.tests.ObjectMapper = new ObjectMapper ( ) ; org.springframework.data.rest.tests.ObjectMapper . registerModule ( new Jackson2HalModule ( ) ) ; org.springframework.data.rest.tests.ObjectMapper . registerModule ( org.springframework.data.rest.tests.Module ( ) ) ; org.springframework.data.rest.tests.ObjectMapper . setHandlerInstantiator ( new Jackson2HalModule . Jackson2HalModule ( org.springframework.data.rest.tests.RelProvider , null , null ) ) ; org.springframework.data.rest.tests.ObjectMapper . configure ( DeserializationFeature . FAIL_ON_UNKNOWN_PROPERTIES , false ) ; org.springframework.data.rest.tests.ObjectMapper . setSerializationInclusion ( Include . NON_EMPTY ) ; return org.springframework.data.rest.tests.ObjectMapper ; }  <METHOD_END>
