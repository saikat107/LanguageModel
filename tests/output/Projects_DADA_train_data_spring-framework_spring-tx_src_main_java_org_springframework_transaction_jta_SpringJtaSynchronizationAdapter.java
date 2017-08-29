<METHOD_START> public void ( TransactionSynchronization org.springframework.transaction.jta.TransactionSynchronization ) { Assert . notNull ( org.springframework.transaction.jta.TransactionSynchronization , STRING ) ; this . org.springframework.transaction.jta.TransactionSynchronization = org.springframework.transaction.jta.TransactionSynchronization ; }  <METHOD_END>
<METHOD_START> public void ( TransactionSynchronization org.springframework.transaction.jta.TransactionSynchronization , UserTransaction org.springframework.transaction.jta.UserTransaction ) { this( org.springframework.transaction.jta.TransactionSynchronization ); if ( org.springframework.transaction.jta.UserTransaction != null && ! org.springframework.transaction.jta.UserTransaction . getClass ( ) . getName ( ) . startsWith ( STRING ) ) { this . org.springframework.transaction.jta.UserTransaction = org.springframework.transaction.jta.UserTransaction ; } }  <METHOD_END>
<METHOD_START> public void ( TransactionSynchronization org.springframework.transaction.jta.TransactionSynchronization , TransactionManager org.springframework.transaction.jta.TransactionManager ) { this( org.springframework.transaction.jta.TransactionSynchronization ); if ( org.springframework.transaction.jta.TransactionManager != null && ! org.springframework.transaction.jta.TransactionManager . getClass ( ) . getName ( ) . startsWith ( STRING ) ) { this . org.springframework.transaction.jta.UserTransaction = new UserTransactionAdapter ( org.springframework.transaction.jta.TransactionManager ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { try { boolean boolean = TransactionSynchronizationManager . isCurrentTransactionReadOnly ( ) ; this . org.springframework.transaction.jta.TransactionSynchronization . beforeCommit ( boolean ) ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { void ( ) ; throw java.lang.RuntimeException ; } catch ( java.lang.Error java.lang.Error ) { void ( ) ; throw java.lang.Error ; } finally { this . boolean = true ; this . org.springframework.transaction.jta.TransactionSynchronization . beforeCompletion ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( this . org.springframework.transaction.jta.UserTransaction != null ) { try { this . org.springframework.transaction.jta.UserTransaction . setRollbackOnly ( ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { org.springframework.transaction.jta.Log . debug ( STRING + STRING + STRING , java.lang.UnsupportedOperationException ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.transaction.jta.Log . error ( STRING , java.lang.Throwable ) ; } } else { org.springframework.transaction.jta.Log . debug ( STRING + STRING + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) { if ( ! this . boolean ) { this . org.springframework.transaction.jta.TransactionSynchronization . beforeCompletion ( ) ; } switch ( int ) { case Status . STATUS_COMMITTED : this . org.springframework.transaction.jta.TransactionSynchronization . afterCompletion ( TransactionSynchronization . STATUS_COMMITTED ) ; break; case Status . STATUS_ROLLEDBACK : this . org.springframework.transaction.jta.TransactionSynchronization . afterCompletion ( TransactionSynchronization . STATUS_ROLLED_BACK ) ; break; default: this . org.springframework.transaction.jta.TransactionSynchronization . afterCompletion ( TransactionSynchronization . STATUS_UNKNOWN ) ; } }  <METHOD_END>
