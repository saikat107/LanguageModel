<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.reflect.Method java.lang.reflect.Method ) { this . java.lang.reflect.Method = java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> public java.lang.reflect.Method java.lang.reflect.Method ( ) { return this . java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.reflect.Method java.lang.reflect.Method ) { this . java.lang.reflect.Method = java.lang.reflect.Method ; }  <METHOD_END>
<METHOD_START> public java.lang.reflect.Method java.lang.reflect.Method ( ) { if ( this . java.lang.reflect.Method != null ) { return this . java.lang.reflect.Method ; } else if ( AopUtils . isAopProxy ( this . java.lang.Object ) ) { java.lang.Class<?> < ? > java.lang.Class<?> = AopProxyUtils . ultimateTargetClass ( this . java.lang.Object ) ; return AopUtils . getMostSpecificMethod ( java.lang.reflect.Method ( ) , java.lang.Class<> ) ; } else { return java.lang.reflect.Method ( ) ; } }  <METHOD_END>
<METHOD_START> public void void ( MessageHandlerMethodFactory org.springframework.jms.config.MessageHandlerMethodFactory ) { this . org.springframework.jms.config.MessageHandlerMethodFactory = org.springframework.jms.config.MessageHandlerMethodFactory ; }  <METHOD_END>
<METHOD_START> public void void ( StringValueResolver org.springframework.jms.config.StringValueResolver ) { this . org.springframework.jms.config.StringValueResolver = org.springframework.jms.config.StringValueResolver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.jms.config.BeanFactory ) { if ( this . org.springframework.jms.config.StringValueResolver == null && org.springframework.jms.config.BeanFactory instanceof ConfigurableBeanFactory ) { this . org.springframework.jms.config.StringValueResolver = new EmbeddedValueResolver ( ( ConfigurableBeanFactory ) org.springframework.jms.config.BeanFactory ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.jms.config.MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter ( MessageListenerContainer org.springframework.jms.config.MessageListenerContainer ) { Assert . state ( this . org.springframework.jms.config.MessageHandlerMethodFactory != null , STRING ) ; MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter = org.springframework.jms.config.MessagingMessageListenerAdapter ( ) ; InvocableHandlerMethod org.springframework.jms.config.InvocableHandlerMethod = this . org.springframework.jms.config.MessageHandlerMethodFactory . createInvocableHandlerMethod ( java.lang.Object ( ) , java.lang.reflect.Method ( ) ) ; org.springframework.jms.config.MessagingMessageListenerAdapter . setHandlerMethod ( org.springframework.jms.config.InvocableHandlerMethod ) ; java.lang.String java.lang.String = java.lang.String ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( org.springframework.jms.config.MessageListenerContainer . isReplyPubSubDomain ( ) ) { org.springframework.jms.config.MessagingMessageListenerAdapter . setDefaultResponseTopicName ( java.lang.String ) ; } else { org.springframework.jms.config.MessagingMessageListenerAdapter . setDefaultResponseQueueName ( java.lang.String ) ; } } MessageConverter org.springframework.jms.config.MessageConverter = org.springframework.jms.config.MessageListenerContainer . getMessageConverter ( ) ; if ( org.springframework.jms.config.MessageConverter != null ) { org.springframework.jms.config.MessagingMessageListenerAdapter . setMessageConverter ( org.springframework.jms.config.MessageConverter ) ; } DestinationResolver org.springframework.jms.config.DestinationResolver = org.springframework.jms.config.MessageListenerContainer . getDestinationResolver ( ) ; if ( org.springframework.jms.config.DestinationResolver != null ) { org.springframework.jms.config.MessagingMessageListenerAdapter . setDestinationResolver ( org.springframework.jms.config.DestinationResolver ) ; } return org.springframework.jms.config.MessagingMessageListenerAdapter ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.config.MessagingMessageListenerAdapter org.springframework.jms.config.MessagingMessageListenerAdapter ( ) { return new MessagingMessageListenerAdapter ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { java.lang.reflect.Method java.lang.reflect.Method = java.lang.reflect.Method ( ) ; SendTo org.springframework.jms.config.SendTo = org.springframework.jms.config.SendTo ( java.lang.reflect.Method ) ; if ( org.springframework.jms.config.SendTo != null ) { java.lang.Object [] java.lang.Object[] = org.springframework.jms.config.SendTo . value ( ) ; if ( java.lang.Object[] . int != NUMBER ) { throw new java.lang.IllegalStateException ( STRING + SendTo .class . java.lang.String ( ) + STRING + java.lang.reflect.Method + STRING + java.util.Arrays . java.lang.String ( java.lang.Object[] ) + STRING ) ; } return java.lang.String ( ( java.lang.String ) java.lang.Object[] [ NUMBER ] ) ; } return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.config.SendTo org.springframework.jms.config.SendTo ( java.lang.reflect.Method java.lang.reflect.Method ) { SendTo org.springframework.jms.config.SendTo = AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method , SendTo .class ) ; if ( org.springframework.jms.config.SendTo == null ) { org.springframework.jms.config.SendTo = AnnotatedElementUtils . findMergedAnnotation ( java.lang.reflect.Method . java.lang.Class<?> ( ) , SendTo .class ) ; } return org.springframework.jms.config.SendTo ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return ( this . org.springframework.jms.config.StringValueResolver != null ? this . org.springframework.jms.config.StringValueResolver . resolveStringValue ( java.lang.String ) : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.StringBuilder java.lang.StringBuilder ( ) { return super. getEndpointDescription ( ) . append ( STRING ) . append ( this . java.lang.Object ) . append ( STRING ) . append ( STRING ) . append ( this . java.lang.reflect.Method ) . append ( STRING ) ; }  <METHOD_END>
