<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.MetricExporters = new MetricExporters ( this . org.springframework.boot.actuate.metrics.export.MetricExportProperties ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . setReader ( this . org.springframework.boot.actuate.metrics.export.MetricReader ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . setWriters ( this . java.util.Map<java.lang.String,org.springframework.boot.actuate.metrics.export.GaugeWriter> ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . configureTasks ( new ScheduledTaskRegistrar ( ) ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.MetricExporters . getExporters ( ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.MetricExporters . getExporters ( ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.MetricExportProperties . setUpDefaults ( ) ; this . java.util.Map<java.lang.String,org.springframework.boot.actuate.metrics.export.GaugeWriter> . put ( STRING , this . org.springframework.boot.actuate.metrics.export.MetricWriter ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters = new MetricExporters ( this . org.springframework.boot.actuate.metrics.export.MetricExportProperties ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . setReader ( this . org.springframework.boot.actuate.metrics.export.MetricReader ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . setWriters ( this . java.util.Map<java.lang.String,org.springframework.boot.actuate.metrics.export.GaugeWriter> ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . configureTasks ( new ScheduledTaskRegistrar ( ) ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.MetricExporters . getExporters ( ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.MetricExporters . getExporters ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.export.MetricExportProperties . setUpDefaults ( ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters = new MetricExporters ( this . org.springframework.boot.actuate.metrics.export.MetricExportProperties ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . setExporters ( java.util.Collections .< java.lang.String , Exporter > java.util.Map<java.lang.String,org.springframework.boot.actuate.metrics.export.Exporter> ( STRING , new MetricCopyExporter ( this . org.springframework.boot.actuate.metrics.export.MetricReader , this . org.springframework.boot.actuate.metrics.export.MetricWriter ) ) ) ; this . org.springframework.boot.actuate.metrics.export.MetricExporters . configureTasks ( new ScheduledTaskRegistrar ( ) ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.MetricExporters . getExporters ( ) ) . isNotNull ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.export.MetricExporters . getExporters ( ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>