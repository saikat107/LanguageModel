<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( java.rmi.server.RMIClientSocketFactory java.rmi.server.RMIClientSocketFactory ) { this . java.rmi.server.RMIClientSocketFactory = java.rmi.server.RMIClientSocketFactory ; }  <METHOD_END>
<METHOD_START> public void void ( java.rmi.server.RMIServerSocketFactory java.rmi.server.RMIServerSocketFactory ) { this . java.rmi.server.RMIServerSocketFactory = java.rmi.server.RMIServerSocketFactory ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( this . java.rmi.server.RMIClientSocketFactory instanceof java.rmi.server.RMIServerSocketFactory ) { this . java.rmi.server.RMIServerSocketFactory = ( java.rmi.server.RMIServerSocketFactory ) this . java.rmi.server.RMIClientSocketFactory ; } if ( ( this . java.rmi.server.RMIClientSocketFactory != null && this . java.rmi.server.RMIServerSocketFactory == null ) || ( this . java.rmi.server.RMIClientSocketFactory == null && this . java.rmi.server.RMIServerSocketFactory != null ) ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . java.rmi.registry.Registry = java.rmi.registry.Registry ( this . java.lang.String , this . int , this . java.rmi.server.RMIClientSocketFactory , this . java.rmi.server.RMIServerSocketFactory ) ; }  <METHOD_END>
<METHOD_START> protected java.rmi.registry.Registry java.rmi.registry.Registry ( java.lang.String java.lang.String , int int , java.rmi.server.RMIClientSocketFactory java.rmi.server.RMIClientSocketFactory , java.rmi.server.RMIServerSocketFactory java.rmi.server.RMIServerSocketFactory )			throws java.rmi.RemoteException { if ( java.lang.String != null ) { if ( org.springframework.remoting.rmi.Log . isInfoEnabled ( ) ) { org.springframework.remoting.rmi.Log . info ( STRING + int + STRING + java.lang.String + STRING ) ; } java.rmi.registry.Registry java.rmi.registry.Registry = java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( java.lang.String , int , java.rmi.server.RMIClientSocketFactory ) ; void ( java.rmi.registry.Registry ) ; return java.rmi.registry.Registry ; } else { return java.rmi.registry.Registry ( int , java.rmi.server.RMIClientSocketFactory , java.rmi.server.RMIServerSocketFactory ) ; } }  <METHOD_END>
<METHOD_START> protected java.rmi.registry.Registry java.rmi.registry.Registry ( int int , java.rmi.server.RMIClientSocketFactory java.rmi.server.RMIClientSocketFactory , java.rmi.server.RMIServerSocketFactory java.rmi.server.RMIServerSocketFactory )			throws java.rmi.RemoteException { if ( java.rmi.server.RMIClientSocketFactory != null ) { if ( this . boolean ) { org.springframework.remoting.rmi.Log . info ( STRING ) ; this . boolean = true ; return java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( int , java.rmi.server.RMIClientSocketFactory , java.rmi.server.RMIServerSocketFactory ) ; } if ( org.springframework.remoting.rmi.Log . isInfoEnabled ( ) ) { org.springframework.remoting.rmi.Log . info ( STRING + int + STRING ) ; } synchronized ( java.rmi.registry.LocateRegistry .class ) { try { java.rmi.registry.Registry java.rmi.registry.Registry = java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( null , int , java.rmi.server.RMIClientSocketFactory ) ; void ( java.rmi.registry.Registry ) ; return java.rmi.registry.Registry ; } catch ( java.rmi.RemoteException java.rmi.RemoteException ) { org.springframework.remoting.rmi.Log . debug ( STRING , java.rmi.RemoteException ) ; org.springframework.remoting.rmi.Log . info ( STRING ) ; this . boolean = true ; return java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( int , java.rmi.server.RMIClientSocketFactory , java.rmi.server.RMIServerSocketFactory ) ; } } } else { return java.rmi.registry.Registry ( int ) ; } }  <METHOD_END>
<METHOD_START> protected java.rmi.registry.Registry java.rmi.registry.Registry ( int int ) throws java.rmi.RemoteException { if ( this . boolean ) { org.springframework.remoting.rmi.Log . info ( STRING ) ; this . boolean = true ; return java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( int ) ; } if ( org.springframework.remoting.rmi.Log . isInfoEnabled ( ) ) { org.springframework.remoting.rmi.Log . info ( STRING + int + STRING ) ; } synchronized ( java.rmi.registry.LocateRegistry .class ) { try { java.rmi.registry.Registry java.rmi.registry.Registry = java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( int ) ; void ( java.rmi.registry.Registry ) ; return java.rmi.registry.Registry ; } catch ( java.rmi.RemoteException java.rmi.RemoteException ) { org.springframework.remoting.rmi.Log . debug ( STRING , java.rmi.RemoteException ) ; org.springframework.remoting.rmi.Log . info ( STRING ) ; this . boolean = true ; return java.rmi.registry.LocateRegistry . java.rmi.registry.Registry ( int ) ; } } }  <METHOD_END>
<METHOD_START> protected void void ( java.rmi.registry.Registry java.rmi.registry.Registry ) throws java.rmi.RemoteException { java.rmi.registry.Registry . java.lang.String[] ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.rmi.registry.Registry java.rmi.registry.Registry ( ) java.lang.Exception { return this . java.rmi.registry.Registry ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends java.rmi.registry.Registry> < ? extends java.rmi.registry.Registry > java.lang.Class<? extends java.rmi.registry.Registry> ( ) { return ( this . java.rmi.registry.Registry != null ? this . java.rmi.registry.Registry . java.lang.Class<? extends java.rmi.registry.Registry> ( ) : java.rmi.registry.Registry .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.rmi.RemoteException { if ( this . boolean ) { org.springframework.remoting.rmi.Log . info ( STRING ) ; java.rmi.server.UnicastRemoteObject . boolean ( this . java.rmi.registry.Registry , true ) ; } }  <METHOD_END>
