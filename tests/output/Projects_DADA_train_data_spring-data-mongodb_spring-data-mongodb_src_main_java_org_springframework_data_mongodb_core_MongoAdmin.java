<METHOD_START> public void ( MongoClient org.springframework.data.mongodb.core.MongoClient ) { Assert . notNull ( org.springframework.data.mongodb.core.MongoClient , STRING ) ; this . org.springframework.data.mongodb.core.MongoClient = org.springframework.data.mongodb.core.MongoClient ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation public void void ( java.lang.String java.lang.String ) { org.springframework.data.mongodb.core.MongoDatabase ( java.lang.String ) . drop ( ) ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation public void void ( java.lang.String java.lang.String ) { org.springframework.data.mongodb.core.MongoDatabase ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return org.springframework.data.mongodb.core.MongoDatabase ( java.lang.String ) . runCommand ( new Document ( STRING , NUMBER ) . append ( STRING , NUMBER ) ) . toJson ( ) ; }  <METHOD_END>
<METHOD_START> @ ManagedOperation public java.lang.String java.lang.String ( ) { return org.springframework.data.mongodb.core.MongoDatabase ( STRING ) . runCommand ( new Document ( STRING , NUMBER ) . append ( STRING , NUMBER ) . append ( STRING , NUMBER ) ) . toJson ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.core.MongoDatabase org.springframework.data.mongodb.core.MongoDatabase ( java.lang.String java.lang.String ) { return org.springframework.data.mongodb.core.MongoClient . getDatabase ( java.lang.String ) ; }  <METHOD_END>
