<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.web.socket.messaging.StompSubProtocolErrorHandler = new StompSubProtocolErrorHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Exception java.lang.Exception = new java.lang.Exception ( STRING ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = this . org.springframework.web.socket.messaging.StompSubProtocolErrorHandler . handleClientMessageProcessingError ( null , java.lang.Exception ) ; StompHeaderAccessor org.springframework.web.socket.messaging.StompHeaderAccessor = MessageHeaderAccessor . getAccessor ( org.springframework.web.socket.messaging.Message<byte[]> , StompHeaderAccessor .class ) ; assertNotNull ( org.springframework.web.socket.messaging.StompHeaderAccessor ) ; assertEquals ( StompCommand . ERROR , org.springframework.web.socket.messaging.StompHeaderAccessor . getCommand ( ) ) ; assertEquals ( java.lang.Exception . java.lang.String ( ) , org.springframework.web.socket.messaging.StompHeaderAccessor . getMessage ( ) ) ; assertArrayEquals ( new byte [ NUMBER ] , org.springframework.web.socket.messaging.Message<byte[]> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; StompHeaderAccessor org.springframework.web.socket.messaging.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SEND ) ; org.springframework.web.socket.messaging.StompHeaderAccessor . setReceipt ( java.lang.String ) ; MessageHeaders org.springframework.web.socket.messaging.MessageHeaders = org.springframework.web.socket.messaging.StompHeaderAccessor . getMessageHeaders ( ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = MessageBuilder . createMessage ( new byte [ NUMBER ] , org.springframework.web.socket.messaging.MessageHeaders ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = this . org.springframework.web.socket.messaging.StompSubProtocolErrorHandler . handleClientMessageProcessingError ( org.springframework.web.socket.messaging.Message<byte[]> , new java.lang.Exception ( ) ) ; StompHeaderAccessor org.springframework.web.socket.messaging.StompHeaderAccessor = MessageHeaderAccessor . getAccessor ( org.springframework.web.socket.messaging.Message<byte[]> , StompHeaderAccessor .class ) ; assertNotNull ( org.springframework.web.socket.messaging.StompHeaderAccessor ) ; assertEquals ( java.lang.String , org.springframework.web.socket.messaging.StompHeaderAccessor . getReceiptId ( ) ) ; }  <METHOD_END>