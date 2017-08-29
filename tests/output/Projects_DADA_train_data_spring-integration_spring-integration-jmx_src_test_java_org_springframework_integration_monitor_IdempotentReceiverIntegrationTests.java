<METHOD_START> @ Test public void void ( ) { this . org.springframework.integration.monitor.IdempotentReceiverInterceptor . setThrowExceptionOnRejection ( true ) ; TestUtils . getPropertyValue ( this . org.springframework.integration.monitor.MetadataStore , STRING , java.util.Map .class ) . clear ( ) ; Message < java.lang.String > org.springframework.integration.monitor.Message<java.lang.String> = new GenericMessage <> ( STRING ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; Message < ? > org.springframework.integration.monitor.Message<?> = this . org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertEquals ( NUMBER , this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( this . org.springframework.integration.monitor.MetadataStore , STRING , java.util.Map .class ) . size ( ) ) ; java.lang.String java.lang.String = this . org.springframework.integration.monitor.MetadataStore . get ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; try { this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception , instanceOf ( MessageRejectedException .class ) ) ; } this . org.springframework.integration.monitor.IdempotentReceiverInterceptor . setThrowExceptionOnRejection ( false ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; org.springframework.integration.monitor.Message<?> = this . org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertEquals ( NUMBER , this . java.util.concurrent.atomic.AtomicInteger . int ( ) ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . get ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE , java.lang.Boolean .class ) ) ; assertEquals ( NUMBER , TestUtils . getPropertyValue ( org.springframework.integration.monitor.MetadataStore , STRING , java.util.Map .class ) . size ( ) ) ; assertTrue ( this . java.util.concurrent.atomic.AtomicBoolean . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestUtils . getPropertyValue ( this . org.springframework.integration.monitor.MetadataStore , STRING , java.util.Map .class ) . clear ( ) ; Message < java.lang.String > org.springframework.integration.monitor.Message<java.lang.String> = new GenericMessage <> ( STRING ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; assertEquals ( NUMBER , this . org.springframework.integration.monitor.IdempotentReceiverIntegrationTests.FooService . java.util.List<org.springframework.integration.monitor.Message<?>> . size ( ) ) ; assertTrue ( this . org.springframework.integration.monitor.IdempotentReceiverIntegrationTests.FooService . java.util.List<org.springframework.integration.monitor.Message<?>> . get ( NUMBER ) . getHeaders ( ) . get ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE , java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PollableChannel org.springframework.integration.monitor.PollableChannel = new QueueChannel ( ) ; Message < java.lang.String > org.springframework.integration.monitor.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.monitor.PollableChannel ) . build ( ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; Message < ? > org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertFalse ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . get ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE , java.lang.Boolean .class ) ) ; this . org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; try { this . org.springframework.integration.monitor.MessageChannel . send ( new GenericMessage < java.lang.String > ( STRING ) ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertThat ( java.lang.Exception . java.lang.String ( ) , containsString ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PollableChannel org.springframework.integration.monitor.PollableChannel = new QueueChannel ( ) ; Message < java.lang.String > org.springframework.integration.monitor.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setReplyChannel ( org.springframework.integration.monitor.PollableChannel ) . build ( ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; Message < ? > org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertFalse ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; org.springframework.integration.monitor.Message<?> = org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . get ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE , java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < java.lang.String > org.springframework.integration.monitor.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . build ( ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; Message < ? > org.springframework.integration.monitor.Message<?> = this . org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertFalse ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) ; this . org.springframework.integration.monitor.MessageChannel . send ( org.springframework.integration.monitor.Message<java.lang.String> ) ; org.springframework.integration.monitor.Message<?> = this . org.springframework.integration.monitor.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.monitor.Message<> ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) ; assertTrue ( org.springframework.integration.monitor.Message<> . getHeaders ( ) . get ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE , java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public static org.springframework.integration.monitor.MBeanServerFactoryBean org.springframework.integration.monitor.MBeanServerFactoryBean ( ) { MBeanServerFactoryBean org.springframework.integration.monitor.MBeanServerFactoryBean = new MBeanServerFactoryBean ( ) ; org.springframework.integration.monitor.MBeanServerFactoryBean . setLocateExistingServerIfPossible ( true ) ; return org.springframework.integration.monitor.MBeanServerFactoryBean ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.HazelcastInstance org.springframework.integration.monitor.HazelcastInstance ( ) { return Hazelcast . newHazelcastInstance ( new Config ( ) . setProperty ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.ConcurrentMetadataStore org.springframework.integration.monitor.ConcurrentMetadataStore ( ) { return new SimpleMetadataStore ( org.springframework.integration.monitor.HazelcastInstance ( ) . getMap ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.IdempotentReceiverInterceptor org.springframework.integration.monitor.IdempotentReceiverInterceptor ( ) { return new IdempotentReceiverInterceptor ( new MetadataStoreSelector ( message -> message . getPayload ( ) . toString ( ) , message -> message . getPayload ( ) . toString ( ) . toUpperCase ( ) , org.springframework.integration.monitor.ConcurrentMetadataStore ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.PlatformTransactionManager org.springframework.integration.monitor.PlatformTransactionManager ( ) { return spy ( new PseudoTransactionManager ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.TransactionInterceptor org.springframework.integration.monitor.TransactionInterceptor ( ) { return new TransactionInterceptorBuilder ( true ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.MessageChannel org.springframework.integration.monitor.MessageChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.PollableChannel org.springframework.integration.monitor.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean ( ) { return new java.util.concurrent.atomic.AtomicBoolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ GlobalChannelInterceptor ( patterns = STRING ) public org.springframework.integration.monitor.ChannelInterceptor org.springframework.integration.monitor.ChannelInterceptor ( final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean ) { return new ChannelInterceptorAdapter ( ) { @ java.lang.Override public void void ( Message < ? > org.springframework.integration.monitor.Message<?> , MessageChannel org.springframework.integration.monitor.MessageChannel , boolean boolean ) { super. postSend ( org.springframework.integration.monitor.Message<> , org.springframework.integration.monitor.MessageChannel , boolean ) ; java.util.concurrent.atomic.AtomicBoolean . void ( TransactionSynchronizationManager . isActualTransactionActive ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.monitor.Message<?> , MessageChannel org.springframework.integration.monitor.MessageChannel , boolean boolean ) { super. postSend ( org.springframework.integration.monitor.Message<> , org.springframework.integration.monitor.MessageChannel , boolean ) ; java.util.concurrent.atomic.AtomicBoolean . void ( TransactionSynchronizationManager . isActualTransactionActive ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ org . springframework . integration . org.springframework.integration.annotation . org.springframework.integration.annotation ( inputChannel = STRING , outputChannel = STRING , adviceChain = { STRING , STRING , STRING } ) public org.springframework.integration.monitor.Transformer org.springframework.integration.monitor.Transformer ( ) { return message -> message ; }  <METHOD_END>
<METHOD_START> @ Bean public java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger ( ) { return new java.util.concurrent.atomic.AtomicInteger ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.Advice org.springframework.integration.monitor.Advice ( final java.util.concurrent.atomic.AtomicInteger java.util.concurrent.atomic.AtomicInteger ) { return new AbstractRequestHandlerAdvice ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.monitor.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.monitor.Message<?> )						throws java.lang.Exception { java.util.concurrent.atomic.AtomicInteger . int ( ) ; return org.springframework.integration.monitor.ExecutionCallback . execute ( ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.monitor.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.monitor.Message<?> )						throws java.lang.Exception { java.util.concurrent.atomic.AtomicInteger . int ( ) ; return org.springframework.integration.monitor.ExecutionCallback . execute ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.MessageChannel org.springframework.integration.monitor.MessageChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.monitor.IdempotentReceiverIntegrationTests.FooService org.springframework.integration.monitor.IdempotentReceiverIntegrationTests.FooService ( ) { return new org.springframework.integration.monitor.IdempotentReceiverIntegrationTests.FooService ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ BridgeTo @ IdempotentReceiver ( STRING ) public org.springframework.integration.monitor.MessageChannel org.springframework.integration.monitor.MessageChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ BridgeFrom ( STRING ) @ IdempotentReceiver ( STRING ) public org.springframework.integration.monitor.PollableChannel org.springframework.integration.monitor.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) @ IdempotentReceiver ( STRING ) public org.springframework.integration.monitor.MessageHandler org.springframework.integration.monitor.MessageHandler ( ) { return new ServiceActivatingHandler ( ( MessageProcessor < java.lang.Object > ) message -> message ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) @ IdempotentReceiver ( STRING ) public org.springframework.integration.monitor.MessageHandler org.springframework.integration.monitor.MessageHandler ( ) { return message -> { if ( message . getHeaders ( ) . containsKey ( IntegrationMessageHeaderAccessor . DUPLICATE_MESSAGE ) ) { throw new MessageHandlingException ( message , STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator ( inputChannel = STRING ) @ IdempotentReceiver ( STRING ) public void void ( Message < ? > org.springframework.integration.monitor.Message<?> ) { this . java.util.List<org.springframework.integration.monitor.Message<?>> . add ( org.springframework.integration.monitor.Message<> ) ; }  <METHOD_END>
