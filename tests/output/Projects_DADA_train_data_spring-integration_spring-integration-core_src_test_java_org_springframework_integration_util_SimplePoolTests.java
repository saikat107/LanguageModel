<METHOD_START> @ Test public void void ( ) { final java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; SimplePool < java.lang.String > org.springframework.integration.util.SimplePool<java.lang.String> = org.springframework.integration.util.SimplePool<java.lang.String> ( NUMBER , java.util.Set<java.lang.String> , java.util.concurrent.atomic.AtomicBoolean ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertNotSame ( java.lang.String , java.lang.String ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertSame ( java.lang.String , java.lang.String ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertNotSame ( java.lang.String , java.lang.String ) ; assertFalse ( java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; SimplePool < java.lang.String > org.springframework.integration.util.SimplePool<java.lang.String> = org.springframework.integration.util.SimplePool<java.lang.String> ( NUMBER , java.util.Set<java.lang.String> , java.util.concurrent.atomic.AtomicBoolean ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertNotSame ( java.lang.String , java.lang.String ) ; org.springframework.integration.util.SimplePool<java.lang.String> . setWaitTimeout ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; try { org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; fail ( STRING ) ; } catch ( MessagingException org.springframework.integration.util.MessagingException ) { } org.springframework.integration.util.SimplePool<java.lang.String> . setPoolSize ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . setPoolSize ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getPoolSize ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getPoolSize ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; assertEquals ( NUMBER , java.util.Set<java.lang.String> . int ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getIdleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getActiveCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getPoolSize ( ) ) ; assertEquals ( NUMBER , java.util.Set<java.lang.String> . int ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.util.SimplePool<java.lang.String> . getAllocatedCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { final java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; SimplePool < java.lang.String > org.springframework.integration.util.SimplePool<java.lang.String> = org.springframework.integration.util.SimplePool<java.lang.String> ( NUMBER , java.util.Set<java.lang.String> , java.util.concurrent.atomic.AtomicBoolean ) ; org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; SimplePool < java.lang.String > org.springframework.integration.util.SimplePool<java.lang.String> = org.springframework.integration.util.SimplePool<java.lang.String> ( NUMBER , java.util.Set<java.lang.String> , java.util.concurrent.atomic.AtomicBoolean ) ; java.util.concurrent.Semaphore java.util.concurrent.Semaphore = TestUtils . getPropertyValue ( org.springframework.integration.util.SimplePool<java.lang.String> , STRING , java.util.concurrent.Semaphore .class ) ; assertEquals ( NUMBER , java.util.concurrent.Semaphore . int ( ) ) ; java.lang.String java.lang.String = org.springframework.integration.util.SimplePool<java.lang.String> . getItem ( ) ; assertEquals ( NUMBER , java.util.concurrent.Semaphore . int ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; assertEquals ( NUMBER , java.util.concurrent.Semaphore . int ( ) ) ; org.springframework.integration.util.SimplePool<java.lang.String> . releaseItem ( java.lang.String ) ; assertEquals ( NUMBER , java.util.concurrent.Semaphore . int ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.util.SimplePool<java.lang.String> < java.lang.String > org.springframework.integration.util.SimplePool<java.lang.String> ( int int , final java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> , final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean ) { SimplePool < java.lang.String > org.springframework.integration.util.SimplePool<java.lang.String> = new SimplePool < java.lang.String > ( int , new SimplePool . SimplePool < java.lang.String > ( ) { private int i ; public String createForPool ( ) { String string = STRING + i ++ ; strings . add ( string ) ; return string ; } public boolean isStale ( String item ) { if ( stale . get ( ) ) { strings . remove ( item ) ; } return stale . get ( ) ; } public void removedFromPool ( String item ) { strings . remove ( item ) ; } } ) ; return org.springframework.integration.util.SimplePool<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public String createForPool ( ) { String string = STRING + i ++ ; strings . add ( string ) ; return string ; }  <METHOD_END>
<METHOD_START> public boolean isStale ( String item ) { if ( stale . get ( ) ) { strings . remove ( item ) ; } return stale . get ( ) ; }  <METHOD_END>
<METHOD_START> public void removedFromPool ( String item ) { strings . remove ( item ) ; }  <METHOD_END>
