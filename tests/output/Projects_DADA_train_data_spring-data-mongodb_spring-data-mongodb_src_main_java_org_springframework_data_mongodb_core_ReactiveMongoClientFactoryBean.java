<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . java.lang.Integer = int ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( MongoClientSettings org.springframework.data.mongodb.core.MongoClientSettings ) { this . org.springframework.data.mongodb.core.MongoClientSettings = org.springframework.data.mongodb.core.MongoClientSettings ; }  <METHOD_END>
<METHOD_START> public void void ( PersistenceExceptionTranslator org.springframework.data.mongodb.core.PersistenceExceptionTranslator ) { this . org.springframework.data.mongodb.core.PersistenceExceptionTranslator = org.springframework.data.mongodb.core.PersistenceExceptionTranslator == null ? org.springframework.data.mongodb.core.PersistenceExceptionTranslator : org.springframework.data.mongodb.core.PersistenceExceptionTranslator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return MongoClient .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.mongodb.core.MongoClient org.springframework.data.mongodb.core.MongoClient ( ) java.lang.Exception { if ( org.springframework.data.mongodb.core.MongoClientSettings != null ) { return MongoClients . create ( org.springframework.data.mongodb.core.MongoClientSettings ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { return MongoClients . create ( java.lang.String ) ; } if ( StringUtils . hasText ( java.lang.String ) ) { if ( java.lang.Integer != null ) { return MongoClients . create ( java.lang.String . java.lang.String ( STRING , java.lang.String , java.lang.Integer ) ) ; } return MongoClients . create ( java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; } throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( MongoClient org.springframework.data.mongodb.core.MongoClient ) throws java.lang.Exception { org.springframework.data.mongodb.core.MongoClient . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.DataAccessException org.springframework.data.mongodb.core.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { return org.springframework.data.mongodb.core.PersistenceExceptionTranslator . translateExceptionIfPossible ( java.lang.RuntimeException ) ; }  <METHOD_END>