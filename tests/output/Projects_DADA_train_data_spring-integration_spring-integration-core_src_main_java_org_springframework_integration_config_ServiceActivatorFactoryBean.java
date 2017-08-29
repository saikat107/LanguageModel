<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.MessageHandler org.springframework.integration.config.MessageHandler ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { MessageHandler org.springframework.integration.config.MessageHandler = null ; org.springframework.integration.config.MessageHandler = org.springframework.integration.config.MessageHandler ( java.lang.Object , java.lang.String ) ; if ( org.springframework.integration.config.MessageHandler == null ) { org.springframework.integration.config.MessageHandler = org.springframework.integration.config.MessageHandler ( StringUtils . hasText ( java.lang.String ) ? new ServiceActivatingHandler ( java.lang.Object , java.lang.String ) : new ServiceActivatingHandler ( java.lang.Object ) ) ; } return org.springframework.integration.config.MessageHandler ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.config.MessageHandler org.springframework.integration.config.MessageHandler ( final java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { MessageHandler org.springframework.integration.config.MessageHandler = null ; if ( java.lang.Object instanceof MessageHandler && this . methodIsHandleMessageOrEmpty ( java.lang.String ) ) { if ( java.lang.Object instanceof AbstractMessageProducingHandler ) { return ( MessageHandler ) java.lang.Object ; } org.springframework.integration.config.MessageHandler = new AbstractReplyProducingMessageHandler ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.config.Message<?> ) { ( ( MessageHandler ) java.lang.Object ) . handleMessage ( org.springframework.integration.config.Message<> ) ; return null ; } } ; } return org.springframework.integration.config.MessageHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.config.Message<?> ) { ( ( MessageHandler ) java.lang.Object ) . handleMessage ( org.springframework.integration.config.Message<> ) ; return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.config.MessageHandler org.springframework.integration.config.MessageHandler ( Expression org.springframework.integration.config.Expression ) { ExpressionEvaluatingMessageProcessor < java.lang.Object > org.springframework.integration.config.ExpressionEvaluatingMessageProcessor<java.lang.Object> = new ExpressionEvaluatingMessageProcessor < java.lang.Object > ( org.springframework.integration.config.Expression ) ; org.springframework.integration.config.ExpressionEvaluatingMessageProcessor<java.lang.Object> . setBeanFactory ( this . getBeanFactory ( ) ) ; ServiceActivatingHandler org.springframework.integration.config.ServiceActivatingHandler = new ServiceActivatingHandler ( org.springframework.integration.config.ExpressionEvaluatingMessageProcessor<java.lang.Object> ) ; org.springframework.integration.config.ServiceActivatingHandler . setPrimaryExpression ( org.springframework.integration.config.Expression ) ; return this . org.springframework.integration.config.MessageHandler ( org.springframework.integration.config.ServiceActivatingHandler ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected < T > org.springframework.integration.config.MessageHandler org.springframework.integration.config.MessageHandler ( MessageProcessor < T > org.springframework.integration.config.MessageProcessor<T> ) { return this . org.springframework.integration.config.MessageHandler ( new ServiceActivatingHandler ( org.springframework.integration.config.MessageProcessor<T> ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.config.MessageHandler org.springframework.integration.config.MessageHandler ( ServiceActivatingHandler org.springframework.integration.config.ServiceActivatingHandler ) { void ( org.springframework.integration.config.ServiceActivatingHandler ) ; return org.springframework.integration.config.ServiceActivatingHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( AbstractMessageProducingHandler org.springframework.integration.config.AbstractMessageProducingHandler ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( AbstractMessageProducingHandler org.springframework.integration.config.AbstractMessageProducingHandler ) { if ( this . java.lang.Long != null ) { org.springframework.integration.config.AbstractMessageProducingHandler . setSendTimeout ( this . java.lang.Long ) ; } if ( this . java.lang.Boolean != null ) { if ( org.springframework.integration.config.AbstractMessageProducingHandler instanceof AbstractReplyProducingMessageHandler ) { ( ( AbstractReplyProducingMessageHandler ) org.springframework.integration.config.AbstractMessageProducingHandler ) . setRequiresReply ( this . java.lang.Boolean ) ; } else { if ( this . java.lang.Boolean && logger . isDebugEnabled ( ) ) { logger . debug ( STRING + org.springframework.integration.config.AbstractMessageProducingHandler . getComponentName ( ) + STRING ) ; } } } }  <METHOD_END>