<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { EmbeddedDatabaseBuilder org.springframework.data.rest.webmvc.jpa.EmbeddedDatabaseBuilder = new EmbeddedDatabaseBuilder ( ) ; return org.springframework.data.rest.webmvc.jpa.EmbeddedDatabaseBuilder . setType ( EmbeddedDatabaseType . HSQL ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean ( ) { HibernateJpaVendorAdapter org.springframework.data.rest.webmvc.jpa.HibernateJpaVendorAdapter = new HibernateJpaVendorAdapter ( ) ; org.springframework.data.rest.webmvc.jpa.HibernateJpaVendorAdapter . setDatabase ( Database . HSQL ) ; org.springframework.data.rest.webmvc.jpa.HibernateJpaVendorAdapter . setGenerateDdl ( true ) ; LocalContainerEntityManagerFactoryBean org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean ( ) ; org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean . setJpaVendorAdapter ( org.springframework.data.rest.webmvc.jpa.HibernateJpaVendorAdapter ) ; org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean . setPackagesToScan ( java.lang.Class<? extends org.springframework.data.rest.webmvc.jpa.JpaInfrastructureConfig> ( ) . java.lang.Package ( ) . java.lang.String ( ) ) ; org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean . setPersistenceUnitName ( STRING ) ; org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean . setDataSource ( javax.sql.DataSource ( ) ) ; org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean . afterPropertiesSet ( ) ; return org.springframework.data.rest.webmvc.jpa.LocalContainerEntityManagerFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.rest.webmvc.jpa.PlatformTransactionManager org.springframework.data.rest.webmvc.jpa.PlatformTransactionManager ( ) { return new JpaTransactionManager ( ) ; }  <METHOD_END>