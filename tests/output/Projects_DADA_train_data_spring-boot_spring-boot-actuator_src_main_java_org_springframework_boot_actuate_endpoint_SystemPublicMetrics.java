<METHOD_START> public void ( ) { this . long = java.lang.System . long ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return Ordered . HIGHEST_PRECEDENCE + NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ( ) { java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> = new java.util.LinkedHashSet<org.springframework.boot.actuate.endpoint.Metric<?>> <> ( ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; return java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { java.lang.Runtime java.lang.Runtime = java.lang.Runtime . java.lang.Runtime ( ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.Runtime . long ( ) + long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.Runtime . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.Runtime . int ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.System . long ( ) - this . long ) ) ; }  <METHOD_END>
<METHOD_START> private long long ( ) { try { return java.lang.management.ManagementFactory . java.lang.management.MemoryMXBean ( ) . java.lang.management.MemoryUsage ( ) . long ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { return NUMBER ; } }  <METHOD_END>
<METHOD_START> private void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { try { java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.management.ManagementFactory . java.lang.management.RuntimeMXBean ( ) . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.management.ManagementFactory . java.lang.management.OperatingSystemMXBean ( ) . double ( ) ) ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) ; } catch ( java.lang.NoClassDefFoundError java.lang.NoClassDefFoundError ) { } }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { java.lang.management.MemoryUsage java.lang.management.MemoryUsage = java.lang.management.ManagementFactory . java.lang.management.MemoryMXBean ( ) . java.lang.management.MemoryUsage ( ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { java.lang.management.MemoryUsage java.lang.management.MemoryUsage = java.lang.management.ManagementFactory . java.lang.management.MemoryMXBean ( ) . java.lang.management.MemoryUsage ( ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( STRING , java.lang.management.MemoryUsage . long ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> < java.lang.Long > org.springframework.boot.actuate.endpoint.Metric<java.lang.Long> ( java.lang.String java.lang.String , long long ) { return new Metric <> ( java.lang.String , long / NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { java.lang.management.ThreadMXBean java.lang.management.ThreadMXBean = java.lang.management.ManagementFactory . java.lang.management.ThreadMXBean ( ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , ( long ) java.lang.management.ThreadMXBean . int ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , ( long ) java.lang.management.ThreadMXBean . int ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.management.ThreadMXBean . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , ( long ) java.lang.management.ThreadMXBean . int ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { java.lang.management.ClassLoadingMXBean java.lang.management.ClassLoadingMXBean = java.lang.management.ManagementFactory . java.lang.management.ClassLoadingMXBean ( ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , ( long ) java.lang.management.ClassLoadingMXBean . int ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.management.ClassLoadingMXBean . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING , java.lang.management.ClassLoadingMXBean . long ( ) ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> < Metric < ? > > java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> ) { java.util.List<java.lang.management.GarbageCollectorMXBean> < java.lang.management.GarbageCollectorMXBean > java.util.List<java.lang.management.GarbageCollectorMXBean> = java.lang.management.ManagementFactory . java.util.List<java.lang.management.GarbageCollectorMXBean> ( ) ; for ( java.lang.management.GarbageCollectorMXBean java.lang.management.GarbageCollectorMXBean : java.util.List<java.lang.management.GarbageCollectorMXBean> ) { java.lang.String java.lang.String = java.lang.String ( java.lang.management.GarbageCollectorMXBean . java.lang.String ( ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING + java.lang.String + STRING , java.lang.management.GarbageCollectorMXBean . long ( ) ) ) ; java.util.Collection<org.springframework.boot.actuate.endpoint.Metric<?>> . add ( new Metric <> ( STRING + java.lang.String + STRING , java.lang.management.GarbageCollectorMXBean . long ( ) ) ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return StringUtils . replace ( java.lang.String , STRING , STRING ) . toLowerCase ( ) ; }  <METHOD_END>
