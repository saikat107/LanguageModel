<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; SimpleWebServiceOutboundGateway org.springframework.integration.ws.SimpleWebServiceOutboundGateway = new SimpleWebServiceOutboundGateway ( new org.springframework.integration.ws.SimpleWebServiceOutboundGatewayTests.TestDestinationProvider ( java.lang.String ) ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > java.util.concurrent.atomic.AtomicReference<java.lang.String> = new java.util.concurrent.atomic.AtomicReference<java.lang.String> < java.lang.String > ( ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . setRequestCallback ( message -> { SoapMessage soapMessage = ( SoapMessage ) message ; soapActionFromCallback . set ( soapMessage . getSoapAction ( ) ) ; } ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . afterPropertiesSet ( ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; try { org.springframework.integration.ws.SimpleWebServiceOutboundGateway . handleMessage ( MessageBuilder . withPayload ( java.lang.String ) . setHeader ( WebServiceHeaders . SOAP_ACTION , java.lang.String ) . build ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { } assertNotNull ( java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; assertEquals ( STRING + java.lang.String + STRING , java.util.concurrent.atomic.AtomicReference<java.lang.String> . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClassPathXmlApplicationContext org.springframework.integration.ws.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.ws.SimpleWebServiceOutboundGatewayTests> ( ) ) ; MessageChannel org.springframework.integration.ws.MessageChannel = org.springframework.integration.ws.ClassPathXmlApplicationContext . getBean ( STRING , MessageChannel .class ) ; org.springframework.integration.ws.MessageChannel . send ( MessageBuilder . withPayload ( STRING ) . build ( ) ) ; PollableChannel org.springframework.integration.ws.PollableChannel = org.springframework.integration.ws.ClassPathXmlApplicationContext . getBean ( STRING , PollableChannel .class ) ; Message < ? > org.springframework.integration.ws.Message<?> = org.springframework.integration.ws.PollableChannel . receive ( ) ; assertThat ( org.springframework.integration.ws.Message<> . getPayload ( ) . toString ( ) , Matchers . endsWith ( java.lang.String ) ) ; org.springframework.integration.ws.ClassPathXmlApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = ReplyRequiredException .class ) public void void ( ) java.lang.Exception { SimpleWebServiceOutboundGateway org.springframework.integration.ws.SimpleWebServiceOutboundGateway = new SimpleWebServiceOutboundGateway ( STRING ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . setRequiresReply ( true ) ; WebServiceMessageSender org.springframework.integration.ws.WebServiceMessageSender = org.springframework.integration.ws.WebServiceMessageSender ( java.lang.String ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . setMessageSender ( org.springframework.integration.ws.WebServiceMessageSender ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) javax.xml.transform.TransformerException , javax.xml.soap.SOAPException , java.lang.InterruptedException , java.util.concurrent.ExecutionException , java.util.concurrent.TimeoutException , java.io.IOException { java.lang.String java.lang.String = STRING ; SimpleWebServiceOutboundGateway org.springframework.integration.ws.SimpleWebServiceOutboundGateway = new SimpleWebServiceOutboundGateway ( java.lang.String ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . setBeanFactory ( mock ( BeanFactory .class ) ) ; final SettableListenableFuture < WebServiceMessage > org.springframework.integration.ws.SettableListenableFuture<org.springframework.integration.ws.WebServiceMessage> = new SettableListenableFuture <> ( ) ; ClientInterceptorAdapter org.springframework.integration.ws.ClientInterceptorAdapter = new ClientInterceptorAdapter ( ) { @ java.lang.Override public boolean boolean ( MessageContext org.springframework.integration.ws.MessageContext ) throws org.springframework.integration.ws.WebServiceClientException { org.springframework.integration.ws.SettableListenableFuture<org.springframework.integration.ws.WebServiceMessage> . set ( org.springframework.integration.ws.MessageContext . getRequest ( ) ) ; return super. handleRequest ( org.springframework.integration.ws.MessageContext ) ; } } ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . setInterceptors ( org.springframework.integration.ws.ClientInterceptorAdapter ) ; org.springframework.integration.ws.SimpleWebServiceOutboundGateway . afterPropertiesSet ( ) ; WebServiceMessageFactory org.springframework.integration.ws.WebServiceMessageFactory = new SaajSoapMessageFactory ( javax.xml.soap.MessageFactory . javax.xml.soap.MessageFactory ( ) ) ; MimeMessage org.springframework.integration.ws.MimeMessage = ( MimeMessage ) org.springframework.integration.ws.WebServiceMessageFactory . createWebServiceMessage ( ) ; java.lang.String java.lang.String = STRING ; javax.xml.transform.TransformerFactory javax.xml.transform.TransformerFactory = javax.xml.transform.TransformerFactory . javax.xml.transform.TransformerFactory ( ) ; javax.xml.transform.Transformer javax.xml.transform.Transformer = javax.xml.transform.TransformerFactory . javax.xml.transform.Transformer ( ) ; javax.xml.transform.Transformer . void ( new StringSource ( java.lang.String ) , org.springframework.integration.ws.MimeMessage . getPayloadResult ( ) ) ; org.springframework.integration.ws.MimeMessage . addAttachment ( STRING , new ByteArrayResource ( STRING . byte[] ( ) ) , STRING ) ; try { org.springframework.integration.ws.SimpleWebServiceOutboundGateway . handleMessage ( new GenericMessage <> ( org.springframework.integration.ws.MimeMessage ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { } WebServiceMessage org.springframework.integration.ws.WebServiceMessage = org.springframework.integration.ws.SettableListenableFuture<org.springframework.integration.ws.WebServiceMessage> . get ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( org.springframework.integration.ws.WebServiceMessage ) ; assertThat ( org.springframework.integration.ws.WebServiceMessage , instanceOf ( MimeMessage .class ) ) ; javax.xml.transform.Transformer = javax.xml.transform.TransformerFactory . javax.xml.transform.Transformer ( ) ; javax.xml.transform.Transformer . void ( javax.xml.transform.OutputKeys . java.lang.String , STRING ) ; StringResult org.springframework.integration.ws.StringResult = new StringResult ( ) ; javax.xml.transform.Transformer . void ( org.springframework.integration.ws.WebServiceMessage . getPayloadSource ( ) , org.springframework.integration.ws.StringResult ) ; assertEquals ( java.lang.String , org.springframework.integration.ws.StringResult . toString ( ) ) ; Attachment org.springframework.integration.ws.Attachment = ( ( MimeMessage ) org.springframework.integration.ws.WebServiceMessage ) . getAttachment ( STRING ) ; assertNotNull ( org.springframework.integration.ws.Attachment ) ; assertEquals ( STRING , org.springframework.integration.ws.Attachment . getContentType ( ) ) ; assertEquals ( STRING , StreamUtils . copyToString ( org.springframework.integration.ws.Attachment . getInputStream ( ) , java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MessageContext org.springframework.integration.ws.MessageContext ) throws org.springframework.integration.ws.WebServiceClientException { org.springframework.integration.ws.SettableListenableFuture<org.springframework.integration.ws.WebServiceMessage> . set ( org.springframework.integration.ws.MessageContext . getRequest ( ) ) ; return super. handleRequest ( org.springframework.integration.ws.MessageContext ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.ws.WebServiceMessageSender org.springframework.integration.ws.WebServiceMessageSender ( final java.lang.String java.lang.String ) throws java.lang.Exception { WebServiceMessageSender org.springframework.integration.ws.WebServiceMessageSender = Mockito . mock ( WebServiceMessageSender .class ) ; WebServiceConnection org.springframework.integration.ws.WebServiceConnection = Mockito . mock ( WebServiceConnection .class ) ; Mockito . when ( org.springframework.integration.ws.WebServiceMessageSender . createConnection ( Mockito . any ( java.net.URI .class ) ) ) . thenReturn ( org.springframework.integration.ws.WebServiceConnection ) ; Mockito . when ( org.springframework.integration.ws.WebServiceMessageSender . supports ( Mockito . any ( java.net.URI .class ) ) ) . thenReturn ( true ) ; Mockito . doAnswer ( invocation -> { Object [] args = invocation . getArguments ( ) ; WebServiceMessageFactory factory = ( WebServiceMessageFactory ) args [ NUMBER ] ; return factory . createWebServiceMessage ( new ByteArrayInputStream ( mockResponseMessage . getBytes ( ) ) ) ; } ) . when ( org.springframework.integration.ws.WebServiceConnection ) . receive ( Mockito . any ( WebServiceMessageFactory .class ) ) ; return org.springframework.integration.ws.WebServiceMessageSender ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.net.URI = java.net.URI . java.net.URI ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . java.net.URI ; }  <METHOD_END>
