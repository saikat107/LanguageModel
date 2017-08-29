<METHOD_START> public void ( ) { super( STRING , STRING ); }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { StompHeaderAccessor org.springframework.integration.stomp.outbound.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SEND ) ; org.springframework.integration.stomp.outbound.StompHeaderAccessor . setDestination ( STRING ) ; Message < java.lang.String > org.springframework.integration.stomp.outbound.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setHeaders ( org.springframework.integration.stomp.outbound.StompHeaderAccessor ) . build ( ) ; this . org.springframework.integration.stomp.outbound.MessageChannel . send ( org.springframework.integration.stomp.outbound.Message<java.lang.String> ) ; org.springframework.integration.stomp.outbound.StompMessageHandlerWebSocketIntegrationTests.SimpleController org.springframework.integration.stomp.outbound.StompMessageHandlerWebSocketIntegrationTests.SimpleController = this . org.springframework.integration.stomp.outbound.ApplicationContext . getBean ( org.springframework.integration.stomp.outbound.StompMessageHandlerWebSocketIntegrationTests.SimpleController .class ) ; assertTrue ( org.springframework.integration.stomp.outbound.StompMessageHandlerWebSocketIntegrationTests.SimpleController . java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; Message < ? > org.springframework.integration.stomp.outbound.Message<?> = this . org.springframework.integration.stomp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.stomp.outbound.Message<> ) ; assertThat ( org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) , instanceOf ( StompSessionConnectedEvent .class ) ) ; org.springframework.integration.stomp.outbound.Message<?> = this . org.springframework.integration.stomp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.stomp.outbound.Message<> ) ; assertThat ( org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) , instanceOf ( StompReceiptEvent .class ) ) ; StompReceiptEvent org.springframework.integration.stomp.outbound.StompReceiptEvent = ( StompReceiptEvent ) org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) ; assertEquals ( StompCommand . SEND , org.springframework.integration.stomp.outbound.StompReceiptEvent . getStompCommand ( ) ) ; assertEquals ( STRING , org.springframework.integration.stomp.outbound.StompReceiptEvent . getDestination ( ) ) ; assertTrue ( org.springframework.integration.stomp.outbound.StompReceiptEvent . isLost ( ) ) ; assertNotNull ( org.springframework.integration.stomp.outbound.StompReceiptEvent . getMessage ( ) ) ; org.springframework.integration.stomp.outbound.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SEND ) ; org.springframework.integration.stomp.outbound.StompHeaderAccessor . setDestination ( STRING ) ; org.springframework.integration.stomp.outbound.Message<java.lang.String> = MessageBuilder . withPayload ( STRING ) . setHeaders ( org.springframework.integration.stomp.outbound.StompHeaderAccessor ) . build ( ) ; this . org.springframework.integration.stomp.outbound.MessageChannel . send ( org.springframework.integration.stomp.outbound.Message<java.lang.String> ) ; org.springframework.integration.stomp.outbound.Message<?> = this . org.springframework.integration.stomp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.stomp.outbound.Message<> ) ; assertThat ( org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) , instanceOf ( StompExceptionEvent .class ) ) ; StompExceptionEvent org.springframework.integration.stomp.outbound.StompExceptionEvent = ( StompExceptionEvent ) org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) ; java.lang.Throwable java.lang.Throwable = org.springframework.integration.stomp.outbound.StompExceptionEvent . getCause ( ) ; assertThat ( java.lang.Throwable , instanceOf ( MessageDeliveryException .class ) ) ; MessageDeliveryException org.springframework.integration.stomp.outbound.MessageDeliveryException = ( MessageDeliveryException ) java.lang.Throwable ; Message < ? > org.springframework.integration.stomp.outbound.Message<?> = org.springframework.integration.stomp.outbound.MessageDeliveryException . getFailedMessage ( ) ; assertThat ( ( java.lang.String ) org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) , containsString ( STRING ) ) ; org.springframework.integration.stomp.outbound.Message<?> = this . org.springframework.integration.stomp.outbound.PollableChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.stomp.outbound.Message<> ) ; assertThat ( org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) , instanceOf ( StompReceiptEvent .class ) ) ; org.springframework.integration.stomp.outbound.StompReceiptEvent = ( StompReceiptEvent ) org.springframework.integration.stomp.outbound.Message<> . getPayload ( ) ; assertEquals ( StompCommand . SEND , org.springframework.integration.stomp.outbound.StompReceiptEvent . getStompCommand ( ) ) ; assertEquals ( STRING , org.springframework.integration.stomp.outbound.StompReceiptEvent . getDestination ( ) ) ; assertTrue ( org.springframework.integration.stomp.outbound.StompReceiptEvent . isLost ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.stomp.outbound.TomcatWebSocketTestServer org.springframework.integration.stomp.outbound.TomcatWebSocketTestServer ( ) { return new TomcatWebSocketTestServer ( org.springframework.integration.stomp.outbound.StompMessageHandlerWebSocketIntegrationTests.ServerConfig .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.stomp.outbound.WebSocketClient org.springframework.integration.stomp.outbound.WebSocketClient ( ) { return new SockJsClient ( java.util.Collections .< Transport > java.util.List<org.springframework.integration.stomp.outbound.Transport> ( new WebSocketTransport ( new StandardWebSocketClient ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.stomp.outbound.WebSocketStompClient org.springframework.integration.stomp.outbound.WebSocketStompClient ( TaskScheduler org.springframework.integration.stomp.outbound.TaskScheduler ) { WebSocketStompClient org.springframework.integration.stomp.outbound.WebSocketStompClient = new WebSocketStompClient ( org.springframework.integration.stomp.outbound.WebSocketClient ( ) ) ; org.springframework.integration.stomp.outbound.WebSocketStompClient . setTaskScheduler ( org.springframework.integration.stomp.outbound.TaskScheduler ) ; org.springframework.integration.stomp.outbound.WebSocketStompClient . setReceiptTimeLimit ( NUMBER ) ; org.springframework.integration.stomp.outbound.WebSocketStompClient . setMessageConverter ( new StringMessageConverter ( ) ) ; return org.springframework.integration.stomp.outbound.WebSocketStompClient ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.stomp.outbound.StompSessionManager org.springframework.integration.stomp.outbound.StompSessionManager ( WebSocketStompClient org.springframework.integration.stomp.outbound.WebSocketStompClient ) { WebSocketStompSessionManager org.springframework.integration.stomp.outbound.WebSocketStompSessionManager = new WebSocketStompSessionManager ( org.springframework.integration.stomp.outbound.WebSocketStompClient , org.springframework.integration.stomp.outbound.TomcatWebSocketTestServer ( ) . getWsBaseUrl ( ) + STRING ) ; org.springframework.integration.stomp.outbound.WebSocketStompSessionManager . setAutoReceipt ( true ) ; org.springframework.integration.stomp.outbound.WebSocketStompSessionManager . setRecoveryInterval ( NUMBER ) ; return org.springframework.integration.stomp.outbound.WebSocketStompSessionManager ; }  <METHOD_END>
<METHOD_START> @ Bean @ ServiceActivator ( inputChannel = STRING ) public org.springframework.integration.stomp.outbound.MessageHandler org.springframework.integration.stomp.outbound.MessageHandler ( StompSessionManager org.springframework.integration.stomp.outbound.StompSessionManager ) { StompMessageHandler org.springframework.integration.stomp.outbound.StompMessageHandler = new StompMessageHandler ( org.springframework.integration.stomp.outbound.StompSessionManager ) ; org.springframework.integration.stomp.outbound.StompMessageHandler . setConnectTimeout ( NUMBER ) ; return org.springframework.integration.stomp.outbound.StompMessageHandler ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.stomp.outbound.PollableChannel org.springframework.integration.stomp.outbound.PollableChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.SuppressWarnings ( STRING ) public org.springframework.integration.stomp.outbound.ApplicationListener<org.springframework.integration.stomp.outbound.ApplicationEvent> < ApplicationEvent > org.springframework.integration.stomp.outbound.ApplicationListener<org.springframework.integration.stomp.outbound.ApplicationEvent> ( ) { ApplicationEventListeningMessageProducer org.springframework.integration.stomp.outbound.ApplicationEventListeningMessageProducer = new ApplicationEventListeningMessageProducer ( ) ; org.springframework.integration.stomp.outbound.ApplicationEventListeningMessageProducer . setEventTypes ( StompIntegrationEvent .class ) ; org.springframework.integration.stomp.outbound.ApplicationEventListeningMessageProducer . setOutputChannel ( org.springframework.integration.stomp.outbound.PollableChannel ( ) ) ; return org.springframework.integration.stomp.outbound.ApplicationEventListeningMessageProducer ; }  <METHOD_END>
<METHOD_START> @ MessageMapping ( STRING ) public void void ( ) { this . java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.stomp.outbound.DefaultHandshakeHandler org.springframework.integration.stomp.outbound.DefaultHandshakeHandler ( ) { return new DefaultHandshakeHandler ( new TomcatRequestUpgradeStrategy ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompEndpointRegistry org.springframework.integration.stomp.outbound.StompEndpointRegistry ) { org.springframework.integration.stomp.outbound.StompEndpointRegistry . addEndpoint ( STRING ) . setHandshakeHandler ( org.springframework.integration.stomp.outbound.DefaultHandshakeHandler ( ) ) . withSockJS ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageBrokerRegistry org.springframework.integration.stomp.outbound.MessageBrokerRegistry ) { org.springframework.integration.stomp.outbound.MessageBrokerRegistry . setApplicationDestinationPrefixes ( STRING ) ; org.springframework.integration.stomp.outbound.MessageBrokerRegistry . enableSimpleBroker ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ChannelRegistration org.springframework.integration.stomp.outbound.ChannelRegistration ) { org.springframework.integration.stomp.outbound.ChannelRegistration . setInterceptors ( new ChannelInterceptorAdapter ( ) { private final java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( ) ; @ java.lang.Override public org.springframework.integration.stomp.outbound.Message<?> < ? > org.springframework.integration.stomp.outbound.Message<?> ( Message < ? > org.springframework.integration.stomp.outbound.Message<?> , MessageChannel org.springframework.integration.stomp.outbound.MessageChannel ) { if ( StompCommand . CONNECT . equals ( StompHeaderAccessor . wrap ( org.springframework.integration.stomp.outbound.Message<> ) . getCommand ( ) ) || this . java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { return super. preSend ( org.springframework.integration.stomp.outbound.Message<> , org.springframework.integration.stomp.outbound.MessageChannel ) ; } throw new java.lang.RuntimeException ( STRING ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.stomp.outbound.Message<?> < ? > org.springframework.integration.stomp.outbound.Message<?> ( Message < ? > org.springframework.integration.stomp.outbound.Message<?> , MessageChannel org.springframework.integration.stomp.outbound.MessageChannel ) { if ( StompCommand . CONNECT . equals ( StompHeaderAccessor . wrap ( org.springframework.integration.stomp.outbound.Message<> ) . getCommand ( ) ) || this . java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { return super. preSend ( org.springframework.integration.stomp.outbound.Message<> , org.springframework.integration.stomp.outbound.MessageChannel ) ; } throw new java.lang.RuntimeException ( STRING ) ; }  <METHOD_END>