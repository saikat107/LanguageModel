<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { CacheServer org.springframework.data.gemfire.config.xml.CacheServer = org.springframework.data.gemfire.config.xml.ApplicationContext . getBean ( STRING , CacheServer .class ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.CacheServer ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.CacheServer . getGroups ( ) . length ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.CacheServer . getBindAddress ( ) ) ; assertTrue ( org.springframework.data.gemfire.config.xml.CacheServer . getPort ( ) != NUMBER ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.CacheServer . getHostnameForClients ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.CacheServer . getGroups ( ) [ NUMBER ] ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.CacheServer . getLoadPollInterval ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.CacheServer . getMaxConnections ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.CacheServer . getMaxThreads ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.CacheServer . getMaximumMessageCount ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.CacheServer . getMaximumTimeBetweenPings ( ) ) ; assertTrue ( org.springframework.data.gemfire.config.xml.CacheServer . isRunning ( ) ) ; ClientSubscriptionConfig org.springframework.data.gemfire.config.xml.ClientSubscriptionConfig = org.springframework.data.gemfire.config.xml.CacheServer . getClientSubscriptionConfig ( ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.ClientSubscriptionConfig ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.ClientSubscriptionConfig . getCapacity ( ) ) ; assertTrue ( STRING . boolean ( org.springframework.data.gemfire.config.xml.ClientSubscriptionConfig . getEvictionPolicy ( ) ) ) ; assertTrue ( java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.config.xml.ClientSubscriptionConfig . getDiskStoreName ( ) ) , StringUtils . isEmpty ( org.springframework.data.gemfire.config.xml.ClientSubscriptionConfig . getDiskStoreName ( ) ) ) ; }  <METHOD_END>