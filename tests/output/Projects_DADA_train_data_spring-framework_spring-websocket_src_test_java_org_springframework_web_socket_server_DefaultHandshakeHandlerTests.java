<METHOD_START> @ Before public void void ( ) java.lang.Exception { MockitoAnnotations . initMocks ( this ) ; this . org.springframework.web.socket.server.DefaultHandshakeHandler = new DefaultHandshakeHandler ( this . org.springframework.web.socket.server.RequestUpgradeStrategy ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.socket.server.DefaultHandshakeHandler . setSupportedProtocols ( STRING , STRING ) ; given ( this . org.springframework.web.socket.server.RequestUpgradeStrategy . getSupportedVersions ( ) ) . willReturn ( new java.lang.String [] { STRING } ) ; this . servletRequest . setMethod ( STRING ) ; WebSocketHttpHeaders org.springframework.web.socket.server.WebSocketHttpHeaders = new WebSocketHttpHeaders ( this . request . getHeaders ( ) ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setUpgrade ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setConnection ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketVersion ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketKey ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketProtocol ( STRING ) ; WebSocketHandler org.springframework.web.socket.server.WebSocketHandler = new TextWebSocketHandler ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ; this . org.springframework.web.socket.server.DefaultHandshakeHandler . doHandshake ( this . request , this . response , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; verify ( this . org.springframework.web.socket.server.RequestUpgradeStrategy ) . upgrade ( this . request , this . response , STRING , java.util.Collections .< WebSocketExtension > java.util.List<org.springframework.web.socket.server.WebSocketExtension> ( ) , null , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebSocketExtension org.springframework.web.socket.server.WebSocketExtension = new WebSocketExtension ( STRING ) ; WebSocketExtension org.springframework.web.socket.server.WebSocketExtension = new WebSocketExtension ( STRING ) ; given ( this . org.springframework.web.socket.server.RequestUpgradeStrategy . getSupportedVersions ( ) ) . willReturn ( new java.lang.String [] { STRING } ) ; given ( this . org.springframework.web.socket.server.RequestUpgradeStrategy . getSupportedExtensions ( this . request ) ) . willReturn ( java.util.Arrays . java.util.List ( org.springframework.web.socket.server.WebSocketExtension ) ) ; this . servletRequest . setMethod ( STRING ) ; WebSocketHttpHeaders org.springframework.web.socket.server.WebSocketHttpHeaders = new WebSocketHttpHeaders ( this . request . getHeaders ( ) ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setUpgrade ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setConnection ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketVersion ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketKey ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketExtensions ( java.util.Arrays . java.util.List ( org.springframework.web.socket.server.WebSocketExtension , org.springframework.web.socket.server.WebSocketExtension ) ) ; WebSocketHandler org.springframework.web.socket.server.WebSocketHandler = new TextWebSocketHandler ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ; this . org.springframework.web.socket.server.DefaultHandshakeHandler . doHandshake ( this . request , this . response , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; verify ( this . org.springframework.web.socket.server.RequestUpgradeStrategy ) . upgrade ( this . request , this . response , null , java.util.Arrays . java.util.List ( org.springframework.web.socket.server.WebSocketExtension ) , null , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.web.socket.server.RequestUpgradeStrategy . getSupportedVersions ( ) ) . willReturn ( new java.lang.String [] { STRING } ) ; this . servletRequest . setMethod ( STRING ) ; WebSocketHttpHeaders org.springframework.web.socket.server.WebSocketHttpHeaders = new WebSocketHttpHeaders ( this . request . getHeaders ( ) ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setUpgrade ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setConnection ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketVersion ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketKey ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketProtocol ( STRING ) ; WebSocketHandler org.springframework.web.socket.server.WebSocketHandler = new org.springframework.web.socket.server.DefaultHandshakeHandlerTests.SubProtocolCapableHandler ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ; this . org.springframework.web.socket.server.DefaultHandshakeHandler . doHandshake ( this . request , this . response , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; verify ( this . org.springframework.web.socket.server.RequestUpgradeStrategy ) . upgrade ( this . request , this . response , STRING , java.util.Collections .< WebSocketExtension > java.util.List<org.springframework.web.socket.server.WebSocketExtension> ( ) , null , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.web.socket.server.RequestUpgradeStrategy . getSupportedVersions ( ) ) . willReturn ( new java.lang.String [] { STRING } ) ; this . servletRequest . setMethod ( STRING ) ; WebSocketHttpHeaders org.springframework.web.socket.server.WebSocketHttpHeaders = new WebSocketHttpHeaders ( this . request . getHeaders ( ) ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setUpgrade ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setConnection ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketVersion ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketKey ( STRING ) ; org.springframework.web.socket.server.WebSocketHttpHeaders . setSecWebSocketProtocol ( STRING ) ; WebSocketHandler org.springframework.web.socket.server.WebSocketHandler = new org.springframework.web.socket.server.DefaultHandshakeHandlerTests.SubProtocolCapableHandler ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ; this . org.springframework.web.socket.server.DefaultHandshakeHandler . doHandshake ( this . request , this . response , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; verify ( this . org.springframework.web.socket.server.RequestUpgradeStrategy ) . upgrade ( this . request , this . response , null , java.util.Collections .< WebSocketExtension > java.util.List<org.springframework.web.socket.server.WebSocketExtension> ( ) , null , org.springframework.web.socket.server.WebSocketHandler , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.String ... java.lang.String[] ) { this . java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
