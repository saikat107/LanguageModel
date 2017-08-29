<METHOD_START> @ BeforeClass public static void void ( ) { ClusterInfo org.springframework.data.couchbase.repository.wiring.ClusterInfo = mock ( ClusterInfo .class ) ; when ( org.springframework.data.couchbase.repository.wiring.ClusterInfo . checkAvailable ( any ( CouchbaseFeature .class ) ) ) . thenReturn ( true ) ; org.springframework.data.couchbase.repository.wiring.CouchbaseOperations = mock ( CouchbaseOperations .class ) ; when ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations . getCouchbaseClusterInfo ( ) ) . thenReturn ( org.springframework.data.couchbase.repository.wiring.ClusterInfo ) ; when ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations . exists ( any ( java.lang.String .class ) ) ) . thenReturn ( true ) ; org.springframework.data.couchbase.repository.wiring.CouchbaseOperations = mock ( CouchbaseOperations .class ) ; when ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations . getCouchbaseClusterInfo ( ) ) . thenReturn ( org.springframework.data.couchbase.repository.wiring.ClusterInfo ) ; when ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations . exists ( any ( java.lang.String .class ) ) ) . thenReturn ( false ) ; org.springframework.data.couchbase.repository.wiring.CouchbaseOperations = spy ( new CouchbaseTemplate ( org.springframework.data.couchbase.repository.wiring.ClusterInfo , null ) ) ; org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc = new org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc ( ) ; org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc . java.lang.String = STRING ; org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc . boolean = true ; doReturn ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc ) . when ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ) . findById ( any ( java.lang.String .class ) , any ( java.lang.Class .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.couchbase.repository.wiring.CouchbaseOperations org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ( ) { return org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.couchbase.repository.wiring.CouchbaseOperations org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ( ) { return org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.couchbase.repository.wiring.CouchbaseOperations org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ( ) { return org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.repository.wiring.IndexManager org.springframework.data.couchbase.repository.wiring.IndexManager ( ) { return new IndexManager ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RepositoryOperationsMapping org.springframework.data.couchbase.repository.wiring.RepositoryOperationsMapping ) { org.springframework.data.couchbase.repository.wiring.RepositoryOperationsMapping . setDefault ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ( ) ) . map ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketBRepository .class , org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ( ) ) . mapEntity ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Item .class , org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNotNull ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketARepository ) ; assertNotNull ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketBRepository ) ; assertNotNull ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketCRepository ) ; boolean boolean = org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketARepository . exists ( STRING ) ; boolean boolean = org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketBRepository . exists ( STRING ) ; java.util.Optional<org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc> < org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc > java.util.Optional<org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc> = org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.BucketCRepository . findOne ( STRING ) ; assertTrue ( boolean ) ; assertFalse ( boolean ) ; assertTrue ( java.util.Optional<org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc> . boolean ( ) ) ; java.util.Optional<org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc> . void ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc -> { assertEquals ( STRING , org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc . java.lang.String ) ; assertEquals ( true , org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc . boolean ) ; } ) ; verify ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ) . exists ( STRING ) ; verify ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ) . exists ( STRING ) ; verify ( org.springframework.data.couchbase.repository.wiring.CouchbaseOperations ) . findById ( any ( java.lang.String .class ) , eq ( org.springframework.data.couchbase.repository.wiring.RepositoryTemplateWiringTests.Misc .class ) ) ; }  <METHOD_END>
