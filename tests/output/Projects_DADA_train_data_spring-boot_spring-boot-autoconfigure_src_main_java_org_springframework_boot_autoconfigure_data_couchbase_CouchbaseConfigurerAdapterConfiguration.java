<METHOD_START> void ( CouchbaseConfiguration org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration ) { this . org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration = org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfigurer org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfigurer ( ) java.lang.Exception { return new SpringBootCouchbaseConfigurer ( this . org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration . couchbaseEnvironment ( ) , this . org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration . couchbaseCluster ( ) , this . org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration . couchbaseClusterInfo ( ) , this . org.springframework.boot.autoconfigure.data.couchbase.CouchbaseConfiguration . couchbaseClient ( ) ) ; }  <METHOD_END>
