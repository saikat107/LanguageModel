<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Message < SyndEntry > org.springframework.integration.feed.dsl.Message<org.springframework.integration.feed.dsl.SyndEntry> = ( Message < SyndEntry > ) this . org.springframework.integration.feed.dsl.PollableChannel . receive ( NUMBER ) ; Message < SyndEntry > org.springframework.integration.feed.dsl.Message<org.springframework.integration.feed.dsl.SyndEntry> = ( Message < SyndEntry > ) this . org.springframework.integration.feed.dsl.PollableChannel . receive ( NUMBER ) ; Message < SyndEntry > org.springframework.integration.feed.dsl.Message<org.springframework.integration.feed.dsl.SyndEntry> = ( Message < SyndEntry > ) this . org.springframework.integration.feed.dsl.PollableChannel . receive ( NUMBER ) ; long long = org.springframework.integration.feed.dsl.Message<org.springframework.integration.feed.dsl.SyndEntry> . getPayload ( ) . getPublishedDate ( ) . getTime ( ) ; long long = org.springframework.integration.feed.dsl.Message<org.springframework.integration.feed.dsl.SyndEntry> . getPayload ( ) . getPublishedDate ( ) . getTime ( ) ; long long = org.springframework.integration.feed.dsl.Message<org.springframework.integration.feed.dsl.SyndEntry> . getPayload ( ) . getPublishedDate ( ) . getTime ( ) ; assertTrue ( long < long ) ; assertTrue ( long < long ) ; assertNull ( this . org.springframework.integration.feed.dsl.PollableChannel . receive ( NUMBER ) ) ; this . org.springframework.integration.feed.dsl.PropertiesPersistingMetadataStore . flush ( ) ; java.io.FileReader java.io.FileReader = new java.io.FileReader ( org.springframework.integration.feed.dsl.TemporaryFolder . getRoot ( ) . getAbsolutePath ( ) + STRING ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . void ( java.io.FileReader ) ; assertFalse ( java.util.Properties . boolean ( ) ) ; assertEquals ( NUMBER , java.util.Properties . int ( ) ) ; assertTrue ( java.util.Properties . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.feed.dsl.MetadataStore org.springframework.integration.feed.dsl.MetadataStore ( ) { PropertiesPersistingMetadataStore org.springframework.integration.feed.dsl.PropertiesPersistingMetadataStore = new PropertiesPersistingMetadataStore ( ) ; org.springframework.integration.feed.dsl.PropertiesPersistingMetadataStore . setBaseDirectory ( org.springframework.integration.feed.dsl.TemporaryFolder . getRoot ( ) . getAbsolutePath ( ) ) ; return org.springframework.integration.feed.dsl.PropertiesPersistingMetadataStore ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.integration.feed.dsl.IntegrationFlow org.springframework.integration.feed.dsl.IntegrationFlow ( ) { return IntegrationFlows . from ( Feed . inboundAdapter ( this . org.springframework.integration.feed.dsl.Resource , STRING ) . metadataStore ( org.springframework.integration.feed.dsl.MetadataStore ( ) ) . preserveWireFeed ( true ) , e -> e . poller ( p -> p . fixedDelay ( NUMBER ) ) ) . channel ( c -> c . queue ( STRING ) ) . get ( ) ; }  <METHOD_END>