<METHOD_START> protected int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( MessageConverter org.springframework.integration.syslog.inbound.MessageConverter ) { this . org.springframework.integration.syslog.inbound.MessageConverter = org.springframework.integration.syslog.inbound.MessageConverter ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. onInit ( ) ; if ( ! this . boolean ) { ( ( DefaultMessageConverter ) this . org.springframework.integration.syslog.inbound.MessageConverter ) . setBeanFactory ( this . getBeanFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( Message < ? > org.springframework.integration.syslog.inbound.Message<?> ) { try { if ( org.springframework.integration.syslog.inbound.Message<> instanceof ErrorMessage ) { if ( this . org.springframework.integration.syslog.inbound.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.syslog.inbound.Log . debug ( STRING + ( ( ErrorMessage ) org.springframework.integration.syslog.inbound.Message<> ) . getPayload ( ) . getMessage ( ) ) ; } } else { this . sendMessage ( this . org.springframework.integration.syslog.inbound.MessageConverter . fromSyslog ( org.springframework.integration.syslog.inbound.Message<> ) ) ; } } catch ( java.lang.Exception java.lang.Exception ) { throw new MessagingException ( org.springframework.integration.syslog.inbound.Message<> , STRING , java.lang.Exception ) ; } }  <METHOD_END>
