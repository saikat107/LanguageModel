<METHOD_START> @ Before public void void ( ) { java.lang.String = java.lang.System . java.lang.String ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { if ( java.lang.String != null ) { java.lang.System . java.lang.String ( STRING , java.lang.String ) ; } else { java.lang.System . java.lang.String ( STRING ) ; } if ( org.springframework.jdbc.config.ClassPathXmlApplicationContext != null ) { org.springframework.jdbc.config.ClassPathXmlApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; void ( org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BadSqlGrammarException .class ) public void void ( ) java.lang.Exception { java.lang.System . java.lang.String ( STRING , STRING ) ; org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; void ( org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; void ( org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ; void ( javax.sql.DataSource ) ; JdbcTemplate org.springframework.jdbc.config.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; assertEquals ( STRING , org.springframework.jdbc.config.JdbcTemplate . queryForObject ( STRING , java.lang.String .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ; void ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ; void ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.jdbc.config.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING ) ; void ( org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( STRING , javax.sql.DataSource .class ) ) ; org.springframework.jdbc.config.InitializeDatabaseIntegrationTests.CacheData org.springframework.jdbc.config.InitializeDatabaseIntegrationTests.CacheData = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( org.springframework.jdbc.config.InitializeDatabaseIntegrationTests.CacheData .class ) ; assertEquals ( NUMBER , org.springframework.jdbc.config.InitializeDatabaseIntegrationTests.CacheData . java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( ) . int ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( javax.sql.DataSource javax.sql.DataSource ) { JdbcTemplate org.springframework.jdbc.config.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; assertEquals ( NUMBER , org.springframework.jdbc.config.JdbcTemplate . queryForObject ( STRING , java.lang.Integer .class ) . intValue ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . org.springframework.jdbc.config.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( ) { return java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { java.util.List<java.util.Map<java.lang.String,java.lang.Object>> = org.springframework.jdbc.config.JdbcTemplate . queryForList ( STRING ) ; }  <METHOD_END>
