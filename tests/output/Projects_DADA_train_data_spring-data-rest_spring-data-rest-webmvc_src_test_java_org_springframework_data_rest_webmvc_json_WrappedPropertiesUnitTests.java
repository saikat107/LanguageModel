<METHOD_START> @ Before public void void ( ) { org.springframework.data.rest.webmvc.json.KeyValueMappingContext<?,?> = new KeyValueMappingContext <> ( ) ; org.springframework.data.rest.webmvc.json.KeyValueMappingContext<,> . getPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.MultiLevelNesting .class ) ; org.springframework.data.rest.webmvc.json.KeyValueMappingContext<,> . getPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.SyntheticProperties .class ) ; org.springframework.data.rest.webmvc.json.PersistentEntities = new PersistentEntities ( java.util.Collections . java.util.Set ( org.springframework.data.rest.webmvc.json.KeyValueMappingContext<,> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.OneLevelNesting .class ) ; WrappedProperties org.springframework.data.rest.webmvc.json.WrappedProperties = WrappedProperties . fromJacksonProperties ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.PersistentEntity<,> , org.springframework.data.rest.webmvc.json.ObjectMapper ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isFalse ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentProperty<?>> < PersistentProperty < ? > > java.util.List<org.springframework.data.rest.webmvc.json.PersistentProperty<?>> = org.springframework.data.rest.webmvc.json.WrappedProperties . getPersistentProperties ( STRING ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.Address .class ) . getRequiredPersistentProperty ( STRING ) ; assertThat ( java.util.List<org.springframework.data.rest.webmvc.json.PersistentProperty<?>> ) . contains ( org.springframework.data.rest.webmvc.json.PersistentProperty<> , org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.MultiLevelNesting .class ) ; WrappedProperties org.springframework.data.rest.webmvc.json.WrappedProperties = WrappedProperties . fromJacksonProperties ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.PersistentEntity<,> , new ObjectMapper ( ) ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isFalse ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentProperty<?>> < PersistentProperty < ? > > java.util.List<org.springframework.data.rest.webmvc.json.PersistentProperty<?>> = org.springframework.data.rest.webmvc.json.WrappedProperties . getPersistentProperties ( STRING ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.OneLevelNesting .class ) . getRequiredPersistentProperty ( STRING ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.Address .class ) . getRequiredPersistentProperty ( STRING ) ; assertThat ( java.util.List<org.springframework.data.rest.webmvc.json.PersistentProperty<?>> ) . contains ( org.springframework.data.rest.webmvc.json.PersistentProperty<> , org.springframework.data.rest.webmvc.json.PersistentProperty<> , org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.MultiLevelNesting .class ) ; WrappedProperties org.springframework.data.rest.webmvc.json.WrappedProperties = WrappedProperties . fromJacksonProperties ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.PersistentEntity<,> , new ObjectMapper ( ) ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.MultiLevelNesting .class ) ; WrappedProperties org.springframework.data.rest.webmvc.json.WrappedProperties = WrappedProperties . fromJacksonProperties ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.PersistentEntity<,> , new ObjectMapper ( ) ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.PersistentEntities . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.SyntheticProperties .class ) ; WrappedProperties org.springframework.data.rest.webmvc.json.WrappedProperties = WrappedProperties . fromJacksonProperties ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.PersistentEntity<,> , new ObjectMapper ( ) ) ; assertThat ( org.springframework.data.rest.webmvc.json.WrappedProperties . hasPersistentPropertiesForField ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ JsonUnwrapped org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.Address org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.Address ( ) { return null ; }  <METHOD_END>
<METHOD_START> org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.MultiLevelNesting org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.MultiLevelNesting ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ JsonUnwrapped void void ( org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.OneLevelNesting org.springframework.data.rest.webmvc.json.WrappedPropertiesUnitTests.OneLevelNesting ) {}  <METHOD_END>
