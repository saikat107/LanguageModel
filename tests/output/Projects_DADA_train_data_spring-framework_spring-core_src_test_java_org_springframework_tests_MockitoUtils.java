<METHOD_START> public static < T > void void ( T T , T T , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter ... org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) { java.util.List<org.springframework.tests.Invocation> < Invocation > java.util.List<org.springframework.tests.Invocation> = MockUtil . getMockHandler ( T ) . getInvocationContainer ( ) . getInvocations ( ) ; java.util.List<org.springframework.tests.Invocation> < Invocation > java.util.List<org.springframework.tests.Invocation> = MockUtil . getMockHandler ( T ) . getInvocationContainer ( ) . getInvocations ( ) ; void ( java.util.List<org.springframework.tests.Invocation> , java.util.List<org.springframework.tests.Invocation> , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.util.List<org.springframework.tests.Invocation> < Invocation > java.util.List<org.springframework.tests.Invocation> , java.util.List<org.springframework.tests.Invocation> < Invocation > java.util.List<org.springframework.tests.Invocation> , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter ... org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) { assertThat ( java.util.List<org.springframework.tests.Invocation> . size ( ) , is ( equalTo ( java.util.List<org.springframework.tests.Invocation> . size ( ) ) ) ) ; for ( int int = NUMBER ; int < java.util.List<org.springframework.tests.Invocation> . size ( ) ; int ++ ) { void ( java.util.List<org.springframework.tests.Invocation> . get ( int ) , java.util.List<org.springframework.tests.Invocation> . get ( int ) , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( Invocation org.springframework.tests.Invocation , Invocation org.springframework.tests.Invocation , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter ... org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) { assertThat ( org.springframework.tests.Invocation . getMethod ( ) , is ( equalTo ( org.springframework.tests.Invocation . getMethod ( ) ) ) ) ; java.lang.Object [] java.lang.Object[] = java.lang.Object[] ( org.springframework.tests.Invocation , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) ; java.lang.Object [] java.lang.Object[] = java.lang.Object[] ( org.springframework.tests.Invocation , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) ; assertThat ( java.lang.Object[] , is ( equalTo ( java.lang.Object[] ) ) ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.Object [] java.lang.Object[] ( Invocation org.springframework.tests.Invocation , org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter ... org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) { java.lang.Object [] java.lang.Object[] = org.springframework.tests.Invocation . getArguments ( ) ; for ( org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter : org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter[] ) { java.lang.Object[] = org.springframework.tests.MockitoUtils.InvocationArgumentsAdapter . java.lang.Object[] ( java.lang.Object[] ) ; } return java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> java.lang.Object [] java.lang.Object[] ( java.lang.Object [] java.lang.Object[] );  <METHOD_END>