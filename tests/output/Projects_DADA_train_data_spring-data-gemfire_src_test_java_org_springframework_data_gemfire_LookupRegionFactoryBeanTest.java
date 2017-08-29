<METHOD_START> protected org.springframework.data.gemfire.AsyncEventQueue org.springframework.data.gemfire.AsyncEventQueue ( final java.lang.String java.lang.String ) { AsyncEventQueue org.springframework.data.gemfire.AsyncEventQueue = mock ( AsyncEventQueue .class , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; when ( org.springframework.data.gemfire.AsyncEventQueue . getId ( ) ) . thenReturn ( java.lang.String ) ; return org.springframework.data.gemfire.AsyncEventQueue ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.GatewaySender org.springframework.data.gemfire.GatewaySender ( final java.lang.String java.lang.String ) { GatewaySender org.springframework.data.gemfire.GatewaySender = mock ( GatewaySender .class , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; when ( org.springframework.data.gemfire.GatewaySender . getId ( ) ) . thenReturn ( java.lang.String ) ; return org.springframework.data.gemfire.GatewaySender ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Cache org.springframework.data.gemfire.Cache = mock ( Cache .class , STRING ) ; Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> = mock ( Region .class , STRING ) ; RegionAttributes < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.RegionAttributes<java.lang.Object,java.lang.Object> = mock ( RegionAttributes .class , STRING ) ; EvictionAttributesMutator org.springframework.data.gemfire.EvictionAttributesMutator = mock ( EvictionAttributesMutator .class , STRING ) ; AttributesMutator < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> = mock ( AttributesMutator .class , STRING ) ; when ( org.springframework.data.gemfire.Cache . getRegion ( eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getFullPath ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getName ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getAttributes ( ) ) . thenReturn ( org.springframework.data.gemfire.RegionAttributes<java.lang.Object,java.lang.Object> ) ; when ( org.springframework.data.gemfire.RegionAttributes<java.lang.Object,java.lang.Object> . getStatisticsEnabled ( ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getAttributesMutator ( ) ) . thenReturn ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> ) ; when ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> . getEvictionAttributesMutator ( ) ) . thenReturn ( org.springframework.data.gemfire.EvictionAttributesMutator ) ; AsyncEventQueue org.springframework.data.gemfire.AsyncEventQueue = org.springframework.data.gemfire.AsyncEventQueue ( STRING ) ; AsyncEventQueue org.springframework.data.gemfire.AsyncEventQueue = org.springframework.data.gemfire.AsyncEventQueue ( STRING ) ; CacheListener org.springframework.data.gemfire.CacheListener = mock ( CacheListener .class , STRING ) ; CacheListener org.springframework.data.gemfire.CacheListener = mock ( CacheListener .class , STRING ) ; CacheListener org.springframework.data.gemfire.CacheListener = mock ( CacheListener .class , STRING ) ; CacheLoader org.springframework.data.gemfire.CacheLoader = mock ( CacheLoader .class , STRING ) ; CacheWriter org.springframework.data.gemfire.CacheWriter = mock ( CacheWriter .class , STRING ) ; CustomExpiry org.springframework.data.gemfire.CustomExpiry = mock ( CustomExpiry .class , STRING ) ; CustomExpiry org.springframework.data.gemfire.CustomExpiry = mock ( CustomExpiry .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.ExpirationAttributes = mock ( ExpirationAttributes .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.ExpirationAttributes = mock ( ExpirationAttributes .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.ExpirationAttributes = mock ( ExpirationAttributes .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.ExpirationAttributes = mock ( ExpirationAttributes .class , STRING ) ; GatewaySender org.springframework.data.gemfire.GatewaySender = org.springframework.data.gemfire.GatewaySender ( STRING ) ; LookupRegionFactoryBean org.springframework.data.gemfire.LookupRegionFactoryBean = new LookupRegionFactoryBean ( ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setAsyncEventQueues ( new AsyncEventQueue [] { org.springframework.data.gemfire.AsyncEventQueue , org.springframework.data.gemfire.AsyncEventQueue } ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setBeanName ( STRING ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCacheLoader ( org.springframework.data.gemfire.CacheLoader ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCacheWriter ( org.springframework.data.gemfire.CacheWriter ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCloningEnabled ( true ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCustomEntryIdleTimeout ( org.springframework.data.gemfire.CustomExpiry ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCustomEntryTimeToLive ( org.springframework.data.gemfire.CustomExpiry ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setEntryIdleTimeout ( org.springframework.data.gemfire.ExpirationAttributes ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setEntryTimeToLive ( org.springframework.data.gemfire.ExpirationAttributes ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setGatewaySenders ( new GatewaySender [] { org.springframework.data.gemfire.GatewaySender } ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setEvictionMaximum ( NUMBER ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setRegionIdleTimeout ( org.springframework.data.gemfire.ExpirationAttributes ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setRegionTimeToLive ( org.springframework.data.gemfire.ExpirationAttributes ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setStatisticsEnabled ( true ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCacheListeners ( new CacheListener [] { org.springframework.data.gemfire.CacheListener , org.springframework.data.gemfire.CacheListener , org.springframework.data.gemfire.CacheListener } ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . afterPropertiesSet ( ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . addAsyncEventQueueId ( eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . addAsyncEventQueueId ( eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . addCacheListener ( same ( org.springframework.data.gemfire.CacheListener ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . addCacheListener ( same ( org.springframework.data.gemfire.CacheListener ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . addCacheListener ( same ( org.springframework.data.gemfire.CacheListener ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setCacheLoader ( same ( org.springframework.data.gemfire.CacheLoader ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setCacheWriter ( same ( org.springframework.data.gemfire.CacheWriter ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setCloningEnabled ( eq ( true ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setCustomEntryIdleTimeout ( same ( org.springframework.data.gemfire.CustomExpiry ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setCustomEntryTimeToLive ( same ( org.springframework.data.gemfire.CustomExpiry ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setEntryIdleTimeout ( same ( org.springframework.data.gemfire.ExpirationAttributes ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setEntryTimeToLive ( same ( org.springframework.data.gemfire.ExpirationAttributes ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . addGatewaySenderId ( eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.EvictionAttributesMutator , times ( NUMBER ) ) . setMaximum ( eq ( NUMBER ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setRegionIdleTimeout ( same ( org.springframework.data.gemfire.ExpirationAttributes ) ) ; verify ( org.springframework.data.gemfire.AttributesMutator<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . setRegionTimeToLive ( same ( org.springframework.data.gemfire.ExpirationAttributes ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Cache org.springframework.data.gemfire.Cache = mock ( Cache .class , STRING ) ; Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> = mock ( Region .class , STRING ) ; RegionAttributes < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.RegionAttributes<java.lang.Object,java.lang.Object> = mock ( RegionAttributes .class , STRING ) ; AttributesMutator org.springframework.data.gemfire.AttributesMutator = mock ( AttributesMutator .class , STRING ) ; ExpirationAttributes org.springframework.data.gemfire.ExpirationAttributes = mock ( ExpirationAttributes .class , STRING ) ; when ( org.springframework.data.gemfire.Cache . getRegion ( eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getFullPath ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getName ( ) ) . thenReturn ( STRING ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getAttributes ( ) ) . thenReturn ( org.springframework.data.gemfire.RegionAttributes<java.lang.Object,java.lang.Object> ) ; when ( org.springframework.data.gemfire.Region<java.lang.Object,java.lang.Object> . getAttributesMutator ( ) ) . thenReturn ( org.springframework.data.gemfire.AttributesMutator ) ; when ( org.springframework.data.gemfire.RegionAttributes<java.lang.Object,java.lang.Object> . getStatisticsEnabled ( ) ) . thenReturn ( false ) ; LookupRegionFactoryBean org.springframework.data.gemfire.LookupRegionFactoryBean = new LookupRegionFactoryBean ( ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setBeanName ( STRING ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setCache ( org.springframework.data.gemfire.Cache ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setEntryTimeToLive ( org.springframework.data.gemfire.ExpirationAttributes ) ; assertTrue ( org.springframework.data.gemfire.LookupRegionFactoryBean . isStatisticsEnabled ( ) ) ; try { org.springframework.data.gemfire.LookupRegionFactoryBean . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertEquals ( STRING , java.lang.IllegalStateException . java.lang.String ( ) ) ; throw java.lang.IllegalStateException ; } finally { verify ( org.springframework.data.gemfire.AttributesMutator , never ( ) ) . setEntryTimeToLive ( any ( ExpirationAttributes .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LookupRegionFactoryBean org.springframework.data.gemfire.LookupRegionFactoryBean = new LookupRegionFactoryBean ( ) ; assertTrue ( org.springframework.data.gemfire.LookupRegionFactoryBean . isLookupEnabled ( ) ) ; org.springframework.data.gemfire.LookupRegionFactoryBean . setLookupEnabled ( false ) ; assertTrue ( org.springframework.data.gemfire.LookupRegionFactoryBean . isLookupEnabled ( ) ) ; }  <METHOD_END>
