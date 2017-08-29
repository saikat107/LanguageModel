<METHOD_START> public void ( SolrOperations org.springframework.data.solr.repository.support.SolrOperations , SolrEntityInformation < T , ? > org.springframework.data.solr.repository.support.SolrEntityInformation<T,?> ) { Assert . notNull ( org.springframework.data.solr.repository.support.SolrEntityInformation<T,> , STRING ) ; this . org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrOperations ; this . org.springframework.data.solr.repository.support.SolrEntityInformation<T,?> = org.springframework.data.solr.repository.support.SolrEntityInformation<T,> ; this . java.lang.Class<T> = this . org.springframework.data.solr.repository.support.SolrEntityInformation<T,> . getJavaType ( ) ; this . java.lang.String = this . org.springframework.data.solr.repository.support.SolrEntityInformation<T,> . getIdAttribute ( ) ; this . java.lang.String = this . org.springframework.data.solr.repository.support.SolrEntityInformation<T,> . getSolrCoreName ( ) ; }  <METHOD_END>
<METHOD_START> public void ( SolrOperations org.springframework.data.solr.repository.support.SolrOperations , java.lang.Class<T> < T > java.lang.Class<T> ) { this( org.springframework.data.solr.repository.support.SolrOperations , org.springframework.data.solr.repository.support.SolrEntityInformation ( java.lang.Class<T> ) ); }  <METHOD_END>
<METHOD_START> private static org.springframework.data.solr.repository.support.SolrEntityInformation org.springframework.data.solr.repository.support.SolrEntityInformation ( java.lang.Class java.lang.Class ) { return new SolrEntityInformationCreatorImpl ( new SimpleSolrMappingContext ( ) ) . getEntityInformation ( java.lang.Class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<T> < T > java.util.Optional<T> ( ID ID ) { return org.springframework.data.solr.repository.support.SolrOperations ( ) . queryForObject ( new SimpleQuery ( new Criteria ( this . java.lang.String ) . is ( ID ) ) , java.lang.Class<T> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<T> < T > java.lang.Iterable<T> ( ) { int int = ( int ) this . long ( ) ; if ( int == NUMBER ) { return new PageImpl <> ( java.util.Collections .< T > java.util.List<T> ( ) ) ; } return this . org.springframework.data.solr.repository.support.Page<T> ( new SolrPageRequest ( NUMBER , int ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.solr.repository.support.Page<T> < T > org.springframework.data.solr.repository.support.Page<T> ( Pageable org.springframework.data.solr.repository.support.Pageable ) { return org.springframework.data.solr.repository.support.SolrOperations ( ) . queryForPage ( java.lang.String , new SimpleQuery ( new Criteria ( Criteria . WILDCARD ) . expression ( Criteria . WILDCARD ) ) . setPageRequest ( org.springframework.data.solr.repository.support.Pageable ) , java.lang.Class<T> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<T> < T > java.lang.Iterable<T> ( Sort org.springframework.data.solr.repository.support.Sort ) { int int = ( int ) this . long ( ) ; if ( int == NUMBER ) { return new PageImpl <> ( java.util.Collections .< T > java.util.List<T> ( ) ) ; } return org.springframework.data.solr.repository.support.SolrOperations ( ) . queryForPage ( java.lang.String , new SimpleQuery ( new Criteria ( Criteria . WILDCARD ) . expression ( Criteria . WILDCARD ) ) . setPageRequest ( new SolrPageRequest ( NUMBER , int ) ) . addSort ( org.springframework.data.solr.repository.support.Sort ) , java.lang.Class<T> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<T> < T > java.lang.Iterable<T> ( java.lang.Iterable<ID> < ID > java.lang.Iterable<ID> ) { org . springframework . data . solr . org.springframework.data.solr.core . org.springframework.data.solr.core . org.springframework.data.solr.core org.springframework.data.solr.core.query.Query = new SimpleQuery ( new Criteria ( this . java.lang.String ) . in ( java.lang.Iterable<ID> ) ) ; org.springframework.data.solr.core.query.Query . setPageRequest ( new SolrPageRequest ( NUMBER , ( int ) long ( org.springframework.data.solr.core.query.Query ) ) ) ; return org.springframework.data.solr.repository.support.SolrOperations ( ) . queryForPage ( java.lang.String , org.springframework.data.solr.core.query.Query , java.lang.Class<T> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return long ( new SimpleQuery ( new Criteria ( Criteria . WILDCARD ) . expression ( Criteria . WILDCARD ) ) ) ; }  <METHOD_END>
<METHOD_START> protected long long ( org . springframework . data . solr . org.springframework.data.solr.core . org.springframework.data.solr.core . org.springframework.data.solr.core org.springframework.data.solr.core.query.Query ) { org . springframework . data . solr . org.springframework.data.solr.core . org.springframework.data.solr.core . org.springframework.data.solr.core org.springframework.data.solr.core.query.Query = SimpleQuery . fromQuery ( org.springframework.data.solr.core.query.Query ) ; return org.springframework.data.solr.repository.support.SolrOperations ( ) . count ( java.lang.String , org.springframework.data.solr.core.query.Query ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > S S ( S S ) { Assert . notNull ( S , STRING ) ; void ( ) ; this . org.springframework.data.solr.repository.support.SolrOperations . saveBean ( java.lang.String , S ) ; void ( ) ; return S ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > java.lang.Iterable<S> < S > java.lang.Iterable<S> ( java.lang.Iterable<S> < S > java.lang.Iterable<S> ) { Assert . notNull ( java.lang.Iterable<S> , STRING ) ; if ( ! ( java.lang.Iterable<S> instanceof java.util.Collection<?> < ? > ) ) { throw new InvalidDataAccessApiUsageException ( STRING ) ; } void ( ) ; this . org.springframework.data.solr.repository.support.SolrOperations . saveBeans ( java.lang.String , ( java.util.Collection<? extends T> < ? extends T > ) java.lang.Iterable<S> ) ; void ( ) ; return java.lang.Iterable<S> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ID ID ) { return java.util.Optional<T> ( ID ) . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ID ID ) { Assert . notNull ( ID , STRING ) ; void ( ) ; this . org.springframework.data.solr.repository.support.SolrOperations . deleteById ( java.lang.String , ID . java.lang.String ( ) ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( T T ) { Assert . notNull ( T , STRING ) ; void ( java.util.Collections . java.util.List<T> ( T ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Iterable<? extends T> < ? extends T > java.lang.Iterable<? extends T> ) { Assert . notNull ( java.lang.Iterable<> , STRING ) ; java.util.ArrayList<java.lang.String> < java.lang.String > java.util.ArrayList<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( T T : java.lang.Iterable<> ) { java.util.ArrayList<java.lang.String> . boolean ( java.lang.Object ( T ) . java.lang.String ( ) ) ; } void ( ) ; this . org.springframework.data.solr.repository.support.SolrOperations . deleteById ( java.lang.String , java.util.ArrayList<java.lang.String> ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { void ( ) ; this . org.springframework.data.solr.repository.support.SolrOperations . delete ( java.lang.String , new SimpleFilterQuery ( new Criteria ( Criteria . WILDCARD ) . expression ( Criteria . WILDCARD ) ) ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> public final java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<T> < T > java.lang.Class<T> ( ) { if ( ! boolean ( ) ) { throw new InvalidDataAccessApiUsageException ( STRING ) ; } return java.lang.Class<T> ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return java.lang.Class<T> != null ; }  <METHOD_END>
<METHOD_START> public final org.springframework.data.solr.repository.support.SolrOperations org.springframework.data.solr.repository.support.SolrOperations ( ) { return org.springframework.data.solr.repository.support.SolrOperations ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( T T ) { if ( org.springframework.data.solr.repository.support.SolrEntityInformation<T,> != null ) { return org.springframework.data.solr.repository.support.SolrEntityInformation<T,> . getId ( T ) . orElseThrow ( ( ) new IllegalArgumentException ( STRING ) ) ; } SolrInputDocument org.springframework.data.solr.repository.support.SolrInputDocument = this . org.springframework.data.solr.repository.support.SolrOperations . convertBeanToSolrInputDocument ( T ) ; return java.lang.String ( org.springframework.data.solr.repository.support.SolrInputDocument ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( SolrInputDocument org.springframework.data.solr.repository.support.SolrInputDocument ) { Assert . notNull ( org.springframework.data.solr.repository.support.SolrInputDocument . getField ( java.lang.String ) , STRING + java.lang.String + STRING ) ; Assert . notNull ( org.springframework.data.solr.repository.support.SolrInputDocument . getField ( java.lang.String ) . getValue ( ) , STRING ) ; return org.springframework.data.solr.repository.support.SolrInputDocument . getField ( java.lang.String ) . getValue ( ) . toString ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( TransactionSynchronizationManager . isSynchronizationActive ( ) ) { void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { TransactionSynchronizationManager . registerSynchronization ( SolrTransactionSynchronizationAdapterBuilder . forOperations ( this . org.springframework.data.solr.repository.support.SolrOperations ) . onCollection ( java.lang.String ) . withDefaultBehaviour ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( ! TransactionSynchronizationManager . isSynchronizationActive ( ) ) { this . org.springframework.data.solr.repository.support.SolrOperations . commit ( java.lang.String ) ; } }  <METHOD_END>