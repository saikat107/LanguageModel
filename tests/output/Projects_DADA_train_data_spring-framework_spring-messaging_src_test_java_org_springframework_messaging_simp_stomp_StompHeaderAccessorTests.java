<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . CONNECTED ) ; assertEquals ( StompCommand . CONNECTED , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getCommand ( ) ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . CONNECTED , new LinkedMultiValueMap <> ( ) ) ; assertEquals ( StompCommand . CONNECTED , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getCommand ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_ID_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_DESTINATION_HEADER , STRING ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SUBSCRIBE , org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> ) ; assertEquals ( StompCommand . SUBSCRIBE , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getCommand ( ) ) ; assertEquals ( SimpMessageType . SUBSCRIBE , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageType ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getDestination ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getSubscriptionId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_ID_HEADER , STRING ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . UNSUBSCRIBE , org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> ) ; assertEquals ( StompCommand . UNSUBSCRIBE , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getCommand ( ) ) ; assertEquals ( SimpMessageType . UNSUBSCRIBE , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageType ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getSubscriptionId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . DESTINATION_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_SUBSCRIPTION_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_CONTENT_TYPE_HEADER , STRING ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . MESSAGE , org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> ) ; assertEquals ( StompCommand . MESSAGE , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getCommand ( ) ) ; assertEquals ( SimpMessageType . MESSAGE , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageType ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getSubscriptionId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_LOGIN_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_PASSCODE_HEADER , STRING ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . CONNECT , org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> ) ; assertEquals ( StompCommand . CONNECT , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getCommand ( ) ) ; assertEquals ( SimpMessageType . CONNECT , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageType ( ) ) ; assertNotNull ( org.springframework.messaging.simp.stomp.StompHeaderAccessor . getHeader ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getLogin ( ) ) ; assertEquals ( STRING , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getPasscode ( ) ) ; assertThat ( org.springframework.messaging.simp.stomp.StompHeaderAccessor . toString ( ) , CoreMatchers . containsString ( STRING ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.simp.stomp.StompHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_LOGIN_HEADER ) . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_PASSCODE_HEADER ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SUBSCRIBE ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setSubscriptionId ( STRING ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setDestination ( STRING ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.simp.stomp.StompHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_ID_HEADER ) . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_DESTINATION_HEADER ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . UNSUBSCRIBE ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setSubscriptionId ( STRING ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.simp.stomp.StompHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_ID_HEADER ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . MESSAGE ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setSubscriptionId ( STRING ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setDestination ( STRING ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setContentType ( MimeTypeUtils . APPLICATION_JSON ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . updateStompCommandAsServerMessage ( ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.simp.stomp.StompHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.lang.String ( ) , NUMBER , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_SUBSCRIPTION_HEADER ) . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_DESTINATION_HEADER ) . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_CONTENT_TYPE_HEADER ) . get ( NUMBER ) ) ; assertNotNull ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_MESSAGE_ID_HEADER ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SimpMessageHeaderAccessor org.springframework.messaging.simp.stomp.SimpMessageHeaderAccessor = SimpMessageHeaderAccessor . create ( ) ; org.springframework.messaging.simp.stomp.SimpMessageHeaderAccessor . setContentType ( MimeType . valueOf ( STRING ) ) ; Message < byte [] > org.springframework.messaging.simp.stomp.Message<byte[]> = MessageBuilder . createMessage ( new byte [ NUMBER ] , org.springframework.messaging.simp.stomp.SimpMessageHeaderAccessor . getMessageHeaders ( ) ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . wrap ( org.springframework.messaging.simp.stomp.Message<byte[]> ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.simp.stomp.StompHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_CONTENT_TYPE_HEADER ) . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.UnsupportedEncodingException { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_LOGIN_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_PASSCODE_HEADER , STRING ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . CONNECT , org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> ) ; Message < byte [] > org.springframework.messaging.simp.stomp.Message<byte[]> = MessageBuilder . createMessage ( new byte [ NUMBER ] , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageHeaders ( ) ) ; byte [] byte[] = new StompEncoder ( ) . encode ( org.springframework.messaging.simp.stomp.Message<byte[]> ) ; assertEquals ( STRING , new java.lang.String ( byte[] , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MultiValueMap < java.lang.String , java.lang.String > org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_ID_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( StompHeaderAccessor . STOMP_DESTINATION_HEADER , STRING ) ; org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SUBSCRIBE , org.springframework.messaging.simp.stomp.MultiValueMap<java.lang.String,java.lang.String> ) ; java.lang.String java.lang.String = org.springframework.messaging.simp.stomp.StompHeaderAccessor . getFirstNativeHeader ( STRING ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setNativeHeader ( STRING , java.lang.String . java.lang.String ( ) ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = org.springframework.messaging.simp.stomp.StompHeaderAccessor . toNativeHeaderMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_ID_HEADER ) . get ( NUMBER ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( StompHeaderAccessor . STOMP_DESTINATION_HEADER ) . get ( NUMBER ) ) ; assertNotNull ( STRING , java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( STRING ) . java.lang.String ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SEND ) ; MessageHeaders org.springframework.messaging.simp.stomp.MessageHeaders = org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageHeaders ( ) ; assertNull ( org.springframework.messaging.simp.stomp.MessageHeaders . getId ( ) ) ; assertNull ( org.springframework.messaging.simp.stomp.MessageHeaders . getTimestamp ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { IdTimestampMessageHeaderInitializer org.springframework.messaging.simp.stomp.IdTimestampMessageHeaderInitializer = new IdTimestampMessageHeaderInitializer ( ) ; org.springframework.messaging.simp.stomp.IdTimestampMessageHeaderInitializer . setIdGenerator ( new AlternativeJdkIdGenerator ( ) ) ; org.springframework.messaging.simp.stomp.IdTimestampMessageHeaderInitializer . setEnableTimestamp ( true ) ; StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SEND ) ; org.springframework.messaging.simp.stomp.IdTimestampMessageHeaderInitializer . initHeaders ( org.springframework.messaging.simp.stomp.StompHeaderAccessor ) ; assertNotNull ( org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageHeaders ( ) . getId ( ) ) ; assertNotNull ( org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageHeaders ( ) . getTimestamp ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . CONNECT ) ; Message < byte [] > org.springframework.messaging.simp.stomp.Message<byte[]> = MessageBuilder . createMessage ( new byte [ NUMBER ] , org.springframework.messaging.simp.stomp.StompHeaderAccessor . getMessageHeaders ( ) ) ; assertSame ( org.springframework.messaging.simp.stomp.StompHeaderAccessor , MessageHeaderAccessor . getAccessor ( org.springframework.messaging.simp.stomp.Message<byte[]> , StompHeaderAccessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StompHeaderAccessor org.springframework.messaging.simp.stomp.StompHeaderAccessor = StompHeaderAccessor . create ( StompCommand . SEND ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setDestination ( STRING ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setContentType ( MimeTypeUtils . APPLICATION_JSON ) ; org.springframework.messaging.simp.stomp.StompHeaderAccessor . setSessionId ( STRING ) ; java.lang.String java.lang.String = org.springframework.messaging.simp.stomp.StompHeaderAccessor . getShortLogMessage ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING , java.lang.String ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } final java.lang.String java.lang.String = java.lang.StringBuilder . java.lang.String ( ) + STRING ; java.lang.String = org.springframework.messaging.simp.stomp.StompHeaderAccessor . getShortLogMessage ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING + java.lang.StringBuilder + STRING , java.lang.String ) ; }  <METHOD_END>