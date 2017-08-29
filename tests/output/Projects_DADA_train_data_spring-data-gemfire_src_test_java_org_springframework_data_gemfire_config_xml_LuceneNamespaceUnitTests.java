<METHOD_START> protected void void ( LuceneIndex org.springframework.data.gemfire.config.xml.LuceneIndex , java.lang.String java.lang.String , java.lang.String java.lang.String ) { assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getName ( ) ) . isEqualTo ( java.lang.String ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getRegionPath ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected void void ( LuceneIndex org.springframework.data.gemfire.config.xml.LuceneIndex , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { void ( org.springframework.data.gemfire.config.xml.LuceneIndex , java.lang.String , java.lang.String ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getFieldNames ( ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getFieldAnalyzers ( ) ) . hasSize ( java.lang.String[] . int ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getFieldAnalyzers ( ) ) . containsKeys ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> protected void void ( LuceneIndex org.springframework.data.gemfire.config.xml.LuceneIndex , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { void ( org.springframework.data.gemfire.config.xml.LuceneIndex , java.lang.String , java.lang.String ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getFieldAnalyzers ( ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.gemfire.config.xml.LuceneIndex . getFieldNames ( ) ) . contains ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) { assertThat ( this . org.springframework.data.gemfire.config.xml.LuceneService ) . isNotNull ( ) ; verify ( this . org.springframework.data.gemfire.config.xml.LuceneService , times ( NUMBER ) ) . createIndex ( eq ( STRING ) , eq ( STRING ) , eq ( STRING ) , eq ( STRING ) ) ; verify ( this . org.springframework.data.gemfire.config.xml.LuceneService , times ( NUMBER ) ) . createIndex ( eq ( STRING ) , eq ( STRING ) , isA ( java.util.Map .class ) ) ; verify ( this . org.springframework.data.gemfire.config.xml.LuceneService , never ( ) ) . destroyIndex ( any ( LuceneIndex .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.gemfire.config.xml.LuceneIndex , STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.gemfire.config.xml.LuceneIndex , STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.gemfire.config.xml.LuceneIndex , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( this . org.springframework.data.gemfire.config.xml.LuceneIndex , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.data.gemfire.config.xml.ConfigurableListableBeanFactory ) throws org.springframework.data.gemfire.config.xml.BeansException { org.springframework.data.gemfire.config.xml.ConfigurableListableBeanFactory . getBeanDefinition ( STRING ) . setBeanClassName ( org.springframework.data.gemfire.config.xml.LuceneNamespaceUnitTests.MockLuceneServiceFactoryBean .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.data.gemfire.config.xml.GemFireCache ) . describedAs ( STRING ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.gemfire.config.xml.LuceneService org.springframework.data.gemfire.config.xml.LuceneService ( ) java.lang.Exception { return java.util.Optional . java.util.Optional ( this . org.springframework.data.gemfire.config.xml.LuceneService ) . orElseGet ( ( ) { this . luceneService = mock ( LuceneService .class ) ; Answer < LuceneIndex > mockLuceneIndex = newMockLuceneIndex ( this . luceneService ) ; doAnswer ( mockLuceneIndex ) . when ( this . luceneService ) . createIndex ( anyString ( ) , anyString ( ) , ( String [] ) any ( ) ) ; doAnswer ( mockLuceneIndex ) . when ( this . luceneService ) . createIndex ( anyString ( ) , anyString ( ) , isA ( Map .class ) ) ; return this . luceneService ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.data.gemfire.config.xml.Answer<org.springframework.data.gemfire.config.xml.LuceneIndex> < LuceneIndex > org.springframework.data.gemfire.config.xml.Answer<org.springframework.data.gemfire.config.xml.LuceneIndex> ( LuceneService org.springframework.data.gemfire.config.xml.LuceneService ) { return ( invocationOnMock ) -> { String indexName = invocationOnMock . getArgument ( NUMBER ) ; String regionPath = invocationOnMock . getArgument ( NUMBER ) ; LuceneIndex mockLuceneIndex = mock ( LuceneIndex .class , indexName ) ; when ( mockLuceneIndex . getName ( ) ) . thenReturn ( indexName ) ; when ( mockLuceneIndex . getRegionPath ( ) ) . thenReturn ( regionPath ) ; if ( invocationOnMock . getArguments ( ) . length > NUMBER ) { Object fields = invocationOnMock . getArgument ( NUMBER ) ; if ( fields instanceof Map ) { when ( mockLuceneIndex . getFieldAnalyzers ( ) ) . thenReturn ( ( Map < String , Analyzer > ) fields ) ; when ( mockLuceneIndex . getFieldNames ( ) ) . thenReturn ( EMPTY_STRING_ARRAY ) ; } else { when ( mockLuceneIndex . getFieldAnalyzers ( ) ) . thenReturn ( Collections . emptyMap ( ) ) ; when ( mockLuceneIndex . getFieldNames ( ) ) . thenReturn ( extractFields ( invocationOnMock ) ) ; } } when ( mockLuceneService . getIndex ( eq ( indexName ) , eq ( regionPath ) ) ) . thenReturn ( mockLuceneIndex ) ; return mockLuceneIndex ; } ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( java.lang.Object java.lang.Object ) { return ( java.lang.Object instanceof java.lang.String [] ? ( java.lang.String [] ) java.lang.Object : java.lang.String . java.lang.String ( java.lang.Object ) . java.lang.String[] ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.lang.String [] java.lang.String[] ( InvocationOnMock org.springframework.data.gemfire.config.xml.InvocationOnMock ) { java.lang.String [] java.lang.String[] = new java.lang.String [ org.springframework.data.gemfire.config.xml.InvocationOnMock . getArguments ( ) . length - NUMBER ] ; java.lang.System . void ( org.springframework.data.gemfire.config.xml.InvocationOnMock . getArguments ( ) , NUMBER , java.lang.String[] , NUMBER , java.lang.String[] . int ) ; return java.lang.String[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return java.util.Optional . java.util.Optional ( this . org.springframework.data.gemfire.config.xml.LuceneService ) .< java.lang.Class<?> < ? > > map ( LuceneService :: getClass ) . orElse ( LuceneService .class ) ; }  <METHOD_END>
<METHOD_START> public void void ( GemFireCache org.springframework.data.gemfire.config.xml.GemFireCache ) { this . org.springframework.data.gemfire.config.xml.GemFireCache = org.springframework.data.gemfire.config.xml.GemFireCache ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.gemfire.config.xml.Analyzer org.springframework.data.gemfire.config.xml.Analyzer ( ) java.lang.Exception { return java.util.Optional . java.util.Optional ( this . org.springframework.data.gemfire.config.xml.Analyzer ) . orElseGet ( ( ) this . analyzer = mock ( Analyzer .class , getName ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return java.util.Optional . java.util.Optional ( this . org.springframework.data.gemfire.config.xml.Analyzer ) .< java.lang.Class<?> < ? > > map ( Analyzer :: getClass ) . orElse ( Analyzer .class ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
