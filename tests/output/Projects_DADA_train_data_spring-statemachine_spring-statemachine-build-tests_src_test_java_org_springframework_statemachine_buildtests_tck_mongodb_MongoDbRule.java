<METHOD_START> @ java.lang.Override public org.springframework.statemachine.buildtests.tck.mongodb.Statement org.springframework.statemachine.buildtests.tck.mongodb.Statement ( Statement org.springframework.statemachine.buildtests.tck.mongodb.Statement , Description org.springframework.statemachine.buildtests.tck.mongodb.Description ) { MongoClient org.springframework.statemachine.buildtests.tck.mongodb.MongoClient = null ; try { org.springframework.statemachine.buildtests.tck.mongodb.MongoClient = new MongoClient ( new ServerAddress ( ) , MongoClientOptions . builder ( ) . connectTimeout ( NUMBER ) . serverSelectionTimeout ( NUMBER ) . build ( ) ) ; org.springframework.statemachine.buildtests.tck.mongodb.MongoClient . getAddress ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { return super. apply ( new Statement ( ) { @ java.lang.Override public void void ( ) java.lang.Throwable {				} } , Description . EMPTY ) ; } finally { if ( org.springframework.statemachine.buildtests.tck.mongodb.MongoClient != null ) { org.springframework.statemachine.buildtests.tck.mongodb.MongoClient . close ( ) ; } } return super. apply ( org.springframework.statemachine.buildtests.tck.mongodb.Statement , org.springframework.statemachine.buildtests.tck.mongodb.Description ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable {				}  <METHOD_END>
