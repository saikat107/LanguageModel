<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { TestPrincipal org.springframework.web.socket.adapter.standard.TestPrincipal = new TestPrincipal ( STRING ) ; StandardWebSocketSession org.springframework.web.socket.adapter.standard.StandardWebSocketSession = new StandardWebSocketSession ( this . org.springframework.web.socket.adapter.standard.HttpHeaders , this . java.util.Map<java.lang.String,java.lang.Object> , null , null , org.springframework.web.socket.adapter.standard.TestPrincipal ) ; assertSame ( org.springframework.web.socket.adapter.standard.TestPrincipal , org.springframework.web.socket.adapter.standard.StandardWebSocketSession . getPrincipal ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { TestPrincipal org.springframework.web.socket.adapter.standard.TestPrincipal = new TestPrincipal ( STRING ) ; Session org.springframework.web.socket.adapter.standard.Session = Mockito . mock ( Session .class ) ; given ( org.springframework.web.socket.adapter.standard.Session . getUserPrincipal ( ) ) . willReturn ( org.springframework.web.socket.adapter.standard.TestPrincipal ) ; StandardWebSocketSession org.springframework.web.socket.adapter.standard.StandardWebSocketSession = new StandardWebSocketSession ( this . org.springframework.web.socket.adapter.standard.HttpHeaders , this . java.util.Map<java.lang.String,java.lang.Object> , null , null ) ; org.springframework.web.socket.adapter.standard.StandardWebSocketSession . initializeNativeSession ( org.springframework.web.socket.adapter.standard.Session ) ; assertSame ( org.springframework.web.socket.adapter.standard.TestPrincipal , org.springframework.web.socket.adapter.standard.StandardWebSocketSession . getPrincipal ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { Session org.springframework.web.socket.adapter.standard.Session = Mockito . mock ( Session .class ) ; given ( org.springframework.web.socket.adapter.standard.Session . getUserPrincipal ( ) ) . willReturn ( null ) ; StandardWebSocketSession org.springframework.web.socket.adapter.standard.StandardWebSocketSession = new StandardWebSocketSession ( this . org.springframework.web.socket.adapter.standard.HttpHeaders , this . java.util.Map<java.lang.String,java.lang.Object> , null , null ) ; org.springframework.web.socket.adapter.standard.StandardWebSocketSession . initializeNativeSession ( org.springframework.web.socket.adapter.standard.Session ) ; reset ( org.springframework.web.socket.adapter.standard.Session ) ; assertNull ( org.springframework.web.socket.adapter.standard.StandardWebSocketSession . getPrincipal ( ) ) ; verifyNoMoreInteractions ( org.springframework.web.socket.adapter.standard.Session ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { java.lang.String java.lang.String = STRING ; Session org.springframework.web.socket.adapter.standard.Session = Mockito . mock ( Session .class ) ; given ( org.springframework.web.socket.adapter.standard.Session . getNegotiatedSubprotocol ( ) ) . willReturn ( java.lang.String ) ; StandardWebSocketSession org.springframework.web.socket.adapter.standard.StandardWebSocketSession = new StandardWebSocketSession ( this . org.springframework.web.socket.adapter.standard.HttpHeaders , this . java.util.Map<java.lang.String,java.lang.Object> , null , null ) ; org.springframework.web.socket.adapter.standard.StandardWebSocketSession . initializeNativeSession ( org.springframework.web.socket.adapter.standard.Session ) ; reset ( org.springframework.web.socket.adapter.standard.Session ) ; assertEquals ( java.lang.String , org.springframework.web.socket.adapter.standard.StandardWebSocketSession . getAcceptedProtocol ( ) ) ; verifyNoMoreInteractions ( org.springframework.web.socket.adapter.standard.Session ) ; }  <METHOD_END>