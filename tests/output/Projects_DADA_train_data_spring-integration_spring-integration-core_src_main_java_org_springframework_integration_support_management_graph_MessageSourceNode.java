<METHOD_START> public void ( int int , java.lang.String java.lang.String , MessageSource < ? > org.springframework.integration.support.management.graph.MessageSource<?> , java.lang.String java.lang.String , java.lang.String java.lang.String ) { super( int , java.lang.String , org.springframework.integration.support.management.graph.MessageSource<> , java.lang.String , java.lang.String , org.springframework.integration.support.management.graph.MessageSource<> instanceof MessageSourceMetrics ? new org.springframework.integration.support.management.graph.MessageSourceNode.Stats ( ( MessageSourceMetrics ) org.springframework.integration.support.management.graph.MessageSource<> ) : new IntegrationNode . IntegrationNode ( ) ); }  <METHOD_END>
<METHOD_START> void ( MessageSourceMetrics org.springframework.integration.support.management.graph.MessageSourceMetrics ) { this . org.springframework.integration.support.management.graph.MessageSourceMetrics = org.springframework.integration.support.management.graph.MessageSourceMetrics ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return this . org.springframework.integration.support.management.graph.MessageSourceMetrics . isCountsEnabled ( ) ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . org.springframework.integration.support.management.graph.MessageSourceMetrics . getMessageCountLong ( ) ; }  <METHOD_END>