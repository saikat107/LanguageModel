<METHOD_START> @ Test public void void ( ) { FixedBackOff org.springframework.util.FixedBackOff = new FixedBackOff ( ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { assertEquals ( FixedBackOff . DEFAULT_INTERVAL , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FixedBackOff org.springframework.util.FixedBackOff = new FixedBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FixedBackOff org.springframework.util.FixedBackOff = new FixedBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FixedBackOff org.springframework.util.FixedBackOff = new FixedBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FixedBackOff org.springframework.util.FixedBackOff = new FixedBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; org.springframework.util.FixedBackOff . setInterval ( NUMBER ) ; org.springframework.util.FixedBackOff . setMaxAttempts ( NUMBER ) ; assertEquals ( NUMBER , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; assertEquals ( BackOffExecution . STOP , org.springframework.util.BackOffExecution . nextBackOff ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FixedBackOff org.springframework.util.FixedBackOff = new FixedBackOff ( NUMBER , NUMBER ) ; BackOffExecution org.springframework.util.BackOffExecution = org.springframework.util.FixedBackOff . start ( ) ; assertEquals ( STRING , org.springframework.util.BackOffExecution . toString ( ) ) ; org.springframework.util.BackOffExecution . nextBackOff ( ) ; assertEquals ( STRING , org.springframework.util.BackOffExecution . toString ( ) ) ; org.springframework.util.BackOffExecution . nextBackOff ( ) ; assertEquals ( STRING , org.springframework.util.BackOffExecution . toString ( ) ) ; }  <METHOD_END>
