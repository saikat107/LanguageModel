<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( LuceneIndex org.springframework.data.gemfire.search.lucene.LuceneIndex ) { this . org.springframework.data.gemfire.search.lucene.LuceneIndex = org.springframework.data.gemfire.search.lucene.LuceneIndex ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , Region < ? , ? > org.springframework.data.gemfire.search.lucene.Region<?,?> ) { this . java.lang.String = java.lang.String ; this . org.springframework.data.gemfire.search.lucene.Region<?,?> = org.springframework.data.gemfire.search.lucene.Region<,> ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { this . org.springframework.data.gemfire.search.lucene.GemFireCache = org.springframework.data.gemfire.search.lucene.GemFireCache ( ) ; this . org.springframework.data.gemfire.search.lucene.LuceneService = org.springframework.data.gemfire.search.lucene.LuceneService ( ) ; this . java.lang.String = java.lang.String ( ) ; this . java.lang.String = java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.search.lucene.LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( ) { return org.springframework.data.gemfire.search.lucene.LuceneService ( ) . createLuceneQueryFactory ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.search.lucene.LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( java.lang.String ... java.lang.String[] ) { return org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( DEFAULT_RESULT_LIMIT , DEFAULT_PAGE_SIZE , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.search.lucene.LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( int int , java.lang.String ... java.lang.String[] ) { return org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( int , DEFAULT_PAGE_SIZE , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.gemfire.search.lucene.LuceneQueryFactory org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( int int , int int , java.lang.String ... java.lang.String[] ) { return org.springframework.data.gemfire.search.lucene.LuceneQueryFactory ( ) . setResultLimit ( int ) . setPageSize ( int ) . setProjectionFields ( nullSafeArray ( java.lang.String[] , java.lang.String .class ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.search.lucene.GemFireCache org.springframework.data.gemfire.search.lucene.GemFireCache ( ) { return java.util.Optional . java.util.Optional ( org.springframework.data.gemfire.search.lucene.GemFireCache ( ) ) . orElseGet ( CacheUtils :: resolveGemFireCache ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.search.lucene.LuceneService org.springframework.data.gemfire.search.lucene.LuceneService ( ) { return java.util.Optional . java.util.Optional ( org.springframework.data.gemfire.search.lucene.LuceneService ( ) ) . orElseGet ( ( ) resolveLuceneService ( resolveCache ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.search.lucene.LuceneService org.springframework.data.gemfire.search.lucene.LuceneService ( GemFireCache org.springframework.data.gemfire.search.lucene.GemFireCache ) { Assert . notNull ( org.springframework.data.gemfire.search.lucene.GemFireCache , STRING ) ; return LuceneServiceProvider . get ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = java.util.Optional . java.util.Optional<java.lang.String> ( java.lang.String ( ) ) . java.lang.String ( ( ) safeGetValue ( ( ) getLuceneIndex ( ) . getName ( ) ) ) ; Assert . state ( StringUtils . hasText ( java.lang.String ) , STRING ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = java.util.Optional . java.util.Optional<java.lang.String> ( java.lang.String ( ) ) . java.lang.String ( ( ) safeGetValue ( ( ) getRegion ( ) . getFullPath ( ) ) ) ; Assert . state ( StringUtils . hasText ( java.lang.String ) , STRING ) ; return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.gemfire.search.lucene.LuceneAccessor > T T ( GemFireCache org.springframework.data.gemfire.search.lucene.GemFireCache ) { this . org.springframework.data.gemfire.search.lucene.GemFireCache = org.springframework.data.gemfire.search.lucene.GemFireCache ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.search.lucene.GemFireCache org.springframework.data.gemfire.search.lucene.GemFireCache ( ) { return this . org.springframework.data.gemfire.search.lucene.GemFireCache ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.gemfire.search.lucene.LuceneAccessor > T T ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.gemfire.search.lucene.LuceneAccessor > T T ( LuceneIndex org.springframework.data.gemfire.search.lucene.LuceneIndex ) { this . org.springframework.data.gemfire.search.lucene.LuceneIndex = org.springframework.data.gemfire.search.lucene.LuceneIndex ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.search.lucene.LuceneIndex org.springframework.data.gemfire.search.lucene.LuceneIndex ( ) { return this . org.springframework.data.gemfire.search.lucene.LuceneIndex ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.gemfire.search.lucene.LuceneAccessor > T T ( LuceneService org.springframework.data.gemfire.search.lucene.LuceneService ) { this . org.springframework.data.gemfire.search.lucene.LuceneService = org.springframework.data.gemfire.search.lucene.LuceneService ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.search.lucene.LuceneService org.springframework.data.gemfire.search.lucene.LuceneService ( ) { return this . org.springframework.data.gemfire.search.lucene.LuceneService ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.gemfire.search.lucene.LuceneAccessor > T T ( Region < ? , ? > org.springframework.data.gemfire.search.lucene.Region<?,?> ) { this . org.springframework.data.gemfire.search.lucene.Region<?,?> = org.springframework.data.gemfire.search.lucene.Region<,> ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.search.lucene.Region<?,?> < ? , ? > org.springframework.data.gemfire.search.lucene.Region<?,?> ( ) { return this . org.springframework.data.gemfire.search.lucene.Region<,> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T extends org.springframework.data.gemfire.search.lucene.LuceneAccessor > T T ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> protected < T > T T ( org.springframework.data.gemfire.search.lucene.LuceneAccessor.LuceneQueryExecutor<T> < T > org.springframework.data.gemfire.search.lucene.LuceneAccessor.LuceneQueryExecutor<T> , java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.String java.lang.String ) { try { return org.springframework.data.gemfire.search.lucene.LuceneAccessor.LuceneQueryExecutor<T> . T ( ) ; } catch ( LuceneQueryException org.springframework.data.gemfire.search.lucene.LuceneQueryException ) { throw new DataRetrievalFailureException ( java.lang.String . java.lang.String ( STRING , java.lang.Object , java.lang.String , java.lang.String ) , org.springframework.data.gemfire.search.lucene.LuceneQueryException ) ; } }  <METHOD_END>
<METHOD_START> T T ( ) org.springframework.data.gemfire.search.lucene.LuceneQueryException ;  <METHOD_END>
