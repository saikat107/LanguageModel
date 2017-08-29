<METHOD_START> public void ( Session org.springframework.web.reactive.socket.adapter.Session , HandshakeInfo org.springframework.web.reactive.socket.adapter.HandshakeInfo , DataBufferFactory org.springframework.web.reactive.socket.adapter.DataBufferFactory ) { this( org.springframework.web.reactive.socket.adapter.Session , org.springframework.web.reactive.socket.adapter.HandshakeInfo , org.springframework.web.reactive.socket.adapter.DataBufferFactory , null ); }  <METHOD_END>
<METHOD_START> public void ( Session org.springframework.web.reactive.socket.adapter.Session , HandshakeInfo org.springframework.web.reactive.socket.adapter.HandshakeInfo , DataBufferFactory org.springframework.web.reactive.socket.adapter.DataBufferFactory , MonoProcessor < java.lang.Void > org.springframework.web.reactive.socket.adapter.MonoProcessor<java.lang.Void> ) { super( org.springframework.web.reactive.socket.adapter.Session , org.springframework.web.reactive.socket.adapter.Session . getId ( ) , org.springframework.web.reactive.socket.adapter.HandshakeInfo , org.springframework.web.reactive.socket.adapter.DataBufferFactory , org.springframework.web.reactive.socket.adapter.MonoProcessor<java.lang.Void> ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( WebSocketMessage org.springframework.web.reactive.socket.adapter.WebSocketMessage ) throws java.io.IOException { java.nio.ByteBuffer java.nio.ByteBuffer = org.springframework.web.reactive.socket.adapter.WebSocketMessage . getPayload ( ) . asByteBuffer ( ) ; if ( WebSocketMessage . Type . TEXT . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getSendProcessor ( ) . setReadyToSend ( false ) ; java.lang.String java.lang.String = new java.lang.String ( java.nio.ByteBuffer . byte[] ( ) , java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; getDelegate ( ) . getAsyncRemote ( ) . sendText ( java.lang.String , new org.springframework.web.reactive.socket.adapter.StandardWebSocketSession.SendProcessorCallback ( ) ) ; } else if ( WebSocketMessage . Type . BINARY . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getSendProcessor ( ) . setReadyToSend ( false ) ; getDelegate ( ) . getAsyncRemote ( ) . sendBinary ( java.nio.ByteBuffer , new org.springframework.web.reactive.socket.adapter.StandardWebSocketSession.SendProcessorCallback ( ) ) ; } else if ( WebSocketMessage . Type . PING . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getDelegate ( ) . getAsyncRemote ( ) . sendPing ( java.nio.ByteBuffer ) ; } else if ( WebSocketMessage . Type . PONG . equals ( org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ) { getDelegate ( ) . getAsyncRemote ( ) . sendPong ( java.nio.ByteBuffer ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.web.reactive.socket.adapter.WebSocketMessage . getType ( ) ) ; } return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.socket.adapter.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.socket.adapter.Mono<java.lang.Void> ( CloseStatus org.springframework.web.reactive.socket.adapter.CloseStatus ) { try { CloseReason . CloseReason CloseReason.CloseCode = CloseCodes . getCloseCode ( org.springframework.web.reactive.socket.adapter.CloseStatus . getCode ( ) ) ; getDelegate ( ) . close ( new CloseReason ( CloseReason.CloseCode , org.springframework.web.reactive.socket.adapter.CloseStatus . getReason ( ) ) ) ; } catch ( java.io.IOException java.io.IOException ) { return Mono . error ( java.io.IOException ) ; } return Mono . empty ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SendResult org.springframework.web.reactive.socket.adapter.SendResult ) { if ( org.springframework.web.reactive.socket.adapter.SendResult . isOK ( ) ) { getSendProcessor ( ) . setReadyToSend ( true ) ; getSendProcessor ( ) . onWritePossible ( ) ; } else { getSendProcessor ( ) . cancel ( ) ; getSendProcessor ( ) . onError ( org.springframework.web.reactive.socket.adapter.SendResult . getException ( ) ) ; } }  <METHOD_END>
