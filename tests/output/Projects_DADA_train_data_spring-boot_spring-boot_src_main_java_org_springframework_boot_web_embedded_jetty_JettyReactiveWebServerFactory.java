<METHOD_START> public void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void ( int int ) { super( int ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.web.embedded.jetty.WebServer org.springframework.boot.web.embedded.jetty.WebServer ( HttpHandler org.springframework.boot.web.embedded.jetty.HttpHandler ) { JettyHttpHandlerAdapter org.springframework.boot.web.embedded.jetty.JettyHttpHandlerAdapter = new JettyHttpHandlerAdapter ( org.springframework.boot.web.embedded.jetty.HttpHandler ) ; Server org.springframework.boot.web.embedded.jetty.Server = org.springframework.boot.web.embedded.jetty.Server ( org.springframework.boot.web.embedded.jetty.JettyHttpHandlerAdapter ) ; return new JettyWebServer ( org.springframework.boot.web.embedded.jetty.Server , getPort ( ) >= NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.web.embedded.jetty.Server org.springframework.boot.web.embedded.jetty.Server ( JettyHttpHandlerAdapter org.springframework.boot.web.embedded.jetty.JettyHttpHandlerAdapter ) { int int = ( getPort ( ) >= NUMBER ? getPort ( ) : NUMBER ) ; java.net.InetSocketAddress java.net.InetSocketAddress = new java.net.InetSocketAddress ( getAddress ( ) , int ) ; Server org.springframework.boot.web.embedded.jetty.Server = new Server ( org.springframework.boot.web.embedded.jetty.ThreadPool ( ) ) ; org.springframework.boot.web.embedded.jetty.Server . addConnector ( org.springframework.boot.web.embedded.jetty.AbstractConnector ( java.net.InetSocketAddress , org.springframework.boot.web.embedded.jetty.Server ) ) ; ServletHolder org.springframework.boot.web.embedded.jetty.ServletHolder = new ServletHolder ( org.springframework.boot.web.embedded.jetty.JettyHttpHandlerAdapter ) ; ServletContextHandler org.springframework.boot.web.embedded.jetty.ServletContextHandler = new ServletContextHandler ( org.springframework.boot.web.embedded.jetty.Server , STRING , false , false ) ; org.springframework.boot.web.embedded.jetty.ServletContextHandler . addServlet ( org.springframework.boot.web.embedded.jetty.ServletHolder , STRING ) ; org.springframework.boot.web.embedded.jetty.JettyReactiveWebServerFactory . org.springframework.boot.web.embedded.jetty.Log . info ( STRING + int ) ; return org.springframework.boot.web.embedded.jetty.Server ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.AbstractConnector org.springframework.boot.web.embedded.jetty.AbstractConnector ( java.net.InetSocketAddress java.net.InetSocketAddress , Server org.springframework.boot.web.embedded.jetty.Server ) { ServerConnector org.springframework.boot.web.embedded.jetty.ServerConnector = new ServerConnector ( org.springframework.boot.web.embedded.jetty.Server , this . int , this . int ) ; org.springframework.boot.web.embedded.jetty.ServerConnector . setHost ( java.net.InetSocketAddress . java.lang.String ( ) ) ; org.springframework.boot.web.embedded.jetty.ServerConnector . setPort ( java.net.InetSocketAddress . int ( ) ) ; for ( ConnectionFactory org.springframework.boot.web.embedded.jetty.ConnectionFactory : org.springframework.boot.web.embedded.jetty.ServerConnector . getConnectionFactories ( ) ) { if ( org.springframework.boot.web.embedded.jetty.ConnectionFactory instanceof HttpConfiguration . HttpConfiguration ) { ( ( HttpConfiguration . HttpConfiguration ) org.springframework.boot.web.embedded.jetty.ConnectionFactory ) . getHttpConfiguration ( ) . setSendServerVersion ( false ) ; } } return org.springframework.boot.web.embedded.jetty.ServerConnector ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.web.embedded.jetty.ThreadPool org.springframework.boot.web.embedded.jetty.ThreadPool ( ) { return this . org.springframework.boot.web.embedded.jetty.ThreadPool ; }  <METHOD_END>
<METHOD_START> public void void ( ThreadPool org.springframework.boot.web.embedded.jetty.ThreadPool ) { this . org.springframework.boot.web.embedded.jetty.ThreadPool = org.springframework.boot.web.embedded.jetty.ThreadPool ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
