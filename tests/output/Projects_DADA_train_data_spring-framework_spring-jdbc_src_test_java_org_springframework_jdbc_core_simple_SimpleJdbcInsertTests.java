<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; javax.sql.DataSource = mock ( javax.sql.DataSource .class ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { verify ( java.sql.Connection ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.sql.ResultSet java.sql.ResultSet = mock ( java.sql.ResultSet .class ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( false ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.DatabaseMetaData . java.sql.ResultSet ( null , null , STRING , null ) ) . willReturn ( java.sql.ResultSet ) ; SimpleJdbcInsert org.springframework.jdbc.core.simple.SimpleJdbcInsert = new SimpleJdbcInsert ( javax.sql.DataSource ) . withTableName ( STRING ) ; org.springframework.jdbc.core.simple.ExpectedException . expect ( InvalidDataAccessApiUsageException .class ) ; try { org.springframework.jdbc.core.simple.SimpleJdbcInsert . execute ( new java.util.HashMap <> ( ) ) ; } finally { verify ( java.sql.ResultSet ) . close ( ) ; } }  <METHOD_END>