<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . javax.management.ObjectName = ObjectNameManager . getInstance ( STRING ) ; org.springframework.integration.jmx.StaticApplicationContext . registerSingleton ( STRING , IntegrationMBeanExporter .class ) ; org.springframework.integration.jmx.StaticApplicationContext . registerSingleton ( STRING , MBeanExporter .class ) ; RootBeanDefinition org.springframework.integration.jmx.RootBeanDefinition = new RootBeanDefinition ( NotificationPublishingMessageHandler .class ) ; org.springframework.integration.jmx.RootBeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( this . javax.management.ObjectName ) ; org.springframework.integration.jmx.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , STRING ) ; org.springframework.integration.jmx.StaticApplicationContext . registerBeanDefinition ( STRING , org.springframework.integration.jmx.RootBeanDefinition ) ; org.springframework.integration.jmx.StaticApplicationContext . refresh ( ) ; MBeanExporter org.springframework.integration.jmx.MBeanExporter = org.springframework.integration.jmx.StaticApplicationContext . getBean ( IntegrationMBeanExporter .class ) ; org.springframework.integration.jmx.MBeanExporter . getServer ( ) . addNotificationListener ( javax.management.ObjectName , this . org.springframework.integration.jmx.NotificationPublishingMessageHandlerTests.TestNotificationListener , null , null ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { this . org.springframework.integration.jmx.NotificationPublishingMessageHandlerTests.TestNotificationListener . void ( ) ; org.springframework.integration.jmx.StaticApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHandler org.springframework.integration.jmx.MessageHandler = org.springframework.integration.jmx.StaticApplicationContext . getBean ( STRING , MessageHandler .class ) ; assertEquals ( NUMBER , this . org.springframework.integration.jmx.NotificationPublishingMessageHandlerTests.TestNotificationListener . java.util.List<javax.management.Notification> . int ( ) ) ; org.springframework.integration.jmx.MessageHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; assertEquals ( NUMBER , this . org.springframework.integration.jmx.NotificationPublishingMessageHandlerTests.TestNotificationListener . java.util.List<javax.management.Notification> . int ( ) ) ; javax.management.Notification javax.management.Notification = this . org.springframework.integration.jmx.NotificationPublishingMessageHandlerTests.TestNotificationListener . java.util.List<javax.management.Notification> . javax.management.Notification ( NUMBER ) ; assertEquals ( this . javax.management.ObjectName , javax.management.Notification . java.lang.Object ( ) ) ; assertEquals ( STRING , javax.management.Notification . java.lang.String ( ) ) ; assertEquals ( STRING , javax.management.Notification . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( javax.management.Notification javax.management.Notification , java.lang.Object java.lang.Object ) { this . java.util.List<javax.management.Notification> . boolean ( javax.management.Notification ) ; }  <METHOD_END>
<METHOD_START> void void ( ) { this . java.util.List<javax.management.Notification> . void ( ) ; }  <METHOD_END>