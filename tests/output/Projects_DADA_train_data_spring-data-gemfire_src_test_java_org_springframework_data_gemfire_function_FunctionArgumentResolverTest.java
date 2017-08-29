<METHOD_START> @ Test public void void ( ) { FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new DefaultFunctionArgumentResolver ( ) ; FunctionContext org.springframework.data.gemfire.function.FunctionContext = mock ( FunctionContext .class ) ; when ( org.springframework.data.gemfire.function.FunctionContext . getArguments ( ) ) . thenReturn ( null ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.FunctionContext ) ; assertNotNull ( java.lang.Object[] ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new DefaultFunctionArgumentResolver ( ) ; FunctionContext org.springframework.data.gemfire.function.FunctionContext = mock ( FunctionContext .class ) ; when ( org.springframework.data.gemfire.function.FunctionContext . getArguments ( ) ) . thenReturn ( new java.lang.String [] { STRING , STRING , STRING } ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.FunctionContext ) ; assertNotNull ( java.lang.Object[] ) ; assertFalse ( java.lang.Object[] instanceof java.lang.String [] ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new DefaultFunctionArgumentResolver ( ) ; FunctionContext org.springframework.data.gemfire.function.FunctionContext = mock ( FunctionContext .class ) ; when ( org.springframework.data.gemfire.function.FunctionContext . getArguments ( ) ) . thenReturn ( STRING ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.FunctionContext ) ; assertNotNull ( java.lang.Object[] ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertEquals ( STRING , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , java.lang.String .class , int .class , boolean .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { STRING , NUMBER , false } ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( java.lang.Object[] . int , java.lang.Object[] . int ) ; int int = NUMBER ; for ( java.lang.Object java.lang.Object : java.lang.Object[] ) { assertSame ( java.lang.Object[] [ int ++ ] , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; @ java.lang.SuppressWarnings ( STRING ) Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> = mock ( Region .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Region .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { STRING } ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getDataSet ( ) ) . thenReturn ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( java.lang.Object[] . int + NUMBER , java.lang.Object[] . int ) ; int int = NUMBER ; for ( java.lang.Object java.lang.Object : java.lang.Object[] ) { if ( int != NUMBER ) { assertSame ( java.lang.Object[] [ int ++ ] , java.lang.Object ) ; } else { assertSame ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> , java.lang.Object ) ; } } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; @ java.lang.SuppressWarnings ( STRING ) Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> = mock ( Region .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , Region .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] {} ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getDataSet ( ) ) . thenReturn ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertSame ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; @ java.lang.SuppressWarnings ( STRING ) Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> = mock ( Region .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , Region .class , java.lang.String .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { STRING } ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getDataSet ( ) ) . thenReturn ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertSame ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> , java.lang.Object[] [ NUMBER ] ) ; assertSame ( java.lang.Object[] [ NUMBER ] , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; @ java.lang.SuppressWarnings ( STRING ) Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> = mock ( Region .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , java.util.Map .class , java.lang.String .class , FunctionContext .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { STRING } ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getDataSet ( ) ) . thenReturn ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertSame ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> , java.lang.Object[] [ NUMBER ] ) ; assertSame ( java.lang.Object[] [ NUMBER ] , java.lang.Object[] [ NUMBER ] ) ; assertSame ( org.springframework.data.gemfire.function.RegionFunctionContext , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; ResultSender org.springframework.data.gemfire.function.ResultSender = mock ( ResultSender .class ) ; Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> = mock ( Region .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , java.util.Map .class , ResultSender .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] {} ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getDataSet ( ) ) . thenReturn ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getResultSender ( ) ) . thenReturn ( org.springframework.data.gemfire.function.ResultSender ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertSame ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> , java.lang.Object[] [ NUMBER ] ) ; assertSame ( org.springframework.data.gemfire.function.ResultSender , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { RegionFunctionContext org.springframework.data.gemfire.function.RegionFunctionContext = mock ( RegionFunctionContext .class ) ; Region < java.lang.Object , java.lang.Object > org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> = mock ( Region .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , java.util.Map .class , java.util.Set .class , java.lang.Object .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { new java.lang.Object ( ) } ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getDataSet ( ) ) . thenReturn ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Set java.util.Set = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; when ( org.springframework.data.gemfire.function.RegionFunctionContext . getFilter ( ) ) . thenReturn ( java.util.Set ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.RegionFunctionContext ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertSame ( org.springframework.data.gemfire.function.Region<java.lang.Object,java.lang.Object> , java.lang.Object[] [ NUMBER ] ) ; assertSame ( java.lang.Object[] [ NUMBER ] , java.lang.Object[] [ NUMBER ] ) ; assertSame ( java.util.Set , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , java.util.Map .class , java.util.Map .class ) ; new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , Region .class , java.util.Map .class ) ; new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , Region .class ) ; new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , FunctionContext .class , FunctionContext .class ) ; new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.NoSuchMethodException { FunctionContext org.springframework.data.gemfire.function.FunctionContext = mock ( FunctionContext .class ) ; ResultSender org.springframework.data.gemfire.function.ResultSender = mock ( ResultSender .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.gemfire.function.FunctionArgumentResolverTest.TestFunction .class . java.lang.reflect.Method ( STRING , FunctionContext .class , ResultSender .class ) ; FunctionArgumentResolver org.springframework.data.gemfire.function.FunctionArgumentResolver = new FunctionContextInjectingArgumentResolver ( java.lang.reflect.Method ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] {} ; when ( org.springframework.data.gemfire.function.FunctionContext . getArguments ( ) ) . thenReturn ( java.lang.Object[] ) ; when ( org.springframework.data.gemfire.function.FunctionContext . getResultSender ( ) ) . thenReturn ( org.springframework.data.gemfire.function.ResultSender ) ; java.lang.Object [] java.lang.Object[] = org.springframework.data.gemfire.function.FunctionArgumentResolver . resolveFunctionArguments ( org.springframework.data.gemfire.function.FunctionContext ) ; assertEquals ( NUMBER , java.lang.Object[] . int ) ; assertSame ( org.springframework.data.gemfire.function.FunctionContext , java.lang.Object[] [ NUMBER ] ) ; assertSame ( org.springframework.data.gemfire.function.ResultSender , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , int int , boolean boolean ) {        }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , Region < ? , ? > org.springframework.data.gemfire.function.Region<?,?> ) {        }  <METHOD_END>
<METHOD_START> public void void ( Region < ? , ? > org.springframework.data.gemfire.function.Region<?,?> ) {        }  <METHOD_END>
<METHOD_START> public void void ( @ RegionData Region < ? , ? > org.springframework.data.gemfire.function.Region<?,?> , java.lang.String java.lang.String ) {        }  <METHOD_END>
<METHOD_START> public void void ( @ RegionData java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , java.lang.String java.lang.String , FunctionContext org.springframework.data.gemfire.function.FunctionContext ) {        }  <METHOD_END>
<METHOD_START> public void void ( @ RegionData java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , ResultSender < ? > org.springframework.data.gemfire.function.ResultSender<?> ) {        }  <METHOD_END>
<METHOD_START> public void void ( @ RegionData java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , @ Filter java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> , java.lang.Object java.lang.Object ) {        }  <METHOD_END>
<METHOD_START> public void void ( @ RegionData java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , @ RegionData java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) {        }  <METHOD_END>
<METHOD_START> public void void ( Region < ? , ? > org.springframework.data.gemfire.function.Region<?,?> , @ RegionData java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) {        }  <METHOD_END>
<METHOD_START> public void void ( @ Filter Region < ? , ? > org.springframework.data.gemfire.function.Region<?,?> ) {        }  <METHOD_END>
<METHOD_START> public void void ( FunctionContext org.springframework.data.gemfire.function.FunctionContext , FunctionContext org.springframework.data.gemfire.function.FunctionContext ) {        }  <METHOD_END>
<METHOD_START> public void void ( FunctionContext org.springframework.data.gemfire.function.FunctionContext , ResultSender < ? > org.springframework.data.gemfire.function.ResultSender<?> ) {        }  <METHOD_END>
