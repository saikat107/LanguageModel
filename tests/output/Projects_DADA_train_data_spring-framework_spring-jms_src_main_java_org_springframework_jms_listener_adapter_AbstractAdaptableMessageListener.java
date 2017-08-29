<METHOD_START> public void void ( Destination org.springframework.jms.listener.adapter.Destination ) { this . java.lang.Object = org.springframework.jms.listener.adapter.Destination ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.Object = new org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.Object = new org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder ( java.lang.String , true ) ; }  <METHOD_END>
<METHOD_START> public void void ( DestinationResolver org.springframework.jms.listener.adapter.DestinationResolver ) { Assert . notNull ( org.springframework.jms.listener.adapter.DestinationResolver , STRING ) ; this . org.springframework.jms.listener.adapter.DestinationResolver = org.springframework.jms.listener.adapter.DestinationResolver ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.listener.adapter.DestinationResolver org.springframework.jms.listener.adapter.DestinationResolver ( ) { return this . org.springframework.jms.listener.adapter.DestinationResolver ; }  <METHOD_END>
<METHOD_START> public void void ( MessageConverter org.springframework.jms.listener.adapter.MessageConverter ) { this . org.springframework.jms.listener.adapter.MessageConverter = org.springframework.jms.listener.adapter.MessageConverter ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.listener.adapter.MessageConverter org.springframework.jms.listener.adapter.MessageConverter ( ) { return this . org.springframework.jms.listener.adapter.MessageConverter ; }  <METHOD_END>
<METHOD_START> public void void ( JmsHeaderMapper org.springframework.jms.listener.adapter.JmsHeaderMapper ) { Assert . notNull ( org.springframework.jms.listener.adapter.JmsHeaderMapper , STRING ) ; this . org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.MessagingMessageConverterAdapter . setHeaderMapper ( org.springframework.jms.listener.adapter.JmsHeaderMapper ) ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.jms.listener.adapter.MessagingMessageConverter org.springframework.jms.listener.adapter.MessagingMessageConverter ( ) { return this . org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.MessagingMessageConverterAdapter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Message org.springframework.jms.listener.adapter.Message ) { try { void ( org.springframework.jms.listener.adapter.Message , null ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { void ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Throwable java.lang.Throwable ) { org.springframework.jms.listener.adapter.Log . error ( STRING , java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( Message org.springframework.jms.listener.adapter.Message ) { try { MessageConverter org.springframework.jms.listener.adapter.MessageConverter = org.springframework.jms.listener.adapter.MessageConverter ( ) ; if ( org.springframework.jms.listener.adapter.MessageConverter != null ) { return org.springframework.jms.listener.adapter.MessageConverter . fromMessage ( org.springframework.jms.listener.adapter.Message ) ; } return org.springframework.jms.listener.adapter.Message ; } catch ( JMSException org.springframework.jms.listener.adapter.JMSException ) { throw new MessageConversionException ( STRING , org.springframework.jms.listener.adapter.JMSException ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object , Message org.springframework.jms.listener.adapter.Message , Session org.springframework.jms.listener.adapter.Session ) { if ( org.springframework.jms.listener.adapter.Session != null ) { if ( org.springframework.jms.listener.adapter.Log . isDebugEnabled ( ) ) { org.springframework.jms.listener.adapter.Log . debug ( STRING + java.lang.Object + STRING ) ; } try { Message org.springframework.jms.listener.adapter.Message = org.springframework.jms.listener.adapter.Message ( org.springframework.jms.listener.adapter.Session , java.lang.Object ) ; void ( org.springframework.jms.listener.adapter.Message , org.springframework.jms.listener.adapter.Message ) ; Destination org.springframework.jms.listener.adapter.Destination = org.springframework.jms.listener.adapter.Destination ( org.springframework.jms.listener.adapter.Message , org.springframework.jms.listener.adapter.Message , org.springframework.jms.listener.adapter.Session , java.lang.Object ) ; void ( org.springframework.jms.listener.adapter.Session , org.springframework.jms.listener.adapter.Destination , org.springframework.jms.listener.adapter.Message ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new ReplyFailureException ( STRING + java.lang.Object + STRING , java.lang.Exception ) ; } } else { if ( org.springframework.jms.listener.adapter.Log . isWarnEnabled ( ) ) { org.springframework.jms.listener.adapter.Log . warn ( STRING + java.lang.Object + STRING ) ; } } }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.listener.adapter.Message org.springframework.jms.listener.adapter.Message ( Session org.springframework.jms.listener.adapter.Session , java.lang.Object java.lang.Object ) throws org.springframework.jms.listener.adapter.JMSException { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object instanceof JmsResponse ? ( ( JmsResponse < ? > ) java.lang.Object ) . getResponse ( ) : java.lang.Object ) ; MessageConverter org.springframework.jms.listener.adapter.MessageConverter = org.springframework.jms.listener.adapter.MessageConverter ( ) ; if ( org.springframework.jms.listener.adapter.MessageConverter != null ) { if ( java.lang.Object instanceof org . springframework . org.springframework.messaging . org.springframework.messaging ) { return this . org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.MessagingMessageConverterAdapter . toMessage ( java.lang.Object , org.springframework.jms.listener.adapter.Session ) ; } else { return org.springframework.jms.listener.adapter.MessageConverter . toMessage ( java.lang.Object , org.springframework.jms.listener.adapter.Session ) ; } } if ( ! ( java.lang.Object instanceof Message ) ) { throw new MessageConversionException ( STRING + java.lang.Object + STRING ) ; } return ( Message ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected void void ( Message org.springframework.jms.listener.adapter.Message , Message org.springframework.jms.listener.adapter.Message ) throws org.springframework.jms.listener.adapter.JMSException { java.lang.String java.lang.String = org.springframework.jms.listener.adapter.Message . getJMSCorrelationID ( ) ; if ( java.lang.String == null ) { java.lang.String = org.springframework.jms.listener.adapter.Message . getJMSMessageID ( ) ; } org.springframework.jms.listener.adapter.Message . setJMSCorrelationID ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.jms.listener.adapter.Destination org.springframework.jms.listener.adapter.Destination ( Message org.springframework.jms.listener.adapter.Message , Message org.springframework.jms.listener.adapter.Message , Session org.springframework.jms.listener.adapter.Session , java.lang.Object java.lang.Object )			throws org.springframework.jms.listener.adapter.JMSException { if ( java.lang.Object instanceof JmsResponse ) { JmsResponse < ? > org.springframework.jms.listener.adapter.JmsResponse<?> = ( JmsResponse ) java.lang.Object ; Destination org.springframework.jms.listener.adapter.Destination = org.springframework.jms.listener.adapter.JmsResponse<> . resolveDestination ( org.springframework.jms.listener.adapter.DestinationResolver ( ) , org.springframework.jms.listener.adapter.Session ) ; if ( org.springframework.jms.listener.adapter.Destination != null ) { return org.springframework.jms.listener.adapter.Destination ; } } return org.springframework.jms.listener.adapter.Destination ( org.springframework.jms.listener.adapter.Message , org.springframework.jms.listener.adapter.Message , org.springframework.jms.listener.adapter.Session ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.listener.adapter.Destination org.springframework.jms.listener.adapter.Destination ( Message org.springframework.jms.listener.adapter.Message , Message org.springframework.jms.listener.adapter.Message , Session org.springframework.jms.listener.adapter.Session )			throws org.springframework.jms.listener.adapter.JMSException { Destination org.springframework.jms.listener.adapter.Destination = org.springframework.jms.listener.adapter.Message . getJMSReplyTo ( ) ; if ( org.springframework.jms.listener.adapter.Destination == null ) { org.springframework.jms.listener.adapter.Destination = org.springframework.jms.listener.adapter.Destination ( org.springframework.jms.listener.adapter.Session ) ; if ( org.springframework.jms.listener.adapter.Destination == null ) { throw new InvalidDestinationException ( STRING + STRING ) ; } } return org.springframework.jms.listener.adapter.Destination ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jms.listener.adapter.Destination org.springframework.jms.listener.adapter.Destination ( Session org.springframework.jms.listener.adapter.Session ) throws org.springframework.jms.listener.adapter.JMSException { if ( this . java.lang.Object instanceof Destination ) { return ( Destination ) this . java.lang.Object ; } if ( this . java.lang.Object instanceof org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder ) { org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder = ( org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder ) this . java.lang.Object ; return org.springframework.jms.listener.adapter.DestinationResolver ( ) . resolveDestinationName ( org.springframework.jms.listener.adapter.Session , org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder . java.lang.String , org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.DestinationNameHolder . boolean ) ; } return null ; }  <METHOD_END>
<METHOD_START> protected void void ( Session org.springframework.jms.listener.adapter.Session , Destination org.springframework.jms.listener.adapter.Destination , Message org.springframework.jms.listener.adapter.Message ) throws org.springframework.jms.listener.adapter.JMSException { MessageProducer org.springframework.jms.listener.adapter.MessageProducer = org.springframework.jms.listener.adapter.Session . createProducer ( org.springframework.jms.listener.adapter.Destination ) ; try { void ( org.springframework.jms.listener.adapter.MessageProducer , org.springframework.jms.listener.adapter.Message ) ; org.springframework.jms.listener.adapter.MessageProducer . send ( org.springframework.jms.listener.adapter.Message ) ; } finally { JmsUtils . closeMessageProducer ( org.springframework.jms.listener.adapter.MessageProducer ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( MessageProducer org.springframework.jms.listener.adapter.MessageProducer , Message org.springframework.jms.listener.adapter.Message ) throws org.springframework.jms.listener.adapter.JMSException {	}  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public java.lang.Object java.lang.Object ( javax . javax.jms . javax.jms javax.jms.Message ) throws org.springframework.jms.listener.adapter.JMSException , org.springframework.jms.listener.adapter.MessageConversionException { if ( javax.jms.Message == null ) { return null ; } return new org.springframework.jms.listener.adapter.AbstractAdaptableMessageListener.MessagingMessageConverterAdapter.LazyResolutionMessage ( javax.jms.Message ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message org.springframework.jms.listener.adapter.Message ) throws org.springframework.jms.listener.adapter.JMSException { java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.jms.listener.adapter.Message ) ; if ( org.springframework.jms.listener.adapter.Message instanceof BytesMessage ) { try { ( ( BytesMessage ) org.springframework.jms.listener.adapter.Message ) . reset ( ) ; } catch ( JMSException org.springframework.jms.listener.adapter.JMSException ) { org.springframework.jms.listener.adapter.Log . debug ( STRING , org.springframework.jms.listener.adapter.JMSException ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.jms.listener.adapter.Message org.springframework.jms.listener.adapter.Message ( java.lang.Object java.lang.Object , Session org.springframework.jms.listener.adapter.Session , java.lang.Object java.lang.Object )				throws org.springframework.jms.listener.adapter.JMSException { MessageConverter org.springframework.jms.listener.adapter.MessageConverter = org.springframework.jms.listener.adapter.MessageConverter ( ) ; if ( org.springframework.jms.listener.adapter.MessageConverter == null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object + STRING ) ; } if ( org.springframework.jms.listener.adapter.MessageConverter instanceof SmartMessageConverter ) { return ( ( SmartMessageConverter ) org.springframework.jms.listener.adapter.MessageConverter ) . toMessage ( java.lang.Object , org.springframework.jms.listener.adapter.Session , java.lang.Object ) ; } return org.springframework.jms.listener.adapter.MessageConverter . toMessage ( java.lang.Object , org.springframework.jms.listener.adapter.Session ) ; }  <METHOD_END>
<METHOD_START> public void ( javax . javax.jms . javax.jms javax.jms.Message ) { this . javax.jms.Message = javax.jms.Message ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { if ( this . java.lang.Object == null ) { try { this . java.lang.Object = java.lang.Object ( ) ; } catch ( JMSException org.springframework.jms.listener.adapter.JMSException ) { throw new MessageConversionException ( STRING + this . javax.jms.Message + STRING , org.springframework.jms.listener.adapter.JMSException ) ; } } return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( ) org.springframework.jms.listener.adapter.JMSException { java.lang.Object java.lang.Object = java.lang.Object ( this . javax.jms.Message ) ; if ( java.lang.Object instanceof org . springframework . org.springframework.messaging . org.springframework.messaging ) { return ( ( org . springframework . org.springframework.messaging . org.springframework.messaging ) java.lang.Object ) . getPayload ( ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jms.listener.adapter.MessageHeaders org.springframework.jms.listener.adapter.MessageHeaders ( ) { if ( this . org.springframework.jms.listener.adapter.MessageHeaders == null ) { this . org.springframework.jms.listener.adapter.MessageHeaders = extractHeaders ( this . javax.jms.Message ) ; } return this . org.springframework.jms.listener.adapter.MessageHeaders ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , boolean boolean ) { this . java.lang.String = java.lang.String ; this . boolean = boolean ; }  <METHOD_END>
