<METHOD_START> @ Test public void void ( ) java.lang.Exception { Assume . group ( TestGroup . LONG_RUNNING ) ; void ( STRING , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Assume . group ( TestGroup . LONG_RUNNING ) ; void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , ( java.lang.String ) -> java.lang.String . boolean ( DEFAULT_DATABASE_NAME ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , ( java.lang.String ) -> java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , ( java.lang.String ) -> java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.function.Predicate<java.lang.String> < java.lang.String > java.util.function.Predicate<java.lang.String> = ( java.lang.String ) -> java.lang.String . boolean ( STRING ) ; java.util.function.Predicate<java.lang.String> . java.util.function.Predicate<java.lang.String> ( ( java.lang.String ) -> ! java.lang.String . boolean ( STRING ) ) ; java.util.function.Predicate<java.lang.String> . java.util.function.Predicate<java.lang.String> ( ( java.lang.String ) -> ! java.lang.String . boolean ( STRING ) ) ; void ( STRING , java.util.function.Predicate<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathXmlApplicationContext org.springframework.jdbc.config.ClassPathXmlApplicationContext = org.springframework.jdbc.config.ClassPathXmlApplicationContext ( STRING ) ; try { javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( javax.sql.DataSource .class ) ; JdbcTemplate org.springframework.jdbc.config.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; void ( org.springframework.jdbc.config.JdbcTemplate , NUMBER ) ; org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( DataSourceInitializer .class ) . destroy ( ) ; org.springframework.jdbc.config.ExpectedException . expect ( BadSqlGrammarException .class ) ; void ( org.springframework.jdbc.config.JdbcTemplate , NUMBER ) ; } finally { org.springframework.jdbc.config.ClassPathXmlApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathXmlApplicationContext org.springframework.jdbc.config.ClassPathXmlApplicationContext = org.springframework.jdbc.config.ClassPathXmlApplicationContext ( STRING ) ; try { javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( javax.sql.DataSource .class ) ; JdbcTemplate org.springframework.jdbc.config.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; void ( org.springframework.jdbc.config.JdbcTemplate , NUMBER ) ; org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( EmbeddedDatabaseFactoryBean .class ) . destroy ( ) ; org.springframework.jdbc.config.ExpectedException . expect ( BadSqlGrammarException .class ) ; void ( org.springframework.jdbc.config.JdbcTemplate , NUMBER ) ; } finally { org.springframework.jdbc.config.ClassPathXmlApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathXmlApplicationContext org.springframework.jdbc.config.ClassPathXmlApplicationContext = org.springframework.jdbc.config.ClassPathXmlApplicationContext ( STRING ) ; try { javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( javax.sql.DataSource .class ) ; JdbcTemplate org.springframework.jdbc.config.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; void ( org.springframework.jdbc.config.JdbcTemplate , NUMBER ) ; org.springframework.jdbc.config.ClassPathXmlApplicationContext . getBean ( EmbeddedDatabaseFactoryBean .class ) . destroy ( ) ; org.springframework.jdbc.config.ExpectedException . expect ( BadSqlGrammarException .class ) ; void ( org.springframework.jdbc.config.JdbcTemplate , NUMBER ) ; } finally { org.springframework.jdbc.config.ClassPathXmlApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultListableBeanFactory org.springframework.jdbc.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.jdbc.config.DefaultListableBeanFactory ) . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.jdbc.config.JdbcNamespaceIntegrationTests> ( ) ) ) ; void ( STRING , STRING , org.springframework.jdbc.config.DefaultListableBeanFactory ) ; void ( STRING , STRING , org.springframework.jdbc.config.DefaultListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jdbc.config.ClassPathXmlApplicationContext org.springframework.jdbc.config.ClassPathXmlApplicationContext ( java.lang.String java.lang.String ) { return new ClassPathXmlApplicationContext ( java.lang.String , java.lang.Class<? extends org.springframework.jdbc.config.JdbcNamespaceIntegrationTests> ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , DefaultListableBeanFactory org.springframework.jdbc.config.DefaultListableBeanFactory ) { BeanDefinition org.springframework.jdbc.config.BeanDefinition = org.springframework.jdbc.config.DefaultListableBeanFactory . getBeanDefinition ( java.lang.String ) ; PropertyValue org.springframework.jdbc.config.PropertyValue = org.springframework.jdbc.config.BeanDefinition . getPropertyValues ( ) . getPropertyValue ( java.lang.String ) ; assertThat ( org.springframework.jdbc.config.PropertyValue , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.jdbc.config.PropertyValue . getValue ( ) . toString ( ) , is ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( JdbcTemplate org.springframework.jdbc.config.JdbcTemplate , int int ) { assertEquals ( int , org.springframework.jdbc.config.JdbcTemplate . queryForObject ( STRING , java.lang.Integer .class ) . intValue ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String ... java.lang.String[] ) { void ( java.lang.String , NUMBER , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , int int , java.lang.String ... java.lang.String[] ) { ConfigurableApplicationContext org.springframework.jdbc.config.ConfigurableApplicationContext = org.springframework.jdbc.config.ClassPathXmlApplicationContext ( java.lang.String ) ; try { for ( java.lang.String java.lang.String : java.lang.String[] ) { javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ConfigurableApplicationContext . getBean ( java.lang.String , javax.sql.DataSource .class ) ; void ( new JdbcTemplate ( javax.sql.DataSource ) , int ) ; assertTrue ( javax.sql.DataSource instanceof AbstractDriverBasedDataSource ) ; AbstractDriverBasedDataSource org.springframework.jdbc.config.AbstractDriverBasedDataSource = ( AbstractDriverBasedDataSource ) javax.sql.DataSource ; assertThat ( org.springframework.jdbc.config.AbstractDriverBasedDataSource . getUrl ( ) , containsString ( java.lang.String ) ) ; } } finally { org.springframework.jdbc.config.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.util.function.Predicate<java.lang.String> < java.lang.String > java.util.function.Predicate<java.lang.String> ) { ConfigurableApplicationContext org.springframework.jdbc.config.ConfigurableApplicationContext = org.springframework.jdbc.config.ClassPathXmlApplicationContext ( java.lang.String ) ; try { javax.sql.DataSource javax.sql.DataSource = org.springframework.jdbc.config.ConfigurableApplicationContext . getBean ( javax.sql.DataSource .class ) ; void ( new JdbcTemplate ( javax.sql.DataSource ) , NUMBER ) ; assertTrue ( javax.sql.DataSource instanceof AbstractDriverBasedDataSource ) ; AbstractDriverBasedDataSource org.springframework.jdbc.config.AbstractDriverBasedDataSource = ( AbstractDriverBasedDataSource ) javax.sql.DataSource ; assertTrue ( java.util.function.Predicate<java.lang.String> . boolean ( org.springframework.jdbc.config.AbstractDriverBasedDataSource . getUrl ( ) ) ) ; } finally { org.springframework.jdbc.config.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>