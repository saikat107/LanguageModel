<METHOD_START> @ Before public void void ( ) java.lang.Exception { MBeanTestUtils . resetMBeanServers ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { MBeanTestUtils . resetMBeanServers ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MBeanServerFactoryBean org.springframework.jmx.support.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.jmx.support.MBeanServerFactoryBean . afterPropertiesSet ( ) ; try { javax.management.MBeanServer javax.management.MBeanServer = org.springframework.jmx.support.MBeanServerFactoryBean . getObject ( ) ; assertNotNull ( STRING , javax.management.MBeanServer ) ; } finally { org.springframework.jmx.support.MBeanServerFactoryBean . destroy ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MBeanServerFactoryBean org.springframework.jmx.support.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.jmx.support.MBeanServerFactoryBean . setDefaultDomain ( STRING ) ; org.springframework.jmx.support.MBeanServerFactoryBean . afterPropertiesSet ( ) ; try { javax.management.MBeanServer javax.management.MBeanServer = org.springframework.jmx.support.MBeanServerFactoryBean . getObject ( ) ; assertEquals ( STRING , STRING , javax.management.MBeanServer . java.lang.String ( ) ) ; } finally { org.springframework.jmx.support.MBeanServerFactoryBean . destroy ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { javax.management.MBeanServer javax.management.MBeanServer = javax.management.MBeanServerFactory . javax.management.MBeanServer ( ) ; try { MBeanServerFactoryBean org.springframework.jmx.support.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.jmx.support.MBeanServerFactoryBean . setLocateExistingServerIfPossible ( true ) ; org.springframework.jmx.support.MBeanServerFactoryBean . afterPropertiesSet ( ) ; try { javax.management.MBeanServer javax.management.MBeanServer = org.springframework.jmx.support.MBeanServerFactoryBean . getObject ( ) ; assertSame ( STRING , javax.management.MBeanServer , javax.management.MBeanServer ) ; } finally { org.springframework.jmx.support.MBeanServerFactoryBean . destroy ( ) ; } } finally { javax.management.MBeanServerFactory . void ( javax.management.MBeanServer ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MBeanServerFactoryBean org.springframework.jmx.support.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.jmx.support.MBeanServerFactoryBean . setLocateExistingServerIfPossible ( true ) ; org.springframework.jmx.support.MBeanServerFactoryBean . afterPropertiesSet ( ) ; try { assertSame ( java.lang.management.ManagementFactory . javax.management.MBeanServer ( ) , org.springframework.jmx.support.MBeanServerFactoryBean . getObject ( ) ) ; } finally { org.springframework.jmx.support.MBeanServerFactoryBean . destroy ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MBeanServerFactoryBean org.springframework.jmx.support.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.jmx.support.MBeanServerFactoryBean . setAgentId ( STRING ) ; org.springframework.jmx.support.MBeanServerFactoryBean . afterPropertiesSet ( ) ; try { assertSame ( java.lang.management.ManagementFactory . javax.management.MBeanServer ( ) , org.springframework.jmx.support.MBeanServerFactoryBean . getObject ( ) ) ; } finally { org.springframework.jmx.support.MBeanServerFactoryBean . destroy ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( false , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean , java.lang.String java.lang.String ) throws java.lang.Exception { MBeanServerFactoryBean org.springframework.jmx.support.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.jmx.support.MBeanServerFactoryBean . setRegisterWithFactory ( boolean ) ; org.springframework.jmx.support.MBeanServerFactoryBean . afterPropertiesSet ( ) ; try { javax.management.MBeanServer javax.management.MBeanServer = org.springframework.jmx.support.MBeanServerFactoryBean . getObject ( ) ; java.util.List<javax.management.MBeanServer> < javax.management.MBeanServer > java.util.List<javax.management.MBeanServer> = javax.management.MBeanServerFactory . java.util.ArrayList<javax.management.MBeanServer> ( null ) ; boolean boolean = false ; for ( javax.management.MBeanServer javax.management.MBeanServer : java.util.List<javax.management.MBeanServer> ) { if ( javax.management.MBeanServer == javax.management.MBeanServer ) { boolean = true ; break; } } if ( ! ( boolean == boolean ) ) { fail ( java.lang.String ) ; } } finally { org.springframework.jmx.support.MBeanServerFactoryBean . destroy ( ) ; } }  <METHOD_END>