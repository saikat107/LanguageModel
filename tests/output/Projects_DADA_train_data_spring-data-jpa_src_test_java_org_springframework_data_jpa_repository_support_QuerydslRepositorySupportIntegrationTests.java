<METHOD_START> @ Bean public org.springframework.data.jpa.repository.support.UserRepositoryImpl org.springframework.data.jpa.repository.support.UserRepositoryImpl ( ) { return new UserRepositoryImpl ( ) { @ java.lang.Override @ PersistenceContext ( unitName = STRING ) public void void ( EntityManager org.springframework.data.jpa.repository.support.EntityManager ) { super. setEntityManager ( org.springframework.data.jpa.repository.support.EntityManager ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ PersistenceContext ( unitName = STRING ) public void void ( EntityManager org.springframework.data.jpa.repository.support.EntityManager ) { super. setEntityManager ( org.springframework.data.jpa.repository.support.EntityManager ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.ReconfiguringUserRepositoryImpl org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.ReconfiguringUserRepositoryImpl ( ) { return new org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.ReconfiguringUserRepositoryImpl ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.EntityManagerContainer org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.EntityManagerContainer ( ) { return new org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.EntityManagerContainer ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.data.jpa.repository.support.LocalContainerEntityManagerFactoryBean org.springframework.data.jpa.repository.support.LocalContainerEntityManagerFactoryBean ( ) { LocalContainerEntityManagerFactoryBean org.springframework.data.jpa.repository.support.LocalContainerEntityManagerFactoryBean = super. entityManagerFactory ( ) ; org.springframework.data.jpa.repository.support.LocalContainerEntityManagerFactoryBean . setPersistenceUnitName ( STRING ) ; return org.springframework.data.jpa.repository.support.LocalContainerEntityManagerFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.support.QuerydslRepositorySupportTests.UserRepository , is ( notNullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.ReconfiguringUserRepositoryImpl , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.jpa.repository.support.QuerydslRepositorySupportIntegrationTests.ReconfiguringUserRepositoryImpl . getEntityManager ( ) . getEntityManagerFactory ( ) , is ( org.springframework.data.jpa.repository.support.EntityManager . getEntityManagerFactory ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { super( User .class ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ PersistenceContext ( unitName = STRING ) public void void ( EntityManager org.springframework.data.jpa.repository.support.EntityManager ) { super. setEntityManager ( org.springframework.data.jpa.repository.support.EntityManager ) ; }  <METHOD_END>
