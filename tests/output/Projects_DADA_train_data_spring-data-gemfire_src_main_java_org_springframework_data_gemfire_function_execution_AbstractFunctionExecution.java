<METHOD_START> public void ( Function org.springframework.data.gemfire.function.execution.Function , java.lang.Object ... java.lang.Object[] ) { Assert . notNull ( org.springframework.data.gemfire.function.execution.Function , STRING ) ; this . org.springframework.data.gemfire.function.execution.Function = org.springframework.data.gemfire.function.execution.Function ; this . java.lang.String = org.springframework.data.gemfire.function.execution.Function . getId ( ) ; this . java.lang.Object[] = java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { Assert . isTrue ( StringUtils . hasLength ( java.lang.String ) , STRING ) ; this . java.lang.String = java.lang.String ; this . java.lang.Object[] = java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> void ( ) {	}  <METHOD_END>
<METHOD_START> java.lang.Object [] java.lang.Object[] ( ) { return java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.function.execution.ResultCollector<?,?> < ? , ? > org.springframework.data.gemfire.function.execution.ResultCollector<?,?> ( ) { return org.springframework.data.gemfire.function.execution.ResultCollector<,> ; }  <METHOD_END>
<METHOD_START> org.springframework.data.gemfire.function.execution.Function org.springframework.data.gemfire.function.execution.Function ( ) { return org.springframework.data.gemfire.function.execution.Function ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> long long ( ) { return long ; }  <METHOD_END>
<METHOD_START> < T > java.lang.Iterable<T> < T > java.lang.Iterable<T> ( ) { return java.lang.Iterable<T> ( true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) < T > java.lang.Iterable<T> < T > java.lang.Iterable<T> ( java.lang.Boolean java.lang.Boolean ) { Execution org.springframework.data.gemfire.function.execution.Execution = org.springframework.data.gemfire.function.execution.Execution ( ) ; org.springframework.data.gemfire.function.execution.Execution = org.springframework.data.gemfire.function.execution.Execution . withArgs ( java.lang.Object[] ( ) ) ; org.springframework.data.gemfire.function.execution.Execution = ( org.springframework.data.gemfire.function.execution.ResultCollector<?,?> ( ) == null ? org.springframework.data.gemfire.function.execution.Execution : org.springframework.data.gemfire.function.execution.Execution . withCollector ( org.springframework.data.gemfire.function.execution.ResultCollector<?,?> ( ) ) ) ; org.springframework.data.gemfire.function.execution.Execution = ( java.util.Set<?> ( ) == null ? org.springframework.data.gemfire.function.execution.Execution : org.springframework.data.gemfire.function.execution.Execution . withFilter ( java.util.Set<?> ( ) ) ) ; ResultCollector < ? , ? > org.springframework.data.gemfire.function.execution.ResultCollector<?,?> ; if ( boolean ( ) ) { org.springframework.data.gemfire.function.execution.ResultCollector<?,?> = org.springframework.data.gemfire.function.execution.Execution . execute ( java.lang.String ) ; } else { org.springframework.data.gemfire.function.execution.ResultCollector<?,?> = org.springframework.data.gemfire.function.execution.Execution . execute ( org.springframework.data.gemfire.function.execution.Function ) ; if ( ! org.springframework.data.gemfire.function.execution.Function . hasResult ( ) ) { return null ; } } if ( ! java.lang.Boolean ) { return null ; } if ( org.springframework.data.gemfire.function.execution.Log . isDebugEnabled ( ) ) { org.springframework.data.gemfire.function.execution.Log . debug ( STRING + org.springframework.data.gemfire.function.execution.ResultCollector<,> . getClass ( ) . getName ( ) ) ; } java.lang.Iterable<T> < T > java.lang.Iterable<T> = null ; try { if ( this . long > NUMBER ) { try { java.lang.Iterable<T> = ( java.lang.Iterable<T> < T > ) org.springframework.data.gemfire.function.execution.ResultCollector<,> . getResult ( this . long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; } catch ( FunctionException org.springframework.data.gemfire.function.execution.FunctionException ) { throw new java.lang.RuntimeException ( org.springframework.data.gemfire.function.execution.FunctionException ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { throw new java.lang.RuntimeException ( java.lang.InterruptedException ) ; } } else { java.lang.Iterable<T> = ( java.lang.Iterable<T> < T > ) org.springframework.data.gemfire.function.execution.ResultCollector<,> . getResult ( ) ; } return java.lang.Iterable<T> ( java.lang.Iterable<T> ) ; } catch ( FunctionException org.springframework.data.gemfire.function.execution.FunctionException ) { if ( ! org.springframework.data.gemfire.function.execution.FunctionException . getMessage ( ) . equals ( java.lang.String ) ) { throw org.springframework.data.gemfire.function.execution.FunctionException ; } } return java.lang.Iterable<T> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) < T > T T ( ) { java.lang.Iterable<T> < T > java.lang.Iterable<T> = java.lang.Iterable<T> ( ) ; if ( java.lang.Iterable<T> == null || ! java.lang.Iterable<T> . java.util.Iterator<T> ( ) . boolean ( ) ) { return null ; } java.lang.Object java.lang.Object = java.lang.Iterable<T> . java.util.Iterator<T> ( ) . T ( ) ; if ( java.lang.Object instanceof java.lang.Throwable ) { throw new FunctionException ( java.lang.String . java.lang.String ( STRING , ( org.springframework.data.gemfire.function.execution.Function != null ? org.springframework.data.gemfire.function.execution.Function . getClass ( ) . getName ( ) : java.lang.String . java.lang.String ( STRING , java.lang.String ) ) ) , ( java.lang.Throwable ) java.lang.Object ) ; } return ( T ) java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.gemfire.function.execution.Execution org.springframework.data.gemfire.function.execution.Execution ( )  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( java.lang.Object ... java.lang.Object[] ) { this . java.lang.Object[] = java.lang.Object[] ; return this ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( Function org.springframework.data.gemfire.function.execution.Function ) { this . org.springframework.data.gemfire.function.execution.Function = org.springframework.data.gemfire.function.execution.Function ; return this ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; return this ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ResultCollector < ? , ? > org.springframework.data.gemfire.function.execution.ResultCollector<?,?> ) { this . org.springframework.data.gemfire.function.execution.ResultCollector<?,?> = org.springframework.data.gemfire.function.execution.ResultCollector<,> ; return this ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( long long ) { this . long = long ; return this ; }  <METHOD_END>
<METHOD_START> protected java.util.Set<?> < ? > java.util.Set<?> ( ) { return null ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return org.springframework.data.gemfire.function.execution.Function == null ; }  <METHOD_END>
<METHOD_START> private < T > java.lang.Iterable<T> < T > java.lang.Iterable<T> ( java.lang.Iterable<T> < T > java.lang.Iterable<T> ) { if ( java.lang.Iterable<T> != null ) { java.util.Iterator<T> < T > java.util.Iterator<T> = java.lang.Iterable<T> . java.util.Iterator<T> ( ) ; if ( ! java.util.Iterator<T> . boolean ( ) ) { return java.lang.Iterable<T> ; } if ( java.util.Iterator<T> . T ( ) == null && ! java.util.Iterator<T> . boolean ( ) ) { return new java.util.ArrayList<T> < T > ( ) ; } } return java.lang.Iterable<T> ; }  <METHOD_END>
