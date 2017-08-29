<METHOD_START> @ java.lang.Override public org.springframework.data.solr.core.DataAccessException org.springframework.data.solr.core.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { if ( java.lang.RuntimeException instanceof DataAccessException ) { return ( DataAccessException ) java.lang.RuntimeException ; } if ( java.lang.RuntimeException . java.lang.Throwable ( ) instanceof SolrServerException ) { SolrServerException org.springframework.data.solr.core.SolrServerException = ( SolrServerException ) java.lang.RuntimeException . java.lang.Throwable ( ) ; if ( org.springframework.data.solr.core.SolrServerException . getCause ( ) instanceof SolrException ) { SolrException org.springframework.data.solr.core.SolrException = ( SolrException ) org.springframework.data.solr.core.SolrServerException . getCause ( ) ; if ( org.springframework.data.solr.core.SolrException . getCause ( ) != null && ClassUtils . getShortName ( org.springframework.data.solr.core.SolrException . getCause ( ) . getClass ( ) ) . equalsIgnoreCase ( STRING ) ) { return new InvalidDataAccessApiUsageException ( ( org.springframework.data.solr.core.SolrException . getCause ( ) ) . getMessage ( ) , org.springframework.data.solr.core.SolrException . getCause ( ) ) ; } else { ErrorCode org.springframework.data.solr.core.ErrorCode = SolrException . ErrorCode . getErrorCode ( org.springframework.data.solr.core.SolrException . code ( ) ) ; switch ( org.springframework.data.solr.core.ErrorCode ) { case NOT_FOUND : case SERVICE_UNAVAILABLE : case SERVER_ERROR : return new DataAccessResourceFailureException ( org.springframework.data.solr.core.SolrException . getMessage ( ) , org.springframework.data.solr.core.SolrException ) ; case FORBIDDEN : case UNAUTHORIZED : return new PermissionDeniedDataAccessException ( org.springframework.data.solr.core.SolrException . getMessage ( ) , org.springframework.data.solr.core.SolrException ) ; case BAD_REQUEST : return new InvalidDataAccessApiUsageException ( org.springframework.data.solr.core.SolrException . getMessage ( ) , org.springframework.data.solr.core.SolrException ) ; case UNKNOWN : return new UncategorizedSolrException ( org.springframework.data.solr.core.SolrException . getMessage ( ) , org.springframework.data.solr.core.SolrException ) ; default: break; } } } else if ( org.springframework.data.solr.core.SolrServerException . getCause ( ) instanceof java.net.ConnectException ) { return new DataAccessResourceFailureException ( org.springframework.data.solr.core.SolrServerException . getCause ( ) . getMessage ( ) , org.springframework.data.solr.core.SolrServerException . getCause ( ) ) ; } } return null ; }  <METHOD_END>
