<METHOD_START> @ Before public void void ( ) { org.springframework.data.convert.SampleMappingContext = new SampleMappingContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new MappingContextTypeInformationMapper ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.convert.SampleMappingContext . setInitialEntitySet ( java.util.Collections . java.util.Set<java.lang.Class<org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests.Entity>> ( org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests.Entity .class ) ) ; org.springframework.data.convert.SampleMappingContext . initialize ( ) ; org.springframework.data.convert.TypeInformationMapper = new MappingContextTypeInformationMapper ( org.springframework.data.convert.SampleMappingContext ) ; assertThat ( org.springframework.data.convert.TypeInformationMapper . createAliasFor ( ClassTypeInformation . from ( org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests.Entity .class ) ) . hasValue ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.convert.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.convert.SampleMappingContext . initialize ( ) ; org.springframework.data.convert.TypeInformationMapper = new MappingContextTypeInformationMapper ( org.springframework.data.convert.SampleMappingContext ) ; assertThat ( org.springframework.data.convert.TypeInformationMapper . createAliasFor ( from ( org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests.Entity .class ) ) . hasValue ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.convert.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.convert.SampleMappingContext . initialize ( ) ; org.springframework.data.convert.TypeInformationMapper = new MappingContextTypeInformationMapper ( org.springframework.data.convert.SampleMappingContext ) ; assertThat ( org.springframework.data.convert.TypeInformationMapper . createAliasFor ( from ( java.lang.String .class ) ) . isPresent ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.convert.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.convert.SampleMappingContext . initialize ( ) ; org.springframework.data.convert.TypeInformationMapper = new MappingContextTypeInformationMapper ( org.springframework.data.convert.SampleMappingContext ) ; assertThat ( org.springframework.data.convert.TypeInformationMapper . resolveTypeFrom ( Alias . of ( STRING ) ) ) . isEmpty ( ) ; PersistentEntity < ? , SamplePersistentProperty > org.springframework.data.convert.PersistentEntity<?,org.springframework.data.convert.SamplePersistentProperty> = org.springframework.data.convert.SampleMappingContext . getRequiredPersistentEntity ( org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests.Entity .class ) ; assertThat ( org.springframework.data.convert.PersistentEntity<,org.springframework.data.convert.SamplePersistentProperty> ) . isNotNull ( ) ; assertThat ( org.springframework.data.convert.TypeInformationMapper . resolveTypeFrom ( Alias . of ( STRING ) ) ) . hasValue ( from ( org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests.Entity .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { AnnotatedTypeScanner org.springframework.data.convert.AnnotatedTypeScanner = new AnnotatedTypeScanner ( TypeAlias .class ) ; SampleMappingContext org.springframework.data.convert.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.convert.SampleMappingContext . setInitialEntitySet ( org.springframework.data.convert.AnnotatedTypeScanner . findTypes ( java.lang.Class<? extends org.springframework.data.convert.MappingContextTypeInformationMapperUnitTests> ( ) . java.lang.Package ( ) . java.lang.String ( ) ) ) ; org.springframework.data.convert.SampleMappingContext . initialize ( ) ; new MappingContextTypeInformationMapper ( org.springframework.data.convert.SampleMappingContext ) ; }  <METHOD_END>
