<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Set<javax.management.ObjectName> < javax.management.ObjectName > java.util.Set<javax.management.ObjectName> = javax.management.MBeanServer . java.util.Set<javax.management.ObjectName> ( new javax.management.ObjectName ( STRING ) , null ) ; assertEquals ( NUMBER , java.util.Set<javax.management.ObjectName> . int ( ) ) ; org.springframework.integration.jmx.config.SubscribableChannel . subscribe ( message -> assertEquals ( STRING , message . getPayload ( ) ) ) ; org.springframework.integration.jmx.config.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; }  <METHOD_END>