<METHOD_START> @ Test public void void ( ) { void ( ALL , new java.util.HashMap<java.lang.Class<?>,java.lang.Boolean> < java.lang.Class<?> < ? > , java.lang.Boolean > ( ) { { java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.AnnotatedRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.HiddenRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PublicRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PackageProtectedRepository .class , true ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( DEFAULT , new java.util.HashMap<java.lang.Class<?>,java.lang.Boolean> < java.lang.Class<?> < ? > , java.lang.Boolean > ( ) { { java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.AnnotatedRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.HiddenRepository .class , false ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PublicRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PackageProtectedRepository .class , false ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( VISIBILITY , new java.util.HashMap<java.lang.Class<?>,java.lang.Boolean> < java.lang.Class<?> < ? > , java.lang.Boolean > ( ) { { java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.AnnotatedRepository .class , false ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.HiddenRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PublicRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PackageProtectedRepository .class , false ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ANNOTATED , new java.util.HashMap<java.lang.Class<?>,java.lang.Boolean> < java.lang.Class<?> < ? > , java.lang.Boolean > ( ) { { java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.AnnotatedRepository .class , true ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.HiddenRepository .class , false ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PublicRepository .class , false ) ; java.lang.Boolean ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategiesUnitTests.PackageProtectedRepository .class , false ) ; } } ) ; }  <METHOD_END>
<METHOD_START> private static void void ( RepositoryDetectionStrategy org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy , java.util.Map<java.lang.Class<?>,java.lang.Boolean> < java.lang.Class<?> < ? > , java.lang.Boolean > java.util.Map<java.lang.Class<?>,java.lang.Boolean> ) { for ( java.util.Map.Entry<java.lang.Class<?>,java.lang.Boolean> < java.lang.Class<?> < ? > , java.lang.Boolean > java.util.Map.Entry<java.lang.Class<?>,java.lang.Boolean> : java.util.Map<java.lang.Class<?>,java.lang.Boolean> . java.util.Set<java.util.Map.Entry<java.lang.Class<?>,java.lang.Boolean>> ( ) ) { assertThat ( org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy . isExported ( new DefaultRepositoryMetadata ( java.util.Map.Entry<java.lang.Class<?>,java.lang.Boolean> . java.lang.Class<?> ( ) ) ) ) . isEqualTo ( java.util.Map.Entry<java.lang.Class<?>,java.lang.Boolean> . java.lang.Boolean ( ) ) ; } }  <METHOD_END>