<METHOD_START> void ( Trigger org.springframework.integration.dsl.Trigger ) { this . target = new PollerMetadata ( ) ; this . target . setAdviceChain ( this . java.util.List<org.springframework.integration.dsl.Advice> ) ; this . target . setTrigger ( org.springframework.integration.dsl.Trigger ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( TransactionSynchronizationFactory org.springframework.integration.dsl.TransactionSynchronizationFactory ) { this . target . setTransactionSynchronizationFactory ( org.springframework.integration.dsl.TransactionSynchronizationFactory ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( ErrorHandler org.springframework.integration.dsl.ErrorHandler ) { this . target . setErrorHandler ( org.springframework.integration.dsl.ErrorHandler ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( MessageChannel org.springframework.integration.dsl.MessageChannel ) { MessagePublishingErrorHandler org.springframework.integration.dsl.MessagePublishingErrorHandler = new MessagePublishingErrorHandler ( ) ; org.springframework.integration.dsl.MessagePublishingErrorHandler . setDefaultErrorChannel ( org.springframework.integration.dsl.MessageChannel ) ; this . java.util.Collection<java.lang.Object> . boolean ( org.springframework.integration.dsl.MessagePublishingErrorHandler ) ; return org.springframework.integration.dsl.PollerSpec ( org.springframework.integration.dsl.MessagePublishingErrorHandler ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( java.lang.String java.lang.String ) { MessagePublishingErrorHandler org.springframework.integration.dsl.MessagePublishingErrorHandler = new MessagePublishingErrorHandler ( ) ; org.springframework.integration.dsl.MessagePublishingErrorHandler . setDefaultErrorChannelName ( java.lang.String ) ; this . java.util.Collection<java.lang.Object> . boolean ( org.springframework.integration.dsl.MessagePublishingErrorHandler ) ; return org.springframework.integration.dsl.PollerSpec ( org.springframework.integration.dsl.MessagePublishingErrorHandler ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long ) { this . target . setMaxMessagesPerPoll ( long ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long ) { this . target . setReceiveTimeout ( long ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( Advice ... org.springframework.integration.dsl.Advice[] ) { this . java.util.List<org.springframework.integration.dsl.Advice> . addAll ( java.util.Arrays . java.util.List ( org.springframework.integration.dsl.Advice[] ) ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( PlatformTransactionManager org.springframework.integration.dsl.PlatformTransactionManager ) { return org.springframework.integration.dsl.PollerSpec ( new TransactionInterceptorBuilder ( ) . transactionManager ( org.springframework.integration.dsl.PlatformTransactionManager ) . build ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( ) { TransactionInterceptor org.springframework.integration.dsl.TransactionInterceptor = new TransactionInterceptorBuilder ( ) . build ( ) ; this . java.util.Collection<java.lang.Object> . boolean ( org.springframework.integration.dsl.TransactionInterceptor ) ; return org.springframework.integration.dsl.PollerSpec ( org.springframework.integration.dsl.TransactionInterceptor ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( TransactionInterceptor org.springframework.integration.dsl.TransactionInterceptor ) { return org.springframework.integration.dsl.PollerSpec ( org.springframework.integration.dsl.TransactionInterceptor ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( java.util.concurrent.Executor java.util.concurrent.Executor ) { this . target . setTaskExecutor ( java.util.concurrent.Executor ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.PollerSpec org.springframework.integration.dsl.PollerSpec ( long long ) { this . target . setSendTimeout ( long ) ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<java.lang.Object> < java.lang.Object > java.util.Collection<java.lang.Object> ( ) { return this . java.util.Collection<java.lang.Object> ; }  <METHOD_END>
