<METHOD_START> public void void ( IntegrationMBeanExporter org.springframework.integration.monitor.IntegrationMBeanExporter ) { this . org.springframework.integration.monitor.IntegrationMBeanExporter = org.springframework.integration.monitor.IntegrationMBeanExporter ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.integration.monitor.HandlerMonitoringIntegrationTests.Service org.springframework.integration.monitor.HandlerMonitoringIntegrationTests.Service ) { this . org.springframework.integration.monitor.HandlerMonitoringIntegrationTests.Service = org.springframework.integration.monitor.HandlerMonitoringIntegrationTests.Service ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ClassPathXmlApplicationContext org.springframework.integration.monitor.ClassPathXmlApplicationContext = org.springframework.integration.monitor.ClassPathXmlApplicationContext ( STRING , STRING ) ; try { assertTrue ( java.util.Arrays . java.util.List ( org.springframework.integration.monitor.IntegrationMBeanExporter . getHandlerNames ( ) ) . contains ( STRING ) ) ; } finally { org.springframework.integration.monitor.ClassPathXmlApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.lang.Exception { ClassPathXmlApplicationContext org.springframework.integration.monitor.ClassPathXmlApplicationContext = org.springframework.integration.monitor.ClassPathXmlApplicationContext ( java.lang.String , java.lang.String ) ; try { int int = org.springframework.integration.monitor.HandlerMonitoringIntegrationTests.Service . int ( ) ; org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( int + NUMBER , org.springframework.integration.monitor.HandlerMonitoringIntegrationTests.Service . int ( ) ) ; int int = org.springframework.integration.monitor.IntegrationMBeanExporter . getHandlerDuration ( java.lang.String ) . getCount ( ) ; assertTrue ( STRING , int > NUMBER ) ; } finally { org.springframework.integration.monitor.ClassPathXmlApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.monitor.ClassPathXmlApplicationContext org.springframework.integration.monitor.ClassPathXmlApplicationContext ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { ClassPathXmlApplicationContext org.springframework.integration.monitor.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.String , java.lang.Class<? extends org.springframework.integration.monitor.HandlerMonitoringIntegrationTests> ( ) ) ; org.springframework.integration.monitor.ClassPathXmlApplicationContext . getAutowireCapableBeanFactory ( ) . autowireBeanProperties ( this , AutowireCapableBeanFactory . AUTOWIRE_BY_TYPE , false ) ; org.springframework.integration.monitor.MessageChannel = org.springframework.integration.monitor.ClassPathXmlApplicationContext . getBean ( java.lang.String , MessageChannel .class ) ; return org.springframework.integration.monitor.ClassPathXmlApplicationContext ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String ) throws java.lang.Exception ;  <METHOD_END>
<METHOD_START> int int ( )  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.Thread . void ( NUMBER ) ; int ++ ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> @ Before ( STRING ) public void void ( java.lang.String java.lang.String ) { org.springframework.integration.monitor.Log . debug ( STRING + java.lang.String ) ; }  <METHOD_END>
