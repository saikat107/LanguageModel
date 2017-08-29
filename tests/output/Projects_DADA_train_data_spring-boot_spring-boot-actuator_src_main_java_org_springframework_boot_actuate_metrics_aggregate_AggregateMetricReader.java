<METHOD_START> public void ( MetricReader org.springframework.boot.actuate.metrics.aggregate.MetricReader ) { this . org.springframework.boot.actuate.metrics.aggregate.MetricReader = org.springframework.boot.actuate.metrics.aggregate.MetricReader ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { if ( StringUtils . hasText ( java.lang.String ) && ! java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.actuate.metrics.aggregate.Metric<?> < ? > org.springframework.boot.actuate.metrics.aggregate.Metric<?> ( java.lang.String java.lang.String ) { if ( ! java.lang.String . boolean ( this . java.lang.String ) ) { return null ; } InMemoryMetricRepository org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository = new InMemoryMetricRepository ( ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( this . java.lang.String . int ( ) ) ; for ( Metric < ? > org.springframework.boot.actuate.metrics.aggregate.Metric<?> : this . org.springframework.boot.actuate.metrics.aggregate.MetricReader . findAll ( ) ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.metrics.aggregate.Metric<> . getName ( ) ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { void ( org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository , java.lang.String , org.springframework.boot.actuate.metrics.aggregate.Metric<> ) ; } } return org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository . findOne ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<org.springframework.boot.actuate.metrics.aggregate.Metric<?>> < Metric < ? > > java.lang.Iterable<org.springframework.boot.actuate.metrics.aggregate.Metric<?>> ( ) { InMemoryMetricRepository org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository = new InMemoryMetricRepository ( ) ; for ( Metric < ? > org.springframework.boot.actuate.metrics.aggregate.Metric<?> : this . org.springframework.boot.actuate.metrics.aggregate.MetricReader . findAll ( ) ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.metrics.aggregate.Metric<> . getName ( ) ) ; if ( java.lang.String != null ) { void ( org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository , java.lang.String , org.springframework.boot.actuate.metrics.aggregate.Metric<> ) ; } } return org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository . findAll ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( Metric < ? > org.springframework.boot.actuate.metrics.aggregate.Metric<?> : this . org.springframework.boot.actuate.metrics.aggregate.MetricReader . findAll ( ) ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.metrics.aggregate.Metric<> . getName ( ) ) ; if ( java.lang.String != null ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } } return java.util.Set<java.lang.String> . int ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( InMemoryMetricRepository org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository , java.lang.String java.lang.String , Metric < ? > org.springframework.boot.actuate.metrics.aggregate.Metric<?> ) { java.lang.String java.lang.String = this . java.lang.String + java.lang.String ; Metric < ? > org.springframework.boot.actuate.metrics.aggregate.Metric<?> = org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository . findOne ( java.lang.String ) ; if ( org.springframework.boot.actuate.metrics.aggregate.Metric<> == null ) { org.springframework.boot.actuate.metrics.aggregate.Metric<?> = new Metric < java.lang.Number > ( java.lang.String , org.springframework.boot.actuate.metrics.aggregate.Metric<> . getValue ( ) , org.springframework.boot.actuate.metrics.aggregate.Metric<> . getTimestamp ( ) ) ; } else if ( java.lang.String . boolean ( STRING ) ) { org.springframework.boot.actuate.metrics.aggregate.Metric<?> = new Metric < java.lang.Number > ( java.lang.String , org.springframework.boot.actuate.metrics.aggregate.Metric<> . increment ( org.springframework.boot.actuate.metrics.aggregate.Metric<> . getValue ( ) . intValue ( ) ) . getValue ( ) , org.springframework.boot.actuate.metrics.aggregate.Metric<> . getTimestamp ( ) ) ; } else if ( org.springframework.boot.actuate.metrics.aggregate.Metric<> . getTimestamp ( ) . before ( org.springframework.boot.actuate.metrics.aggregate.Metric<> . getTimestamp ( ) ) ) { org.springframework.boot.actuate.metrics.aggregate.Metric<?> = new Metric < java.lang.Number > ( java.lang.String , org.springframework.boot.actuate.metrics.aggregate.Metric<> . getValue ( ) , org.springframework.boot.actuate.metrics.aggregate.Metric<> . getTimestamp ( ) ) ; } org.springframework.boot.actuate.metrics.aggregate.InMemoryMetricRepository . set ( org.springframework.boot.actuate.metrics.aggregate.Metric<> ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = StringUtils . delimitedListToStringArray ( java.lang.String , STRING ) ; java.lang.String [] java.lang.String[] = StringUtils . delimitedListToStringArray ( this . java.lang.String , STRING ) ; java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { if ( STRING . boolean ( java.lang.String[] [ int ] ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.StringBuilder . int ( ) > NUMBER ? STRING : STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String[] [ int ] ) ; } } for ( int int = java.lang.String[] . int ; int < java.lang.String[] . int ; int ++ ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.StringBuilder . int ( ) > NUMBER ? STRING : STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String[] [ int ] ) ; } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
