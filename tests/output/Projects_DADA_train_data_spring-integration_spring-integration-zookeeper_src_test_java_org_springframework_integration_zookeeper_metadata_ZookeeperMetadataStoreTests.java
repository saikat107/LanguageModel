<METHOD_START> @ java.lang.Override @ Before public void void ( ) java.lang.Exception { super. setUp ( ) ; this . org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore = new ZookeeperMetadataStore ( client ) ; this . org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . start ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ After public void void ( ) java.lang.Exception { this . org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . stop ( ) ; this . client . delete ( ) . deletingChildrenIfNeeded ( ) . forPath ( this . org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getRoot ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( STRING ) ; assertNull ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; assertNotNull ( client . checkExists ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; java.lang.String java.lang.String = org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final java.lang.String java.lang.String = STRING ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; assertNotNull ( client . checkExists ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; CuratorFramework org.springframework.integration.zookeeper.metadata.CuratorFramework = createNewClient ( ) ; final ZookeeperMetadataStore org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore = new ZookeeperMetadataStore ( org.springframework.integration.zookeeper.metadata.CuratorFramework ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . start ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . putIfAbsent ( java.lang.String , STRING ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; assertEquals ( STRING , org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ) ; assertThat ( STRING , eventually ( equalsResult ( new Evaluator < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; } } ) ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . putIfAbsent ( java.lang.String , STRING ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; assertEquals ( STRING , org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ) ; assertThat ( STRING , eventually ( equalsResult ( new Evaluator < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; } } ) ) ) ; CloseableUtils . closeQuietly ( org.springframework.integration.zookeeper.metadata.CuratorFramework ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; assertNotNull ( client . checkExists ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; CuratorFramework org.springframework.integration.zookeeper.metadata.CuratorFramework = createNewClient ( ) ; final ZookeeperMetadataStore org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore = new ZookeeperMetadataStore ( org.springframework.integration.zookeeper.metadata.CuratorFramework ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . start ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . replace ( java.lang.String , STRING , STRING ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; assertEquals ( STRING , org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ) ; assertThat ( STRING , eventually ( equalsResult ( new Evaluator < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; } } ) ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . replace ( java.lang.String , STRING , STRING ) ; assertEquals ( STRING , IntegrationUtils . bytesToString ( client . getData ( ) . forPath ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . getPath ( java.lang.String ) ) , STRING ) ) ; assertThat ( STRING , eventually ( equalsResult ( new Evaluator < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; } } ) ) ) ; assertEquals ( STRING , org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ) ; CloseableUtils . closeQuietly ( org.springframework.integration.zookeeper.metadata.CuratorFramework ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; assertEquals ( STRING , org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( STRING , null ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( STRING , STRING ) ; java.lang.String java.lang.String = org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( STRING ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( null , STRING ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . get ( null ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { assertEquals ( STRING , java.lang.IllegalArgumentException . java.lang.String ( ) ) ; return; } fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . remove ( java.lang.String ) ) ; java.lang.Thread . void ( NUMBER ) ; assertNull ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . remove ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; final java.util.List<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > java.util.List<java.util.List<java.lang.String>> = new java.util.ArrayList<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > ( ) ; final java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> < java.lang.String , java.util.concurrent.CyclicBarrier > java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> = new java.util.HashMap<java.lang.String,java.util.concurrent.CyclicBarrier> < java.lang.String , java.util.concurrent.CyclicBarrier > ( ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING , new java.util.concurrent.CyclicBarrier ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING , new java.util.concurrent.CyclicBarrier ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING , new java.util.concurrent.CyclicBarrier ( NUMBER ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . addListener ( new MetadataStoreListenerAdapter ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; } @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; } @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; } } ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . putIfAbsent ( java.lang.String , STRING ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . replace ( java.lang.String , STRING , STRING ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . replace ( java.lang.String , STRING , STRING ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . remove ( java.lang.String ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; java.lang.Thread . void ( NUMBER ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; CuratorFramework org.springframework.integration.zookeeper.metadata.CuratorFramework = createNewClient ( ) ; ZookeeperMetadataStore org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore = new ZookeeperMetadataStore ( org.springframework.integration.zookeeper.metadata.CuratorFramework ) ; final java.util.List<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > java.util.List<java.util.List<java.lang.String>> = new java.util.ArrayList<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > ( ) ; final java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> < java.lang.String , java.util.concurrent.CyclicBarrier > java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> = new java.util.HashMap<java.lang.String,java.util.concurrent.CyclicBarrier> < java.lang.String , java.util.concurrent.CyclicBarrier > ( ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING , new java.util.concurrent.CyclicBarrier ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING , new java.util.concurrent.CyclicBarrier ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING , new java.util.concurrent.CyclicBarrier ( NUMBER ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . addListener ( new MetadataStoreListenerAdapter ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; } @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; } @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; } } ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . putIfAbsent ( java.lang.String , STRING ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . put ( java.lang.String , STRING ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . replace ( java.lang.String , STRING , STRING ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . replace ( java.lang.String , STRING , STRING ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( STRING ) . void ( ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . remove ( java.lang.String ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( NUMBER ) , IsIterableContainingInOrder . contains ( STRING , java.lang.String , STRING ) ) ; java.lang.Thread . void ( NUMBER ) ; assertThat ( java.util.List<java.util.List<java.lang.String>> , hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , java.lang.String , java.lang.String ) ) ; void ( STRING , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MetadataStoreListener org.springframework.integration.zookeeper.metadata.MetadataStoreListener = Mockito . mock ( MetadataStoreListener .class ) ; DirectFieldAccessor org.springframework.integration.zookeeper.metadata.DirectFieldAccessor = new DirectFieldAccessor ( org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> < MetadataStoreListener > java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> = ( java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> < MetadataStoreListener > ) org.springframework.integration.zookeeper.metadata.DirectFieldAccessor . getPropertyValue ( STRING ) ; assertThat ( java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> , hasSize ( NUMBER ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . addListener ( org.springframework.integration.zookeeper.metadata.MetadataStoreListener ) ; assertThat ( java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> , hasSize ( NUMBER ) ) ; assertThat ( java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> , IsIterableContainingInOrder . contains ( org.springframework.integration.zookeeper.metadata.MetadataStoreListener ) ) ; org.springframework.integration.zookeeper.metadata.ZookeeperMetadataStore . removeListener ( org.springframework.integration.zookeeper.metadata.MetadataStoreListener ) ; assertThat ( java.util.List<org.springframework.integration.zookeeper.metadata.MetadataStoreListener> , hasSize ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> < java.lang.String , java.util.concurrent.CyclicBarrier > java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> ) { try { java.util.Map<java.lang.String,java.util.concurrent.CyclicBarrier> . java.util.concurrent.CyclicBarrier ( java.lang.String ) . int ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.AssertionError ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
