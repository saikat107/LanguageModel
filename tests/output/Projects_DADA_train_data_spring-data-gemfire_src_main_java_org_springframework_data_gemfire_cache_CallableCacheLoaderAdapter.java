<METHOD_START> public void ( CacheLoader < K , V > org.springframework.data.gemfire.cache.CacheLoader<K,V> ) { this( org.springframework.data.gemfire.cache.CacheLoader<K,V> , null , null , null ); }  <METHOD_END>
<METHOD_START> public void ( CacheLoader < K , V > org.springframework.data.gemfire.cache.CacheLoader<K,V> , K K , Region < K , V > org.springframework.data.gemfire.cache.Region<K,V> ) { this( org.springframework.data.gemfire.cache.CacheLoader<K,V> , K , org.springframework.data.gemfire.cache.Region<K,V> , null ); }  <METHOD_END>
<METHOD_START> public void ( CacheLoader < K , V > org.springframework.data.gemfire.cache.CacheLoader<K,V> , K K , Region < K , V > org.springframework.data.gemfire.cache.Region<K,V> , java.lang.Object java.lang.Object ) { Assert . notNull ( org.springframework.data.gemfire.cache.CacheLoader<K,V> , STRING ) ; this . org.springframework.data.gemfire.cache.CacheLoader<K,V> = org.springframework.data.gemfire.cache.CacheLoader<K,V> ; this . java.lang.Object = java.lang.Object ; this . K = K ; this . org.springframework.data.gemfire.cache.Region<K,V> = org.springframework.data.gemfire.cache.Region<K,V> ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ) { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.cache.CacheLoader<K,V> < K , V > org.springframework.data.gemfire.cache.CacheLoader<K,V> ( ) { return org.springframework.data.gemfire.cache.CacheLoader<K,V> ; }  <METHOD_END>
<METHOD_START> protected K K ( ) { return K ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.cache.Region<K,V> < K , V > org.springframework.data.gemfire.cache.Region<K,V> ( ) { return org.springframework.data.gemfire.cache.Region<K,V> ; }  <METHOD_END>
<METHOD_START> public final V V ( ) java.lang.Exception { Assert . state ( K ( ) != null , STRING ) ; Assert . state ( org.springframework.data.gemfire.cache.Region<K,V> ( ) != null , STRING ) ; return V ( new LoaderHelper < K , V > ( ) { public V V ( final boolean boolean ) throws org.springframework.data.gemfire.cache.CacheLoaderException , org.springframework.data.gemfire.cache.TimeoutException { throw new java.lang.UnsupportedOperationException ( STRING ) ; } public K K ( ) { return org.springframework.data.gemfire.cache.CallableCacheLoaderAdapter .this . K ( ) ; } public org.springframework.data.gemfire.cache.Region<K,V> < K , V > org.springframework.data.gemfire.cache.Region<K,V> ( ) { return org.springframework.data.gemfire.cache.CallableCacheLoaderAdapter .this . org.springframework.data.gemfire.cache.Region<K,V> ( ) ; } public java.lang.Object java.lang.Object ( ) { return org.springframework.data.gemfire.cache.CallableCacheLoaderAdapter .this . java.lang.Object ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> public V V ( final boolean boolean ) throws org.springframework.data.gemfire.cache.CacheLoaderException , org.springframework.data.gemfire.cache.TimeoutException { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> public K K ( ) { return org.springframework.data.gemfire.cache.CallableCacheLoaderAdapter .this . K ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.cache.Region<K,V> < K , V > org.springframework.data.gemfire.cache.Region<K,V> ( ) { return org.springframework.data.gemfire.cache.CallableCacheLoaderAdapter .this . org.springframework.data.gemfire.cache.Region<K,V> ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return org.springframework.data.gemfire.cache.CallableCacheLoaderAdapter .this . java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.data.gemfire.cache.CacheLoader<K,V> ( ) . close ( ) ; }  <METHOD_END>
<METHOD_START> public V V ( LoaderHelper < K , V > org.springframework.data.gemfire.cache.LoaderHelper<K,V> ) throws org.springframework.data.gemfire.cache.CacheLoaderException { return org.springframework.data.gemfire.cache.CacheLoader<K,V> ( ) . load ( org.springframework.data.gemfire.cache.LoaderHelper<K,V> ) ; }  <METHOD_END>
