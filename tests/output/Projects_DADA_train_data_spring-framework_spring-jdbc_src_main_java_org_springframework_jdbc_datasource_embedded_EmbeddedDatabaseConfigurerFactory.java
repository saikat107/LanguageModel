<METHOD_START> public static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseConfigurer org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseConfigurer ( EmbeddedDatabaseType org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType ) throws java.lang.IllegalStateException { Assert . notNull ( org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType , STRING ) ; try { switch ( org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType ) { case HSQL : return HsqlEmbeddedDatabaseConfigurer . getInstance ( ) ; case H2 : return H2EmbeddedDatabaseConfigurer . getInstance ( ) ; case DERBY : return DerbyEmbeddedDatabaseConfigurer . getInstance ( ) ; default: throw new java.lang.UnsupportedOperationException ( STRING + org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType + STRING ) ; } } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType + STRING , java.lang.ClassNotFoundException ) ; } }  <METHOD_END>
<METHOD_START> private void ( ) { }  <METHOD_END>
