<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.Object> <> ( null ) . open ( ) . open ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.Object> <> ( null ) . open ( ) . hasNext ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.util.NoSuchElementException .class ) public void void ( ) { new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.Object> <> ( null ) . open ( ) . next ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; DelegatingCursor < java.lang.String > org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> = new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake <> ( java.util.Collections . java.util.Set ( org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> ) ) . open ( ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; DelegatingCursor < java.lang.String > org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> = new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake <> ( java.util.Collections . java.util.Set ( org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> ) ) . open ( ) ; org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) ; org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) ; org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . hasNext ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; @ java.lang.SuppressWarnings ( STRING ) DelegatingCursor < java.lang.String > org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> = new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake <> ( java.util.Arrays . java.util.List ( org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> , org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> ) ) . open ( ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; @ java.lang.SuppressWarnings ( STRING ) DelegatingCursor < java.lang.String > org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> = new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake <> ( java.util.Arrays . java.util.List ( org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> , org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> ) ) . open ( ) ; org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) ; org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) ; org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . hasNext ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; PartialResult < java.lang.String > org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> = new PartialResult <> ( STRING , java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; @ java.lang.SuppressWarnings ( STRING ) DelegatingCursor < java.lang.String > org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> = new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake <> ( java.util.Arrays . java.util.List ( org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> , org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> , org.springframework.data.solr.core.query.result.PartialResult<java.lang.String> ) ) . open ( ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . hasNext ( ) , is ( true ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . isFinished ( ) , is ( false ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . hasNext ( ) , is ( true ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . isFinished ( ) , is ( false ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . hasNext ( ) , is ( true ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . isFinished ( ) , is ( true ) ) ; assertThat ( org.springframework.data.solr.core.query.result.DelegatingCursor<java.lang.String> . next ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SolrQuery org.springframework.data.solr.core.query.result.SolrQuery = new SolrQuery ( STRING ) ; org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.String> < java.lang.String > org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.String> = new org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake <> ( org.springframework.data.solr.core.query.result.SolrQuery , null ) ; org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.String> . open ( ) ; SolrQuery org.springframework.data.solr.core.query.result.SolrQuery = org.springframework.data.solr.core.query.result.DelegatingCursorUnitTests.DelegatingCursorFake<java.lang.String> . org.springframework.data.solr.core.query.result.SolrQuery ( ) ; assertThat ( org.springframework.data.solr.core.query.result.SolrQuery , not ( equalTo ( org.springframework.data.solr.core.query.result.SolrQuery ) ) ) ; assertThat ( org.springframework.data.solr.core.query.result.SolrQuery . getQuery ( ) , equalTo ( org.springframework.data.solr.core.query.result.SolrQuery . getQuery ( ) ) ) ; assertThat ( org.springframework.data.solr.core.query.result.SolrQuery . get ( CursorMarkParams . CURSOR_MARK_PARAM ) , equalTo ( CursorMarkParams . CURSOR_MARK_START ) ) ; assertThat ( org.springframework.data.solr.core.query.result.SolrQuery . get ( CursorMarkParams . CURSOR_MARK_PARAM ) , nullValue ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> < PartialResult < T > > java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> ) { this( new SolrQuery ( ) , java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> ); }  <METHOD_END>
<METHOD_START> protected void ( SolrQuery org.springframework.data.solr.core.query.result.SolrQuery , java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> < PartialResult < T > > java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> ) { super( org.springframework.data.solr.core.query.result.SolrQuery ); if ( ! CollectionUtils . isEmpty ( java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> ) ) { this . java.util.List<org.springframework.data.solr.core.query.result.PartialResult<T>> . addAll ( java.util.Collection<org.springframework.data.solr.core.query.result.PartialResult<T>> ) ; } this . int = NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org . springframework . data . solr . core . query . result . org.springframework.data.solr.core.query.result.DelegatingCursor . org.springframework.data.solr.core.query.result.DelegatingCursor < T > doLoad ( SolrQuery org.springframework.data.solr.core.query.result.SolrQuery ) { this . org.springframework.data.solr.core.query.result.SolrQuery = org.springframework.data.solr.core.query.result.SolrQuery ; return ( ( ! java.util.List<org.springframework.data.solr.core.query.result.PartialResult<T>> . isEmpty ( ) && int <= java.util.List<org.springframework.data.solr.core.query.result.PartialResult<T>> . size ( ) ) ? java.util.List<org.springframework.data.solr.core.query.result.PartialResult<T>> . get ( int ++ ) : null ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.query.result.SolrQuery org.springframework.data.solr.core.query.result.SolrQuery ( ) { return org.springframework.data.solr.core.query.result.SolrQuery ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
