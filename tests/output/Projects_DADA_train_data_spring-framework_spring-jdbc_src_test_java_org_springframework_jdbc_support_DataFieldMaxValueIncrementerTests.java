<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.Statement ( ) ) . willReturn ( java.sql.Statement ) ; given ( java.sql.Statement . java.sql.ResultSet ( STRING ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.ResultSet . long ( NUMBER ) ) . willReturn ( NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER ) ; HsqlMaxValueIncrementer org.springframework.jdbc.support.HsqlMaxValueIncrementer = new HsqlMaxValueIncrementer ( ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setDataSource ( javax.sql.DataSource ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setIncrementerName ( STRING ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setColumnName ( STRING ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setCacheSize ( NUMBER ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setPaddingLength ( NUMBER ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . afterPropertiesSet ( ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextIntValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextLongValue ( ) ) ; assertEquals ( STRING , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextStringValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextIntValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextLongValue ( ) ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . executeUpdate ( STRING ) ; verify ( java.sql.Statement ) . executeUpdate ( STRING ) ; verify ( java.sql.Statement ) . executeUpdate ( STRING ) ; verify ( java.sql.ResultSet , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Connection , times ( NUMBER ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.Statement ( ) ) . willReturn ( java.sql.Statement ) ; given ( java.sql.Statement . java.sql.ResultSet ( STRING ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.ResultSet . long ( NUMBER ) ) . willReturn ( NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER ) ; HsqlMaxValueIncrementer org.springframework.jdbc.support.HsqlMaxValueIncrementer = new HsqlMaxValueIncrementer ( ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setDataSource ( javax.sql.DataSource ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setIncrementerName ( STRING ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setColumnName ( STRING ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setCacheSize ( NUMBER ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setPaddingLength ( NUMBER ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . setDeleteSpecificValues ( true ) ; org.springframework.jdbc.support.HsqlMaxValueIncrementer . afterPropertiesSet ( ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextIntValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextLongValue ( ) ) ; assertEquals ( STRING , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextStringValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextIntValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.HsqlMaxValueIncrementer . nextLongValue ( ) ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . executeUpdate ( STRING ) ; verify ( java.sql.Statement ) . executeUpdate ( STRING ) ; verify ( java.sql.Statement ) . executeUpdate ( STRING ) ; verify ( java.sql.ResultSet , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Connection , times ( NUMBER ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.Statement ( ) ) . willReturn ( java.sql.Statement ) ; given ( java.sql.Statement . java.sql.ResultSet ( STRING ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.ResultSet . long ( NUMBER ) ) . willReturn ( NUMBER , NUMBER ) ; MySQLMaxValueIncrementer org.springframework.jdbc.support.MySQLMaxValueIncrementer = new MySQLMaxValueIncrementer ( ) ; org.springframework.jdbc.support.MySQLMaxValueIncrementer . setDataSource ( javax.sql.DataSource ) ; org.springframework.jdbc.support.MySQLMaxValueIncrementer . setIncrementerName ( STRING ) ; org.springframework.jdbc.support.MySQLMaxValueIncrementer . setColumnName ( STRING ) ; org.springframework.jdbc.support.MySQLMaxValueIncrementer . setCacheSize ( NUMBER ) ; org.springframework.jdbc.support.MySQLMaxValueIncrementer . setPaddingLength ( NUMBER ) ; org.springframework.jdbc.support.MySQLMaxValueIncrementer . afterPropertiesSet ( ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.MySQLMaxValueIncrementer . nextIntValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.MySQLMaxValueIncrementer . nextLongValue ( ) ) ; assertEquals ( STRING , org.springframework.jdbc.support.MySQLMaxValueIncrementer . nextStringValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.MySQLMaxValueIncrementer . nextLongValue ( ) ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . executeUpdate ( STRING ) ; verify ( java.sql.ResultSet , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Connection , times ( NUMBER ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.Statement ( ) ) . willReturn ( java.sql.Statement ) ; given ( java.sql.Statement . java.sql.ResultSet ( STRING ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.ResultSet . long ( NUMBER ) ) . willReturn ( NUMBER , NUMBER ) ; PostgreSQLSequenceMaxValueIncrementer org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer = new PostgreSQLSequenceMaxValueIncrementer ( ) ; org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer . setDataSource ( javax.sql.DataSource ) ; org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer . setIncrementerName ( STRING ) ; org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer . setPaddingLength ( NUMBER ) ; org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer . afterPropertiesSet ( ) ; assertEquals ( STRING , org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer . nextStringValue ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.PostgreSQLSequenceMaxValueIncrementer . nextIntValue ( ) ) ; verify ( java.sql.ResultSet , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Connection , times ( NUMBER ) ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.Statement ( ) ) . willReturn ( java.sql.Statement ) ; given ( java.sql.Statement . java.sql.ResultSet ( STRING ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.ResultSet . long ( NUMBER ) ) . willReturn ( NUMBER , NUMBER ) ; OracleSequenceMaxValueIncrementer org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer = new OracleSequenceMaxValueIncrementer ( ) ; org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer . setDataSource ( javax.sql.DataSource ) ; org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer . setIncrementerName ( STRING ) ; org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer . setPaddingLength ( NUMBER ) ; org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer . afterPropertiesSet ( ) ; assertEquals ( NUMBER , org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer . nextLongValue ( ) ) ; assertEquals ( STRING , org.springframework.jdbc.support.OracleSequenceMaxValueIncrementer . nextStringValue ( ) ) ; verify ( java.sql.ResultSet , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Statement , times ( NUMBER ) ) . close ( ) ; verify ( java.sql.Connection , times ( NUMBER ) ) . close ( ) ; }  <METHOD_END>