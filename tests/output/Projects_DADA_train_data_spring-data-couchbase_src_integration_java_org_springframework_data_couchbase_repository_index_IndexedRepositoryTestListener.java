<METHOD_START> @ java.lang.Override public void void ( final TestContext org.springframework.data.couchbase.repository.index.TestContext ) throws java.lang.Exception { Bucket org.springframework.data.couchbase.repository.index.Bucket = ( Bucket ) org.springframework.data.couchbase.repository.index.TestContext . getApplicationContext ( ) . getBean ( BeanNames . COUCHBASE_BUCKET ) ; try { org.springframework.data.couchbase.repository.index.Bucket . bucketManager ( ) . removeDesignDocument ( IndexedRepositoryTests . VIEW_DOC ) ; org.springframework.data.couchbase.repository.index.Bucket . bucketManager ( ) . removeDesignDocument ( STRING ) ; } catch ( DesignDocumentDoesNotExistException org.springframework.data.couchbase.repository.index.DesignDocumentDoesNotExistException ) { } org.springframework.data.couchbase.repository.index.Bucket . query ( N1qlQuery . simple ( Index . dropPrimaryIndex ( org.springframework.data.couchbase.repository.index.Bucket . name ( ) ) ) ) ; org.springframework.data.couchbase.repository.index.Bucket . query ( N1qlQuery . simple ( Index . dropIndex ( org.springframework.data.couchbase.repository.index.Bucket . name ( ) , IndexedRepositoryTests . SECONDARY ) ) ) ; }  <METHOD_END>