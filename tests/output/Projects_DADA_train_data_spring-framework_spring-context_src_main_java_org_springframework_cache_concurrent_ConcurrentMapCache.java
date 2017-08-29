<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.String , new java.util.concurrent.ConcurrentHashMap<java.lang.Object,java.lang.Object> <> ( NUMBER ) , true ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , boolean boolean ) { this( java.lang.String , new java.util.concurrent.ConcurrentHashMap<java.lang.Object,java.lang.Object> <> ( NUMBER ) , boolean ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> , boolean boolean ) { this( java.lang.String , java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> , boolean , null ); }  <METHOD_END>
<METHOD_START> protected void ( java.lang.String java.lang.String , java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> , boolean boolean , SerializationDelegate org.springframework.cache.concurrent.SerializationDelegate ) { super( boolean ); Assert . notNull ( java.lang.String , STRING ) ; Assert . notNull ( java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> , STRING ) ; this . java.lang.String = java.lang.String ; this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> = java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> ; this . org.springframework.cache.concurrent.SerializationDelegate = org.springframework.cache.concurrent.SerializationDelegate ; }  <METHOD_END>
<METHOD_START> public final boolean boolean ( ) { return ( this . org.springframework.cache.concurrent.SerializationDelegate != null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> ( ) { return this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.util.concurrent.Callable<T> < T > java.util.concurrent.Callable<T> ) { if ( this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . boolean ( java.lang.Object ) ) { return ( T ) T ( java.lang.Object ) . get ( ) ; } else { return ( T ) java.lang.Object ( this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object , java.lang.Object -> { try { return java.lang.Object ( java.util.concurrent.Callable<T> . T ( ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new ValueRetrievalException ( java.lang.Object , java.util.concurrent.Callable<T> , java.lang.Throwable ) ; } } ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object , java.lang.Object ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cache.concurrent.ValueWrapper org.springframework.cache.concurrent.ValueWrapper ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object , java.lang.Object ( java.lang.Object ) ) ; return toValueWrapper ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . java.lang.Object ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . java.util.concurrent.ConcurrentMap<java.lang.Object,java.lang.Object> . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = super. toStoreValue ( java.lang.Object ) ; if ( this . org.springframework.cache.concurrent.SerializationDelegate != null ) { try { return java.lang.Object ( java.lang.Object ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING , java.lang.Throwable ) ; } } else { return java.lang.Object ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) throws java.io.IOException { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; try { this . org.springframework.cache.concurrent.SerializationDelegate . serialize ( java.lang.Object , java.io.ByteArrayOutputStream ) ; return java.io.ByteArrayOutputStream . byte[] ( ) ; } finally { java.io.ByteArrayOutputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { if ( this . org.springframework.cache.concurrent.SerializationDelegate != null ) { try { return super. fromStoreValue ( java.lang.Object ( java.lang.Object ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Object + STRING , java.lang.Throwable ) ; } } else { return super. fromStoreValue ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) throws java.io.IOException { java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( ( byte [] ) java.lang.Object ) ; try { return this . org.springframework.cache.concurrent.SerializationDelegate . deserialize ( java.io.ByteArrayInputStream ) ; } finally { java.io.ByteArrayInputStream . void ( ) ; } }  <METHOD_END>