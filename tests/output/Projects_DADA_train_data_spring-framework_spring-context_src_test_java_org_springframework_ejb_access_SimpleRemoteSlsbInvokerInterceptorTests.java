<METHOD_START> private javax.naming.Context javax.naming.Context ( java.lang.String java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface )			throws java.lang.Exception { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.SlsbHome org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.SlsbHome = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.SlsbHome .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.SlsbHome . org.springframework.ejb.access.EJBObject ( ) ) . willReturn ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; javax.naming.Context javax.naming.Context = mock ( javax.naming.Context .class ) ; given ( javax.naming.Context . java.lang.Object ( STRING + java.lang.String ) ) . willReturn ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.SlsbHome ) ; return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> private org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( final javax.naming.Context javax.naming.Context , java.lang.String java.lang.String ) throws java.lang.Exception { SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setJndiTemplate ( new JndiTemplate ( ) { @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; } } ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setResourceRef ( true ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setJndiName ( java.lang.String ) ; return org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected javax.naming.Context javax.naming.Context ( ) { return javax.naming.Context ; }  <METHOD_END>
<METHOD_START> protected org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( ) { return new SimpleRemoteSlsbInvokerInterceptor ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , java.lang.Class<?> < ? > java.lang.Class<?> ) throws javax.naming.NamingException { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . afterPropertiesSet ( ) ; ProxyFactory org.springframework.ejb.access.ProxyFactory = new ProxyFactory ( new java.lang.Class<?> < ? > [] { java.lang.Class<> } ) ; org.springframework.ejb.access.ProxyFactory . addAdvice ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ) ; return org.springframework.ejb.access.ProxyFactory . getProxy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; verify ( javax.naming.Context ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setExposeAccessContext ( true ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; assertNull ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) ; verify ( javax.naming.Context , times ( NUMBER ) ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) . targetMethod ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final javax.naming.NamingException javax.naming.NamingException = new javax.naming.NamingException ( ) ; final java.lang.String java.lang.String = STRING ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws javax.naming.NamingException { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; throw javax.naming.NamingException ; } } ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = new SimpleRemoteSlsbInvokerInterceptor ( ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setJndiName ( STRING ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; try { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( javax.naming.NamingException javax.naming.NamingException ) { assertTrue ( javax.naming.NamingException == javax.naming.NamingException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws javax.naming.NamingException { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; throw javax.naming.NamingException ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( false , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( false , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true , false ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean , boolean boolean ) throws java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willReturn ( java.lang.Object ) ; int int = NUMBER ; if ( ! boolean ) { int ++ ; if ( boolean ) { int ++ ; } } final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setLookupHomeOnStartup ( boolean ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setCacheHome ( boolean ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; assertTrue ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) == java.lang.Object ) ; assertTrue ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) == java.lang.Object ) ; verify ( javax.naming.Context , times ( int ) ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface , times ( NUMBER ) ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willReturn ( java.lang.Object ) ; final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setHomeInterface ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.SlsbHome .class ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; assertTrue ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) == java.lang.Object ) ; verify ( javax.naming.Context ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willThrow ( new java.rmi.RemoteException ( ) ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . remove ( ) ; final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; try { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ; fail ( STRING ) ; } catch ( java.rmi.RemoteException java.rmi.RemoteException ) { } verify ( javax.naming.Context ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface , times ( NUMBER ) ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( false , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( false , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true , false ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean , boolean boolean ) throws java.lang.Exception { final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willThrow ( new java.rmi.ConnectException ( STRING ) ) ; int int = NUMBER ; if ( ! boolean ) { int ++ ; if ( boolean ) { int ++ ; } } final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setRefreshHomeOnConnectFailure ( true ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setLookupHomeOnStartup ( boolean ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor . setCacheHome ( boolean ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; try { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ; fail ( STRING ) ; } catch ( java.rmi.ConnectException java.rmi.ConnectException ) { } verify ( javax.naming.Context , times ( int ) ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface , times ( NUMBER ) ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = new java.lang.Object ( ) ; final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willReturn ( java.lang.Object ) ; final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface .class ) ; assertTrue ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface . java.lang.Object ( ) == java.lang.Object ) ; verify ( javax.naming.Context ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willThrow ( new java.rmi.RemoteException ( ) ) ; final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface .class ) ; try { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.BusinessInterface . java.lang.Object ( ) ; fail ( STRING ) ; } catch ( RemoteAccessException org.springframework.ejb.access.RemoteAccessException ) { } verify ( javax.naming.Context ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.ApplicationException ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( new java.rmi.RemoteException ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Exception java.lang.Exception ) throws java.lang.Exception { final org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = mock ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; given ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ) . willThrow ( java.lang.Exception ) ; final java.lang.String java.lang.String = STRING ; javax.naming.Context javax.naming.Context = javax.naming.Context ( java.lang.String , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) ; SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor = org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( javax.naming.Context , java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface = ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) java.lang.Object ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface .class ) ; try { org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface . java.lang.Object ( ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertTrue ( java.lang.Exception == java.lang.Exception ) ; } verify ( javax.naming.Context ) . close ( ) ; verify ( org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.RemoteInterface ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.ejb.access.EJBObject org.springframework.ejb.access.EJBObject ( ) java.rmi.RemoteException , org.springframework.ejb.access.CreateException ;  <METHOD_END>
<METHOD_START> java.lang.Object java.lang.Object ( ) java.rmi.RemoteException , org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.ApplicationException ;  <METHOD_END>
<METHOD_START> java.lang.Object java.lang.Object ( ) org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptorTests.ApplicationException ;  <METHOD_END>
<METHOD_START> public void ( ) { super( STRING ); }  <METHOD_END>
