<METHOD_START> public void ( java.lang.String java.lang.String , ClientHttpRequestFactory org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory ) { this( java.lang.String , org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory , null ); }  <METHOD_END>
<METHOD_START> protected void ( java.lang.String java.lang.String , ClientHttpRequestFactory org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory , java.util.concurrent.Executor java.util.concurrent.Executor ) { Assert . hasLength ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory , STRING ) ; try { this . java.net.URI = new java.net.URL ( java.lang.String ) . java.net.URI ( ) ; } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } catch ( java.net.MalformedURLException java.net.MalformedURLException ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } this . org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory = org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory ; this . java.util.concurrent.Executor = ( java.util.concurrent.Executor == null ? java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( new org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection.TunnelThreadFactory ( ) ) : java.util.concurrent.Executor ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection.TunnelChannel org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection.TunnelChannel ( java.nio.channels.WritableByteChannel java.nio.channels.WritableByteChannel , java.io.Closeable java.io.Closeable )			throws java.lang.Exception { org.springframework.boot.devtools.tunnel.client.Log . trace ( STRING + this . java.net.URI ) ; return new org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection.TunnelChannel ( java.nio.channels.WritableByteChannel , java.io.Closeable ) ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.devtools.tunnel.client.ClientHttpRequest org.springframework.boot.devtools.tunnel.client.ClientHttpRequest ( boolean boolean )			throws java.io.IOException { HttpMethod org.springframework.boot.devtools.tunnel.client.HttpMethod = ( boolean ? HttpMethod . POST : HttpMethod . GET ) ; return this . org.springframework.boot.devtools.tunnel.client.ClientHttpRequestFactory . createRequest ( this . java.net.URI , org.springframework.boot.devtools.tunnel.client.HttpMethod ) ; }  <METHOD_END>
<METHOD_START> public void ( java.nio.channels.WritableByteChannel java.nio.channels.WritableByteChannel , java.io.Closeable java.io.Closeable ) { this . org.springframework.boot.devtools.tunnel.client.HttpTunnelPayloadForwarder = new HttpTunnelPayloadForwarder ( java.nio.channels.WritableByteChannel ) ; this . java.io.Closeable = java.io.Closeable ; void ( null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { if ( this . boolean ) { this . boolean = false ; this . java.io.Closeable . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.nio.ByteBuffer java.nio.ByteBuffer ) throws java.io.IOException { int int = java.nio.ByteBuffer . int ( ) ; if ( int > NUMBER ) { void ( new HttpTunnelPayload ( this . java.util.concurrent.atomic.AtomicLong . long ( ) , java.nio.ByteBuffer ) ) ; } return int ; }  <METHOD_END>
<METHOD_START> private void void ( final HttpTunnelPayload org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload ) { org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection .this . java.util.concurrent.Executor . void ( new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { try { void ( org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload ) ; } catch ( java.io.IOException java.io.IOException ) { if ( java.io.IOException instanceof java.net.ConnectException ) { org.springframework.boot.devtools.tunnel.client.Log . warn ( STRING + org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection .this . java.net.URI ) ; } else { org.springframework.boot.devtools.tunnel.client.Log . trace ( STRING , java.io.IOException ) ; } void ( ) ; } } private void void ( ) { try { void ( ) ; } catch ( java.io.IOException java.io.IOException ) { } } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { try { void ( org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload ) ; } catch ( java.io.IOException java.io.IOException ) { if ( java.io.IOException instanceof java.net.ConnectException ) { org.springframework.boot.devtools.tunnel.client.Log . warn ( STRING + org.springframework.boot.devtools.tunnel.client.HttpTunnelConnection .this . java.net.URI ) ; } else { org.springframework.boot.devtools.tunnel.client.Log . trace ( STRING , java.io.IOException ) ; } void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { try { void ( ) ; } catch ( java.io.IOException java.io.IOException ) { } }  <METHOD_END>
<METHOD_START> private void void ( HttpTunnelPayload org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload ) throws java.io.IOException { ClientHttpRequest org.springframework.boot.devtools.tunnel.client.ClientHttpRequest = org.springframework.boot.devtools.tunnel.client.ClientHttpRequest ( org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload != null ) ; if ( org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload != null ) { org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload . logIncoming ( ) ; org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload . assignTo ( org.springframework.boot.devtools.tunnel.client.ClientHttpRequest ) ; } void ( org.springframework.boot.devtools.tunnel.client.ClientHttpRequest . execute ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ClientHttpResponse org.springframework.boot.devtools.tunnel.client.ClientHttpResponse ) throws java.io.IOException { if ( org.springframework.boot.devtools.tunnel.client.ClientHttpResponse . getStatusCode ( ) == HttpStatus . GONE ) { void ( ) ; return; } if ( org.springframework.boot.devtools.tunnel.client.ClientHttpResponse . getStatusCode ( ) == HttpStatus . SERVICE_UNAVAILABLE ) { org.springframework.boot.devtools.tunnel.client.Log . warn ( STRING + STRING ) ; void ( ) ; return; } if ( org.springframework.boot.devtools.tunnel.client.ClientHttpResponse . getStatusCode ( ) == HttpStatus . OK ) { HttpTunnelPayload org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload = HttpTunnelPayload . get ( org.springframework.boot.devtools.tunnel.client.ClientHttpResponse ) ; if ( org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload != null ) { this . org.springframework.boot.devtools.tunnel.client.HttpTunnelPayloadForwarder . forward ( org.springframework.boot.devtools.tunnel.client.HttpTunnelPayload ) ; } } if ( org.springframework.boot.devtools.tunnel.client.ClientHttpResponse . getStatusCode ( ) != HttpStatus . TOO_MANY_REQUESTS ) { void ( null ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Thread java.lang.Thread ( java.lang.Runnable java.lang.Runnable ) { java.lang.Thread java.lang.Thread = new java.lang.Thread ( java.lang.Runnable , STRING ) ; java.lang.Thread . void ( true ) ; return java.lang.Thread ; }  <METHOD_END>
