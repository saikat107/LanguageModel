<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.data.mongodb.log4j.ServerAddress = new ServerAddress ( STRING , NUMBER ) ; org.springframework.data.mongodb.log4j.MongoClient = new MongoClient ( org.springframework.data.mongodb.log4j.ServerAddress ) ; org.springframework.data.mongodb.log4j.DB = org.springframework.data.mongodb.log4j.MongoClient . getDB ( STRING ) ; java.util.Calendar java.util.Calendar = java.util.Calendar . java.util.Calendar ( ) ; java.lang.String = java.lang.String . java.lang.String ( java.util.Calendar . int ( java.util.Calendar . int ) ) + java.lang.String . java.lang.String ( STRING , java.util.Calendar . int ( java.util.Calendar . int ) + NUMBER ) ; org.springframework.data.mongodb.log4j.Logger = Logger . getLogger ( org.springframework.data.mongodb.log4j.MongoLog4jAppenderIntegrationTests .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { org.springframework.data.mongodb.log4j.DB . getCollection ( java.lang.String ) . remove ( new BasicDBObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.log4j.Logger . debug ( STRING ) ; org.springframework.data.mongodb.log4j.Logger . info ( STRING ) ; org.springframework.data.mongodb.log4j.Logger . warn ( STRING ) ; org.springframework.data.mongodb.log4j.Logger . error ( STRING ) ; DBCursor org.springframework.data.mongodb.log4j.DBCursor = org.springframework.data.mongodb.log4j.DB . getCollection ( java.lang.String ) . find ( ) ; assertThat ( org.springframework.data.mongodb.log4j.DBCursor . count ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MDC . put ( STRING , STRING ) ; org.springframework.data.mongodb.log4j.Logger . debug ( STRING ) ; }  <METHOD_END>
