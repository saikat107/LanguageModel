<METHOD_START> public void ( RabbitTemplate org.springframework.boot.actuate.health.RabbitTemplate ) { Assert . notNull ( org.springframework.boot.actuate.health.RabbitTemplate , STRING ) ; this . org.springframework.boot.actuate.health.RabbitTemplate = org.springframework.boot.actuate.health.RabbitTemplate ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Health . Health Health.Builder ) throws java.lang.Exception { Health.Builder . up ( ) . withDetail ( STRING , java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return this . org.springframework.boot.actuate.health.RabbitTemplate . execute ( new ChannelCallback < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( Channel org.springframework.boot.actuate.health.Channel ) throws java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.health.Channel . getConnection ( ) . getServerProperties ( ) ; return java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) . java.lang.String ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Channel org.springframework.boot.actuate.health.Channel ) throws java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.boot.actuate.health.Channel . getConnection ( ) . getServerProperties ( ) ; return java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) . java.lang.String ( ) ; }  <METHOD_END>
