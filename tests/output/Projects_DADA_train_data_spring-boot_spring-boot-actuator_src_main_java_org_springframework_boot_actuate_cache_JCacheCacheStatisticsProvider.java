<METHOD_START> @ java.lang.Override protected javax.management.ObjectName javax.management.ObjectName ( JCacheCache org.springframework.boot.actuate.cache.JCacheCache )			throws javax.management.MalformedObjectNameException { javax.management.ObjectName javax.management.ObjectName = new javax.management.ObjectName ( STRING + org.springframework.boot.actuate.cache.JCacheCache . getName ( ) + STRING ) ; java.util.Set<javax.management.ObjectInstance> < javax.management.ObjectInstance > java.util.Set<javax.management.ObjectInstance> = getMBeanServer ( ) . queryMBeans ( javax.management.ObjectName , null ) ; if ( java.util.Set<javax.management.ObjectInstance> . int ( ) == NUMBER ) { return java.util.Set<javax.management.ObjectInstance> . java.util.Iterator<javax.management.ObjectInstance> ( ) . javax.management.ObjectInstance ( ) . javax.management.ObjectName ( ) ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.actuate.cache.CacheStatistics org.springframework.boot.actuate.cache.CacheStatistics ( javax.management.ObjectName javax.management.ObjectName ) { DefaultCacheStatistics org.springframework.boot.actuate.cache.DefaultCacheStatistics = new DefaultCacheStatistics ( ) ; java.lang.Float java.lang.Float = getAttribute ( javax.management.ObjectName , STRING , java.lang.Float .class ) ; java.lang.Float java.lang.Float = getAttribute ( javax.management.ObjectName , STRING , java.lang.Float .class ) ; if ( ( java.lang.Float != null && java.lang.Float != null ) && ( java.lang.Float > NUMBER || java.lang.Float > NUMBER ) ) { org.springframework.boot.actuate.cache.DefaultCacheStatistics . setHitRatio ( java.lang.Float / ( double ) NUMBER ) ; org.springframework.boot.actuate.cache.DefaultCacheStatistics . setMissRatio ( java.lang.Float / ( double ) NUMBER ) ; } return org.springframework.boot.actuate.cache.DefaultCacheStatistics ; }  <METHOD_END>
