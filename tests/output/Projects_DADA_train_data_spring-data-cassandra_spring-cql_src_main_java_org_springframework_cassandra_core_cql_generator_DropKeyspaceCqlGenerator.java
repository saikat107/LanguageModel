<METHOD_START> public static java.lang.String java.lang.String ( DropKeyspaceSpecification org.springframework.cassandra.core.cql.generator.DropKeyspaceSpecification ) { return new org.springframework.cassandra.core.cql.generator.DropKeyspaceCqlGenerator ( org.springframework.cassandra.core.cql.generator.DropKeyspaceSpecification ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public void ( DropKeyspaceSpecification org.springframework.cassandra.core.cql.generator.DropKeyspaceSpecification ) { super( org.springframework.cassandra.core.cql.generator.DropKeyspaceSpecification ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.StringBuilder java.lang.StringBuilder ( java.lang.StringBuilder java.lang.StringBuilder ) { return noNull ( java.lang.StringBuilder ) . append ( STRING ) . append ( spec ( ) . getIfExists ( ) ? STRING : STRING ) . append ( spec ( ) . getName ( ) ) . append ( STRING ) ; }  <METHOD_END>
