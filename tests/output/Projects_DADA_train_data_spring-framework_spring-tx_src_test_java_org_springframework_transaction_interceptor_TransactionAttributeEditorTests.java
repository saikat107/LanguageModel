<METHOD_START> @ Test public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( null ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute == null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute == null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute != null ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) == TransactionDefinition . PROPAGATION_REQUIRED ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) == TransactionDefinition . ISOLATION_DEFAULT ) ; assertTrue ( ! org.springframework.transaction.interceptor.TransactionAttribute . isReadOnly ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute != null ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) == TransactionDefinition . PROPAGATION_REQUIRED ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) == TransactionDefinition . ISOLATION_READ_UNCOMMITTED ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertNotNull ( org.springframework.transaction.interceptor.TransactionAttribute ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) , TransactionDefinition . PROPAGATION_MANDATORY ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) , TransactionDefinition . ISOLATION_REPEATABLE_READ ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getTimeout ( ) , NUMBER ) ; assertFalse ( org.springframework.transaction.interceptor.TransactionAttribute . isReadOnly ( ) ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.RuntimeException ( ) ) ) ; assertFalse ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.Exception ( ) ) ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.io.IOException ( ) ) ) ; assertTrue ( ! org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new MyRuntimeException ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( STRING ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertNotNull ( org.springframework.transaction.interceptor.TransactionAttribute ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) , TransactionDefinition . ISOLATION_READ_COMMITTED ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getTimeout ( ) , TransactionDefinition . TIMEOUT_DEFAULT ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . isReadOnly ( ) ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.RuntimeException ( ) ) ) ; assertFalse ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.Exception ( ) ) ) ; assertFalse ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.io.IOException ( ) ) ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new MyRuntimeException ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultTransactionAttribute org.springframework.transaction.interceptor.DefaultTransactionAttribute = new DefaultTransactionAttribute ( ) ; org.springframework.transaction.interceptor.DefaultTransactionAttribute . setPropagationBehavior ( TransactionDefinition . PROPAGATION_SUPPORTS ) ; org.springframework.transaction.interceptor.DefaultTransactionAttribute . setIsolationLevel ( TransactionDefinition . ISOLATION_REPEATABLE_READ ) ; org.springframework.transaction.interceptor.DefaultTransactionAttribute . setTimeout ( NUMBER ) ; org.springframework.transaction.interceptor.DefaultTransactionAttribute . setReadOnly ( true ) ; TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( org.springframework.transaction.interceptor.DefaultTransactionAttribute . toString ( ) ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute , org.springframework.transaction.interceptor.DefaultTransactionAttribute ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) , TransactionDefinition . ISOLATION_REPEATABLE_READ ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getTimeout ( ) , NUMBER ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . isReadOnly ( ) ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.RuntimeException ( ) ) ) ; assertFalse ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.Exception ( ) ) ) ; org.springframework.transaction.interceptor.DefaultTransactionAttribute . setTimeout ( NUMBER ) ; assertNotSame ( org.springframework.transaction.interceptor.TransactionAttribute , org.springframework.transaction.interceptor.DefaultTransactionAttribute ) ; org.springframework.transaction.interceptor.DefaultTransactionAttribute . setTimeout ( NUMBER ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute , org.springframework.transaction.interceptor.DefaultTransactionAttribute ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RuleBasedTransactionAttribute org.springframework.transaction.interceptor.RuleBasedTransactionAttribute = new RuleBasedTransactionAttribute ( ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setPropagationBehavior ( TransactionDefinition . PROPAGATION_SUPPORTS ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setIsolationLevel ( TransactionDefinition . ISOLATION_REPEATABLE_READ ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setTimeout ( NUMBER ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . setReadOnly ( true ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . add ( new RollbackRuleAttribute ( STRING ) ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . add ( new NoRollbackRuleAttribute ( STRING ) ) ; TransactionAttributeEditor org.springframework.transaction.interceptor.TransactionAttributeEditor = new TransactionAttributeEditor ( ) ; org.springframework.transaction.interceptor.TransactionAttributeEditor . setAsText ( org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . toString ( ) ) ; TransactionAttribute org.springframework.transaction.interceptor.TransactionAttribute = ( TransactionAttribute ) org.springframework.transaction.interceptor.TransactionAttributeEditor . getValue ( ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute , org.springframework.transaction.interceptor.RuleBasedTransactionAttribute ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getPropagationBehavior ( ) , TransactionDefinition . PROPAGATION_SUPPORTS ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getIsolationLevel ( ) , TransactionDefinition . ISOLATION_REPEATABLE_READ ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute . getTimeout ( ) , NUMBER ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . isReadOnly ( ) ) ; assertTrue ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.IllegalArgumentException ( ) ) ) ; assertFalse ( org.springframework.transaction.interceptor.TransactionAttribute . rollbackOn ( new java.lang.IllegalStateException ( ) ) ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . clear ( ) ; assertNotSame ( org.springframework.transaction.interceptor.TransactionAttribute , org.springframework.transaction.interceptor.RuleBasedTransactionAttribute ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . add ( new RollbackRuleAttribute ( STRING ) ) ; org.springframework.transaction.interceptor.RuleBasedTransactionAttribute . getRollbackRules ( ) . add ( new NoRollbackRuleAttribute ( STRING ) ) ; assertEquals ( org.springframework.transaction.interceptor.TransactionAttribute , org.springframework.transaction.interceptor.RuleBasedTransactionAttribute ) ; }  <METHOD_END>