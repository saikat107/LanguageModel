<METHOD_START> public void ( Cluster org.springframework.data.couchbase.config.Cluster , java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . org.springframework.data.couchbase.config.Cluster = org.springframework.data.couchbase.config.Cluster ; this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return ClusterInfo .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.couchbase.config.ClusterInfo org.springframework.data.couchbase.config.ClusterInfo ( ) java.lang.Exception { return org.springframework.data.couchbase.config.Cluster . clusterManager ( java.lang.String , java.lang.String ) . info ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.config.DataAccessException org.springframework.data.couchbase.config.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { return org.springframework.data.couchbase.config.PersistenceExceptionTranslator . translateExceptionIfPossible ( java.lang.RuntimeException ) ; }  <METHOD_END>
