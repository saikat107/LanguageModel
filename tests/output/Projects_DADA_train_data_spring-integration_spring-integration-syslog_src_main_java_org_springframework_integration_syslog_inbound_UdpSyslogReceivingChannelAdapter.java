<METHOD_START> public void void ( UnicastReceivingChannelAdapter org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter ) { this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter = org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. onInit ( ) ; if ( this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter == null ) { this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter = new UnicastReceivingChannelAdapter ( this . getPort ( ) ) ; this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter . setBeanFactory ( getBeanFactory ( ) ) ; } else { logger . info ( STRING + STRING + STRING ) ; } this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter . setOutputChannel ( new FixedSubscriberChannel ( message -> convertAndSend ( message ) ) ) ; if ( ! this . boolean ) { this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter . afterPropertiesSet ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStart ( ) ; this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter . start ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStop ( ) ; this . org.springframework.integration.syslog.inbound.UnicastReceivingChannelAdapter . stop ( ) ; }  <METHOD_END>
