<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.integration.jdbc.CreateUser . createUser ( new User ( STRING , STRING , STRING ) ) ; java.util.List<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> < Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > > java.util.List<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> = new java.util.ArrayList<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> < Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > > ( ) ; java.util.List<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> . add ( org.springframework.integration.jdbc.StoredProcOutboundGatewayWithSpringContextIntegrationTests.Consumer . org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ( NUMBER ) ) ; Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> = java.util.List<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> . get ( NUMBER ) ; org.springframework.integration.jdbc.AbstractApplicationContext . stop ( ) ; assertNotNull ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ) ; assertNotNull ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> . getPayload ( ) ) ; assertNotNull ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> . getPayload ( ) instanceof java.util.Collection<?> < ? > ) ; java.util.Collection<org.springframework.integration.jdbc.User> < User > java.util.Collection<org.springframework.integration.jdbc.User> = org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> . getPayload ( ) ; assertTrue ( java.util.Collection<org.springframework.integration.jdbc.User> . size ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Integer java.lang.Integer ( ) java.lang.InterruptedException { if ( java.util.concurrent.atomic.AtomicInteger . int ( ) > NUMBER ) { return null ; } return java.lang.Integer . java.lang.Integer ( java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator public void void ( Message < java.util.Collection<org.springframework.integration.jdbc.User> < User > > org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ) { java.util.concurrent.BlockingQueue<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> . add ( org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ) ; }  <METHOD_END>
<METHOD_START> org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> < java.util.Collection<org.springframework.integration.jdbc.User> < User > > org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>> ( long long ) throws java.lang.InterruptedException { return java.util.concurrent.BlockingQueue<org.springframework.integration.jdbc.Message<java.util.Collection<org.springframework.integration.jdbc.User>>> . poll ( long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; }  <METHOD_END>