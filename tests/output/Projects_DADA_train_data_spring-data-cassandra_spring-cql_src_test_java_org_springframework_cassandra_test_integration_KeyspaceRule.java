<METHOD_START> public void ( CassandraRule org.springframework.cassandra.test.integration.CassandraRule ) { this( org.springframework.cassandra.test.integration.CassandraRule , RandomKeySpaceName . create ( ) ); }  <METHOD_END>
<METHOD_START> public void ( CassandraRule org.springframework.cassandra.test.integration.CassandraRule , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.cassandra.test.integration.CassandraRule , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.cassandra.test.integration.CassandraRule = org.springframework.cassandra.test.integration.CassandraRule ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Throwable { if ( org.springframework.cassandra.test.integration.CassandraRule . getCluster ( ) != null ) { this . org.springframework.cassandra.test.integration.Session = org.springframework.cassandra.test.integration.CassandraRule . getSession ( ) ; } else { org.springframework.cassandra.test.integration.CassandraRule . before ( session -> { KeyspaceRule .this . session = cassandraRule . getSession ( ) ; return null ; } ) ; } Assert . state ( org.springframework.cassandra.test.integration.Session != null , STRING ) ; org.springframework.cassandra.test.integration.Session . execute ( java.lang.String . java.lang.String ( STRING + STRING , java.lang.String ) ) ; org.springframework.cassandra.test.integration.Session . execute ( java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { org.springframework.cassandra.test.integration.Session . execute ( STRING ) ; org.springframework.cassandra.test.integration.Session . execute ( java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.test.integration.Session org.springframework.cassandra.test.integration.Session ( ) { return org.springframework.cassandra.test.integration.Session ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
