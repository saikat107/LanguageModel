<METHOD_START> @ Test public void void ( ) { SourcePollingChannelAdapter org.springframework.integration.config.xml.SourcePollingChannelAdapter = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; assertFalse ( org.springframework.integration.config.xml.SourcePollingChannelAdapter . isAutoStartup ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.SourcePollingChannelAdapter ) ; Trigger org.springframework.integration.config.xml.Trigger = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Trigger .class ) ; assertEquals ( PeriodicTrigger .class , org.springframework.integration.config.xml.Trigger . getClass ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.Trigger ) ; assertEquals ( NUMBER , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Expression org.springframework.integration.config.xml.Expression = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SourcePollingChannelAdapter org.springframework.integration.config.xml.SourcePollingChannelAdapter = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; assertFalse ( org.springframework.integration.config.xml.SourcePollingChannelAdapter . isAutoStartup ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.SourcePollingChannelAdapter ) ; Trigger org.springframework.integration.config.xml.Trigger = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Trigger .class ) ; assertEquals ( PeriodicTrigger .class , org.springframework.integration.config.xml.Trigger . getClass ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.Trigger ) ; assertEquals ( NUMBER , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( java.lang.Boolean . java.lang.Boolean , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; assertEquals ( org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Expression org.springframework.integration.config.xml.Expression = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SourcePollingChannelAdapter org.springframework.integration.config.xml.SourcePollingChannelAdapter = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; assertFalse ( org.springframework.integration.config.xml.SourcePollingChannelAdapter . isAutoStartup ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.SourcePollingChannelAdapter ) ; Trigger org.springframework.integration.config.xml.Trigger = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Trigger .class ) ; assertEquals ( CronTrigger .class , org.springframework.integration.config.xml.Trigger . getClass ( ) ) ; assertEquals ( STRING , new DirectFieldAccessor ( new DirectFieldAccessor ( org.springframework.integration.config.xml.Trigger ) . getPropertyValue ( STRING ) ) . getPropertyValue ( STRING ) ) ; assertEquals ( org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Expression org.springframework.integration.config.xml.Expression = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SourcePollingChannelAdapter org.springframework.integration.config.xml.SourcePollingChannelAdapter = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; assertTrue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter . isAutoStartup ( ) ) ; DirectFieldAccessor org.springframework.integration.config.xml.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.config.xml.SourcePollingChannelAdapter ) ; Trigger org.springframework.integration.config.xml.Trigger = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Trigger .class ) ; assertEquals ( org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) , org.springframework.integration.config.xml.Trigger ) ; assertEquals ( org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING ) , org.springframework.integration.config.xml.DirectFieldAccessor . getPropertyValue ( STRING ) ) ; Expression org.springframework.integration.config.xml.Expression = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { SourcePollingChannelAdapter org.springframework.integration.config.xml.SourcePollingChannelAdapter = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; assertFalse ( org.springframework.integration.config.xml.SourcePollingChannelAdapter . isAutoStartup ( ) ) ; java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , java.util.Map .class ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> . size ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> . get ( STRING ) . getExpressionString ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> . get ( STRING ) . getExpressionString ( ) ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> . get ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,org.springframework.integration.config.xml.Expression> . get ( STRING ) . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SourcePollingChannelAdapter org.springframework.integration.config.xml.SourcePollingChannelAdapter = org.springframework.integration.config.xml.ApplicationContext . getBean ( STRING , SourcePollingChannelAdapter .class ) ; Expression org.springframework.integration.config.xml.Expression = TestUtils . getPropertyValue ( org.springframework.integration.config.xml.SourcePollingChannelAdapter , STRING , Expression .class ) ; assertEquals ( STRING , org.springframework.integration.config.xml.Expression . getExpressionString ( ) ) ; }  <METHOD_END>
