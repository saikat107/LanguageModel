<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( NUMBER , NUMBER ) ; org.springframework.util.ExponentialBackOff . setMaxElapsedTime ( NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( NUMBER , NUMBER ) ; org.springframework.util.ExponentialBackOff . setMaxInterval ( NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( NUMBER , NUMBER ) ; org.springframework.util.ExponentialBackOff . setMaxElapsedTime ( NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( ) ; org.springframework.util.ExponentialBackOff . setInitialInterval ( NUMBER ) ; org.springframework.util.ExponentialBackOff . setMultiplier ( NUMBER ) ; org.springframework.util.ExponentialBackOff . setMaxElapsedTime ( NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( ) ; org.springframework.util.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.util.ExponentialBackOff . setMultiplier ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( NUMBER , NUMBER ) ; org.springframework.util.ExponentialBackOff . setMaxInterval ( NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ExponentialBackOff org.springframework.util.ExponentialBackOff = new ExponentialBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.ExponentialBackOff . start ( ) ; assertEquals ( STRING , org.springframework.util.BackOffExecution . toString ( ) ) ; org.springframework.util.BackOffExecution . nextBackOff ( ) ; assertEquals ( STRING , org.springframework.util.BackOffExecution . toString ( ) ) ; org.springframework.util.BackOffExecution . nextBackOff ( ) ; assertEquals ( STRING , org.springframework.util.BackOffExecution . toString ( ) ) ; }  <METHOD_END>
