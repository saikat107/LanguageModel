<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; java.lang.String java.lang.String = City .class . java.lang.Package ( ) . java.lang.String ( ) ; AutoConfigurationPackages . register ( this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext , java.lang.String ) ; this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . register ( CassandraAutoConfiguration .class , CassandraDataAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . refresh ( ) ; CassandraSessionFactoryBean org.springframework.boot.autoconfigure.data.cassandra.CassandraSessionFactoryBean = this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . getBean ( CassandraSessionFactoryBean .class ) ; assertThat ( org.springframework.boot.autoconfigure.data.cassandra.CassandraSessionFactoryBean . getSchemaAction ( ) ) . isEqualTo ( SchemaAction . NONE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; java.lang.String java.lang.String = City .class . java.lang.Package ( ) . java.lang.String ( ) ; AutoConfigurationPackages . register ( this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext , java.lang.String ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext , STRING , STRING ) ; this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . register ( CassandraAutoConfiguration .class , CassandraDataAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . refresh ( ) ; CassandraSessionFactoryBean org.springframework.boot.autoconfigure.data.cassandra.CassandraSessionFactoryBean = this . org.springframework.boot.autoconfigure.data.cassandra.AnnotationConfigApplicationContext . getBean ( CassandraSessionFactoryBean .class ) ; assertThat ( org.springframework.boot.autoconfigure.data.cassandra.CassandraSessionFactoryBean . getSchemaAction ( ) ) . isEqualTo ( SchemaAction . RECREATE_DROP_UNUSED ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { Session org.springframework.boot.autoconfigure.data.cassandra.Session = this . org.springframework.boot.autoconfigure.data.cassandra.CassandraTestServer . getCluster ( ) . connect ( ) ; try { org.springframework.boot.autoconfigure.data.cassandra.Session . execute ( STRING + STRING ) ; } finally { org.springframework.boot.autoconfigure.data.cassandra.Session . close ( ) ; } }  <METHOD_END>
