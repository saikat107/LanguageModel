<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaderAccessor . toMap ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaders . size ( ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; java.lang.Thread . void ( NUMBER ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaders . size ( ) ) ; assertNotEquals ( org.springframework.messaging.support.GenericMessage<java.lang.String> . getHeaders ( ) . getId ( ) , org.springframework.messaging.support.MessageHeaders . getId ( ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.messaging.support.Message<?> = new GenericMessage <> ( STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.Message<> ) ; org.springframework.messaging.support.MessageHeaderAccessor . removeHeader ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.MessageHeaderAccessor . toMap ( ) ; assertFalse ( java.util.Map<java.lang.String,java.lang.Object> . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.messaging.support.Message<?> = new GenericMessage <> ( STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , null ) ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.Message<> ) ; org.springframework.messaging.support.MessageHeaderAccessor . removeHeader ( STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.MessageHeaderAccessor . toMap ( ) ; assertFalse ( java.util.Map<java.lang.String,java.lang.Object> . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; org.springframework.messaging.support.MessageHeaderAccessor . removeHeaders ( STRING ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaders . size ( ) ) ; assertNull ( org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; org.springframework.messaging.support.MessageHeaderAccessor . copyHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaders . size ( ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; GenericMessage < java.lang.String > org.springframework.messaging.support.GenericMessage<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( org.springframework.messaging.support.GenericMessage<java.lang.String> ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; org.springframework.messaging.support.MessageHeaderAccessor . copyHeadersIfAbsent ( java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaders . size ( ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . copyHeaders ( null ) ; org.springframework.messaging.support.MessageHeaderAccessor . copyHeadersIfAbsent ( null ) ; assertEquals ( NUMBER , org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . size ( ) ) ; assertEquals ( java.util.Collections . java.util.Set<java.lang.String> ( STRING ) , org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . keySet ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.MessageHeaderAccessor . toMap ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.MessageHeaderAccessor . toMap ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.messaging.support.MessageHeaderAccessor . toMap ( ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,java.lang.Object> . int ( ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; org.springframework.messaging.support.MessageHeaderAccessor . setLeaveMutable ( true ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; Message < ? > org.springframework.messaging.support.Message<?> = MessageBuilder . createMessage ( STRING , org.springframework.messaging.support.MessageHeaders ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertSame ( org.springframework.messaging.support.MessageHeaderAccessor , MessageHeaderAccessor . getAccessor ( org.springframework.messaging.support.Message<> , MessageHeaderAccessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; Message < ? > org.springframework.messaging.support.Message<?> = MessageBuilder . createMessage ( STRING , org.springframework.messaging.support.MessageHeaders ) ; this . org.springframework.messaging.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.messaging.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.support.MessageHeaderAccessor . setLeaveMutable ( true ) ; this . org.springframework.messaging.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.messaging.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.messaging.support.MessageHeaderAccessor . setHeader ( STRING , STRING ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaders . get ( STRING ) ) ; assertSame ( org.springframework.messaging.support.MessageHeaderAccessor , MessageHeaderAccessor . getAccessor ( org.springframework.messaging.support.Message<> , MessageHeaderAccessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; Message < ? > org.springframework.messaging.support.Message<?> = MessageBuilder . createMessage ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ) ; assertSame ( org.springframework.messaging.support.MessageHeaderAccessor , MessageHeaderAccessor . getAccessor ( org.springframework.messaging.support.Message<> , MessageHeaderAccessor .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor = new org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor . setLeaveMutable ( true ) ; Message < ? > org.springframework.messaging.support.Message<?> = MessageBuilder . createMessage ( STRING , org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor . getMessageHeaders ( ) ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = MessageHeaderAccessor . getMutableAccessor ( org.springframework.messaging.support.Message<> ) ; assertNotNull ( org.springframework.messaging.support.MessageHeaderAccessor ) ; assertTrue ( org.springframework.messaging.support.MessageHeaderAccessor . isMutable ( ) ) ; assertSame ( org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor , org.springframework.messaging.support.MessageHeaderAccessor ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Message < ? > org.springframework.messaging.support.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = MessageHeaderAccessor . getMutableAccessor ( org.springframework.messaging.support.Message<> ) ; assertNotNull ( org.springframework.messaging.support.MessageHeaderAccessor ) ; assertTrue ( org.springframework.messaging.support.MessageHeaderAccessor . isMutable ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor = new org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor ( ) ; Message < ? > org.springframework.messaging.support.Message<?> = MessageBuilder . createMessage ( STRING , org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor . getMessageHeaders ( ) ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = MessageHeaderAccessor . getMutableAccessor ( org.springframework.messaging.support.Message<> ) ; assertNotNull ( org.springframework.messaging.support.MessageHeaderAccessor ) ; assertTrue ( org.springframework.messaging.support.MessageHeaderAccessor . isMutable ( ) ) ; assertEquals ( org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor .class , org.springframework.messaging.support.MessageHeaderAccessor . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setEnableTimestamp ( true ) ; assertNotNull ( org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . getTimestamp ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; assertNull ( org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . getTimestamp ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final java.util.UUID java.util.UUID = new java.util.UUID ( NUMBER , NUMBER ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setIdGenerator ( ( ) id ) ; assertSame ( java.util.UUID , org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; assertNotNull ( org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setIdGenerator ( ( ) MessageHeaders . ID_VALUE_NONE ) ; org.springframework.messaging.support.MessageHeaderAccessor . setEnableTimestamp ( false ) ; org.springframework.messaging.support.MessageHeaderAccessor . setLeaveMutable ( true ) ; MessageHeaders org.springframework.messaging.support.MessageHeaders = org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ; assertNull ( org.springframework.messaging.support.MessageHeaders . getId ( ) ) ; assertNull ( org.springframework.messaging.support.MessageHeaders . getTimestamp ( ) ) ; final java.util.UUID java.util.UUID = new java.util.UUID ( NUMBER , NUMBER ) ; org.springframework.messaging.support.MessageHeaderAccessor . setIdGenerator ( ( ) id ) ; org.springframework.messaging.support.MessageHeaderAccessor . setEnableTimestamp ( true ) ; org.springframework.messaging.support.MessageHeaderAccessor . setImmutable ( ) ; assertSame ( java.util.UUID , org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) . getId ( ) ) ; assertNotNull ( org.springframework.messaging.support.MessageHeaders . getTimestamp ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setContentType ( MimeTypeUtils . TEXT_PLAIN ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getShortLogMessage ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getShortLogMessage ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getShortLogMessage ( new java.lang.Object ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; } } ) ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } final java.lang.String java.lang.String = java.lang.StringBuilder . java.lang.String ( ) + STRING ; java.lang.String java.lang.String = org.springframework.messaging.support.MessageHeaderAccessor . getShortLogMessage ( java.lang.String ) ; assertEquals ( STRING + java.lang.StringBuilder + STRING , java.lang.String ) ; java.lang.String = org.springframework.messaging.support.MessageHeaderAccessor . getShortLogMessage ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING + java.lang.StringBuilder + STRING , java.lang.String ) ; java.lang.String = org.springframework.messaging.support.MessageHeaderAccessor . getShortLogMessage ( new java.lang.Object ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; } } ) ; assertThat ( java.lang.String , startsWith ( STRING + java.lang.Class<? extends org.springframework.messaging.support.MessageHeaderAccessorTests> ( ) . java.lang.String ( ) + STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = new MessageHeaderAccessor ( ) ; org.springframework.messaging.support.MessageHeaderAccessor . setContentType ( MimeTypeUtils . TEXT_PLAIN ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getDetailedLogMessage ( STRING ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getDetailedLogMessage ( STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ) ; assertEquals ( STRING , org.springframework.messaging.support.MessageHeaderAccessor . getDetailedLogMessage ( new java.lang.Object ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; } } ) ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } final java.lang.String java.lang.String = java.lang.StringBuilder . java.lang.String ( ) + STRING ; java.lang.String java.lang.String = org.springframework.messaging.support.MessageHeaderAccessor . getDetailedLogMessage ( java.lang.String ) ; assertEquals ( STRING + java.lang.StringBuilder + STRING , java.lang.String ) ; java.lang.String = org.springframework.messaging.support.MessageHeaderAccessor . getDetailedLogMessage ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; assertEquals ( STRING + java.lang.StringBuilder + STRING , java.lang.String ) ; java.lang.String = org.springframework.messaging.support.MessageHeaderAccessor . getDetailedLogMessage ( new java.lang.Object ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; } } ) ; assertEquals ( STRING + java.lang.StringBuilder + STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; Message < java.lang.String > org.springframework.messaging.support.Message<java.lang.String> = new GenericMessage <> ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; MessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessor = MessageHeaderAccessor . getMutableAccessor ( org.springframework.messaging.support.Message<java.lang.String> ) ; org.springframework.messaging.support.MessageHeaderAccessor . setContentType ( MimeTypeUtils . TEXT_PLAIN ) ; org.springframework.messaging.support.Message<java.lang.String> = new GenericMessage <> ( org.springframework.messaging.support.Message<java.lang.String> . getPayload ( ) , org.springframework.messaging.support.MessageHeaderAccessor . getMessageHeaders ( ) ) ; Message < ? > org.springframework.messaging.support.Message<?> = ( Message < ? > ) SerializationTestUtils . serializeAndDeserialize ( org.springframework.messaging.support.Message<java.lang.String> ) ; assertEquals ( STRING , org.springframework.messaging.support.Message<> . getPayload ( ) ) ; assertEquals ( STRING , org.springframework.messaging.support.Message<> . getHeaders ( ) . get ( STRING ) ) ; assertNotNull ( org.springframework.messaging.support.Message<> . getHeaders ( ) . get ( MessageHeaders . CONTENT_TYPE ) ) ; }  <METHOD_END>
<METHOD_START> public void ( ) {		}  <METHOD_END>
<METHOD_START> private void ( Message < ? > org.springframework.messaging.support.Message<?> ) { super( org.springframework.messaging.support.Message<> ); }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor ( Message < ? > org.springframework.messaging.support.Message<?> ) { return new org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor ( org.springframework.messaging.support.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor ( Message < ? > org.springframework.messaging.support.Message<?> ) { return org.springframework.messaging.support.MessageHeaderAccessorTests.TestMessageHeaderAccessor ( org.springframework.messaging.support.Message<> ) ; }  <METHOD_END>
