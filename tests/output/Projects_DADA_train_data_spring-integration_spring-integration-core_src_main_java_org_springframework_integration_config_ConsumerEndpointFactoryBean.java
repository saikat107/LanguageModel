<METHOD_START> public void void ( MessageHandler org.springframework.integration.config.MessageHandler ) { Assert . notNull ( org.springframework.integration.config.MessageHandler , STRING ) ; synchronized ( this . java.lang.Object ) { Assert . isNull ( this . org.springframework.integration.config.MessageHandler , STRING ) ; this . org.springframework.integration.config.MessageHandler = org.springframework.integration.config.MessageHandler ; } }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.config.MessageChannel ) { this . org.springframework.integration.config.MessageChannel = org.springframework.integration.config.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( PollerMetadata org.springframework.integration.config.PollerMetadata ) { this . org.springframework.integration.config.PollerMetadata = org.springframework.integration.config.PollerMetadata ; }  <METHOD_END>
<METHOD_START> public void void ( DestinationResolver < MessageChannel > org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> ) { Assert . notNull ( org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> , STRING ) ; this . org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> = org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.config.BeanFactory ) { Assert . isInstanceOf ( ConfigurableBeanFactory .class , org.springframework.integration.config.BeanFactory , STRING ) ; this . org.springframework.integration.config.ConfigurableBeanFactory = ( ConfigurableBeanFactory ) org.springframework.integration.config.BeanFactory ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.integration.config.Advice> < Advice > java.util.List<org.springframework.integration.config.Advice> ) { Assert . notNull ( java.util.List<org.springframework.integration.config.Advice> , STRING ) ; this . java.util.List<org.springframework.integration.config.Advice> = java.util.List<org.springframework.integration.config.Advice> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( this . java.lang.String == null ) { this . org.springframework.integration.config.Log . error ( STRING + this . org.springframework.integration.config.MessageHandler + STRING + STRING ) ; } else { try { if ( ! this . java.lang.String . boolean ( STRING ) ) { MessageHandler org.springframework.integration.config.MessageHandler = this . org.springframework.integration.config.MessageHandler ; if ( AopUtils . isAopProxy ( org.springframework.integration.config.MessageHandler ) ) { java.lang.Object java.lang.Object = ( ( Advised ) org.springframework.integration.config.MessageHandler ) . getTargetSource ( ) . getTarget ( ) ; if ( java.lang.Object instanceof MessageHandler ) { org.springframework.integration.config.MessageHandler = ( MessageHandler ) java.lang.Object ; } } if ( org.springframework.integration.config.MessageHandler instanceof IntegrationObjectSupport ) { ( ( IntegrationObjectSupport ) org.springframework.integration.config.MessageHandler ) . setComponentName ( this . java.lang.String ) ; } } } catch ( java.lang.Exception java.lang.Exception ) { if ( this . org.springframework.integration.config.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.config.Log . debug ( STRING + this . org.springframework.integration.config.MessageHandler + STRING + this . java.lang.String + STRING + java.lang.Exception . java.lang.String ( ) ) ; } } } if ( ! CollectionUtils . isEmpty ( this . java.util.List<org.springframework.integration.config.Advice> ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = AopUtils . getTargetClass ( this . org.springframework.integration.config.MessageHandler ) ; boolean boolean = AbstractReplyProducingMessageHandler .class . boolean ( java.lang.Class<> ) ; for ( Advice org.springframework.integration.config.Advice : this . java.util.List<org.springframework.integration.config.Advice> ) { if ( ! boolean || org.springframework.integration.config.Advice instanceof HandleMessageAdvice ) { NameMatchMethodPointcutAdvisor org.springframework.integration.config.NameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor ( org.springframework.integration.config.Advice ) ; org.springframework.integration.config.NameMatchMethodPointcutAdvisor . addMethodName ( STRING ) ; if ( this . org.springframework.integration.config.MessageHandler instanceof Advised ) { ( ( Advised ) this . org.springframework.integration.config.MessageHandler ) . addAdvisor ( org.springframework.integration.config.NameMatchMethodPointcutAdvisor ) ; } else { ProxyFactory org.springframework.integration.config.ProxyFactory = new ProxyFactory ( this . org.springframework.integration.config.MessageHandler ) ; org.springframework.integration.config.ProxyFactory . addAdvisor ( org.springframework.integration.config.NameMatchMethodPointcutAdvisor ) ; this . org.springframework.integration.config.MessageHandler = ( MessageHandler ) org.springframework.integration.config.ProxyFactory . getProxy ( this . java.lang.ClassLoader ) ; } } } } if ( this . org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> == null ) { this . org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> = new BeanFactoryMessageChannelDestinationResolver ( this . org.springframework.integration.config.ConfigurableBeanFactory ) ; } void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.config.AbstractEndpoint org.springframework.integration.config.AbstractEndpoint ( ) java.lang.Exception { if ( ! this . boolean ) { this . void ( ) ; } return this . org.springframework.integration.config.AbstractEndpoint ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { if ( this . org.springframework.integration.config.AbstractEndpoint == null ) { return AbstractEndpoint .class ; } return this . org.springframework.integration.config.AbstractEndpoint . getClass ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( ) java.lang.Exception { synchronized ( this . java.lang.Object ) { if ( this . boolean ) { return; } MessageChannel org.springframework.integration.config.MessageChannel = null ; if ( StringUtils . hasText ( this . java.lang.String ) ) { org.springframework.integration.config.MessageChannel = this . org.springframework.integration.config.DestinationResolver<org.springframework.integration.config.MessageChannel> . resolveDestination ( this . java.lang.String ) ; } if ( this . org.springframework.integration.config.MessageChannel != null ) { org.springframework.integration.config.MessageChannel = this . org.springframework.integration.config.MessageChannel ; } Assert . state ( org.springframework.integration.config.MessageChannel != null , STRING ) ; if ( org.springframework.integration.config.MessageChannel instanceof SubscribableChannel ) { Assert . isNull ( this . org.springframework.integration.config.PollerMetadata , STRING + this . java.lang.String + STRING + org.springframework.integration.config.MessageChannel + STRING ) ; this . org.springframework.integration.config.AbstractEndpoint = new EventDrivenConsumer ( ( SubscribableChannel ) org.springframework.integration.config.MessageChannel , this . org.springframework.integration.config.MessageHandler ) ; if ( this . org.springframework.integration.config.Log . isWarnEnabled ( ) && ! this . boolean && org.springframework.integration.config.MessageChannel instanceof FixedSubscriberChannel ) { this . org.springframework.integration.config.Log . warn ( STRING ) ; } } else if ( org.springframework.integration.config.MessageChannel instanceof PollableChannel ) { PollingConsumer org.springframework.integration.config.PollingConsumer = new PollingConsumer ( ( PollableChannel ) org.springframework.integration.config.MessageChannel , this . org.springframework.integration.config.MessageHandler ) ; if ( this . org.springframework.integration.config.PollerMetadata == null ) { this . org.springframework.integration.config.PollerMetadata = PollerMetadata . getDefaultPollerMetadata ( this . org.springframework.integration.config.ConfigurableBeanFactory ) ; Assert . notNull ( this . org.springframework.integration.config.PollerMetadata , STRING + this . java.lang.String + STRING ) ; } org.springframework.integration.config.PollingConsumer . setTaskExecutor ( this . org.springframework.integration.config.PollerMetadata . getTaskExecutor ( ) ) ; org.springframework.integration.config.PollingConsumer . setTrigger ( this . org.springframework.integration.config.PollerMetadata . getTrigger ( ) ) ; org.springframework.integration.config.PollingConsumer . setAdviceChain ( this . org.springframework.integration.config.PollerMetadata . getAdviceChain ( ) ) ; org.springframework.integration.config.PollingConsumer . setMaxMessagesPerPoll ( this . org.springframework.integration.config.PollerMetadata . getMaxMessagesPerPoll ( ) ) ; org.springframework.integration.config.PollingConsumer . setErrorHandler ( this . org.springframework.integration.config.PollerMetadata . getErrorHandler ( ) ) ; org.springframework.integration.config.PollingConsumer . setReceiveTimeout ( this . org.springframework.integration.config.PollerMetadata . getReceiveTimeout ( ) ) ; org.springframework.integration.config.PollingConsumer . setTransactionSynchronizationFactory ( this . org.springframework.integration.config.PollerMetadata . getTransactionSynchronizationFactory ( ) ) ; org.springframework.integration.config.PollingConsumer . setBeanClassLoader ( this . java.lang.ClassLoader ) ; org.springframework.integration.config.PollingConsumer . setBeanFactory ( this . org.springframework.integration.config.ConfigurableBeanFactory ) ; this . org.springframework.integration.config.AbstractEndpoint = org.springframework.integration.config.PollingConsumer ; } else { this . org.springframework.integration.config.AbstractEndpoint = new ReactiveConsumer ( org.springframework.integration.config.MessageChannel , this . org.springframework.integration.config.MessageHandler ) ; } this . org.springframework.integration.config.AbstractEndpoint . setBeanName ( this . java.lang.String ) ; this . org.springframework.integration.config.AbstractEndpoint . setBeanFactory ( this . org.springframework.integration.config.ConfigurableBeanFactory ) ; this . org.springframework.integration.config.AbstractEndpoint . setAutoStartup ( this . boolean ) ; int int = this . int ; if ( ! this . boolean && this . org.springframework.integration.config.AbstractEndpoint instanceof PollingConsumer ) { int = java.lang.Integer . int / NUMBER ; } this . org.springframework.integration.config.AbstractEndpoint . setPhase ( int ) ; this . org.springframework.integration.config.AbstractEndpoint . afterPropertiesSet ( ) ; this . boolean = true ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( this . org.springframework.integration.config.AbstractEndpoint == null ) || this . org.springframework.integration.config.AbstractEndpoint . isAutoStartup ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return ( this . org.springframework.integration.config.AbstractEndpoint != null ) ? this . org.springframework.integration.config.AbstractEndpoint . getPhase ( ) : NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( this . org.springframework.integration.config.AbstractEndpoint != null ) && this . org.springframework.integration.config.AbstractEndpoint . isRunning ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.integration.config.AbstractEndpoint != null ) { this . org.springframework.integration.config.AbstractEndpoint . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.integration.config.AbstractEndpoint != null ) { this . org.springframework.integration.config.AbstractEndpoint . stop ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { if ( this . org.springframework.integration.config.AbstractEndpoint != null ) { this . org.springframework.integration.config.AbstractEndpoint . stop ( java.lang.Runnable ) ; } }  <METHOD_END>
