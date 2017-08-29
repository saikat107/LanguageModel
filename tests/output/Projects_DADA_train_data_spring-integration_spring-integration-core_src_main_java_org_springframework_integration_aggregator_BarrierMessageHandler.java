<METHOD_START> public void ( long long ) { this( long , new DefaultAggregatingMessageGroupProcessor ( ) ); }  <METHOD_END>
<METHOD_START> public void ( long long , MessageGroupProcessor org.springframework.integration.aggregator.MessageGroupProcessor ) { this( long , org.springframework.integration.aggregator.MessageGroupProcessor , new HeaderAttributeCorrelationStrategy ( IntegrationMessageHeaderAccessor . CORRELATION_ID ) ); }  <METHOD_END>
<METHOD_START> public void ( long long , CorrelationStrategy org.springframework.integration.aggregator.CorrelationStrategy ) { this( long , new DefaultAggregatingMessageGroupProcessor ( ) , org.springframework.integration.aggregator.CorrelationStrategy ); }  <METHOD_END>
<METHOD_START> public void ( long long , MessageGroupProcessor org.springframework.integration.aggregator.MessageGroupProcessor , CorrelationStrategy org.springframework.integration.aggregator.CorrelationStrategy ) { Assert . notNull ( org.springframework.integration.aggregator.MessageGroupProcessor , STRING ) ; Assert . notNull ( org.springframework.integration.aggregator.CorrelationStrategy , STRING ) ; this . org.springframework.integration.aggregator.MessageGroupProcessor = org.springframework.integration.aggregator.MessageGroupProcessor ; this . org.springframework.integration.aggregator.CorrelationStrategy = org.springframework.integration.aggregator.CorrelationStrategy ; this . long = long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.aggregator.MessageChannel ) { this . org.springframework.integration.aggregator.MessageChannel = org.springframework.integration.aggregator.MessageChannel ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.aggregator.MessageChannel org.springframework.integration.aggregator.MessageChannel ( ) { if ( this . org.springframework.integration.aggregator.MessageChannel == null && this . java.lang.String != null && getChannelResolver ( ) != null ) { this . org.springframework.integration.aggregator.MessageChannel = getChannelResolver ( ) . resolveDestination ( this . java.lang.String ) ; } return this . org.springframework.integration.aggregator.MessageChannel ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.aggregator.Message<?> ) { java.lang.Object java.lang.Object = this . org.springframework.integration.aggregator.CorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ; if ( java.lang.Object == null ) { throw new MessagingException ( org.springframework.integration.aggregator.Message<> , STRING ) ; } java.lang.Thread java.lang.Thread = this . java.util.Map<java.lang.Object,java.lang.Thread> . java.lang.Thread ( java.lang.Object , java.lang.Thread . java.lang.Thread ( ) ) ; if ( java.lang.Thread != null ) { throw new MessagingException ( org.springframework.integration.aggregator.Message<> , STRING + java.lang.Object + STRING + java.lang.Thread . java.lang.String ( ) ) ; } java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> < Message < ? > > java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> = java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> ( java.lang.Object ) ; try { Message < ? > org.springframework.integration.aggregator.Message<?> = java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> . poll ( this . long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; if ( org.springframework.integration.aggregator.Message<> != null ) { return java.lang.Object ( java.lang.Object , org.springframework.integration.aggregator.Message<> , org.springframework.integration.aggregator.Message<> ) ; } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; throw new MessageHandlingException ( org.springframework.integration.aggregator.Message<> , STRING , java.lang.InterruptedException ) ; } finally { this . java.util.Map<java.lang.Object,java.lang.Thread> . java.lang.Thread ( java.lang.Object ) ; this . java.util.Map<java.lang.Object,java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>>> . remove ( java.lang.Object ) ; } return null ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.aggregator.Message<?> , Message < ? > org.springframework.integration.aggregator.Message<?> ) { this . java.util.Map<java.lang.Object,java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>>> . remove ( java.lang.Object ) ; if ( org.springframework.integration.aggregator.Message<> . getPayload ( ) instanceof java.lang.Throwable ) { throw new MessagingException ( org.springframework.integration.aggregator.Message<> , STRING , ( java.lang.Throwable ) org.springframework.integration.aggregator.Message<> . getPayload ( ) ) ; } else { return java.lang.Object ( java.lang.Object , org.springframework.integration.aggregator.Message<> , org.springframework.integration.aggregator.Message<> ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.aggregator.Message<?> , Message < ? > org.springframework.integration.aggregator.Message<?> ) { SimpleMessageGroup org.springframework.integration.aggregator.SimpleMessageGroup = new SimpleMessageGroup ( java.lang.Object ) ; org.springframework.integration.aggregator.SimpleMessageGroup . add ( org.springframework.integration.aggregator.Message<> ) ; org.springframework.integration.aggregator.SimpleMessageGroup . add ( org.springframework.integration.aggregator.Message<> ) ; return this . org.springframework.integration.aggregator.MessageGroupProcessor . processMessageGroup ( org.springframework.integration.aggregator.SimpleMessageGroup ) ; }  <METHOD_END>
<METHOD_START> private java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> < Message < ? > > java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> ( java.lang.Object java.lang.Object ) { java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> < Message < ? > > java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> = new java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> <> ( ) ; java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> < Message < ? > > java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> = this . java.util.Map<java.lang.Object,java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>>> . putIfAbsent ( java.lang.Object , java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> ) ; if ( java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> != null ) { java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> = java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> ; } return java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message < ? > org.springframework.integration.aggregator.Message<?> ) { java.lang.Object java.lang.Object = this . org.springframework.integration.aggregator.CorrelationStrategy . getCorrelationKey ( org.springframework.integration.aggregator.Message<> ) ; if ( java.lang.Object == null ) { throw new MessagingException ( org.springframework.integration.aggregator.Message<> , STRING ) ; } java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> < Message < ? > > java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> = java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> ( java.lang.Object ) ; try { if ( ! java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>> . offer ( org.springframework.integration.aggregator.Message<> , this . long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) { this . logger . error ( STRING + org.springframework.integration.aggregator.Message<> ) ; this . java.util.Map<java.lang.Object,java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>>> . remove ( java.lang.Object ) ; if ( org.springframework.integration.aggregator.MessageChannel ( ) != null ) { this . messagingTemplate . send ( org.springframework.integration.aggregator.MessageChannel ( ) , org.springframework.integration.aggregator.Message<> ) ; } } } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; this . logger . error ( STRING + org.springframework.integration.aggregator.Message<> ) ; this . java.util.Map<java.lang.Object,java.util.concurrent.SynchronousQueue<org.springframework.integration.aggregator.Message<?>>> . remove ( java.lang.Object ) ; } }  <METHOD_END>
