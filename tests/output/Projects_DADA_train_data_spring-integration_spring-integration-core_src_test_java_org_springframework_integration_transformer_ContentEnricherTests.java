<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.integration.transformer.ThreadPoolTaskScheduler . setPoolSize ( NUMBER ) ; org.springframework.integration.transformer.ThreadPoolTaskScheduler . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final long long = NUMBER ; final long long = NUMBER ; final DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; final QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( NUMBER ) ; final ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.QueueChannel ) ; org.springframework.integration.transformer.ContentEnricher . setReplyChannel ( org.springframework.integration.transformer.DirectChannel ) ; org.springframework.integration.transformer.ContentEnricher . setOutputChannel ( new NullChannel ( ) ) ; org.springframework.integration.transformer.ContentEnricher . setRequestTimeout ( long ) ; org.springframework.integration.transformer.ContentEnricher . setReplyTimeout ( long ) ; final ExpressionFactoryBean org.springframework.integration.transformer.ExpressionFactoryBean = new ExpressionFactoryBean ( STRING ) ; org.springframework.integration.transformer.ExpressionFactoryBean . setSingleton ( false ) ; org.springframework.integration.transformer.ExpressionFactoryBean . afterPropertiesSet ( ) ; final java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , new LiteralExpression ( STRING ) ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.ExpressionFactoryBean . getObject ( ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setRequiresReply ( true ) ; org.springframework.integration.transformer.ContentEnricher . setBeanName ( STRING ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; final AbstractReplyProducingMessageHandler org.springframework.integration.transformer.AbstractReplyProducingMessageHandler = new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { try { java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { fail ( java.lang.InterruptedException . java.lang.String ( ) ) ; } return new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; } } ; org.springframework.integration.transformer.AbstractReplyProducingMessageHandler . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.AbstractReplyProducingMessageHandler . afterPropertiesSet ( ) ; final PollingConsumer org.springframework.integration.transformer.PollingConsumer = new PollingConsumer ( org.springframework.integration.transformer.QueueChannel , org.springframework.integration.transformer.AbstractReplyProducingMessageHandler ) ; final TestErrorHandler org.springframework.integration.transformer.TestErrorHandler = new TestErrorHandler ( ) ; org.springframework.integration.transformer.PollingConsumer . setTrigger ( new PeriodicTrigger ( NUMBER ) ) ; org.springframework.integration.transformer.PollingConsumer . setErrorHandler ( org.springframework.integration.transformer.TestErrorHandler ) ; org.springframework.integration.transformer.PollingConsumer . setTaskScheduler ( org.springframework.integration.transformer.ThreadPoolTaskScheduler ) ; org.springframework.integration.transformer.PollingConsumer . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.PollingConsumer . afterPropertiesSet ( ) ; org.springframework.integration.transformer.PollingConsumer . start ( ) ; final org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.DirectChannel ) . build ( ) ; try { org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; } catch ( ReplyRequiredException org.springframework.integration.transformer.ReplyRequiredException ) { assertEquals ( STRING , org.springframework.integration.transformer.ReplyRequiredException . getMessage ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { try { java.lang.Thread . void ( NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { fail ( java.lang.InterruptedException . java.lang.String ( ) ) ; } return new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { final java.lang.String java.lang.String = STRING ; final long long = NUMBER ; QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; QueueChannel org.springframework.integration.transformer.QueueChannel = new RendezvousChannel ( ) ; org.springframework.integration.transformer.QueueChannel . setBeanName ( java.lang.String ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.QueueChannel ) ; org.springframework.integration.transformer.ContentEnricher . setRequestTimeout ( long ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; try { org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; } catch ( MessageDeliveryException org.springframework.integration.transformer.MessageDeliveryException ) { assertThat ( org.springframework.integration.transformer.MessageDeliveryException . getMessage ( ) , equalToIgnoringCase ( STRING + java.lang.String + STRING + long ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; } } ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , ( ( org.springframework.integration.transformer.ContentEnricherTests.Target ) org.springframework.integration.transformer.Message<> . getPayload ( ) ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; try { org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertEquals ( STRING , java.lang.IllegalStateException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; try { org.springframework.integration.transformer.ContentEnricher . setReplyTimeout ( null ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; try { org.springframework.integration.transformer.ContentEnricher . setRequestTimeout ( null ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; assertEquals ( STRING , ( ( org.springframework.integration.transformer.ContentEnricherTests.Target ) org.springframework.integration.transformer.Message<> . getPayload ( ) ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setReplyChannel ( new QueueChannel ( ) ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; try { org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertEquals ( STRING , java.lang.IllegalStateException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; } } ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = ( org.springframework.integration.transformer.ContentEnricherTests.Target ) org.springframework.integration.transformer.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.transformer.ContentEnricherTests.Target . java.lang.String ( ) ) ; assertEquals ( STRING , org.springframework.integration.transformer.ContentEnricherTests.Target . org.springframework.integration.transformer.ContentEnricherTests.Target ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; } } ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; org.springframework.integration.transformer.ContentEnricher . setShouldClonePayload ( true ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = ( org.springframework.integration.transformer.ContentEnricherTests.Target ) org.springframework.integration.transformer.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.transformer.ContentEnricherTests.Target . java.lang.String ( ) ) ; assertNotSame ( org.springframework.integration.transformer.ContentEnricherTests.Target , org.springframework.integration.transformer.ContentEnricherTests.Target ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; } } ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; org.springframework.integration.transformer.ContentEnricher . setShouldClonePayload ( true ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.TargetUser org.springframework.integration.transformer.ContentEnricherTests.TargetUser = new org.springframework.integration.transformer.ContentEnricherTests.TargetUser ( ) ; org.springframework.integration.transformer.ContentEnricherTests.TargetUser . void ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.TargetUser ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; org.springframework.integration.transformer.ContentEnricherTests.TargetUser org.springframework.integration.transformer.ContentEnricherTests.TargetUser = ( org.springframework.integration.transformer.ContentEnricherTests.TargetUser ) org.springframework.integration.transformer.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.transformer.ContentEnricherTests.TargetUser . java.lang.String ( ) ) ; assertSame ( org.springframework.integration.transformer.ContentEnricherTests.TargetUser , org.springframework.integration.transformer.ContentEnricherTests.TargetUser ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; } } ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; org.springframework.integration.transformer.ContentEnricher . setShouldClonePayload ( true ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricherTests.UncloneableTargetUser org.springframework.integration.transformer.ContentEnricherTests.UncloneableTargetUser = new org.springframework.integration.transformer.ContentEnricherTests.UncloneableTargetUser ( ) ; org.springframework.integration.transformer.ContentEnricherTests.UncloneableTargetUser . void ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.UncloneableTargetUser ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; try { org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; } catch ( MessageHandlingException org.springframework.integration.transformer.MessageHandlingException ) { assertThat ( org.springframework.integration.transformer.MessageHandlingException . getMessage ( ) , containsString ( STRING ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; assertTrue ( org.springframework.integration.transformer.ContentEnricher . isRunning ( ) ) ; org.springframework.integration.transformer.ContentEnricher . stop ( ) ; assertTrue ( org.springframework.integration.transformer.ContentEnricher . isRunning ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; } } ) ; ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; org.springframework.integration.transformer.ContentEnricher . start ( ) ; assertTrue ( org.springframework.integration.transformer.ContentEnricher . isRunning ( ) ) ; org.springframework.integration.transformer.ContentEnricher . stop ( ) ; assertFalse ( org.springframework.integration.transformer.ContentEnricher . isRunning ( ) ) ; org.springframework.integration.transformer.ContentEnricher . start ( ) ; assertTrue ( org.springframework.integration.transformer.ContentEnricher . isRunning ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Source ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { throw new java.lang.RuntimeException ( ) ; } } ) ; final DirectChannel org.springframework.integration.transformer.DirectChannel = new DirectChannel ( ) ; org.springframework.integration.transformer.DirectChannel . subscribe ( new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; } } ) ; final QueueChannel org.springframework.integration.transformer.QueueChannel = new QueueChannel ( ) ; final ContentEnricher org.springframework.integration.transformer.ContentEnricher = new ContentEnricher ( ) ; org.springframework.integration.transformer.ContentEnricher . setRequestChannel ( org.springframework.integration.transformer.DirectChannel ) ; org.springframework.integration.transformer.ContentEnricher . setErrorChannel ( org.springframework.integration.transformer.DirectChannel ) ; SpelExpressionParser org.springframework.integration.transformer.SpelExpressionParser = new SpelExpressionParser ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> = new java.util.HashMap<java.lang.String,org.springframework.integration.transformer.Expression> < java.lang.String , Expression > ( ) ; java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> . put ( STRING , org.springframework.integration.transformer.SpelExpressionParser . parseExpression ( STRING ) ) ; org.springframework.integration.transformer.ContentEnricher . setPropertyExpressions ( java.util.Map<java.lang.String,org.springframework.integration.transformer.Expression> ) ; org.springframework.integration.transformer.ContentEnricher . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.transformer.ContentEnricher . afterPropertiesSet ( ) ; final org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; Message < ? > org.springframework.integration.transformer.Message<?> = MessageBuilder . withPayload ( org.springframework.integration.transformer.ContentEnricherTests.Target ) . setReplyChannel ( org.springframework.integration.transformer.QueueChannel ) . build ( ) ; org.springframework.integration.transformer.ContentEnricher . handleMessage ( org.springframework.integration.transformer.Message<> ) ; Message < ? > org.springframework.integration.transformer.Message<?> = org.springframework.integration.transformer.QueueChannel . receive ( NUMBER ) ; org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = ( org.springframework.integration.transformer.ContentEnricherTests.Target ) org.springframework.integration.transformer.Message<> . getPayload ( ) ; assertEquals ( STRING , org.springframework.integration.transformer.ContentEnricherTests.Target . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { throw new java.lang.RuntimeException ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.transformer.Message<?> ) { return new org.springframework.integration.transformer.ContentEnricherTests.Target ( STRING ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target ( ) { return this . org.springframework.integration.transformer.ContentEnricherTests.Target ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target ) { this . org.springframework.integration.transformer.ContentEnricherTests.Target = org.springframework.integration.transformer.ContentEnricherTests.Target ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { org.springframework.integration.transformer.ContentEnricherTests.Target org.springframework.integration.transformer.ContentEnricherTests.Target = new org.springframework.integration.transformer.ContentEnricherTests.Target ( this . java.lang.String ) ; org.springframework.integration.transformer.ContentEnricherTests.Target . void ( this . org.springframework.integration.transformer.ContentEnricherTests.Target ) ; return org.springframework.integration.transformer.ContentEnricherTests.Target ; }  <METHOD_END>
<METHOD_START> public void ( ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { this . java.lang.String = STRING ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
