<METHOD_START> public void ( SubscribableChannel org.springframework.integration.endpoint.SubscribableChannel , MessageHandler org.springframework.integration.endpoint.MessageHandler ) { Assert . notNull ( org.springframework.integration.endpoint.SubscribableChannel , STRING ) ; Assert . notNull ( org.springframework.integration.endpoint.MessageHandler , STRING ) ; this . org.springframework.integration.endpoint.SubscribableChannel = org.springframework.integration.endpoint.SubscribableChannel ; this . org.springframework.integration.endpoint.MessageHandler = org.springframework.integration.endpoint.MessageHandler ; this . setPhase ( java.lang.Integer . int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.MessageChannel org.springframework.integration.endpoint.MessageChannel ( ) { return this . org.springframework.integration.endpoint.SubscribableChannel ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.MessageChannel org.springframework.integration.endpoint.MessageChannel ( ) { if ( this . org.springframework.integration.endpoint.MessageHandler instanceof MessageProducer ) { return ( ( MessageProducer ) this . org.springframework.integration.endpoint.MessageHandler ) . getOutputChannel ( ) ; } else if ( this . org.springframework.integration.endpoint.MessageHandler instanceof MessageRouter ) { return ( ( MessageRouter ) this . org.springframework.integration.endpoint.MessageHandler ) . getDefaultOutputChannel ( ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.MessageHandler org.springframework.integration.endpoint.MessageHandler ( ) { return this . org.springframework.integration.endpoint.MessageHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . void ( true ) ; this . org.springframework.integration.endpoint.SubscribableChannel . subscribe ( this . org.springframework.integration.endpoint.MessageHandler ) ; if ( this . org.springframework.integration.endpoint.MessageHandler instanceof Lifecycle ) { ( ( Lifecycle ) this . org.springframework.integration.endpoint.MessageHandler ) . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . void ( false ) ; this . org.springframework.integration.endpoint.SubscribableChannel . unsubscribe ( this . org.springframework.integration.endpoint.MessageHandler ) ; if ( this . org.springframework.integration.endpoint.MessageHandler instanceof Lifecycle ) { ( ( Lifecycle ) this . org.springframework.integration.endpoint.MessageHandler ) . stop ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean ) { if ( this . org.springframework.integration.endpoint.MessageHandler instanceof NamedComponent && this . org.springframework.integration.endpoint.SubscribableChannel instanceof NamedComponent ) { java.lang.String java.lang.String = ( ( NamedComponent ) this . org.springframework.integration.endpoint.SubscribableChannel ) . getComponentName ( ) ; java.lang.String java.lang.String = ( ( NamedComponent ) this . org.springframework.integration.endpoint.MessageHandler ) . getComponentType ( ) ; java.lang.String = StringUtils . hasText ( java.lang.String ) ? java.lang.String : STRING ; java.lang.String java.lang.String = getComponentName ( ) ; java.lang.String = ( StringUtils . hasText ( java.lang.String ) && java.lang.String . boolean ( STRING ) ) ? STRING : STRING + java.lang.String ; java.lang.StringBuffer java.lang.StringBuffer = new java.lang.StringBuffer ( ) ; java.lang.StringBuffer . java.lang.StringBuffer ( STRING + java.lang.String + java.lang.String + STRING + java.lang.String + STRING ) ; if ( boolean ) { java.lang.StringBuffer . java.lang.StringBuffer ( NUMBER , STRING ) ; } else { java.lang.StringBuffer . java.lang.StringBuffer ( NUMBER , STRING ) ; } logger . info ( java.lang.StringBuffer . java.lang.String ( ) ) ; } }  <METHOD_END>
