<METHOD_START> @ BeforeClass public static void void ( ) java.lang.Exception { int int = findAvailablePort ( ) ; org.springframework.data.gemfire.config.xml.ProcessWrapper = run ( CqCacheServerProcess .class , java.lang.String . java.lang.String ( STRING , GEMFIRE_CACHE_SERVER_PORT_PROPERTY , int ) ) ; waitForServerToStart ( DEFAULT_HOSTNAME , int ) ; java.lang.System . java.lang.String ( GEMFIRE_CACHE_SERVER_PORT_PROPERTY , java.lang.String . java.lang.String ( int ) ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { java.lang.System . java.lang.String ( GEMFIRE_CACHE_SERVER_PORT_PROPERTY ) ; stop ( org.springframework.data.gemfire.config.xml.ProcessWrapper ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNotNull ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer ) ; assertTrue ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer . isActive ( ) ) ; assertFalse ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer . isAutoStartup ( ) ) ; assertFalse ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer . isRunning ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer . getPhase ( ) ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.ErrorHandler ) ; assertSame ( org.springframework.data.gemfire.config.xml.ErrorHandler , TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer ) ) ; assertNotNull ( java.util.concurrent.Executor ) ; assertSame ( java.util.concurrent.Executor , TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListenerContainer ) ) ; CqQuery [] org.springframework.data.gemfire.config.xml.CqQuery[] = org.springframework.data.gemfire.config.xml.ClientCache . getQueryService ( ) . getCqs ( ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.CqQuery[] ) ; assertEquals ( NUMBER , queries . length ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( NUMBER ) ; for ( CqQuery org.springframework.data.gemfire.config.xml.CqQuery : org.springframework.data.gemfire.config.xml.CqQuery[] ) { java.util.List<java.lang.String> . boolean ( org.springframework.data.gemfire.config.xml.CqQuery . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.CqQuery . getQueryString ( ) ) ; assertEquals ( STRING . boolean ( org.springframework.data.gemfire.config.xml.CqQuery . getName ( ) ) , org.springframework.data.gemfire.config.xml.CqQuery . isDurable ( ) ) ; CqListener org.springframework.data.gemfire.config.xml.CqListener = org.springframework.data.gemfire.config.xml.CqQuery . getCqAttributes ( ) . getCqListener ( ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.CqListener ) ; ContinuousQueryListener org.springframework.data.gemfire.config.xml.ContinuousQueryListener = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.CqListener ) ; assertTrue ( org.springframework.data.gemfire.config.xml.ContinuousQueryListener instanceof ContinuousQueryListenerAdapter ) ; assertTrue ( ( ( ContinuousQueryListenerAdapter ) org.springframework.data.gemfire.config.xml.ContinuousQueryListener ) . getDelegate ( ) instanceof GemfireMDP ) ; if ( STRING . boolean ( org.springframework.data.gemfire.config.xml.CqQuery . getName ( ) ) ) { assertEquals ( STRING , TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.ContinuousQueryListener ) ) ; } } java.util.List<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; }  <METHOD_END>
