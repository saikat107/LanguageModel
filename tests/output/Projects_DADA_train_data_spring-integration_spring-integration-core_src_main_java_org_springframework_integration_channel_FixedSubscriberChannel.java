<METHOD_START> public void ( ) { throw new java.lang.IllegalArgumentException ( STRING + this . java.lang.Class<? extends org.springframework.integration.channel.FixedSubscriberChannel> ( ) . java.lang.String ( ) + STRING ) ; }  <METHOD_END>
<METHOD_START> public void ( MessageHandler org.springframework.integration.channel.MessageHandler ) { this . org.springframework.integration.channel.MessageHandler = org.springframework.integration.channel.MessageHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Message < ? > org.springframework.integration.channel.Message<?> ) { return this . boolean ( org.springframework.integration.channel.Message<> , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Message < ? > org.springframework.integration.channel.Message<?> , long long ) { try { this . org.springframework.integration.channel.MessageHandler . handleMessage ( org.springframework.integration.channel.Message<> ) ; return true ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { if ( java.lang.RuntimeException instanceof MessagingException && ( ( MessagingException ) java.lang.RuntimeException ) . getFailedMessage ( ) == null ) { throw new MessagingException ( org.springframework.integration.channel.Message<> , STRING , java.lang.RuntimeException ) ; } else { throw java.lang.RuntimeException ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MessageHandler org.springframework.integration.channel.MessageHandler ) { if ( org.springframework.integration.channel.MessageHandler != this . org.springframework.integration.channel.MessageHandler && this . org.springframework.integration.channel.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.channel.Log . debug ( this . java.lang.String ( ) + STRING ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MessageHandler org.springframework.integration.channel.MessageHandler ) { if ( this . org.springframework.integration.channel.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.channel.Log . debug ( this . java.lang.String ( ) + STRING ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { if ( this . java.lang.String != null ) { return this . java.lang.String ; } else { return STRING ; } }  <METHOD_END>
