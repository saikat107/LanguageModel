<METHOD_START> @ Test public void void ( ) { java.lang.Object [] java.lang.Object[] = { STRING , STRING , STRING } ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setArgs ( java.lang.Object[] ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setFunction ( org.springframework.data.gemfire.function.execution.Function ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setTimeout ( NUMBER ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . execute ( ) ) . thenReturn ( java.util.List<java.lang.Object> ) ; AbstractFunctionTemplate org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate = new AbstractFunctionTemplate ( ) { @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; } } ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setTimeout ( NUMBER ) ; java.lang.Iterable<java.lang.Object> < java.lang.Object > java.lang.Iterable<java.lang.Object> = org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . execute ( org.springframework.data.gemfire.function.execution.Function , java.lang.Object[] ) ; assertThat ( org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . getResultCollector ( ) , is ( equalTo ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ) ; assertThat ( java.lang.Iterable<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( java.lang.Iterable<java.lang.Object> , is ( equalTo ( ( java.lang.Iterable<java.lang.Object> < java.lang.Object > ) java.util.List<java.lang.Object> ) ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setArgs ( java.lang.Object[] ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setFunction ( org.springframework.data.gemfire.function.execution.Function ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setResultCollector ( eq ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setTimeout ( NUMBER ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . execute ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object [] java.lang.Object[] = { STRING , STRING , STRING } ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setArgs ( java.lang.Object[] ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setFunction ( org.springframework.data.gemfire.function.execution.Function ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setTimeout ( NUMBER ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . executeAndExtract ( ) ) . thenReturn ( java.lang.Object[] [ NUMBER ] ) ; AbstractFunctionTemplate org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate = new AbstractFunctionTemplate ( ) { @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; } } ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setTimeout ( NUMBER ) ; java.lang.String java.lang.String = org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . executeAndExtract ( org.springframework.data.gemfire.function.execution.Function , java.lang.Object[] ) ; assertThat ( org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . getResultCollector ( ) , is ( equalTo ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ) ; assertThat ( java.lang.String , is ( notNullValue ( ) ) ) ; assertThat ( java.lang.String , is ( equalTo ( STRING ) ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setArgs ( java.lang.Object[] ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setFunction ( org.springframework.data.gemfire.function.execution.Function ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setResultCollector ( eq ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setTimeout ( NUMBER ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . executeAndExtract ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object [] java.lang.Object[] = { STRING , STRING , STRING } ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setArgs ( java.lang.Object[] ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setFunctionId ( STRING ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setTimeout ( NUMBER ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . execute ( ) ) . thenReturn ( java.util.List<java.lang.Object> ) ; AbstractFunctionTemplate org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate = new AbstractFunctionTemplate ( ) { @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; } } ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setTimeout ( NUMBER ) ; java.lang.Iterable<java.lang.Object> < java.lang.Object > java.lang.Iterable<java.lang.Object> = org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . execute ( STRING , java.lang.Object[] ) ; assertThat ( org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . getResultCollector ( ) , is ( equalTo ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ) ; assertThat ( java.lang.Iterable<java.lang.Object> , is ( notNullValue ( ) ) ) ; assertThat ( java.lang.Iterable<java.lang.Object> , is ( equalTo ( ( java.lang.Iterable<java.lang.Object> < java.lang.Object > ) java.util.List<java.lang.Object> ) ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setArgs ( java.lang.Object[] ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setFunctionId ( STRING ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setResultCollector ( eq ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setTimeout ( NUMBER ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . execute ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object [] java.lang.Object[] = { STRING , STRING , STRING } ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setArgs ( java.lang.Object[] ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setFunctionId ( STRING ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setTimeout ( NUMBER ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . executeAndExtract ( ) ) . thenReturn ( java.lang.Object[] [ NUMBER ] ) ; AbstractFunctionTemplate org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate = new AbstractFunctionTemplate ( ) { @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; } } ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setTimeout ( NUMBER ) ; java.lang.String java.lang.String = org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . executeAndExtract ( STRING , java.lang.Object[] ) ; assertThat ( org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . getResultCollector ( ) , is ( equalTo ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ) ; assertThat ( java.lang.String , is ( notNullValue ( ) ) ) ; assertThat ( java.lang.String , is ( equalTo ( STRING ) ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setArgs ( java.lang.Object[] ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setFunctionId ( STRING ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setResultCollector ( eq ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setTimeout ( NUMBER ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . executeAndExtract ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object [] java.lang.Object[] = { STRING , STRING , STRING } ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setArgs ( java.lang.Object[] ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setFunctionId ( STRING ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . setTimeout ( NUMBER ) ) . thenReturn ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ) ; when ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution . execute ( eq ( false ) ) ) . thenReturn ( null ) ; AbstractFunctionTemplate org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate = new AbstractFunctionTemplate ( ) { @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; } } ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setResultCollector ( org.springframework.data.gemfire.function.execution.ResultCollector ) ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . setTimeout ( NUMBER ) ; org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . executeWithNoResult ( STRING , java.lang.Object[] ) ; assertThat ( org.springframework.data.gemfire.function.execution.AbstractFunctionTemplate . getResultCollector ( ) , is ( equalTo ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setArgs ( java.lang.Object[] ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setFunctionId ( STRING ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setResultCollector ( eq ( org.springframework.data.gemfire.function.execution.ResultCollector ) ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . setTimeout ( NUMBER ) ; verify ( org.springframework.data.gemfire.function.execution.AbstractFunctionExecution , times ( NUMBER ) ) . execute ( eq ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.execution.AbstractFunctionExecution org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ( ) { return org.springframework.data.gemfire.function.execution.AbstractFunctionExecution ; }  <METHOD_END>