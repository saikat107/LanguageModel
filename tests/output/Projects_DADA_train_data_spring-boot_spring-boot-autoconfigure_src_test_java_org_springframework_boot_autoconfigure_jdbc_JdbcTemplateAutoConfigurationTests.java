<METHOD_START> @ Before public void void ( ) { EmbeddedDatabaseConnection . override = null ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext , STRING , STRING + new java.util.Random ( ) . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { EmbeddedDatabaseConnection . override = null ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; JdbcTemplate org.springframework.boot.autoconfigure.jdbc.JdbcTemplate = this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( JdbcTemplate .class ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplate ) . isNotNull ( ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplate . getDataSource ( ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfigurationTests.TestDataSourceConfiguration .class , DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; JdbcTemplate org.springframework.boot.autoconfigure.jdbc.JdbcTemplate = this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( JdbcTemplate .class ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplate ) . isNotNull ( ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplate . getDataSource ( ) instanceof BasicDataSource ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( NamedParameterJdbcOperations .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( MultiDataSourceConfiguration .class , DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBeansOfType ( JdbcOperations .class ) ) . isEmpty ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBeansOfType ( NamedParameterJdbcOperations .class ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( MultiDataSourceUsingPrimaryConfiguration .class , DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( JdbcOperations .class ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( NamedParameterJdbcOperations .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfigurationTests.CustomConfiguration .class , DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( JdbcOperations .class ) ) . isEqualTo ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfigurationTests.CustomConfiguration .class , DataSourceAutoConfiguration .class , JdbcTemplateAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( NamedParameterJdbcOperations .class ) ) . isEqualTo ( this . org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . getBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.JdbcOperations org.springframework.boot.autoconfigure.jdbc.JdbcOperations ( javax.sql.DataSource javax.sql.DataSource ) { return new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcOperations org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcOperations ( javax.sql.DataSource javax.sql.DataSource ) { return new NamedParameterJdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { return new TestDataSource ( STRING ) ; }  <METHOD_END>