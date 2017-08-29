<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { WebSocketSession org.springframework.integration.websocket.inbound.WebSocketSession = org.springframework.integration.websocket.inbound.IntegrationWebSocketContainer . getSession ( null ) ; assertNotNull ( org.springframework.integration.websocket.inbound.WebSocketSession ) ; assertTrue ( org.springframework.integration.websocket.inbound.WebSocketSession . isOpen ( ) ) ; assertEquals ( STRING , org.springframework.integration.websocket.inbound.WebSocketSession . getAcceptedProtocol ( ) ) ; java.util.Map<java.lang.String,org.springframework.integration.websocket.inbound.WebSocketSession> < java.lang.String , WebSocketSession > java.util.Map<java.lang.String,org.springframework.integration.websocket.inbound.WebSocketSession> = TestUtils . getPropertyValue ( this . org.springframework.integration.websocket.inbound.SubProtocolWebSocketHandler , STRING , java.util.Map .class ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,org.springframework.integration.websocket.inbound.WebSocketSession> . size ( ) ) ; java.lang.String java.lang.String = java.util.Map<java.lang.String,org.springframework.integration.websocket.inbound.WebSocketSession> . keySet ( ) . iterator ( ) . next ( ) ; StompHeaderAccessor org.springframework.integration.websocket.inbound.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . MESSAGE ) ; org.springframework.integration.websocket.inbound.StompHeaderAccessor . setLeaveMutable ( true ) ; org.springframework.integration.websocket.inbound.StompHeaderAccessor . setSessionId ( java.lang.String ) ; Message < byte [] > org.springframework.integration.websocket.inbound.Message<byte[]> = MessageBuilder . createMessage ( java.nio.ByteBuffer . java.nio.ByteBuffer ( NUMBER ) . byte[] ( ) , org.springframework.integration.websocket.inbound.StompHeaderAccessor . getMessageHeaders ( ) ) ; this . org.springframework.integration.websocket.inbound.DirectChannel . send ( org.springframework.integration.websocket.inbound.Message<byte[]> ) ; Message < ? > org.springframework.integration.websocket.inbound.Message<?> = this . org.springframework.integration.websocket.inbound.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.websocket.inbound.Message<> ) ; StompHeaderAccessor org.springframework.integration.websocket.inbound.StompHeaderAccessor = StompHeaderAccessor . wrap ( org.springframework.integration.websocket.inbound.Message<> ) ; assertEquals ( StompCommand . MESSAGE , org.springframework.integration.websocket.inbound.StompHeaderAccessor . getCommand ( ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.websocket.inbound.Message<> . getPayload ( ) ; assertThat ( java.lang.Object , instanceOf ( java.lang.String .class ) ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.websocket.inbound.TomcatWebSocketTestServer org.springframework.integration.websocket.inbound.TomcatWebSocketTestServer ( ) { return new TomcatWebSocketTestServer ( TestServerConfig .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.websocket.inbound.WebSocketClient org.springframework.integration.websocket.inbound.WebSocketClient ( ) { return new SockJsClient ( java.util.Collections .< Transport > java.util.List<org.springframework.integration.websocket.inbound.Transport> ( new WebSocketTransport ( new StandardWebSocketClient ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.websocket.inbound.IntegrationWebSocketContainer org.springframework.integration.websocket.inbound.IntegrationWebSocketContainer ( ) { return new ClientWebSocketContainer ( org.springframework.integration.websocket.inbound.WebSocketClient ( ) , org.springframework.integration.websocket.inbound.TomcatWebSocketTestServer ( ) . getWsBaseUrl ( ) + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.websocket.inbound.SubProtocolHandler org.springframework.integration.websocket.inbound.SubProtocolHandler ( ) { return new StompSubProtocolHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.websocket.inbound.MessageChannel org.springframework.integration.websocket.inbound.MessageChannel ( ) { return new QueueChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.websocket.inbound.MessageProducer org.springframework.integration.websocket.inbound.MessageProducer ( ) { WebSocketInboundChannelAdapter org.springframework.integration.websocket.inbound.WebSocketInboundChannelAdapter = new WebSocketInboundChannelAdapter ( org.springframework.integration.websocket.inbound.IntegrationWebSocketContainer ( ) , new SubProtocolHandlerRegistry ( org.springframework.integration.websocket.inbound.SubProtocolHandler ( ) ) ) ; org.springframework.integration.websocket.inbound.WebSocketInboundChannelAdapter . setOutputChannel ( org.springframework.integration.websocket.inbound.MessageChannel ( ) ) ; return org.springframework.integration.websocket.inbound.WebSocketInboundChannelAdapter ; }  <METHOD_END>
