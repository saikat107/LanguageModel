<METHOD_START> @ Test @ Ignore public void void ( ) { DefaultSftpSessionFactory org.springframework.integration.sftp.session.DefaultSftpSessionFactory = new DefaultSftpSessionFactory ( ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setHost ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPort ( NUMBER ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setUser ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPassword ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setAllowUnknownKeys ( true ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . getSession ( ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { DefaultSftpSessionFactory org.springframework.integration.sftp.session.DefaultSftpSessionFactory = new DefaultSftpSessionFactory ( ) ; JschProxyFactoryBean org.springframework.integration.sftp.session.JschProxyFactoryBean = new JschProxyFactoryBean ( JschProxyFactoryBean . Type . SOCKS5 , STRING , NUMBER , STRING , STRING ) ; org.springframework.integration.sftp.session.JschProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setHost ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPort ( NUMBER ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setUser ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setPassword ( STRING ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setProxy ( org.springframework.integration.sftp.session.JschProxyFactoryBean . getObject ( ) ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . setAllowUnknownKeys ( true ) ; org.springframework.integration.sftp.session.DefaultSftpSessionFactory . getSession ( ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { JschProxyFactoryBean org.springframework.integration.sftp.session.JschProxyFactoryBean = new JschProxyFactoryBean ( JschProxyFactoryBean . Type . SOCKS5 , STRING , NUMBER , STRING , STRING ) ; org.springframework.integration.sftp.session.JschProxyFactoryBean . afterPropertiesSet ( ) ; Proxy org.springframework.integration.sftp.session.Proxy = org.springframework.integration.sftp.session.JschProxyFactoryBean . getObject ( ) ; void ( org.springframework.integration.sftp.session.Proxy , ProxySOCKS5 .class ) ; org.springframework.integration.sftp.session.JschProxyFactoryBean = new JschProxyFactoryBean ( JschProxyFactoryBean . Type . SOCKS4 , STRING , NUMBER , STRING , STRING ) ; org.springframework.integration.sftp.session.JschProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.sftp.session.Proxy = org.springframework.integration.sftp.session.JschProxyFactoryBean . getObject ( ) ; void ( org.springframework.integration.sftp.session.Proxy , ProxySOCKS4 .class ) ; org.springframework.integration.sftp.session.JschProxyFactoryBean = new JschProxyFactoryBean ( JschProxyFactoryBean . Type . HTTP , STRING , NUMBER , STRING , STRING ) ; org.springframework.integration.sftp.session.JschProxyFactoryBean . afterPropertiesSet ( ) ; org.springframework.integration.sftp.session.Proxy = org.springframework.integration.sftp.session.JschProxyFactoryBean . getObject ( ) ; void ( org.springframework.integration.sftp.session.Proxy , ProxyHTTP .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( Proxy org.springframework.integration.sftp.session.Proxy , java.lang.Class<? extends org.springframework.integration.sftp.session.Proxy> < ? extends Proxy > java.lang.Class<? extends org.springframework.integration.sftp.session.Proxy> ) { assertThat ( org.springframework.integration.sftp.session.Proxy , instanceOf ( java.lang.Class<> ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.sftp.session.Proxy , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.sftp.session.Proxy , STRING ) ) ; }  <METHOD_END>
