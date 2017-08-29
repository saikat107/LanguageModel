<METHOD_START> @ Before public void void ( ) { org.springframework.data.solr.repository.SimpleSolrRepository<org.springframework.data.solr.repository.ExampleSolrBean,java.lang.String> = new SimpleSolrRepository <> ( org.springframework.data.solr.repository.SolrOperations , ExampleSolrBean .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new SimpleSolrRepository < ExampleSolrBean , java.lang.String > ( null , ( java.lang.Class ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new SimpleSolrRepository < ExampleSolrBean , java.lang.String > ( new SolrTemplate ( new HttpSolrClient ( STRING ) , null ) , ( java.lang.Class ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.repository.SimpleSolrRepository<org.springframework.data.solr.repository.ExampleSolrBean,java.lang.String> = new SimpleSolrRepository <> ( new SolrTemplate ( new HttpSolrClient ( STRING ) , null ) , ExampleSolrBean .class ) ; Assert . assertEquals ( ExampleSolrBean .class , org.springframework.data.solr.repository.SimpleSolrRepository<org.springframework.data.solr.repository.ExampleSolrBean,java.lang.String> . getEntityClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.data.solr.repository.SolrOperations . count ( Mockito . any ( ) , Mockito . any ( SolrDataQuery .class ) ) ) . thenReturn ( NUMBER ) ; org.springframework.data.solr.repository.SimpleSolrRepository<org.springframework.data.solr.repository.ExampleSolrBean,java.lang.String> . findAll ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; ArgumentCaptor < Query > org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> = ArgumentCaptor . forClass ( Query .class ) ; Mockito . verify ( org.springframework.data.solr.repository.SolrOperations , Mockito . times ( NUMBER ) ) . count ( Mockito . any ( ) , org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . capture ( ) ) ; Mockito . verify ( org.springframework.data.solr.repository.SolrOperations , Mockito . times ( NUMBER ) ) . queryForPage ( Mockito . any ( ) , org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . capture ( ) , Mockito . eq ( ExampleSolrBean .class ) ) ; Assert . assertThat ( org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . getAllValues ( ) . get ( NUMBER ) . getPageRequest ( ) . isUnpaged ( ) , is ( true ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . getAllValues ( ) . get ( NUMBER ) . getPageRequest ( ) . getPageSize ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Mockito . when ( org.springframework.data.solr.repository.SolrOperations . count ( Mockito . any ( ) , Mockito . any ( SolrDataQuery .class ) ) ) . thenReturn ( NUMBER ) ; SimpleSolrRepository < org.springframework.data.solr.repository.SimpleSolrRepositoryTests.BeanWithLongIdType , java.lang.Long > org.springframework.data.solr.repository.SimpleSolrRepository<org.springframework.data.solr.repository.SimpleSolrRepositoryTests.BeanWithLongIdType,java.lang.Long> = new SimpleSolrRepository <> ( org.springframework.data.solr.repository.SolrOperations , org.springframework.data.solr.repository.SimpleSolrRepositoryTests.BeanWithLongIdType .class ) ; org.springframework.data.solr.repository.SimpleSolrRepository<org.springframework.data.solr.repository.SimpleSolrRepositoryTests.BeanWithLongIdType,java.lang.Long> . findAll ( java.util.Arrays . java.util.List<java.lang.Long> ( NUMBER , NUMBER , NUMBER ) ) ; ArgumentCaptor < Query > org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> = ArgumentCaptor . forClass ( Query .class ) ; Mockito . verify ( org.springframework.data.solr.repository.SolrOperations , Mockito . times ( NUMBER ) ) . count ( Mockito . any ( ) , org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . capture ( ) ) ; Mockito . verify ( org.springframework.data.solr.repository.SolrOperations , Mockito . times ( NUMBER ) ) . queryForPage ( Mockito . any ( ) , org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . capture ( ) , Mockito . eq ( org.springframework.data.solr.repository.SimpleSolrRepositoryTests.BeanWithLongIdType .class ) ) ; Assert . assertThat ( org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . getAllValues ( ) . get ( NUMBER ) . getPageRequest ( ) . isUnpaged ( ) , is ( true ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.ArgumentCaptor<org.springframework.data.solr.repository.Query> . getAllValues ( ) . get ( NUMBER ) . getPageRequest ( ) . getPageSize ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Long java.lang.Long ( ) { return java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
