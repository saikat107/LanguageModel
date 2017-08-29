<METHOD_START> @ Before public void void ( ) { when ( org.springframework.data.jpa.repository.support.EntityManager . getDelegate ( ) ) . thenReturn ( org.springframework.data.jpa.repository.support.EntityManager ) ; when ( org.springframework.data.jpa.repository.support.JpaEntityInformation<org.springframework.data.jpa.repository.support.User,java.lang.Long> . getJavaType ( ) ) . thenReturn ( User .class ) ; when ( org.springframework.data.jpa.repository.support.EntityManager . getCriteriaBuilder ( ) ) . thenReturn ( org.springframework.data.jpa.repository.support.CriteriaBuilder ) ; when ( org.springframework.data.jpa.repository.support.CriteriaBuilder . createQuery ( User .class ) ) . thenReturn ( org.springframework.data.jpa.repository.support.CriteriaQuery<org.springframework.data.jpa.repository.support.User> ) ; when ( org.springframework.data.jpa.repository.support.CriteriaBuilder . createQuery ( java.lang.Long .class ) ) . thenReturn ( org.springframework.data.jpa.repository.support.CriteriaQuery<java.lang.Long> ) ; when ( org.springframework.data.jpa.repository.support.EntityManager . createQuery ( org.springframework.data.jpa.repository.support.CriteriaQuery<org.springframework.data.jpa.repository.support.User> ) ) . thenReturn ( org.springframework.data.jpa.repository.support.TypedQuery<org.springframework.data.jpa.repository.support.User> ) ; when ( org.springframework.data.jpa.repository.support.EntityManager . createQuery ( org.springframework.data.jpa.repository.support.CriteriaQuery<java.lang.Long> ) ) . thenReturn ( org.springframework.data.jpa.repository.support.TypedQuery<java.lang.Long> ) ; org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> = new SimpleJpaRepository < User , java.lang.Integer > ( org.springframework.data.jpa.repository.support.JpaEntityInformation<org.springframework.data.jpa.repository.support.User,java.lang.Long> , org.springframework.data.jpa.repository.support.EntityManager ) ; org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . setRepositoryMethodMetadata ( org.springframework.data.jpa.repository.support.CrudMethodMetadata ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.jpa.repository.support.TypedQuery<java.lang.Long> . getSingleResult ( ) ) . thenReturn ( NUMBER ) ; org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( PageRequest . of ( NUMBER , NUMBER ) ) ; verify ( org.springframework.data.jpa.repository.support.TypedQuery<org.springframework.data.jpa.repository.support.User> ) . getResultList ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.jpa.repository.support.TypedQuery<org.springframework.data.jpa.repository.support.User> . getResultList ( ) ) . thenReturn ( java.util.Arrays . java.util.List ( new User ( ) , new User ( ) ) ) ; org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( PageRequest . of ( NUMBER , NUMBER ) ) ; verify ( org.springframework.data.jpa.repository.support.TypedQuery<java.lang.Long> , never ( ) ) . getSingleResult ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.jpa.repository.support.TypedQuery<org.springframework.data.jpa.repository.support.User> . getResultList ( ) ) . thenReturn ( java.util.Arrays . java.util.List ( new User ( ) , new User ( ) ) ) ; org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findAll ( PageRequest . of ( NUMBER , NUMBER ) ) ; verify ( org.springframework.data.jpa.repository.support.TypedQuery<java.lang.Long> , never ( ) ) . getSingleResult ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = EmptyResultDataAccessException .class ) public void void ( ) { org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . delete ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; when ( org.springframework.data.jpa.repository.EntityGraph . value ( ) ) . thenReturn ( java.lang.String ) ; when ( org.springframework.data.jpa.repository.EntityGraph . type ( ) ) . thenReturn ( EntityGraphType . LOAD ) ; when ( org.springframework.data.jpa.repository.support.CrudMethodMetadata . getEntityGraph ( ) ) . thenReturn ( org.springframework.data.jpa.repository.EntityGraph ) ; when ( org.springframework.data.jpa.repository.support.EntityManager . getEntityGraph ( java.lang.String ) ) . thenReturn ( ( EntityGraph ) org.springframework.data.jpa.repository.support.EntityGraph<org.springframework.data.jpa.repository.support.User> ) ; when ( org.springframework.data.jpa.repository.support.JpaEntityInformation<org.springframework.data.jpa.repository.support.User,java.lang.Long> . getEntityName ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.jpa.repository.support.CrudMethodMetadata . getMethod ( ) ) . thenReturn ( CrudRepository .class . java.lang.reflect.Method ( STRING , java.io.Serializable .class ) ) ; java.lang.Integer java.lang.Integer = NUMBER ; org.springframework.data.jpa.repository.support.SimpleJpaRepository<org.springframework.data.jpa.repository.support.User,java.lang.Integer> . findOne ( java.lang.Integer ) ; verify ( org.springframework.data.jpa.repository.support.EntityManager ) . find ( User .class , java.lang.Integer , java.util.Map ( EntityGraphType . LOAD . getKey ( ) , ( java.lang.Object ) org.springframework.data.jpa.repository.support.EntityGraph<org.springframework.data.jpa.repository.support.User> ) ) ; }  <METHOD_END>