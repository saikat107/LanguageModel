<METHOD_START> @ Bean public sample.parent.FileReadingMessageSource sample.parent.FileReadingMessageSource ( ) { FileReadingMessageSource sample.parent.FileReadingMessageSource = new FileReadingMessageSource ( ) ; sample.parent.FileReadingMessageSource . setDirectory ( new java.io.File ( STRING ) ) ; return sample.parent.FileReadingMessageSource ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.parent.DirectChannel sample.parent.DirectChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.parent.DirectChannel sample.parent.DirectChannel ( ) { return new DirectChannel ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.parent.FileWritingMessageHandler sample.parent.FileWritingMessageHandler ( ) { FileWritingMessageHandler sample.parent.FileWritingMessageHandler = new FileWritingMessageHandler ( new java.io.File ( STRING ) ) ; sample.parent.FileWritingMessageHandler . setExpectReply ( false ) ; return sample.parent.FileWritingMessageHandler ; }  <METHOD_END>
<METHOD_START> @ Bean public sample.parent.IntegrationFlow sample.parent.IntegrationFlow ( SampleEndpoint sample.parent.SampleEndpoint ) { return IntegrationFlows . from ( sample.parent.FileReadingMessageSource ( ) , new sample.parent.SampleParentContextApplication.Parent.FixedRatePoller ( ) ) . channel ( sample.parent.DirectChannel ( ) ) . handle ( sample.parent.SampleEndpoint ) . channel ( sample.parent.DirectChannel ( ) ) . handle ( sample.parent.FileWritingMessageHandler ( ) ) . get ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SourcePollingChannelAdapterSpec sample.parent.SourcePollingChannelAdapterSpec ) { sample.parent.SourcePollingChannelAdapterSpec . poller ( Pollers . fixedRate ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { new SpringApplicationBuilder ( sample.parent.SampleParentContextApplication.Parent .class ) . child ( sample.parent.SampleParentContextApplication .class ) . run ( java.lang.String[] ) ; }  <METHOD_END>
