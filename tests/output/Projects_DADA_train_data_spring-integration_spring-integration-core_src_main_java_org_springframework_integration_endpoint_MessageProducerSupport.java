<METHOD_START> protected void ( ) { this . setPhase ( java.lang.Integer . int / NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageChannel org.springframework.integration.endpoint.MessageChannel ) { this . org.springframework.integration.endpoint.MessageChannel = org.springframework.integration.endpoint.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.endpoint.MessageChannel org.springframework.integration.endpoint.MessageChannel ( ) { if ( this . java.lang.String != null ) { synchronized ( this ) { if ( this . java.lang.String != null ) { this . org.springframework.integration.endpoint.MessageChannel = getChannelResolver ( ) . resolveDestination ( this . java.lang.String ) ; this . java.lang.String = null ; } } } return this . org.springframework.integration.endpoint.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.endpoint.MessageChannel ) { this . org.springframework.integration.endpoint.MessageChannel = org.springframework.integration.endpoint.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.endpoint.MessageChannel org.springframework.integration.endpoint.MessageChannel ( ) { if ( this . java.lang.String != null ) { synchronized ( this ) { if ( this . java.lang.String != null ) { this . org.springframework.integration.endpoint.MessageChannel = getChannelResolver ( ) . resolveDestination ( this . java.lang.String ) ; this . java.lang.String = null ; } } } return this . org.springframework.integration.endpoint.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . org.springframework.integration.endpoint.MessagingTemplate . setSendTimeout ( long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.endpoint.MessagingTemplate org.springframework.integration.endpoint.MessagingTemplate ( ) { return this . org.springframework.integration.endpoint.MessagingTemplate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { Assert . state ( this . org.springframework.integration.endpoint.MessageChannel != null || StringUtils . hasText ( this . java.lang.String ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( this . getBeanFactory ( ) != null ) { this . org.springframework.integration.endpoint.MessagingTemplate . setBeanFactory ( this . getBeanFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) {	}  <METHOD_END>
<METHOD_START> protected void void ( Message < ? > org.springframework.integration.endpoint.Message<?> ) { if ( org.springframework.integration.endpoint.Message<> == null ) { throw new MessagingException ( STRING ) ; } if ( this . boolean ) { org.springframework.integration.endpoint.Message<?> = MessageHistory . write ( org.springframework.integration.endpoint.Message<> , this , this . getMessageBuilderFactory ( ) ) ; } try { this . org.springframework.integration.endpoint.MessagingTemplate . send ( org.springframework.integration.endpoint.MessageChannel ( ) , org.springframework.integration.endpoint.Message<> ) ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { MessageChannel org.springframework.integration.endpoint.MessageChannel = org.springframework.integration.endpoint.MessageChannel ( ) ; if ( org.springframework.integration.endpoint.MessageChannel != null ) { this . org.springframework.integration.endpoint.MessagingTemplate . send ( org.springframework.integration.endpoint.MessageChannel , new ErrorMessage ( java.lang.RuntimeException ) ) ; } else { throw java.lang.RuntimeException ; } } }  <METHOD_END>
