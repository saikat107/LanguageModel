<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource , java.lang.String java.lang.String , java.lang.String java.lang.String ) { super( javax.sql.DataSource , java.lang.String , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected synchronized long long ( ) org.springframework.jdbc.support.incrementer.DataAccessException { if ( this . int < NUMBER || this . int >= getCacheSize ( ) ) { java.sql.Connection java.sql.Connection = DataSourceUtils . getConnection ( getDataSource ( ) ) ; java.sql.Statement java.sql.Statement = null ; try { java.sql.Statement = java.sql.Connection . java.sql.Statement ( ) ; DataSourceUtils . applyTransactionTimeout ( java.sql.Statement , getDataSource ( ) ) ; this . long[] = new long [ getCacheSize ( ) ] ; this . int = NUMBER ; for ( int int = NUMBER ; int < getCacheSize ( ) ; int ++ ) { java.sql.Statement . int ( java.lang.String ( ) ) ; java.sql.ResultSet java.sql.ResultSet = java.sql.Statement . java.sql.ResultSet ( java.lang.String ( ) ) ; try { if ( ! java.sql.ResultSet . boolean ( ) ) { throw new DataAccessResourceFailureException ( STRING ) ; } this . long[] [ int ] = java.sql.ResultSet . long ( NUMBER ) ; } finally { JdbcUtils . closeResultSet ( java.sql.ResultSet ) ; } } java.sql.Statement . int ( java.lang.String ( this . long[] ) ) ; } catch ( java.sql.SQLException java.sql.SQLException ) { throw new DataAccessResourceFailureException ( STRING , java.sql.SQLException ) ; } finally { JdbcUtils . closeStatement ( java.sql.Statement ) ; DataSourceUtils . releaseConnection ( java.sql.Connection , getDataSource ( ) ) ; } } return this . long[] [ this . int ++ ] ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( long [] long[] ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( NUMBER ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( getIncrementerName ( ) ) . append ( STRING ) . append ( getColumnName ( ) ) ; if ( boolean ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( long[] [ NUMBER ] - NUMBER ) ; for ( int int = NUMBER ; int < long[] . int - NUMBER ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( long[] [ int ] ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } else { long long = long[] [ long[] . int - NUMBER ] ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( long ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
