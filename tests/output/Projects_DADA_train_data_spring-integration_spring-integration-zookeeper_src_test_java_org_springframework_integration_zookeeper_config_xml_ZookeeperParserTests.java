<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertFalse ( this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator . isAutoStartup ( ) ) ; assertEquals ( NUMBER , this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator . getPhase ( ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator , STRING ) ) ; assertEquals ( STRING , TestUtils . getPropertyValue ( this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator , STRING ) ) ; assertSame ( this . org.springframework.integration.zookeeper.config.xml.CuratorFramework , TestUtils . getPropertyValue ( this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator , STRING ) ) ; this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator . start ( ) ; int int = NUMBER ; while ( int ++ < NUMBER && ! this . org.springframework.integration.zookeeper.config.xml.SourcePollingChannelAdapter . isRunning ( ) ) { java.lang.Thread . void ( NUMBER ) ; } assertTrue ( this . org.springframework.integration.zookeeper.config.xml.SourcePollingChannelAdapter . isRunning ( ) ) ; this . org.springframework.integration.zookeeper.config.xml.LeaderInitiator . stop ( ) ; int = NUMBER ; while ( int ++ < NUMBER && this . org.springframework.integration.zookeeper.config.xml.SourcePollingChannelAdapter . isRunning ( ) ) { java.lang.Thread . void ( NUMBER ) ; } assertFalse ( this . org.springframework.integration.zookeeper.config.xml.SourcePollingChannelAdapter . isRunning ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.zookeeper.config.xml.CuratorFramework org.springframework.integration.zookeeper.config.xml.CuratorFramework ( ) java.lang.Exception { return createNewClient ( ) ; }  <METHOD_END>
