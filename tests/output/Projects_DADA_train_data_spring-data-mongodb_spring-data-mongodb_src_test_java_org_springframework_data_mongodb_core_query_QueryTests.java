<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . is ( STRING ) . and ( STRING ) . lt ( NUMBER ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . is ( STRING ) . and ( STRING ) . not ( ) . mod ( NUMBER , NUMBER ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new Query ( where ( STRING ) . not ( ) . is ( STRING ) ) ; Assert . fail ( STRING ) ; } catch ( InvalidMongoDbApiUsageException org.springframework.data.mongodb.core.query.InvalidMongoDbApiUsageException ) {} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( new Criteria ( ) . orOperator ( where ( STRING ) . is ( STRING ) . and ( STRING ) . lt ( NUMBER ) , where ( STRING ) . lt ( NUMBER ) , where ( STRING ) . is ( STRING ) ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( new Criteria ( ) . andOperator ( where ( STRING ) . is ( STRING ) , where ( STRING ) . lt ( NUMBER ) ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( new Criteria ( ) . norOperator ( where ( STRING ) . is ( STRING ) , where ( STRING ) . lt ( NUMBER ) , where ( STRING ) . is ( STRING ) ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . gte ( STRING ) . lte ( STRING ) . and ( STRING ) . not ( ) . gt ( NUMBER ) ) ; org.springframework.data.mongodb.core.query.Query . limit ( NUMBER ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.mongodb.core.query.Query . getLimit ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . gte ( STRING ) . lte ( STRING ) . and ( STRING ) . not ( ) . gt ( NUMBER ) ) ; org.springframework.data.mongodb.core.query.Query . fields ( ) . exclude ( STRING ) . include ( STRING ) . slice ( STRING , NUMBER ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getFieldsObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = query ( where ( STRING ) . gte ( STRING ) . lte ( STRING ) . and ( STRING ) . not ( ) . gt ( NUMBER ) ) ; org.springframework.data.mongodb.core.query.Query . fields ( ) . elemMatch ( STRING , where ( STRING ) . is ( STRING ) ) . position ( STRING , NUMBER ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) , is ( org.springframework.data.mongodb.core.query.Document ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getFieldsObject ( ) , is ( org.springframework.data.mongodb.core.query.Document ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . is ( STRING ) . and ( STRING ) . lt ( NUMBER ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . regex ( STRING ) . and ( STRING ) . gt ( NUMBER ) . lt ( NUMBER ) . and ( STRING ) . in ( STRING , STRING , STRING ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING + STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document . toJson ( ) , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . regex ( STRING ) . and ( STRING ) . gt ( NUMBER ) . lt ( NUMBER ) . and ( STRING ) . in ( STRING , STRING , STRING ) ) ; Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . regex ( STRING ) . and ( STRING ) . gt ( NUMBER ) . lt ( NUMBER ) ) . addCriteria ( where ( STRING ) . in ( STRING , STRING , STRING ) ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toString ( ) , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toString ( ) ) ; Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . regex ( STRING ) ) . addCriteria ( where ( STRING ) . gt ( NUMBER ) . lt ( NUMBER ) ) . addCriteria ( where ( STRING ) . in ( STRING , STRING , STRING ) ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toString ( ) , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . elemMatch ( where ( STRING ) . is ( STRING ) . and ( STRING ) . lte ( STRING ) ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . in ( STRING , STRING , STRING ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . regex ( STRING ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document . toJson ( ) , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . regex ( STRING , STRING ) ) ; Document org.springframework.data.mongodb.core.query.Document = Document . parse ( STRING ) ; Assert . assertEquals ( org.springframework.data.mongodb.core.query.Document . toJson ( ) , org.springframework.data.mongodb.core.query.Query . getQueryObject ( ) . toJson ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( ) . with ( new Sort ( Direction . DESC , STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getSortObject ( ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.query.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.mongodb.core.query.ExpectedException . expectMessage ( STRING ) ; new Query ( ) . with ( new Sort ( new Sort . Sort ( STRING ) . ignoreCase ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { Query org.springframework.data.mongodb.core.query.Query = new Query ( where ( STRING ) . is ( STRING ) ) . restrict ( SpecialDoc .class ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . toString ( ) , is ( STRING ) ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getRestrictedTypes ( ) , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getRestrictedTypes ( ) . size ( ) , is ( NUMBER ) ) ; assertThat ( org.springframework.data.mongodb.core.query.Query . getRestrictedTypes ( ) , hasItems ( java.util.Arrays . java.util.List<java.lang.Class<org.springframework.data.mongodb.core.query.SpecialDoc>> ( SpecialDoc .class ) . toArray ( new java.lang.Class<?> < ? > [ NUMBER ] ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.query.ExpectedException . expect ( InvalidMongoDbApiUsageException .class ) ; org.springframework.data.mongodb.core.query.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.mongodb.core.query.ExpectedException . expectMessage ( STRING ) ; Query org.springframework.data.mongodb.core.query.Query = new Query ( ) ; org.springframework.data.mongodb.core.query.Query . addCriteria ( where ( STRING ) . is ( org.springframework.data.mongodb.core.query.QueryTests.EnumType . org.springframework.data.mongodb.core.query.QueryTests.EnumType ) ) ; org.springframework.data.mongodb.core.query.Query . addCriteria ( where ( STRING ) . is ( org.springframework.data.mongodb.core.query.QueryTests.EnumType . org.springframework.data.mongodb.core.query.QueryTests.EnumType ) ) ; }  <METHOD_END>