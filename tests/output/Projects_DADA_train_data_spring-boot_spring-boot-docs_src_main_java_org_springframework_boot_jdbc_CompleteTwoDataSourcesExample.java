<METHOD_START> @ Bean @ Primary @ ConfigurationProperties ( STRING ) public org.springframework.boot.jdbc.DataSourceProperties org.springframework.boot.jdbc.DataSourceProperties ( ) { return new DataSourceProperties ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Primary @ ConfigurationProperties ( STRING ) public javax.sql.DataSource javax.sql.DataSource ( ) { return org.springframework.boot.jdbc.DataSourceProperties ( ) . initializeDataSourceBuilder ( ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( STRING ) public org.springframework.boot.jdbc.DataSourceProperties org.springframework.boot.jdbc.DataSourceProperties ( ) { return new DataSourceProperties ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConfigurationProperties ( STRING ) public javax.sql.DataSource javax.sql.DataSource ( ) { return org.springframework.boot.jdbc.DataSourceProperties ( ) . initializeDataSourceBuilder ( ) . build ( ) ; }  <METHOD_END>
