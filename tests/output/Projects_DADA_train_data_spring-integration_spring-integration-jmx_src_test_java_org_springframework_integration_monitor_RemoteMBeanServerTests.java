<METHOD_START> @ Test public void void ( ) java.lang.Exception { Message < ? > org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertEquals ( STRING , org.springframework.integration.monitor.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getPayload ( ) instanceof javax.management.Notification ) ; javax.management.Notification javax.management.Notification = ( javax.management.Notification ) org.springframework.integration.monitor.Message<> . getPayload ( ) ; assertEquals ( STRING , javax.management.Notification . java.lang.String ( ) ) ; assertEquals ( STRING , javax.management.Notification . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertEquals ( STRING , org.springframework.integration.monitor.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return STRING ; }  <METHOD_END>
