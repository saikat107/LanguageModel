<METHOD_START> @ After public void void ( ) { java.lang.System . java.lang.String ( LoggingSystem . SYSTEM_PROPERTY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.System . java.lang.String ( LoggingSystem . SYSTEM_PROPERTY , LoggingSystem . NONE ) ; LoggingSystem org.springframework.boot.logging.LoggingSystem = LoggingSystem . get ( java.lang.Class<? extends org.springframework.boot.logging.LoggingSystemTests> ( ) . java.lang.ClassLoader ( ) ) ; assertThat ( org.springframework.boot.logging.LoggingSystem ) . isInstanceOf ( NoOpLoggingSystem .class ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) { new org.springframework.boot.logging.LoggingSystemTests.StubLoggingSystem ( ) . getLoggerConfiguration ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) { new org.springframework.boot.logging.LoggingSystemTests.StubLoggingSystem ( ) . getLoggerConfigurations ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , LogLevel org.springframework.boot.logging.LogLevel ) { }  <METHOD_END>
