<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.tunnel.server.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.tunnel.server.ExpectedException . expectMessage ( STRING ) ; new HttpTunnelServerHandler ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { HttpTunnelServer org.springframework.boot.devtools.tunnel.server.HttpTunnelServer = mock ( HttpTunnelServer .class ) ; HttpTunnelServerHandler org.springframework.boot.devtools.tunnel.server.HttpTunnelServerHandler = new HttpTunnelServerHandler ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer ) ; ServerHttpRequest org.springframework.boot.devtools.tunnel.server.ServerHttpRequest = mock ( ServerHttpRequest .class ) ; ServerHttpResponse org.springframework.boot.devtools.tunnel.server.ServerHttpResponse = mock ( ServerHttpResponse .class ) ; org.springframework.boot.devtools.tunnel.server.HttpTunnelServerHandler . handle ( org.springframework.boot.devtools.tunnel.server.ServerHttpRequest , org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ) ; verify ( org.springframework.boot.devtools.tunnel.server.HttpTunnelServer ) . handle ( org.springframework.boot.devtools.tunnel.server.ServerHttpRequest , org.springframework.boot.devtools.tunnel.server.ServerHttpResponse ) ; }  <METHOD_END>