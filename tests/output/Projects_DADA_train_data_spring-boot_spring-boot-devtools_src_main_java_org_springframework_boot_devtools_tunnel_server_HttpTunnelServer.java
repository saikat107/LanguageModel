<METHOD_START> public void ( TargetServerConnection org.springframework.boot.devtools.tunnel.server.TargetServerConnection ) { Assert . notNull ( org.springframework.boot.devtools.tunnel.server.TargetServerConnection , STRING ) ; this . org.springframework.boot.devtools.tunnel.server.TargetServerConnection = org.springframework.boot.devtools.tunnel.server.TargetServerConnection ; }  <METHOD_END>
<METHOD_START> public void void ( ServerHttpRequest org.springframework.boot.devtools.tunnel.server.ServerHttpRequest , ServerHttpResponse org.springframework.boot.devtools.tunnel.server.ServerHttpResponse )			throws java.io.IOException { void ( new org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( org.springframework.boot.devtools.tunnel.server.ServerHttpRequest , org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ) throws java.io.IOException { try { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread ( ) . void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . void ( ) ; } catch ( java.net.ConnectException java.net.ConnectException ) { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . void ( HttpStatus . GONE ) ; } catch ( RemoteDebugNotRunningException org.springframework.boot.devtools.tunnel.server.RemoteDebugNotRunningException ) { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . void ( HttpStatus . SERVICE_UNAVAILABLE ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread ( ) java.io.IOException { synchronized ( this ) { if ( this . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread == null ) { java.nio.channels.ByteChannel java.nio.channels.ByteChannel = this . org.springframework.boot.devtools.tunnel.server.TargetServerConnection . open ( this . int ) ; this . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread = new org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread ( java.nio.channels.ByteChannel ) ; this . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread . void ( ) ; } return this . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread ; } }  <METHOD_END>
<METHOD_START> void void ( ) { synchronized ( this ) { this . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.ServerThread = null ; } }  <METHOD_END>
<METHOD_START> public void void ( int int ) { Assert . isTrue ( int > NUMBER , STRING ) ; this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { Assert . isTrue ( long > NUMBER , STRING ) ; this . long = long ; }  <METHOD_END>
<METHOD_START> public void ( java.nio.channels.ByteChannel java.nio.channels.ByteChannel ) { Assert . notNull ( java.nio.channels.ByteChannel , STRING ) ; this . java.nio.channels.ByteChannel = java.nio.channels.ByteChannel ; this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> = new java.util.ArrayDeque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> <> ( NUMBER ) ; this . org.springframework.boot.devtools.tunnel.server.HttpTunnelPayloadForwarder = new HttpTunnelPayloadForwarder ( java.nio.channels.ByteChannel ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { try { try { void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.devtools.tunnel.server.Log . trace ( STRING , java.lang.Exception ) ; } } finally { this . boolean = true ; void ( ) ; void ( ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelServer .this . void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) java.io.IOException { while ( this . java.nio.channels.ByteChannel . boolean ( ) ) { void ( ) ; java.nio.ByteBuffer java.nio.ByteBuffer = HttpTunnelPayload . getPayloadData ( this . java.nio.channels.ByteChannel ) ; synchronized ( this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> ) { if ( java.nio.ByteBuffer != null ) { HttpTunnelPayload org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload = new HttpTunnelPayload ( this . java.util.concurrent.atomic.AtomicLong . long ( ) , java.nio.ByteBuffer ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload . logIncoming ( ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection = org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload ) ; } } } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) { synchronized ( this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> ) { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection = this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) ; while ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection == null ) { try { this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer .this . int ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; void ( ) ; } org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection = this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) ; } return org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ; } }  <METHOD_END>
<METHOD_START> private void void ( ) java.io.IOException { synchronized ( this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> ) { void ( ) ; java.util.Iterator<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> < org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection > java.util.Iterator<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> = this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . java.util.Iterator<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> ( ) ; while ( java.util.Iterator<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . boolean ( ) ) { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection = java.util.Iterator<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) ; if ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . boolean ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer .this . int ) ) { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . void ( HttpStatus . NO_CONTENT ) ; java.util.Iterator<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . void ( ) ; } } } }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( this . long > NUMBER ) { long long = org.springframework.boot.devtools.tunnel.server.HttpTunnelServer .this . long ; long long = java.lang.System . long ( ) - this . long ; Assert . state ( long < long , STRING + long + STRING + long ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { synchronized ( this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> ) { while ( ! this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . boolean ( ) ) { try { this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) . void ( HttpStatus . GONE ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.devtools.tunnel.server.Log . trace ( STRING ) ; } } } }  <METHOD_END>
<METHOD_START> private void void ( ) { try { this . java.nio.channels.ByteChannel . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { org.springframework.boot.devtools.tunnel.server.Log . trace ( STRING ) ; } }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ) throws java.io.IOException { if ( this . boolean ) { org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . void ( HttpStatus . GONE ) ; } synchronized ( this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> ) { while ( this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . int ( ) > NUMBER ) { this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ( ) . void ( HttpStatus . TOO_MANY_REQUESTS ) ; } this . long = java.lang.System . long ( ) ; this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ) ; this . java.util.Deque<org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection> . void ( ) ; } void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection )				throws java.io.IOException { if ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . boolean ( ) ) { this . java.nio.channels.ByteChannel . void ( ) ; void ( ) ; } ServerHttpRequest org.springframework.boot.devtools.tunnel.server.ServerHttpRequest = org.springframework.boot.devtools.tunnel.server.HttpTunnelServer.HttpConnection . org.springframework.boot.devtools.tunnel.server.ServerHttpRequest ( ) ; HttpTunnelPayload org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload = HttpTunnelPayload . get ( org.springframework.boot.devtools.tunnel.server.ServerHttpRequest ) ; if ( org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload != null ) { this . org.springframework.boot.devtools.tunnel.server.HttpTunnelPayloadForwarder . forward ( org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload ) ; } }  <METHOD_END>
<METHOD_START> public void ( ServerHttpRequest org.springframework.boot.devtools.tunnel.server.ServerHttpRequest , ServerHttpResponse org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ) { this . long = java.lang.System . long ( ) ; this . org.springframework.boot.devtools.tunnel.server.ServerHttpRequest = org.springframework.boot.devtools.tunnel.server.ServerHttpRequest ; this . org.springframework.boot.devtools.tunnel.server.ServerHttpResponse = org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ; this . org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl = org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl ( ) { try { ServerHttpAsyncRequestControl org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl = this . org.springframework.boot.devtools.tunnel.server.ServerHttpRequest . getAsyncRequestControl ( this . org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ) ; org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl . start ( ) ; return org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl ; } catch ( java.lang.Exception java.lang.Exception ) { return null ; } }  <METHOD_END>
<METHOD_START> public final org.springframework.boot.devtools.tunnel.server.ServerHttpRequest org.springframework.boot.devtools.tunnel.server.ServerHttpRequest ( ) { return this . org.springframework.boot.devtools.tunnel.server.ServerHttpRequest ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.devtools.tunnel.server.ServerHttpResponse org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ( ) { return this . org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( int int ) { long long = java.lang.System . long ( ) - this . long ; return ( long > int ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { if ( this . org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl == null ) { while ( ! this . boolean ) { try { synchronized ( this ) { void ( NUMBER ) ; } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return org.springframework.boot.devtools.tunnel.server.MediaType . equals ( this . org.springframework.boot.devtools.tunnel.server.ServerHttpRequest . getHeaders ( ) . getContentType ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( HttpStatus org.springframework.boot.devtools.tunnel.server.HttpStatus ) throws java.io.IOException { Assert . notNull ( org.springframework.boot.devtools.tunnel.server.HttpStatus , STRING ) ; this . org.springframework.boot.devtools.tunnel.server.ServerHttpResponse . setStatusCode ( org.springframework.boot.devtools.tunnel.server.HttpStatus ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( HttpTunnelPayload org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload ) throws java.io.IOException { Assert . notNull ( org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload , STRING ) ; this . org.springframework.boot.devtools.tunnel.server.ServerHttpResponse . setStatusCode ( HttpStatus . OK ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelPayload . assignTo ( this . org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { if ( this . org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl != null ) { this . org.springframework.boot.devtools.tunnel.server.ServerHttpAsyncRequestControl . complete ( ) ; } else { synchronized ( this ) { this . boolean = true ; void ( ) ; } } }  <METHOD_END>
