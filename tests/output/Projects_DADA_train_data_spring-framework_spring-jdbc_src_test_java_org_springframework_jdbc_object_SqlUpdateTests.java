<METHOD_START> @ Before public void void ( ) java.lang.Exception { javax.sql.DataSource = mock ( javax.sql.DataSource .class ) ; java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.PreparedStatement = mock ( java.sql.PreparedStatement .class ) ; java.sql.ResultSet = mock ( java.sql.ResultSet .class ) ; java.sql.ResultSetMetaData = mock ( java.sql.ResultSetMetaData .class ) ; given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { verify ( java.sql.PreparedStatement ) . close ( ) ; verify ( java.sql.Connection ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.Updater org.springframework.jdbc.object.SqlUpdateTests.Updater = new org.springframework.jdbc.object.SqlUpdateTests.Updater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.Updater . int ( ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.IntUpdater org.springframework.jdbc.object.SqlUpdateTests.IntUpdater = new org.springframework.jdbc.object.SqlUpdateTests.IntUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.IntUpdater . int ( NUMBER ) ; assertEquals ( NUMBER , int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.IntIntUpdater org.springframework.jdbc.object.SqlUpdateTests.IntIntUpdater = new org.springframework.jdbc.object.SqlUpdateTests.IntIntUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.IntIntUpdater . int ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { void ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { void ( true ) ; }  <METHOD_END>
<METHOD_START> private void void ( final boolean boolean )			throws java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; class NamedParameterUpdater extends SqlUpdate { public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; if ( boolean ) { declareParameter ( new SqlParameter ( STRING , java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( STRING , java.sql.Types . int ) ) ; } else { declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; } compile ( ) ; } public int int ( int int , int int ) { java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = new java.util.HashMap<java.lang.String,java.lang.Integer> <> ( ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , int ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , int ) ; return updateByNamedParam ( java.util.Map<java.lang.String,java.lang.Integer> ) ; } } NamedParameterUpdater pc = new NamedParameterUpdater ( ) ; int int = pc . int ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; if ( boolean ) { declareParameter ( new SqlParameter ( STRING , java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( STRING , java.sql.Types . int ) ) ; } else { declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; } compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( int int , int int ) { java.util.Map<java.lang.String,java.lang.Integer> < java.lang.String , java.lang.Integer > java.util.Map<java.lang.String,java.lang.Integer> = new java.util.HashMap<java.lang.String,java.lang.Integer> <> ( ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , int ) ; java.util.Map<java.lang.String,java.lang.Integer> . java.lang.Integer ( STRING , int ) ; return updateByNamedParam ( java.util.Map<java.lang.String,java.lang.Integer> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.StringUpdater org.springframework.jdbc.object.SqlUpdateTests.StringUpdater = new org.springframework.jdbc.object.SqlUpdateTests.StringUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.StringUpdater . int ( STRING ) ; assertEquals ( NUMBER , int ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.MixedUpdater org.springframework.jdbc.object.SqlUpdateTests.MixedUpdater = new org.springframework.jdbc.object.SqlUpdateTests.MixedUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.MixedUpdater . int ( NUMBER , NUMBER , STRING , true ) ; assertEquals ( NUMBER , int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int , NUMBER ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; verify ( java.sql.PreparedStatement ) . setBoolean ( NUMBER , java.lang.Boolean . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.ResultSetMetaData . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.ResultSetMetaData . java.lang.String ( NUMBER ) ) . willReturn ( STRING ) ; given ( java.sql.ResultSet . java.sql.ResultSetMetaData ( ) ) . willReturn ( java.sql.ResultSetMetaData ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true , false ) ; given ( java.sql.ResultSet . java.lang.Object ( NUMBER ) ) . willReturn ( NUMBER ) ; given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.PreparedStatement . java.sql.ResultSet ( ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String , java.sql.PreparedStatement . int ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.GeneratedKeysUpdater org.springframework.jdbc.object.SqlUpdateTests.GeneratedKeysUpdater = new org.springframework.jdbc.object.SqlUpdateTests.GeneratedKeysUpdater ( ) ; KeyHolder org.springframework.jdbc.object.KeyHolder = new GeneratedKeyHolder ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.GeneratedKeysUpdater . int ( STRING , org.springframework.jdbc.object.KeyHolder ) ; assertEquals ( NUMBER , int ) ; assertEquals ( NUMBER , org.springframework.jdbc.object.KeyHolder . getKeyList ( ) . size ( ) ) ; assertEquals ( NUMBER , org.springframework.jdbc.object.KeyHolder . getKey ( ) . intValue ( ) ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; verify ( java.sql.ResultSet ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.ConstructorUpdater org.springframework.jdbc.object.SqlUpdateTests.ConstructorUpdater = new org.springframework.jdbc.object.SqlUpdateTests.ConstructorUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.ConstructorUpdater . int ( NUMBER , NUMBER , STRING , true ) ; assertEquals ( NUMBER , int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , NUMBER , java.sql.Types . int ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; verify ( java.sql.PreparedStatement ) . setBoolean ( NUMBER , java.lang.Boolean . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater = new org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater . int ( ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater = new org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater . int ( ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater = new org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater ( ) ; org.springframework.jdbc.object.ExpectedException . expect ( JdbcUpdateAffectedIncorrectNumberOfRowsException .class ) ; org.springframework.jdbc.object.SqlUpdateTests.MaxRowsUpdater . int ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater = new org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater ( ) ; int int = org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater . int ( ) ; assertEquals ( NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { given ( java.sql.PreparedStatement . int ( ) ) . willReturn ( NUMBER ) ; given ( java.sql.Connection . java.sql.PreparedStatement ( java.lang.String ) ) . willReturn ( java.sql.PreparedStatement ) ; org.springframework.jdbc.object.ExpectedException . expect ( JdbcUpdateAffectedIncorrectNumberOfRowsException .class ) ; org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater = new org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater ( ) ; org.springframework.jdbc.object.SqlUpdateTests.RequiredRowsUpdater . int ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return update ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( int int ) { return update ( int ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( int int , int int ) { return update ( int , int ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( java.lang.String java.lang.String ) { return update ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( java.sql.Types . int , NUMBER ) ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( int int , int int , java.lang.String java.lang.String , boolean boolean ) { return update ( int , int , java.lang.String , boolean ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; declareParameter ( new SqlParameter ( java.sql.Types . int ) ) ; setReturnGeneratedKeys ( true ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( java.lang.String java.lang.String , KeyHolder org.springframework.jdbc.object.KeyHolder ) { return update ( new java.lang.Object [] { java.lang.String } , org.springframework.jdbc.object.KeyHolder ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { super( javax.sql.DataSource , java.lang.String , new int [] { java.sql.Types . int , java.sql.Types . int , java.sql.Types . int , java.sql.Types . int } ); compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( int int , int int , java.lang.String java.lang.String , boolean boolean ) { return update ( int , int , java.lang.String , boolean ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; setMaxRowsAffected ( NUMBER ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return update ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { setSql ( java.lang.String ) ; setDataSource ( javax.sql.DataSource ) ; setRequiredRowsAffected ( NUMBER ) ; compile ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return update ( ) ; }  <METHOD_END>