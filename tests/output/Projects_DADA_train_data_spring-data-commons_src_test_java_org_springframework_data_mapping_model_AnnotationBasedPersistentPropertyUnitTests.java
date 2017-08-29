<METHOD_START> @ Before public void void ( ) { org.springframework.data.mapping.model.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> = org.springframework.data.mapping.model.SampleMappingContext . getRequiredPersistentEntity ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.Sample .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.annotation.Annotation ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation .class , org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.annotation.Annotation ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation .class , org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.annotation.Annotation ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation .class , org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.annotation.Annotation ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyId .class , org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) ; java.lang.annotation.Annotation ( Id .class , org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . hasValueSatisfying ( property -> { Map < Class < ? extends Annotation > , Annotation > cache = getAnnotationCache ( property ) ; assertThat ( cache . containsKey ( MyAnnotationAsMeta .class ) ) . isTrue ( ) ; assertThat ( cache . containsKey ( MyAnnotation .class ) ) . isFalse ( ) ; assertThat ( property . findAnnotation ( MyAnnotation .class ) ) . hasValueSatisfying ( annotation -> assertThat ( cache . containsKey ( MyAnnotation .class ) ) . isTrue ( ) ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.mapping.model.SampleMappingContext . getPersistentEntity ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.InvalidSample .class ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.mapping.model.MappingException ) { assertThat ( org.springframework.data.mapping.model.SampleMappingContext . hasPersistentEntityFor ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.InvalidSample .class ) ) . isFalse ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.FieldAccess .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . usePropertyAccess ( ) ) . isFalse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.PropertyAccess .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . usePropertyAccess ( ) ) . isTrue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.PropertyAccess .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . usePropertyAccess ( ) ) . isFalse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.PropertyAccess .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . usePropertyAccess ( ) ) . isFalse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mapping.model.SampleMappingContext . getPersistentEntity ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.AnotherInvalidSample .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.ClassWithReadOnlyProperties .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . isWritable ( ) ) . isTrue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.ClassWithReadOnlyProperties .class , STRING ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.ClassWithReadOnlyProperties .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . isWritable ( ) ) . isFalse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.ClassWithReadOnlyProperties .class , STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . isWritable ( ) ) . isFalse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.TypeWithCustomAnnotationsOnBothFieldAndAccessor .class , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> < SamplePersistentProperty > java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> = java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.Sample .class , STRING ) ; assertThat ( java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ) . hasValueSatisfying ( it -> { assertThat ( it . findAnnotation ( MyAnnotation .class ) ) . isNotPresent ( ) ; Map < Class < ? > , ? > field = ( Map < Class < ? > , ? > ) ReflectionTestUtils . getField ( it , STRING ) ; assertThat ( field . containsKey ( MyAnnotation .class ) ) . isTrue ( ) ; assertThat ( field . get ( MyAnnotation .class ) ) . isEqualTo ( Optional . empty ( ) ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . hasValueSatisfying ( property -> { Map < Class < ? extends Annotation > , Annotation > cache = getAnnotationCache ( property ) ; assertThat ( cache . containsKey ( MyComposedAnnotationUsingAliasFor .class ) ) . isTrue ( ) ; assertThat ( cache . containsKey ( MyAnnotation .class ) ) . isFalse ( ) ; assertThat ( property . findAnnotation ( MyAnnotation .class ) ) . hasValueSatisfying ( it -> assertThat ( cache . containsKey ( MyAnnotation .class ) ) . isTrue ( ) ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . hasValueSatisfying ( property -> assertThat ( property . findAnnotation ( MyAnnotation .class ) ) . hasValueSatisfying ( annotation -> assertThat ( AnnotationUtils . getValue ( annotation ) ) . isEqualTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mapping.model.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.model.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . hasValueSatisfying ( property -> assertThat ( property . findAnnotation ( RevisedAnnnotationWithAliasFor .class ) ) . hasValueSatisfying ( annotation -> { assertThat ( annotation . name ( ) ) . isEqualTo ( STRING ) ; assertThat ( annotation . value ( ) ) . isEqualTo ( STRING ) ; } ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>,java.lang.annotation.Annotation> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > , java.lang.annotation.Annotation > java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>,java.lang.annotation.Annotation> ( SamplePersistentProperty org.springframework.data.mapping.model.SamplePersistentProperty ) { return ( java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>,java.lang.annotation.Annotation> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > , java.lang.annotation.Annotation > ) ReflectionTestUtils . getField ( org.springframework.data.mapping.model.SamplePersistentProperty , STRING ) ; }  <METHOD_END>
<METHOD_START> private < A extends java.lang.annotation.Annotation > A A ( java.lang.Class<A> < A > java.lang.Class<A> , java.util.Optional<? extends org.springframework.data.mapping.model.AnnotationBasedPersistentProperty<?>> < ? extends AnnotationBasedPersistentProperty < ? > > java.util.Optional<? extends org.springframework.data.mapping.model.AnnotationBasedPersistentProperty<?>> ) { java.util.Optional<A> < A > java.util.Optional<A> = java.util.Optional<> . java.util.Optional<A> ( it -> it . findAnnotation ( java.lang.Class<A> ) ) ; assertThat ( java.util.Optional<A> ) . isPresent ( ) ; return java.util.Optional<A> . A ( ) ; }  <METHOD_END>
<METHOD_START> private java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> < SamplePersistentProperty > java.util.Optional<org.springframework.data.mapping.model.SamplePersistentProperty> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { return org.springframework.data.mapping.model.SampleMappingContext . getRequiredPersistentEntity ( java.lang.Class<> ) . getPersistentProperty ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ AccessType ( Type . PROPERTY ) public java.lang.Object java.lang.Object ( ) { return null ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) {}  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation ( STRING ) public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ org.springframework.data.mapping.model.AnnotationBasedPersistentPropertyUnitTests.MyAnnotation public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ AccessType ( Type . FIELD ) public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Nullable public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
