<METHOD_START> @ java.lang.Override public void void ( JettyServletWebServerFactory org.springframework.boot.autoconfigure.websocket.JettyServletWebServerFactory ) { org.springframework.boot.autoconfigure.websocket.JettyServletWebServerFactory . addConfigurations ( new AbstractConfiguration ( ) { @ java.lang.Override public void void ( WebAppContext org.springframework.boot.autoconfigure.websocket.WebAppContext ) throws java.lang.Exception { ServerContainer org.springframework.boot.autoconfigure.websocket.ServerContainer = WebSocketServerContainerInitializer . configureContext ( org.springframework.boot.autoconfigure.websocket.WebAppContext ) ; ShutdownThread . deregister ( org.springframework.boot.autoconfigure.websocket.ServerContainer ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebAppContext org.springframework.boot.autoconfigure.websocket.WebAppContext ) throws java.lang.Exception { ServerContainer org.springframework.boot.autoconfigure.websocket.ServerContainer = WebSocketServerContainerInitializer . configureContext ( org.springframework.boot.autoconfigure.websocket.WebAppContext ) ; ShutdownThread . deregister ( org.springframework.boot.autoconfigure.websocket.ServerContainer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
