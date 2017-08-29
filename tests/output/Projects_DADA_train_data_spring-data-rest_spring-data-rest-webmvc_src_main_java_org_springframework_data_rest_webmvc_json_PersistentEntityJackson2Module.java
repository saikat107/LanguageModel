<METHOD_START> public void ( Associations org.springframework.data.rest.webmvc.json.Associations , PersistentEntities org.springframework.data.rest.webmvc.json.PersistentEntities , UriToEntityConverter org.springframework.data.rest.webmvc.json.UriToEntityConverter , LinkCollector org.springframework.data.rest.webmvc.json.LinkCollector , RepositoryInvokerFactory org.springframework.data.rest.webmvc.json.RepositoryInvokerFactory , org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.LookupObjectSerializer org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.LookupObjectSerializer , ResourceProcessorInvoker org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker , EmbeddedResourcesAssembler org.springframework.data.rest.webmvc.json.EmbeddedResourcesAssembler ) { super( new Version ( NUMBER , NUMBER , NUMBER , null , STRING , STRING ) ); Assert . notNull ( org.springframework.data.rest.webmvc.json.Associations , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.json.PersistentEntities , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.json.UriToEntityConverter , STRING ) ; Assert . notNull ( org.springframework.data.rest.webmvc.json.LinkCollector , STRING ) ; org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.NestedEntitySerializer org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.NestedEntitySerializer = new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.NestedEntitySerializer ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.EmbeddedResourcesAssembler , org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker ) ; addSerializer ( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.PersistentEntityResourceSerializer ( org.springframework.data.rest.webmvc.json.LinkCollector ) ) ; addSerializer ( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionSerializer ( org.springframework.data.rest.webmvc.json.LinkCollector , org.springframework.data.rest.webmvc.json.Associations , org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker , false ) ) ; addSerializer ( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContentSerializer ( false ) ) ; setSerializerModifier ( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.AssociationOmittingSerializerModifier ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.Associations , org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.NestedEntitySerializer , org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.LookupObjectSerializer ) ) ; setDeserializerModifier ( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.AssociationUriResolvingDeserializerModifier ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.Associations , org.springframework.data.rest.webmvc.json.UriToEntityConverter , org.springframework.data.rest.webmvc.json.RepositoryInvokerFactory ) ) ; }  <METHOD_END>
<METHOD_START> private void ( LinkCollector org.springframework.data.rest.webmvc.json.LinkCollector ) { super( PersistentEntityResource .class ); this . org.springframework.data.rest.webmvc.json.LinkCollector = org.springframework.data.rest.webmvc.json.LinkCollector ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final PersistentEntityResource org.springframework.data.rest.webmvc.json.PersistentEntityResource , final JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , final SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider ) throws java.io.IOException , org.springframework.data.rest.webmvc.json.JsonGenerationException { org.springframework.data.rest.webmvc.json.Logger . debug ( STRING , org.springframework.data.rest.webmvc.json.PersistentEntityResource . getPersistentEntity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.json.PersistentEntityResource . getContent ( ) ; if ( boolean ( java.lang.Object , org.springframework.data.rest.webmvc.json.SerializerProvider ) ) { org.springframework.data.rest.webmvc.json.SerializerProvider . defaultSerializeValue ( java.lang.Object , org.springframework.data.rest.webmvc.json.JsonGenerator ) ; return; } Links org.springframework.data.rest.webmvc.json.Links = org.springframework.data.rest.webmvc.json.Links ( org.springframework.data.rest.webmvc.json.PersistentEntityResource ) ; if ( TargetAware .class . boolean ( java.lang.Object ) ) { TargetAware org.springframework.data.rest.webmvc.json.TargetAware = ( TargetAware ) java.lang.Object ; org.springframework.data.rest.webmvc.json.SerializerProvider . defaultSerializeValue ( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResource ( org.springframework.data.rest.webmvc.json.TargetAware , org.springframework.data.rest.webmvc.json.Links ) , org.springframework.data.rest.webmvc.json.JsonGenerator ) ; return; } Resource < java.lang.Object > org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> = new Resource < java.lang.Object > ( org.springframework.data.rest.webmvc.json.PersistentEntityResource . getContent ( ) , org.springframework.data.rest.webmvc.json.Links ) { @ JsonUnwrapped public java.lang.Iterable<?> < ? > java.lang.Iterable<?> ( ) { return org.springframework.data.rest.webmvc.json.PersistentEntityResource . getEmbeddeds ( ) ; } } ; org.springframework.data.rest.webmvc.json.SerializerProvider . defaultSerializeValue ( org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> , org.springframework.data.rest.webmvc.json.JsonGenerator ) ; }  <METHOD_END>
<METHOD_START> @ JsonUnwrapped public java.lang.Iterable<?> < ? > java.lang.Iterable<?> ( ) { return org.springframework.data.rest.webmvc.json.PersistentEntityResource . getEmbeddeds ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.json.Links org.springframework.data.rest.webmvc.json.Links ( PersistentEntityResource org.springframework.data.rest.webmvc.json.PersistentEntityResource ) { java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.data.rest.webmvc.json.PersistentEntityResource . getContent ( ) ) ; return org.springframework.data.rest.webmvc.json.PersistentEntityResource . isNested ( ) ? org.springframework.data.rest.webmvc.json.LinkCollector . getLinksForNested ( java.lang.Object , org.springframework.data.rest.webmvc.json.PersistentEntityResource . getLinks ( ) ) : org.springframework.data.rest.webmvc.json.LinkCollector . getLinksFor ( java.lang.Object , org.springframework.data.rest.webmvc.json.PersistentEntityResource . getLinks ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return TargetAware .class . boolean ( java.lang.Object ) ? ( ( TargetAware ) java.lang.Object ) . getTarget ( ) : java.lang.Object ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.lang.Object java.lang.Object , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider ) throws org.springframework.data.rest.webmvc.json.JsonMappingException { JsonSerializer < java.lang.Object > org.springframework.data.rest.webmvc.json.JsonSerializer<java.lang.Object> = org.springframework.data.rest.webmvc.json.SerializerProvider . findValueSerializer ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; return org.springframework.data.rest.webmvc.json.JsonSerializer<java.lang.Object> instanceof ToStringSerializer || org.springframework.data.rest.webmvc.json.JsonSerializer<java.lang.Object> instanceof StdScalarSerializer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.json.BeanSerializerBuilder org.springframework.data.rest.webmvc.json.BeanSerializerBuilder ( SerializationConfig org.springframework.data.rest.webmvc.json.SerializationConfig , BeanDescription org.springframework.data.rest.webmvc.json.BeanDescription , BeanSerializerBuilder org.springframework.data.rest.webmvc.json.BeanSerializerBuilder ) { org.springframework.data.rest.webmvc.json.PersistentEntities . getPersistentEntity ( org.springframework.data.rest.webmvc.json.BeanDescription . getBeanClass ( ) ) . ifPresent ( entity -> { List < BeanPropertyWriter > result = new ArrayList < BeanPropertyWriter > ( ) ; for ( BeanPropertyWriter writer : builder . getProperties ( ) ) { Optional < ? extends PersistentProperty < ? > > findProperty = findProperty ( writer . getName ( ) , entity , beanDesc ) ; findProperty . ifPresent ( it -> { if ( associations . isLookupType ( it ) ) { LOG . debug ( STRING , it ) ; writer . assignSerializer ( lookupObjectSerializer ) ; result . add ( writer ) ; return; } if ( associations . isLinkableAssociation ( it ) ) { return; } if ( it . isIdProperty ( ) && ! associations . isIdExposed ( entity ) ) { return; } if ( it . isVersionProperty ( ) ) { return; } if ( it . isEntity ( ) && ! writer . isUnwrapping ( ) ) { LOG . debug ( STRING , it ) ; writer . assignSerializer ( nestedEntitySerializer ) ; } result . add ( writer ) ; } ) ; if ( ! findProperty . isPresent ( ) ) { result . add ( writer ) ; } } builder . setProperties ( result ) ; } ) ; return org.springframework.data.rest.webmvc.json.BeanSerializerBuilder ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<? extends org.springframework.data.rest.webmvc.json.PersistentProperty<?>> < ? extends PersistentProperty < ? > > java.util.Optional<? extends org.springframework.data.rest.webmvc.json.PersistentProperty<?>> ( java.lang.String java.lang.String , PersistentEntity < ? , ? extends PersistentProperty < ? > > org.springframework.data.rest.webmvc.json.PersistentEntity<?,? extends org.springframework.data.rest.webmvc.json.PersistentProperty<?>> , BeanDescription org.springframework.data.rest.webmvc.json.BeanDescription ) { return org.springframework.data.rest.webmvc.json.BeanDescription . findProperties ( ) . stream ( ) . filter ( it -> it . getName ( ) . equals ( finalName ) ) . findFirst ( ) . flatMap ( it -> entity . getPersistentProperty ( it . getInternalName ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( PersistentEntities org.springframework.data.rest.webmvc.json.PersistentEntities , EmbeddedResourcesAssembler org.springframework.data.rest.webmvc.json.EmbeddedResourcesAssembler , ResourceProcessorInvoker org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker ) { super( java.lang.Object .class ); this . org.springframework.data.rest.webmvc.json.PersistentEntities = org.springframework.data.rest.webmvc.json.PersistentEntities ; this . org.springframework.data.rest.webmvc.json.EmbeddedResourcesAssembler = org.springframework.data.rest.webmvc.json.EmbeddedResourcesAssembler ; this . org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker = org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider ) throws java.io.IOException { if ( java.lang.Object instanceof java.util.Collection ) { java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; for ( java.lang.Object java.lang.Object : java.util.Collection<> ) { java.util.List<java.lang.Object> . boolean ( org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> ( java.lang.Object ) ) ; } org.springframework.data.rest.webmvc.json.SerializerProvider . defaultSerializeValue ( java.util.List<java.lang.Object> , org.springframework.data.rest.webmvc.json.JsonGenerator ) ; } else if ( java.lang.Object instanceof java.util.Map ) { java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ; java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = CollectionFactory . createApproximateMap ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , java.util.Map<,> . int ( ) ) ; for ( java.util.Map.Entry<?,?> < ? , ? > java.util.Map.Entry<?,?> : java.util.Map<,> . java.util.Set<java.util.Map.Entry<,>> ( ) ) { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( java.util.Map.Entry<,> . getKey ( ) , org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> ( java.util.Map.Entry<,> . getValue ( ) ) ) ; } org.springframework.data.rest.webmvc.json.SerializerProvider . defaultSerializeValue ( java.util.Map<java.lang.Object,java.lang.Object> , org.springframework.data.rest.webmvc.json.JsonGenerator ) ; } else { org.springframework.data.rest.webmvc.json.SerializerProvider . defaultSerializeValue ( org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> ( java.lang.Object ) , org.springframework.data.rest.webmvc.json.JsonGenerator ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider , TypeSerializer org.springframework.data.rest.webmvc.json.TypeSerializer ) throws java.io.IOException { void ( java.lang.Object , org.springframework.data.rest.webmvc.json.JsonGenerator , org.springframework.data.rest.webmvc.json.SerializerProvider ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> < java.lang.Object > org.springframework.data.rest.webmvc.json.Resource<java.lang.Object> ( java.lang.Object java.lang.Object ) { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; return org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker . invokeProcessorsFor ( PersistentEntityResource . build ( java.lang.Object , org.springframework.data.rest.webmvc.json.PersistentEntity<,> ) . withEmbedded ( org.springframework.data.rest.webmvc.json.EmbeddedResourcesAssembler . getEmbeddedResources ( java.lang.Object ) ) . buildNested ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.json.BeanDeserializerBuilder org.springframework.data.rest.webmvc.json.BeanDeserializerBuilder ( DeserializationConfig org.springframework.data.rest.webmvc.json.DeserializationConfig , BeanDescription org.springframework.data.rest.webmvc.json.BeanDescription , BeanDeserializerBuilder org.springframework.data.rest.webmvc.json.BeanDeserializerBuilder ) { java.util.Iterator<org.springframework.data.rest.webmvc.json.SettableBeanProperty> < SettableBeanProperty > java.util.Iterator<org.springframework.data.rest.webmvc.json.SettableBeanProperty> = org.springframework.data.rest.webmvc.json.BeanDeserializerBuilder . getProperties ( ) ; org.springframework.data.rest.webmvc.json.PersistentEntities . getPersistentEntity ( org.springframework.data.rest.webmvc.json.BeanDescription . getBeanClass ( ) ) . ifPresent ( entity -> { while ( properties . hasNext ( ) ) { SettableBeanProperty property = properties . next ( ) ; entity . getPersistentProperty ( property . getName ( ) ) . ifPresent ( persistentProperty -> { if ( associationLinks . isLookupType ( persistentProperty ) ) { RepositoryInvokingDeserializer repositoryInvokingDeserializer = new RepositoryInvokingDeserializer ( factory , persistentProperty ) ; JsonDeserializer < ? > deserializer = wrapIfCollection ( persistentProperty , repositoryInvokingDeserializer , config ) ; builder . addOrReplaceProperty ( property . withValueDeserializer ( deserializer ) , false ) ; return; } if ( ! associationLinks . isLinkableAssociation ( persistentProperty ) ) { return; } UriStringDeserializer uriStringDeserializer = new UriStringDeserializer ( persistentProperty , converter ) ; JsonDeserializer < ? > deserializer = wrapIfCollection ( persistentProperty , uriStringDeserializer , config ) ; builder . addOrReplaceProperty ( property . withValueDeserializer ( deserializer ) , false ) ; } ) ; } } ) ; return org.springframework.data.rest.webmvc.json.BeanDeserializerBuilder ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.rest.webmvc.json.JsonDeserializer<?> < ? > org.springframework.data.rest.webmvc.json.JsonDeserializer<?> ( PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> , JsonDeserializer < java.lang.Object > org.springframework.data.rest.webmvc.json.JsonDeserializer<java.lang.Object> , DeserializationConfig org.springframework.data.rest.webmvc.json.DeserializationConfig ) { if ( ! org.springframework.data.rest.webmvc.json.PersistentProperty<> . isCollectionLike ( ) ) { return org.springframework.data.rest.webmvc.json.JsonDeserializer<java.lang.Object> ; } CollectionLikeType org.springframework.data.rest.webmvc.json.CollectionLikeType = org.springframework.data.rest.webmvc.json.DeserializationConfig . getTypeFactory ( ) . constructCollectionLikeType ( org.springframework.data.rest.webmvc.json.PersistentProperty<> . getType ( ) , org.springframework.data.rest.webmvc.json.PersistentProperty<> . getActualType ( ) ) ; org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.CollectionValueInstantiator org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.CollectionValueInstantiator = new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.CollectionValueInstantiator ( org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ; return new CollectionDeserializer ( org.springframework.data.rest.webmvc.json.CollectionLikeType , org.springframework.data.rest.webmvc.json.JsonDeserializer<java.lang.Object> , null , org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.CollectionValueInstantiator ) ; }  <METHOD_END>
<METHOD_START> public void ( PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> , UriToEntityConverter org.springframework.data.rest.webmvc.json.UriToEntityConverter ) { super( org.springframework.data.rest.webmvc.json.PersistentProperty<> . getActualType ( ) ); this . org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentProperty<> ; this . org.springframework.data.rest.webmvc.json.UriToEntityConverter = org.springframework.data.rest.webmvc.json.UriToEntityConverter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( JsonParser org.springframework.data.rest.webmvc.json.JsonParser , DeserializationContext org.springframework.data.rest.webmvc.json.DeserializationContext ) throws java.io.IOException , org.springframework.data.rest.webmvc.json.JsonProcessingException { java.lang.String java.lang.String = org.springframework.data.rest.webmvc.json.JsonParser . getValueAsString ( ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { return null ; } try { java.net.URI java.net.URI = new UriTemplate ( java.lang.String ) . expand ( ) ; TypeDescriptor org.springframework.data.rest.webmvc.json.TypeDescriptor = TypeDescriptor . valueOf ( org.springframework.data.rest.webmvc.json.PersistentProperty<> . getActualType ( ) ) ; return org.springframework.data.rest.webmvc.json.UriToEntityConverter . convert ( java.net.URI , org.springframework.data.rest.webmvc.json.TypeDescriptor , org.springframework.data.rest.webmvc.json.TypeDescriptor ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { throw org.springframework.data.rest.webmvc.json.DeserializationContext . weirdStringException ( java.lang.String , java.net.URI .class , java.lang.String . java.lang.String ( java.lang.String , org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( JsonParser org.springframework.data.rest.webmvc.json.JsonParser , DeserializationContext org.springframework.data.rest.webmvc.json.DeserializationContext , TypeDeserializer org.springframework.data.rest.webmvc.json.TypeDeserializer )				throws java.io.IOException { return java.lang.Object ( org.springframework.data.rest.webmvc.json.JsonParser , org.springframework.data.rest.webmvc.json.DeserializationContext ) ; }  <METHOD_END>
<METHOD_START> private void ( LinkCollector org.springframework.data.rest.webmvc.json.LinkCollector , Associations org.springframework.data.rest.webmvc.json.Associations , ResourceProcessorInvoker org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker , boolean boolean ) { super( TargetAware .class ); this . org.springframework.data.rest.webmvc.json.LinkCollector = org.springframework.data.rest.webmvc.json.LinkCollector ; this . org.springframework.data.rest.webmvc.json.Associations = org.springframework.data.rest.webmvc.json.Associations ; this . org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker = org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TargetAware org.springframework.data.rest.webmvc.json.TargetAware , JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider )				throws java.io.IOException , org.springframework.data.rest.webmvc.json.JsonGenerationException { if ( ! boolean ) { org.springframework.data.rest.webmvc.json.JsonGenerator . writeStartObject ( ) ; } org.springframework.data.rest.webmvc.json.SerializerProvider . findValueSerializer ( org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResource .class , null ) . unwrappingSerializer ( null ) . serialize ( org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResource ( org.springframework.data.rest.webmvc.json.TargetAware ) , org.springframework.data.rest.webmvc.json.JsonGenerator , org.springframework.data.rest.webmvc.json.SerializerProvider ) ; if ( ! boolean ) { org.springframework.data.rest.webmvc.json.JsonGenerator . writeEndObject ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.json.JsonSerializer<org.springframework.data.rest.webmvc.json.TargetAware> < TargetAware > org.springframework.data.rest.webmvc.json.JsonSerializer<org.springframework.data.rest.webmvc.json.TargetAware> ( NameTransformer org.springframework.data.rest.webmvc.json.NameTransformer ) { return new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionSerializer ( org.springframework.data.rest.webmvc.json.LinkCollector , org.springframework.data.rest.webmvc.json.Associations , org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker , true ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResource org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResource ( TargetAware org.springframework.data.rest.webmvc.json.TargetAware ) { java.lang.Object java.lang.Object = org.springframework.data.rest.webmvc.json.TargetAware . getTarget ( ) ; ResourceMetadata org.springframework.data.rest.webmvc.json.ResourceMetadata = org.springframework.data.rest.webmvc.json.Associations . getMetadataFor ( org.springframework.data.rest.webmvc.json.TargetAware . getTargetClass ( ) ) ; Links org.springframework.data.rest.webmvc.json.Links = org.springframework.data.rest.webmvc.json.ResourceMetadata . isExported ( ) ? org.springframework.data.rest.webmvc.json.LinkCollector . getLinksFor ( java.lang.Object ) : new Links ( ) ; Resource < TargetAware > org.springframework.data.rest.webmvc.json.Resource<org.springframework.data.rest.webmvc.json.TargetAware> = org.springframework.data.rest.webmvc.json.ResourceProcessorInvoker . invokeProcessorsFor ( new Resource < TargetAware > ( org.springframework.data.rest.webmvc.json.TargetAware , org.springframework.data.rest.webmvc.json.Links ) ) ; return new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResource ( org.springframework.data.rest.webmvc.json.Resource<org.springframework.data.rest.webmvc.json.TargetAware> . getContent ( ) , org.springframework.data.rest.webmvc.json.Resource<org.springframework.data.rest.webmvc.json.TargetAware> . getLinks ( ) ) ; }  <METHOD_END>
<METHOD_START> void ( TargetAware org.springframework.data.rest.webmvc.json.TargetAware , java.lang.Iterable<org.springframework.data.rest.webmvc.json.Link> < Link > java.lang.Iterable<org.springframework.data.rest.webmvc.json.Link> ) { super( new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent ( org.springframework.data.rest.webmvc.json.TargetAware , org.springframework.data.rest.webmvc.json.TargetAware . getClass ( ) . getInterfaces ( ) [ NUMBER ] ) , java.lang.Iterable<org.springframework.data.rest.webmvc.json.Link> ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.lang.Object = java.lang.Object ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void ( boolean boolean ) { super( org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent .class ); this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent , JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider )				throws java.io.IOException , org.springframework.data.rest.webmvc.json.JsonGenerationException { org.springframework.data.rest.webmvc.json.SerializerProvider . findValueSerializer ( org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent . java.lang.Class<?> ( ) , null ) . unwrappingSerializer ( null ) . serialize ( org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent . java.lang.Object ( ) , org.springframework.data.rest.webmvc.json.JsonGenerator , org.springframework.data.rest.webmvc.json.SerializerProvider ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.rest.webmvc.json.JsonSerializer<org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent> < org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent > org.springframework.data.rest.webmvc.json.JsonSerializer<org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContent> ( NameTransformer org.springframework.data.rest.webmvc.json.NameTransformer ) { return new org.springframework.data.rest.webmvc.json.PersistentEntityJackson2Module.ProjectionResourceContentSerializer ( true ) ; }  <METHOD_END>
<METHOD_START> public void ( PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> ) { Assert . notNull ( org.springframework.data.rest.webmvc.json.PersistentProperty<> , STRING ) ; Assert . isTrue ( org.springframework.data.rest.webmvc.json.PersistentProperty<> . isCollectionLike ( ) || org.springframework.data.rest.webmvc.json.PersistentProperty<> . isMap ( ) , STRING ) ; this . org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentProperty<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.data.rest.webmvc.json.PersistentProperty<> . getType ( ) . getName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( DeserializationContext org.springframework.data.rest.webmvc.json.DeserializationContext ) throws java.io.IOException , org.springframework.data.rest.webmvc.json.JsonProcessingException { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.rest.webmvc.json.PersistentProperty<> . getType ( ) ; return org.springframework.data.rest.webmvc.json.PersistentProperty<> . isMap ( ) ? CollectionFactory . createMap ( java.lang.Class<> , NUMBER ) : CollectionFactory . createCollection ( java.lang.Class<> , NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void ( RepositoryInvokerFactory org.springframework.data.rest.webmvc.json.RepositoryInvokerFactory , PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> ) { super( org.springframework.data.rest.webmvc.json.PersistentProperty<> . getActualType ( ) ); this . org.springframework.data.rest.webmvc.json.RepositoryInvoker = org.springframework.data.rest.webmvc.json.RepositoryInvokerFactory . getInvokerFor ( _valueClass ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( JsonParser org.springframework.data.rest.webmvc.json.JsonParser , DeserializationContext org.springframework.data.rest.webmvc.json.DeserializationContext ) throws java.io.IOException , org.springframework.data.rest.webmvc.json.JsonProcessingException { return org.springframework.data.rest.webmvc.json.RepositoryInvoker . invokeFindOne ( org.springframework.data.rest.webmvc.json.JsonParser . getValueAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider ) throws java.io.IOException { if ( java.lang.Object instanceof java.util.Collection ) { org.springframework.data.rest.webmvc.json.JsonGenerator . writeStartArray ( ) ; for ( java.lang.Object java.lang.Object : ( java.util.Collection<?> < ? > ) java.lang.Object ) { org.springframework.data.rest.webmvc.json.JsonGenerator . writeString ( java.lang.String ( java.lang.Object ) ) ; } org.springframework.data.rest.webmvc.json.JsonGenerator . writeEndArray ( ) ; } else { org.springframework.data.rest.webmvc.json.JsonGenerator . writeString ( java.lang.String ( java.lang.Object ) ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) { java.util.Optional<org.springframework.data.rest.webmvc.json.EntityLookup<java.lang.Object>> < EntityLookup < java.lang.Object > > java.util.Optional<org.springframework.data.rest.webmvc.json.EntityLookup<java.lang.Object>> = org.springframework.data.rest.webmvc.json.Java8PluginRegistry<org.springframework.data.rest.webmvc.json.EntityLookup<?>,java.lang.Class<?>> . getPluginFor ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) . map ( CastUtils :: cast ) ; return java.util.Optional<org.springframework.data.rest.webmvc.json.EntityLookup<java.lang.Object>> . orElseThrow ( ( ) new IllegalArgumentException ( STRING + value . getClass ( ) . getName ( ) ) ) . getResourceIdentifier ( java.lang.Object ) . toString ( ) ; }  <METHOD_END>
