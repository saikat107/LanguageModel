<METHOD_START> @ Test public void void ( ) { org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SingleAnnotationTestBean org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SingleAnnotationTestBean = new org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SingleAnnotationTestBean ( ) ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SingleAnnotationTestBean ) ; QueueChannel org.springframework.integration.endpoint.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setOutputChannel ( org.springframework.integration.endpoint.QueueChannel ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = org.springframework.integration.endpoint.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.endpoint.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultipleAnnotationTestBean org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultipleAnnotationTestBean = new org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultipleAnnotationTestBean ( ) ; new ServiceActivatingHandler ( org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultipleAnnotationTestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SinglePublicMethodTestBean org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SinglePublicMethodTestBean = new org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SinglePublicMethodTestBean ( ) ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.SinglePublicMethodTestBean ) ; QueueChannel org.springframework.integration.endpoint.QueueChannel = new QueueChannel ( ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setOutputChannel ( org.springframework.integration.endpoint.QueueChannel ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( new GenericMessage < java.lang.String > ( STRING ) ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = org.springframework.integration.endpoint.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , org.springframework.integration.endpoint.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultiplePublicMethodTestBean org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultiplePublicMethodTestBean = new org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultiplePublicMethodTestBean ( ) ; new ServiceActivatingHandler ( org.springframework.integration.endpoint.ServiceActivatorMethodResolutionTests.MultiplePublicMethodTestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestReplyExchanger org.springframework.integration.endpoint.RequestReplyExchanger = new RequestReplyExchanger ( ) { @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; } } ; final Message < ? > org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( STRING ) ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.RequestReplyExchanger ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { java.lang.Object java.lang.Object = super. handleRequestMessage ( org.springframework.integration.endpoint.Message<> ) ; assertSame ( org.springframework.integration.endpoint.Message<> , java.lang.Object ) ; return null ; } } ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { java.lang.Object java.lang.Object = super. handleRequestMessage ( org.springframework.integration.endpoint.Message<> ) ; assertSame ( org.springframework.integration.endpoint.Message<> , java.lang.Object ) ; return null ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestReplyExchanger org.springframework.integration.endpoint.RequestReplyExchanger = new RequestReplyExchanger ( ) { @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; } @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; } } ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.RequestReplyExchanger ) ; PollableChannel org.springframework.integration.endpoint.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setOutputChannel ( org.springframework.integration.endpoint.PollableChannel ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( new java.util.Date ( ) ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( org.springframework.integration.endpoint.Message<> , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) ) ; org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( STRING , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestReplyExchanger org.springframework.integration.endpoint.RequestReplyExchanger = new RequestReplyExchanger ( ) { @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; } @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < java.lang.String > org.springframework.integration.endpoint.Message<java.lang.String> ) { return org.springframework.integration.endpoint.Message<java.lang.String> . getPayload ( ) . toUpperCase ( ) ; } } ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.RequestReplyExchanger ) ; PollableChannel org.springframework.integration.endpoint.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setOutputChannel ( org.springframework.integration.endpoint.PollableChannel ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( new java.util.Date ( ) ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( org.springframework.integration.endpoint.Message<> , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) ) ; org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( STRING , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < java.lang.String > org.springframework.integration.endpoint.Message<java.lang.String> ) { return org.springframework.integration.endpoint.Message<java.lang.String> . getPayload ( ) . toUpperCase ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestReplyExchanger org.springframework.integration.endpoint.RequestReplyExchanger = new RequestReplyExchanger ( ) { @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; } @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < java.lang.String > org.springframework.integration.endpoint.Message<java.lang.String> ) { return org.springframework.integration.endpoint.Message<java.lang.String> . getPayload ( ) . toUpperCase ( ) ; } @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < java.lang.String > org.springframework.integration.endpoint.Message<java.lang.String> ) { return org.springframework.integration.endpoint.Message<java.lang.String> . getPayload ( ) . toUpperCase ( ) ; } } ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.RequestReplyExchanger ) ; PollableChannel org.springframework.integration.endpoint.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setOutputChannel ( org.springframework.integration.endpoint.PollableChannel ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( new java.util.Date ( ) ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( org.springframework.integration.endpoint.Message<> , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) ) ; org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertNotEquals ( STRING , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < java.lang.String > org.springframework.integration.endpoint.Message<java.lang.String> ) { return org.springframework.integration.endpoint.Message<java.lang.String> . getPayload ( ) . toUpperCase ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( Message < java.lang.String > org.springframework.integration.endpoint.Message<java.lang.String> ) { return org.springframework.integration.endpoint.Message<java.lang.String> . getPayload ( ) . toUpperCase ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { RequestReplyExchanger org.springframework.integration.endpoint.RequestReplyExchanger = new RequestReplyExchanger ( ) { @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; } @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; } @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; } } ; ServiceActivatingHandler org.springframework.integration.endpoint.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.endpoint.RequestReplyExchanger ) ; PollableChannel org.springframework.integration.endpoint.PollableChannel = new QueueChannel ( ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . setOutputChannel ( org.springframework.integration.endpoint.PollableChannel ) ; Message < ? > org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( new java.util.Date ( ) ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertEquals ( org.springframework.integration.endpoint.Message<> , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) ) ; org.springframework.integration.endpoint.Message<?> = new GenericMessage < java.lang.Object > ( STRING ) ; org.springframework.integration.endpoint.ServiceActivatingHandler . handleMessage ( org.springframework.integration.endpoint.Message<> ) ; assertNotEquals ( STRING , org.springframework.integration.endpoint.PollableChannel . receive ( NUMBER ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.Message<?> < ? > org.springframework.integration.endpoint.Message<?> ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { return org.springframework.integration.endpoint.Message<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ ServiceActivator public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ ServiceActivator public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ ServiceActivator public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) ; }  <METHOD_END>
