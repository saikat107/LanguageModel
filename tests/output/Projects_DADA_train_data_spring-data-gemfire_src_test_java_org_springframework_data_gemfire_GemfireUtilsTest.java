<METHOD_START> @ Test public void void ( ) { ClientCache org.springframework.data.gemfire.ClientCache = mock ( ClientCache .class ) ; assertThat ( GemfireUtils . isClient ( org.springframework.data.gemfire.ClientCache ) , is ( true ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.ClientCache ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Cache org.springframework.data.gemfire.Cache = mock ( Cache .class ) ; assertThat ( GemfireUtils . isClient ( org.springframework.data.gemfire.Cache ) , is ( false ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.Cache ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientCache org.springframework.data.gemfire.ClientCache = mock ( ClientCache .class ) ; DistributedSystem org.springframework.data.gemfire.DistributedSystem = mock ( DistributedSystem .class ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( GemfireUtils . DURABLE_CLIENT_ID_PROPERTY_NAME , STRING ) ; when ( org.springframework.data.gemfire.ClientCache . getDistributedSystem ( ) ) . thenReturn ( org.springframework.data.gemfire.DistributedSystem ) ; when ( org.springframework.data.gemfire.DistributedSystem . isConnected ( ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.DistributedSystem . getProperties ( ) ) . thenReturn ( java.util.Properties ) ; assertThat ( GemfireUtils . isDurable ( org.springframework.data.gemfire.ClientCache ) , is ( true ) ) ; verify ( org.springframework.data.gemfire.ClientCache , times ( NUMBER ) ) . getDistributedSystem ( ) ; verify ( org.springframework.data.gemfire.DistributedSystem , times ( NUMBER ) ) . isConnected ( ) ; verify ( org.springframework.data.gemfire.DistributedSystem , times ( NUMBER ) ) . getProperties ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientCache org.springframework.data.gemfire.ClientCache = mock ( ClientCache .class ) ; DistributedSystem org.springframework.data.gemfire.DistributedSystem = mock ( DistributedSystem .class ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . java.lang.Object ( GemfireUtils . DURABLE_CLIENT_ID_PROPERTY_NAME , STRING ) ; when ( org.springframework.data.gemfire.ClientCache . getDistributedSystem ( ) ) . thenReturn ( org.springframework.data.gemfire.DistributedSystem ) ; when ( org.springframework.data.gemfire.DistributedSystem . isConnected ( ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.DistributedSystem . getProperties ( ) ) . thenReturn ( java.util.Properties ) ; assertThat ( GemfireUtils . isDurable ( org.springframework.data.gemfire.ClientCache ) , is ( false ) ) ; verify ( org.springframework.data.gemfire.ClientCache , times ( NUMBER ) ) . getDistributedSystem ( ) ; verify ( org.springframework.data.gemfire.DistributedSystem , times ( NUMBER ) ) . isConnected ( ) ; verify ( org.springframework.data.gemfire.DistributedSystem , times ( NUMBER ) ) . getProperties ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientCache org.springframework.data.gemfire.ClientCache = mock ( ClientCache .class ) ; DistributedSystem org.springframework.data.gemfire.DistributedSystem = mock ( DistributedSystem .class ) ; when ( org.springframework.data.gemfire.ClientCache . getDistributedSystem ( ) ) . thenReturn ( org.springframework.data.gemfire.DistributedSystem ) ; when ( org.springframework.data.gemfire.DistributedSystem . isConnected ( ) ) . thenReturn ( false ) ; assertThat ( GemfireUtils . isDurable ( org.springframework.data.gemfire.ClientCache ) , is ( false ) ) ; verify ( org.springframework.data.gemfire.ClientCache , times ( NUMBER ) ) . getDistributedSystem ( ) ; verify ( org.springframework.data.gemfire.DistributedSystem , times ( NUMBER ) ) . isConnected ( ) ; verify ( org.springframework.data.gemfire.DistributedSystem , never ( ) ) . getProperties ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Cache org.springframework.data.gemfire.Cache = mock ( Cache .class ) ; assertThat ( GemfireUtils . isPeer ( org.springframework.data.gemfire.Cache ) , is ( true ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.Cache ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ClientCache org.springframework.data.gemfire.ClientCache = mock ( ClientCache .class ) ; assertThat ( GemfireUtils . isPeer ( org.springframework.data.gemfire.ClientCache ) , is ( false ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.ClientCache ) ; }  <METHOD_END>
