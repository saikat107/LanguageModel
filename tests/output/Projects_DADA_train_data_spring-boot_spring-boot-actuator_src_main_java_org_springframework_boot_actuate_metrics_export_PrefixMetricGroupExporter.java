<METHOD_START> public void ( PrefixMetricReader org.springframework.boot.actuate.metrics.export.PrefixMetricReader , PrefixMetricWriter org.springframework.boot.actuate.metrics.export.PrefixMetricWriter ) { this( org.springframework.boot.actuate.metrics.export.PrefixMetricReader , org.springframework.boot.actuate.metrics.export.PrefixMetricWriter , STRING ); }  <METHOD_END>
<METHOD_START> public void ( PrefixMetricReader org.springframework.boot.actuate.metrics.export.PrefixMetricReader , PrefixMetricWriter org.springframework.boot.actuate.metrics.export.PrefixMetricWriter , java.lang.String java.lang.String ) { super( java.lang.String ); this . org.springframework.boot.actuate.metrics.export.PrefixMetricReader = org.springframework.boot.actuate.metrics.export.PrefixMetricReader ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricWriter = org.springframework.boot.actuate.metrics.export.PrefixMetricWriter ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { this . java.util.Set<java.lang.String> = java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ( ) { if ( ( this . org.springframework.boot.actuate.metrics.export.PrefixMetricReader instanceof MultiMetricRepository ) && this . java.util.Set<java.lang.String> . boolean ( ) ) { return ( ( MultiMetricRepository ) this . org.springframework.boot.actuate.metrics.export.PrefixMetricReader ) . groups ( ) ; } return this . java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Iterable<org.springframework.boot.actuate.metrics.export.Metric<?>> < Metric < ? > > java.lang.Iterable<org.springframework.boot.actuate.metrics.export.Metric<?>> ( java.lang.String java.lang.String ) { return this . org.springframework.boot.actuate.metrics.export.PrefixMetricReader . findAll ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> ) { if ( java.lang.String . boolean ( STRING ) ) { for ( Metric < ? > org.springframework.boot.actuate.metrics.export.Metric<?> : java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> ) { this . org.springframework.boot.actuate.metrics.export.PrefixMetricWriter . increment ( java.lang.String , org.springframework.boot.actuate.metrics.export.Delta<?> ( org.springframework.boot.actuate.metrics.export.Metric<> ) ) ; } } else { this . org.springframework.boot.actuate.metrics.export.PrefixMetricWriter . set ( java.lang.String , java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.metrics.export.Delta<?> < ? > org.springframework.boot.actuate.metrics.export.Delta<?> ( Metric < ? > org.springframework.boot.actuate.metrics.export.Metric<?> ) { long long = org.springframework.boot.actuate.metrics.export.Metric<> . getValue ( ) . longValue ( ) ; java.lang.Long java.lang.Long = this . java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Long> . java.lang.Long ( org.springframework.boot.actuate.metrics.export.Metric<> . getName ( ) , long ) ; if ( java.lang.Long != null ) { long = long - java.lang.Long ; } else { this . java.util.concurrent.ConcurrentMap<java.lang.String,java.lang.Long> . java.lang.Long ( org.springframework.boot.actuate.metrics.export.Metric<> . getName ( ) , long ) ; } return new Delta <> ( org.springframework.boot.actuate.metrics.export.Metric<> . getName ( ) , long , org.springframework.boot.actuate.metrics.export.Metric<> . getTimestamp ( ) ) ; }  <METHOD_END>