<METHOD_START> @ BeforeClass public static void void ( ) java.lang.Exception { org.springframework.integration.jms.CachingConnectionFactory . setCacheConsumers ( false ) ; org.springframework.integration.jms.CachingConnectionFactory . createConnection ( ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { org.springframework.integration.jms.CachingConnectionFactory . resetConnection ( ) ; }  <METHOD_END>
