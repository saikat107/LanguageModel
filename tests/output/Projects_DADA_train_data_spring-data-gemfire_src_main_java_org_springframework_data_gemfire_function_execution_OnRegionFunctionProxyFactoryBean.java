<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , GemfireOnRegionOperations org.springframework.data.gemfire.function.execution.GemfireOnRegionOperations ) { super( java.lang.Class<> , org.springframework.data.gemfire.function.execution.GemfireOnRegionOperations ); org.springframework.data.gemfire.function.execution.OnRegionExecutionMethodMetadata = new OnRegionExecutionMethodMetadata ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Iterable<?> < ? > java.lang.Iterable<?> ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) { GemfireOnRegionOperations org.springframework.data.gemfire.function.execution.GemfireOnRegionOperations = ( GemfireOnRegionOperations ) getGemfireFunctionOperations ( ) ; OnRegionMethodMetadata org.springframework.data.gemfire.function.execution.OnRegionMethodMetadata = org.springframework.data.gemfire.function.execution.OnRegionExecutionMethodMetadata . getMethodMetadata ( java.lang.reflect.Method ) ; int int = org.springframework.data.gemfire.function.execution.OnRegionMethodMetadata . getFilterArgPosition ( ) ; java.lang.String java.lang.String = org.springframework.data.gemfire.function.execution.OnRegionMethodMetadata . getFunctionId ( ) ; java.util.Set<?> < ? > java.util.Set<?> = null ; if ( int >= NUMBER ) { java.util.Set<?> = ( java.util.Set<?> < ? > ) java.lang.Object[] [ int ] ; java.lang.Object[] = ArrayUtils . remove ( java.lang.Object[] , int ) ; } return ( java.util.Set<> == null ? org.springframework.data.gemfire.function.execution.GemfireOnRegionOperations . execute ( java.lang.String , java.lang.Object[] ) : org.springframework.data.gemfire.function.execution.GemfireOnRegionOperations . execute ( java.lang.String , java.util.Set<> , java.lang.Object[] ) ) ; }  <METHOD_END>