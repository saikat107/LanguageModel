<METHOD_START> @ java.lang.Override protected org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ( ) { return new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( SimpleRemoteSlsbInvokerInterceptor org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor , java.lang.Class<?> < ? > java.lang.Class<?> ) throws javax.naming.NamingException { SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = ( SimpleRemoteStatelessSessionProxyFactoryBean ) org.springframework.ejb.access.SimpleRemoteSlsbInvokerInterceptor ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setBusinessInterface ( java.lang.Class<> ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getObject ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final int int = NUMBER ; final java.lang.String java.lang.String = STRING ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb . int ( ) ) . willReturn ( int ) ; final org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome . org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ( ) ) . willReturn ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb ) ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( STRING + java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; } } ; SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiName ( java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setResourceRef ( true ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setBusinessInterface ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods .class ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods = ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ) org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getObject ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . java.lang.Class<? extends org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods> ( ) ) ) ; assertEquals ( STRING , int , org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . int ( ) ) ; verify ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( STRING + java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final int int = NUMBER ; final java.lang.String java.lang.String = STRING ; final org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb . int ( ) ) . willReturn ( int ) ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( STRING + java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb ; } } ; SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiName ( java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setResourceRef ( true ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setBusinessInterface ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods .class ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods = ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ) org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getObject ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . java.lang.Class<? extends org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods> ( ) ) ) ; assertEquals ( STRING , int , org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( STRING + java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Test public void void ( ) java.lang.Exception { final java.rmi.RemoteException java.rmi.RemoteException = new java.rmi.RemoteException ( ) ; final java.lang.String java.lang.String = STRING ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb . int ( ) ) . willThrow ( java.rmi.RemoteException ) ; final org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome . org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ( ) ) . willReturn ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb ) ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( STRING + java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; } } ; SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiName ( java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setResourceRef ( true ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setBusinessInterface ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods .class ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods = ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ) org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getObject ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . java.lang.Class<? extends org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods> ( ) ) ) ; try { org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . int ( ) ; fail ( STRING ) ; } catch ( java.rmi.RemoteException java.rmi.RemoteException ) { assertSame ( STRING , java.rmi.RemoteException , java.rmi.RemoteException ) ; } verify ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyEjb ) . remove ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( STRING + java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final CreateException org.springframework.ejb.access.CreateException = new CreateException ( ) ; final org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome . org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ( ) ) . willThrow ( org.springframework.ejb.access.CreateException ) ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; } } ; SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiName ( java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setBusinessInterface ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods .class ) ; assertEquals ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getBusinessInterface ( ) , org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods .class ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods = ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ) org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getObject ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . java.lang.Class<? extends org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods> ( ) ) ) ; try { org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods . int ( ) ; fail ( STRING ) ; } catch ( java.rmi.RemoteException java.rmi.RemoteException ) { } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final CreateException org.springframework.ejb.access.CreateException = new CreateException ( ) ; final org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome .class ) ; given ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome . org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ( ) ) . willThrow ( org.springframework.ejb.access.CreateException ) ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; } } ; SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiName ( java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setBusinessInterface ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods .class ) ; assertEquals ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getBusinessInterface ( ) , org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods .class ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods = ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods ) org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . getObject ( ) ; assertTrue ( java.lang.reflect.Proxy . boolean ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods . java.lang.Class<? extends org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods> ( ) ) ) ; try { org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyLocalBusinessMethods . int ( ) ; fail ( STRING ) ; } catch ( RemoteAccessException org.springframework.ejb.access.RemoteAccessException ) { assertTrue ( org.springframework.ejb.access.RemoteAccessException . getCause ( ) == org.springframework.ejb.access.CreateException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome = mock ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome .class ) ; JndiTemplate org.springframework.ejb.access.JndiTemplate = new JndiTemplate ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws javax.naming.NamingException { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; } } ; SimpleRemoteStatelessSessionProxyFactoryBean org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean = new SimpleRemoteStatelessSessionProxyFactoryBean ( ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiName ( java.lang.String ) ; org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . setJndiTemplate ( org.springframework.ejb.access.JndiTemplate ) ; assertTrue ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . isSingleton ( ) ) ; try { org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBean . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertTrue ( java.lang.IllegalArgumentException . java.lang.String ( ) . int ( STRING ) != NUMBER ) ; } verifyZeroInteractions ( org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) throws javax.naming.NamingException { assertTrue ( java.lang.String . boolean ( java.lang.String ) ) ; return org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyHome ; }  <METHOD_END>
<METHOD_START> org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods org.springframework.ejb.access.SimpleRemoteStatelessSessionProxyFactoryBeanTests.MyBusinessMethods ( ) org.springframework.ejb.access.CreateException , java.rmi.RemoteException ;  <METHOD_END>
<METHOD_START> int int ( ) java.rmi.RemoteException ;  <METHOD_END>
<METHOD_START> int int ( )  <METHOD_END>
