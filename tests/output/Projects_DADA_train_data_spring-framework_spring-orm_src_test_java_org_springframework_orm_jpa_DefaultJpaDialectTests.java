<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultTransactionDefinition org.springframework.orm.jpa.DefaultTransactionDefinition = new DefaultTransactionDefinition ( ) ; org.springframework.orm.jpa.DefaultTransactionDefinition . setIsolationLevel ( TransactionDefinition . ISOLATION_REPEATABLE_READ ) ; try { org.springframework.orm.jpa.JpaDialect . beginTransaction ( null , org.springframework.orm.jpa.DefaultTransactionDefinition ) ; fail ( STRING ) ; } catch ( TransactionException org.springframework.orm.jpa.TransactionException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TransactionDefinition org.springframework.orm.jpa.TransactionDefinition = new DefaultTransactionDefinition ( ) ; EntityManager org.springframework.orm.jpa.EntityManager = mock ( EntityManager .class ) ; EntityTransaction org.springframework.orm.jpa.EntityTransaction = mock ( EntityTransaction .class ) ; given ( org.springframework.orm.jpa.EntityManager . getTransaction ( ) ) . willReturn ( org.springframework.orm.jpa.EntityTransaction ) ; org.springframework.orm.jpa.JpaDialect . beginTransaction ( org.springframework.orm.jpa.EntityManager , org.springframework.orm.jpa.TransactionDefinition ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { OptimisticLockException org.springframework.orm.jpa.OptimisticLockException = new OptimisticLockException ( ) ; assertEquals ( EntityManagerFactoryUtils . convertJpaAccessExceptionIfPossible ( org.springframework.orm.jpa.OptimisticLockException ) . getCause ( ) , org.springframework.orm.jpa.JpaDialect . translateExceptionIfPossible ( org.springframework.orm.jpa.OptimisticLockException ) . getCause ( ) ) ; }  <METHOD_END>
