<METHOD_START> public void ( final CouchbaseEntityInformation < T , java.lang.String > org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> , final CouchbaseOperations org.springframework.data.couchbase.repository.support.CouchbaseOperations ) { Assert . notNull ( org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> , STRING ) ; Assert . notNull ( org.springframework.data.couchbase.repository.support.CouchbaseOperations , STRING ) ; org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> = org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> ; this . org.springframework.data.couchbase.repository.support.CouchbaseOperations = org.springframework.data.couchbase.repository.support.CouchbaseOperations ; }  <METHOD_END>
<METHOD_START> public void void ( final ViewMetadataProvider org.springframework.data.couchbase.repository.support.ViewMetadataProvider ) { this . org.springframework.data.couchbase.repository.support.ViewMetadataProvider = org.springframework.data.couchbase.repository.support.ViewMetadataProvider ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > S S ( S S ) { Assert . notNull ( S , STRING ) ; org.springframework.data.couchbase.repository.support.CouchbaseOperations . save ( S ) ; return S ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > java.lang.Iterable<S> < S > java.lang.Iterable<S> ( java.lang.Iterable<S> < S > java.lang.Iterable<S> ) { Assert . notNull ( java.lang.Iterable<S> , STRING ) ; java.util.List<S> < S > java.util.List<S> = new java.util.ArrayList<S> < S > ( ) ; for ( S S : java.lang.Iterable<S> ) { S ( S ) ; java.util.List<S> . boolean ( S ) ; } return java.util.List<S> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<T> < T > java.util.Optional<T> ( ID ID ) { Assert . notNull ( ID , STRING ) ; return java.util.Optional . java.util.Optional ( org.springframework.data.couchbase.repository.support.CouchbaseOperations . findById ( ID . java.lang.String ( ) , org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> . getJavaType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ID ID ) { Assert . notNull ( ID , STRING ) ; return org.springframework.data.couchbase.repository.support.CouchbaseOperations . exists ( ID . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ID ID ) { Assert . notNull ( ID , STRING ) ; org.springframework.data.couchbase.repository.support.CouchbaseOperations . remove ( ID . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( T T ) { Assert . notNull ( T , STRING ) ; org.springframework.data.couchbase.repository.support.CouchbaseOperations . remove ( T ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Iterable<? extends T> < ? extends T > java.lang.Iterable<? extends T> ) { Assert . notNull ( java.lang.Iterable<> , STRING ) ; for ( T T : java.lang.Iterable<> ) { org.springframework.data.couchbase.repository.support.CouchbaseOperations . remove ( T ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<T> < T > java.lang.Iterable<T> ( ) { final org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView = org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView ( ) ; ViewQuery org.springframework.data.couchbase.repository.support.ViewQuery = ViewQuery . from ( org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) , org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) ) ; org.springframework.data.couchbase.repository.support.ViewQuery . reduce ( false ) ; org.springframework.data.couchbase.repository.support.ViewQuery . stale ( org.springframework.data.couchbase.repository.support.CouchbaseOperations ( ) . getDefaultConsistency ( ) . viewConsistency ( ) ) ; return org.springframework.data.couchbase.repository.support.CouchbaseOperations . findByView ( org.springframework.data.couchbase.repository.support.ViewQuery , org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> . getJavaType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<T> < T > java.lang.Iterable<T> ( final java.lang.Iterable<ID> < ID > java.lang.Iterable<ID> ) { final org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView = org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView ( ) ; ViewQuery org.springframework.data.couchbase.repository.support.ViewQuery = ViewQuery . from ( org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) , org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) ) ; org.springframework.data.couchbase.repository.support.ViewQuery . reduce ( false ) ; org.springframework.data.couchbase.repository.support.ViewQuery . stale ( org.springframework.data.couchbase.repository.support.CouchbaseOperations ( ) . getDefaultConsistency ( ) . viewConsistency ( ) ) ; JsonArray org.springframework.data.couchbase.repository.support.JsonArray = JsonArray . create ( ) ; for ( ID ID : java.lang.Iterable<ID> ) { org.springframework.data.couchbase.repository.support.JsonArray . add ( ID ) ; } org.springframework.data.couchbase.repository.support.ViewQuery . keys ( org.springframework.data.couchbase.repository.support.JsonArray ) ; return org.springframework.data.couchbase.repository.support.CouchbaseOperations . findByView ( org.springframework.data.couchbase.repository.support.ViewQuery , org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> . getJavaType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { final org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView = org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView ( ) ; ViewQuery org.springframework.data.couchbase.repository.support.ViewQuery = ViewQuery . from ( org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) , org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) ) ; org.springframework.data.couchbase.repository.support.ViewQuery . reduce ( true ) ; org.springframework.data.couchbase.repository.support.ViewQuery . stale ( org.springframework.data.couchbase.repository.support.CouchbaseOperations ( ) . getDefaultConsistency ( ) . viewConsistency ( ) ) ; ViewResult org.springframework.data.couchbase.repository.support.ViewResult = org.springframework.data.couchbase.repository.support.CouchbaseOperations . queryView ( org.springframework.data.couchbase.repository.support.ViewQuery ) ; long long = NUMBER ; for ( ViewRow org.springframework.data.couchbase.repository.support.ViewRow : org.springframework.data.couchbase.repository.support.ViewResult ) { long += java.lang.Long . long ( java.lang.String . java.lang.String ( org.springframework.data.couchbase.repository.support.ViewRow . value ( ) ) ) ; } return long ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { final org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView = org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView ( ) ; ViewQuery org.springframework.data.couchbase.repository.support.ViewQuery = ViewQuery . from ( org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) , org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView . java.lang.String ( ) ) ; org.springframework.data.couchbase.repository.support.ViewQuery . reduce ( false ) ; org.springframework.data.couchbase.repository.support.ViewQuery . stale ( org.springframework.data.couchbase.repository.support.CouchbaseOperations ( ) . getDefaultConsistency ( ) . viewConsistency ( ) ) ; ViewResult org.springframework.data.couchbase.repository.support.ViewResult = org.springframework.data.couchbase.repository.support.CouchbaseOperations . queryView ( org.springframework.data.couchbase.repository.support.ViewQuery ) ; for ( ViewRow org.springframework.data.couchbase.repository.support.ViewRow : org.springframework.data.couchbase.repository.support.ViewResult ) { try { org.springframework.data.couchbase.repository.support.CouchbaseOperations . remove ( org.springframework.data.couchbase.repository.support.ViewRow . id ( ) ) ; } catch ( DataRetrievalFailureException org.springframework.data.couchbase.repository.support.DataRetrievalFailureException ) { if ( ! ( org.springframework.data.couchbase.repository.support.DataRetrievalFailureException . getCause ( ) instanceof DocumentDoesNotExistException ) ) throw org.springframework.data.couchbase.repository.support.DataRetrievalFailureException ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.repository.support.CouchbaseOperations org.springframework.data.couchbase.repository.support.CouchbaseOperations ( ) { return org.springframework.data.couchbase.repository.support.CouchbaseOperations ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> < T , java.lang.String > org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> ( ) { return org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView ( ) { java.lang.String java.lang.String = StringUtils . uncapitalize ( org.springframework.data.couchbase.repository.support.CouchbaseEntityInformation<T,java.lang.String> . getJavaType ( ) . getSimpleName ( ) ) ; java.lang.String java.lang.String = STRING ; final View org.springframework.data.couchbase.repository.support.View = org.springframework.data.couchbase.repository.support.ViewMetadataProvider . getView ( ) ; if ( org.springframework.data.couchbase.repository.support.View != null ) { java.lang.String = org.springframework.data.couchbase.repository.support.View . designDocument ( ) ; java.lang.String = org.springframework.data.couchbase.repository.support.View . viewName ( ) ; } return new org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository<T,ID>.ResolvedView ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( final java.lang.String java.lang.String , final java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
