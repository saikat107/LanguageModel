<METHOD_START> @ Test public void void ( ) { IndexField org.springframework.data.mongodb.core.index.IndexField = IndexField . create ( STRING , Direction . ASC ) ; IndexField org.springframework.data.mongodb.core.index.IndexField = IndexField . create ( STRING , Direction . DESC ) ; IndexInfo org.springframework.data.mongodb.core.index.IndexInfo = new IndexInfo ( java.util.Arrays . java.util.List ( org.springframework.data.mongodb.core.index.IndexField , org.springframework.data.mongodb.core.index.IndexField ) , STRING , false , false , STRING ) ; assertThat ( org.springframework.data.mongodb.core.index.IndexInfo . isIndexForFields ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) , is ( true ) ) ; }  <METHOD_END>