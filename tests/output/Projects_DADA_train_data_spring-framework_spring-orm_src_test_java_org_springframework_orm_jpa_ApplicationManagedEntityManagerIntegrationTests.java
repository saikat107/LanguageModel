<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( org.springframework.orm.jpa.EntityManager . getClass ( ) ) ) ; Query org.springframework.orm.jpa.Query = org.springframework.orm.jpa.EntityManager . createQuery ( STRING ) ; java.util.List<org.springframework.orm.jpa.Person> < Person > java.util.List<org.springframework.orm.jpa.Person> = org.springframework.orm.jpa.Query . getResultList ( ) ; assertNotNull ( java.util.List<org.springframework.orm.jpa.Person> ) ; assertTrue ( STRING , org.springframework.orm.jpa.EntityManager . isOpen ( ) ) ; org.springframework.orm.jpa.EntityManager . close ( ) ; assertFalse ( STRING , org.springframework.orm.jpa.EntityManager . isOpen ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; void ( org.springframework.orm.jpa.EntityManager ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; try { void ( org.springframework.orm.jpa.EntityManager ) ; fail ( STRING ) ; } catch ( TransactionRequiredException org.springframework.orm.jpa.TransactionRequiredException ) { } void ( sharedEntityManager ) ; setComplete ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( EntityManager org.springframework.orm.jpa.EntityManager ) { void ( ) ; Person org.springframework.orm.jpa.Person = new Person ( ) ; org.springframework.orm.jpa.Person . setFirstName ( STRING ) ; org.springframework.orm.jpa.Person . setLastName ( STRING ) ; org.springframework.orm.jpa.EntityManager . persist ( org.springframework.orm.jpa.Person ) ; org.springframework.orm.jpa.EntityManager . flush ( ) ; assertEquals ( STRING , NUMBER , countRowsInTable ( org.springframework.orm.jpa.EntityManager , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , NUMBER , countRowsInTable ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; void ( org.springframework.orm.jpa.EntityManager ) ; endTransaction ( ) ; assertFalse ( org.springframework.orm.jpa.EntityManager . getTransaction ( ) . isActive ( ) ) ; startNewTransaction ( ) ; assertFalse ( org.springframework.orm.jpa.EntityManager . contains ( new Person ( ) ) ) ; assertFalse ( org.springframework.orm.jpa.EntityManager . getTransaction ( ) . isActive ( ) ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; assertTrue ( org.springframework.orm.jpa.EntityManager . getTransaction ( ) . isActive ( ) ) ; void ( org.springframework.orm.jpa.EntityManager ) ; setComplete ( ) ; endTransaction ( ) ; assertEquals ( STRING , NUMBER , countRowsInTable ( org.springframework.orm.jpa.EntityManager , STRING ) ) ; startNewTransaction ( ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; void ( org.springframework.orm.jpa.EntityManager ) ; assertEquals ( STRING , NUMBER , countRowsInTable ( org.springframework.orm.jpa.EntityManager , STRING ) ) ; setComplete ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( EntityManager org.springframework.orm.jpa.EntityManager ) { org.springframework.orm.jpa.EntityManager . createQuery ( STRING ) . executeUpdate ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; void ( org.springframework.orm.jpa.EntityManager ) ; endTransaction ( ) ; assertEquals ( STRING , NUMBER , countRowsInTable ( org.springframework.orm.jpa.EntityManager , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EntityManager org.springframework.orm.jpa.EntityManager = entityManagerFactory . createEntityManager ( ) ; org.springframework.orm.jpa.EntityManager . joinTransaction ( ) ; void ( org.springframework.orm.jpa.EntityManager ) ; setComplete ( ) ; endTransaction ( ) ; assertEquals ( STRING , NUMBER , countRowsInTable ( org.springframework.orm.jpa.EntityManager , STRING ) ) ; deleteFromTables ( STRING ) ; }  <METHOD_END>
