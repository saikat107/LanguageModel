<METHOD_START> public javax.management.MBeanServerConnection javax.management.MBeanServerConnection ( javax.management.remote.JMXServiceURL javax.management.remote.JMXServiceURL , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , java.lang.String java.lang.String )			throws org.springframework.jmx.access.MBeanServerNotFoundException { if ( javax.management.remote.JMXServiceURL != null ) { if ( org.springframework.jmx.access.Log . isDebugEnabled ( ) ) { org.springframework.jmx.access.Log . debug ( STRING + javax.management.remote.JMXServiceURL + STRING ) ; } try { this . javax.management.remote.JMXConnector = javax.management.remote.JMXConnectorFactory . javax.management.remote.JMXConnector ( javax.management.remote.JMXServiceURL , java.util.Map<java.lang.String,> ) ; return this . javax.management.remote.JMXConnector . javax.management.MBeanServerConnection ( ) ; } catch ( java.io.IOException java.io.IOException ) { throw new MBeanServerNotFoundException ( STRING + javax.management.remote.JMXServiceURL + STRING , java.io.IOException ) ; } } else { org.springframework.jmx.access.Log . debug ( STRING ) ; return JmxUtils . locateMBeanServer ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public void void ( ) { if ( this . javax.management.remote.JMXConnector != null ) { try { this . javax.management.remote.JMXConnector . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { org.springframework.jmx.access.Log . debug ( STRING , java.io.IOException ) ; } } }  <METHOD_END>