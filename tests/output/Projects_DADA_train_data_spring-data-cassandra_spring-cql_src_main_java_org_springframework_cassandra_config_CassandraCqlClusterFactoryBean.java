<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { Assert . isTrue ( StringUtils . hasText ( java.lang.String ) , STRING ) ; Cluster . Cluster Cluster.Builder = Cluster.Builder ( ) ; Cluster.Builder . addContactPoints ( StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ) . withPort ( int ) ; if ( org.springframework.cassandra.config.CompressionType != null ) { Cluster.Builder . withCompression ( org.springframework.cassandra.config.Compression ( org.springframework.cassandra.config.CompressionType ) ) ; } if ( org.springframework.cassandra.config.PoolingOptions != null ) { Cluster.Builder . withPoolingOptions ( org.springframework.cassandra.config.PoolingOptions ) ; } if ( org.springframework.cassandra.config.SocketOptions != null ) { Cluster.Builder . withSocketOptions ( org.springframework.cassandra.config.SocketOptions ) ; } if ( org.springframework.cassandra.config.QueryOptions != null ) { Cluster.Builder . withQueryOptions ( org.springframework.cassandra.config.QueryOptions ) ; } if ( org.springframework.cassandra.config.AuthProvider != null ) { Cluster.Builder . withAuthProvider ( org.springframework.cassandra.config.AuthProvider ) ; } else if ( java.lang.String != null ) { Cluster.Builder . withCredentials ( java.lang.String , java.lang.String ) ; } if ( org.springframework.cassandra.config.NettyOptions != null ) { Cluster.Builder . withNettyOptions ( org.springframework.cassandra.config.NettyOptions ) ; } if ( org.springframework.cassandra.config.LoadBalancingPolicy != null ) { Cluster.Builder . withLoadBalancingPolicy ( org.springframework.cassandra.config.LoadBalancingPolicy ) ; } if ( org.springframework.cassandra.config.ReconnectionPolicy != null ) { Cluster.Builder . withReconnectionPolicy ( org.springframework.cassandra.config.ReconnectionPolicy ) ; } if ( org.springframework.cassandra.config.RetryPolicy != null ) { Cluster.Builder . withRetryPolicy ( org.springframework.cassandra.config.RetryPolicy ) ; } if ( ! boolean ) { Cluster.Builder . withoutMetrics ( ) ; } if ( ! boolean ) { Cluster.Builder . withoutJMXReporting ( ) ; } if ( boolean ) { if ( org.springframework.cassandra.config.SSLOptions == null ) { Cluster.Builder . withSSL ( ) ; } else { Cluster.Builder . withSSL ( org.springframework.cassandra.config.SSLOptions ) ; } } if ( org.springframework.cassandra.config.ProtocolVersion != null ) { Cluster.Builder . withProtocolVersion ( org.springframework.cassandra.config.ProtocolVersion ) ; } if ( org.springframework.cassandra.config.AddressTranslator != null ) { Cluster.Builder . withAddressTranslator ( org.springframework.cassandra.config.AddressTranslator ) ; } java.lang.String java.lang.String = java.lang.String ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { Cluster.Builder . withClusterName ( java.lang.String ) ; } Cluster.Builder . withMaxSchemaAgreementWaitSeconds ( int ) ; if ( org.springframework.cassandra.config.SpeculativeExecutionPolicy != null ) { Cluster.Builder . withSpeculativeExecutionPolicy ( org.springframework.cassandra.config.SpeculativeExecutionPolicy ) ; } if ( org.springframework.cassandra.config.TimestampGenerator != null ) { Cluster.Builder . withTimestampGenerator ( org.springframework.cassandra.config.TimestampGenerator ) ; } if ( org.springframework.cassandra.config.ClusterBuilderConfigurer != null ) { org.springframework.cassandra.config.ClusterBuilderConfigurer . configure ( Cluster.Builder ) ; } org.springframework.cassandra.config.Cluster = Cluster.Builder . build ( ) ; if ( Host.StateListener != null ) { org.springframework.cassandra.config.Cluster . register ( Host.StateListener ) ; } if ( org.springframework.cassandra.config.LatencyTracker != null ) { org.springframework.cassandra.config.Cluster . register ( org.springframework.cassandra.config.LatencyTracker ) ; } void ( ) ; void ( java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> , java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> Cluster . Cluster.Builder Cluster.Builder ( ) { return Cluster . builder ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { void ( java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> , java.util.List<java.lang.String> ) ; org.springframework.cassandra.config.Cluster . close ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.config.Cluster org.springframework.cassandra.config.Cluster ( ) { return org.springframework.cassandra.config.Cluster ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends org.springframework.cassandra.config.Cluster> < ? extends Cluster > java.lang.Class<? extends org.springframework.cassandra.config.Cluster> ( ) { return ( org.springframework.cassandra.config.Cluster != null ? org.springframework.cassandra.config.Cluster . getClass ( ) : Cluster .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.config.DataAccessException org.springframework.cassandra.config.DataAccessException ( java.lang.RuntimeException java.lang.RuntimeException ) { return org.springframework.cassandra.config.PersistenceExceptionTranslator . translateExceptionIfPossible ( java.lang.RuntimeException ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> . forEach ( keyspaceActionSpecification -> { if ( keyspaceActionSpecification instanceof CreateKeyspaceSpecification ) { keyspaceCreations . add ( ( CreateKeyspaceSpecification ) keyspaceActionSpecification ) ; } if ( keyspaceActionSpecification instanceof DropKeyspaceSpecification ) { keyspaceDrops . add ( ( DropKeyspaceSpecification ) keyspaceActionSpecification ) ; } } ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.List<? extends org.springframework.cassandra.config.KeyspaceActionSpecification<?>> < ? extends KeyspaceActionSpecification < ? > > java.util.List<? extends org.springframework.cassandra.config.KeyspaceActionSpecification<?>> , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { if ( ! CollectionUtils . isEmpty ( java.util.List<> ) || ! CollectionUtils . isEmpty ( java.util.List<java.lang.String> ) ) { Session org.springframework.cassandra.config.Session = org.springframework.cassandra.config.Cluster . connect ( ) ; try { CqlTemplate org.springframework.cassandra.config.CqlTemplate = new CqlTemplate ( org.springframework.cassandra.config.Session ) ; java.util.List<> . void ( keyspaceActionSpecification -> org.springframework.cassandra.config.CqlTemplate . execute ( java.lang.String ( keyspaceActionSpecification ) ) ) ; java.util.List<java.lang.String> . void ( org.springframework.cassandra.config.CqlTemplate :: execute ) ; } finally { if ( org.springframework.cassandra.config.Session != null ) { org.springframework.cassandra.config.Session . close ( ) ; } } } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( KeyspaceActionSpecification < ? > org.springframework.cassandra.config.KeyspaceActionSpecification<?> ) { return ( org.springframework.cassandra.config.KeyspaceActionSpecification<> instanceof CreateKeyspaceSpecification ? new CreateKeyspaceCqlGenerator ( ( CreateKeyspaceSpecification ) org.springframework.cassandra.config.KeyspaceActionSpecification<> ) . toCql ( ) : new DropKeyspaceCqlGenerator ( ( DropKeyspaceSpecification ) org.springframework.cassandra.config.KeyspaceActionSpecification<> ) . toCql ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( CompressionType org.springframework.cassandra.config.CompressionType ) { this . org.springframework.cassandra.config.CompressionType = org.springframework.cassandra.config.CompressionType ; }  <METHOD_END>
<METHOD_START> public void void ( PoolingOptions org.springframework.cassandra.config.PoolingOptions ) { this . org.springframework.cassandra.config.PoolingOptions = org.springframework.cassandra.config.PoolingOptions ; }  <METHOD_END>
<METHOD_START> public void void ( ProtocolVersion org.springframework.cassandra.config.ProtocolVersion ) { this . org.springframework.cassandra.config.ProtocolVersion = org.springframework.cassandra.config.ProtocolVersion ; }  <METHOD_END>
<METHOD_START> public void void ( SocketOptions org.springframework.cassandra.config.SocketOptions ) { this . org.springframework.cassandra.config.SocketOptions = org.springframework.cassandra.config.SocketOptions ; }  <METHOD_END>
<METHOD_START> public void void ( QueryOptions org.springframework.cassandra.config.QueryOptions ) { this . org.springframework.cassandra.config.QueryOptions = org.springframework.cassandra.config.QueryOptions ; }  <METHOD_END>
<METHOD_START> public void void ( AuthProvider org.springframework.cassandra.config.AuthProvider ) { this . org.springframework.cassandra.config.AuthProvider = org.springframework.cassandra.config.AuthProvider ; }  <METHOD_END>
<METHOD_START> public void void ( NettyOptions org.springframework.cassandra.config.NettyOptions ) { this . org.springframework.cassandra.config.NettyOptions = org.springframework.cassandra.config.NettyOptions ; }  <METHOD_END>
<METHOD_START> public void void ( LoadBalancingPolicy org.springframework.cassandra.config.LoadBalancingPolicy ) { this . org.springframework.cassandra.config.LoadBalancingPolicy = org.springframework.cassandra.config.LoadBalancingPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( ReconnectionPolicy org.springframework.cassandra.config.ReconnectionPolicy ) { this . org.springframework.cassandra.config.ReconnectionPolicy = org.springframework.cassandra.config.ReconnectionPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( RetryPolicy org.springframework.cassandra.config.RetryPolicy ) { this . org.springframework.cassandra.config.RetryPolicy = org.springframework.cassandra.config.RetryPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> < CreateKeyspaceSpecification > java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> ) { this . java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> = java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> < CreateKeyspaceSpecification > java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> ( ) { return java.util.List<org.springframework.cassandra.config.CreateKeyspaceSpecification> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> < DropKeyspaceSpecification > java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> ) { this . java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> = java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> < DropKeyspaceSpecification > java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> ( ) { return java.util.List<org.springframework.cassandra.config.DropKeyspaceSpecification> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> < KeyspaceActionSpecification < ? > > java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> ) { this . java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> = java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> < KeyspaceActionSpecification < ? > > java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> ( ) { return java.util.Set<org.springframework.cassandra.config.KeyspaceActionSpecification<?>> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( SSLOptions org.springframework.cassandra.config.SSLOptions ) { this . org.springframework.cassandra.config.SSLOptions = org.springframework.cassandra.config.SSLOptions ; }  <METHOD_END>
<METHOD_START> public void void ( Host . Host Host.StateListener ) { this . Host.StateListener = Host.StateListener ; }  <METHOD_END>
<METHOD_START> public void void ( LatencyTracker org.springframework.cassandra.config.LatencyTracker ) { this . org.springframework.cassandra.config.LatencyTracker = org.springframework.cassandra.config.LatencyTracker ; }  <METHOD_END>
<METHOD_START> public void void ( AddressTranslator org.springframework.cassandra.config.AddressTranslator ) { this . org.springframework.cassandra.config.AddressTranslator = org.springframework.cassandra.config.AddressTranslator ; }  <METHOD_END>
<METHOD_START> public void void ( ClusterBuilderConfigurer org.springframework.cassandra.config.ClusterBuilderConfigurer ) { this . org.springframework.cassandra.config.ClusterBuilderConfigurer = org.springframework.cassandra.config.ClusterBuilderConfigurer ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( SpeculativeExecutionPolicy org.springframework.cassandra.config.SpeculativeExecutionPolicy ) { this . org.springframework.cassandra.config.SpeculativeExecutionPolicy = org.springframework.cassandra.config.SpeculativeExecutionPolicy ; }  <METHOD_END>
<METHOD_START> public void void ( TimestampGenerator org.springframework.cassandra.config.TimestampGenerator ) { this . org.springframework.cassandra.config.TimestampGenerator = org.springframework.cassandra.config.TimestampGenerator ; }  <METHOD_END>
<METHOD_START> private static org.springframework.cassandra.config.Compression org.springframework.cassandra.config.Compression ( CompressionType org.springframework.cassandra.config.CompressionType ) { switch ( org.springframework.cassandra.config.CompressionType ) { case NONE : return Compression . NONE ; case SNAPPY : return Compression . SNAPPY ; case LZ4 : return Compression . LZ4 ; } throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.cassandra.config.CompressionType ) ) ; }  <METHOD_END>
