<METHOD_START> @ java.lang.Override public void void ( CloseReason org.springframework.web.socket.server.standard.CloseReason ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.socket.server.standard.HttpServletRequest , HttpServletResponse org.springframework.web.socket.server.standard.HttpServletResponse , UpgradeInfo org.springframework.web.socket.server.standard.UpgradeInfo , TyrusUpgradeResponse org.springframework.web.socket.server.standard.TyrusUpgradeResponse ) throws java.io.IOException , org.springframework.web.socket.server.standard.ServletException { org.springframework.web.socket.server.standard.HttpServletResponse . setStatus ( org.springframework.web.socket.server.standard.TyrusUpgradeResponse . getStatus ( ) ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> : org.springframework.web.socket.server.standard.TyrusUpgradeResponse . getHeaders ( ) . entrySet ( ) ) { org.springframework.web.socket.server.standard.HttpServletResponse . addHeader ( java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> . java.lang.String ( ) , Utils . getHeaderFromList ( java.util.Map.Entry<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( ) ) ) ; } AsyncContext org.springframework.web.socket.server.standard.AsyncContext = org.springframework.web.socket.server.standard.HttpServletRequest . startAsync ( ) ; org.springframework.web.socket.server.standard.AsyncContext . setTimeout ( - NUMBER ) ; java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.web.socket.server.standard.HttpServletRequest ) ; BeanWrapper org.springframework.web.socket.server.standard.BeanWrapper = new BeanWrapperImpl ( java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.web.socket.server.standard.BeanWrapper . getPropertyValue ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.web.socket.server.standard.WebLogicRequestUpgradeStrategy.TyrusMuxableWebSocketHelper . java.lang.Object ( org.springframework.web.socket.server.standard.HttpServletRequest , java.lang.Object ) ; org.springframework.web.socket.server.standard.WebLogicRequestUpgradeStrategy.TyrusMuxableWebSocketHelper . void ( java.lang.Object , java.lang.Object , org.springframework.web.socket.server.standard.HttpServletRequest . getServletContext ( ) ) ; org.springframework.web.socket.server.standard.HttpServletResponse . flushBuffer ( ) ; boolean boolean = org.springframework.web.socket.server.standard.HttpServletRequest . getUserPrincipal ( ) != null ; Writer org.springframework.web.socket.server.standard.Writer = org.springframework.web.socket.server.standard.WebLogicRequestUpgradeStrategy.WebLogicServletWriterHelper . org.springframework.web.socket.server.standard.Writer ( java.lang.Object , boolean ) ; Connection org.springframework.web.socket.server.standard.Connection = org.springframework.web.socket.server.standard.UpgradeInfo . createConnection ( org.springframework.web.socket.server.standard.Writer , Connection.CloseListener ) ; new BeanWrapperImpl ( java.lang.Object ) . setPropertyValue ( STRING , org.springframework.web.socket.server.standard.Connection ) ; new BeanWrapperImpl ( org.springframework.web.socket.server.standard.Writer ) . setPropertyValue ( STRING , org.springframework.web.socket.server.standard.Connection ) ; org.springframework.web.socket.server.standard.WebLogicRequestUpgradeStrategy.TyrusMuxableWebSocketHelper . void ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.String java.lang.String ) throws java.lang.ClassNotFoundException { return org.springframework.web.socket.server.standard.WebLogicRequestUpgradeStrategy .class . java.lang.ClassLoader ( ) . java.lang.Class<?> ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.reflect.Method java.lang.reflect.Method ( java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] )			throws java.lang.ClassNotFoundException , java.lang.NoSuchMethodException { return java.lang.Class<?> ( java.lang.String ) . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Object java.lang.Object ( ServletRequest org.springframework.web.socket.server.standard.ServletRequest ) { while ( org.springframework.web.socket.server.standard.ServletRequest instanceof ServletRequestWrapper ) { org.springframework.web.socket.server.standard.ServletRequest = ( ( ServletRequestWrapper ) org.springframework.web.socket.server.standard.ServletRequest ) . getRequest ( ) ; } return org.springframework.web.socket.server.standard.ServletRequest ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( HttpServletRequest org.springframework.web.socket.server.standard.HttpServletRequest , java.lang.Object java.lang.Object ) { try { java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { java.lang.Object , null , org.springframework.web.socket.server.standard.WebLogicRequestUpgradeStrategy.SubjectHelper . java.lang.Object ( org.springframework.web.socket.server.standard.HttpServletRequest ) } ; return java.lang.reflect.Constructor<> . newInstance ( java.lang.Object[] ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , ServletContext org.springframework.web.socket.server.standard.ServletContext ) { try { java.lang.reflect.Method . java.lang.Object ( java.lang.Object , java.lang.Object , org.springframework.web.socket.server.standard.ServletContext ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object ) { try { java.lang.reflect.Method . java.lang.Object ( java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public void ( ) { try { java.lang.String java.lang.String = STRING ; java.lang.reflect.Method = java.lang.reflect.Method ( java.lang.String , STRING ) ; java.lang.String = STRING ; java.lang.reflect.Method = java.lang.reflect.Method ( java.lang.String , STRING , java.lang.Class<?> ( STRING ) , HttpServletRequest .class ) ; java.lang.String = STRING ; java.lang.reflect.Method = java.lang.reflect.Method ( java.lang.String , STRING ) ; java.lang.reflect.Method = java.lang.reflect.Method . java.lang.Class<?> ( ) . java.lang.reflect.Method ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( HttpServletRequest org.springframework.web.socket.server.standard.HttpServletRequest ) { try { ServletContext org.springframework.web.socket.server.standard.ServletContext = org.springframework.web.socket.server.standard.HttpServletRequest . getServletContext ( ) ; java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( org.springframework.web.socket.server.standard.ServletContext ) ; java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( null , java.lang.Object , org.springframework.web.socket.server.standard.HttpServletRequest ) ; if ( java.lang.Object == null ) { java.lang.Object java.lang.Object = java.lang.reflect.Method . java.lang.Object ( null ) ; java.lang.Object = java.lang.reflect.Method . java.lang.Object ( java.lang.Object ) ; } return java.lang.Object ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.web.socket.server.standard.Writer org.springframework.web.socket.server.standard.Writer ( java.lang.Object java.lang.Object , boolean boolean ) { try { return ( Writer ) java.lang.reflect.Constructor<> . newInstance ( java.lang.Object , null , boolean ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new HandshakeFailureException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
