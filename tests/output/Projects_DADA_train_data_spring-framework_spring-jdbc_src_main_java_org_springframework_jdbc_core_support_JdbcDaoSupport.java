<METHOD_START> public final void void ( javax.sql.DataSource javax.sql.DataSource ) { if ( this . org.springframework.jdbc.core.support.JdbcTemplate == null || javax.sql.DataSource != this . org.springframework.jdbc.core.support.JdbcTemplate . getDataSource ( ) ) { this . org.springframework.jdbc.core.support.JdbcTemplate = org.springframework.jdbc.core.support.JdbcTemplate ( javax.sql.DataSource ) ; void ( ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.jdbc.core.support.JdbcTemplate org.springframework.jdbc.core.support.JdbcTemplate ( javax.sql.DataSource javax.sql.DataSource ) { return new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public final javax.sql.DataSource javax.sql.DataSource ( ) { return ( this . org.springframework.jdbc.core.support.JdbcTemplate != null ? this . org.springframework.jdbc.core.support.JdbcTemplate . getDataSource ( ) : null ) ; }  <METHOD_END>
<METHOD_START> public final void void ( JdbcTemplate org.springframework.jdbc.core.support.JdbcTemplate ) { this . org.springframework.jdbc.core.support.JdbcTemplate = org.springframework.jdbc.core.support.JdbcTemplate ; void ( ) ; }  <METHOD_END>
<METHOD_START> public final org.springframework.jdbc.core.support.JdbcTemplate org.springframework.jdbc.core.support.JdbcTemplate ( ) { return this . org.springframework.jdbc.core.support.JdbcTemplate ; }  <METHOD_END>
<METHOD_START> protected void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( this . org.springframework.jdbc.core.support.JdbcTemplate == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> protected final org.springframework.jdbc.core.support.SQLExceptionTranslator org.springframework.jdbc.core.support.SQLExceptionTranslator ( ) { return org.springframework.jdbc.core.support.JdbcTemplate ( ) . getExceptionTranslator ( ) ; }  <METHOD_END>
<METHOD_START> protected final java.sql.Connection java.sql.Connection ( ) org.springframework.jdbc.core.support.CannotGetJdbcConnectionException { return DataSourceUtils . getConnection ( javax.sql.DataSource ( ) ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.sql.Connection java.sql.Connection ) { DataSourceUtils . releaseConnection ( java.sql.Connection , javax.sql.DataSource ( ) ) ; }  <METHOD_END>
