<METHOD_START> @ java.lang.Override public org.springframework.cassandra.test.integration.support.EventLoopGroup org.springframework.cassandra.test.integration.support.EventLoopGroup ( java.util.concurrent.ThreadFactory java.util.concurrent.ThreadFactory ) { if ( org.springframework.cassandra.test.integration.support.EventLoopGroup != null ) { return org.springframework.cassandra.test.integration.support.EventLoopGroup ; } EventLoopGroup org.springframework.cassandra.test.integration.support.EventLoopGroup = super. eventLoopGroup ( r -> { Thread thread = threadFactory . newThread ( r ) ; thread . setDaemon ( true ) ; return thread ; } ) ; org.springframework.cassandra.test.integration.support.IntegrationTestNettyOptions . org.springframework.cassandra.test.integration.support.EventLoopGroup = org.springframework.cassandra.test.integration.support.EventLoopGroup ; return org.springframework.cassandra.test.integration.support.EventLoopGroup ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.test.integration.support.Timer org.springframework.cassandra.test.integration.support.Timer ( java.util.concurrent.ThreadFactory java.util.concurrent.ThreadFactory ) { if ( org.springframework.cassandra.test.integration.support.Timer != null ) { return org.springframework.cassandra.test.integration.support.Timer ; } Timer org.springframework.cassandra.test.integration.support.Timer = super. timer ( java.util.concurrent.ThreadFactory ) ; java.lang.Runtime . java.lang.Runtime ( ) . void ( new java.lang.Thread ( org.springframework.cassandra.test.integration.support.Timer :: stop ) ) ; org.springframework.cassandra.test.integration.support.IntegrationTestNettyOptions . org.springframework.cassandra.test.integration.support.Timer = org.springframework.cassandra.test.integration.support.Timer ; return org.springframework.cassandra.test.integration.support.Timer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EventLoopGroup org.springframework.cassandra.test.integration.support.EventLoopGroup ) {}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Timer org.springframework.cassandra.test.integration.support.Timer ) {}  <METHOD_END>