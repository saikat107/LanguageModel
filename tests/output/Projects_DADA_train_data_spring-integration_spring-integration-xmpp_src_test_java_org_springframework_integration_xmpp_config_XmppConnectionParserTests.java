<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.xmpp.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.xmpp.config.XmppConnectionParserTests> ( ) ) ; XMPPConnection org.springframework.integration.xmpp.config.XMPPConnection = org.springframework.integration.xmpp.config.ConfigurableApplicationContext . getBean ( STRING , XMPPConnection .class ) ; assertEquals ( STRING , org.springframework.integration.xmpp.config.XMPPConnection . getServiceName ( ) ) ; assertFalse ( org.springframework.integration.xmpp.config.XMPPConnection . isConnected ( ) ) ; XmppConnectionFactoryBean org.springframework.integration.xmpp.config.XmppConnectionFactoryBean = org.springframework.integration.xmpp.config.ConfigurableApplicationContext . getBean ( STRING , XmppConnectionFactoryBean .class ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertNull ( TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) . toString ( ) ) ; org.springframework.integration.xmpp.config.XmppConnectionFactoryBean = org.springframework.integration.xmpp.config.ConfigurableApplicationContext . getBean ( STRING , XmppConnectionFactoryBean .class ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertNull ( TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; org.springframework.integration.xmpp.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.xmpp.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.xmpp.config.XmppConnectionParserTests> ( ) ) ; assertTrue ( org.springframework.integration.xmpp.config.ConfigurableApplicationContext . containsBean ( STRING ) ) ; org.springframework.integration.xmpp.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.integration.xmpp.config.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.integration.xmpp.config.XmppConnectionParserTests> ( ) ) ; XMPPConnection org.springframework.integration.xmpp.config.XMPPConnection = org.springframework.integration.xmpp.config.ConfigurableApplicationContext . getBean ( STRING , XMPPConnection .class ) ; assertEquals ( STRING , org.springframework.integration.xmpp.config.XMPPConnection . getServiceName ( ) ) ; assertFalse ( org.springframework.integration.xmpp.config.XMPPConnection . isConnected ( ) ) ; XmppConnectionFactoryBean org.springframework.integration.xmpp.config.XmppConnectionFactoryBean = org.springframework.integration.xmpp.config.ConfigurableApplicationContext . getBean ( STRING , XmppConnectionFactoryBean .class ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( org.springframework.integration.xmpp.config.XmppConnectionFactoryBean , STRING ) . toString ( ) ) ; org.springframework.integration.xmpp.config.ConfigurableApplicationContext . close ( ) ; }  <METHOD_END>