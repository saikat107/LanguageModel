<METHOD_START> public void ( java.lang.String java.lang.String , int int ) { super( int ); this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int , boolean boolean ) { super( int , boolean ); this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public synchronized java.net.DatagramSocket java.net.DatagramSocket ( ) { if ( getTheSocket ( ) == null ) { try { int int = getPort ( ) ; java.net.MulticastSocket java.net.MulticastSocket = int == NUMBER ? new java.net.MulticastSocket ( ) : new java.net.MulticastSocket ( int ) ; java.lang.String java.lang.String = this . getLocalAddress ( ) ; if ( java.lang.String != null ) { java.net.InetAddress java.net.InetAddress = java.net.InetAddress . java.net.InetAddress ( java.lang.String ) ; java.net.MulticastSocket . void ( java.net.InetAddress ) ; } setSocketAttributes ( java.net.MulticastSocket ) ; java.net.MulticastSocket . void ( java.net.InetAddress . java.net.InetAddress ( this . java.lang.String ) ) ; setSocket ( java.net.MulticastSocket ) ; } catch ( java.io.IOException java.io.IOException ) { throw new MessagingException ( STRING , java.io.IOException ) ; } } return super. getSocket ( ) ; }  <METHOD_END>
