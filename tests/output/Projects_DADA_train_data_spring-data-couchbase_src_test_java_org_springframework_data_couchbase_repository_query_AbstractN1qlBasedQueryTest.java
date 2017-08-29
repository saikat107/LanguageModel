<METHOD_START> @ Test public void void ( ) java.lang.Exception { Statement org.springframework.data.couchbase.repository.query.Statement = select ( STRING ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = AbstractN1qlBasedQuery . buildQuery ( org.springframework.data.couchbase.repository.query.Statement , JsonArray . empty ( ) , ScanConsistency . NOT_BOUNDED ) ; JsonObject org.springframework.data.couchbase.repository.query.JsonObject = org.springframework.data.couchbase.repository.query.N1qlQuery . n1ql ( ) ; assertTrue ( org.springframework.data.couchbase.repository.query.N1qlQuery instanceof SimpleN1qlQuery ) ; assertEquals ( org.springframework.data.couchbase.repository.query.Statement . toString ( ) , org.springframework.data.couchbase.repository.query.N1qlQuery . statement ( ) . toString ( ) ) ; assertEquals ( N1qlParams . build ( ) . consistency ( ScanConsistency . NOT_BOUNDED ) , org.springframework.data.couchbase.repository.query.N1qlQuery . params ( ) ) ; assertFalse ( org.springframework.data.couchbase.repository.query.JsonObject . containsKey ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Statement org.springframework.data.couchbase.repository.query.Statement = select ( STRING ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( NUMBER ) ; java.util.List<java.lang.Object> . boolean ( STRING ) ; JsonArray org.springframework.data.couchbase.repository.query.JsonArray = JsonArray . from ( java.util.List<java.lang.Object> ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = AbstractN1qlBasedQuery . buildQuery ( org.springframework.data.couchbase.repository.query.Statement , org.springframework.data.couchbase.repository.query.JsonArray , ScanConsistency . NOT_BOUNDED ) ; JsonObject org.springframework.data.couchbase.repository.query.JsonObject = org.springframework.data.couchbase.repository.query.N1qlQuery . n1ql ( ) ; assertTrue ( org.springframework.data.couchbase.repository.query.N1qlQuery instanceof ParameterizedN1qlQuery ) ; assertEquals ( org.springframework.data.couchbase.repository.query.Statement . toString ( ) , org.springframework.data.couchbase.repository.query.N1qlQuery . statement ( ) . toString ( ) ) ; assertEquals ( N1qlParams . build ( ) . consistency ( ScanConsistency . NOT_BOUNDED ) , org.springframework.data.couchbase.repository.query.N1qlQuery . params ( ) ) ; assertTrue ( org.springframework.data.couchbase.repository.query.JsonObject . containsKey ( STRING ) ) ; JsonArray org.springframework.data.couchbase.repository.query.JsonArray = org.springframework.data.couchbase.repository.query.JsonObject . getArray ( STRING ) ; assertEquals ( NUMBER , org.springframework.data.couchbase.repository.query.JsonArray . size ( ) ) ; assertEquals ( STRING , org.springframework.data.couchbase.repository.query.JsonArray . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Statement org.springframework.data.couchbase.repository.query.Statement = select ( STRING ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( NUMBER ) ; java.util.List<java.lang.Object> . boolean ( NUMBER ) ; java.util.List<java.lang.Object> . boolean ( STRING ) ; JsonArray org.springframework.data.couchbase.repository.query.JsonArray = JsonArray . from ( java.util.List<java.lang.Object> ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = AbstractN1qlBasedQuery . buildQuery ( org.springframework.data.couchbase.repository.query.Statement , org.springframework.data.couchbase.repository.query.JsonArray , ScanConsistency . NOT_BOUNDED ) ; JsonObject org.springframework.data.couchbase.repository.query.JsonObject = org.springframework.data.couchbase.repository.query.N1qlQuery . n1ql ( ) ; assertTrue ( org.springframework.data.couchbase.repository.query.N1qlQuery instanceof ParameterizedN1qlQuery ) ; assertEquals ( org.springframework.data.couchbase.repository.query.Statement . toString ( ) , org.springframework.data.couchbase.repository.query.N1qlQuery . statement ( ) . toString ( ) ) ; assertEquals ( N1qlParams . build ( ) . consistency ( ScanConsistency . NOT_BOUNDED ) , org.springframework.data.couchbase.repository.query.N1qlQuery . params ( ) ) ; assertTrue ( org.springframework.data.couchbase.repository.query.JsonObject . containsKey ( STRING ) ) ; JsonArray org.springframework.data.couchbase.repository.query.JsonArray = org.springframework.data.couchbase.repository.query.JsonObject . getArray ( STRING ) ; assertEquals ( NUMBER , org.springframework.data.couchbase.repository.query.JsonArray . size ( ) ) ; assertEquals ( NUMBER , org.springframework.data.couchbase.repository.query.JsonArray . get ( NUMBER ) ) ; assertEquals ( STRING , org.springframework.data.couchbase.repository.query.JsonArray . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , java.lang.Object .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING , java.lang.Integer .class ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING , Pageable .class ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING , Pageable .class ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = spy ( new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ) ; when ( org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod . isModifyingQuery ( ) ) . thenReturn ( true ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; try { org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; fail ( ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { } verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; CouchbaseQueryMethod org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod = new CouchbaseQueryMethod ( java.lang.reflect.Method , org.springframework.data.couchbase.repository.query.RepositoryMetadata , org.springframework.data.couchbase.repository.query.ProjectionFactory , org.springframework.data.couchbase.repository.query.CouchbaseMappingContext ) ; N1qlQuery org.springframework.data.couchbase.repository.query.N1qlQuery = Mockito . mock ( N1qlQuery .class ) ; Pageable org.springframework.data.couchbase.repository.query.Pageable = Mockito . mock ( Pageable .class ) ; AbstractN1qlBasedQuery org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery = mock ( AbstractN1qlBasedQuery .class ) ; when ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( QueryMethod .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ) . thenCallRealMethod ( ) ; org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery . executeDependingOnType ( org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.N1qlQuery , org.springframework.data.couchbase.repository.query.CouchbaseQueryMethod , org.springframework.data.couchbase.repository.query.Pageable , org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample .class ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeCollection ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeEntity ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeStream ( any ( N1qlQuery .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executePaged ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery , never ( ) ) . executeSliced ( any ( N1qlQuery .class ) , any ( N1qlQuery .class ) , any ( Pageable .class ) , any ( java.lang.Class .class ) ) ; verify ( org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQuery ) . executeSingleProjection ( any ( N1qlQuery .class ) ) ; }  <METHOD_END>
<METHOD_START> java.util.Collection<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> < org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample > java.util.Collection<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample ( java.lang.Integer java.lang.Integer );  <METHOD_END>
<METHOD_START> java.util.stream.Stream<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> < org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample > java.util.stream.Stream<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.couchbase.repository.query.Page<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> < org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample > org.springframework.data.couchbase.repository.query.Page<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> ( Pageable org.springframework.data.couchbase.repository.query.Pageable );  <METHOD_END>
<METHOD_START> org.springframework.data.couchbase.repository.query.Slice<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> < org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample > org.springframework.data.couchbase.repository.query.Slice<org.springframework.data.couchbase.repository.query.AbstractN1qlBasedQueryTest.Sample> ( Pageable org.springframework.data.couchbase.repository.query.Pageable );  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ( )  <METHOD_END>
<METHOD_START> long long ( )  <METHOD_END>
