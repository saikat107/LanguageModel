<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.Document = new Document ( STRING , STRING ) ; assertThat ( serializeToJsonSafely ( org.springframework.data.mongodb.core.Document ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.Document = new Document ( STRING , new org.springframework.data.mongodb.core.SerializationUtilsUnitTests.Complex ( ) ) ; assertThat ( serializeToJsonSafely ( org.springframework.data.mongodb.core.Document ) , startsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.Document = new Document ( STRING , java.util.Arrays . java.util.List<java.lang.Object> ( STRING , new org.springframework.data.mongodb.core.SerializationUtilsUnitTests.Complex ( ) ) ) ; Matcher < java.lang.String > org.springframework.data.mongodb.core.Matcher<java.lang.String> = allOf ( startsWith ( STRING ) , endsWith ( STRING ) ) ; assertThat ( serializeToJsonSafely ( org.springframework.data.mongodb.core.Document ) , is ( org.springframework.data.mongodb.core.Matcher<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.Document = new Document ( ) ; org.springframework.data.mongodb.core.Document . put ( STRING , NUMBER ) ; org.springframework.data.mongodb.core.Document . put ( STRING , new Document ( STRING , STRING ) ) ; assertThat ( flattenMap ( org.springframework.data.mongodb.core.Document ) , hasEntry ( STRING , ( java.lang.Object ) NUMBER ) ) ; assertThat ( flattenMap ( org.springframework.data.mongodb.core.Document ) , hasEntry ( STRING , ( java.lang.Object ) STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BasicDBList org.springframework.data.mongodb.core.BasicDBList = new BasicDBList ( ) ; org.springframework.data.mongodb.core.BasicDBList . addAll ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; Document org.springframework.data.mongodb.core.Document = new Document ( ) ; org.springframework.data.mongodb.core.Document . put ( STRING , NUMBER ) ; org.springframework.data.mongodb.core.Document . put ( STRING , new Document ( STRING , org.springframework.data.mongodb.core.BasicDBList ) ) ; assertThat ( flattenMap ( org.springframework.data.mongodb.core.Document ) , hasEntry ( STRING , ( java.lang.Object ) NUMBER ) ) ; assertThat ( flattenMap ( org.springframework.data.mongodb.core.Document ) , hasEntry ( STRING , ( java.lang.Object ) org.springframework.data.mongodb.core.BasicDBList ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.Document = new Document ( ) ; org.springframework.data.mongodb.core.Document . put ( STRING , NUMBER ) ; org.springframework.data.mongodb.core.Document . put ( STRING , new Document ( STRING , STRING ) ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = flattenMap ( org.springframework.data.mongodb.core.Document ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> , hasEntry ( STRING , ( java.lang.Object ) NUMBER ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , notNullValue ( ) ) ; assertThat ( ( ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object ( STRING ) , is ( ( java.lang.Object ) STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.Document = new Document ( ) ; Document org.springframework.data.mongodb.core.Document = new Document ( ) ; org.springframework.data.mongodb.core.Document . put ( STRING , STRING ) ; org.springframework.data.mongodb.core.Document . put ( STRING , STRING ) ; org.springframework.data.mongodb.core.Document . put ( STRING , NUMBER ) ; org.springframework.data.mongodb.core.Document . put ( STRING , org.springframework.data.mongodb.core.Document ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = flattenMap ( org.springframework.data.mongodb.core.Document ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> , hasEntry ( STRING , ( java.lang.Object ) NUMBER ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , notNullValue ( ) ) ; assertThat ( ( ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object ( STRING ) , is ( ( java.lang.Object ) STRING ) ) ; assertThat ( ( ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) . java.lang.Object ( STRING ) , is ( ( java.lang.Object ) STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( flattenMap ( null ) . isEmpty ( ) , is ( true ) ) ; }  <METHOD_END>