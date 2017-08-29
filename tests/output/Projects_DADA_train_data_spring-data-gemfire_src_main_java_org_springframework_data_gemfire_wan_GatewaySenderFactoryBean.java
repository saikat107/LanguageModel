<METHOD_START> public void ( Cache org.springframework.data.gemfire.wan.Cache ) { super( org.springframework.data.gemfire.wan.Cache ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { GatewaySenderFactory org.springframework.data.gemfire.wan.GatewaySenderFactory = ( this . factory != null ? ( GatewaySenderFactory ) factory : cache . createGatewaySenderFactory ( ) ) ; if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setAlertThreshold ( java.lang.Integer ) ; } if ( java.lang.Boolean != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setBatchConflationEnabled ( java.lang.Boolean ) ; } if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setBatchSize ( java.lang.Integer ) ; } if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setBatchTimeInterval ( java.lang.Integer ) ; } if ( java.lang.String != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setDiskStoreName ( java.lang.String ) ; } if ( java.lang.Boolean != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setDiskSynchronous ( java.lang.Boolean ) ; } if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setDispatcherThreads ( java.lang.Integer ) ; } for ( GatewayEventFilter org.springframework.data.gemfire.wan.GatewayEventFilter : CollectionUtils . nullSafeList ( java.util.List<org.springframework.data.gemfire.wan.GatewayEventFilter> ) ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . addGatewayEventFilter ( org.springframework.data.gemfire.wan.GatewayEventFilter ) ; } if ( org.springframework.data.gemfire.wan.GatewayEventSubstitutionFilter != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setGatewayEventSubstitutionFilter ( org.springframework.data.gemfire.wan.GatewayEventSubstitutionFilter ) ; } org.springframework.data.gemfire.wan.GatewaySenderFactory . setManualStart ( boolean ) ; if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setMaximumQueueMemory ( java.lang.Integer ) ; } if ( java.lang.String != null ) { Assert . isTrue ( boolean ( ) , STRING ) ; Assert . isTrue ( VALID_ORDER_POLICIES . contains ( java.lang.String . java.lang.String ( ) ) , java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ; org.springframework.data.gemfire.wan.GatewaySenderFactory . setOrderPolicy ( GatewaySender . OrderPolicy . valueOf ( java.lang.String . java.lang.String ( ) ) ) ; } org.springframework.data.gemfire.wan.GatewaySenderFactory . setParallel ( boolean ( ) ) ; org.springframework.data.gemfire.wan.GatewaySenderFactory . setPersistenceEnabled ( boolean ( ) ) ; if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setSocketBufferSize ( java.lang.Integer ) ; } if ( java.lang.Integer != null ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . setSocketReadTimeout ( java.lang.Integer ) ; } for ( GatewayTransportFilter org.springframework.data.gemfire.wan.GatewayTransportFilter : CollectionUtils . nullSafeList ( java.util.List<org.springframework.data.gemfire.wan.GatewayTransportFilter> ) ) { org.springframework.data.gemfire.wan.GatewaySenderFactory . addGatewayTransportFilter ( org.springframework.data.gemfire.wan.GatewayTransportFilter ) ; } GatewaySenderWrapper org.springframework.data.gemfire.wan.GatewaySenderWrapper = new GatewaySenderWrapper ( org.springframework.data.gemfire.wan.GatewaySenderFactory . create ( getName ( ) , int ) ) ; org.springframework.data.gemfire.wan.GatewaySenderWrapper . setManualStart ( boolean ) ; org.springframework.data.gemfire.wan.GatewaySender = org.springframework.data.gemfire.wan.GatewaySenderWrapper ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.gemfire.wan.GatewaySender org.springframework.data.gemfire.wan.GatewaySender ( ) java.lang.Exception { return org.springframework.data.gemfire.wan.GatewaySender ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return ( org.springframework.data.gemfire.wan.GatewaySender != null ? org.springframework.data.gemfire.wan.GatewaySender . getClass ( ) : GatewaySender .class ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.data.gemfire.wan.GatewayEventFilter> < GatewayEventFilter > java.util.List<org.springframework.data.gemfire.wan.GatewayEventFilter> ) { this . java.util.List<org.springframework.data.gemfire.wan.GatewayEventFilter> = java.util.List<org.springframework.data.gemfire.wan.GatewayEventFilter> ; }  <METHOD_END>
<METHOD_START> public void void ( final GatewayEventSubstitutionFilter org.springframework.data.gemfire.wan.GatewayEventSubstitutionFilter ) { this . org.springframework.data.gemfire.wan.GatewayEventSubstitutionFilter = org.springframework.data.gemfire.wan.GatewayEventSubstitutionFilter ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . boolean = java.lang.Boolean . java.lang.Boolean . boolean ( java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! boolean ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return java.lang.Boolean . java.lang.Boolean . boolean ( java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! boolean ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.data.gemfire.wan.GatewayTransportFilter> < GatewayTransportFilter > java.util.List<org.springframework.data.gemfire.wan.GatewayTransportFilter> ) { this . java.util.List<org.springframework.data.gemfire.wan.GatewayTransportFilter> = java.util.List<org.springframework.data.gemfire.wan.GatewayTransportFilter> ; }  <METHOD_END>
