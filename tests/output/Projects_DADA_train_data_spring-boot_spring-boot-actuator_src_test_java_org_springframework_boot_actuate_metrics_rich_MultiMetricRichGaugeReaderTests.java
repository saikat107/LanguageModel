<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.rich.InMemoryRichGaugeRepository . set ( new Metric <> ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.rich.InMemoryRichGaugeRepository . set ( new Metric <> ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.rich.RichGaugeExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.rich.InMemoryMultiMetricRepository . countGroups ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( this . org.springframework.boot.actuate.metrics.rich.MultiMetricRichGaugeReader . count ( ) ) . isEqualTo ( NUMBER ) ; RichGauge org.springframework.boot.actuate.metrics.rich.RichGauge = this . org.springframework.boot.actuate.metrics.rich.MultiMetricRichGaugeReader . findOne ( STRING ) ; assertThat ( org.springframework.boot.actuate.metrics.rich.RichGauge ) . isNotNull ( ) ; assertThat ( org.springframework.boot.actuate.metrics.rich.RichGauge . getCount ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.rich.InMemoryRichGaugeRepository . set ( new Metric <> ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.rich.InMemoryRichGaugeRepository . set ( new Metric <> ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.rich.RichGaugeExporter . export ( ) ; assertThat ( this . org.springframework.boot.actuate.metrics.rich.MultiMetricRichGaugeReader . count ( ) ) . isEqualTo ( NUMBER ) ; RichGauge org.springframework.boot.actuate.metrics.rich.RichGauge = this . org.springframework.boot.actuate.metrics.rich.MultiMetricRichGaugeReader . findOne ( STRING ) ; assertThat ( org.springframework.boot.actuate.metrics.rich.RichGauge ) . isNotNull ( ) ; assertThat ( org.springframework.boot.actuate.metrics.rich.RichGauge . getCount ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>