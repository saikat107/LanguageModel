<METHOD_START> @ Before public void void ( ) { org.springframework.cassandra.support.CassandraAccessor = new CassandraAccessor ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.cassandra.support.CassandraAccessor . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertThat ( java.lang.IllegalStateException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.cassandra.support.CassandraAccessor . setExceptionTranslator ( org.springframework.cassandra.support.CassandraExceptionTranslator ) ; assertThat ( org.springframework.cassandra.support.CassandraAccessor . getExceptionTranslator ( ) ) . isSameAs ( org.springframework.cassandra.support.CassandraExceptionTranslator ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.cassandra.support.CassandraAccessor . setExceptionTranslator ( null ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertThat ( java.lang.IllegalArgumentException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.cassandra.support.CassandraAccessor . getExceptionTranslator ( ) ) . isEqualTo ( org.springframework.cassandra.support.CassandraAccessor . exceptionTranslator ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.cassandra.support.CassandraAccessor . setSession ( org.springframework.cassandra.support.Session ) ; assertThat ( org.springframework.cassandra.support.CassandraAccessor . getSession ( ) ) . isSameAs ( org.springframework.cassandra.support.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.cassandra.support.CassandraAccessor . setSession ( null ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertThat ( java.lang.IllegalArgumentException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.cassandra.support.CassandraAccessor . getSession ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertThat ( java.lang.IllegalStateException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
