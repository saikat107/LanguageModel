<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( ApplicationEventPublisher org.springframework.integration.leader.event.ApplicationEventPublisher ) { this . org.springframework.integration.leader.event.ApplicationEventPublisher = org.springframework.integration.leader.event.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Context org.springframework.integration.leader.event.Context , java.lang.String java.lang.String ) { if ( this . org.springframework.integration.leader.event.ApplicationEventPublisher != null ) { this . org.springframework.integration.leader.event.ApplicationEventPublisher . publishEvent ( new OnGrantedEvent ( java.lang.Object , org.springframework.integration.leader.event.Context , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , Context org.springframework.integration.leader.event.Context , java.lang.String java.lang.String ) { if ( this . org.springframework.integration.leader.event.ApplicationEventPublisher != null ) { this . org.springframework.integration.leader.event.ApplicationEventPublisher . publishEvent ( new OnRevokedEvent ( java.lang.Object , org.springframework.integration.leader.event.Context , java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEventPublisher org.springframework.integration.leader.event.ApplicationEventPublisher ) { this . org.springframework.integration.leader.event.ApplicationEventPublisher = org.springframework.integration.leader.event.ApplicationEventPublisher ; }  <METHOD_END>
