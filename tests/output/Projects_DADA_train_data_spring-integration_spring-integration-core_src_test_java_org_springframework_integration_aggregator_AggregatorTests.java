<METHOD_START> @ Before public void void ( ) { this . org.springframework.integration.aggregator.AggregatingMessageHandler = new AggregatingMessageHandler ( new org.springframework.integration.aggregator.AggregatorTests.MultiplyingProcessor ( ) , org.springframework.integration.aggregator.SimpleMessageStore ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setBeanFactory ( mock ( BeanFactory .class ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setApplicationEventPublisher ( event -> expiryEvents . add ( ( MessageGroupExpiredEvent ) event ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setBeanName ( STRING ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . afterPropertiesSet ( ) ; java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException , java.util.concurrent.ExecutionException , java.util.concurrent.TimeoutException { AggregatingMessageHandler org.springframework.integration.aggregator.AggregatingMessageHandler = new AggregatingMessageHandler ( new DefaultAggregatingMessageGroupProcessor ( ) ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setCorrelationStrategy ( message -> STRING ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setReleaseStrategy ( new MessageCountReleaseStrategy ( NUMBER ) ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setExpireGroupsUponCompletion ( true ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setSendPartialResultOnExpiry ( true ) ; DirectChannel org.springframework.integration.aggregator.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setOutputChannel ( org.springframework.integration.aggregator.DirectChannel ) ; final java.util.concurrent.CompletableFuture<java.util.Collection<?>> < java.util.Collection<?> < ? > > java.util.concurrent.CompletableFuture<java.util.Collection<?>> = new java.util.concurrent.CompletableFuture<java.util.Collection<?>> <> ( ) ; org.springframework.integration.aggregator.DirectChannel . subscribe ( message -> { Collection < ? > payload = ( Collection < ? > ) message . getPayload ( ) ; logger . warn ( STRING + payload . size ( ) ) ; resultFuture . complete ( payload ) ; } ) ; SimpleMessageStore org.springframework.integration.aggregator.SimpleMessageStore = new SimpleMessageStore ( ) ; SimpleMessageGroupFactory org.springframework.integration.aggregator.SimpleMessageGroupFactory = new SimpleMessageGroupFactory ( SimpleMessageGroupFactory . GroupType . BLOCKING_QUEUE ) ; org.springframework.integration.aggregator.SimpleMessageStore . setMessageGroupFactory ( org.springframework.integration.aggregator.SimpleMessageGroupFactory ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setMessageStore ( org.springframework.integration.aggregator.SimpleMessageStore ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; StopWatch org.springframework.integration.aggregator.StopWatch = new StopWatch ( ) ; org.springframework.integration.aggregator.StopWatch . start ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { if ( int % NUMBER == NUMBER ) { org.springframework.integration.aggregator.StopWatch . stop ( ) ; org.springframework.integration.aggregator.Log . warn ( STRING + int + STRING + org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) + STRING + org.springframework.integration.aggregator.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; org.springframework.integration.aggregator.StopWatch . start ( ) ; } org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; } org.springframework.integration.aggregator.StopWatch . stop ( ) ; org.springframework.integration.aggregator.Log . warn ( STRING + NUMBER + STRING + org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) + STRING + org.springframework.integration.aggregator.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; java.util.Collection<?> < ? > java.util.Collection<?> = java.util.concurrent.CompletableFuture<java.util.Collection<?>> . java.util.Collection<?> ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( java.util.Collection<> ) ; assertEquals ( NUMBER , java.util.Collection<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException , java.util.concurrent.ExecutionException , java.util.concurrent.TimeoutException { AggregatingMessageHandler org.springframework.integration.aggregator.AggregatingMessageHandler = new AggregatingMessageHandler ( new DefaultAggregatingMessageGroupProcessor ( ) ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setCorrelationStrategy ( message -> STRING ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setReleasePartialSequences ( true ) ; DirectChannel org.springframework.integration.aggregator.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setOutputChannel ( org.springframework.integration.aggregator.DirectChannel ) ; final java.util.concurrent.CompletableFuture<java.util.Collection<?>> < java.util.Collection<?> < ? > > java.util.concurrent.CompletableFuture<java.util.Collection<?>> = new java.util.concurrent.CompletableFuture<java.util.Collection<?>> <> ( ) ; org.springframework.integration.aggregator.DirectChannel . subscribe ( message -> { Collection < ? > payload = ( Collection < ? > ) message . getPayload ( ) ; logger . warn ( STRING + payload . size ( ) ) ; resultFuture . complete ( payload ) ; } ) ; SimpleMessageStore org.springframework.integration.aggregator.SimpleMessageStore = new SimpleMessageStore ( ) ; SimpleMessageGroupFactory org.springframework.integration.aggregator.SimpleMessageGroupFactory = new SimpleMessageGroupFactory ( SimpleMessageGroupFactory . GroupType . BLOCKING_QUEUE ) ; org.springframework.integration.aggregator.SimpleMessageStore . setMessageGroupFactory ( org.springframework.integration.aggregator.SimpleMessageGroupFactory ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . setMessageStore ( org.springframework.integration.aggregator.SimpleMessageStore ) ; StopWatch org.springframework.integration.aggregator.StopWatch = new StopWatch ( ) ; org.springframework.integration.aggregator.StopWatch . start ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { if ( int % NUMBER == NUMBER ) { org.springframework.integration.aggregator.StopWatch . stop ( ) ; org.springframework.integration.aggregator.Log . warn ( STRING + int + STRING + org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) + STRING + org.springframework.integration.aggregator.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; org.springframework.integration.aggregator.StopWatch . start ( ) ; } org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( MessageBuilder . withPayload ( STRING ) . setSequenceSize ( NUMBER ) . setSequenceNumber ( int + NUMBER ) . build ( ) ) ; } org.springframework.integration.aggregator.StopWatch . stop ( ) ; org.springframework.integration.aggregator.Log . warn ( STRING + NUMBER + STRING + org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) + STRING + org.springframework.integration.aggregator.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; java.util.Collection<?> < ? > java.util.Collection<?> = java.util.concurrent.CompletableFuture<java.util.Collection<?>> . java.util.Collection<?> ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( java.util.Collection<> ) ; assertEquals ( NUMBER , java.util.Collection<> . int ( ) ) ; assertThat ( org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) , lessThan ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException , java.util.concurrent.ExecutionException , java.util.concurrent.TimeoutException { class CustomHandler extends AbstractMessageHandler { private final java.util.concurrent.locks.ReentrantLock java.util.concurrent.locks.ReentrantLock = new java.util.concurrent.locks.ReentrantLock ( ) ; private final java.util.Collection<org.springframework.integration.aggregator.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.aggregator.Message<?>> = new java.util.ArrayList<org.springframework.integration.aggregator.Message<?>> < Message < ? > > ( NUMBER ) ; private final org.springframework.integration.aggregator.MessageChannel org.springframework.integration.aggregator.MessageChannel ; private void ( MessageChannel org.springframework.integration.aggregator.MessageChannel ) { this . org.springframework.integration.aggregator.MessageChannel = org.springframework.integration.aggregator.MessageChannel ; } @ java.lang.Override public void void ( Message < ? > org.springframework.integration.aggregator.Message<?> ) { java.util.concurrent.locks.ReentrantLock . void ( ) ; try { this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . add ( org.springframework.integration.aggregator.Message<> ) ; if ( this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . size ( ) == NUMBER ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . size ( ) ) ; for ( Message < ? > org.springframework.integration.aggregator.Message<?> : this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> ) { java.util.List<java.lang.Object> . boolean ( org.springframework.integration.aggregator.Message<> . getPayload ( ) ) ; } this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . clear ( ) ; org.springframework.integration.aggregator.MessageChannel . send ( getMessageBuilderFactory ( ) . withPayload ( java.util.List<java.lang.Object> ) . copyHeaders ( org.springframework.integration.aggregator.Message<> . getHeaders ( ) ) . build ( ) ) ; } } finally { java.util.concurrent.locks.ReentrantLock . void ( ) ; } } } DirectChannel org.springframework.integration.aggregator.DirectChannel = new DirectChannel ( ) ; CustomHandler handler = new CustomHandler ( org.springframework.integration.aggregator.DirectChannel ) ; final java.util.concurrent.CompletableFuture<java.util.Collection<?>> < java.util.Collection<?> < ? > > java.util.concurrent.CompletableFuture<java.util.Collection<?>> = new java.util.concurrent.CompletableFuture<java.util.Collection<?>> <> ( ) ; org.springframework.integration.aggregator.DirectChannel . subscribe ( message -> { Collection < ? > payload = ( Collection < ? > ) message . getPayload ( ) ; logger . warn ( STRING + payload . size ( ) ) ; resultFuture . complete ( payload ) ; } ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = new GenericMessage < java.lang.String > ( STRING ) ; StopWatch org.springframework.integration.aggregator.StopWatch = new StopWatch ( ) ; org.springframework.integration.aggregator.StopWatch . start ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { if ( int % NUMBER == NUMBER ) { org.springframework.integration.aggregator.StopWatch . stop ( ) ; org.springframework.integration.aggregator.Log . warn ( STRING + int + STRING + org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) + STRING + org.springframework.integration.aggregator.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; org.springframework.integration.aggregator.StopWatch . start ( ) ; } handler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; } org.springframework.integration.aggregator.StopWatch . stop ( ) ; org.springframework.integration.aggregator.Log . warn ( STRING + NUMBER + STRING + org.springframework.integration.aggregator.StopWatch . getTotalTimeSeconds ( ) + STRING + org.springframework.integration.aggregator.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; java.util.Collection<?> < ? > java.util.Collection<?> = java.util.concurrent.CompletableFuture<java.util.Collection<?>> . java.util.Collection<?> ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; assertNotNull ( java.util.Collection<> ) ; assertEquals ( NUMBER , java.util.Collection<> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> private void ( MessageChannel org.springframework.integration.aggregator.MessageChannel ) { this . org.springframework.integration.aggregator.MessageChannel = org.springframework.integration.aggregator.MessageChannel ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.aggregator.Message<?> ) { java.util.concurrent.locks.ReentrantLock . void ( ) ; try { this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . add ( org.springframework.integration.aggregator.Message<> ) ; if ( this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . size ( ) == NUMBER ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . size ( ) ) ; for ( Message < ? > org.springframework.integration.aggregator.Message<?> : this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> ) { java.util.List<java.lang.Object> . boolean ( org.springframework.integration.aggregator.Message<> . getPayload ( ) ) ; } this . java.util.Collection<org.springframework.integration.aggregator.Message<?>> . clear ( ) ; org.springframework.integration.aggregator.MessageChannel . send ( getMessageBuilderFactory ( ) . withPayload ( java.util.List<java.lang.Object> ) . copyHeaders ( org.springframework.integration.aggregator.Message<> . getHeaders ( ) ) . build ( ) ) ; } } finally { java.util.concurrent.locks.ReentrantLock . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aggregator.Message<> ) ; assertEquals ( org.springframework.integration.aggregator.Message<> . getPayload ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setDiscardChannel ( org.springframework.integration.aggregator.QueueChannel ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.SimpleMessageStore . expireMessageGroups ( - NUMBER ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; assertEquals ( org.springframework.integration.aggregator.Message<> , org.springframework.integration.aggregator.Message<> ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . size ( ) ) ; assertSame ( this . org.springframework.integration.aggregator.AggregatingMessageHandler , java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getSource ( ) ) ; assertEquals ( STRING , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getGroupId ( ) ) ; assertEquals ( NUMBER , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getMessageCount ( ) ) ; assertEquals ( true , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . isDiscarded ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { this . org.springframework.integration.aggregator.AggregatingMessageHandler . setSendPartialResultOnExpiry ( true ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.SimpleMessageStore . expireMessageGroups ( - NUMBER ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . size ( ) ) ; assertSame ( this . org.springframework.integration.aggregator.AggregatingMessageHandler , java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getSource ( ) ) ; assertEquals ( STRING , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getGroupId ( ) ) ; assertEquals ( NUMBER , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getMessageCount ( ) ) ; assertEquals ( false , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . isDiscarded ( ) ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; assertEquals ( NUMBER , this . org.springframework.integration.aggregator.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { this . org.springframework.integration.aggregator.AggregatingMessageHandler . setSendPartialResultOnExpiry ( true ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setExpireGroupsUponTimeout ( false ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setDiscardChannel ( org.springframework.integration.aggregator.QueueChannel ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.SimpleMessageStore . expireMessageGroups ( - NUMBER ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.Message<> . getPayload ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . size ( ) ) ; assertSame ( this . org.springframework.integration.aggregator.AggregatingMessageHandler , java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getSource ( ) ) ; assertEquals ( STRING , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getGroupId ( ) ) ; assertEquals ( NUMBER , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . getMessageCount ( ) ) ; assertEquals ( false , this . java.util.List<org.springframework.integration.aggregator.MessageGroupExpiredEvent> . get ( NUMBER ) . isDiscarded ( ) ) ; assertEquals ( NUMBER , this . org.springframework.integration.aggregator.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; assertEquals ( NUMBER , this . org.springframework.integration.aggregator.SimpleMessageStore . getMessageGroup ( STRING ) . size ( ) ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; assertSame ( org.springframework.integration.aggregator.Message<> , org.springframework.integration.aggregator.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.lang.Integer > org.springframework.integration.aggregator.Message<java.lang.Integer> = ( Message < java.lang.Integer > ) org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aggregator.Message<java.lang.Integer> ) ; assertThat ( org.springframework.integration.aggregator.Message<java.lang.Integer> . getPayload ( ) , is ( NUMBER ) ) ; @ java.lang.SuppressWarnings ( STRING ) Message < java.lang.Integer > org.springframework.integration.aggregator.Message<java.lang.Integer> = ( Message < java.lang.Integer > ) org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( org.springframework.integration.aggregator.Message<java.lang.Integer> ) ; assertThat ( org.springframework.integration.aggregator.Message<java.lang.Integer> . getPayload ( ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setDiscardChannel ( org.springframework.integration.aggregator.QueueChannel ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setDiscardChannel ( org.springframework.integration.aggregator.QueueChannel ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<?> ( NUMBER , NUMBER , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ) ; assertEquals ( NUMBER , org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) . getPayload ( ) ) ; assertNull ( org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessageHandlingException .class ) public void void ( ) java.lang.InterruptedException { Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , null , NUMBER , NUMBER , new QueueChannel ( ) , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; assertThat ( ( ( java.lang.Integer ) org.springframework.integration.aggregator.Message<> . getPayload ( ) ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.InterruptedException { QueueChannel org.springframework.integration.aggregator.QueueChannel = new QueueChannel ( ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.Message<?> ( NUMBER , STRING , NUMBER , NUMBER , org.springframework.integration.aggregator.QueueChannel , null ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . setReleaseStrategy ( new SequenceSizeReleaseStrategy ( ) ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; this . org.springframework.integration.aggregator.AggregatingMessageHandler . handleMessage ( org.springframework.integration.aggregator.Message<> ) ; Message < ? > org.springframework.integration.aggregator.Message<?> = org.springframework.integration.aggregator.QueueChannel . receive ( NUMBER ) ; assertNotNull ( STRING , org.springframework.integration.aggregator.Message<> ) ; assertThat ( ( ( java.lang.Integer ) org.springframework.integration.aggregator.Message<> . getPayload ( ) ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.integration.aggregator.Message<?> < ? > org.springframework.integration.aggregator.Message<?> ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , int int , int int , MessageChannel org.springframework.integration.aggregator.MessageChannel , java.lang.String java.lang.String ) { MessageBuilder < java.lang.Object > org.springframework.integration.aggregator.MessageBuilder<java.lang.Object> = MessageBuilder . withPayload ( java.lang.Object ) . setCorrelationId ( java.lang.Object ) . setSequenceSize ( int ) . setSequenceNumber ( int ) . setReplyChannel ( org.springframework.integration.aggregator.MessageChannel ) ; if ( java.lang.String != null ) { org.springframework.integration.aggregator.MessageBuilder<java.lang.Object> . setHeader ( MessageHeaders . ID , java.lang.String ) ; } return org.springframework.integration.aggregator.MessageBuilder<java.lang.Object> . build ( ) ; }  <METHOD_END>
<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MessageGroup org.springframework.integration.aggregator.MessageGroup ) { java.lang.Integer java.lang.Integer = NUMBER ; for ( Message < ? > org.springframework.integration.aggregator.Message<?> : org.springframework.integration.aggregator.MessageGroup . getMessages ( ) ) { java.lang.Integer *= ( java.lang.Integer ) org.springframework.integration.aggregator.Message<> . getPayload ( ) ; } return java.lang.Integer ; }  <METHOD_END>