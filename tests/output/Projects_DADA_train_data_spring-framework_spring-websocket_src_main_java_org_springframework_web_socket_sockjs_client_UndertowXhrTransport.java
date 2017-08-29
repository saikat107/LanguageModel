<METHOD_START> public void ( ) java.io.IOException { this( OptionMap . builder ( ) . parse ( Options . WORKER_NAME , STRING ) . getMap ( ) ); }  <METHOD_END>
<METHOD_START> public void ( OptionMap org.springframework.web.socket.sockjs.client.OptionMap ) throws java.io.IOException { Assert . notNull ( org.springframework.web.socket.sockjs.client.OptionMap , STRING ) ; this . org.springframework.web.socket.sockjs.client.OptionMap = org.springframework.web.socket.sockjs.client.OptionMap ; this . org.springframework.web.socket.sockjs.client.UndertowClient = UndertowClient . getInstance ( ) ; this . org.springframework.web.socket.sockjs.client.XnioWorker = Xnio . getInstance ( ) . createWorker ( org.springframework.web.socket.sockjs.client.OptionMap ) ; this . org.springframework.web.socket.sockjs.client.ByteBufferPool = new DefaultByteBufferPool ( false , NUMBER , - NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.socket.sockjs.client.UndertowClient org.springframework.web.socket.sockjs.client.UndertowClient ( ) { return this . org.springframework.web.socket.sockjs.client.UndertowClient ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.socket.sockjs.client.XnioWorker org.springframework.web.socket.sockjs.client.XnioWorker ( ) { return this . org.springframework.web.socket.sockjs.client.XnioWorker ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( TransportRequest org.springframework.web.socket.sockjs.client.TransportRequest , WebSocketHandler org.springframework.web.socket.sockjs.client.WebSocketHandler , java.net.URI java.net.URI , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , XhrClientSockJsSession org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) { void ( org.springframework.web.socket.sockjs.client.TransportRequest , java.net.URI , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; }  <METHOD_END>
<METHOD_START> private void void ( final TransportRequest org.springframework.web.socket.sockjs.client.TransportRequest , final java.net.URI java.net.URI , final HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , final XhrClientSockJsSession org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , final SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) { if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.net.URI ) ; } ClientCallback < ClientConnection > org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientConnection> = new ClientCallback < ClientConnection > ( ) { @ java.lang.Override public void void ( ClientConnection org.springframework.web.socket.sockjs.client.ClientConnection ) { ClientRequest org.springframework.web.socket.sockjs.client.ClientRequest = new ClientRequest ( ) . setMethod ( Methods . POST ) . setPath ( java.net.URI . java.lang.String ( ) ) ; HttpString org.springframework.web.socket.sockjs.client.HttpString = HttpString . tryFromString ( HttpHeaders . HOST ) ; org.springframework.web.socket.sockjs.client.ClientRequest . getRequestHeaders ( ) . add ( org.springframework.web.socket.sockjs.client.HttpString , java.net.URI . java.lang.String ( ) ) ; void ( org.springframework.web.socket.sockjs.client.ClientRequest , org.springframework.web.socket.sockjs.client.HttpHeaders ) ; HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders = org.springframework.web.socket.sockjs.client.TransportRequest . getHttpRequestHeaders ( ) ; org.springframework.web.socket.sockjs.client.ClientConnection . sendRequest ( org.springframework.web.socket.sockjs.client.ClientRequest , org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> ( org.springframework.web.socket.sockjs.client.TransportRequest , java.net.URI , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ) ; } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { throw new SockJsTransportFailureException ( STRING + java.net.URI , java.io.IOException ) ; } } ; this . org.springframework.web.socket.sockjs.client.UndertowClient . connect ( org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientConnection> , java.net.URI , this . org.springframework.web.socket.sockjs.client.XnioWorker , this . org.springframework.web.socket.sockjs.client.ByteBufferPool , this . org.springframework.web.socket.sockjs.client.OptionMap ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientConnection org.springframework.web.socket.sockjs.client.ClientConnection ) { ClientRequest org.springframework.web.socket.sockjs.client.ClientRequest = new ClientRequest ( ) . setMethod ( Methods . POST ) . setPath ( java.net.URI . java.lang.String ( ) ) ; HttpString org.springframework.web.socket.sockjs.client.HttpString = HttpString . tryFromString ( HttpHeaders . HOST ) ; org.springframework.web.socket.sockjs.client.ClientRequest . getRequestHeaders ( ) . add ( org.springframework.web.socket.sockjs.client.HttpString , java.net.URI . java.lang.String ( ) ) ; void ( org.springframework.web.socket.sockjs.client.ClientRequest , org.springframework.web.socket.sockjs.client.HttpHeaders ) ; HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders = org.springframework.web.socket.sockjs.client.TransportRequest . getHttpRequestHeaders ( ) ; org.springframework.web.socket.sockjs.client.ClientConnection . sendRequest ( org.springframework.web.socket.sockjs.client.ClientRequest , org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> ( org.springframework.web.socket.sockjs.client.TransportRequest , java.net.URI , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { throw new SockJsTransportFailureException ( STRING + java.net.URI , java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> private static void void ( ClientRequest org.springframework.web.socket.sockjs.client.ClientRequest , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders ) { HeaderMap org.springframework.web.socket.sockjs.client.HeaderMap = org.springframework.web.socket.sockjs.client.ClientRequest . getRequestHeaders ( ) ; for ( java.lang.String java.lang.String : org.springframework.web.socket.sockjs.client.HttpHeaders . keySet ( ) ) { for ( java.lang.String java.lang.String : org.springframework.web.socket.sockjs.client.HttpHeaders . get ( java.lang.String ) ) { org.springframework.web.socket.sockjs.client.HeaderMap . add ( HttpString . tryFromString ( java.lang.String ) , java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> < ClientExchange > org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> ( final TransportRequest org.springframework.web.socket.sockjs.client.TransportRequest , final java.net.URI java.net.URI , final HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , final XhrClientSockJsSession org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , final SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) { return new ClientCallback < ClientExchange > ( ) { @ java.lang.Override public void void ( final ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { org.springframework.web.socket.sockjs.client.ClientExchange . setResponseListener ( new ClientCallback < ClientExchange > ( ) { @ java.lang.Override public void void ( ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { ClientResponse org.springframework.web.socket.sockjs.client.ClientResponse = org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) ; if ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) != NUMBER ) { HttpStatus org.springframework.web.socket.sockjs.client.HttpStatus = HttpStatus . valueOf ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) ) ; IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( new HttpServerErrorException ( org.springframework.web.socket.sockjs.client.HttpStatus , STRING ) ) ; } else { org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener = new org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener ( org.springframework.web.socket.sockjs.client.TransportRequest , org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) , java.net.URI , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener . void ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponseChannel ( ) ) ; } if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.socket.sockjs.client.HttpHeaders ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseHeaders ( ) ) ) ; } try { StreamSinkChannel org.springframework.web.socket.sockjs.client.StreamSinkChannel = org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) ; org.springframework.web.socket.sockjs.client.StreamSinkChannel . shutdownWrites ( ) ; if ( ! org.springframework.web.socket.sockjs.client.StreamSinkChannel . flush ( ) ) { org.springframework.web.socket.sockjs.client.StreamSinkChannel . getWriteSetter ( ) . set ( ChannelListeners .< StreamSinkChannel > flushingChannelListener ( null , null ) ) ; org.springframework.web.socket.sockjs.client.StreamSinkChannel . resumeWrites ( ) ; } } catch ( java.io.IOException java.io.IOException ) { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( java.io.IOException ) ; } } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( java.io.IOException ) ; } } ) ; } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.io.IOException ) ; } private void void ( java.lang.Throwable java.lang.Throwable ) { if ( org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . setException ( java.lang.Throwable ) ) { return; } if ( org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . isDisconnected ( ) ) { org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . afterTransportClosed ( null ) ; } else { org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . handleTransportError ( java.lang.Throwable ) ; org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . afterTransportClosed ( new CloseStatus ( NUMBER , java.lang.Throwable . java.lang.String ( ) ) ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { org.springframework.web.socket.sockjs.client.ClientExchange . setResponseListener ( new ClientCallback < ClientExchange > ( ) { @ java.lang.Override public void void ( ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { ClientResponse org.springframework.web.socket.sockjs.client.ClientResponse = org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) ; if ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) != NUMBER ) { HttpStatus org.springframework.web.socket.sockjs.client.HttpStatus = HttpStatus . valueOf ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) ) ; IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( new HttpServerErrorException ( org.springframework.web.socket.sockjs.client.HttpStatus , STRING ) ) ; } else { org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener = new org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener ( org.springframework.web.socket.sockjs.client.TransportRequest , org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) , java.net.URI , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener . void ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponseChannel ( ) ) ; } if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.socket.sockjs.client.HttpHeaders ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseHeaders ( ) ) ) ; } try { StreamSinkChannel org.springframework.web.socket.sockjs.client.StreamSinkChannel = org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) ; org.springframework.web.socket.sockjs.client.StreamSinkChannel . shutdownWrites ( ) ; if ( ! org.springframework.web.socket.sockjs.client.StreamSinkChannel . flush ( ) ) { org.springframework.web.socket.sockjs.client.StreamSinkChannel . getWriteSetter ( ) . set ( ChannelListeners .< StreamSinkChannel > flushingChannelListener ( null , null ) ) ; org.springframework.web.socket.sockjs.client.StreamSinkChannel . resumeWrites ( ) ; } } catch ( java.io.IOException java.io.IOException ) { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( java.io.IOException ) ; } } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( java.io.IOException ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { ClientResponse org.springframework.web.socket.sockjs.client.ClientResponse = org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) ; if ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) != NUMBER ) { HttpStatus org.springframework.web.socket.sockjs.client.HttpStatus = HttpStatus . valueOf ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) ) ; IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( new HttpServerErrorException ( org.springframework.web.socket.sockjs.client.HttpStatus , STRING ) ) ; } else { org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener = new org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener ( org.springframework.web.socket.sockjs.client.TransportRequest , org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) , java.net.URI , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; org.springframework.web.socket.sockjs.client.UndertowXhrTransport.SockJsResponseListener . void ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponseChannel ( ) ) ; } if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + org.springframework.web.socket.sockjs.client.HttpHeaders ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseHeaders ( ) ) ) ; } try { StreamSinkChannel org.springframework.web.socket.sockjs.client.StreamSinkChannel = org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) ; org.springframework.web.socket.sockjs.client.StreamSinkChannel . shutdownWrites ( ) ; if ( ! org.springframework.web.socket.sockjs.client.StreamSinkChannel . flush ( ) ) { org.springframework.web.socket.sockjs.client.StreamSinkChannel . getWriteSetter ( ) . set ( ChannelListeners .< StreamSinkChannel > flushingChannelListener ( null , null ) ) ; org.springframework.web.socket.sockjs.client.StreamSinkChannel . resumeWrites ( ) ; } } catch ( java.io.IOException java.io.IOException ) { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) ) ; void ( java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Throwable java.lang.Throwable ) { if ( org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . setException ( java.lang.Throwable ) ) { return; } if ( org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . isDisconnected ( ) ) { org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . afterTransportClosed ( null ) ; } else { org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . handleTransportError ( java.lang.Throwable ) ; org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . afterTransportClosed ( new CloseStatus ( NUMBER , java.lang.Throwable . java.lang.String ( ) ) ) ; } }  <METHOD_END>
<METHOD_START> private static org.springframework.web.socket.sockjs.client.HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders ( HeaderMap org.springframework.web.socket.sockjs.client.HeaderMap ) { HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders = new HttpHeaders ( ) ; for ( HttpString org.springframework.web.socket.sockjs.client.HttpString : org.springframework.web.socket.sockjs.client.HeaderMap . getHeaderNames ( ) ) { for ( java.lang.String java.lang.String : org.springframework.web.socket.sockjs.client.HeaderMap . get ( org.springframework.web.socket.sockjs.client.HttpString ) ) { org.springframework.web.socket.sockjs.client.HttpHeaders . add ( org.springframework.web.socket.sockjs.client.HttpString . toString ( ) , java.lang.String ) ; } } return org.springframework.web.socket.sockjs.client.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> < java.lang.String > org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> ( java.net.URI java.net.URI , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders ) { return org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> ( java.net.URI , Methods . GET , org.springframework.web.socket.sockjs.client.HttpHeaders , null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> < java.lang.String > org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> ( java.net.URI java.net.URI , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , TextMessage org.springframework.web.socket.sockjs.client.TextMessage ) { return org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> ( java.net.URI , Methods . POST , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.TextMessage . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> < java.lang.String > org.springframework.web.socket.sockjs.client.ResponseEntity<java.lang.String> ( java.net.URI java.net.URI , HttpString org.springframework.web.socket.sockjs.client.HttpString , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , java.lang.String java.lang.String ) { java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> < ClientResponse > java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> = new java.util.concurrent.CopyOnWriteArrayList<org.springframework.web.socket.sockjs.client.ClientResponse> <> ( ) ; try { ClientConnection org.springframework.web.socket.sockjs.client.ClientConnection = this . org.springframework.web.socket.sockjs.client.UndertowClient . connect ( java.net.URI , this . org.springframework.web.socket.sockjs.client.XnioWorker , this . org.springframework.web.socket.sockjs.client.ByteBufferPool , this . org.springframework.web.socket.sockjs.client.OptionMap ) . get ( ) ; try { ClientRequest org.springframework.web.socket.sockjs.client.ClientRequest = new ClientRequest ( ) . setMethod ( org.springframework.web.socket.sockjs.client.HttpString ) . setPath ( java.net.URI . java.lang.String ( ) ) ; org.springframework.web.socket.sockjs.client.ClientRequest . getRequestHeaders ( ) . add ( HttpString . tryFromString ( HttpHeaders . HOST ) , java.net.URI . java.lang.String ( ) ) ; if ( java.lang.String != null && ! java.lang.String . boolean ( ) ) { HttpString org.springframework.web.socket.sockjs.client.HttpString = HttpString . tryFromString ( HttpHeaders . CONTENT_LENGTH ) ; org.springframework.web.socket.sockjs.client.ClientRequest . getRequestHeaders ( ) . add ( org.springframework.web.socket.sockjs.client.HttpString , java.lang.String . int ( ) ) ; } void ( org.springframework.web.socket.sockjs.client.ClientRequest , org.springframework.web.socket.sockjs.client.HttpHeaders ) ; org.springframework.web.socket.sockjs.client.ClientConnection . sendRequest ( org.springframework.web.socket.sockjs.client.ClientRequest , org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> ( java.lang.String , java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> , java.util.concurrent.CountDownLatch ) ) ; java.util.concurrent.CountDownLatch . void ( ) ; ClientResponse org.springframework.web.socket.sockjs.client.ClientResponse = java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> . iterator ( ) . next ( ) ; HttpStatus org.springframework.web.socket.sockjs.client.HttpStatus = HttpStatus . valueOf ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseCode ( ) ) ; HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders = org.springframework.web.socket.sockjs.client.HttpHeaders ( org.springframework.web.socket.sockjs.client.ClientResponse . getResponseHeaders ( ) ) ; java.lang.String java.lang.String = org.springframework.web.socket.sockjs.client.ClientResponse . getAttachment ( org.springframework.web.socket.sockjs.client.AttachmentKey<java.lang.String> ) ; return ( java.lang.String != null ? new ResponseEntity <> ( java.lang.String , org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.HttpStatus ) : new ResponseEntity <> ( org.springframework.web.socket.sockjs.client.HttpHeaders , org.springframework.web.socket.sockjs.client.HttpStatus ) ) ; } finally { IoUtils . safeClose ( org.springframework.web.socket.sockjs.client.ClientConnection ) ; } } catch ( java.io.IOException java.io.IOException ) { throw new SockJsTransportFailureException ( STRING + java.net.URI , java.io.IOException ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { throw new SockJsTransportFailureException ( STRING + java.net.URI , java.lang.InterruptedException ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> < ClientExchange > org.springframework.web.socket.sockjs.client.ClientCallback<org.springframework.web.socket.sockjs.client.ClientExchange> ( final java.lang.String java.lang.String , final java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> < ClientResponse > java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> , final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch ) { return new ClientCallback < ClientExchange > ( ) { @ java.lang.Override public void void ( ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { org.springframework.web.socket.sockjs.client.ClientExchange . setResponseListener ( new ClientCallback < ClientExchange > ( ) { @ java.lang.Override public void void ( final ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> . add ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) ) ; new StringReadChannelListener ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) . getBufferPool ( ) ) { @ java.lang.Override protected void void ( java.lang.String java.lang.String ) { org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) . putAttachment ( org.springframework.web.socket.sockjs.client.AttachmentKey<java.lang.String> , java.lang.String ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override protected void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } } . setup ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponseChannel ( ) ) ; } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } } ) ; try { if ( java.lang.String != null ) { org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . write ( java.nio.ByteBuffer . java.nio.ByteBuffer ( java.lang.String . byte[] ( ) ) ) ; } org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . shutdownWrites ( ) ; if ( ! org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . flush ( ) ) { org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . getWriteSetter ( ) . set ( ChannelListeners .< StreamSinkChannel > flushingChannelListener ( null , null ) ) ; org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . resumeWrites ( ) ; } } catch ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } private void void ( java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch , java.io.IOException java.io.IOException ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new SockJsTransportFailureException ( STRING , java.io.IOException ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { org.springframework.web.socket.sockjs.client.ClientExchange . setResponseListener ( new ClientCallback < ClientExchange > ( ) { @ java.lang.Override public void void ( final ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> . add ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) ) ; new StringReadChannelListener ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) . getBufferPool ( ) ) { @ java.lang.Override protected void void ( java.lang.String java.lang.String ) { org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) . putAttachment ( org.springframework.web.socket.sockjs.client.AttachmentKey<java.lang.String> , java.lang.String ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override protected void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } } . setup ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponseChannel ( ) ) ; } @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } } ) ; try { if ( java.lang.String != null ) { org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . write ( java.nio.ByteBuffer . java.nio.ByteBuffer ( java.lang.String . byte[] ( ) ) ) ; } org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . shutdownWrites ( ) ; if ( ! org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . flush ( ) ) { org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . getWriteSetter ( ) . set ( ChannelListeners .< StreamSinkChannel > flushingChannelListener ( null , null ) ) ; org.springframework.web.socket.sockjs.client.ClientExchange . getRequestChannel ( ) . resumeWrites ( ) ; } } catch ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final ClientExchange org.springframework.web.socket.sockjs.client.ClientExchange ) { java.util.List<org.springframework.web.socket.sockjs.client.ClientResponse> . add ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) ) ; new StringReadChannelListener ( org.springframework.web.socket.sockjs.client.ClientExchange . getConnection ( ) . getBufferPool ( ) ) { @ java.lang.Override protected void void ( java.lang.String java.lang.String ) { org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) . putAttachment ( org.springframework.web.socket.sockjs.client.AttachmentKey<java.lang.String> , java.lang.String ) ; java.util.concurrent.CountDownLatch . void ( ) ; } @ java.lang.Override protected void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; } } . setup ( org.springframework.web.socket.sockjs.client.ClientExchange . getResponseChannel ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String ) { org.springframework.web.socket.sockjs.client.ClientExchange . getResponse ( ) . putAttachment ( org.springframework.web.socket.sockjs.client.AttachmentKey<java.lang.String> , java.lang.String ) ; java.util.concurrent.CountDownLatch . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.io.IOException java.io.IOException ) { void ( java.util.concurrent.CountDownLatch , java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch , java.io.IOException java.io.IOException ) { java.util.concurrent.CountDownLatch . void ( ) ; throw new SockJsTransportFailureException ( STRING , java.io.IOException ) ; }  <METHOD_END>
<METHOD_START> public void ( TransportRequest org.springframework.web.socket.sockjs.client.TransportRequest , ClientConnection org.springframework.web.socket.sockjs.client.ClientConnection , java.net.URI java.net.URI , HttpHeaders org.springframework.web.socket.sockjs.client.HttpHeaders , XhrClientSockJsSession org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , SettableListenableFuture < WebSocketSession > org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) { this . org.springframework.web.socket.sockjs.client.TransportRequest = org.springframework.web.socket.sockjs.client.TransportRequest ; this . org.springframework.web.socket.sockjs.client.ClientConnection = org.springframework.web.socket.sockjs.client.ClientConnection ; this . java.net.URI = java.net.URI ; this . org.springframework.web.socket.sockjs.client.HttpHeaders = org.springframework.web.socket.sockjs.client.HttpHeaders ; this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession = org.springframework.web.socket.sockjs.client.XhrClientSockJsSession ; this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> = org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ; }  <METHOD_END>
<METHOD_START> public void void ( StreamSourceChannel org.springframework.web.socket.sockjs.client.StreamSourceChannel ) { org.springframework.web.socket.sockjs.client.StreamSourceChannel . suspendReads ( ) ; org.springframework.web.socket.sockjs.client.StreamSourceChannel . getReadSetter ( ) . set ( this ) ; org.springframework.web.socket.sockjs.client.StreamSourceChannel . resumeReads ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StreamSourceChannel org.springframework.web.socket.sockjs.client.StreamSourceChannel ) { if ( this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . isDisconnected ( ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } IoUtils . safeClose ( this . org.springframework.web.socket.sockjs.client.ClientConnection ) ; throw new SockJsException ( STRING , this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . getId ( ) , null ) ; } PooledByteBuffer org.springframework.web.socket.sockjs.client.PooledByteBuffer = org.springframework.web.socket.sockjs.client.ByteBufferPool . allocate ( ) ; try { int int ; do { java.nio.ByteBuffer java.nio.ByteBuffer = org.springframework.web.socket.sockjs.client.PooledByteBuffer . getBuffer ( ) ; java.nio.ByteBuffer . java.nio.Buffer ( ) ; int = org.springframework.web.socket.sockjs.client.StreamSourceChannel . read ( java.nio.ByteBuffer ) ; java.nio.ByteBuffer . java.nio.Buffer ( ) ; if ( int == NUMBER ) { return; } else if ( int == - NUMBER ) { void ( ) ; } else { while ( java.nio.ByteBuffer . boolean ( ) ) { int int = java.nio.ByteBuffer . byte ( ) ; if ( int == '\n' ) { void ( ) ; } else { this . java.io.ByteArrayOutputStream . void ( int ) ; } } } } while ( int > NUMBER ); } catch ( java.io.IOException java.io.IOException ) { void ( java.io.IOException ) ; } finally { org.springframework.web.socket.sockjs.client.PooledByteBuffer . close ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { byte [] byte[] = this . java.io.ByteArrayOutputStream . byte[] ( ) ; this . java.io.ByteArrayOutputStream . void ( ) ; java.lang.String java.lang.String = new java.lang.String ( byte[] , SockJsFrame . CHARSET ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING + java.lang.String ) ; } if ( ! PRELUDE . equals ( java.lang.String ) ) { this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . handleFrame ( new java.lang.String ( byte[] , SockJsFrame . CHARSET ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( ) { if ( this . java.io.ByteArrayOutputStream . int ( ) > NUMBER ) { void ( ) ; } if ( logger . isTraceEnabled ( ) ) { logger . trace ( STRING ) ; } IoUtils . safeClose ( this . org.springframework.web.socket.sockjs.client.ClientConnection ) ; void ( this . org.springframework.web.socket.sockjs.client.TransportRequest , this . java.net.URI , this . org.springframework.web.socket.sockjs.client.HttpHeaders , this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession , this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Throwable java.lang.Throwable ) { IoUtils . safeClose ( this . org.springframework.web.socket.sockjs.client.ClientConnection ) ; if ( this . org.springframework.web.socket.sockjs.client.SettableListenableFuture<org.springframework.web.socket.sockjs.client.WebSocketSession> . setException ( java.lang.Throwable ) ) { return; } if ( this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . isDisconnected ( ) ) { this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . afterTransportClosed ( null ) ; } else { this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . handleTransportError ( java.lang.Throwable ) ; this . org.springframework.web.socket.sockjs.client.XhrClientSockJsSession . afterTransportClosed ( new CloseStatus ( NUMBER , java.lang.Throwable . java.lang.String ( ) ) ) ; } }  <METHOD_END>
