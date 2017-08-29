<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.transaction.event.ConfigurableApplicationContext != null ) { this . org.springframework.transaction.event.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.ImmediateTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertEvents ( EventCollector . IMMEDIATELY , STRING ) ; getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.ImmediateTestListener .class , org.springframework.transaction.event.TransactionalEventListenerTests.BeforeCommitTestListener .class ) ; try { this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; fail ( STRING ) ; return null ; } ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertTrue ( java.lang.IllegalStateException . java.lang.String ( ) . boolean ( STRING ) ) ; assertTrue ( java.lang.IllegalStateException . java.lang.String ( ) . boolean ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String ) ) ; } org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; status . setRollbackOnly ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionExplicitTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.TransactionalConfiguration .class , org.springframework.transaction.event.TransactionalEventListenerTests.TransactionalComponentTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionExplicitTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; status . setRollbackOnly ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.BeforeCommitTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { TransactionSynchronizationManager . registerSynchronization ( new EventTransactionSynchronization ( NUMBER ) { @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertNoEventReceived ( ) ; } } ) ; TransactionSynchronizationManager . registerSynchronization ( new EventTransactionSynchronization ( NUMBER ) { @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertEvents ( EventCollector . BEFORE_COMMIT , STRING ) ; getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; } } ) ; getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertNoEventReceived ( ) ; }  <METHOD_END>
<METHOD_START> @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertEvents ( EventCollector . BEFORE_COMMIT , STRING ) ; getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.BeforeCommitTestListener .class ) ; try { this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { TransactionSynchronizationManager . registerSynchronization ( new EventTransactionSynchronization ( NUMBER ) { @ Override public void beforeCommit ( boolean readOnly ) { throw new IllegalStateException ( STRING ) ; } } ) ; getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { } org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Override public void beforeCommit ( boolean readOnly ) { throw new IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.ImmediateTestListener .class , org.springframework.transaction.event.TransactionalEventListenerTests.BeforeCommitTestListener .class , org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionExplicitTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { TransactionSynchronizationManager . registerSynchronization ( new EventTransactionSynchronization ( NUMBER ) { @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; getEventCollector ( ) . assertEvents ( EventCollector . IMMEDIATELY , STRING ) ; } } ) ; TransactionSynchronizationManager . registerSynchronization ( new EventTransactionSynchronization ( NUMBER ) { @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertEvents ( EventCollector . BEFORE_COMMIT , STRING ) ; getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; } } ) ; getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; getEventCollector ( ) . assertEvents ( EventCollector . IMMEDIATELY , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Override public void beforeCommit ( boolean readOnly ) { getEventCollector ( ) . assertEvents ( EventCollector . BEFORE_COMMIT , STRING ) ; getEventCollector ( ) . assertTotalEventsCount ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.BeforeCommitTestListener .class , org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionTestListener .class , org.springframework.transaction.event.TransactionalEventListenerTests.AfterCompletionExplicitTestListener .class ) ; this . org.springframework.transaction.event.ConfigurableApplicationContext . publishEvent ( STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.FallbackExecutionTestListener .class ) ; this . org.springframework.transaction.event.ConfigurableApplicationContext . publishEvent ( STRING ) ; this . org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; this . org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; this . org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; this . org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.ImmediateTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.transaction.event.TransactionalEventListenerTests.AfterCommitMetaAnnotationTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , STRING ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.AfterCommitMetaAnnotationTestListener .class ) ; this . org.springframework.transaction.event.TransactionTemplate . execute ( status -> { getContext ( ) . publishEvent ( STRING ) ; getEventCollector ( ) . assertNoEventReceived ( ) ; return null ; } ) ; org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) { return org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ; }  <METHOD_END>
<METHOD_START> protected org.springframework.transaction.event.ConfigurableApplicationContext org.springframework.transaction.event.ConfigurableApplicationContext ( ) { return org.springframework.transaction.event.ConfigurableApplicationContext ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { java.util.List<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.List<java.lang.Class<?>> = new java.util.ArrayList<java.lang.Class<?>> <> ( ) ; java.util.List<java.lang.Class<?>> . boolean ( org.springframework.transaction.event.TransactionalEventListenerTests.BasicConfiguration .class ) ; java.util.List<java.lang.Class<?>> . boolean ( java.util.Arrays . java.util.List<java.lang.Class<?>> ( java.lang.Class<?>[] ) ) ; void ( java.util.List<java.lang.Class<?>> . java.lang.Class<?>[] ( new java.lang.Class<?> < ? > [ java.util.List<java.lang.Class<?>> . int ( ) ] ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { this . org.springframework.transaction.event.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<?>[] ) ; this . org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector = this . org.springframework.transaction.event.ConfigurableApplicationContext . getBean ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.transaction.event.TransactionalEventListenerFactory org.springframework.transaction.event.TransactionalEventListenerFactory ( ) { return new TransactionalEventListenerFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) { return new org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.transaction.event.CallCountingTransactionManager org.springframework.transaction.event.CallCountingTransactionManager ( ) { return new CallCountingTransactionManager ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . org.springframework.transaction.event.MultiValueMap<java.lang.String,java.lang.Object> . add ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( java.lang.String java.lang.String ) { return this . org.springframework.transaction.event.MultiValueMap<java.lang.String,java.lang.Object> . getOrDefault ( java.lang.String , java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { if ( java.lang.String[] . int == NUMBER ) { java.lang.String[] = java.lang.String[] ; } for ( java.lang.String java.lang.String : java.lang.String[] ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = java.util.List<java.lang.Object> ( java.lang.String ) ; assertEquals ( STRING + java.lang.String + STRING + STRING + java.util.List<java.lang.Object> + STRING , NUMBER , java.util.List<java.lang.Object> . int ( ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = java.util.List<java.lang.Object> ( java.lang.String ) ; assertEquals ( STRING + java.lang.String + STRING , java.lang.Object[] . int , java.util.List<java.lang.Object> . int ( ) ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { assertEquals ( STRING + java.lang.String + STRING + int , java.lang.Object[] [ int ] , java.util.List<java.lang.Object> . java.lang.Object ( int ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( int int ) { int int = NUMBER ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> < java.lang.String , java.util.List<java.lang.Object> < java.lang.Object > > java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> : this . org.springframework.transaction.event.MultiValueMap<java.lang.String,java.lang.Object> . entrySet ( ) ) { int += java.util.Map.Entry<java.lang.String,java.util.List<java.lang.Object>> . java.util.List<java.lang.Object> ( ) . int ( ) ; } assertEquals ( STRING + this . org.springframework.transaction.event.MultiValueMap<java.lang.String,java.lang.Object> . size ( ) + STRING + STRING , int , int ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . void ( java.lang.String , java.lang.String ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ EventListener ( condition = STRING ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = AFTER_COMPLETION ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = AFTER_COMMIT ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = AFTER_ROLLBACK ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( condition = STRING ) void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = BEFORE_COMMIT ) @ Order ( NUMBER ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = BEFORE_COMMIT , fallbackExecution = true ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = AFTER_COMMIT , fallbackExecution = true ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = AFTER_ROLLBACK , fallbackExecution = true ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ TransactionalEventListener ( phase = AFTER_COMPLETION , fallbackExecution = true ) public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ org.springframework.transaction.event.TransactionalEventListenerTests.AfterCommitEventListener public void void ( java.lang.String java.lang.String ) { void ( org.springframework.transaction.event.TransactionalEventListenerTests.EventCollector . java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return int ; }  <METHOD_END>
