<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { ChatMessageListeningEndpoint org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint = org.springframework.integration.xmpp.config.ApplicationContext . getBean ( STRING , ChatMessageListeningEndpoint .class ) ; MessageChannel org.springframework.integration.xmpp.config.MessageChannel = ( MessageChannel ) TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING ) ; assertEquals ( org.springframework.integration.xmpp.config.ApplicationContext . getBean ( STRING ) , org.springframework.integration.xmpp.config.MessageChannel ) ; assertFalse ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint . isAutoStartup ( ) ) ; QueueChannel org.springframework.integration.xmpp.config.QueueChannel = ( QueueChannel ) TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING ) ; assertEquals ( STRING , org.springframework.integration.xmpp.config.QueueChannel . getComponentName ( ) ) ; XMPPConnection org.springframework.integration.xmpp.config.XMPPConnection = ( XMPPConnection ) TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING ) ; assertSame ( org.springframework.integration.xmpp.config.XMPPConnection , org.springframework.integration.xmpp.config.ApplicationContext . getBean ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.xmpp.config.ApplicationContext . getBean ( STRING ) ; assertSame ( java.lang.Object , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING ) ) ; org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint . start ( ) ; java.util.Map java.util.Map = TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XMPPConnection , STRING , java.util.Map .class ) ; assertEquals ( NUMBER , java.util.Map . int ( ) ) ; assertSame ( java.lang.Object , TestUtils . getPropertyValue ( java.util.Map . java.util.Collection ( ) . java.util.Iterator ( ) . java.lang.Object ( ) , STRING ) ) ; org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) org.springframework.integration.xmpp.config.NotConnectedException { XMPPConnection org.springframework.integration.xmpp.config.XMPPConnection = Mockito . mock ( XMPPConnection .class ) ; ChatMessageListeningEndpoint org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint = org.springframework.integration.xmpp.config.ApplicationContext . getBean ( STRING , ChatMessageListeningEndpoint .class ) ; java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( ChatMessageListeningEndpoint .class , STRING ) ; java.lang.reflect.Field . void ( true ) ; ReflectionUtils . setField ( java.lang.reflect.Field , org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , org.springframework.integration.xmpp.config.XMPPConnection ) ; StanzaListener org.springframework.integration.xmpp.config.StanzaListener = TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING , StanzaListener .class ) ; Message org.springframework.integration.xmpp.config.Message = new Message ( ) ; org.springframework.integration.xmpp.config.Message . setBody ( STRING ) ; org.springframework.integration.xmpp.config.Message . setTo ( STRING ) ; JivePropertiesManager . addProperty ( org.springframework.integration.xmpp.config.Message , STRING , STRING ) ; JivePropertiesManager . addProperty ( org.springframework.integration.xmpp.config.Message , STRING , STRING ) ; org.springframework.integration.xmpp.config.StanzaListener . processPacket ( org.springframework.integration.xmpp.config.Message ) ; org . springframework . org.springframework.messaging . org.springframework.messaging < ? > siMessage = org.springframework.integration.xmpp.config.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , siMessage . getHeaders ( ) . get ( STRING ) ) ; assertEquals ( STRING , siMessage . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertSame ( org.springframework.integration.xmpp.config.MessageChannel , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.ChatMessageListeningEndpoint , STRING ) ) ; }  <METHOD_END>
