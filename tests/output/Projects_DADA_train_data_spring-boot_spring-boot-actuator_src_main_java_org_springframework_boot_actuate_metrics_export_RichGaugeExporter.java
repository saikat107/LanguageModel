<METHOD_START> public void ( RichGaugeReader org.springframework.boot.actuate.metrics.export.RichGaugeReader , PrefixMetricWriter org.springframework.boot.actuate.metrics.export.PrefixMetricWriter ) { this( org.springframework.boot.actuate.metrics.export.RichGaugeReader , org.springframework.boot.actuate.metrics.export.PrefixMetricWriter , STRING ); }  <METHOD_END>
<METHOD_START> public void ( RichGaugeReader org.springframework.boot.actuate.metrics.export.RichGaugeReader , PrefixMetricWriter org.springframework.boot.actuate.metrics.export.PrefixMetricWriter , java.lang.String java.lang.String ) { super( java.lang.String ); this . org.springframework.boot.actuate.metrics.export.RichGaugeReader = org.springframework.boot.actuate.metrics.export.RichGaugeReader ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricWriter = org.springframework.boot.actuate.metrics.export.PrefixMetricWriter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Iterable<org.springframework.boot.actuate.metrics.export.Metric<?>> < Metric < ? > > java.lang.Iterable<org.springframework.boot.actuate.metrics.export.Metric<?>> ( java.lang.String java.lang.String ) { RichGauge org.springframework.boot.actuate.metrics.export.RichGauge = this . org.springframework.boot.actuate.metrics.export.RichGaugeReader . findOne ( java.lang.String ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> = new java.util.ArrayList<org.springframework.boot.actuate.metrics.export.Metric<?>> <> ( ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> . add ( new Metric < java.lang.Number > ( java.lang.String + java.lang.String , org.springframework.boot.actuate.metrics.export.RichGauge . getMin ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> . add ( new Metric < java.lang.Number > ( java.lang.String + java.lang.String , org.springframework.boot.actuate.metrics.export.RichGauge . getMax ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> . add ( new Metric < java.lang.Number > ( java.lang.String + java.lang.String , org.springframework.boot.actuate.metrics.export.RichGauge . getCount ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> . add ( new Metric < java.lang.Number > ( java.lang.String + java.lang.String , org.springframework.boot.actuate.metrics.export.RichGauge . getValue ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> . add ( new Metric < java.lang.Number > ( java.lang.String + java.lang.String , org.springframework.boot.actuate.metrics.export.RichGauge . getAverage ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> . add ( new Metric < java.lang.Number > ( java.lang.String + java.lang.String , org.springframework.boot.actuate.metrics.export.RichGauge . getAlpha ( ) ) ) ; return java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ( ) { java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( RichGauge org.springframework.boot.actuate.metrics.export.RichGauge : this . org.springframework.boot.actuate.metrics.export.RichGaugeReader . findAll ( ) ) { java.util.Collection<java.lang.String> . boolean ( org.springframework.boot.actuate.metrics.export.RichGauge . getName ( ) ) ; } return java.util.Collection<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> ) { this . org.springframework.boot.actuate.metrics.export.PrefixMetricWriter . set ( java.lang.String , java.util.Collection<org.springframework.boot.actuate.metrics.export.Metric<?>> ) ; }  <METHOD_END>
