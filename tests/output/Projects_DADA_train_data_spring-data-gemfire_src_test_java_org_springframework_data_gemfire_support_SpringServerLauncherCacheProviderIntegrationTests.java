<METHOD_START> @ After public void void ( ) { java.lang.System . java.lang.String ( java.lang.String ( ) ) ; SpringContextBootstrappingInitializer . getApplicationContext ( ) . close ( ) ; GemfireUtils . closeClientCache ( ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return ( GemfireUtils . GEMFIRE_PREFIX + GemfireUtils . NAME_PROPERTY_NAME ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = java.lang.Class<? extends org.springframework.data.gemfire.support.SpringServerLauncherCacheProviderIntegrationTests> ( ) . java.lang.String ( ) + STRING ; ServerLauncher . ServerLauncher ServerLauncher.Builder = new ServerLauncher . ServerLauncher ( ) ; ServerLauncher.Builder . setSpringXmlLocation ( java.lang.String ) ; ServerLauncher.Builder . setMemberName ( STRING ) ; ServerLauncher.Builder . setDisableDefaultServer ( true ) ; ServerLauncher org.springframework.data.gemfire.support.ServerLauncher = ServerLauncher.Builder . build ( ) ; ServerState org.springframework.data.gemfire.support.ServerState = org.springframework.data.gemfire.support.ServerLauncher . start ( ) ; assertThat ( org.springframework.data.gemfire.support.ServerState . getStatus ( ) , is ( equalTo ( Status . ONLINE ) ) ) ; ConfigurableApplicationContext org.springframework.data.gemfire.support.ConfigurableApplicationContext = SpringContextBootstrappingInitializer . getApplicationContext ( ) ; Cache org.springframework.data.gemfire.support.Cache = org.springframework.data.gemfire.support.ConfigurableApplicationContext . getBean ( Cache .class ) ; assertThat ( org.springframework.data.gemfire.support.Cache , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.gemfire.support.Cache . getResourceManager ( ) . getCriticalHeapPercentage ( ) , is ( equalTo ( NUMBER ) ) ) ; org.springframework.data.gemfire.support.ServerState = org.springframework.data.gemfire.support.ServerLauncher . stop ( ) ; assertThat ( org.springframework.data.gemfire.support.ServerState . getStatus ( ) , is ( equalTo ( Status . STOPPED ) ) ) ; }  <METHOD_END>
