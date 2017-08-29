<METHOD_START> @ java.lang.Override public void void ( RepositoryRestConfiguration org.springframework.data.rest.webmvc.json.RepositoryRestConfiguration ) { org.springframework.data.rest.webmvc.json.RepositoryRestConfiguration . getMetadataConfiguration ( ) . registerJsonSchemaFormat ( JsonSchemaFormat . EMAIL , EmailAddress .class ) ; org.springframework.data.rest.webmvc.json.RepositoryRestConfiguration . getMetadataConfiguration ( ) . registerFormattingPatternFor ( STRING , TypeWithPattern .class ) ; org.springframework.data.rest.webmvc.json.RepositoryRestConfiguration . exposeIdsFor ( Profile .class ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { TestMvcClient . initWebTest ( ) ; ValueTypeSchemaPropertyCustomizerFactory org.springframework.data.rest.webmvc.json.ValueTypeSchemaPropertyCustomizerFactory = mock ( ValueTypeSchemaPropertyCustomizerFactory .class ) ; org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverter = new PersistentEntityToJsonSchemaConverter ( org.springframework.data.rest.webmvc.json.PersistentEntities , org.springframework.data.rest.webmvc.json.Associations , org.springframework.data.rest.webmvc.json.MessageSourceAccessor , org.springframework.data.rest.webmvc.json.ObjectMapper , org.springframework.data.rest.webmvc.json.RepositoryRestConfiguration , org.springframework.data.rest.webmvc.json.ValueTypeSchemaPropertyCustomizerFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( notNullValue ( ) ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( notNullValue ( ) ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( nullValue ( ) ) , STRING ) ) ; void ( Profile .class , java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( nullValue ( ) ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( notNullValue ( ) ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( notNullValue ( ) ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( notNullValue ( ) ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( true ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( true ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( STRING ) , STRING ) ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( nullValue ( ) ) , STRING ) ) ; void ( User .class , java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> = new java.util.ArrayList<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > ( ) ; java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> . boolean ( new org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint ( STRING , is ( notNullValue ( ) ) , STRING ) ) ; void ( SimulatedGroovyDomainClass .class , java.util.List<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Iterable<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> < org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint > java.lang.Iterable<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> ) { java.lang.String java.lang.String = java.lang.String ( java.lang.Class<> ) ; for ( org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint : java.lang.Iterable<org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint> ) { try { assertThat ( org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint . java.lang.String , JsonPath . read ( java.lang.String , org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint . java.lang.String ) , org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint . org.springframework.data.rest.webmvc.json.Matcher ) ; } catch ( PathNotFoundException org.springframework.data.rest.webmvc.json.PathNotFoundException ) { assertThat ( org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint . org.springframework.data.rest.webmvc.json.Matcher . matches ( null ) ) . isTrue ( ) ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { assertThat ( java.lang.RuntimeException , org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverterUnitTests.Constraint . org.springframework.data.rest.webmvc.json.Matcher ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Class<?> < ? > java.lang.Class<?> ) { try { return org.springframework.data.rest.webmvc.json.ObjectMapper . writeValueAsString ( org.springframework.data.rest.webmvc.json.PersistentEntityToJsonSchemaConverter . convert ( java.lang.Class<> ) ) ; } catch ( JsonProcessingException org.springframework.data.rest.webmvc.json.JsonProcessingException ) { throw new java.lang.RuntimeException ( org.springframework.data.rest.webmvc.json.JsonProcessingException ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , Matcher org.springframework.data.rest.webmvc.json.Matcher , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . org.springframework.data.rest.webmvc.json.Matcher = org.springframework.data.rest.webmvc.json.Matcher ; this . java.lang.String = java.lang.String ; }  <METHOD_END>