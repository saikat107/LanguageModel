<METHOD_START> public void ( java.lang.String java.lang.String , int int ) { super( java.lang.String , int ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.io.IOException { super. checkActive ( ) ; int int = NUMBER ; while ( this . java.nio.channels.Selector == null ) { try { java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } if ( int ++ > NUMBER ) { throw new java.io.IOException ( STRING ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.ip.tcp.connection.TcpConnectionSupport org.springframework.integration.ip.tcp.connection.TcpConnectionSupport ( ) java.lang.Exception { java.nio.channels.SocketChannel java.nio.channels.SocketChannel = java.nio.channels.SocketChannel . java.nio.channels.SocketChannel ( new java.net.InetSocketAddress ( this . getHost ( ) , this . getPort ( ) ) ) ; setSocketAttributes ( java.nio.channels.SocketChannel . java.net.Socket ( ) ) ; TcpNioConnection org.springframework.integration.ip.tcp.connection.TcpNioConnection = this . org.springframework.integration.ip.tcp.connection.TcpNioConnectionSupport . createNewConnection ( java.nio.channels.SocketChannel , false , this . isLookupHost ( ) , this . getApplicationEventPublisher ( ) , this . getComponentName ( ) ) ; org.springframework.integration.ip.tcp.connection.TcpNioConnection . setUsingDirectBuffers ( this . boolean ) ; org.springframework.integration.ip.tcp.connection.TcpNioConnection . setTaskExecutor ( this . getTaskExecutor ( ) ) ; if ( getSslHandshakeTimeout ( ) != null && org.springframework.integration.ip.tcp.connection.TcpNioConnection instanceof TcpNioSSLConnection ) { ( ( TcpNioSSLConnection ) org.springframework.integration.ip.tcp.connection.TcpNioConnection ) . setHandshakeTimeout ( getSslHandshakeTimeout ( ) ) ; } TcpConnectionSupport org.springframework.integration.ip.tcp.connection.TcpConnectionSupport = wrapConnection ( org.springframework.integration.ip.tcp.connection.TcpNioConnection ) ; initializeConnection ( org.springframework.integration.ip.tcp.connection.TcpConnectionSupport , java.nio.channels.SocketChannel . java.net.Socket ( ) ) ; java.nio.channels.SocketChannel . java.nio.channels.SelectableChannel ( false ) ; if ( this . getSoTimeout ( ) > NUMBER ) { org.springframework.integration.ip.tcp.connection.TcpNioConnection . setLastRead ( java.lang.System . long ( ) ) ; } this . java.util.Map<java.nio.channels.SocketChannel,org.springframework.integration.ip.tcp.connection.TcpNioConnection> . put ( java.nio.channels.SocketChannel , org.springframework.integration.ip.tcp.connection.TcpNioConnection ) ; this . java.util.concurrent.BlockingQueue<java.nio.channels.SocketChannel> . boolean ( java.nio.channels.SocketChannel ) ; this . java.nio.channels.Selector . java.nio.channels.Selector ( ) ; return org.springframework.integration.ip.tcp.connection.TcpConnectionSupport ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( TcpNioConnectionSupport org.springframework.integration.ip.tcp.connection.TcpNioConnectionSupport ) { Assert . notNull ( org.springframework.integration.ip.tcp.connection.TcpNioConnectionSupport , STRING ) ; this . org.springframework.integration.ip.tcp.connection.TcpNioConnectionSupport = org.springframework.integration.ip.tcp.connection.TcpNioConnectionSupport ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . java.nio.channels.Selector != null ) { try { this . java.nio.channels.Selector . void ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { logger . error ( STRING , java.lang.Exception ) ; } } super. stop ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { synchronized ( this . lifecycleMonitor ) { if ( ! this . isActive ( ) ) { this . setActive ( true ) ; this . getTaskExecutor ( ) . execute ( this ) ; } } super. start ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . getHost ( ) + STRING + this . getPort ( ) ) ; } try { this . java.nio.channels.Selector = java.nio.channels.Selector . java.nio.channels.Selector ( ) ; while ( this . isActive ( ) ) { java.nio.channels.SocketChannel java.nio.channels.SocketChannel ; int int = this . getSoTimeout ( ) ; int int = NUMBER ; try { long long = int < NUMBER ? NUMBER : int ; if ( getDelayedReads ( ) . size ( ) > NUMBER && ( long == NUMBER || getReadDelay ( ) < long ) ) { long = getReadDelay ( ) ; } int = this . java.nio.channels.Selector . int ( long ) ; } catch ( java.nio.channels.CancelledKeyException java.nio.channels.CancelledKeyException ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } } while ( ( java.nio.channels.SocketChannel = this . java.util.concurrent.BlockingQueue<java.nio.channels.SocketChannel> . java.nio.channels.SocketChannel ( ) ) != null ) { try { java.nio.channels.SocketChannel . java.nio.channels.SelectionKey ( this . java.nio.channels.Selector , java.nio.channels.SelectionKey . int , this . java.util.Map<java.nio.channels.SocketChannel,org.springframework.integration.ip.tcp.connection.TcpNioConnection> . get ( java.nio.channels.SocketChannel ) ) ; } catch ( java.nio.channels.ClosedChannelException java.nio.channels.ClosedChannelException ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } } } this . processNioSelections ( int , this . java.nio.channels.Selector , null , this . java.util.Map<java.nio.channels.SocketChannel,org.springframework.integration.ip.tcp.connection.TcpNioConnection> ) ; } } catch ( java.nio.channels.ClosedSelectorException java.nio.channels.ClosedSelectorException ) { if ( this . isActive ( ) ) { logger . error ( STRING , java.nio.channels.ClosedSelectorException ) ; } } catch ( java.lang.Exception java.lang.Exception ) { logger . error ( STRING , java.lang.Exception ) ; this . setActive ( false ) ; } if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . getHost ( ) + STRING + this . getPort ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.nio.channels.SocketChannel,org.springframework.integration.ip.tcp.connection.TcpNioConnection> < java.nio.channels.SocketChannel , TcpNioConnection > java.util.Map<java.nio.channels.SocketChannel,org.springframework.integration.ip.tcp.connection.TcpNioConnection> ( ) { return this . java.util.Map<java.nio.channels.SocketChannel,org.springframework.integration.ip.tcp.connection.TcpNioConnection> ; }  <METHOD_END>
<METHOD_START> protected java.util.concurrent.BlockingQueue<java.nio.channels.SocketChannel> < java.nio.channels.SocketChannel > java.util.concurrent.BlockingQueue<java.nio.channels.SocketChannel> ( ) { return this . java.util.concurrent.BlockingQueue<java.nio.channels.SocketChannel> ; }  <METHOD_END>
