<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean ) throws java.lang.Exception { final java.lang.String java.lang.String = STRING ; final int [] int[] = new int [] { NUMBER , NUMBER } ; final int [] int[] = new int [] { NUMBER , NUMBER } ; java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; javax.sql.DataSource javax.sql.DataSource = mock ( javax.sql.DataSource .class ) ; given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; java.sql.PreparedStatement java.sql.PreparedStatement = mock ( java.sql.PreparedStatement .class ) ; given ( java.sql.PreparedStatement . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.PreparedStatement . int[] ( ) ) . willReturn ( int[] ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.DatabaseMetaData . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; BatchSqlUpdate org.springframework.jdbc.object.BatchSqlUpdate = new BatchSqlUpdate ( javax.sql.DataSource , java.lang.String ) ; org.springframework.jdbc.object.BatchSqlUpdate . declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; if ( boolean ) { org.springframework.jdbc.object.BatchSqlUpdate . setBatchSize ( NUMBER ) ; } org.springframework.jdbc.object.BatchSqlUpdate . update ( int[] [ NUMBER ] ) ; org.springframework.jdbc.object.BatchSqlUpdate . update ( int[] [ NUMBER ] ) ; if ( boolean ) { assertEquals ( NUMBER , org.springframework.jdbc.object.BatchSqlUpdate . getQueueCount ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.object.BatchSqlUpdate . getRowsAffected ( ) . length ) ; } else { assertEquals ( NUMBER , org.springframework.jdbc.object.BatchSqlUpdate . getQueueCount ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.object.BatchSqlUpdate . getRowsAffected ( ) . length ) ; } int [] int[] = org.springframework.jdbc.object.BatchSqlUpdate . flush ( ) ; assertEquals ( NUMBER , org.springframework.jdbc.object.BatchSqlUpdate . getQueueCount ( ) ) ; if ( boolean ) { assertTrue ( STRING , int[] . int == NUMBER ) ; } else { assertTrue ( STRING , int[] . int == NUMBER ) ; assertEquals ( int[] [ NUMBER ] , int[] [ NUMBER ] ) ; assertEquals ( int[] [ NUMBER ] , int[] [ NUMBER ] ) ; } int[] = org.springframework.jdbc.object.BatchSqlUpdate . getRowsAffected ( ) ; assertTrue ( STRING , int[] . int == NUMBER ) ; assertEquals ( int[] [ NUMBER ] , int[] [ NUMBER ] ) ; assertEquals ( int[] [ NUMBER ] , int[] [ NUMBER ] ) ; org.springframework.jdbc.object.BatchSqlUpdate . reset ( ) ; assertEquals ( NUMBER , org.springframework.jdbc.object.BatchSqlUpdate . getRowsAffected ( ) . length ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , int[] [ NUMBER ] , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , int[] [ NUMBER ] , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement , times ( NUMBER ) ) . addBatch ( ) ; verify ( java.sql.PreparedStatement ) . close ( ) ; }  <METHOD_END>
