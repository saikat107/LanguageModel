<METHOD_START> @ Before @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { when ( org.springframework.data.jpa.repository.query.EntityManager . getMetamodel ( ) ) . thenReturn ( org.springframework.data.jpa.repository.query.Metamodel ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . createQuery ( anyString ( ) ) ) . thenReturn ( javax.persistence.Query ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . createQuery ( anyString ( ) , eq ( java.lang.Long .class ) ) ) . thenReturn ( org.springframework.data.jpa.repository.query.TypedQuery<java.lang.Long> ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . getEntityManagerFactory ( ) ) . thenReturn ( org.springframework.data.jpa.repository.query.EntityManagerFactory ) ; when ( org.springframework.data.jpa.repository.query.EntityManagerFactory . createEntityManager ( ) ) . thenReturn ( org.springframework.data.jpa.repository.query.EntityManager ) ; when ( org.springframework.data.jpa.repository.query.RepositoryMetadata . getDomainType ( ) ) . thenReturn ( ( java.lang.Class ) User .class ) ; when ( org.springframework.data.jpa.repository.query.RepositoryMetadata . getReturnedDomainClass ( Mockito . any ( java.lang.reflect.Method .class ) ) ) . thenReturn ( ( java.lang.Class ) User .class ) ; java.lang.reflect.Method java.lang.reflect.Method = UserRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests .class . java.lang.reflect.Method ( STRING ) , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . createQuery ( STRING , java.lang.Long .class ) ) . thenReturn ( org.springframework.data.jpa.repository.query.TypedQuery<java.lang.Long> ) ; SimpleJpaQuery org.springframework.data.jpa.repository.query.SimpleJpaQuery = new SimpleJpaQuery ( org.springframework.data.jpa.repository.query.JpaQueryMethod , org.springframework.data.jpa.repository.query.EntityManager , STRING , org.springframework.data.jpa.repository.query.EvaluationContextProvider , org.springframework.data.jpa.repository.query.SpelExpressionParser ) ; assertThat ( org.springframework.data.jpa.repository.query.SimpleJpaQuery . createCountQuery ( new java.lang.Object [] {} ) , is ( ( javax . javax.persistence . javax.persistence ) org.springframework.data.jpa.repository.query.TypedQuery<java.lang.Long> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { when ( org.springframework.data.jpa.repository.query.EntityManager . createQuery ( Mockito . anyString ( ) ) ) . thenReturn ( javax.persistence.Query ) ; java.lang.reflect.Method java.lang.reflect.Method = UserRepository .class . java.lang.reflect.Method ( STRING , Pageable .class ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; AbstractJpaQuery org.springframework.data.jpa.repository.query.AbstractJpaQuery = new SimpleJpaQuery ( org.springframework.data.jpa.repository.query.JpaQueryMethod , org.springframework.data.jpa.repository.query.EntityManager , STRING , org.springframework.data.jpa.repository.query.EvaluationContextProvider , org.springframework.data.jpa.repository.query.SpelExpressionParser ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery . createCountQuery ( new java.lang.Object [] { PageRequest . of ( NUMBER , NUMBER ) } ) ; verify ( javax.persistence.Query , times ( NUMBER ) ) . setFirstResult ( anyInt ( ) ) ; verify ( javax.persistence.Query , times ( NUMBER ) ) . setMaxResults ( anyInt ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; AbstractJpaQuery org.springframework.data.jpa.repository.query.AbstractJpaQuery = JpaQueryFactory . INSTANCE . fromQueryAnnotation ( org.springframework.data.jpa.repository.query.JpaQueryMethod , org.springframework.data.jpa.repository.query.EntityManager , org.springframework.data.jpa.repository.query.EvaluationContextProvider ) ; assertThat ( org.springframework.data.jpa.repository.query.AbstractJpaQuery instanceof NativeJpaQuery , is ( true ) ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . createNativeQuery ( anyString ( ) , eq ( User .class ) ) ) . thenReturn ( javax.persistence.Query ) ; when ( org.springframework.data.jpa.repository.query.RepositoryMetadata . getReturnedDomainClass ( java.lang.reflect.Method ) ) . thenReturn ( ( java.lang.Class ) User .class ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery . createQuery ( new java.lang.Object [] { STRING } ) ; verify ( org.springframework.data.jpa.repository.query.EntityManager ) . createNativeQuery ( STRING , User .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidJpaQueryMethodException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Sort .class ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidJpaQueryMethodException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Pageable .class ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . createQuery ( Mockito . contains ( STRING ) ) ) . thenThrow ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , Pageable .class ) ; when ( org.springframework.data.jpa.repository.query.EntityManager . createQuery ( Mockito . contains ( STRING ) ) ) . thenThrow ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.jpa.repository.query.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.jpa.repository.query.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.jpa.repository.query.ExpectedException . expectMessage ( java.lang.reflect.Method . java.lang.String ( ) ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RepositoryQuery org.springframework.data.jpa.repository.query.RepositoryQuery = org.springframework.data.jpa.repository.query.AbstractJpaQuery ( org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING ) ) ; assertThat ( org.springframework.data.jpa.repository.query.RepositoryQuery instanceof SimpleJpaQuery , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RepositoryQuery org.springframework.data.jpa.repository.query.RepositoryQuery = org.springframework.data.jpa.repository.query.AbstractJpaQuery ( org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ) ; assertThat ( org.springframework.data.jpa.repository.query.RepositoryQuery instanceof NativeJpaQuery , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { when ( org.springframework.data.jpa.repository.query.EntityManager . createNativeQuery ( anyString ( ) ) ) . thenReturn ( javax.persistence.Query ) ; AbstractJpaQuery org.springframework.data.jpa.repository.query.AbstractJpaQuery = org.springframework.data.jpa.repository.query.AbstractJpaQuery ( UserRepository .class . java.lang.reflect.Method ( STRING , Pageable .class ) ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery . doCreateCountQuery ( new java.lang.Object [] { PageRequest . of ( NUMBER , NUMBER ) } ) ; verify ( org.springframework.data.jpa.repository.query.EntityManager ) . createNativeQuery ( anyString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AbstractJpaQuery org.springframework.data.jpa.repository.query.AbstractJpaQuery = org.springframework.data.jpa.repository.query.AbstractJpaQuery ( org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING ) ) ; org.springframework.data.jpa.repository.query.AbstractJpaQuery . createQuery ( new java.lang.Object [ NUMBER ] ) ; verify ( org.springframework.data.jpa.repository.query.EntityManager , times ( NUMBER ) ) . createQuery ( anyString ( ) , eq ( Tuple .class ) ) ; verify ( org.springframework.data.jpa.repository.query.EntityManager , times ( NUMBER ) ) . createQuery ( anyString ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.jpa.repository.query.AbstractJpaQuery org.springframework.data.jpa.repository.query.AbstractJpaQuery ( java.lang.reflect.Method java.lang.reflect.Method ) { JpaQueryMethod org.springframework.data.jpa.repository.query.JpaQueryMethod = new JpaQueryMethod ( java.lang.reflect.Method , org.springframework.data.jpa.repository.query.RepositoryMetadata , org.springframework.data.jpa.repository.query.ProjectionFactory , org.springframework.data.jpa.repository.query.QueryExtractor ) ; return JpaQueryFactory . INSTANCE . fromQueryAnnotation ( org.springframework.data.jpa.repository.query.JpaQueryMethod , org.springframework.data.jpa.repository.query.EntityManager , org.springframework.data.jpa.repository.query.EvaluationContextProvider ) ; }  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , nativeQuery = true ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , nativeQuery = true ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String , Sort org.springframework.data.jpa.repository.query.Sort );  <METHOD_END>
<METHOD_START> @ Query ( value = STRING , nativeQuery = true ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( java.lang.String java.lang.String , Pageable org.springframework.data.jpa.repository.query.Pageable );  <METHOD_END>
<METHOD_START> @ Query ( java.lang.String ) java.util.List<org.springframework.data.jpa.repository.query.User> < User > java.util.List<org.springframework.data.jpa.repository.query.User> ( )  <METHOD_END>
<METHOD_START> @ Query ( java.lang.String ) org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> < User > org.springframework.data.jpa.repository.query.Page<org.springframework.data.jpa.repository.query.User> ( Pageable org.springframework.data.jpa.repository.query.Pageable );  <METHOD_END>
<METHOD_START> @ Query ( STRING ) java.util.Collection<org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.UserProjection> < org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.UserProjection > java.util.Collection<org.springframework.data.jpa.repository.query.SimpleJpaQueryUnitTests.UserProjection> ( )  <METHOD_END>
