<METHOD_START> public void ( LoggingSystem org.springframework.boot.actuate.endpoint.LoggingSystem ) { super( STRING ); Assert . notNull ( org.springframework.boot.actuate.endpoint.LoggingSystem , STRING ) ; this . org.springframework.boot.actuate.endpoint.LoggingSystem = org.springframework.boot.actuate.endpoint.LoggingSystem ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> < LoggerConfiguration > java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> = this . org.springframework.boot.actuate.endpoint.LoggingSystem . getLoggerConfigurations ( ) ; if ( java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> == null ) { return java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( ) ; } java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.NavigableSet<org.springframework.boot.actuate.endpoint.LogLevel> ( ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> ( java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> ) ) ; return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private java.util.NavigableSet<org.springframework.boot.actuate.endpoint.LogLevel> < LogLevel > java.util.NavigableSet<org.springframework.boot.actuate.endpoint.LogLevel> ( ) { java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> < LogLevel > java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> = this . org.springframework.boot.actuate.endpoint.LoggingSystem . getSupportedLogLevels ( ) ; return new java.util.TreeSet <> ( java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> ) . descendingSet ( ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> < java.lang.String , org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels > java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> ( java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> < LoggerConfiguration > java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> ) { java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> < java.lang.String , org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels > java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> = new java.util.LinkedHashMap <> ( java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> . size ( ) ) ; for ( LoggerConfiguration org.springframework.boot.actuate.endpoint.LoggerConfiguration : java.util.Collection<org.springframework.boot.actuate.endpoint.LoggerConfiguration> ) { java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> . org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels ( org.springframework.boot.actuate.endpoint.LoggerConfiguration . getName ( ) , new org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels ( org.springframework.boot.actuate.endpoint.LoggerConfiguration ) ) ; } return java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels> ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; LoggerConfiguration org.springframework.boot.actuate.endpoint.LoggerConfiguration = this . org.springframework.boot.actuate.endpoint.LoggingSystem . getLoggerConfiguration ( java.lang.String ) ; return ( org.springframework.boot.actuate.endpoint.LoggerConfiguration == null ? null : new org.springframework.boot.actuate.endpoint.LoggersEndpoint.LoggerLevels ( org.springframework.boot.actuate.endpoint.LoggerConfiguration ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , LogLevel org.springframework.boot.actuate.endpoint.LogLevel ) { Assert . notNull ( java.lang.String , STRING ) ; this . org.springframework.boot.actuate.endpoint.LoggingSystem . setLogLevel ( java.lang.String , org.springframework.boot.actuate.endpoint.LogLevel ) ; }  <METHOD_END>
<METHOD_START> public void ( LoggerConfiguration org.springframework.boot.actuate.endpoint.LoggerConfiguration ) { this . java.lang.String = java.lang.String ( org.springframework.boot.actuate.endpoint.LoggerConfiguration . getConfiguredLevel ( ) ) ; this . java.lang.String = java.lang.String ( org.springframework.boot.actuate.endpoint.LoggerConfiguration . getEffectiveLevel ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( LogLevel org.springframework.boot.actuate.endpoint.LogLevel ) { return ( org.springframework.boot.actuate.endpoint.LogLevel == null ? null : org.springframework.boot.actuate.endpoint.LogLevel . name ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
