<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; java.lang.String java.lang.String = STRING + org.springframework.integration.monitor.PollableChannel ; assertEquals ( NUMBER , org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelSendCount ( java.lang.String ) ) ; double double = org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelSendRate ( STRING + org.springframework.integration.monitor.MessageChannel ) . getMean ( ) ; assertTrue ( STRING , double >= NUMBER ) ; double = org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelSendRate ( java.lang.String ) . getMean ( ) ; assertTrue ( STRING , double >= NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ) ; assertEquals ( NUMBER , org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelReceiveCount ( java.lang.String ) ) ; org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; try { org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; } catch ( MessageDeliveryException org.springframework.integration.monitor.MessageDeliveryException ) {		} assertEquals ( NUMBER , org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelSendCount ( java.lang.String ) ) ; assertEquals ( NUMBER , org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelSendErrorCount ( java.lang.String ) ) ; assertSame ( org.springframework.integration.monitor.PollableChannel , org.springframework.integration.monitor.IntegrationMBeanExporter . getChannelMetrics ( java.lang.String ) ) ; MessageHandlerMetrics org.springframework.integration.monitor.MessageHandlerMetrics = org.springframework.integration.monitor.IntegrationMBeanExporter . getHandlerMetrics ( STRING ) ; assertEquals ( NUMBER , org.springframework.integration.monitor.MessageHandlerMetrics . getHandleCount ( ) ) ; assertEquals ( NUMBER , org.springframework.integration.monitor.MessageHandlerMetrics . getErrorCount ( ) ) ; assertNotNull ( this . org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ) ; assertTrue ( org.springframework.integration.monitor.IntegrationMBeanExporter . getSourceMessageCount ( STRING ) > NUMBER ) ; assertTrue ( org.springframework.integration.monitor.IntegrationMBeanExporter . getSourceMetrics ( STRING ) . getMessageCount ( ) > NUMBER ) ; }  <METHOD_END>