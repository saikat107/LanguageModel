<METHOD_START> @ Before public void void ( ) java.lang.Exception { MBeanServerFactoryBean org.springframework.integration.jmx.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.integration.jmx.MBeanServerFactoryBean . setLocateExistingServerIfPossible ( true ) ; org.springframework.integration.jmx.MBeanServerFactoryBean . afterPropertiesSet ( ) ; this . javax.management.MBeanServer = org.springframework.integration.jmx.MBeanServerFactoryBean . getObject ( ) ; this . javax.management.MBeanServer . javax.management.ObjectInstance ( this . org.springframework.integration.jmx.AttributePollingMessageSourceTests.TestCounter , ObjectNameManager . getInstance ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AttributePollingMessageSource org.springframework.integration.jmx.AttributePollingMessageSource = new AttributePollingMessageSource ( ) ; org.springframework.integration.jmx.AttributePollingMessageSource . setAttributeName ( STRING ) ; org.springframework.integration.jmx.AttributePollingMessageSource . setObjectName ( STRING ) ; org.springframework.integration.jmx.AttributePollingMessageSource . setServer ( this . javax.management.MBeanServer ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.AttributePollingMessageSource . receive ( ) ; assertNotNull ( org.springframework.integration.jmx.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; this . org.springframework.integration.jmx.AttributePollingMessageSourceTests.TestCounter . void ( ) ; Message < ? > org.springframework.integration.jmx.Message<?> = org.springframework.integration.jmx.AttributePollingMessageSource . receive ( ) ; assertNotNull ( org.springframework.integration.jmx.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.jmx.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> int int ( )  <METHOD_END>
<METHOD_START> public int int ( ) { return this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.util.concurrent.atomic.AtomicInteger . int ( ) ; }  <METHOD_END>