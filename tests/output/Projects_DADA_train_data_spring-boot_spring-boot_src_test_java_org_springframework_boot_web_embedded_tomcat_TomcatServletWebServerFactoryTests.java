<METHOD_START> @ java.lang.Override protected org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) { return new TomcatServletWebServerFactory ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { java.lang.Thread . java.lang.Thread ( ) . void ( java.lang.Class<? extends org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactoryTests> ( ) . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setPort ( SocketUtils . findAvailableTcpPort ( NUMBER ) ) ; TomcatWebServer org.springframework.boot.web.embedded.tomcat.TomcatWebServer = ( TomcatWebServer ) org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; java.lang.String java.lang.String = ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) . getEngine ( ) . getName ( ) ; java.lang.String java.lang.String = org.springframework.boot.web.embedded.tomcat.TomcatWebServer . getTomcat ( ) . getEngine ( ) . getName ( ) ; assertThat ( java.lang.String ) . as ( STRING ) . isNotEqualTo ( java.lang.String ) ; org.springframework.boot.web.embedded.tomcat.TomcatWebServer . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; LifecycleListener [] org.springframework.boot.web.embedded.tomcat.LifecycleListener[] = new LifecycleListener [ NUMBER ] ; for ( int int = NUMBER ; int < listeners . length ; int ++ ) { org.springframework.boot.web.embedded.tomcat.LifecycleListener[] [ int ] = mock ( LifecycleListener .class ) ; } org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setContextLifecycleListeners ( java.util.Arrays . java.util.List ( org.springframework.boot.web.embedded.tomcat.LifecycleListener[] [ NUMBER ] , org.springframework.boot.web.embedded.tomcat.LifecycleListener[] [ NUMBER ] ) ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addContextLifecycleListeners ( org.springframework.boot.web.embedded.tomcat.LifecycleListener[] [ NUMBER ] , org.springframework.boot.web.embedded.tomcat.LifecycleListener[] [ NUMBER ] ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; InOrder org.springframework.boot.web.embedded.tomcat.InOrder = inOrder ( ( java.lang.Object [] ) org.springframework.boot.web.embedded.tomcat.LifecycleListener[] ) ; for ( LifecycleListener org.springframework.boot.web.embedded.tomcat.LifecycleListener : org.springframework.boot.web.embedded.tomcat.LifecycleListener[] ) { org.springframework.boot.web.embedded.tomcat.InOrder . verify ( org.springframework.boot.web.embedded.tomcat.LifecycleListener ) . lifecycleEvent ( any ( LifecycleEvent .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; TomcatContextCustomizer [] org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] = new TomcatContextCustomizer [ NUMBER ] ; for ( int int = NUMBER ; int < listeners . length ; int ++ ) { org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] [ int ] = mock ( TomcatContextCustomizer .class ) ; } org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setTomcatContextCustomizers ( java.util.Arrays . java.util.List ( org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] [ NUMBER ] , org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] [ NUMBER ] ) ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addContextCustomizers ( org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] [ NUMBER ] , org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] [ NUMBER ] ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; InOrder org.springframework.boot.web.embedded.tomcat.InOrder = inOrder ( ( java.lang.Object [] ) org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] ) ; for ( TomcatContextCustomizer org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer : org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer[] ) { org.springframework.boot.web.embedded.tomcat.InOrder . verify ( org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer ) . customize ( any ( Context .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; TomcatConnectorCustomizer [] org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] = new TomcatConnectorCustomizer [ NUMBER ] ; for ( int int = NUMBER ; int < listeners . length ; int ++ ) { org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] [ int ] = mock ( TomcatConnectorCustomizer .class ) ; } org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setTomcatConnectorCustomizers ( java.util.Arrays . java.util.List ( org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] [ NUMBER ] , org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] [ NUMBER ] ) ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addConnectorCustomizers ( org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] [ NUMBER ] , org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] [ NUMBER ] ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; InOrder org.springframework.boot.web.embedded.tomcat.InOrder = inOrder ( ( java.lang.Object [] ) org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] ) ; for ( TomcatConnectorCustomizer org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer : org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer[] ) { org.springframework.boot.web.embedded.tomcat.InOrder . verify ( org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer ) . customize ( any ( Connector .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; Connector [] org.springframework.boot.web.embedded.tomcat.Connector[] = new Connector [ NUMBER ] ; for ( int int = NUMBER ; int < listeners . length ; int ++ ) { Connector org.springframework.boot.web.embedded.tomcat.Connector = mock ( Connector .class ) ; given ( org.springframework.boot.web.embedded.tomcat.Connector . getState ( ) ) . willReturn ( LifecycleState . STOPPED ) ; org.springframework.boot.web.embedded.tomcat.Connector[] [ int ] = org.springframework.boot.web.embedded.tomcat.Connector ; } org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addAdditionalTomcatConnectors ( org.springframework.boot.web.embedded.tomcat.Connector[] ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; java.util.Map<org.springframework.boot.web.embedded.tomcat.Service,org.springframework.boot.web.embedded.tomcat.Connector[]> < Service , Connector [] > java.util.Map<org.springframework.boot.web.embedded.tomcat.Service,org.springframework.boot.web.embedded.tomcat.Connector[]> = ( ( TomcatWebServer ) this . webServer ) . getServiceConnectors ( ) ; assertThat ( java.util.Map<org.springframework.boot.web.embedded.tomcat.Service,org.springframework.boot.web.embedded.tomcat.Connector[]> . values ( ) . iterator ( ) . next ( ) . length ) . isEqualTo ( listeners . length + NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addAdditionalTomcatConnectors ( ( Connector [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setSessionTimeout ( NUMBER ) ; void ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setSessionTimeout ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; void ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setSessionTimeout ( NUMBER ) ; void ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; Valve org.springframework.boot.web.embedded.tomcat.Valve = mock ( Valve .class ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addContextValves ( org.springframework.boot.web.embedded.tomcat.Valve ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; verify ( org.springframework.boot.web.embedded.tomcat.Valve ) . setNext ( any ( Valve .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setTomcatContextCustomizers ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addContextCustomizers ( ( TomcatContextCustomizer [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setTomcatConnectorCustomizers ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addConnectorCustomizers ( ( TomcatConnectorCustomizer [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setUriEncoding ( java.nio.charset.Charset . java.nio.charset.Charset ( STRING ) ) ; Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = org.springframework.boot.web.embedded.tomcat.Tomcat ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ) ; Connector org.springframework.boot.web.embedded.tomcat.Connector = ( ( TomcatWebServer ) this . webServer ) . getServiceConnectors ( ) . get ( org.springframework.boot.web.embedded.tomcat.Tomcat . getService ( ) ) [ NUMBER ] ; assertThat ( org.springframework.boot.web.embedded.tomcat.Connector . getURIEncoding ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = org.springframework.boot.web.embedded.tomcat.Tomcat ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ) ; Connector org.springframework.boot.web.embedded.tomcat.Connector = ( ( TomcatWebServer ) this . webServer ) . getServiceConnectors ( ) . get ( org.springframework.boot.web.embedded.tomcat.Tomcat . getService ( ) ) [ NUMBER ] ; assertThat ( org.springframework.boot.web.embedded.tomcat.Connector . getURIEncoding ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Ssl org.springframework.boot.web.embedded.tomcat.Ssl = new Ssl ( ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setKeyStore ( STRING ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setKeyStorePassword ( STRING ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setCiphers ( new java.lang.String [] { STRING , STRING , STRING } ) ; TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setSsl ( org.springframework.boot.web.embedded.tomcat.Ssl ) ; Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = org.springframework.boot.web.embedded.tomcat.Tomcat ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ) ; Connector org.springframework.boot.web.embedded.tomcat.Connector = ( ( TomcatWebServer ) this . webServer ) . getServiceConnectors ( ) . get ( org.springframework.boot.web.embedded.tomcat.Tomcat . getService ( ) ) [ NUMBER ] ; SSLHostConfig [] org.springframework.boot.web.embedded.tomcat.SSLHostConfig[] = org.springframework.boot.web.embedded.tomcat.Connector . getProtocolHandler ( ) . findSslHostConfigs ( ) ; assertThat ( org.springframework.boot.web.embedded.tomcat.SSLHostConfig[] [ NUMBER ] . getCiphers ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Ssl org.springframework.boot.web.embedded.tomcat.Ssl = getSsl ( null , STRING , STRING ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setEnabledProtocols ( new java.lang.String [] { STRING , STRING } ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setCiphers ( new java.lang.String [] { STRING , STRING } ) ; TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setSsl ( org.springframework.boot.web.embedded.tomcat.Ssl ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( sessionServletRegistration ( ) ) ; this . webServer . start ( ) ; Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) ; Connector org.springframework.boot.web.embedded.tomcat.Connector = org.springframework.boot.web.embedded.tomcat.Tomcat . getConnector ( ) ; SSLHostConfig org.springframework.boot.web.embedded.tomcat.SSLHostConfig = org.springframework.boot.web.embedded.tomcat.Connector . getProtocolHandler ( ) . findSslHostConfigs ( ) [ NUMBER ] ; assertThat ( org.springframework.boot.web.embedded.tomcat.SSLHostConfig . getSslProtocol ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.web.embedded.tomcat.SSLHostConfig . getEnabledProtocols ( ) ) . containsExactlyInAnyOrder ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Ssl org.springframework.boot.web.embedded.tomcat.Ssl = getSsl ( null , STRING , STRING ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setEnabledProtocols ( new java.lang.String [] { STRING } ) ; org.springframework.boot.web.embedded.tomcat.Ssl . setCiphers ( new java.lang.String [] { STRING , STRING } ) ; TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setSsl ( org.springframework.boot.web.embedded.tomcat.Ssl ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( sessionServletRegistration ( ) ) ; Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) ; this . webServer . start ( ) ; Connector org.springframework.boot.web.embedded.tomcat.Connector = org.springframework.boot.web.embedded.tomcat.Tomcat . getConnector ( ) ; SSLHostConfig org.springframework.boot.web.embedded.tomcat.SSLHostConfig = org.springframework.boot.web.embedded.tomcat.Connector . getProtocolHandler ( ) . findSslHostConfigs ( ) [ NUMBER ] ; assertThat ( org.springframework.boot.web.embedded.tomcat.SSLHostConfig . getSslProtocol ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.web.embedded.tomcat.SSLHostConfig . getEnabledProtocols ( ) ) . containsExactly ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException , java.io.IOException { doWithBlockedPort ( new BlockedPortAction ( ) { @ java.lang.Override public void void ( int int ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setPort ( int ) ; try { org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactoryTests .this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactoryTests .this . webServer . start ( ) ; fail ( ) ; } catch ( WebServerException org.springframework.boot.web.embedded.tomcat.WebServerException ) { } } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setPort ( int ) ; try { org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactoryTests .this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactoryTests .this . webServer . start ( ) ; fail ( ) ; } catch ( WebServerException org.springframework.boot.web.embedded.tomcat.WebServerException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { super. portClashOfPrimaryConnectorResultsInPortInUseException ( ) ; java.lang.String java.lang.String = this . org.springframework.boot.web.embedded.tomcat.InternalOutputCapture . toString ( ) ; assertThat ( java.lang.String ) . doesNotContain ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( exampleServletRegistration ( ) ) ; this . webServer . stop ( ) ; Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) ; assertThat ( org.springframework.boot.web.embedded.tomcat.Tomcat . getServer ( ) . getState ( ) ) . isSameAs ( LifecycleState . DESTROYED ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( int int , AbstractServletWebServerFactory org.springframework.boot.web.embedded.tomcat.AbstractServletWebServerFactory ) { Connector org.springframework.boot.web.embedded.tomcat.Connector = new Connector ( STRING ) ; org.springframework.boot.web.embedded.tomcat.Connector . setPort ( int ) ; ( ( TomcatServletWebServerFactory ) org.springframework.boot.web.embedded.tomcat.AbstractServletWebServerFactory ) . addAdditionalTomcatConnectors ( org.springframework.boot.web.embedded.tomcat.Connector ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . addContextValves ( new RemoteIpValve ( ) ) ; assertForwardHeaderIsUsed ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = this . temporaryFolder . newFolder ( ) ; TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . setBaseDirectory ( java.io.File ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( sessionServletRegistration ( ) ) ; this . webServer . start ( ) ; java.lang.String java.lang.String = getResponse ( getLocalUrl ( STRING ) ) ; java.lang.String java.lang.String = getResponse ( getLocalUrl ( STRING ) ) ; this . webServer . stop ( ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( sessionServletRegistration ( ) ) ; this . webServer . start ( ) ; java.lang.String java.lang.String = getResponse ( getLocalUrl ( STRING ) ) ; java.lang.String java.lang.String = STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String ; assertThat ( java.lang.String . java.lang.String[] ( STRING ) [ NUMBER ] ) . as ( java.lang.String ) . isEqualTo ( java.lang.String . java.lang.String[] ( STRING ) [ NUMBER ] ) ; assertThat ( java.lang.String . java.lang.String[] ( STRING ) [ NUMBER ] ) . as ( java.lang.String ) . isNotEqualTo ( java.lang.String . java.lang.String[] ( STRING ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) javax.naming.NamingException { java.lang.Thread . java.lang.Thread ( ) . void ( java.lang.Class<? extends org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactoryTests> ( ) . java.lang.ClassLoader ( ) ) ; TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = new TomcatServletWebServerFactory ( NUMBER ) { @ java.lang.Override protected org.springframework.boot.web.embedded.tomcat.TomcatWebServer org.springframework.boot.web.embedded.tomcat.TomcatWebServer ( Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat ) { org.springframework.boot.web.embedded.tomcat.Tomcat . enableNaming ( ) ; return super. getTomcatWebServer ( org.springframework.boot.web.embedded.tomcat.Tomcat ) ; } } ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; new javax.naming.InitialContext ( ) . java.lang.Object ( STRING ) ; this . webServer . start ( ) ; this . thrown . expect ( javax.naming.NamingException .class ) ; new javax.naming.InitialContext ( ) . java.lang.Object ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.web.embedded.tomcat.TomcatWebServer org.springframework.boot.web.embedded.tomcat.TomcatWebServer ( Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat ) { org.springframework.boot.web.embedded.tomcat.Tomcat . enableNaming ( ) ; return super. getTomcatWebServer ( org.springframework.boot.web.embedded.tomcat.Tomcat ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; assertThat ( java.nio.charset.Charset ( java.util.Locale . java.util.Locale ) . java.lang.String ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.nio.charset.Charset ( java.util.Locale . java.util.Locale ) . java.lang.String ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.System . java.lang.String ( STRING , STRING ) ; try { TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ( ) ; this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; this . webServer . start ( ) ; } finally { java.lang.System . java.lang.String ( STRING ) ; } Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) ; Context org.springframework.boot.web.embedded.tomcat.Context = ( Context ) org.springframework.boot.web.embedded.tomcat.Tomcat . getHost ( ) . findChildren ( ) [ NUMBER ] ; SessionIdGenerator org.springframework.boot.web.embedded.tomcat.SessionIdGenerator = org.springframework.boot.web.embedded.tomcat.Context . getManager ( ) . getSessionIdGenerator ( ) ; assertThat ( org.springframework.boot.web.embedded.tomcat.SessionIdGenerator ) . isInstanceOf ( LazySessionIdGenerator .class ) ; assertThat ( org.springframework.boot.web.embedded.tomcat.SessionIdGenerator . getJvmRoute ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.web.embedded.tomcat.JspServlet org.springframework.boot.web.embedded.tomcat.JspServlet ( ) org.springframework.boot.web.embedded.tomcat.ServletException { Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) ; Container org.springframework.boot.web.embedded.tomcat.Container = org.springframework.boot.web.embedded.tomcat.Tomcat . getHost ( ) . findChildren ( ) [ NUMBER ] ; StandardWrapper org.springframework.boot.web.embedded.tomcat.StandardWrapper = ( StandardWrapper ) org.springframework.boot.web.embedded.tomcat.Container . findChild ( STRING ) ; if ( org.springframework.boot.web.embedded.tomcat.StandardWrapper == null ) { return null ; } org.springframework.boot.web.embedded.tomcat.StandardWrapper . load ( ) ; return ( JspServlet ) org.springframework.boot.web.embedded.tomcat.StandardWrapper . getServlet ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override protected java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { Context org.springframework.boot.web.embedded.tomcat.Context = ( Context ) ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) . getHost ( ) . findChildren ( ) [ NUMBER ] ; return ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > ) ReflectionTestUtils . getField ( org.springframework.boot.web.embedded.tomcat.Context , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.nio.charset.Charset java.nio.charset.Charset ( java.util.Locale java.util.Locale ) { Context org.springframework.boot.web.embedded.tomcat.Context = ( Context ) ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) . getHost ( ) . findChildren ( ) [ NUMBER ] ; CharsetMapper org.springframework.boot.web.embedded.tomcat.CharsetMapper = ( ( TomcatEmbeddedContext ) org.springframework.boot.web.embedded.tomcat.Context ) . getCharsetMapper ( ) ; java.lang.String java.lang.String = org.springframework.boot.web.embedded.tomcat.CharsetMapper . getCharset ( java.util.Locale ) ; return ( java.lang.String != null ) ? java.nio.charset.Charset . java.nio.charset.Charset ( java.lang.String ) : null ; }  <METHOD_END>
<METHOD_START> private void void ( TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory , int int ) { Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat = org.springframework.boot.web.embedded.tomcat.Tomcat ( org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ) ; Context org.springframework.boot.web.embedded.tomcat.Context = ( Context ) org.springframework.boot.web.embedded.tomcat.Tomcat . getHost ( ) . findChildren ( ) [ NUMBER ] ; assertThat ( org.springframework.boot.web.embedded.tomcat.Context . getSessionTimeout ( ) ) . isEqualTo ( int ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.tomcat.Tomcat org.springframework.boot.web.embedded.tomcat.Tomcat ( TomcatServletWebServerFactory org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory ) { this . webServer = org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory . getWebServer ( ) ; return ( ( TomcatWebServer ) this . webServer ) . getTomcat ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.RuntimeException java.lang.RuntimeException , int int ) { assertThat ( java.lang.RuntimeException ) . isInstanceOf ( ConnectorStartFailedException .class ) ; assertThat ( ( ( ConnectorStartFailedException ) java.lang.RuntimeException ) . getPort ( ) ) . isEqualTo ( int ) ; }  <METHOD_END>
