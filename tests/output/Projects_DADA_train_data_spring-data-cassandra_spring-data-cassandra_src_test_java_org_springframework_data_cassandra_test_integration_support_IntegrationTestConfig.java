<METHOD_START> @ java.lang.Override protected int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.test.integration.support.SchemaAction org.springframework.data.cassandra.test.integration.support.SchemaAction ( ) { return SchemaAction . RECREATE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.test.integration.support.NettyOptions org.springframework.data.cassandra.test.integration.support.NettyOptions ( ) { return IntegrationTestNettyOptions . INSTANCE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.cassandra.test.integration.support.QueryOptions org.springframework.data.cassandra.test.integration.support.QueryOptions ( ) { QueryOptions org.springframework.data.cassandra.test.integration.support.QueryOptions = new QueryOptions ( ) ; org.springframework.data.cassandra.test.integration.support.QueryOptions . setRefreshSchemaIntervalMillis ( NUMBER ) ; return org.springframework.data.cassandra.test.integration.support.QueryOptions ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<org.springframework.data.cassandra.test.integration.support.CreateKeyspaceSpecification> < CreateKeyspaceSpecification > java.util.List<org.springframework.data.cassandra.test.integration.support.CreateKeyspaceSpecification> ( ) { return java.util.Collections . java.util.List ( createKeyspace ( ) . name ( java.lang.String ( ) ) . withSimpleReplication ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<org.springframework.data.cassandra.test.integration.support.DropKeyspaceSpecification> < DropKeyspaceSpecification > java.util.List<org.springframework.data.cassandra.test.integration.support.DropKeyspaceSpecification> ( ) { return java.util.Collections . java.util.List ( DropKeyspaceSpecification . dropKeyspace ( ) . name ( java.lang.String ( ) ) ) ; }  <METHOD_END>
