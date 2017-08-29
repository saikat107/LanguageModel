<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.tunnel.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.tunnel.client.ExpectedException . expectMessage ( STRING ) ; new TunnelClient ( NUMBER , this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.tunnel.client.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.tunnel.client.ExpectedException . expectMessage ( STRING ) ; new TunnelClient ( NUMBER , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TunnelClient org.springframework.boot.devtools.tunnel.client.TunnelClient = new TunnelClient ( this . int , this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . start ( ) ; java.nio.channels.SocketChannel java.nio.channels.SocketChannel = java.nio.channels.SocketChannel . java.nio.channels.SocketChannel ( new java.net.InetSocketAddress ( this . int ) ) ; java.nio.channels.SocketChannel . int ( java.nio.ByteBuffer . java.nio.ByteBuffer ( STRING . byte[] ( ) ) ) ; java.nio.ByteBuffer java.nio.ByteBuffer = java.nio.ByteBuffer . java.nio.ByteBuffer ( NUMBER ) ; java.nio.channels.SocketChannel . int ( java.nio.ByteBuffer ) ; java.nio.channels.SocketChannel . void ( ) ; this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection . void ( STRING ) ; assertThat ( new java.lang.String ( java.nio.ByteBuffer . byte[] ( ) ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TunnelClient org.springframework.boot.devtools.tunnel.client.TunnelClient = new TunnelClient ( this . int , this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . start ( ) ; java.nio.channels.SocketChannel java.nio.channels.SocketChannel = java.nio.channels.SocketChannel . java.nio.channels.SocketChannel ( new java.net.InetSocketAddress ( this . int ) ) ; java.lang.Thread . void ( NUMBER ) ; java.nio.channels.SocketChannel . void ( ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . getServerThread ( ) . stopAcceptingConnections ( ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . getServerThread ( ) . join ( NUMBER ) ; assertThat ( this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection . int ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection . boolean ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TunnelClient org.springframework.boot.devtools.tunnel.client.TunnelClient = new TunnelClient ( this . int , this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . start ( ) ; java.nio.channels.SocketChannel java.nio.channels.SocketChannel = java.nio.channels.SocketChannel . java.nio.channels.SocketChannel ( new java.net.InetSocketAddress ( this . int ) ) ; java.lang.Thread . void ( NUMBER ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . stop ( ) ; assertThat ( this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection . int ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection . boolean ( ) ) . isFalse ( ) ; assertThat ( java.nio.channels.SocketChannel . int ( java.nio.ByteBuffer . java.nio.ByteBuffer ( NUMBER ) ) ) . isEqualTo ( - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TunnelClient org.springframework.boot.devtools.tunnel.client.TunnelClient = new TunnelClient ( this . int , this . org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection ) ; TunnelClientListener org.springframework.boot.devtools.tunnel.client.TunnelClientListener = mock ( TunnelClientListener .class ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . addListener ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . start ( ) ; java.nio.channels.SocketChannel java.nio.channels.SocketChannel = java.nio.channels.SocketChannel . java.nio.channels.SocketChannel ( new java.net.InetSocketAddress ( this . int ) ) ; java.lang.Thread . void ( NUMBER ) ; java.nio.channels.SocketChannel . void ( ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . getServerThread ( ) . stopAcceptingConnections ( ) ; org.springframework.boot.devtools.tunnel.client.TunnelClient . getServerThread ( ) . join ( NUMBER ) ; verify ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) . onOpen ( any ( java.nio.channels.SocketChannel .class ) ) ; verify ( org.springframework.boot.devtools.tunnel.client.TunnelClientListener ) . onClose ( any ( java.nio.channels.SocketChannel .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.nio.channels.WritableByteChannel java.nio.channels.WritableByteChannel ( java.nio.channels.WritableByteChannel java.nio.channels.WritableByteChannel , java.io.Closeable java.io.Closeable ) throws java.lang.Exception { this . int ++ ; this . boolean = true ; return new org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection.TunnelChannel ( java.nio.channels.WritableByteChannel , java.io.Closeable ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { void ( java.lang.String . byte[] ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( byte [] byte[] ) { synchronized ( this . java.io.ByteArrayOutputStream ) { assertThat ( this . java.io.ByteArrayOutputStream . byte[] ( ) ) . isEqualTo ( byte[] ) ; this . java.io.ByteArrayOutputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> void ( java.nio.channels.WritableByteChannel java.nio.channels.WritableByteChannel , java.io.Closeable java.io.Closeable ) { this . java.nio.channels.WritableByteChannel = java.nio.channels.WritableByteChannel ; this . java.io.Closeable = java.io.Closeable ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection .this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection .this . boolean = false ; this . java.io.Closeable . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.nio.ByteBuffer java.nio.ByteBuffer ) throws java.io.IOException { int int = java.nio.ByteBuffer . int ( ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.nio.channels.Channels . java.nio.channels.WritableByteChannel ( java.io.ByteArrayOutputStream ) . int ( java.nio.ByteBuffer ) ; byte [] byte[] = java.io.ByteArrayOutputStream . byte[] ( ) ; synchronized ( org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection .this . java.io.ByteArrayOutputStream ) { org.springframework.boot.devtools.tunnel.client.TunnelClientTests.MockTunnelConnection .this . java.io.ByteArrayOutputStream . void ( byte[] ) ; } byte [] byte[] = new byte [ byte[] . int ] ; for ( int int = NUMBER ; int < byte[] . int ; int ++ ) { byte[] [ int ] = byte[] [ byte[] . int - NUMBER - int ] ; } this . java.nio.channels.WritableByteChannel . int ( java.nio.ByteBuffer . java.nio.ByteBuffer ( byte[] ) ) ; return int ; }  <METHOD_END>