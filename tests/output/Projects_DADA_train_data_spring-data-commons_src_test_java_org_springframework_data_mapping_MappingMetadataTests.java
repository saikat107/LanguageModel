<METHOD_START> @ Before public void void ( ) { org.springframework.data.mapping.SampleMappingContext = new SampleMappingContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , SamplePersistentProperty > org.springframework.data.mapping.PersistentEntity<?,org.springframework.data.mapping.SamplePersistentProperty> = org.springframework.data.mapping.SampleMappingContext . getRequiredPersistentEntity ( PersonWithId .class ) ; assertThat ( org.springframework.data.mapping.PersistentEntity<,org.springframework.data.mapping.SamplePersistentProperty> . getIdProperty ( ) ) . hasValueSatisfying ( it -> assertThat ( it . getType ( ) ) . isEqualTo ( String .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentEntity < ? , SamplePersistentProperty > org.springframework.data.mapping.PersistentEntity<?,org.springframework.data.mapping.SamplePersistentProperty> = org.springframework.data.mapping.SampleMappingContext . getRequiredPersistentEntity ( PersonWithChildren .class ) ; org.springframework.data.mapping.PersistentEntity<,org.springframework.data.mapping.SamplePersistentProperty> . doWithAssociations ( ( AssociationHandler < SamplePersistentProperty > ) association -> { assertThat ( association . getInverse ( ) . getComponentType ( ) ) . hasValue ( Child .class ) ; } ) ; }  <METHOD_END>