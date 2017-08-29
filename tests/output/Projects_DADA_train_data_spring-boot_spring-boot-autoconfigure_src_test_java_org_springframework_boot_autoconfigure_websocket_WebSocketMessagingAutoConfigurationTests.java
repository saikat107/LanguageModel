<METHOD_START> @ Before public void void ( ) { java.util.List<org.springframework.boot.autoconfigure.websocket.Transport> < Transport > java.util.List<org.springframework.boot.autoconfigure.websocket.Transport> = java.util.Arrays . java.util.List ( new WebSocketTransport ( new StandardWebSocketClient ( new WsWebSocketContainer ( ) ) ) , new RestTemplateXhrTransport ( new RestTemplate ( ) ) ) ; this . org.springframework.boot.autoconfigure.websocket.SockJsClient = new SockJsClient ( java.util.List<org.springframework.boot.autoconfigure.websocket.Transport> ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { this . org.springframework.boot.autoconfigure.websocket.AnnotationConfigServletWebServerApplicationContext . close ( ) ; this . org.springframework.boot.autoconfigure.websocket.SockJsClient . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ BeforeClass @ AfterClass public static void void ( ) { ReflectionTestUtils . setField ( TomcatURLStreamHandlerFactory .class , STRING , null ) ; ReflectionTestUtils . setField ( java.net.URL .class , STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { java.lang.Object java.lang.Object = java.lang.Object ( STRING ) ; assertThat ( new java.lang.String ( ( byte [] ) java.lang.Object ) ) . isEqualTo ( java.lang.String . java.lang.String ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { java.lang.Object java.lang.Object = java.lang.Object ( STRING ) ; assertThat ( new java.lang.String ( ( byte [] ) java.lang.Object ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> = java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> ( ) ; java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> = java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> ( ) ; assertThat ( java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> . size ( ) ) . isEqualTo ( java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> . size ( ) ) ; java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> = java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> . iterator ( ) ; java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> = java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> . iterator ( ) ; while ( java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> . hasNext ( ) ) { assertThat ( java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> . next ( ) ) . isInstanceOf ( java.util.Iterator<org.springframework.boot.autoconfigure.websocket.MessageConverter> . next ( ) . getClass ( ) ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> ( ) { java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> = new java.util.ArrayList<org.springframework.boot.autoconfigure.websocket.MessageConverter> <> ( ) ; WebSocketMessagingAutoConfiguration . WebSocketMessagingAutoConfiguration WebSocketMessagingAutoConfiguration.WebSocketMessageConverterConfiguration = new WebSocketMessagingAutoConfiguration . WebSocketMessagingAutoConfiguration ( new ObjectMapper ( ) ) ; WebSocketMessagingAutoConfiguration.WebSocketMessageConverterConfiguration . configureMessageConverters ( java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> ) ; return java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> ( ) { CompositeMessageConverter org.springframework.boot.autoconfigure.websocket.CompositeMessageConverter = new DelegatingWebSocketMessageBrokerConfiguration ( ) . brokerMessageConverter ( ) ; return ( java.util.List<org.springframework.boot.autoconfigure.websocket.MessageConverter> < MessageConverter > ) ReflectionTestUtils . getField ( org.springframework.boot.autoconfigure.websocket.CompositeMessageConverter , STRING ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( final java.lang.String java.lang.String ) throws java.lang.Throwable { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.websocket.AnnotationConfigServletWebServerApplicationContext , STRING , STRING ) ; this . org.springframework.boot.autoconfigure.websocket.AnnotationConfigServletWebServerApplicationContext . register ( org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.WebSocketMessagingConfiguration .class ) ; new ServerPortInfoApplicationContextInitializer ( ) . initialize ( this . org.springframework.boot.autoconfigure.websocket.AnnotationConfigServletWebServerApplicationContext ) ; this . org.springframework.boot.autoconfigure.websocket.AnnotationConfigServletWebServerApplicationContext . refresh ( ) ; WebSocketStompClient org.springframework.boot.autoconfigure.websocket.WebSocketStompClient = new WebSocketStompClient ( this . org.springframework.boot.autoconfigure.websocket.SockJsClient ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> < java.lang.Throwable > java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> = new java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> <> ( ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.Object> < java.lang.Object > java.util.concurrent.atomic.AtomicReference<java.lang.Object> = new java.util.concurrent.atomic.AtomicReference<java.lang.Object> <> ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; StompSessionHandler org.springframework.boot.autoconfigure.websocket.StompSessionHandler = new StompSessionHandlerAdapter ( ) { @ java.lang.Override public void void ( StompSession org.springframework.boot.autoconfigure.websocket.StompSession , StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders ) { org.springframework.boot.autoconfigure.websocket.StompSession . subscribe ( java.lang.String , new StompFrameHandler ( ) { @ java.lang.Override public void void ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , java.lang.Object java.lang.Object ) { java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( java.lang.Object ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override public java.lang.reflect.Type java.lang.reflect.Type ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders ) { return java.lang.Object .class ; } } ) ; } @ java.lang.Override public void void ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , java.lang.Object java.lang.Object ) { java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override public void void ( StompSession org.springframework.boot.autoconfigure.websocket.StompSession , StompCommand org.springframework.boot.autoconfigure.websocket.StompCommand , StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , byte [] byte[] , java.lang.Throwable java.lang.Throwable ) { java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> . void ( java.lang.Throwable ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override public void void ( StompSession org.springframework.boot.autoconfigure.websocket.StompSession , java.lang.Throwable java.lang.Throwable ) { java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> . void ( java.lang.Throwable ) ; java.util.concurrent.CountDownLatch . void ( ) ; } } ; org.springframework.boot.autoconfigure.websocket.WebSocketStompClient . setMessageConverter ( new SimpleMessageConverter ( ) ) ; org.springframework.boot.autoconfigure.websocket.WebSocketStompClient . connect ( STRING , org.springframework.boot.autoconfigure.websocket.StompSessionHandler , this . org.springframework.boot.autoconfigure.websocket.AnnotationConfigServletWebServerApplicationContext . getEnvironment ( ) . getProperty ( STRING ) ) ; if ( ! java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) { if ( java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> . java.lang.Throwable ( ) != null ) { throw java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> . java.lang.Throwable ( ) ; } fail ( STRING ) ; } return java.util.concurrent.atomic.AtomicReference<java.lang.Object> . java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompSession org.springframework.boot.autoconfigure.websocket.StompSession , StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders ) { org.springframework.boot.autoconfigure.websocket.StompSession . subscribe ( java.lang.String , new StompFrameHandler ( ) { @ java.lang.Override public void void ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , java.lang.Object java.lang.Object ) { java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( java.lang.Object ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override public java.lang.reflect.Type java.lang.reflect.Type ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders ) { return java.lang.Object .class ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , java.lang.Object java.lang.Object ) { java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( java.lang.Object ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.reflect.Type java.lang.reflect.Type ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders ) { return java.lang.Object .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , java.lang.Object java.lang.Object ) { java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompSession org.springframework.boot.autoconfigure.websocket.StompSession , StompCommand org.springframework.boot.autoconfigure.websocket.StompCommand , StompHeaders org.springframework.boot.autoconfigure.websocket.StompHeaders , byte [] byte[] , java.lang.Throwable java.lang.Throwable ) { java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> . void ( java.lang.Throwable ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompSession org.springframework.boot.autoconfigure.websocket.StompSession , java.lang.Throwable java.lang.Throwable ) { java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> . void ( java.lang.Throwable ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StompEndpointRegistry org.springframework.boot.autoconfigure.websocket.StompEndpointRegistry ) { org.springframework.boot.autoconfigure.websocket.StompEndpointRegistry . addEndpoint ( STRING ) . withSockJS ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageBrokerRegistry org.springframework.boot.autoconfigure.websocket.MessageBrokerRegistry ) { org.springframework.boot.autoconfigure.websocket.MessageBrokerRegistry . setApplicationDestinationPrefixes ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.MessagingController org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.MessagingController ( ) { return new org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.MessagingController ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.websocket.TomcatServletWebServerFactory org.springframework.boot.autoconfigure.websocket.TomcatServletWebServerFactory ( ) { return new TomcatServletWebServerFactory ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.websocket.TomcatWebSocketContainerCustomizer org.springframework.boot.autoconfigure.websocket.TomcatWebSocketContainerCustomizer ( ) { return new TomcatWebSocketContainerCustomizer ( ) ; }  <METHOD_END>
<METHOD_START> @ SubscribeMapping ( STRING ) org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.Data org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.Data ( ) { return new org.springframework.boot.autoconfigure.websocket.WebSocketMessagingAutoConfigurationTests.Data ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ SubscribeMapping ( STRING ) java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> void ( int int , java.lang.String java.lang.String ) { this . int = int ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
