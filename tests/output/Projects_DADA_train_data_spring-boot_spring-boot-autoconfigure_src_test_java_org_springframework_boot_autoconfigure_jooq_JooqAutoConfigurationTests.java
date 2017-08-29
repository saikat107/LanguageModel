<METHOD_START> @ Before public void void ( ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext , STRING ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext , STRING ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( JooqAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBeanNamesForType ( DSLContext .class ) . length ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.JooqDataSourceConfiguration .class , JooqAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; assertThat ( java.lang.String[] ( PlatformTransactionManager .class ) ) . isEqualTo ( java.lang.String[] ) ; assertThat ( java.lang.String[] ( SpringTransactionProvider .class ) ) . isEqualTo ( java.lang.String[] ) ; DSLContext org.springframework.boot.autoconfigure.jooq.DSLContext = this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBean ( DSLContext .class ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . execute ( STRING ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.AssertFetch ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.ExecuteSql ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING ) ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.AssertFetch ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; try { org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.ExecuteSql ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; fail ( STRING ) ; } catch ( DataIntegrityViolationException org.springframework.boot.autoconfigure.jooq.DataIntegrityViolationException ) { } org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.AssertFetch ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.JooqDataSourceConfiguration .class , PropertyPlaceholderAutoConfiguration .class , org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TxManagerConfiguration .class , JooqAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBean ( PlatformTransactionManager .class ) ; DSLContext org.springframework.boot.autoconfigure.jooq.DSLContext = this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBean ( DSLContext .class ) ; assertThat ( org.springframework.boot.autoconfigure.jooq.DSLContext . configuration ( ) . dialect ( ) ) . isEqualTo ( SQLDialect . H2 ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . execute ( STRING ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.AssertFetch ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.ExecuteSql ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING ) ) ; org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.AssertFetch ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; try { org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.ExecuteSql ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; fail ( STRING ) ; } catch ( DataIntegrityViolationException org.springframework.boot.autoconfigure.jooq.DataIntegrityViolationException ) { } org.springframework.boot.autoconfigure.jooq.DSLContext . transaction ( new org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.AssertFetch ( org.springframework.boot.autoconfigure.jooq.DSLContext , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.JooqDataSourceConfiguration .class , PropertyPlaceholderAutoConfiguration .class , org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TxManagerConfiguration .class , org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TestRecordMapperProvider .class , org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TestRecordListenerProvider .class , org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TestExecuteListenerProvider .class , org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TestVisitListenerProvider .class , JooqAutoConfiguration .class ) ; DSLContext org.springframework.boot.autoconfigure.jooq.DSLContext = this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBean ( DSLContext .class ) ; assertThat ( org.springframework.boot.autoconfigure.jooq.DSLContext . configuration ( ) . recordMapperProvider ( ) . getClass ( ) ) . isEqualTo ( org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.TestRecordMapperProvider .class ) ; assertThat ( org.springframework.boot.autoconfigure.jooq.DSLContext . configuration ( ) . recordListenerProviders ( ) . length ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.autoconfigure.jooq.DSLContext . configuration ( ) . executeListenerProviders ( ) . length ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.autoconfigure.jooq.DSLContext . configuration ( ) . visitListenerProviders ( ) . length ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext , STRING ) ; void ( org.springframework.boot.autoconfigure.jooq.JooqAutoConfigurationTests.JooqDataSourceConfiguration .class , JooqAutoConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBean ( org . org.jooq . org.jooq .class ) . dialect ( ) ) . isEqualTo ( SQLDialect . POSTGRES ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . register ( java.lang.Class<?>[] ) ; this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.boot.autoconfigure.jooq.AnnotationConfigApplicationContext . getBeanNamesForType ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> void ( DSLContext org.springframework.boot.autoconfigure.jooq.DSLContext , java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . org.springframework.boot.autoconfigure.jooq.DSLContext = org.springframework.boot.autoconfigure.jooq.DSLContext ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org . org.jooq . org.jooq org.jooq.Configuration ) throws java.lang.Exception { assertThat ( this . org.springframework.boot.autoconfigure.jooq.DSLContext . fetch ( this . java.lang.String ) . getValue ( NUMBER , NUMBER ) . toString ( ) ) . isEqualTo ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> void ( DSLContext org.springframework.boot.autoconfigure.jooq.DSLContext , java.lang.String ... java.lang.String[] ) { this . org.springframework.boot.autoconfigure.jooq.DSLContext = org.springframework.boot.autoconfigure.jooq.DSLContext ; this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org . org.jooq . org.jooq org.jooq.Configuration ) throws java.lang.Exception { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { this . org.springframework.boot.autoconfigure.jooq.DSLContext . execute ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { return DataSourceBuilder . create ( ) . url ( STRING ) . username ( STRING ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.jooq.PlatformTransactionManager org.springframework.boot.autoconfigure.jooq.PlatformTransactionManager ( javax.sql.DataSource javax.sql.DataSource ) { return new DataSourceTransactionManager ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < R extends org.springframework.boot.autoconfigure.jooq.Record , E > org.springframework.boot.autoconfigure.jooq.RecordMapper<R,E> < R , E > org.springframework.boot.autoconfigure.jooq.RecordMapper<R,E> ( RecordType < R > org.springframework.boot.autoconfigure.jooq.RecordType<R> , java.lang.Class<? extends E> < ? extends E > java.lang.Class<? extends E> ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.jooq.RecordListener org.springframework.boot.autoconfigure.jooq.RecordListener ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.jooq.ExecuteListener org.springframework.boot.autoconfigure.jooq.ExecuteListener ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.jooq.VisitListener org.springframework.boot.autoconfigure.jooq.VisitListener ( ) { return null ; }  <METHOD_END>