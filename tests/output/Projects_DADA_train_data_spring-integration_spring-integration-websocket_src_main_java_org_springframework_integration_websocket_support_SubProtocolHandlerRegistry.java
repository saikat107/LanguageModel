<METHOD_START> public void ( java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> < SubProtocolHandler > java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> ) { this( java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> , null ); }  <METHOD_END>
<METHOD_START> public void ( SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler ) { this( null , org.springframework.integration.websocket.support.SubProtocolHandler ); }  <METHOD_END>
<METHOD_START> public void ( java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> < SubProtocolHandler > java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> , SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler ) { Assert . state ( ! CollectionUtils . isEmpty ( java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> ) || org.springframework.integration.websocket.support.SubProtocolHandler != null , STRING ) ; if ( ! CollectionUtils . isEmpty ( java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> ) ) { for ( SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler : java.util.List<org.springframework.integration.websocket.support.SubProtocolHandler> ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.integration.websocket.support.SubProtocolHandler . getSupportedProtocols ( ) ; if ( CollectionUtils . isEmpty ( java.util.List<java.lang.String> ) ) { org.springframework.integration.websocket.support.Log . warn ( STRING + org.springframework.integration.websocket.support.SubProtocolHandler ) ; continue; } for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler = this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . put ( java.lang.String , org.springframework.integration.websocket.support.SubProtocolHandler ) ; if ( org.springframework.integration.websocket.support.SubProtocolHandler != null ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.integration.websocket.support.SubProtocolHandler + STRING + java.lang.String + STRING + org.springframework.integration.websocket.support.SubProtocolHandler ) ; } } } } if ( this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . size ( ) == NUMBER && org.springframework.integration.websocket.support.SubProtocolHandler == null ) { this . org.springframework.integration.websocket.support.SubProtocolHandler = this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . values ( ) . iterator ( ) . next ( ) ; } else { this . org.springframework.integration.websocket.support.SubProtocolHandler = org.springframework.integration.websocket.support.SubProtocolHandler ; if ( this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . isEmpty ( ) && this . org.springframework.integration.websocket.support.SubProtocolHandler != null ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = this . org.springframework.integration.websocket.support.SubProtocolHandler . getSupportedProtocols ( ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler = this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . put ( java.lang.String , this . org.springframework.integration.websocket.support.SubProtocolHandler ) ; if ( org.springframework.integration.websocket.support.SubProtocolHandler != null ) { throw new java.lang.IllegalStateException ( STRING + this . org.springframework.integration.websocket.support.SubProtocolHandler + STRING + java.lang.String + STRING + org.springframework.integration.websocket.support.SubProtocolHandler ) ; } } } } }  <METHOD_END>
<METHOD_START> public org.springframework.integration.websocket.support.SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler ( WebSocketSession org.springframework.integration.websocket.support.WebSocketSession ) { SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler ; java.lang.String java.lang.String = org.springframework.integration.websocket.support.WebSocketSession . getAcceptedProtocol ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.websocket.support.SubProtocolHandler = this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . get ( java.lang.String ) ; Assert . state ( org.springframework.integration.websocket.support.SubProtocolHandler != null , STRING + java.lang.String + STRING + this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> ) ; } else { org.springframework.integration.websocket.support.SubProtocolHandler = this . org.springframework.integration.websocket.support.SubProtocolHandler ; Assert . state ( org.springframework.integration.websocket.support.SubProtocolHandler != null , STRING ) ; } return org.springframework.integration.websocket.support.SubProtocolHandler ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( Message < ? > org.springframework.integration.websocket.support.Message<?> ) { for ( SubProtocolHandler org.springframework.integration.websocket.support.SubProtocolHandler : this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . values ( ) ) { java.lang.String java.lang.String = org.springframework.integration.websocket.support.SubProtocolHandler . resolveSessionId ( org.springframework.integration.websocket.support.Message<> ) ; if ( java.lang.String != null ) { return java.lang.String ; } } if ( this . org.springframework.integration.websocket.support.SubProtocolHandler != null ) { java.lang.String java.lang.String = this . org.springframework.integration.websocket.support.SubProtocolHandler . resolveSessionId ( org.springframework.integration.websocket.support.Message<> ) ; if ( java.lang.String != null ) { return java.lang.String ; } } return null ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return new java.util.ArrayList<java.lang.String> < java.lang.String > ( this . java.util.Map<java.lang.String,org.springframework.integration.websocket.support.SubProtocolHandler> . keySet ( ) ) ; }  <METHOD_END>
