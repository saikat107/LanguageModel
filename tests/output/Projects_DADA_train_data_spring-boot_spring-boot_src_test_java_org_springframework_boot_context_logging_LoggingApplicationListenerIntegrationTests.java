<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.boot.context.logging.ConfigurableApplicationContext = new SpringApplicationBuilder ( org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.SampleService .class ) . web ( WebApplicationType . NONE ) . run ( ) ; try { org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.SampleService org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.SampleService = org.springframework.boot.context.logging.ConfigurableApplicationContext . getBean ( org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.SampleService .class ) ; assertThat ( org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.SampleService . org.springframework.boot.context.logging.LoggingSystem ) . isNotNull ( ) ; } finally { org.springframework.boot.context.logging.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { new SpringApplicationBuilder ( org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.Config .class ) . web ( WebApplicationType . NONE ) . child ( org.springframework.boot.context.logging.LoggingApplicationListenerIntegrationTests.Config .class ) . web ( WebApplicationType . NONE ) . listeners ( new ApplicationListener < ApplicationStartingEvent > ( ) { private final org.springframework.boot.context.logging.Logger org.springframework.boot.context.logging.Logger = LoggerFactory . getLogger ( java.lang.Class<? extends > ( ) ) ; @ java.lang.Override public void void ( ApplicationStartingEvent org.springframework.boot.context.logging.ApplicationStartingEvent ) { this . org.springframework.boot.context.logging.Logger . info ( STRING ) ; } } ) . run ( ) ; assertThat ( this . org.springframework.boot.context.logging.InternalOutputCapture . toString ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationStartingEvent org.springframework.boot.context.logging.ApplicationStartingEvent ) { this . org.springframework.boot.context.logging.Logger . info ( STRING ) ; }  <METHOD_END>
<METHOD_START> void ( LoggingSystem org.springframework.boot.context.logging.LoggingSystem ) { this . org.springframework.boot.context.logging.LoggingSystem = org.springframework.boot.context.logging.LoggingSystem ; }  <METHOD_END>
