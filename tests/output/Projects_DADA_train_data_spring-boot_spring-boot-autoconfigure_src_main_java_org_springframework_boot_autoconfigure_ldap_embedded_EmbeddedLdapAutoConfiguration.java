<METHOD_START> public void ( EmbeddedLdapProperties org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties , LdapProperties org.springframework.boot.autoconfigure.ldap.embedded.LdapProperties , ConfigurableApplicationContext org.springframework.boot.autoconfigure.ldap.embedded.ConfigurableApplicationContext , Environment org.springframework.boot.autoconfigure.ldap.embedded.Environment ) { this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties = org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties ; this . org.springframework.boot.autoconfigure.ldap.embedded.LdapProperties = org.springframework.boot.autoconfigure.ldap.embedded.LdapProperties ; this . org.springframework.boot.autoconfigure.ldap.embedded.ConfigurableApplicationContext = org.springframework.boot.autoconfigure.ldap.embedded.ConfigurableApplicationContext ; this . org.springframework.boot.autoconfigure.ldap.embedded.Environment = org.springframework.boot.autoconfigure.ldap.embedded.Environment ; }  <METHOD_END>
<METHOD_START> @ Bean @ DependsOn ( STRING ) @ ConditionalOnMissingBean public org.springframework.boot.autoconfigure.ldap.embedded.ContextSource org.springframework.boot.autoconfigure.ldap.embedded.ContextSource ( ) { LdapContextSource org.springframework.boot.autoconfigure.ldap.embedded.LdapContextSource = new LdapContextSource ( ) ; if ( boolean ( this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getCredential ( ) ) ) { org.springframework.boot.autoconfigure.ldap.embedded.LdapContextSource . setUserDn ( this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getCredential ( ) . getUsername ( ) ) ; org.springframework.boot.autoconfigure.ldap.embedded.LdapContextSource . setPassword ( this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getCredential ( ) . getPassword ( ) ) ; } org.springframework.boot.autoconfigure.ldap.embedded.LdapContextSource . setUrls ( this . org.springframework.boot.autoconfigure.ldap.embedded.LdapProperties . determineUrls ( this . org.springframework.boot.autoconfigure.ldap.embedded.Environment ) ) ; return org.springframework.boot.autoconfigure.ldap.embedded.LdapContextSource ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer ( ) org.springframework.boot.autoconfigure.ldap.embedded.LDAPException { InMemoryDirectoryServerConfig org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig = new InMemoryDirectoryServerConfig ( this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getBaseDn ( ) ) ; if ( boolean ( this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getCredential ( ) ) ) { org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig . addAdditionalBindCredentials ( this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getCredential ( ) . getUsername ( ) , this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getCredential ( ) . getPassword ( ) ) ; } void ( org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig ) ; InMemoryListenerConfig org.springframework.boot.autoconfigure.ldap.embedded.InMemoryListenerConfig = InMemoryListenerConfig . createLDAPConfig ( STRING , this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getPort ( ) ) ; org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig . setListenerConfigs ( org.springframework.boot.autoconfigure.ldap.embedded.InMemoryListenerConfig ) ; this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer = new InMemoryDirectoryServer ( org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig ) ; void ( ) ; this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer . startListening ( ) ; void ( this . org.springframework.boot.autoconfigure.ldap.embedded.ConfigurableApplicationContext , this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer . getListenPort ( ) ) ; return this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer ; }  <METHOD_END>
<METHOD_START> private void void ( InMemoryDirectoryServerConfig org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig ) { if ( ! this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getValidation ( ) . isEnabled ( ) ) { org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig . setSchema ( null ) ; return; } Resource org.springframework.boot.autoconfigure.ldap.embedded.Resource = this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getValidation ( ) . getSchema ( ) ; if ( org.springframework.boot.autoconfigure.ldap.embedded.Resource != null ) { void ( org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig , org.springframework.boot.autoconfigure.ldap.embedded.Resource ) ; } }  <METHOD_END>
<METHOD_START> private void void ( InMemoryDirectoryServerConfig org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig , Resource org.springframework.boot.autoconfigure.ldap.embedded.Resource ) { try { Schema org.springframework.boot.autoconfigure.ldap.embedded.Schema = Schema . getDefaultStandardSchema ( ) ; Schema org.springframework.boot.autoconfigure.ldap.embedded.Schema = Schema . getSchema ( org.springframework.boot.autoconfigure.ldap.embedded.Resource . getInputStream ( ) ) ; org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServerConfig . setSchema ( Schema . mergeSchemas ( org.springframework.boot.autoconfigure.ldap.embedded.Schema , org.springframework.boot.autoconfigure.ldap.embedded.Schema ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.boot.autoconfigure.ldap.embedded.Resource . getDescription ( ) , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( Credential org.springframework.boot.autoconfigure.ldap.embedded.Credential ) { return StringUtils . hasText ( org.springframework.boot.autoconfigure.ldap.embedded.Credential . getUsername ( ) ) && StringUtils . hasText ( org.springframework.boot.autoconfigure.ldap.embedded.Credential . getPassword ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.boot.autoconfigure.ldap.embedded.LDAPException { java.lang.String java.lang.String = this . org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties . getLdif ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { try { Resource org.springframework.boot.autoconfigure.ldap.embedded.Resource = this . org.springframework.boot.autoconfigure.ldap.embedded.ConfigurableApplicationContext . getResource ( java.lang.String ) ; if ( org.springframework.boot.autoconfigure.ldap.embedded.Resource . exists ( ) ) { java.io.InputStream java.io.InputStream = org.springframework.boot.autoconfigure.ldap.embedded.Resource . getInputStream ( ) ; try { this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer . importFromLDIF ( true , new LDIFReader ( java.io.InputStream ) ) ; } finally { java.io.InputStream . void ( ) ; } } } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String , java.lang.Exception ) ; } } }  <METHOD_END>
<METHOD_START> private void void ( ApplicationContext org.springframework.boot.autoconfigure.ldap.embedded.ApplicationContext , int int ) { if ( org.springframework.boot.autoconfigure.ldap.embedded.ApplicationContext instanceof ConfigurableApplicationContext ) { MutablePropertySources org.springframework.boot.autoconfigure.ldap.embedded.MutablePropertySources = ( ( ConfigurableApplicationContext ) org.springframework.boot.autoconfigure.ldap.embedded.ApplicationContext ) . getEnvironment ( ) . getPropertySources ( ) ; java.util.Map<java.lang.String,java.lang.Object> ( org.springframework.boot.autoconfigure.ldap.embedded.MutablePropertySources ) . put ( STRING , int ) ; } if ( org.springframework.boot.autoconfigure.ldap.embedded.ApplicationContext . getParent ( ) != null ) { void ( org.springframework.boot.autoconfigure.ldap.embedded.ApplicationContext . getParent ( ) , int ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( MutablePropertySources org.springframework.boot.autoconfigure.ldap.embedded.MutablePropertySources ) { PropertySource < ? > org.springframework.boot.autoconfigure.ldap.embedded.PropertySource<?> = org.springframework.boot.autoconfigure.ldap.embedded.MutablePropertySources . get ( java.lang.String ) ; if ( org.springframework.boot.autoconfigure.ldap.embedded.PropertySource<> == null ) { org.springframework.boot.autoconfigure.ldap.embedded.PropertySource<?> = new MapPropertySource ( java.lang.String , new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ) ; org.springframework.boot.autoconfigure.ldap.embedded.MutablePropertySources . addFirst ( org.springframework.boot.autoconfigure.ldap.embedded.PropertySource<> ) ; } return ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) org.springframework.boot.autoconfigure.ldap.embedded.PropertySource<> . getSource ( ) ; }  <METHOD_END>
<METHOD_START> @ javax.annotation.PreDestroy public void void ( ) { if ( this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer != null ) { this . org.springframework.boot.autoconfigure.ldap.embedded.InMemoryDirectoryServer . shutDown ( true ) ; } }  <METHOD_END>
