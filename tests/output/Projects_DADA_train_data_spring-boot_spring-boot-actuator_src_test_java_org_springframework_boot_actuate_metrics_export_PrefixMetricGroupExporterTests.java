<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.export.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . setGroups ( java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . export ( ) ; assertThat ( Iterables . collection ( this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . groups ( ) ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . increment ( STRING , new Delta <> ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . set ( STRING , java.util.Collections .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.export.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . setGroups ( java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . findAll ( STRING ) . iterator ( ) . next ( ) . getValue ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.export.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . setGroups ( java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . export ( ) ; assertThat ( Iterables . collection ( this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . groups ( ) ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.export.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . countGroups ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( Iterables . collection ( this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . findAll ( STRING ) ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.export.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . set ( STRING , java.util.Collections .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.export.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . setGroups ( java.util.Collections . java.util.Set<java.lang.String> ( STRING ) ) ; this . org.springframework.boot.actuate.metrics.export.PrefixMetricGroupExporter . export ( ) ; assertThat ( Iterables . collection ( this . org.springframework.boot.actuate.metrics.export.InMemoryMultiMetricRepository . groups ( ) ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
