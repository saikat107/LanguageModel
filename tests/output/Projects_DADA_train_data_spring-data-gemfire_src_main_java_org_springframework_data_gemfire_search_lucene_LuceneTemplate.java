<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( LuceneIndex org.springframework.data.gemfire.search.lucene.LuceneIndex ) { super( org.springframework.data.gemfire.search.lucene.LuceneIndex ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , Region < ? , ? > org.springframework.data.gemfire.search.lucene.Region<?,?> ) { super( java.lang.String , org.springframework.data.gemfire.search.lucene.Region<,> ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { super( java.lang.String , java.lang.String ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < K , V > java.util.List<org.springframework.data.gemfire.search.lucene.LuceneResultStruct<K,V>> < LuceneResultStruct < K , V > > java.util.List<org.springframework.data.gemfire.search.lucene.LuceneResultStruct<K,V>> ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int , java.lang.String ... java.lang.String[] ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int , java.lang.String[] ) ; LuceneQuery < K , V > org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , java.lang.String , java.lang.String ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> :: findResults , java.lang.String , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < K , V > org.springframework.data.gemfire.search.lucene.PageableLuceneQueryResults<K,V> < K , V > org.springframework.data.gemfire.search.lucene.PageableLuceneQueryResults<K,V> ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int , int int , java.lang.String ... java.lang.String[] ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int , int , java.lang.String[] ) ; LuceneQuery < K , V > org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , java.lang.String , java.lang.String ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> :: findPages , java.lang.String , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < K , V > java.util.List<org.springframework.data.gemfire.search.lucene.LuceneResultStruct<K,V>> < LuceneResultStruct < K , V > > java.util.List<org.springframework.data.gemfire.search.lucene.LuceneResultStruct<K,V>> ( LuceneQueryProvider org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , int int , java.lang.String ... java.lang.String[] ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int , java.lang.String[] ) ; LuceneQuery < K , V > org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> :: findResults , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < K , V > org.springframework.data.gemfire.search.lucene.PageableLuceneQueryResults<K,V> < K , V > org.springframework.data.gemfire.search.lucene.PageableLuceneQueryResults<K,V> ( LuceneQueryProvider org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , int int , int int , java.lang.String ... java.lang.String[] ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int , int , java.lang.String[] ) ; LuceneQuery < K , V > org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<K,V> :: findPages , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < K > java.util.Collection<K> < K > java.util.Collection<K> ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int ) ; LuceneQuery < K , ? > org.springframework.data.gemfire.search.lucene.LuceneQuery<K,?> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , java.lang.String , java.lang.String ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<K,> :: findKeys , java.lang.String , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < K > java.util.Collection<K> < K > java.util.Collection<K> ( LuceneQueryProvider org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , int int ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int ) ; LuceneQuery < K , ? > org.springframework.data.gemfire.search.lucene.LuceneQuery<K,?> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<K,> :: findKeys , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < V > java.util.Collection<V> < V > java.util.Collection<V> ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int ) ; LuceneQuery < ? , V > org.springframework.data.gemfire.search.lucene.LuceneQuery<?,V> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , java.lang.String , java.lang.String ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<,V> :: findValues , java.lang.String , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < V > java.util.Collection<V> < V > java.util.Collection<V> ( LuceneQueryProvider org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , int int ) { java.lang.String java.lang.String = resolveIndexName ( ) ; java.lang.String java.lang.String = resolveRegionPath ( ) ; LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory = createLuceneQueryFactory ( int ) ; LuceneQuery < ? , V > org.springframework.data.gemfire.search.lucene.LuceneQuery<?,V> = org.springframework.data.gemfire.search.lucene.LuceneQueryFactory . create ( java.lang.String , java.lang.String , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider ) ; return doFind ( org.springframework.data.gemfire.search.lucene.LuceneQuery<,V> :: findValues , org.springframework.data.gemfire.search.lucene.LuceneQueryProvider , java.lang.String , java.lang.String ) ; }  <METHOD_END>
