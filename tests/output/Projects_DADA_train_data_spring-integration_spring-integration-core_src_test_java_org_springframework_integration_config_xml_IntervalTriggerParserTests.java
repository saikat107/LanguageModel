<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) ; assertEquals ( PollerMetadata .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; PollerMetadata org.springframework.integration.config.xml.PollerMetadata = ( PollerMetadata ) java.lang.Object ; Trigger org.springframework.integration.config.xml.Trigger = org.springframework.integration.config.xml.PollerMetadata . getTrigger ( ) ; assertEquals ( PeriodicTrigger .class , org.springframework.integration.config.xml.Trigger . getClass ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.Trigger ) ; java.lang.Boolean java.lang.Boolean = ( java.lang.Boolean ) org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ; java.lang.Long java.lang.Long = ( java.lang.Long ) org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( java.lang.Boolean , true ) ; assertEquals ( NUMBER , java.lang.Long . long ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) ; assertEquals ( PollerMetadata .class , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; PollerMetadata org.springframework.integration.config.xml.PollerMetadata = ( PollerMetadata ) java.lang.Object ; Trigger org.springframework.integration.config.xml.Trigger = org.springframework.integration.config.xml.PollerMetadata . getTrigger ( ) ; assertEquals ( PeriodicTrigger .class , org.springframework.integration.config.xml.Trigger . getClass ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.Trigger ) ; java.lang.Boolean java.lang.Boolean = ( java.lang.Boolean ) org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ; java.lang.Long java.lang.Long = ( java.lang.Long ) org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertEquals ( java.lang.Boolean , false ) ; assertEquals ( NUMBER , java.lang.Long . long ( ) ) ; }  <METHOD_END>
