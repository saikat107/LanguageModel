<METHOD_START> public void ( ConnectionFactory org.springframework.boot.actuate.health.ConnectionFactory ) { this . org.springframework.boot.actuate.health.ConnectionFactory = org.springframework.boot.actuate.health.ConnectionFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Health . Health Health.Builder ) throws java.lang.Exception { Connection org.springframework.boot.actuate.health.Connection = this . org.springframework.boot.actuate.health.ConnectionFactory . createConnection ( ) ; try { org.springframework.boot.actuate.health.Connection . start ( ) ; Health.Builder . up ( ) . withDetail ( STRING , org.springframework.boot.actuate.health.Connection . getMetaData ( ) . getJMSProviderName ( ) ) ; } finally { org.springframework.boot.actuate.health.Connection . close ( ) ; } }  <METHOD_END>
