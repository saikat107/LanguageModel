<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = this . javax.sql.DataSource . java.sql.Connection ( ) . java.sql.DatabaseMetaData ( ) . java.lang.String ( ) ; assertThat ( java.lang.String ) . startsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { EmbeddedDatabaseBuilder org.springframework.boot.test.autoconfigure.jdbc.EmbeddedDatabaseBuilder = new EmbeddedDatabaseBuilder ( ) . generateUniqueName ( true ) . setType ( EmbeddedDatabaseType . H2 ) ; return org.springframework.boot.test.autoconfigure.jdbc.EmbeddedDatabaseBuilder . build ( ) ; }  <METHOD_END>
