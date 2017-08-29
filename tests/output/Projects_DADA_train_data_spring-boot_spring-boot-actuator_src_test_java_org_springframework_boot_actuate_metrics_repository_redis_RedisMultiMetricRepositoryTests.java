<METHOD_START> @ Parameters public static java.util.List<java.lang.Object[]> < java.lang.Object [] > java.util.List<java.lang.Object[]> ( ) { return java.util.Arrays .< java.lang.Object [] > java.util.List<java.lang.Object[]> ( new java.lang.Object [] { null } , new java.lang.Object [] { STRING } ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { if ( this . java.lang.String == null ) { this . java.lang.String = STRING ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository = new RedisMultiMetricRepository ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisTestServer . getConnectionFactory ( ) ) ; } else { this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository = new RedisMultiMetricRepository ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisTestServer . getConnectionFactory ( ) , this . java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { assertThat ( new StringRedisTemplate ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisTestServer . getConnectionFactory ( ) ) . opsForZSet ( ) . size ( STRING + this . java.lang.String ) ) . isGreaterThan ( NUMBER ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . reset ( STRING ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . reset ( STRING ) ; assertThat ( new StringRedisTemplate ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisTestServer . getConnectionFactory ( ) ) . opsForValue ( ) . get ( this . java.lang.String + STRING ) ) . isNull ( ) ; assertThat ( new StringRedisTemplate ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisTestServer . getConnectionFactory ( ) ) . opsForValue ( ) . get ( this . java.lang.String + STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; assertThat ( Iterables . collection ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . findAll ( STRING ) ) . iterator ( ) . next ( ) . getValue ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; assertThat ( Iterables . collection ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . findAll ( STRING ) ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = Iterables . collection ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . groups ( ) ) ; assertThat ( java.util.Collection<java.lang.String> ) . hasSize ( NUMBER ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . set ( STRING , java.util.Arrays .< Metric < ? > > java.util.List<org.springframework.boot.actuate.metrics.repository.redis.Metric<?>> ( new Metric < java.lang.Number > ( STRING , NUMBER ) , new Metric < java.lang.Number > ( STRING , NUMBER ) ) ) ; assertThat ( this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . countGroups ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . increment ( STRING , new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . increment ( STRING , new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . increment ( STRING , new Delta < java.lang.Number > ( STRING , NUMBER ) ) ; Metric < ? > org.springframework.boot.actuate.metrics.repository.redis.Metric<?> = null ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( Metric < ? > org.springframework.boot.actuate.metrics.repository.redis.Metric<?> : this . org.springframework.boot.actuate.metrics.repository.redis.RedisMultiMetricRepository . findAll ( STRING ) ) { java.util.Set<java.lang.String> . boolean ( org.springframework.boot.actuate.metrics.repository.redis.Metric<> . getName ( ) ) ; if ( org.springframework.boot.actuate.metrics.repository.redis.Metric<> . getName ( ) . equals ( STRING ) ) { org.springframework.boot.actuate.metrics.repository.redis.Metric<?> = org.springframework.boot.actuate.metrics.repository.redis.Metric<> ; } } assertThat ( java.util.Set<java.lang.String> ) . hasSize ( NUMBER ) . contains ( STRING ) ; assertThat ( org.springframework.boot.actuate.metrics.repository.redis.Metric<> . getValue ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>