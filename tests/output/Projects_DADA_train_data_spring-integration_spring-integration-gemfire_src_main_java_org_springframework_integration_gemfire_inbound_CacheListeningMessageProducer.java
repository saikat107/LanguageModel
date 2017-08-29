<METHOD_START> public void ( Region < ? , ? > org.springframework.integration.gemfire.inbound.Region<?,?> ) { Assert . notNull ( org.springframework.integration.gemfire.inbound.Region<,> , STRING ) ; this . org.springframework.integration.gemfire.inbound.Region = org.springframework.integration.gemfire.inbound.Region<,> ; this . org.springframework.integration.gemfire.inbound.CacheListener<?,?> = new org.springframework.integration.gemfire.inbound.CacheListeningMessageProducer.MessageProducingCacheListener ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( EventType ... org.springframework.integration.gemfire.inbound.EventType[] ) { Assert . notEmpty ( org.springframework.integration.gemfire.inbound.EventType[] , STRING ) ; this . java.util.Set<org.springframework.integration.gemfire.inbound.EventType> = new java.util.HashSet<org.springframework.integration.gemfire.inbound.EventType> < EventType > ( java.util.Arrays . java.util.List ( org.springframework.integration.gemfire.inbound.EventType[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( this . org.springframework.integration.gemfire.inbound.Log . isInfoEnabled ( ) ) { this . org.springframework.integration.gemfire.inbound.Log . info ( STRING + this . org.springframework.integration.gemfire.inbound.Region . getName ( ) + STRING ) ; } this . org.springframework.integration.gemfire.inbound.Region . getAttributesMutator ( ) . addCacheListener ( this . org.springframework.integration.gemfire.inbound.CacheListener<,> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( this . org.springframework.integration.gemfire.inbound.Log . isInfoEnabled ( ) ) { this . org.springframework.integration.gemfire.inbound.Log . info ( STRING + this . org.springframework.integration.gemfire.inbound.Region . getName ( ) + STRING ) ; } try { this . org.springframework.integration.gemfire.inbound.Region . getAttributesMutator ( ) . removeCacheListener ( this . org.springframework.integration.gemfire.inbound.CacheListener<,> ) ; } catch ( CacheClosedException org.springframework.integration.gemfire.inbound.CacheClosedException ) { if ( this . org.springframework.integration.gemfire.inbound.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.gemfire.inbound.Log . debug ( org.springframework.integration.gemfire.inbound.CacheClosedException . getMessage ( ) , org.springframework.integration.gemfire.inbound.CacheClosedException ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EntryEvent org.springframework.integration.gemfire.inbound.EntryEvent ) { if ( org.springframework.integration.gemfire.inbound.CacheListeningMessageProducer .this . java.util.Set<org.springframework.integration.gemfire.inbound.EventType> . contains ( EventType . CREATED ) ) { void ( org.springframework.integration.gemfire.inbound.EntryEvent ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EntryEvent org.springframework.integration.gemfire.inbound.EntryEvent ) { if ( org.springframework.integration.gemfire.inbound.CacheListeningMessageProducer .this . java.util.Set<org.springframework.integration.gemfire.inbound.EventType> . contains ( EventType . UPDATED ) ) { void ( org.springframework.integration.gemfire.inbound.EntryEvent ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EntryEvent org.springframework.integration.gemfire.inbound.EntryEvent ) { if ( org.springframework.integration.gemfire.inbound.CacheListeningMessageProducer .this . java.util.Set<org.springframework.integration.gemfire.inbound.EventType> . contains ( EventType . INVALIDATED ) ) { void ( org.springframework.integration.gemfire.inbound.EntryEvent ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EntryEvent org.springframework.integration.gemfire.inbound.EntryEvent ) { if ( org.springframework.integration.gemfire.inbound.CacheListeningMessageProducer .this . java.util.Set<org.springframework.integration.gemfire.inbound.EventType> . contains ( EventType . DESTROYED ) ) { void ( org.springframework.integration.gemfire.inbound.EntryEvent ) ; } }  <METHOD_END>
<METHOD_START> private void void ( EntryEvent org.springframework.integration.gemfire.inbound.EntryEvent ) { void ( evaluatePayloadExpression ( org.springframework.integration.gemfire.inbound.EntryEvent ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object ) { Message < ? > org.springframework.integration.gemfire.inbound.Message<?> = null ; if ( java.lang.Object instanceof Message ) { org.springframework.integration.gemfire.inbound.Message<?> = ( Message < ? > ) java.lang.Object ; } else { org.springframework.integration.gemfire.inbound.Message<?> = getMessageBuilderFactory ( ) . withPayload ( java.lang.Object ) . build ( ) ; } sendMessage ( org.springframework.integration.gemfire.inbound.Message<> ) ; }  <METHOD_END>
