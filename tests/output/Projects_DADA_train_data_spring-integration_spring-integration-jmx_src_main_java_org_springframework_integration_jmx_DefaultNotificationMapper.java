<METHOD_START> void ( javax.management.ObjectName javax.management.ObjectName , java.lang.String java.lang.String ) { this . javax.management.ObjectName = javax.management.ObjectName ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public javax.management.Notification javax.management.Notification ( Message < ? > org.springframework.integration.jmx.Message<?> ) throws java.lang.Exception { java.lang.String java.lang.String = this . java.lang.String ( org.springframework.integration.jmx.Message<> ) ; Assert . hasText ( java.lang.String , STRING ) ; java.lang.Object java.lang.Object = ( org.springframework.integration.jmx.Message<> != null ) ? org.springframework.integration.jmx.Message<> . getPayload ( ) : null ; java.lang.String java.lang.String = ( java.lang.Object instanceof java.lang.String ) ? ( java.lang.String ) java.lang.Object : null ; javax.management.Notification javax.management.Notification = new javax.management.Notification ( java.lang.String , this . javax.management.ObjectName , this . java.util.concurrent.atomic.AtomicLong . long ( ) , java.lang.System . long ( ) , java.lang.String ) ; if ( java.lang.Object != null && ! ( java.lang.Object instanceof java.lang.String ) ) { javax.management.Notification . void ( java.lang.Object ) ; } return javax.management.Notification ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( Message < ? > org.springframework.integration.jmx.Message<?> ) { java.lang.String java.lang.String = org.springframework.integration.jmx.Message<> . getHeaders ( ) . get ( JmxHeaders . NOTIFICATION_TYPE , java.lang.String .class ) ; return ( java.lang.String != null ) ? java.lang.String : this . java.lang.String ; }  <METHOD_END>
