<METHOD_START> @ Before public void void ( ) { java.sql.PreparedStatement = mock ( java.sql.PreparedStatement .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , null ) ; verify ( java.sql.PreparedStatement ) . setNull ( NUMBER , java.sql.Types . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , STRING , null ) ; verify ( java.sql.PreparedStatement ) . setNull ( NUMBER , java.sql.Types . int , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . shouldIgnoreGetParameterType = true ; java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.PreparedStatement . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , null ) ; verify ( java.sql.PreparedStatement ) . setNull ( NUMBER , java.sql.Types . int ) ; StatementCreatorUtils . shouldIgnoreGetParameterType = false ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . shouldIgnoreGetParameterType = true ; java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.PreparedStatement . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , null ) ; verify ( java.sql.DatabaseMetaData ) . getDatabaseProductName ( ) ; verify ( java.sql.DatabaseMetaData ) . getDriverName ( ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , null ) ; StatementCreatorUtils . shouldIgnoreGetParameterType = false ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . shouldIgnoreGetParameterType = true ; java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.PreparedStatement . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , null ) ; verify ( java.sql.DatabaseMetaData ) . getDatabaseProductName ( ) ; verify ( java.sql.DatabaseMetaData ) . getDriverName ( ) ; verify ( java.sql.PreparedStatement ) . setNull ( NUMBER , java.sql.Types . int ) ; StatementCreatorUtils . shouldIgnoreGetParameterType = false ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java.sql.ParameterMetaData java.sql.ParameterMetaData = mock ( java.sql.ParameterMetaData .class ) ; given ( java.sql.PreparedStatement . java.sql.ParameterMetaData ( ) ) . willReturn ( java.sql.ParameterMetaData ) ; given ( java.sql.ParameterMetaData . int ( NUMBER ) ) . willReturn ( java.sql.Types . int ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , null ) ; verify ( java.sql.ParameterMetaData ) . getParameterType ( NUMBER ) ; verify ( java.sql.PreparedStatement , never ( ) ) . getConnection ( ) ; verify ( java.sql.PreparedStatement ) . setNull ( NUMBER , java.sql.Types . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , STRING ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , STRING ) ; verify ( java.sql.PreparedStatement ) . setObject ( NUMBER , STRING , java.sql.Types . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , STRING ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . sql . java.sql.Date java.sql.Date = new java . sql . java.sql.Date ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.sql.Date ) ; verify ( java.sql.PreparedStatement ) . setDate ( NUMBER , java.sql.Date ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Date java.util.Date = new java . util . java.util.Date ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.util.Date ) ; verify ( java.sql.PreparedStatement ) . setDate ( NUMBER , new java . sql . java.sql.Date ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Calendar java.util.Calendar = new java.util.GregorianCalendar ( ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.util.Calendar ) ; verify ( java.sql.PreparedStatement ) . setDate ( NUMBER , new java . sql . java.sql.Date ( java.util.Calendar . java.util.Date ( ) . long ( ) ) , java.util.Calendar ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . sql . java.sql.Time java.sql.Time = new java . sql . java.sql.Time ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.sql.Time ) ; verify ( java.sql.PreparedStatement ) . setTime ( NUMBER , java.sql.Time ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Date java.util.Date = new java . util . java.util.Date ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.util.Date ) ; verify ( java.sql.PreparedStatement ) . setTime ( NUMBER , new java . sql . java.sql.Time ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Calendar java.util.Calendar = new java.util.GregorianCalendar ( ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.util.Calendar ) ; verify ( java.sql.PreparedStatement ) . setTime ( NUMBER , new java . sql . java.sql.Time ( java.util.Calendar . java.util.Date ( ) . long ( ) ) , java.util.Calendar ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . sql . java.sql.Timestamp java.sql.Timestamp = new java . sql . java.sql.Timestamp ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.sql.Timestamp ) ; verify ( java.sql.PreparedStatement ) . setTimestamp ( NUMBER , java.sql.Timestamp ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Date java.util.Date = new java . util . java.util.Date ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.util.Date ) ; verify ( java.sql.PreparedStatement ) . setTimestamp ( NUMBER , new java . sql . java.sql.Timestamp ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Calendar java.util.Calendar = new java.util.GregorianCalendar ( ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , java.util.Calendar ) ; verify ( java.sql.PreparedStatement ) . setTimestamp ( NUMBER , new java . sql . java.sql.Timestamp ( java.util.Calendar . java.util.Date ( ) . long ( ) ) , java.util.Calendar ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Date java.util.Date = new java . util . java.util.Date ( NUMBER ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , java.util.Date ) ; verify ( java.sql.PreparedStatement ) . setTimestamp ( NUMBER , new java . sql . java.sql.Timestamp ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java . util . java.util.Calendar java.util.Calendar = new java.util.GregorianCalendar ( ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , SqlTypeValue . TYPE_UNKNOWN , null , java.util.Calendar ) ; verify ( java.sql.PreparedStatement ) . setTimestamp ( NUMBER , new java . sql . java.sql.Timestamp ( java.util.Calendar . java.util.Date ( ) . long ( ) ) , java.util.Calendar ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.PreparedStatement . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , STRING ) ; verify ( java.sql.PreparedStatement ) . setString ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { StatementCreatorUtils . shouldIgnoreGetParameterType = true ; java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.PreparedStatement . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; StatementCreatorUtils . setParameterValue ( java.sql.PreparedStatement , NUMBER , java.sql.Types . int , null , null ) ; verify ( java.sql.PreparedStatement ) . setNull ( NUMBER , java.sql.Types . int ) ; StatementCreatorUtils . shouldIgnoreGetParameterType = false ; }  <METHOD_END>