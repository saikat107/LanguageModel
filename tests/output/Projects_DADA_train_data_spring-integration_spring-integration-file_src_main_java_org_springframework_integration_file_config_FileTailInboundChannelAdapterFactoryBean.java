<METHOD_START> public void void ( java.lang.String java.lang.String ) { if ( StringUtils . hasText ( java.lang.String ) ) { this . java.lang.String = java.lang.String ; } }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { this . java.lang.Long = long ; }  <METHOD_END>
<METHOD_START> public void void ( java.io.File java.io.File ) { this . java.io.File = java.io.File ; }  <METHOD_END>
<METHOD_START> public void void ( TaskExecutor org.springframework.integration.file.config.TaskExecutor ) { this . org.springframework.integration.file.config.TaskExecutor = org.springframework.integration.file.config.TaskExecutor ; }  <METHOD_END>
<METHOD_START> public void void ( TaskScheduler org.springframework.integration.file.config.TaskScheduler ) { this . org.springframework.integration.file.config.TaskScheduler = org.springframework.integration.file.config.TaskScheduler ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.file.config.MessageChannel ) { this . org.springframework.integration.file.config.MessageChannel = org.springframework.integration.file.config.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.file.config.MessageChannel ) { this . org.springframework.integration.file.config.MessageChannel = org.springframework.integration.file.config.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . java.lang.Boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . java.lang.Integer = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEventPublisher org.springframework.integration.file.config.ApplicationEventPublisher ) { this . org.springframework.integration.file.config.ApplicationEventPublisher = org.springframework.integration.file.config.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.integration.file.config.FileTailingMessageProducerSupport != null ) { this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . start ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.integration.file.config.FileTailingMessageProducerSupport != null ) { this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . stop ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.integration.file.config.FileTailingMessageProducerSupport != null && this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . isRunning ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { if ( this . org.springframework.integration.file.config.FileTailingMessageProducerSupport != null ) { return this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . getPhase ( ) ; } return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.integration.file.config.FileTailingMessageProducerSupport != null && this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . isAutoStartup ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Runnable java.lang.Runnable ) { if ( this . org.springframework.integration.file.config.FileTailingMessageProducerSupport != null ) { this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . stop ( java.lang.Runnable ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return this . org.springframework.integration.file.config.FileTailingMessageProducerSupport == null ? FileTailingMessageProducerSupport .class : this . org.springframework.integration.file.config.FileTailingMessageProducerSupport . getClass ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.file.config.FileTailingMessageProducerSupport org.springframework.integration.file.config.FileTailingMessageProducerSupport ( ) java.lang.Exception { FileTailingMessageProducerSupport org.springframework.integration.file.config.FileTailingMessageProducerSupport ; if ( this . java.lang.Long == null && this . java.lang.Boolean == null && this . java.lang.Boolean == null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport = new OSDelegatingFileTailingMessageProducer ( ) ; ( ( OSDelegatingFileTailingMessageProducer ) org.springframework.integration.file.config.FileTailingMessageProducerSupport ) . setEnableStatusReader ( this . boolean ) ; if ( this . java.lang.String != null ) { ( ( OSDelegatingFileTailingMessageProducer ) org.springframework.integration.file.config.FileTailingMessageProducerSupport ) . setOptions ( this . java.lang.String ) ; } } else { Assert . isTrue ( this . java.lang.String == null , STRING ) ; org.springframework.integration.file.config.FileTailingMessageProducerSupport = new ApacheCommonsFileTailingMessageProducer ( ) ; if ( this . java.lang.Long != null ) { ( ( ApacheCommonsFileTailingMessageProducer ) org.springframework.integration.file.config.FileTailingMessageProducerSupport ) . setPollingDelay ( this . java.lang.Long ) ; } if ( this . java.lang.Boolean != null ) { ( ( ApacheCommonsFileTailingMessageProducer ) org.springframework.integration.file.config.FileTailingMessageProducerSupport ) . setEnd ( this . java.lang.Boolean ) ; } if ( this . java.lang.Boolean != null ) { ( ( ApacheCommonsFileTailingMessageProducer ) org.springframework.integration.file.config.FileTailingMessageProducerSupport ) . setReopen ( this . java.lang.Boolean ) ; } } org.springframework.integration.file.config.FileTailingMessageProducerSupport . setFile ( this . java.io.File ) ; if ( this . org.springframework.integration.file.config.TaskExecutor != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setTaskExecutor ( this . org.springframework.integration.file.config.TaskExecutor ) ; } if ( this . org.springframework.integration.file.config.TaskScheduler != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setTaskScheduler ( this . org.springframework.integration.file.config.TaskScheduler ) ; } if ( this . java.lang.Long != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setTailAttemptsDelay ( this . java.lang.Long ) ; } if ( this . java.lang.Long != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setIdleEventInterval ( this . java.lang.Long ) ; } org.springframework.integration.file.config.FileTailingMessageProducerSupport . setOutputChannel ( this . org.springframework.integration.file.config.MessageChannel ) ; org.springframework.integration.file.config.FileTailingMessageProducerSupport . setErrorChannel ( this . org.springframework.integration.file.config.MessageChannel ) ; org.springframework.integration.file.config.FileTailingMessageProducerSupport . setBeanName ( this . java.lang.String ) ; if ( this . java.lang.Boolean != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setAutoStartup ( this . java.lang.Boolean ) ; } if ( this . java.lang.Integer != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setPhase ( this . java.lang.Integer ) ; } if ( this . org.springframework.integration.file.config.ApplicationEventPublisher != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setApplicationEventPublisher ( this . org.springframework.integration.file.config.ApplicationEventPublisher ) ; } if ( getBeanFactory ( ) != null ) { org.springframework.integration.file.config.FileTailingMessageProducerSupport . setBeanFactory ( getBeanFactory ( ) ) ; } org.springframework.integration.file.config.FileTailingMessageProducerSupport . afterPropertiesSet ( ) ; this . org.springframework.integration.file.config.FileTailingMessageProducerSupport = org.springframework.integration.file.config.FileTailingMessageProducerSupport ; return org.springframework.integration.file.config.FileTailingMessageProducerSupport ; }  <METHOD_END>
