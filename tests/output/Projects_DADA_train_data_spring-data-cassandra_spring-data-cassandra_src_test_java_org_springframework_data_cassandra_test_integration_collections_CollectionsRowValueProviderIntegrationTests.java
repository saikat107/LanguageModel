<METHOD_START> @ Before public void void ( ) java.io.IOException { org.springframework.data.cassandra.test.integration.collections.CassandraOperations = new CassandraTemplate ( session ) ; SchemaTestUtils . potentiallyCreateTableFor ( Book .class , org.springframework.data.cassandra.test.integration.collections.CassandraOperations ) ; SchemaTestUtils . potentiallyCreateTableFor ( BookHistory .class , org.springframework.data.cassandra.test.integration.collections.CassandraOperations ) ; SchemaTestUtils . potentiallyCreateTableFor ( BookReference .class , org.springframework.data.cassandra.test.integration.collections.CassandraOperations ) ; SchemaTestUtils . truncate ( Book .class , org.springframework.data.cassandra.test.integration.collections.CassandraOperations ) ; SchemaTestUtils . truncate ( BookHistory .class , org.springframework.data.cassandra.test.integration.collections.CassandraOperations ) ; SchemaTestUtils . truncate ( BookReference .class , org.springframework.data.cassandra.test.integration.collections.CassandraOperations ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BookHistory org.springframework.data.cassandra.test.integration.collections.BookHistory = new BookHistory ( ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setIsbn ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setTitle ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setAuthor ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setPages ( NUMBER ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setSaleDate ( new java.util.Date ( ) ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setInStock ( true ) ; java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = new java.util.HashMap<java.lang.String,java.lang.Integer> <> ( ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , NUMBER ) ; org.springframework.data.cassandra.test.integration.collections.BookHistory . setCheckOuts ( java.util.Map<java.lang.String,java.lang.Integer> ) ; org.springframework.data.cassandra.test.integration.collections.CassandraOperations . insert ( org.springframework.data.cassandra.test.integration.collections.BookHistory ) ; Select org.springframework.data.cassandra.test.integration.collections.Select = QueryBuilder . select ( ) . all ( ) . from ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.Select . where ( QueryBuilder . eq ( STRING , STRING ) ) ; BookHistory org.springframework.data.cassandra.test.integration.collections.BookHistory = org.springframework.data.cassandra.test.integration.collections.CassandraOperations . selectOne ( org.springframework.data.cassandra.test.integration.collections.Select , BookHistory .class ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookHistory . getCheckOuts ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookHistory . getTitle ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookHistory . getAuthor ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BookReference org.springframework.data.cassandra.test.integration.collections.BookReference = new BookReference ( ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setIsbn ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setTitle ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setAuthor ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setPages ( NUMBER ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setSaleDate ( new java.util.Date ( ) ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setInStock ( true ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; java.util.Set<java.lang.String> . boolean ( STRING ) ; java.util.Set<java.lang.String> . boolean ( STRING ) ; java.util.Set<java.lang.String> . boolean ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setReferences ( java.util.Set<java.lang.String> ) ; java.util.List<java.lang.Integer> < java.lang.Integer > java.util.List<java.lang.Integer> = new java.util.LinkedList<java.lang.Integer> <> ( ) ; java.util.List<java.lang.Integer> . boolean ( NUMBER ) ; java.util.List<java.lang.Integer> . boolean ( NUMBER ) ; java.util.List<java.lang.Integer> . boolean ( NUMBER ) ; org.springframework.data.cassandra.test.integration.collections.BookReference . setBookmarks ( java.util.List<java.lang.Integer> ) ; org.springframework.data.cassandra.test.integration.collections.CassandraOperations . insert ( org.springframework.data.cassandra.test.integration.collections.BookReference ) ; Select org.springframework.data.cassandra.test.integration.collections.Select = QueryBuilder . select ( ) . all ( ) . from ( STRING ) ; org.springframework.data.cassandra.test.integration.collections.Select . where ( QueryBuilder . eq ( STRING , STRING ) ) ; BookReference org.springframework.data.cassandra.test.integration.collections.BookReference = org.springframework.data.cassandra.test.integration.collections.CassandraOperations . selectOne ( org.springframework.data.cassandra.test.integration.collections.Select , BookReference .class ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookReference . getReferences ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookReference . getBookmarks ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookReference . getTitle ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.cassandra.test.integration.collections.BookReference . getAuthor ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
