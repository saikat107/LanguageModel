<METHOD_START> public void ( java.lang.Process java.lang.Process , ProcessConfiguration org.springframework.data.gemfire.process.ProcessConfiguration ) { Assert . notNull ( java.lang.Process , STRING ) ; Assert . notNull ( org.springframework.data.gemfire.process.ProcessConfiguration , STRING + STRING + STRING ) ; this . java.lang.Process = java.lang.Process ; this . org.springframework.data.gemfire.process.ProcessConfiguration = org.springframework.data.gemfire.process.ProcessConfiguration ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { java.lang.Thread ( STRING , java.lang.Runnable ( java.lang.Process . java.io.InputStream ( ) ) ) . void ( ) ; if ( ! boolean ( ) ) { java.lang.Thread ( STRING , java.lang.Runnable ( java.lang.Process . java.io.InputStream ( ) ) ) . void ( ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Runnable java.lang.Runnable ( java.io.InputStream java.io.InputStream ) { return ( ) { if ( boolean ( ) ) { java.io.BufferedReader java.io.BufferedReader = new java.io.BufferedReader ( new java.io.InputStreamReader ( java.io.InputStream ) ) ; try { for ( java.lang.String java.lang.String = java.io.BufferedReader . java.lang.String ( ) ; java.lang.String != null ; java.lang.String = java.io.BufferedReader . java.lang.String ( ) ) { for ( ProcessInputStreamListener org.springframework.data.gemfire.process.ProcessInputStreamListener : java.util.List<org.springframework.data.gemfire.process.ProcessInputStreamListener> ) { org.springframework.data.gemfire.process.ProcessInputStreamListener . onInput ( java.lang.String ) ; } } } catch ( java.io.IOException java.io.IOException ) { } finally { IOUtils . close ( java.io.BufferedReader ) ; } } } ; }  <METHOD_END>
<METHOD_START> protected java.lang.Thread java.lang.Thread ( java.lang.String java.lang.String , java.lang.Runnable java.lang.Runnable ) { Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( java.lang.Runnable , STRING ) ; java.lang.Thread java.lang.Thread = new java.lang.Thread ( java.lang.Runnable , java.lang.String ) ; java.lang.Thread . void ( boolean ) ; java.lang.Thread . void ( java.lang.Thread . int ) ; return java.lang.Thread ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ProcessUtils . isAlive ( java.lang.Process ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! boolean ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return org.springframework.data.gemfire.process.ProcessConfiguration . getCommand ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return org.springframework.data.gemfire.process.ProcessConfiguration . getCommandString ( ) ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return org.springframework.data.gemfire.process.ProcessConfiguration . getEnvironment ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return ProcessUtils . findAndReadPid ( java.io.File ( ) ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { try { return int ( ) ; } catch ( PidUnavailableException org.springframework.data.gemfire.process.PidUnavailableException ) { return - NUMBER ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return org.springframework.data.gemfire.process.ProcessConfiguration . isRedirectingErrorStream ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! boolean ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ProcessUtils . isRunning ( java.lang.Process ) ; }  <METHOD_END>
<METHOD_START> public java.io.File java.io.File ( ) { return org.springframework.data.gemfire.process.ProcessConfiguration . getWorkingDirectory ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return java.lang.Process . int ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { try { return int ( ) ; } catch ( java.lang.IllegalThreadStateException java.lang.IllegalThreadStateException ) { return - NUMBER ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) java.io.IOException { java.io.File [] java.io.File[] = FileSystemUtils . listFiles ( java.io.File ( ) , ( path ) -> ( path != null && ( path . isDirectory ( ) || path . getAbsolutePath ( ) . endsWith ( STRING ) ) ) ) ; if ( java.io.File[] . int > NUMBER ) { return java.lang.String ( java.io.File[] [ NUMBER ] ) ; } else { throw new java.io.FileNotFoundException ( java.lang.String . java.lang.String ( STRING , int ( ) , java.io.File ( ) ) ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.io.File java.io.File ) throws java.io.IOException { return FileUtils . read ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ProcessInputStreamListener org.springframework.data.gemfire.process.ProcessInputStreamListener ) { return ( org.springframework.data.gemfire.process.ProcessInputStreamListener != null && java.util.List<org.springframework.data.gemfire.process.ProcessInputStreamListener> . add ( org.springframework.data.gemfire.process.ProcessInputStreamListener ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { java.lang.Runtime . java.lang.Runtime ( ) . void ( new java.lang.Thread ( this :: int ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { try { java.io.OutputStream java.io.OutputStream = java.lang.Process . java.io.OutputStream ( ) ; java.io.OutputStream . void ( STRING . byte[] ( ) ) ; java.io.OutputStream . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { java.util.logging.Logger . void ( STRING ) ; if ( java.util.logging.Logger . boolean ( java.util.logging.Level . java.util.logging.Level ) ) { java.util.logging.Logger . void ( ThrowableUtils . toString ( java.io.IOException ) ) ; } } }  <METHOD_END>
<METHOD_START> public void void ( ) { try { ProcessUtils . signalStop ( java.lang.Process ) ; } catch ( java.io.IOException java.io.IOException ) { java.util.logging.Logger . void ( STRING ) ; if ( java.util.logging.Logger . boolean ( java.util.logging.Level . java.util.logging.Level ) ) { java.util.logging.Logger . void ( ThrowableUtils . toString ( java.io.IOException ) ) ; } } }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ( long ) ; }  <METHOD_END>
<METHOD_START> public int int ( long long ) { if ( boolean ( ) ) { boolean boolean = false ; int int = - NUMBER ; int int = int ( ) ; long long = ( java.lang.System . long ( ) + long ) ; java.util.concurrent.atomic.AtomicBoolean java.util.concurrent.atomic.AtomicBoolean = new java.util.concurrent.atomic.AtomicBoolean ( false ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) ; try { java.util.concurrent.Future<java.lang.Integer> < java.lang.Integer > java.util.concurrent.Future<java.lang.Integer> = java.util.concurrent.ExecutorService . java.util.concurrent.Future<java.lang.Integer> ( ( ) { java.lang.Process . void ( ) ; int int = java.lang.Process . int ( ) ; java.util.concurrent.atomic.AtomicBoolean . void ( true ) ; return int ; } ) ; while ( ! java.util.concurrent.atomic.AtomicBoolean . boolean ( ) && java.lang.System . long ( ) < long ) { try { int = java.util.concurrent.Future<java.lang.Integer> . java.lang.Integer ( long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; java.util.logging.Logger . void ( java.lang.String . java.lang.String ( STRING , int ) ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { boolean = true ; } } } catch ( java.util.concurrent.TimeoutException java.util.concurrent.TimeoutException ) { int = - NUMBER ; java.util.logging.Logger . void ( java.lang.String . java.lang.String ( STRING , int , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit . long ( long ) ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { } finally { java.util.concurrent.ExecutorService . java.util.List<java.lang.Runnable> ( ) ; if ( boolean ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } return int ; } else { return int ( ) ; } }  <METHOD_END>
<METHOD_START> public int int ( ) { if ( boolean ( ) ) { java.util.logging.Logger . void ( java.lang.String . java.lang.String ( STRING , int ( ) ) ) ; void ( ) ; void ( ) ; } return int ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ProcessInputStreamListener org.springframework.data.gemfire.process.ProcessInputStreamListener ) { return java.util.List<org.springframework.data.gemfire.process.ProcessInputStreamListener> . remove ( org.springframework.data.gemfire.process.ProcessInputStreamListener ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { void ( long ) ; }  <METHOD_END>
<METHOD_START> public void void ( long long ) { ThreadUtils . timedWait ( long , NUMBER , this :: boolean ) ; }  <METHOD_END>