<METHOD_START> void ( MessageSource < ? > org.springframework.integration.dsl.MessageSource<?> ) { super( org.springframework.integration.dsl.MessageSource<> ); this . endpointFactoryBean . setSource ( org.springframework.integration.dsl.MessageSource<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.SourcePollingChannelAdapterSpec org.springframework.integration.dsl.SourcePollingChannelAdapterSpec ( int int ) { this . endpointFactoryBean . setPhase ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.SourcePollingChannelAdapterSpec org.springframework.integration.dsl.SourcePollingChannelAdapterSpec ( boolean boolean ) { this . endpointFactoryBean . setAutoStartup ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.SourcePollingChannelAdapterSpec org.springframework.integration.dsl.SourcePollingChannelAdapterSpec ( PollerMetadata org.springframework.integration.dsl.PollerMetadata ) { if ( org.springframework.integration.dsl.PollerMetadata != null ) { if ( PollerMetadata . MAX_MESSAGES_UNBOUNDED == org.springframework.integration.dsl.PollerMetadata . getMaxMessagesPerPoll ( ) ) { org.springframework.integration.dsl.PollerMetadata . setMaxMessagesPerPoll ( NUMBER ) ; } this . endpointFactoryBean . setPollerMetadata ( org.springframework.integration.dsl.PollerMetadata ) ; } return _this ( ) ; }  <METHOD_END>
