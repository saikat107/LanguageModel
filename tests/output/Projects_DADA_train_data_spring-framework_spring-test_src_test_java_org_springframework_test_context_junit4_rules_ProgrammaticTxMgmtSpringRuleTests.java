<METHOD_START> @ Bean public org.springframework.test.context.junit4.rules.PlatformTransactionManager org.springframework.test.context.junit4.rules.PlatformTransactionManager ( ) { return new DataSourceTransactionManager ( javax.sql.DataSource ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { return new EmbeddedDatabaseBuilder ( ) . generateUniqueName ( true ) . addScript ( STRING ) . build ( ) ; }  <METHOD_END>