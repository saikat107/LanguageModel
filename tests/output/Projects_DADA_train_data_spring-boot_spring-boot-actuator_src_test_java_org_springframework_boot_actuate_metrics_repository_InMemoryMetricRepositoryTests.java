<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.InMemoryMetricRepository . increment ( new Delta <> ( STRING , NUMBER , new java.util.Date ( ) ) ) ; assertThat ( this . org.springframework.boot.actuate.metrics.repository.InMemoryMetricRepository . findOne ( STRING ) . getValue ( ) . doubleValue ( ) ) . isEqualTo ( NUMBER , offset ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.InMemoryMetricRepository . set ( new Metric <> ( STRING , NUMBER , new java.util.Date ( ) ) ) ; assertThat ( this . org.springframework.boot.actuate.metrics.repository.InMemoryMetricRepository . findOne ( STRING ) . getValue ( ) . doubleValue ( ) ) . isEqualTo ( NUMBER , offset ( NUMBER ) ) ; }  <METHOD_END>