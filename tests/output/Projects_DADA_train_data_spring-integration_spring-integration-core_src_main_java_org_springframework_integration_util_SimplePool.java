<METHOD_START> public void ( int int , org.springframework.integration.util.SimplePool.PoolItemCallback<T> < T > org.springframework.integration.util.SimplePool.PoolItemCallback<T> ) { if ( int <= NUMBER ) { this . java.util.concurrent.atomic.AtomicInteger . void ( java.lang.Integer . int ) ; this . java.util.concurrent.atomic.AtomicInteger . void ( java.lang.Integer . int ) ; this . java.util.concurrent.Semaphore . void ( java.lang.Integer . int ) ; } else { this . java.util.concurrent.atomic.AtomicInteger . void ( int ) ; this . java.util.concurrent.atomic.AtomicInteger . void ( int ) ; this . java.util.concurrent.Semaphore . void ( int ) ; } this . org.springframework.integration.util.SimplePool.PoolItemCallback<T> = org.springframework.integration.util.SimplePool.PoolItemCallback<T> ; }  <METHOD_END>
<METHOD_START> public synchronized void void ( int int ) { int int = int - this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; this . java.util.concurrent.atomic.AtomicInteger . int ( int ) ; if ( this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( java.lang.String . java.lang.String ( STRING , int , this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ) ; } if ( int > NUMBER ) { this . java.util.concurrent.atomic.AtomicInteger . int ( int ) ; this . java.util.concurrent.Semaphore . void ( int ) ; } else { while ( int < NUMBER ) { if ( ! this . java.util.concurrent.Semaphore . boolean ( ) ) { break; } T T = this . java.util.concurrent.BlockingQueue<T> . T ( ) ; if ( T == null ) { this . java.util.concurrent.Semaphore . void ( ) ; break; } void ( T ) ; this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; int ++ ; } } if ( int < NUMBER && this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( java.lang.String . java.lang.String ( STRING , - int ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized int int ( ) { return this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.util.concurrent.BlockingQueue<T> . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.util.Set<T> . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.util.Set<T> . int ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . long = long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( ) { boolean boolean = false ; try { try { boolean = this . java.util.concurrent.Semaphore . boolean ( this . long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; throw new MessagingException ( STRING , java.lang.InterruptedException ) ; } if ( ! boolean ) { throw new java.lang.IllegalStateException ( STRING ) ; } return T ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { if ( boolean ) { this . java.util.concurrent.Semaphore . void ( ) ; } if ( java.lang.Exception instanceof MessagingException ) { throw ( MessagingException ) java.lang.Exception ; } throw new MessagingException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private T T ( ) { T T = this . java.util.concurrent.BlockingQueue<T> . T ( ) ; if ( T != null && this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( STRING + T + STRING ) ; } if ( T == null ) { T = this . org.springframework.integration.util.SimplePool.PoolItemCallback<T> . T ( ) ; if ( this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( STRING + T + STRING ) ; } this . java.util.Set<T> . boolean ( T ) ; } else if ( this . org.springframework.integration.util.SimplePool.PoolItemCallback<T> . boolean ( T ) ) { if ( this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( STRING + T + STRING ) ; } void ( T ) ; T = T ( ) ; } this . java.util.Set<T> . boolean ( T ) ; return T ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized void void ( T T ) { Assert . notNull ( T , STRING ) ; Assert . isTrue ( this . java.util.Set<T> . boolean ( T ) , STRING ) ; if ( this . java.util.Set<T> . boolean ( T ) ) { if ( this . java.util.concurrent.atomic.AtomicInteger . int ( ) > this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) { this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; if ( T != null ) { void ( T ) ; } } else { if ( this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( STRING + T + STRING ) ; } if ( T != null ) { this . java.util.concurrent.BlockingQueue<T> . boolean ( T ) ; this . java.util.Set<T> . boolean ( T ) ; } this . java.util.concurrent.Semaphore . void ( ) ; } } else { if ( this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( STRING + T + STRING ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized void void ( ) { T T ; while ( ( T = this . java.util.concurrent.BlockingQueue<T> . T ( ) ) != null ) { void ( T ) ; } }  <METHOD_END>
<METHOD_START> private void void ( T T ) { if ( this . org.springframework.integration.util.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.util.Log . debug ( STRING + T + STRING ) ; } this . java.util.Set<T> . boolean ( T ) ; this . java.util.Set<T> . boolean ( T ) ; this . org.springframework.integration.util.SimplePool.PoolItemCallback<T> . void ( T ) ; }  <METHOD_END>
<METHOD_START> T T ( )  <METHOD_END>
<METHOD_START> boolean boolean ( T T );  <METHOD_END>
<METHOD_START> void void ( T T );  <METHOD_END>
