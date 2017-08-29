<METHOD_START> public void ( SolrOperations org.springframework.data.solr.repository.support.SolrOperations ) { Assert . notNull ( org.springframework.data.solr.repository.support.SolrOperations , STRING ) ; if ( org.springframework.data.solr.repository.support.SolrOperations instanceof SolrTemplate ) { void ( ( SolrTemplate ) org.springframework.data.solr.repository.support.SolrOperations ) ; } this . org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrOperations ; this . org.springframework.data.solr.repository.support.SolrEntityInformationCreator = new SolrEntityInformationCreatorImpl ( org.springframework.data.solr.repository.support.SolrOperations . getConverter ( ) . getMappingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( SolrClient org.springframework.data.solr.repository.support.SolrClient ) { Assert . notNull ( org.springframework.data.solr.repository.support.SolrClient , STRING ) ; this . org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrTemplate ( org.springframework.data.solr.repository.support.SolrClient , null ) ; org.springframework.data.solr.repository.support.SolrClientFactory = new HttpSolrClientFactory ( org.springframework.data.solr.repository.support.SolrClient ) ; this . org.springframework.data.solr.repository.support.SolrEntityInformationCreator = new SolrEntityInformationCreatorImpl ( this . org.springframework.data.solr.repository.support.SolrOperations . getConverter ( ) . getMappingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( SolrClient org.springframework.data.solr.repository.support.SolrClient , SolrConverter org.springframework.data.solr.repository.support.SolrConverter ) { Assert . notNull ( org.springframework.data.solr.repository.support.SolrClient , STRING ) ; this . org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrTemplate ( org.springframework.data.solr.repository.support.SolrClient , org.springframework.data.solr.repository.support.SolrConverter ) ; org.springframework.data.solr.repository.support.SolrClientFactory = new HttpSolrClientFactory ( org.springframework.data.solr.repository.support.SolrClient ) ; this . org.springframework.data.solr.repository.support.SolrEntityInformationCreator = new SolrEntityInformationCreatorImpl ( this . org.springframework.data.solr.repository.support.SolrOperations . getConverter ( ) . getMappingContext ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.support.SolrTemplate org.springframework.data.solr.repository.support.SolrTemplate ( SolrClient org.springframework.data.solr.repository.support.SolrClient , SolrConverter org.springframework.data.solr.repository.support.SolrConverter ) { SolrTemplate org.springframework.data.solr.repository.support.SolrTemplate = new SolrTemplate ( org.springframework.data.solr.repository.support.SolrClient ) ; if ( org.springframework.data.solr.repository.support.SolrConverter != null ) { org.springframework.data.solr.repository.support.SolrTemplate . setSolrConverter ( org.springframework.data.solr.repository.support.SolrConverter ) ; } void ( org.springframework.data.solr.repository.support.SolrTemplate ) ; org.springframework.data.solr.repository.support.SolrTemplate . afterPropertiesSet ( ) ; return org.springframework.data.solr.repository.support.SolrTemplate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T , ID extends java.io.Serializable > org.springframework.data.solr.repository.support.SolrEntityInformation<T,ID> < T , ID > org.springframework.data.solr.repository.support.SolrEntityInformation<T,ID> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return org.springframework.data.solr.repository.support.SolrEntityInformationCreator . getEntityInformation ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( { STRING , STRING } ) protected java.lang.Object java.lang.Object ( RepositoryInformation org.springframework.data.solr.repository.support.RepositoryInformation ) { SolrOperations org.springframework.data.solr.repository.support.SolrOperations = this . org.springframework.data.solr.repository.support.SolrOperations ; if ( org.springframework.data.solr.repository.support.SolrClientFactory != null ) { SolrTemplate org.springframework.data.solr.repository.support.SolrTemplate = new SolrTemplate ( org.springframework.data.solr.repository.support.SolrClientFactory ) ; if ( this . org.springframework.data.solr.repository.support.SolrOperations . getConverter ( ) != null ) { org.springframework.data.solr.repository.support.SolrTemplate . setMappingContext ( this . org.springframework.data.solr.repository.support.SolrOperations . getConverter ( ) . getMappingContext ( ) ) ; org.springframework.data.solr.repository.support.SolrTemplate . setSolrConverter ( this . org.springframework.data.solr.repository.support.SolrOperations . getConverter ( ) ) ; } void ( org.springframework.data.solr.repository.support.SolrTemplate ) ; org.springframework.data.solr.repository.support.SolrTemplate . afterPropertiesSet ( ) ; org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrTemplate ; } SimpleSolrRepository org.springframework.data.solr.repository.support.SimpleSolrRepository = getTargetRepositoryViaReflection ( org.springframework.data.solr.repository.support.RepositoryInformation , org.springframework.data.solr.repository.support.SolrOperations , org.springframework.data.solr.repository.support.SolrEntityInformation ( org.springframework.data.solr.repository.support.RepositoryInformation . getDomainType ( ) ) ) ; this . org.springframework.data.solr.repository.support.SolrRepositoryFactory.SolrTemplateHolder . void ( org.springframework.data.solr.repository.support.RepositoryInformation . getDomainType ( ) , org.springframework.data.solr.repository.support.SolrOperations ) ; return org.springframework.data.solr.repository.support.SimpleSolrRepository ; }  <METHOD_END>
<METHOD_START> private void void ( SolrTemplate org.springframework.data.solr.repository.support.SolrTemplate ) { if ( boolean ( ) ) { org.springframework.data.solr.repository.support.SolrTemplate . setSchemaCreationFeatures ( java.util.Collections . java.util.List ( Feature . CREATE_MISSING_FIELDS ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( RepositoryMetadata org.springframework.data.solr.repository.support.RepositoryMetadata ) { if ( boolean ( org.springframework.data.solr.repository.support.RepositoryMetadata . getRepositoryInterface ( ) ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } return SimpleSolrRepository .class ; }  <METHOD_END>
<METHOD_START> private static boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return QUERY_DSL_PRESENT && QuerydslPredicateExecutor .class . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Optional<org.springframework.data.solr.repository.support.QueryLookupStrategy> < QueryLookupStrategy > java.util.Optional<org.springframework.data.solr.repository.support.QueryLookupStrategy> ( Key org.springframework.data.solr.repository.support.Key , EvaluationContextProvider org.springframework.data.solr.repository.support.EvaluationContextProvider ) { return java.util.Optional . java.util.Optional<org.springframework.data.solr.repository.support.SolrRepositoryFactory.SolrQueryLookupStrategy> ( new org.springframework.data.solr.repository.support.SolrRepositoryFactory.SolrQueryLookupStrategy ( ) ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.solr.repository.support.RepositoryQuery org.springframework.data.solr.repository.support.RepositoryQuery ( java.lang.reflect.Method java.lang.reflect.Method , RepositoryMetadata org.springframework.data.solr.repository.support.RepositoryMetadata , ProjectionFactory org.springframework.data.solr.repository.support.ProjectionFactory , NamedQueries org.springframework.data.solr.repository.support.NamedQueries ) { SolrQueryMethod org.springframework.data.solr.repository.support.SolrQueryMethod = new SolrQueryMethod ( java.lang.reflect.Method , org.springframework.data.solr.repository.support.RepositoryMetadata , org.springframework.data.solr.repository.support.ProjectionFactory , org.springframework.data.solr.repository.support.SolrEntityInformationCreator ) ; java.lang.String java.lang.String = org.springframework.data.solr.repository.support.SolrQueryMethod . getNamedQueryName ( ) ; SolrOperations org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrOperations ( org.springframework.data.solr.repository.support.RepositoryMetadata ) ; if ( org.springframework.data.solr.repository.support.NamedQueries . hasQuery ( java.lang.String ) ) { java.lang.String java.lang.String = org.springframework.data.solr.repository.support.NamedQueries . getQuery ( java.lang.String ) ; return new StringBasedSolrQuery ( java.lang.String , org.springframework.data.solr.repository.support.SolrQueryMethod , org.springframework.data.solr.repository.support.SolrOperations ) ; } else if ( org.springframework.data.solr.repository.support.SolrQueryMethod . hasAnnotatedQuery ( ) ) { return new StringBasedSolrQuery ( org.springframework.data.solr.repository.support.SolrQueryMethod , org.springframework.data.solr.repository.support.SolrOperations ) ; } else { return new PartTreeSolrQuery ( org.springframework.data.solr.repository.support.SolrQueryMethod , org.springframework.data.solr.repository.support.SolrOperations ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.support.SolrOperations org.springframework.data.solr.repository.support.SolrOperations ( RepositoryMetadata org.springframework.data.solr.repository.support.RepositoryMetadata ) { SolrOperations org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrRepositoryFactory.SolrTemplateHolder . org.springframework.data.solr.repository.support.SolrOperations ( org.springframework.data.solr.repository.support.RepositoryMetadata . getDomainType ( ) ) ; if ( org.springframework.data.solr.repository.support.SolrOperations == null ) { org.springframework.data.solr.repository.support.SolrOperations = org.springframework.data.solr.repository.support.SolrOperations ; } return org.springframework.data.solr.repository.support.SolrOperations ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.Class<?> < ? > java.lang.Class<?> , SolrOperations org.springframework.data.solr.repository.support.SolrOperations ) { java.util.Map<java.lang.Class<?>,org.springframework.data.solr.repository.support.SolrOperations> . put ( java.lang.Class<> , org.springframework.data.solr.repository.support.SolrOperations ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.solr.repository.support.SolrOperations org.springframework.data.solr.repository.support.SolrOperations ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return java.util.Map<java.lang.Class<?>,org.springframework.data.solr.repository.support.SolrOperations> . get ( java.lang.Class<> ) ; }  <METHOD_END>
