<METHOD_START> @ ServiceActivator public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.handler.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; verify ( org.springframework.integration.handler.ServiceActivatorOnMockitoMockTests.SingleAnnotatedMethodOnClass ) . move ( STRING ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.handler.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; verify ( org.springframework.integration.handler.ServiceActivatorOnMockitoMockTests.SingleMethodOnClass ) . move ( STRING ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( @ Header ( STRING ) java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.handler.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . setHeader ( STRING , STRING ) . build ( ) ) ; verify ( org.springframework.integration.handler.ServiceActivatorOnMockitoMockTests.SingleMethodAcceptingHeaderOnClass ) . move ( STRING ) ; }  <METHOD_END>
