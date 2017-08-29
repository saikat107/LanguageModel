<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationContext org.springframework.boot.autoconfigure.jdbc.ApplicationContext = org.springframework.boot.autoconfigure.jdbc.ApplicationContext ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.WrapExisting .class ) ; org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( javax.sql.DataSource .class ) ; javax.sql.XADataSource javax.sql.XADataSource = org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( javax.sql.XADataSource .class ) ; org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper = org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper .class ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper . javax.sql.XADataSource ( ) ) . isEqualTo ( javax.sql.XADataSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationContext org.springframework.boot.autoconfigure.jdbc.ApplicationContext = org.springframework.boot.autoconfigure.jdbc.ApplicationContext ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.FromProperties .class , STRING , STRING ) ; org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( javax.sql.DataSource .class ) ; org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper = org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper .class ) ; JDBCXADataSource org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource = ( JDBCXADataSource ) org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper . javax.sql.XADataSource ( ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource ) . isNotNull ( ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource . getUrl ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource . getUser ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ApplicationContext org.springframework.boot.autoconfigure.jdbc.ApplicationContext = org.springframework.boot.autoconfigure.jdbc.ApplicationContext ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.FromProperties .class , STRING , STRING ) ; org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( javax.sql.DataSource .class ) ; org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper = org.springframework.boot.autoconfigure.jdbc.ApplicationContext . getBean ( org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper .class ) ; JDBCXADataSource org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource = ( JDBCXADataSource ) org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper . javax.sql.XADataSource ( ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource ) . isNotNull ( ) ; assertThat ( org.springframework.boot.autoconfigure.jdbc.JDBCXADataSource . getDatabaseName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.jdbc.ApplicationContext org.springframework.boot.autoconfigure.jdbc.ApplicationContext ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext , java.lang.String[] ) ; org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . register ( java.lang.Class<> , XADataSourceAutoConfiguration .class ) ; org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext . refresh ( ) ; return org.springframework.boot.autoconfigure.jdbc.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper ( ) { return new org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.XADataSource javax.sql.XADataSource ( ) { return mock ( javax.sql.XADataSource .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper ( ) { return new org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfigurationTests.MockXADataSourceWrapper ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.sql.DataSource javax.sql.DataSource ( javax.sql.XADataSource javax.sql.XADataSource ) { this . javax.sql.XADataSource = javax.sql.XADataSource ; return mock ( javax.sql.DataSource .class ) ; }  <METHOD_END>
<METHOD_START> public javax.sql.XADataSource javax.sql.XADataSource ( ) { return this . javax.sql.XADataSource ; }  <METHOD_END>