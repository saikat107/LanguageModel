<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ILoggingEvent org.springframework.boot.logging.logback.ILoggingEvent ) { org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger = org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger ( this . java.lang.String ) ; Level org.springframework.boot.logging.logback.Level = this . java.util.Map<org.springframework.boot.logging.logback.Level,org.springframework.boot.logging.logback.Level> . get ( org.springframework.boot.logging.logback.ILoggingEvent . getLevel ( ) ) ; org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger . void ( org.springframework.boot.logging.logback.Level == null ? org.springframework.boot.logging.logback.ILoggingEvent : new org.springframework.boot.logging.logback.LevelRemappingAppender.RemappedLoggingEvent ( org.springframework.boot.logging.logback.ILoggingEvent ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger ( java.lang.String java.lang.String ) { LoggerContext org.springframework.boot.logging.logback.LoggerContext = ( LoggerContext ) this . context ; return new org.springframework.boot.logging.logback.LevelRemappingAppender.AppendableLogger ( org.springframework.boot.logging.logback.LoggerContext . getLogger ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasLength ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasLength ( java.lang.String , STRING ) ; this . java.util.Map<org.springframework.boot.logging.logback.Level,org.springframework.boot.logging.logback.Level> = new java.util.HashMap <> ( ) ; for ( java.lang.String java.lang.String : StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ) { java.lang.String [] java.lang.String[] = StringUtils . split ( java.lang.String , STRING ) ; Assert . notNull ( java.lang.String[] , STRING + java.lang.String + STRING ) ; this . java.util.Map<org.springframework.boot.logging.logback.Level,org.springframework.boot.logging.logback.Level> . put ( Level . toLevel ( java.lang.String[] [ NUMBER ] ) , Level . toLevel ( java.lang.String[] [ NUMBER ] ) ) ; } }  <METHOD_END>
<METHOD_START> public void ( Logger org.springframework.boot.logging.logback.Logger ) { this . org.springframework.boot.logging.logback.Logger = org.springframework.boot.logging.logback.Logger ; }  <METHOD_END>
<METHOD_START> public void void ( ILoggingEvent org.springframework.boot.logging.logback.ILoggingEvent ) { if ( this . org.springframework.boot.logging.logback.Logger . isEnabledFor ( org.springframework.boot.logging.logback.ILoggingEvent . getLevel ( ) ) ) { this . org.springframework.boot.logging.logback.Logger . callAppenders ( org.springframework.boot.logging.logback.ILoggingEvent ) ; } }  <METHOD_END>
<METHOD_START> void ( ILoggingEvent org.springframework.boot.logging.logback.ILoggingEvent ) { this . org.springframework.boot.logging.logback.ILoggingEvent = org.springframework.boot.logging.logback.ILoggingEvent ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getThreadName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.logback.Level org.springframework.boot.logging.logback.Level ( ) { Level org.springframework.boot.logging.logback.Level = org.springframework.boot.logging.logback.LevelRemappingAppender .this . java.util.Map<org.springframework.boot.logging.logback.Level,org.springframework.boot.logging.logback.Level> . get ( this . org.springframework.boot.logging.logback.ILoggingEvent . getLevel ( ) ) ; return ( org.springframework.boot.logging.logback.Level == null ? this . org.springframework.boot.logging.logback.ILoggingEvent . getLevel ( ) : org.springframework.boot.logging.logback.Level ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getMessage ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object [] java.lang.Object[] ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getArgumentArray ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getFormattedMessage ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getLoggerName ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.logback.LoggerContextVO org.springframework.boot.logging.logback.LoggerContextVO ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getLoggerContextVO ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.logback.IThrowableProxy org.springframework.boot.logging.logback.IThrowableProxy ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getThrowableProxy ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.StackTraceElement [] java.lang.StackTraceElement[] ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getCallerData ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . hasCallerData ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.logback.Marker org.springframework.boot.logging.logback.Marker ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getMarker ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getMDCPropertyMap ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.Deprecated public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getMDCPropertyMap ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { return this . org.springframework.boot.logging.logback.ILoggingEvent . getTimeStamp ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.boot.logging.logback.ILoggingEvent . prepareForDeferredProcessing ( ) ; }  <METHOD_END>
