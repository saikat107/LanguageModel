<METHOD_START> public static < T > T T ( Bson org.springframework.data.mongodb.util.Bson , java.lang.String java.lang.String ) { return ( T ) java.util.Map<java.lang.String,java.lang.Object> ( org.springframework.data.mongodb.util.Bson ) . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( Bson org.springframework.data.mongodb.util.Bson ) { if ( org.springframework.data.mongodb.util.Bson instanceof Document ) { return ( Document ) org.springframework.data.mongodb.util.Bson ; } if ( org.springframework.data.mongodb.util.Bson instanceof BasicDBObject ) { return ( ( BasicDBObject ) org.springframework.data.mongodb.util.Bson ) ; } throw new java.lang.IllegalArgumentException ( STRING + org.springframework.data.mongodb.util.Bson . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( Bson org.springframework.data.mongodb.util.Bson , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( org.springframework.data.mongodb.util.Bson instanceof Document ) { ( ( Document ) org.springframework.data.mongodb.util.Bson ) . put ( java.lang.String , java.lang.Object ) ; return; } if ( org.springframework.data.mongodb.util.Bson instanceof DBObject ) { ( ( DBObject ) org.springframework.data.mongodb.util.Bson ) . put ( java.lang.String , java.lang.Object ) ; return; } throw new java.lang.IllegalArgumentException ( STRING + org.springframework.data.mongodb.util.Bson . getClass ( ) ) ; }  <METHOD_END>
