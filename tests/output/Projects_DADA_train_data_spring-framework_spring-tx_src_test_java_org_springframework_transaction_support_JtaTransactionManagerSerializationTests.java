<METHOD_START> @ Test public void void ( ) java.lang.Exception { UserTransaction org.springframework.transaction.support.UserTransaction = mock ( UserTransaction .class ) ; UserTransaction org.springframework.transaction.support.UserTransaction = mock ( UserTransaction .class ) ; TransactionManager org.springframework.transaction.support.TransactionManager = mock ( TransactionManager .class ) ; JtaTransactionManager org.springframework.transaction.support.JtaTransactionManager = new JtaTransactionManager ( ) ; org.springframework.transaction.support.JtaTransactionManager . setUserTransaction ( org.springframework.transaction.support.UserTransaction ) ; org.springframework.transaction.support.JtaTransactionManager . setTransactionManager ( org.springframework.transaction.support.TransactionManager ) ; org.springframework.transaction.support.JtaTransactionManager . setRollbackOnCommitFailure ( true ) ; org.springframework.transaction.support.JtaTransactionManager . afterPropertiesSet ( ) ; SimpleNamingContextBuilder org.springframework.transaction.support.SimpleNamingContextBuilder = SimpleNamingContextBuilder . emptyActivatedContextBuilder ( ) ; org.springframework.transaction.support.SimpleNamingContextBuilder . bind ( JtaTransactionManager . DEFAULT_USER_TRANSACTION_NAME , org.springframework.transaction.support.UserTransaction ) ; JtaTransactionManager org.springframework.transaction.support.JtaTransactionManager = ( JtaTransactionManager ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.transaction.support.JtaTransactionManager ) ; assertNotNull ( STRING , serializedJtatm . logger ) ; assertTrue ( STRING , org.springframework.transaction.support.JtaTransactionManager . getUserTransaction ( ) == org.springframework.transaction.support.UserTransaction ) ; assertNull ( STRING , org.springframework.transaction.support.JtaTransactionManager . getTransactionManager ( ) ) ; assertEquals ( true , org.springframework.transaction.support.JtaTransactionManager . isRollbackOnCommitFailure ( ) ) ; }  <METHOD_END>
