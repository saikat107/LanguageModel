<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.net.Socket java.net.Socket ) throws java.io.IOException { java.net.Socket . void ( NUMBER ) ; java.lang.String java.lang.String = STRING ; java.net.Socket . java.io.OutputStream ( ) . void ( ( java.lang.String + STRING ) . byte[] ( ) ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; int int ; while ( true ) { int = java.net.Socket . java.io.InputStream ( ) . int ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( ( char ) int ) ; if ( int == '\n' ) { break; } } assertEquals ( STRING + java.lang.String + STRING , java.lang.StringBuilder . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.net.Socket java.net.Socket ) throws java.io.IOException { java.net.Socket . void ( NUMBER ) ; java.lang.String java.lang.String = STRING ; java.net.Socket . java.io.OutputStream ( ) . void ( ByteArrayStxEtxSerializer . STX ) ; java.net.Socket . java.io.OutputStream ( ) . void ( ( java.lang.String ) . byte[] ( ) ) ; java.net.Socket . java.io.OutputStream ( ) . void ( ByteArrayStxEtxSerializer . ETX ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; int int ; while ( true ) { int = java.net.Socket . java.io.InputStream ( ) . int ( ) ; if ( int == ByteArrayStxEtxSerializer . STX ) { continue; } if ( int == ByteArrayStxEtxSerializer . ETX ) { break; } java.lang.StringBuilder . java.lang.StringBuilder ( ( char ) int ) ; } assertEquals ( STRING + java.lang.String , java.lang.StringBuilder . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.net.Socket java.net.Socket ) throws java.io.IOException , java.lang.ClassNotFoundException { java.net.Socket . void ( NUMBER ) ; java.lang.String java.lang.String = STRING ; new java.io.ObjectOutputStream ( java.net.Socket . java.io.OutputStream ( ) ) . void ( java.lang.String ) ; java.lang.String java.lang.String = ( java.lang.String ) new java.io.ObjectInputStream ( java.net.Socket . java.io.InputStream ( ) ) . java.lang.Object ( ) ; assertEquals ( STRING + java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( org.springframework.integration.ip.tcp.TcpInboundGateway ) ; java.net.Socket java.net.Socket = javax.net.SocketFactory . javax.net.SocketFactory ( ) . java.net.Socket ( STRING , org.springframework.integration.ip.tcp.AbstractServerConnectionFactory . getPort ( ) ) ; void ( java.net.Socket ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.net.Socket java.net.Socket ) throws java.io.IOException { java.net.Socket . void ( NUMBER ) ; java.lang.String java.lang.String = STRING ; byte [] byte[] = new byte [ NUMBER ] ; byte[] [ NUMBER ] = ( byte ) java.lang.String . int ( ) ; java.net.Socket . java.io.OutputStream ( ) . void ( byte[] ) ; java.net.Socket . java.io.OutputStream ( ) . void ( ( java.lang.String ) . byte[] ( ) ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; int int ; int int = NUMBER ; int int = NUMBER ; while ( true ) { int = java.net.Socket . java.io.InputStream ( ) . int ( ) ; if ( int ++ < NUMBER ) { continue; } if ( int == NUMBER ) { int = int ; continue; } java.lang.StringBuilder . java.lang.StringBuilder ( ( char ) int ) ; if ( int - NUMBER >= int ) { break; } } assertEquals ( STRING + java.lang.String , java.lang.StringBuilder . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( TcpInboundGateway org.springframework.integration.ip.tcp.TcpInboundGateway ) throws java.lang.Exception { int int = NUMBER ; while ( ! org.springframework.integration.ip.tcp.TcpInboundGateway . isListening ( ) ) { java.lang.Thread . void ( NUMBER ) ; if ( int ++ > NUMBER ) { throw new java.lang.Exception ( STRING ) ; } } }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { if ( org.springframework.integration.ip.tcp.AbstractApplicationContext == null ) { org.springframework.integration.ip.tcp.AbstractApplicationContext = org.springframework.integration.ip.tcp.AbstractApplicationContext ; } }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { org.springframework.integration.ip.tcp.AbstractApplicationContext . close ( ) ; }  <METHOD_END>
