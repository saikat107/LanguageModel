<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.transformer.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.transformer.Message<?> = this . org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , int ) ; this . org.springframework.integration.transformer.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.transformer.Message<?> = this . org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.transformer.Message<> . getHeaders ( ) . get ( STRING ) ; assertEquals ( STRING , java.lang.StackTraceElement[] [ NUMBER ] . java.lang.String ( ) ) ; this . org.springframework.integration.transformer.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; org.springframework.integration.transformer.Message<?> = this . org.springframework.integration.transformer.PollableChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.transformer.Message<> . getPayload ( ) ) ; java.lang.StackTraceElement[] = ( java.lang.StackTraceElement [] ) org.springframework.integration.transformer.Message<> . getHeaders ( ) . get ( STRING ) ; assertEquals ( STRING , java.lang.StackTraceElement[] [ NUMBER ] . java.lang.String ( ) ) ; assertTrue ( this . org.springframework.integration.transformer.TestBean . isRunning ( ) ) ; this . org.springframework.integration.transformer.AbstractEndpoint . stop ( ) ; assertFalse ( this . org.springframework.integration.transformer.TestBean . isRunning ( ) ) ; this . org.springframework.integration.transformer.AbstractEndpoint . start ( ) ; assertTrue ( this . org.springframework.integration.transformer.TestBean . isRunning ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.transformer.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.transformer.Message<?> ) throws java.lang.Exception { int ++ ; return org.springframework.integration.transformer.ExecutionCallback . execute ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { java.lang.Exception java.lang.Exception = new java.lang.RuntimeException ( ) ; java.lang.StackTraceElement [] java.lang.StackTraceElement[] = java.lang.Exception . java.lang.StackTraceElement[] ( ) ; return MessageBuilder . withPayload ( org.springframework.integration.transformer.Message<> . getPayload ( ) . toString ( ) . toUpperCase ( ) ) . setHeader ( STRING , java.lang.StackTraceElement[] ) ; }  <METHOD_END>
