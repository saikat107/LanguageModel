<METHOD_START> @ BeforeClass public static void void ( ) java.io.FileNotFoundException { java.io.PrintWriter = new NullPrintWriter ( ) ; final java.util.Random java.util.Random = new java.util.Random ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.lang.String[] [ int ] = java.lang.String[] [ java.util.Random . int ( java.lang.String[] . int ) ] ; } }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { java.lang.System . java.io.PrintStream . void ( org.springframework.boot.actuate.metrics.buffer.StopWatch ) ; }  <METHOD_END>
<METHOD_START> @ Theory public void void ( java.lang.String java.lang.String ) throws java.lang.Exception { void ( STRING ) ; double double = int / org.springframework.boot.actuate.metrics.buffer.StopWatch . getLastTaskTimeMillis ( ) * NUMBER ; java.lang.System . java.io.PrintStream . void ( STRING + int + STRING + double + STRING + org.springframework.boot.actuate.metrics.buffer.StopWatch ) ; org.springframework.boot.actuate.metrics.buffer.StopWatch . start ( STRING + int ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { this . org.springframework.boot.actuate.metrics.buffer.CounterBuffers . forEach ( java.util.regex.Pattern . java.util.regex.Pattern ( java.lang.String ) . java.util.function.Predicate<java.lang.String> ( ) , new java.util.function.BiConsumer<java.lang.String,org.springframework.boot.actuate.metrics.buffer.CounterBuffer> < java.lang.String , CounterBuffer > ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String , CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { java.io.PrintWriter . void ( java.lang.String + STRING + org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) ; } } ) ; } final java.util.concurrent.atomic.LongAdder java.util.concurrent.atomic.LongAdder = new java.util.concurrent.atomic.LongAdder ( ) ; this . org.springframework.boot.actuate.metrics.buffer.CounterBuffers . forEach ( java.util.regex.Pattern . java.util.regex.Pattern ( STRING ) . java.util.function.Predicate<java.lang.String> ( ) , new java.util.function.BiConsumer<java.lang.String,org.springframework.boot.actuate.metrics.buffer.CounterBuffer> < java.lang.String , CounterBuffer > ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String , CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { java.util.concurrent.atomic.LongAdder . void ( org.springframework.boot.actuate.metrics.buffer.CounterBuffer . getValue ( ) ) ; } } ) ; org.springframework.boot.actuate.metrics.buffer.StopWatch . stop ( ) ; java.lang.System . java.io.PrintStream . void ( STRING + int + STRING + org.springframework.boot.actuate.metrics.buffer.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; assertThat ( java.util.concurrent.atomic.LongAdder . long ( ) ) . isEqualTo ( int * int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { java.io.PrintWriter . void ( java.lang.String + STRING + org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { java.util.concurrent.atomic.LongAdder . void ( org.springframework.boot.actuate.metrics.buffer.CounterBuffer . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Theory public void void ( java.lang.String java.lang.String ) throws java.lang.Exception { void ( STRING ) ; double double = int / org.springframework.boot.actuate.metrics.buffer.StopWatch . getLastTaskTimeMillis ( ) * NUMBER ; java.lang.System . java.io.PrintStream . void ( STRING + int + STRING + double + STRING + org.springframework.boot.actuate.metrics.buffer.StopWatch ) ; org.springframework.boot.actuate.metrics.buffer.StopWatch . start ( STRING + int ) ; this . org.springframework.boot.actuate.metrics.buffer.BufferMetricReader . findAll ( ) . forEach ( new java.util.function.Consumer<org.springframework.boot.actuate.metrics.buffer.Metric<?>> < Metric < ? > > ( ) { @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.buffer.Metric<?> ) { java.io.PrintWriter . void ( org.springframework.boot.actuate.metrics.buffer.Metric<> ) ; } } ) ; final java.util.concurrent.atomic.LongAdder java.util.concurrent.atomic.LongAdder = new java.util.concurrent.atomic.LongAdder ( ) ; this . org.springframework.boot.actuate.metrics.buffer.BufferMetricReader . findAll ( ) . forEach ( new java.util.function.Consumer<org.springframework.boot.actuate.metrics.buffer.Metric<?>> < Metric < ? > > ( ) { @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.buffer.Metric<?> ) { java.util.concurrent.atomic.LongAdder . void ( org.springframework.boot.actuate.metrics.buffer.Metric<> . getValue ( ) . intValue ( ) ) ; } } ) ; org.springframework.boot.actuate.metrics.buffer.StopWatch . stop ( ) ; java.lang.System . java.io.PrintStream . void ( STRING + int + STRING + org.springframework.boot.actuate.metrics.buffer.StopWatch . getLastTaskTimeMillis ( ) + STRING ) ; assertThat ( java.util.concurrent.atomic.LongAdder . long ( ) ) . isEqualTo ( int * int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.buffer.Metric<?> ) { java.io.PrintWriter . void ( org.springframework.boot.actuate.metrics.buffer.Metric<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.buffer.Metric<?> ) { java.util.concurrent.atomic.LongAdder . void ( org.springframework.boot.actuate.metrics.buffer.Metric<> . getValue ( ) . intValue ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) throws java.lang.Exception { org.springframework.boot.actuate.metrics.buffer.StopWatch . start ( java.lang.String + int ++ ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( int ) ; java.lang.Runnable java.lang.Runnable = new java.lang.Runnable ( ) { @ java.lang.Override public void void ( ) { for ( int int = NUMBER ; int < int ; int ++ ) { java.lang.String java.lang.String = java.lang.String[] [ int % java.lang.String[] . int ] ; org.springframework.boot.actuate.metrics.buffer.CounterServiceSpeedTests .this . org.springframework.boot.actuate.metrics.buffer.CounterService . increment ( java.lang.String ) ; } } } ; java.util.Collection<java.util.concurrent.Future<?>> < java.util.concurrent.Future<?> < ? > > java.util.Collection<java.util.concurrent.Future<?>> = new java.util.HashSet<java.util.concurrent.Future<?>> <> ( ) ; for ( int int = NUMBER ; int < int ; int ++ ) { java.util.Collection<java.util.concurrent.Future<?>> . boolean ( java.util.concurrent.ExecutorService . java.util.concurrent.Future<?> ( java.lang.Runnable ) ) ; } for ( java.util.concurrent.Future<?> < ? > java.util.concurrent.Future<?> : java.util.Collection<java.util.concurrent.Future<?>> ) { java.util.concurrent.Future<> . get ( ) ; } org.springframework.boot.actuate.metrics.buffer.StopWatch . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { for ( int int = NUMBER ; int < int ; int ++ ) { java.lang.String java.lang.String = java.lang.String[] [ int % java.lang.String[] . int ] ; org.springframework.boot.actuate.metrics.buffer.CounterServiceSpeedTests .this . org.springframework.boot.actuate.metrics.buffer.CounterService . increment ( java.lang.String ) ; } }  <METHOD_END>
