<METHOD_START> void ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { super( new AmqpChannelFactoryBean ( true ) , org.springframework.integration.amqp.dsl.ConnectionFactory ); }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . amqpChannelFactoryBean . setMaxSubscribers ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( AcknowledgeMode org.springframework.integration.amqp.dsl.AcknowledgeMode ) { this . amqpChannelFactoryBean . setAcknowledgeMode ( org.springframework.integration.amqp.dsl.AcknowledgeMode ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( Advice ... org.springframework.integration.amqp.dsl.Advice[] ) { this . java.util.List<org.springframework.integration.amqp.dsl.Advice> . addAll ( java.util.Arrays . java.util.List ( org.springframework.integration.amqp.dsl.Advice[] ) ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . amqpChannelFactoryBean . setAutoStartup ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . amqpChannelFactoryBean . setConcurrentConsumers ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( ErrorHandler org.springframework.integration.amqp.dsl.ErrorHandler ) { this . amqpChannelFactoryBean . setErrorHandler ( org.springframework.integration.amqp.dsl.ErrorHandler ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( boolean boolean ) { this . amqpChannelFactoryBean . setExposeListenerChannel ( boolean ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . amqpChannelFactoryBean . setPhase ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . amqpChannelFactoryBean . setPrefetchCount ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( long long ) { this . amqpChannelFactoryBean . setReceiveTimeout ( long ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( long long ) { this . amqpChannelFactoryBean . setRecoveryInterval ( long ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( long long ) { this . amqpChannelFactoryBean . setShutdownTimeout ( long ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( java.util.concurrent.Executor java.util.concurrent.Executor ) { this . amqpChannelFactoryBean . setTaskExecutor ( java.util.concurrent.Executor ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( TransactionAttribute org.springframework.integration.amqp.dsl.TransactionAttribute ) { this . amqpChannelFactoryBean . setTransactionAttribute ( org.springframework.integration.amqp.dsl.TransactionAttribute ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( PlatformTransactionManager org.springframework.integration.amqp.dsl.PlatformTransactionManager ) { this . amqpChannelFactoryBean . setTransactionManager ( org.springframework.integration.amqp.dsl.PlatformTransactionManager ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> public S S ( int int ) { this . amqpChannelFactoryBean . setTxSize ( int ) ; return _this ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.amqp.dsl.AbstractAmqpChannel org.springframework.integration.amqp.dsl.AbstractAmqpChannel ( ) { this . amqpChannelFactoryBean . setAdviceChain ( this . java.util.List<org.springframework.integration.amqp.dsl.Advice> . toArray ( new Advice [ this . java.util.List<org.springframework.integration.amqp.dsl.Advice> . size ( ) ] ) ) ; return super. doGet ( ) ; }  <METHOD_END>
