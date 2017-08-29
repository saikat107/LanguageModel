<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory , java.lang.String ... java.lang.String[] ) { SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer . setQueueNames ( java.lang.String[] ) ; return ( AmqpInboundGatewaySpec ) org.springframework.integration.amqp.dsl.AmqpBaseInboundGatewaySpec<?> ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory , AmqpTemplate org.springframework.integration.amqp.dsl.AmqpTemplate , java.lang.String ... java.lang.String[] ) { SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer . setQueueNames ( java.lang.String[] ) ; return ( AmqpInboundGatewaySpec ) org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer , org.springframework.integration.amqp.dsl.AmqpTemplate ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory , Queue ... org.springframework.integration.amqp.dsl.Queue[] ) { SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer . setQueues ( org.springframework.integration.amqp.dsl.Queue[] ) ; return ( AmqpInboundGatewaySpec ) org.springframework.integration.amqp.dsl.AmqpBaseInboundGatewaySpec<?> ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory , AmqpTemplate org.springframework.integration.amqp.dsl.AmqpTemplate , Queue ... org.springframework.integration.amqp.dsl.Queue[] ) { SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer . setQueues ( org.springframework.integration.amqp.dsl.Queue[] ) ; return ( AmqpInboundGatewaySpec ) org.springframework.integration.amqp.dsl.AmqpInboundGatewaySpec ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer , org.springframework.integration.amqp.dsl.AmqpTemplate ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpBaseInboundGatewaySpec<?> < ? > org.springframework.integration.amqp.dsl.AmqpBaseInboundGatewaySpec<?> ( SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) { return new AmqpInboundGatewaySpec ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpBaseInboundGatewaySpec<?> < ? > org.springframework.integration.amqp.dsl.AmqpBaseInboundGatewaySpec<?> ( SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer , AmqpTemplate org.springframework.integration.amqp.dsl.AmqpTemplate ) { return new AmqpInboundGatewaySpec ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer , org.springframework.integration.amqp.dsl.AmqpTemplate ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpInboundChannelAdapterSpec org.springframework.integration.amqp.dsl.AmqpInboundChannelAdapterSpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory , java.lang.String ... java.lang.String[] ) { SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer . setQueueNames ( java.lang.String[] ) ; return ( AmqpInboundChannelAdapterSpec ) org.springframework.integration.amqp.dsl.AmqpBaseInboundChannelAdapterSpec<?> ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpInboundChannelAdapterSpec org.springframework.integration.amqp.dsl.AmqpInboundChannelAdapterSpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory , Queue ... org.springframework.integration.amqp.dsl.Queue[] ) { SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer = new SimpleMessageListenerContainer ( org.springframework.integration.amqp.dsl.ConnectionFactory ) ; org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer . setQueues ( org.springframework.integration.amqp.dsl.Queue[] ) ; return ( AmqpInboundChannelAdapterSpec ) org.springframework.integration.amqp.dsl.AmqpBaseInboundChannelAdapterSpec<?> ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpBaseInboundChannelAdapterSpec<?> < ? > org.springframework.integration.amqp.dsl.AmqpBaseInboundChannelAdapterSpec<?> ( SimpleMessageListenerContainer org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) { return new AmqpInboundChannelAdapterSpec ( org.springframework.integration.amqp.dsl.SimpleMessageListenerContainer ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpOutboundEndpointSpec org.springframework.integration.amqp.dsl.AmqpOutboundEndpointSpec ( AmqpTemplate org.springframework.integration.amqp.dsl.AmqpTemplate ) { return new AmqpOutboundEndpointSpec ( org.springframework.integration.amqp.dsl.AmqpTemplate , false ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpOutboundEndpointSpec org.springframework.integration.amqp.dsl.AmqpOutboundEndpointSpec ( AmqpTemplate org.springframework.integration.amqp.dsl.AmqpTemplate ) { return new AmqpOutboundEndpointSpec ( org.springframework.integration.amqp.dsl.AmqpTemplate , true ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpAsyncOutboundGatewaySpec org.springframework.integration.amqp.dsl.AmqpAsyncOutboundGatewaySpec ( AsyncRabbitTemplate org.springframework.integration.amqp.dsl.AsyncRabbitTemplate ) { return new AmqpAsyncOutboundGatewaySpec ( org.springframework.integration.amqp.dsl.AsyncRabbitTemplate ) ; }  <METHOD_END>
<METHOD_START> public static < S extends org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec<S> < S > > org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec<S> < S > org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec<S> ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { return org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec ( null , org.springframework.integration.amqp.dsl.ConnectionFactory ) ; }  <METHOD_END>
<METHOD_START> public static < S extends org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec<S> < S > > org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec<S> < S > org.springframework.integration.amqp.dsl.AmqpPollableMessageChannelSpec<S> ( java.lang.String java.lang.String , ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { return new AmqpPollableMessageChannelSpec < S > ( org.springframework.integration.amqp.dsl.ConnectionFactory ) . id ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static < S extends org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec<S> < S > > org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec<S> < S > org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec<S> ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { return org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec ( null , org.springframework.integration.amqp.dsl.ConnectionFactory ) ; }  <METHOD_END>
<METHOD_START> public static < S extends org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec<S> < S > > org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec<S> < S > org.springframework.integration.amqp.dsl.AmqpMessageChannelSpec<S> ( java.lang.String java.lang.String , ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { return new AmqpMessageChannelSpec < S > ( org.springframework.integration.amqp.dsl.ConnectionFactory ) . id ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpPublishSubscribeMessageChannelSpec org.springframework.integration.amqp.dsl.AmqpPublishSubscribeMessageChannelSpec ( ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { return org.springframework.integration.amqp.dsl.AmqpPublishSubscribeMessageChannelSpec ( null , org.springframework.integration.amqp.dsl.ConnectionFactory ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.integration.amqp.dsl.AmqpPublishSubscribeMessageChannelSpec org.springframework.integration.amqp.dsl.AmqpPublishSubscribeMessageChannelSpec ( java.lang.String java.lang.String , ConnectionFactory org.springframework.integration.amqp.dsl.ConnectionFactory ) { return new AmqpPublishSubscribeMessageChannelSpec ( org.springframework.integration.amqp.dsl.ConnectionFactory ) . id ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private void ( ) {	}  <METHOD_END>
