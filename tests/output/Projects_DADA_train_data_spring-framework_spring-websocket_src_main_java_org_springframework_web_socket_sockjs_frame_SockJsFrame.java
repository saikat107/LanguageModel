<METHOD_START> public void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; if ( STRING . boolean ( java.lang.String ) ) { this . org.springframework.web.socket.sockjs.frame.SockJsFrameType = SockJsFrameType . OPEN ; this . java.lang.String = java.lang.String ; } else if ( STRING . boolean ( java.lang.String ) ) { this . org.springframework.web.socket.sockjs.frame.SockJsFrameType = SockJsFrameType . HEARTBEAT ; this . java.lang.String = java.lang.String ; } else if ( java.lang.String . char ( NUMBER ) == 'a' ) { this . org.springframework.web.socket.sockjs.frame.SockJsFrameType = SockJsFrameType . MESSAGE ; this . java.lang.String = ( java.lang.String . int ( ) > NUMBER ? java.lang.String : STRING ) ; } else if ( java.lang.String . char ( NUMBER ) == 'm' ) { this . org.springframework.web.socket.sockjs.frame.SockJsFrameType = SockJsFrameType . MESSAGE ; this . java.lang.String = ( java.lang.String . int ( ) > NUMBER ? java.lang.String : STRING ) ; } else if ( java.lang.String . char ( NUMBER ) == 'c' ) { this . org.springframework.web.socket.sockjs.frame.SockJsFrameType = SockJsFrameType . CLOSE ; this . java.lang.String = ( java.lang.String . int ( ) > NUMBER ? java.lang.String : STRING ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.web.socket.sockjs.frame.SockJsFrameType org.springframework.web.socket.sockjs.frame.SockJsFrameType ( ) { return this . org.springframework.web.socket.sockjs.frame.SockJsFrameType ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public byte [] byte[] ( ) { return this . java.lang.String . byte[] ( java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( org.springframework.web.socket.sockjs.frame.SockJsFrameType ( ) == SockJsFrameType . OPEN || org.springframework.web.socket.sockjs.frame.SockJsFrameType ( ) == SockJsFrameType . HEARTBEAT ) { return null ; } else { return java.lang.String ( ) . java.lang.String ( NUMBER ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.web.socket.sockjs.frame.SockJsFrame ) ) { return false ; } org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame = ( org.springframework.web.socket.sockjs.frame.SockJsFrame ) java.lang.Object ; return ( this . org.springframework.web.socket.sockjs.frame.SockJsFrameType . equals ( org.springframework.web.socket.sockjs.frame.SockJsFrame . org.springframework.web.socket.sockjs.frame.SockJsFrameType ) && this . java.lang.String . boolean ( org.springframework.web.socket.sockjs.frame.SockJsFrame . java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.String . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.lang.String java.lang.String = this . java.lang.String ; if ( java.lang.String . int ( ) > NUMBER ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER , NUMBER ) + STRING ; } return STRING + java.lang.String . java.lang.String ( STRING , STRING ) . java.lang.String ( STRING , STRING ) + STRING ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame ( ) { return org.springframework.web.socket.sockjs.frame.SockJsFrame ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame ( ) { return org.springframework.web.socket.sockjs.frame.SockJsFrame ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame ( SockJsMessageCodec org.springframework.web.socket.sockjs.frame.SockJsMessageCodec , java.lang.String ... java.lang.String[] ) { java.lang.String java.lang.String = org.springframework.web.socket.sockjs.frame.SockJsMessageCodec . encode ( java.lang.String[] ) ; return new org.springframework.web.socket.sockjs.frame.SockJsFrame ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame ( ) { return org.springframework.web.socket.sockjs.frame.SockJsFrame ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame ( ) { return org.springframework.web.socket.sockjs.frame.SockJsFrame ; }  <METHOD_END>
<METHOD_START> public static org.springframework.web.socket.sockjs.frame.SockJsFrame org.springframework.web.socket.sockjs.frame.SockJsFrame ( int int , java.lang.String java.lang.String ) { return new org.springframework.web.socket.sockjs.frame.SockJsFrame ( STRING + int + STRING + java.lang.String + STRING ) ; }  <METHOD_END>