<METHOD_START> public void ( MappingContext < ? extends SolrPersistentEntity < ? > , SolrPersistentProperty > org.springframework.data.solr.repository.support.MappingContext<? extends org.springframework.data.solr.repository.support.SolrPersistentEntity<?>,org.springframework.data.solr.repository.support.SolrPersistentProperty> ) { Assert . notNull ( org.springframework.data.solr.repository.support.MappingContext<,org.springframework.data.solr.repository.support.SolrPersistentProperty> , STRING ) ; this . org.springframework.data.solr.repository.support.MappingContext<? extends org.springframework.data.solr.repository.support.SolrPersistentEntity<?>,org.springframework.data.solr.repository.support.SolrPersistentProperty> = org.springframework.data.solr.repository.support.MappingContext<,org.springframework.data.solr.repository.support.SolrPersistentProperty> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public < T , ID extends java.io.Serializable > org.springframework.data.solr.repository.support.SolrEntityInformation<T,ID> < T , ID > org.springframework.data.solr.repository.support.SolrEntityInformation<T,ID> ( java.lang.Class<T> < T > java.lang.Class<T> ) { SolrPersistentEntity < T > org.springframework.data.solr.repository.support.SolrPersistentEntity<T> = ( SolrPersistentEntity < T > ) org.springframework.data.solr.repository.support.MappingContext<,org.springframework.data.solr.repository.support.SolrPersistentProperty> . getPersistentEntity ( java.lang.Class<T> ) . orElseThrow ( ( ) new IllegalArgumentException ( STRING + domainClass ) ) ; return new MappingSolrEntityInformation <> ( org.springframework.data.solr.repository.support.SolrPersistentEntity<T> ) ; }  <METHOD_END>
