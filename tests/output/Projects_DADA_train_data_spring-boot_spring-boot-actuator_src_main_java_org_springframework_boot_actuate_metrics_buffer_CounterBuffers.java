<METHOD_START> public void void ( final java.lang.String java.lang.String , final long long ) { doWith ( java.lang.String , new java.util.function.Consumer<org.springframework.boot.actuate.metrics.buffer.CounterBuffer> < CounterBuffer > ( ) { @ java.lang.Override public void void ( CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { org.springframework.boot.actuate.metrics.buffer.CounterBuffer . setTimestamp ( java.lang.System . long ( ) ) ; org.springframework.boot.actuate.metrics.buffer.CounterBuffer . add ( long ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { org.springframework.boot.actuate.metrics.buffer.CounterBuffer . setTimestamp ( java.lang.System . long ( ) ) ; org.springframework.boot.actuate.metrics.buffer.CounterBuffer . add ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( final java.lang.String java.lang.String ) { doWith ( java.lang.String , new java.util.function.Consumer<org.springframework.boot.actuate.metrics.buffer.CounterBuffer> < CounterBuffer > ( ) { @ java.lang.Override public void void ( CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { org.springframework.boot.actuate.metrics.buffer.CounterBuffer . setTimestamp ( java.lang.System . long ( ) ) ; org.springframework.boot.actuate.metrics.buffer.CounterBuffer . reset ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ) { org.springframework.boot.actuate.metrics.buffer.CounterBuffer . setTimestamp ( java.lang.System . long ( ) ) ; org.springframework.boot.actuate.metrics.buffer.CounterBuffer . reset ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.actuate.metrics.buffer.CounterBuffer org.springframework.boot.actuate.metrics.buffer.CounterBuffer ( ) { return new CounterBuffer ( NUMBER ) ; }  <METHOD_END>