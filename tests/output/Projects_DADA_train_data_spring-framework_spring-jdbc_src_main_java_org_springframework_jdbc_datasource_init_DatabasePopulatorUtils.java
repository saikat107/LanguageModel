<METHOD_START> public static void void ( DatabasePopulator org.springframework.jdbc.datasource.init.DatabasePopulator , javax.sql.DataSource javax.sql.DataSource ) throws org.springframework.jdbc.datasource.init.DataAccessException { Assert . notNull ( org.springframework.jdbc.datasource.init.DatabasePopulator , STRING ) ; Assert . notNull ( javax.sql.DataSource , STRING ) ; try { java.sql.Connection java.sql.Connection = DataSourceUtils . getConnection ( javax.sql.DataSource ) ; try { org.springframework.jdbc.datasource.init.DatabasePopulator . populate ( java.sql.Connection ) ; } finally { if ( java.sql.Connection != null ) { DataSourceUtils . releaseConnection ( java.sql.Connection , javax.sql.DataSource ) ; } } } catch ( java.lang.Throwable java.lang.Throwable ) { if ( java.lang.Throwable instanceof ScriptException ) { throw ( ScriptException ) java.lang.Throwable ; } throw new UncategorizedScriptException ( STRING , java.lang.Throwable ) ; } }  <METHOD_END>
