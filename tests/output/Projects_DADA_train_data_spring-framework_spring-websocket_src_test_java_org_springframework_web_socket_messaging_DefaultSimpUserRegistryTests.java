<METHOD_START> @ Test public void void ( ) { org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal = new org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ( STRING ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; SessionConnectedEvent org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; DefaultSimpUserRegistry org.springframework.web.socket.messaging.DefaultSimpUserRegistry = new DefaultSimpUserRegistry ( ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; SimpUser org.springframework.web.socket.messaging.SimpUser = org.springframework.web.socket.messaging.DefaultSimpUserRegistry . getUser ( STRING ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser ) ; assertEquals ( NUMBER , org.springframework.web.socket.messaging.DefaultSimpUserRegistry . getUserCount ( ) ) ; assertEquals ( NUMBER , org.springframework.web.socket.messaging.SimpUser . getSessions ( ) . size ( ) ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser . getSession ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultSimpUserRegistry org.springframework.web.socket.messaging.DefaultSimpUserRegistry = new DefaultSimpUserRegistry ( ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal = new org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ( STRING ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; SessionConnectedEvent org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; SimpUser org.springframework.web.socket.messaging.SimpUser = org.springframework.web.socket.messaging.DefaultSimpUserRegistry . getUser ( STRING ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser ) ; assertEquals ( NUMBER , org.springframework.web.socket.messaging.DefaultSimpUserRegistry . getUserCount ( ) ) ; assertEquals ( NUMBER , org.springframework.web.socket.messaging.SimpUser . getSessions ( ) . size ( ) ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser . getSession ( STRING ) ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser . getSession ( STRING ) ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser . getSession ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultSimpUserRegistry org.springframework.web.socket.messaging.DefaultSimpUserRegistry = new DefaultSimpUserRegistry ( ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal = new org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ( STRING ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; SessionConnectedEvent org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; SimpUser org.springframework.web.socket.messaging.SimpUser = org.springframework.web.socket.messaging.DefaultSimpUserRegistry . getUser ( STRING ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser ) ; assertEquals ( NUMBER , org.springframework.web.socket.messaging.SimpUser . getSessions ( ) . size ( ) ) ; CloseStatus org.springframework.web.socket.messaging.CloseStatus = CloseStatus . GOING_AWAY ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . DISCONNECT , STRING ) ; SessionDisconnectEvent org.springframework.web.socket.messaging.SessionDisconnectEvent = new SessionDisconnectEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , STRING , org.springframework.web.socket.messaging.CloseStatus , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionDisconnectEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . DISCONNECT , STRING ) ; org.springframework.web.socket.messaging.SessionDisconnectEvent = new SessionDisconnectEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , STRING , org.springframework.web.socket.messaging.CloseStatus , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionDisconnectEvent ) ; assertEquals ( NUMBER , org.springframework.web.socket.messaging.SimpUser . getSessions ( ) . size ( ) ) ; assertNotNull ( org.springframework.web.socket.messaging.SimpUser . getSession ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultSimpUserRegistry org.springframework.web.socket.messaging.DefaultSimpUserRegistry = new DefaultSimpUserRegistry ( ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal = new org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ( STRING ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; SessionConnectedEvent org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . SUBSCRIBE , STRING , STRING , STRING ) ; SessionSubscribeEvent org.springframework.web.socket.messaging.SessionSubscribeEvent = new SessionSubscribeEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionSubscribeEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . SUBSCRIBE , STRING , STRING , STRING ) ; org.springframework.web.socket.messaging.SessionSubscribeEvent = new SessionSubscribeEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionSubscribeEvent ) ; org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . SUBSCRIBE , STRING , STRING , STRING ) ; org.springframework.web.socket.messaging.SessionSubscribeEvent = new SessionSubscribeEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionSubscribeEvent ) ; java.util.Set<org.springframework.web.socket.messaging.SimpSubscription> < SimpSubscription > java.util.Set<org.springframework.web.socket.messaging.SimpSubscription> = org.springframework.web.socket.messaging.DefaultSimpUserRegistry . findSubscriptions ( new SimpSubscriptionMatcher ( ) { @ java.lang.Override public boolean boolean ( SimpSubscription org.springframework.web.socket.messaging.SimpSubscription ) { return org.springframework.web.socket.messaging.SimpSubscription . getDestination ( ) . equals ( STRING ) ; } } ) ; assertEquals ( NUMBER , java.util.Set<org.springframework.web.socket.messaging.SimpSubscription> . size ( ) ) ; java.util.Iterator<org.springframework.web.socket.messaging.SimpSubscription> < SimpSubscription > java.util.Iterator<org.springframework.web.socket.messaging.SimpSubscription> = java.util.Set<org.springframework.web.socket.messaging.SimpSubscription> . iterator ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( NUMBER ) ; java.util.Set<java.lang.String> . boolean ( java.util.Iterator<org.springframework.web.socket.messaging.SimpSubscription> . next ( ) . getId ( ) ) ; java.util.Set<java.lang.String> . boolean ( java.util.Iterator<org.springframework.web.socket.messaging.SimpSubscription> . next ( ) . getId ( ) ) ; assertEquals ( new java.util.HashSet <> ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) , java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( SimpSubscription org.springframework.web.socket.messaging.SimpSubscription ) { return org.springframework.web.socket.messaging.SimpSubscription . getDestination ( ) . equals ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultSimpUserRegistry org.springframework.web.socket.messaging.DefaultSimpUserRegistry = new DefaultSimpUserRegistry ( ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal = new org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ( STRING ) ; Message < byte [] > org.springframework.web.socket.messaging.Message<byte[]> = org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType . CONNECT_ACK , STRING ) ; SessionConnectedEvent org.springframework.web.socket.messaging.SessionConnectedEvent = new SessionConnectedEvent ( this , org.springframework.web.socket.messaging.Message<byte[]> , org.springframework.web.socket.messaging.DefaultSimpUserRegistryTests.TestPrincipal ) ; org.springframework.web.socket.messaging.DefaultSimpUserRegistry . onApplicationEvent ( org.springframework.web.socket.messaging.SessionConnectedEvent ) ; SimpUser org.springframework.web.socket.messaging.SimpUser = org.springframework.web.socket.messaging.DefaultSimpUserRegistry . getUser ( STRING ) ; assertNull ( org.springframework.web.socket.messaging.SimpUser . getSession ( null ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.messaging.Message<byte[]> < byte [] > org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType org.springframework.web.socket.messaging.SimpMessageType , java.lang.String java.lang.String ) { return org.springframework.web.socket.messaging.Message<byte[]> ( org.springframework.web.socket.messaging.SimpMessageType , java.lang.String , null , null ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.messaging.Message<byte[]> < byte [] > org.springframework.web.socket.messaging.Message<byte[]> ( SimpMessageType org.springframework.web.socket.messaging.SimpMessageType , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) { SimpMessageHeaderAccessor org.springframework.web.socket.messaging.SimpMessageHeaderAccessor = SimpMessageHeaderAccessor . create ( org.springframework.web.socket.messaging.SimpMessageType ) ; org.springframework.web.socket.messaging.SimpMessageHeaderAccessor . setSessionId ( java.lang.String ) ; if ( java.lang.String != null ) { org.springframework.web.socket.messaging.SimpMessageHeaderAccessor . setDestination ( java.lang.String ) ; } if ( java.lang.String != null ) { org.springframework.web.socket.messaging.SimpMessageHeaderAccessor . setSubscriptionId ( java.lang.String ) ; } return MessageBuilder . createMessage ( new byte [ NUMBER ] , org.springframework.web.socket.messaging.SimpMessageHeaderAccessor . getMessageHeaders ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
