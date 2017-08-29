<METHOD_START> @ Before public void void ( ) { org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> = new QueryParserBase < SolrDataQuery > ( ) { @ java.lang.Override public org.springframework.data.solr.core.SolrQuery org.springframework.data.solr.core.SolrQuery ( SolrDataQuery org.springframework.data.solr.core.SolrDataQuery ) { return null ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.solr.core.SolrQuery org.springframework.data.solr.core.SolrQuery ( SolrDataQuery org.springframework.data.solr.core.SolrDataQuery ) { return null ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new ExpressionProcessor ( ) , OperationKey . EXPRESSION ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new BetweenProcessor ( ) , OperationKey . BETWEEN ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new NearProcessor ( ) , OperationKey . NEAR ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new WithinProcessor ( ) , OperationKey . WITHIN ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new FuzzyProcessor ( ) , OperationKey . FUZZY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new SloppyProcessor ( ) , OperationKey . SLOPPY ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { WildcardProcessor org.springframework.data.solr.core.WildcardProcessor = this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new WildcardProcessor ( ) ; Assert . assertTrue ( org.springframework.data.solr.core.WildcardProcessor . canProcess ( new Predicate ( OperationKey . STARTS_WITH , java.lang.String ) ) ) ; Assert . assertTrue ( org.springframework.data.solr.core.WildcardProcessor . canProcess ( new Predicate ( OperationKey . ENDS_WITH , java.lang.String ) ) ) ; Assert . assertTrue ( org.springframework.data.solr.core.WildcardProcessor . canProcess ( new Predicate ( OperationKey . CONTAINS , java.lang.String ) ) ) ; void ( org.springframework.data.solr.core.WildcardProcessor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { DefaultProcessor org.springframework.data.solr.core.DefaultProcessor = this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new DefaultProcessor ( ) ; Assert . assertTrue ( org.springframework.data.solr.core.DefaultProcessor . canProcess ( new Predicate ( ( java.lang.String ) null , java.lang.String ) ) ) ; Assert . assertTrue ( org.springframework.data.solr.core.DefaultProcessor . canProcess ( new Predicate ( java.lang.String , null ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new FunctionProcessor ( ) , OperationKey . FUNCTION ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) { BasePredicateProcessor org.springframework.data.solr.core.BasePredicateProcessor = this . org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> .new BasePredicateProcessor ( ) { @ Override public boolean canProcess ( Predicate predicate ) { return true ; } @ Override protected Object doProcess ( Predicate predicate , Field field ) { return STRING ; } } ; Assert . assertNull ( org.springframework.data.solr.core.BasePredicateProcessor . process ( null , null ) ) ; Assert . assertNull ( org.springframework.data.solr.core.BasePredicateProcessor . process ( new Predicate ( STRING , null ) , null ) ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.BasePredicateProcessor . process ( new Predicate ( STRING , java.lang.String ) , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Override public boolean canProcess ( Predicate predicate ) { return true ; }  <METHOD_END>
<METHOD_START> @ Override protected Object doProcess ( Predicate predicate , Field field ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( null ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( NUMBER ) ; java.util.List<java.lang.Object> . boolean ( null ) ; org.springframework.data.solr.core.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.solr.core.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.List<java.lang.Object> ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Collections . java.util.List<org.springframework.data.solr.core.QueryParserBaseTests.Bar> ( new org.springframework.data.solr.core.QueryParserBaseTests.Bar ( java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Collections . java.util.List ( new Point ( NUMBER , - NUMBER ) ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Collections . java.util.List<T> ( new Distance ( NUMBER , Metrics . KILOMETERS ) ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.solr.core.QueryParserBaseTests.Foo org.springframework.data.solr.core.QueryParserBaseTests.Foo = new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( java.util.Collections . java.util.List<org.springframework.data.solr.core.QueryParserBaseTests.FooBar> ( new org.springframework.data.solr.core.QueryParserBaseTests.FooBar ( ) ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createFunctionFragment ( org.springframework.data.solr.core.QueryParserBaseTests.Foo , NUMBER ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleCalculatedField org.springframework.data.solr.core.SimpleCalculatedField = new SimpleCalculatedField ( STRING , new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( null ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createCalculatedFieldFragment ( org.springframework.data.solr.core.SimpleCalculatedField ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleCalculatedField org.springframework.data.solr.core.SimpleCalculatedField = new SimpleCalculatedField ( null , new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( null ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createCalculatedFieldFragment ( org.springframework.data.solr.core.SimpleCalculatedField ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpleCalculatedField org.springframework.data.solr.core.SimpleCalculatedField = new SimpleCalculatedField ( STRING , new org.springframework.data.solr.core.QueryParserBaseTests.Foo ( null ) ) ; Assert . assertThat ( org.springframework.data.solr.core.QueryParserBase<org.springframework.data.solr.core.SolrDataQuery> . createCalculatedFieldFragment ( org.springframework.data.solr.core.SimpleCalculatedField ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.solr.core.Function> < Function > java.util.List<org.springframework.data.solr.core.Function> = java.util.Arrays . java.util.List ( Mockito . mock ( Function .class ) , Mockito . mock ( Function .class ) ) ; java.util.List<org.springframework.data.solr.core.Query> < Query > java.util.List<org.springframework.data.solr.core.Query> = java.util.Arrays . java.util.List ( Mockito . mock ( Query .class ) , Mockito . mock ( Query .class ) ) ; Query org.springframework.data.solr.core.Query = Mockito . mock ( Query .class ) ; GroupOptions org.springframework.data.solr.core.GroupOptions = Mockito . mock ( GroupOptions .class ) ; Mockito . when ( org.springframework.data.solr.core.Query . getGroupOptions ( ) ) . thenReturn ( org.springframework.data.solr.core.GroupOptions ) ; Mockito . when ( org.springframework.data.solr.core.GroupOptions . getGroupByFunctions ( ) ) . thenReturn ( java.util.List<org.springframework.data.solr.core.Function> ) ; Mockito . when ( org.springframework.data.solr.core.GroupOptions . getGroupByQueries ( ) ) . thenReturn ( java.util.List<org.springframework.data.solr.core.Query> ) ; NamedObjectsQuery org.springframework.data.solr.core.NamedObjectsQuery = new NamedObjectsQuery ( org.springframework.data.solr.core.Query ) ; org.springframework.data.solr.core.NamedObjectsQuery . setName ( java.util.List<org.springframework.data.solr.core.Function> . get ( NUMBER ) , STRING ) ; org.springframework.data.solr.core.NamedObjectsQuery . setName ( java.util.List<org.springframework.data.solr.core.Function> . get ( NUMBER ) , STRING ) ; org.springframework.data.solr.core.NamedObjectsQuery . setName ( java.util.List<org.springframework.data.solr.core.Query> . get ( NUMBER ) , STRING ) ; org.springframework.data.solr.core.NamedObjectsQuery . setName ( java.util.List<org.springframework.data.solr.core.Query> . get ( NUMBER ) , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.data.solr.core.NamedObjectsQuery . getNamesAssociation ( ) ; Assert . assertEquals ( java.util.List<org.springframework.data.solr.core.Function> . get ( NUMBER ) , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; Assert . assertEquals ( java.util.List<org.springframework.data.solr.core.Function> . get ( NUMBER ) , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; Assert . assertEquals ( java.util.List<org.springframework.data.solr.core.Query> . get ( NUMBER ) , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; Assert . assertEquals ( java.util.List<org.springframework.data.solr.core.Query> . get ( NUMBER ) , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( PredicateProcessor org.springframework.data.solr.core.PredicateProcessor , OperationKey org.springframework.data.solr.core.OperationKey ) { Assert . assertTrue ( org.springframework.data.solr.core.PredicateProcessor . canProcess ( new Predicate ( org.springframework.data.solr.core.OperationKey , java.lang.String ) ) ) ; void ( org.springframework.data.solr.core.PredicateProcessor ) ; }  <METHOD_END>
<METHOD_START> private void void ( PredicateProcessor org.springframework.data.solr.core.PredicateProcessor ) { Assert . assertFalse ( org.springframework.data.solr.core.PredicateProcessor . canProcess ( new Predicate ( java.lang.String , null ) ) ) ; Assert . assertFalse ( org.springframework.data.solr.core.PredicateProcessor . canProcess ( new Predicate ( ( java.lang.String ) null , null ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.List<?> < ? > java.util.List<?> ) { this . java.util.List<?> = java.util.List<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ java.lang.Override public java.util.List java.util.List ( ) { return this . java.util.List<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ! CollectionUtils . isEmpty ( this . java.util.List<> ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.List<?> < ? > java.util.List<?> ) { this . java.util.List<?> = java.util.List<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<?> < ? > java.lang.Iterable<?> ( ) { return this . java.util.List<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ! CollectionUtils . isEmpty ( this . java.util.List<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
