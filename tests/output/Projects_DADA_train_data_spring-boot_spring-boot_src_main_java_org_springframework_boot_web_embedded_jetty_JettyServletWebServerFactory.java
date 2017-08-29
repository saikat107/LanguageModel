<METHOD_START> public void ( ) { super(); }  <METHOD_END>
<METHOD_START> public void ( int int ) { super( int ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , int int ) { super( java.lang.String , int ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.web.embedded.jetty.WebServer org.springframework.boot.web.embedded.jetty.WebServer ( ServletContextInitializer ... org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) { JettyEmbeddedWebAppContext org.springframework.boot.web.embedded.jetty.JettyEmbeddedWebAppContext = new JettyEmbeddedWebAppContext ( ) ; int int = ( getPort ( ) >= NUMBER ? getPort ( ) : NUMBER ) ; java.net.InetSocketAddress java.net.InetSocketAddress = new java.net.InetSocketAddress ( getAddress ( ) , int ) ; Server org.springframework.boot.web.embedded.jetty.Server = org.springframework.boot.web.embedded.jetty.Server ( java.net.InetSocketAddress ) ; void ( org.springframework.boot.web.embedded.jetty.JettyEmbeddedWebAppContext , org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) ; org.springframework.boot.web.embedded.jetty.Server . setHandler ( org.springframework.boot.web.embedded.jetty.Handler ( org.springframework.boot.web.embedded.jetty.JettyEmbeddedWebAppContext ) ) ; this . logger . info ( STRING + int ) ; if ( getSsl ( ) != null && getSsl ( ) . isEnabled ( ) ) { SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory = new SslContextFactory ( ) ; void ( org.springframework.boot.web.embedded.jetty.SslContextFactory , getSsl ( ) ) ; AbstractConnector org.springframework.boot.web.embedded.jetty.AbstractConnector = org.springframework.boot.web.embedded.jetty.AbstractConnector ( org.springframework.boot.web.embedded.jetty.Server , org.springframework.boot.web.embedded.jetty.SslContextFactory , int ) ; org.springframework.boot.web.embedded.jetty.Server . setConnectors ( new Connector [] { org.springframework.boot.web.embedded.jetty.AbstractConnector } ) ; } for ( JettyServerCustomizer org.springframework.boot.web.embedded.jetty.JettyServerCustomizer : java.util.Collection<org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> ( ) ) { org.springframework.boot.web.embedded.jetty.JettyServerCustomizer . customize ( org.springframework.boot.web.embedded.jetty.Server ) ; } if ( this . boolean ) { new org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory.ForwardHeadersCustomizer ( ) . void ( org.springframework.boot.web.embedded.jetty.Server ) ; } return org.springframework.boot.web.embedded.jetty.JettyWebServer ( org.springframework.boot.web.embedded.jetty.Server ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.Server org.springframework.boot.web.embedded.jetty.Server ( java.net.InetSocketAddress java.net.InetSocketAddress ) { Server org.springframework.boot.web.embedded.jetty.Server = new Server ( org.springframework.boot.web.embedded.jetty.ThreadPool ( ) ) ; org.springframework.boot.web.embedded.jetty.Server . setConnectors ( new Connector [] { org.springframework.boot.web.embedded.jetty.AbstractConnector ( java.net.InetSocketAddress , org.springframework.boot.web.embedded.jetty.Server ) } ) ; return org.springframework.boot.web.embedded.jetty.Server ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.AbstractConnector org.springframework.boot.web.embedded.jetty.AbstractConnector ( java.net.InetSocketAddress java.net.InetSocketAddress , Server org.springframework.boot.web.embedded.jetty.Server ) { ServerConnector org.springframework.boot.web.embedded.jetty.ServerConnector = new ServerConnector ( org.springframework.boot.web.embedded.jetty.Server , this . int , this . int ) ; org.springframework.boot.web.embedded.jetty.ServerConnector . setHost ( java.net.InetSocketAddress . java.lang.String ( ) ) ; org.springframework.boot.web.embedded.jetty.ServerConnector . setPort ( java.net.InetSocketAddress . int ( ) ) ; for ( ConnectionFactory org.springframework.boot.web.embedded.jetty.ConnectionFactory : org.springframework.boot.web.embedded.jetty.ServerConnector . getConnectionFactories ( ) ) { if ( org.springframework.boot.web.embedded.jetty.ConnectionFactory instanceof HttpConfiguration . HttpConfiguration ) { ( ( HttpConfiguration . HttpConfiguration ) org.springframework.boot.web.embedded.jetty.ConnectionFactory ) . getHttpConfiguration ( ) . setSendServerVersion ( false ) ; } } return org.springframework.boot.web.embedded.jetty.ServerConnector ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.AbstractConnector org.springframework.boot.web.embedded.jetty.AbstractConnector ( Server org.springframework.boot.web.embedded.jetty.Server , SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory , int int ) { HttpConfiguration org.springframework.boot.web.embedded.jetty.HttpConfiguration = new HttpConfiguration ( ) ; org.springframework.boot.web.embedded.jetty.HttpConfiguration . setSendServerVersion ( false ) ; org.springframework.boot.web.embedded.jetty.HttpConfiguration . addCustomizer ( new SecureRequestCustomizer ( ) ) ; HttpConnectionFactory org.springframework.boot.web.embedded.jetty.HttpConnectionFactory = new HttpConnectionFactory ( org.springframework.boot.web.embedded.jetty.HttpConfiguration ) ; SslConnectionFactory org.springframework.boot.web.embedded.jetty.SslConnectionFactory = new SslConnectionFactory ( org.springframework.boot.web.embedded.jetty.SslContextFactory , HttpVersion . HTTP_1_1 . asString ( ) ) ; ServerConnector org.springframework.boot.web.embedded.jetty.ServerConnector = new ServerConnector ( org.springframework.boot.web.embedded.jetty.Server , org.springframework.boot.web.embedded.jetty.SslConnectionFactory , org.springframework.boot.web.embedded.jetty.HttpConnectionFactory ) ; org.springframework.boot.web.embedded.jetty.ServerConnector . setPort ( int ) ; return org.springframework.boot.web.embedded.jetty.ServerConnector ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.Handler org.springframework.boot.web.embedded.jetty.Handler ( Handler org.springframework.boot.web.embedded.jetty.Handler ) { if ( getCompression ( ) != null && getCompression ( ) . getEnabled ( ) ) { org.springframework.boot.web.embedded.jetty.Handler = org.springframework.boot.web.embedded.jetty.Handler ( org.springframework.boot.web.embedded.jetty.Handler , org.springframework.boot.web.embedded.jetty.HandlerWrapper ( ) ) ; } if ( StringUtils . hasText ( getServerHeader ( ) ) ) { org.springframework.boot.web.embedded.jetty.Handler = org.springframework.boot.web.embedded.jetty.Handler ( org.springframework.boot.web.embedded.jetty.Handler , new org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory.ServerHeaderHandler ( getServerHeader ( ) ) ) ; } return org.springframework.boot.web.embedded.jetty.Handler ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.Handler org.springframework.boot.web.embedded.jetty.Handler ( Handler org.springframework.boot.web.embedded.jetty.Handler , HandlerWrapper org.springframework.boot.web.embedded.jetty.HandlerWrapper ) { org.springframework.boot.web.embedded.jetty.HandlerWrapper . setHandler ( org.springframework.boot.web.embedded.jetty.Handler ) ; return org.springframework.boot.web.embedded.jetty.HandlerWrapper ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.HandlerWrapper org.springframework.boot.web.embedded.jetty.HandlerWrapper ( ) { GzipHandler org.springframework.boot.web.embedded.jetty.GzipHandler = new GzipHandler ( ) ; Compression org.springframework.boot.web.embedded.jetty.Compression = getCompression ( ) ; org.springframework.boot.web.embedded.jetty.GzipHandler . setMinGzipSize ( org.springframework.boot.web.embedded.jetty.Compression . getMinResponseSize ( ) ) ; org.springframework.boot.web.embedded.jetty.GzipHandler . setIncludedMimeTypes ( org.springframework.boot.web.embedded.jetty.Compression . getMimeTypes ( ) ) ; if ( org.springframework.boot.web.embedded.jetty.Compression . getExcludedUserAgents ( ) != null ) { org.springframework.boot.web.embedded.jetty.GzipHandler . setExcludedAgentPatterns ( org.springframework.boot.web.embedded.jetty.Compression . getExcludedUserAgents ( ) ) ; } return org.springframework.boot.web.embedded.jetty.GzipHandler ; }  <METHOD_END>
<METHOD_START> protected void void ( SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory , Ssl org.springframework.boot.web.embedded.jetty.Ssl ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setProtocol ( org.springframework.boot.web.embedded.jetty.Ssl . getProtocol ( ) ) ; void ( org.springframework.boot.web.embedded.jetty.SslContextFactory , org.springframework.boot.web.embedded.jetty.Ssl ) ; void ( org.springframework.boot.web.embedded.jetty.SslContextFactory , org.springframework.boot.web.embedded.jetty.Ssl ) ; org.springframework.boot.web.embedded.jetty.SslContextFactory . setCertAlias ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyAlias ( ) ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.boot.web.embedded.jetty.Ssl . getCiphers ( ) ) ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setIncludeCipherSuites ( org.springframework.boot.web.embedded.jetty.Ssl . getCiphers ( ) ) ; org.springframework.boot.web.embedded.jetty.SslContextFactory . setExcludeCipherSuites ( ) ; } if ( org.springframework.boot.web.embedded.jetty.Ssl . getEnabledProtocols ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setIncludeProtocols ( org.springframework.boot.web.embedded.jetty.Ssl . getEnabledProtocols ( ) ) ; } if ( getSslStoreProvider ( ) != null ) { try { org.springframework.boot.web.embedded.jetty.SslContextFactory . setKeyStore ( getSslStoreProvider ( ) . getKeyStore ( ) ) ; org.springframework.boot.web.embedded.jetty.SslContextFactory . setTrustStore ( getSslStoreProvider ( ) . getTrustStore ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING , java.lang.Exception ) ; } } else { void ( org.springframework.boot.web.embedded.jetty.SslContextFactory , org.springframework.boot.web.embedded.jetty.Ssl ) ; void ( org.springframework.boot.web.embedded.jetty.SslContextFactory , org.springframework.boot.web.embedded.jetty.Ssl ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory , Ssl org.springframework.boot.web.embedded.jetty.Ssl ) { if ( org.springframework.boot.web.embedded.jetty.Ssl . getClientAuth ( ) == ClientAuth . NEED ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setNeedClientAuth ( true ) ; org.springframework.boot.web.embedded.jetty.SslContextFactory . setWantClientAuth ( true ) ; } else if ( org.springframework.boot.web.embedded.jetty.Ssl . getClientAuth ( ) == ClientAuth . WANT ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setWantClientAuth ( true ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory , Ssl org.springframework.boot.web.embedded.jetty.Ssl ) { if ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStorePassword ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setKeyStorePassword ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStorePassword ( ) ) ; } if ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyPassword ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setKeyManagerPassword ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyPassword ( ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory , Ssl org.springframework.boot.web.embedded.jetty.Ssl ) { try { java.net.URL java.net.URL = ResourceUtils . getURL ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStore ( ) ) ; org.springframework.boot.web.embedded.jetty.SslContextFactory . setKeyStoreResource ( Resource . newResource ( java.net.URL ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new WebServerException ( STRING + org.springframework.boot.web.embedded.jetty.Ssl . getKeyStore ( ) + STRING , java.io.IOException ) ; } if ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStoreType ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setKeyStoreType ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStoreType ( ) ) ; } if ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStoreProvider ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setKeyStoreProvider ( org.springframework.boot.web.embedded.jetty.Ssl . getKeyStoreProvider ( ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( SslContextFactory org.springframework.boot.web.embedded.jetty.SslContextFactory , Ssl org.springframework.boot.web.embedded.jetty.Ssl ) { if ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStorePassword ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setTrustStorePassword ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStorePassword ( ) ) ; } if ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStore ( ) != null ) { try { java.net.URL java.net.URL = ResourceUtils . getURL ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStore ( ) ) ; org.springframework.boot.web.embedded.jetty.SslContextFactory . setTrustStoreResource ( Resource . newResource ( java.net.URL ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new WebServerException ( STRING + org.springframework.boot.web.embedded.jetty.Ssl . getTrustStore ( ) + STRING , java.io.IOException ) ; } } if ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStoreType ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setTrustStoreType ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStoreType ( ) ) ; } if ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStoreProvider ( ) != null ) { org.springframework.boot.web.embedded.jetty.SslContextFactory . setTrustStoreProvider ( org.springframework.boot.web.embedded.jetty.Ssl . getTrustStoreProvider ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected final void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext , ServletContextInitializer ... org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) { Assert . notNull ( org.springframework.boot.web.embedded.jetty.WebAppContext , STRING ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . setTempDirectory ( java.io.File ( ) ) ; if ( this . org.springframework.boot.web.embedded.jetty.ResourceLoader != null ) { org.springframework.boot.web.embedded.jetty.WebAppContext . setClassLoader ( this . org.springframework.boot.web.embedded.jetty.ResourceLoader . getClassLoader ( ) ) ; } java.lang.String java.lang.String = getContextPath ( ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . setContextPath ( StringUtils . hasLength ( java.lang.String ) ? java.lang.String : STRING ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . setDisplayName ( getDisplayName ( ) ) ; void ( org.springframework.boot.web.embedded.jetty.WebAppContext ) ; if ( isRegisterDefaultServlet ( ) ) { void ( org.springframework.boot.web.embedded.jetty.WebAppContext ) ; } if ( shouldRegisterJspServlet ( ) ) { void ( org.springframework.boot.web.embedded.jetty.WebAppContext ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . addBean ( new JasperInitializer ( org.springframework.boot.web.embedded.jetty.WebAppContext ) , true ) ; } void ( org.springframework.boot.web.embedded.jetty.WebAppContext ) ; ServletContextInitializer [] org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] = mergeInitializers ( org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) ; Configuration [] org.springframework.boot.web.embedded.jetty.Configuration[] = org.springframework.boot.web.embedded.jetty.Configuration[] ( org.springframework.boot.web.embedded.jetty.WebAppContext , org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . setConfigurations ( org.springframework.boot.web.embedded.jetty.Configuration[] ) ; void ( org.springframework.boot.web.embedded.jetty.WebAppContext ) ; void ( org.springframework.boot.web.embedded.jetty.WebAppContext ) ; }  <METHOD_END>
<METHOD_START> private void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) { SessionHandler org.springframework.boot.web.embedded.jetty.SessionHandler = org.springframework.boot.web.embedded.jetty.WebAppContext . getSessionHandler ( ) ; org.springframework.boot.web.embedded.jetty.SessionHandler . setMaxInactiveInterval ( getSessionTimeout ( ) > NUMBER ? getSessionTimeout ( ) : - NUMBER ) ; if ( isPersistSession ( ) ) { DefaultSessionCache org.springframework.boot.web.embedded.jetty.DefaultSessionCache = new DefaultSessionCache ( org.springframework.boot.web.embedded.jetty.SessionHandler ) ; FileSessionDataStore org.springframework.boot.web.embedded.jetty.FileSessionDataStore = new FileSessionDataStore ( ) ; org.springframework.boot.web.embedded.jetty.FileSessionDataStore . setStoreDir ( getValidSessionStoreDir ( ) ) ; org.springframework.boot.web.embedded.jetty.DefaultSessionCache . setSessionDataStore ( org.springframework.boot.web.embedded.jetty.FileSessionDataStore ) ; org.springframework.boot.web.embedded.jetty.SessionHandler . setSessionCache ( org.springframework.boot.web.embedded.jetty.DefaultSessionCache ) ; } }  <METHOD_END>
<METHOD_START> private void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) { for ( java.util.Map . java.util.Map.Entry<java.util.Locale,java.nio.charset.Charset> < java.util.Locale , java.nio.charset.Charset > java.util.Map.Entry<java.util.Locale,java.nio.charset.Charset> : getLocaleCharsetMappings ( ) . entrySet ( ) ) { java.util.Locale java.util.Locale = java.util.Map.Entry<java.util.Locale,java.nio.charset.Charset> . java.util.Locale ( ) ; java.nio.charset.Charset java.nio.charset.Charset = java.util.Map.Entry<java.util.Locale,java.nio.charset.Charset> . java.nio.charset.Charset ( ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . addLocaleEncoding ( java.util.Locale . java.lang.String ( ) , java.nio.charset.Charset . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( ) { java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; return ( java.lang.String == null ? null : new java.io.File ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) { java.io.File java.io.File = getValidDocumentRoot ( ) ; java.io.File = ( java.io.File != null ? java.io.File : createTempDir ( STRING ) ) ; try { java.util.List<org.springframework.boot.web.embedded.jetty.Resource> < Resource > java.util.List<org.springframework.boot.web.embedded.jetty.Resource> = new java.util.ArrayList<org.springframework.boot.web.embedded.jetty.Resource> <> ( ) ; java.util.List<org.springframework.boot.web.embedded.jetty.Resource> . add ( java.io.File . boolean ( ) ? Resource . newResource ( java.io.File . java.io.File ( ) ) : JarResource . newJarResource ( Resource . newResource ( java.io.File ) ) ) ; for ( java.net.URL java.net.URL : this . getUrlsOfJarsWithMetaInfResources ( ) ) { Resource org.springframework.boot.web.embedded.jetty.Resource = org.springframework.boot.web.embedded.jetty.Resource ( java.net.URL ) ; if ( org.springframework.boot.web.embedded.jetty.Resource . exists ( ) && org.springframework.boot.web.embedded.jetty.Resource . isDirectory ( ) ) { java.util.List<org.springframework.boot.web.embedded.jetty.Resource> . add ( org.springframework.boot.web.embedded.jetty.Resource ) ; } } org.springframework.boot.web.embedded.jetty.WebAppContext . setBaseResource ( new ResourceCollection ( java.util.List<org.springframework.boot.web.embedded.jetty.Resource> . toArray ( new Resource [ java.util.List<org.springframework.boot.web.embedded.jetty.Resource> . size ( ) ] ) ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.Resource org.springframework.boot.web.embedded.jetty.Resource ( java.net.URL java.net.URL ) throws java.io.IOException { if ( STRING . boolean ( java.net.URL . java.lang.String ( ) ) ) { java.io.File java.io.File = new java.io.File ( java.net.URL . java.lang.String ( ) ) ; if ( java.io.File . boolean ( ) ) { return Resource . newResource ( STRING + java.net.URL + STRING ) ; } } return Resource . newResource ( java.net.URL + STRING ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) { Assert . notNull ( org.springframework.boot.web.embedded.jetty.WebAppContext , STRING ) ; ServletHolder org.springframework.boot.web.embedded.jetty.ServletHolder = new ServletHolder ( ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setName ( STRING ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setClassName ( STRING ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setInitParameter ( STRING , STRING ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setInitOrder ( NUMBER ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . getServletHandler ( ) . addServletWithMapping ( org.springframework.boot.web.embedded.jetty.ServletHolder , STRING ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . getServletHandler ( ) . getServletMapping ( STRING ) . setDefault ( true ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) { Assert . notNull ( org.springframework.boot.web.embedded.jetty.WebAppContext , STRING ) ; ServletHolder org.springframework.boot.web.embedded.jetty.ServletHolder = new ServletHolder ( ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setName ( STRING ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setClassName ( getJsp ( ) . getClassName ( ) ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setInitParameter ( STRING , STRING ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setInitParameters ( getJsp ( ) . getInitParameters ( ) ) ; org.springframework.boot.web.embedded.jetty.ServletHolder . setInitOrder ( NUMBER ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . getServletHandler ( ) . addServlet ( org.springframework.boot.web.embedded.jetty.ServletHolder ) ; ServletMapping org.springframework.boot.web.embedded.jetty.ServletMapping = new ServletMapping ( ) ; org.springframework.boot.web.embedded.jetty.ServletMapping . setServletName ( STRING ) ; org.springframework.boot.web.embedded.jetty.ServletMapping . setPathSpecs ( new java.lang.String [] { STRING , STRING } ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . getServletHandler ( ) . addServletMapping ( org.springframework.boot.web.embedded.jetty.ServletMapping ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.web.embedded.jetty.Configuration [] org.springframework.boot.web.embedded.jetty.Configuration[] ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext , ServletContextInitializer ... org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) { java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> < Configuration > java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> = new java.util.ArrayList<org.springframework.boot.web.embedded.jetty.Configuration> <> ( ) ; java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . add ( org.springframework.boot.web.embedded.jetty.Configuration ( org.springframework.boot.web.embedded.jetty.WebAppContext , org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) ) ; java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . addAll ( java.util.Collection<org.springframework.boot.web.embedded.jetty.Configuration> ( ) ) ; java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . add ( org.springframework.boot.web.embedded.jetty.Configuration ( ) ) ; java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . add ( org.springframework.boot.web.embedded.jetty.Configuration ( ) ) ; return java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . toArray ( new Configuration [ java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.Configuration org.springframework.boot.web.embedded.jetty.Configuration ( ) { return new AbstractConfiguration ( ) { @ java.lang.Override public void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) throws java.lang.Exception { ErrorHandler org.springframework.boot.web.embedded.jetty.ErrorHandler = org.springframework.boot.web.embedded.jetty.WebAppContext . getErrorHandler ( ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . setErrorHandler ( new JettyEmbeddedErrorHandler ( org.springframework.boot.web.embedded.jetty.ErrorHandler ) ) ; void ( org.springframework.boot.web.embedded.jetty.ErrorHandler , getErrorPages ( ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) throws java.lang.Exception { ErrorHandler org.springframework.boot.web.embedded.jetty.ErrorHandler = org.springframework.boot.web.embedded.jetty.WebAppContext . getErrorHandler ( ) ; org.springframework.boot.web.embedded.jetty.WebAppContext . setErrorHandler ( new JettyEmbeddedErrorHandler ( org.springframework.boot.web.embedded.jetty.ErrorHandler ) ) ; void ( org.springframework.boot.web.embedded.jetty.ErrorHandler , getErrorPages ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.web.embedded.jetty.Configuration org.springframework.boot.web.embedded.jetty.Configuration ( ) { return new AbstractConfiguration ( ) { @ java.lang.Override public void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) throws java.lang.Exception { MimeTypes org.springframework.boot.web.embedded.jetty.MimeTypes = org.springframework.boot.web.embedded.jetty.WebAppContext . getMimeTypes ( ) ; for ( MimeMappings . MimeMappings MimeMappings.Mapping : getMimeMappings ( ) ) { org.springframework.boot.web.embedded.jetty.MimeTypes . addMimeMapping ( MimeMappings.Mapping . getExtension ( ) , MimeMappings.Mapping . getMimeType ( ) ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) throws java.lang.Exception { MimeTypes org.springframework.boot.web.embedded.jetty.MimeTypes = org.springframework.boot.web.embedded.jetty.WebAppContext . getMimeTypes ( ) ; for ( MimeMappings . MimeMappings MimeMappings.Mapping : getMimeMappings ( ) ) { org.springframework.boot.web.embedded.jetty.MimeTypes . addMimeMapping ( MimeMappings.Mapping . getExtension ( ) , MimeMappings.Mapping . getMimeType ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.web.embedded.jetty.Configuration org.springframework.boot.web.embedded.jetty.Configuration ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext , ServletContextInitializer ... org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) { return new ServletContextInitializerConfiguration ( org.springframework.boot.web.embedded.jetty.ServletContextInitializer[] ) ; }  <METHOD_END>
<METHOD_START> protected void void ( WebAppContext org.springframework.boot.web.embedded.jetty.WebAppContext ) {	}  <METHOD_END>
<METHOD_START> protected org.springframework.boot.web.embedded.jetty.JettyWebServer org.springframework.boot.web.embedded.jetty.JettyWebServer ( Server org.springframework.boot.web.embedded.jetty.Server ) { return new JettyWebServer ( org.springframework.boot.web.embedded.jetty.Server , getPort ( ) >= NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceLoader org.springframework.boot.web.embedded.jetty.ResourceLoader ) { this . org.springframework.boot.web.embedded.jetty.ResourceLoader = org.springframework.boot.web.embedded.jetty.ResourceLoader ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Collection<? extends org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> < ? extends JettyServerCustomizer > java.util.Collection<? extends org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> ) { Assert . notNull ( java.util.Collection<> , STRING ) ; this . java.util.List<org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> = new java.util.ArrayList <> ( java.util.Collection<> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Collection<org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> < JettyServerCustomizer > java.util.Collection<org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> ( ) { return this . java.util.List<org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> ; }  <METHOD_END>
<METHOD_START> public void void ( JettyServerCustomizer ... org.springframework.boot.web.embedded.jetty.JettyServerCustomizer[] ) { Assert . notNull ( org.springframework.boot.web.embedded.jetty.JettyServerCustomizer[] , STRING ) ; this . java.util.List<org.springframework.boot.web.embedded.jetty.JettyServerCustomizer> . addAll ( java.util.Arrays . java.util.List ( org.springframework.boot.web.embedded.jetty.JettyServerCustomizer[] ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Collection<? extends org.springframework.boot.web.embedded.jetty.Configuration> < ? extends Configuration > java.util.Collection<? extends org.springframework.boot.web.embedded.jetty.Configuration> ) { Assert . notNull ( java.util.Collection<> , STRING ) ; this . java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> = new java.util.ArrayList <> ( java.util.Collection<> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Collection<org.springframework.boot.web.embedded.jetty.Configuration> < Configuration > java.util.Collection<org.springframework.boot.web.embedded.jetty.Configuration> ( ) { return this . java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> ; }  <METHOD_END>
<METHOD_START> public void void ( Configuration ... org.springframework.boot.web.embedded.jetty.Configuration[] ) { Assert . notNull ( org.springframework.boot.web.embedded.jetty.Configuration[] , STRING ) ; this . java.util.List<org.springframework.boot.web.embedded.jetty.Configuration> . addAll ( java.util.Arrays . java.util.List ( org.springframework.boot.web.embedded.jetty.Configuration[] ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.web.embedded.jetty.ThreadPool org.springframework.boot.web.embedded.jetty.ThreadPool ( ) { return this . org.springframework.boot.web.embedded.jetty.ThreadPool ; }  <METHOD_END>
<METHOD_START> public void void ( ThreadPool org.springframework.boot.web.embedded.jetty.ThreadPool ) { this . org.springframework.boot.web.embedded.jetty.ThreadPool = org.springframework.boot.web.embedded.jetty.ThreadPool ; }  <METHOD_END>
<METHOD_START> private void void ( ErrorHandler org.springframework.boot.web.embedded.jetty.ErrorHandler , java.util.Collection<org.springframework.boot.web.embedded.jetty.ErrorPage> < ErrorPage > java.util.Collection<org.springframework.boot.web.embedded.jetty.ErrorPage> ) { if ( org.springframework.boot.web.embedded.jetty.ErrorHandler instanceof ErrorPageErrorHandler ) { ErrorPageErrorHandler org.springframework.boot.web.embedded.jetty.ErrorPageErrorHandler = ( ErrorPageErrorHandler ) org.springframework.boot.web.embedded.jetty.ErrorHandler ; for ( ErrorPage org.springframework.boot.web.embedded.jetty.ErrorPage : java.util.Collection<org.springframework.boot.web.embedded.jetty.ErrorPage> ) { if ( org.springframework.boot.web.embedded.jetty.ErrorPage . isGlobal ( ) ) { org.springframework.boot.web.embedded.jetty.ErrorPageErrorHandler . addErrorPage ( ErrorPageErrorHandler . GLOBAL_ERROR_PAGE , org.springframework.boot.web.embedded.jetty.ErrorPage . getPath ( ) ) ; } else { if ( org.springframework.boot.web.embedded.jetty.ErrorPage . getExceptionName ( ) != null ) { org.springframework.boot.web.embedded.jetty.ErrorPageErrorHandler . addErrorPage ( org.springframework.boot.web.embedded.jetty.ErrorPage . getExceptionName ( ) , org.springframework.boot.web.embedded.jetty.ErrorPage . getPath ( ) ) ; } else { org.springframework.boot.web.embedded.jetty.ErrorPageErrorHandler . addErrorPage ( org.springframework.boot.web.embedded.jetty.ErrorPage . getStatusCode ( ) , org.springframework.boot.web.embedded.jetty.ErrorPage . getPath ( ) ) ; } } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Server org.springframework.boot.web.embedded.jetty.Server ) { ForwardedRequestCustomizer org.springframework.boot.web.embedded.jetty.ForwardedRequestCustomizer = new ForwardedRequestCustomizer ( ) ; for ( Connector org.springframework.boot.web.embedded.jetty.Connector : org.springframework.boot.web.embedded.jetty.Server . getConnectors ( ) ) { for ( ConnectionFactory org.springframework.boot.web.embedded.jetty.ConnectionFactory : org.springframework.boot.web.embedded.jetty.Connector . getConnectionFactories ( ) ) { if ( org.springframework.boot.web.embedded.jetty.ConnectionFactory instanceof HttpConfiguration . HttpConfiguration ) { ( ( HttpConfiguration . HttpConfiguration ) org.springframework.boot.web.embedded.jetty.ConnectionFactory ) . getHttpConfiguration ( ) . addCustomizer ( org.springframework.boot.web.embedded.jetty.ForwardedRequestCustomizer ) ; } } } }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , Request org.springframework.boot.web.embedded.jetty.Request , HttpServletRequest org.springframework.boot.web.embedded.jetty.HttpServletRequest , HttpServletResponse org.springframework.boot.web.embedded.jetty.HttpServletResponse ) throws java.io.IOException , org.springframework.boot.web.embedded.jetty.ServletException { if ( ! org.springframework.boot.web.embedded.jetty.HttpServletResponse . getHeaderNames ( ) . contains ( java.lang.String ) ) { org.springframework.boot.web.embedded.jetty.HttpServletResponse . setHeader ( java.lang.String , this . java.lang.String ) ; } super. handle ( java.lang.String , org.springframework.boot.web.embedded.jetty.Request , org.springframework.boot.web.embedded.jetty.HttpServletRequest , org.springframework.boot.web.embedded.jetty.HttpServletResponse ) ; }  <METHOD_END>
