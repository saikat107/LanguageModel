<METHOD_START> public void ( SubscribableChannel org.springframework.messaging.simp.config.SubscribableChannel , MessageChannel org.springframework.messaging.simp.config.MessageChannel , java.lang.String [] java.lang.String[] ) { super( org.springframework.messaging.simp.config.SubscribableChannel , org.springframework.messaging.simp.config.MessageChannel , java.lang.String[] ); }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.simp.config.SimpleBrokerRegistration org.springframework.messaging.simp.config.SimpleBrokerRegistration ( TaskScheduler org.springframework.messaging.simp.config.TaskScheduler ) { this . org.springframework.messaging.simp.config.TaskScheduler = org.springframework.messaging.simp.config.TaskScheduler ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.messaging.simp.config.SimpleBrokerRegistration org.springframework.messaging.simp.config.SimpleBrokerRegistration ( long [] long[] ) { this . long[] = long[] ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.messaging.simp.config.SimpleBrokerMessageHandler org.springframework.messaging.simp.config.SimpleBrokerMessageHandler ( SubscribableChannel org.springframework.messaging.simp.config.SubscribableChannel ) { SimpleBrokerMessageHandler org.springframework.messaging.simp.config.SimpleBrokerMessageHandler = new SimpleBrokerMessageHandler ( getClientInboundChannel ( ) , getClientOutboundChannel ( ) , org.springframework.messaging.simp.config.SubscribableChannel , getDestinationPrefixes ( ) ) ; if ( this . org.springframework.messaging.simp.config.TaskScheduler != null ) { org.springframework.messaging.simp.config.SimpleBrokerMessageHandler . setTaskScheduler ( this . org.springframework.messaging.simp.config.TaskScheduler ) ; } if ( this . long[] != null ) { org.springframework.messaging.simp.config.SimpleBrokerMessageHandler . setHeartbeatValue ( this . long[] ) ; } return org.springframework.messaging.simp.config.SimpleBrokerMessageHandler ; }  <METHOD_END>
