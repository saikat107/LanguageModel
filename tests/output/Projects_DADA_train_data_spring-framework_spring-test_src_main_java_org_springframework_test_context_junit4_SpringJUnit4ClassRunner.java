<METHOD_START> private static void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { for ( java.lang.reflect.Field java.lang.reflect.Field : java.lang.Class<> . java.lang.reflect.Field[] ( ) ) { Assert . state ( ! SpringClassRule .class . boolean ( java.lang.reflect.Field . java.lang.Class<?> ( ) ) , ( ) String . format ( STRING + STRING , testClass . getName ( ) ) ) ; Assert . state ( ! SpringMethodRule .class . boolean ( java.lang.reflect.Field . java.lang.Class<?> ( ) ) , ( ) String . format ( STRING + STRING , testClass . getName ( ) ) ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) throws org.springframework.test.context.junit4.InitializationError { super( java.lang.Class<> ); if ( org.springframework.test.context.junit4.Log . isDebugEnabled ( ) ) { org.springframework.test.context.junit4.Log . debug ( STRING + java.lang.Class<> + STRING ) ; } void ( java.lang.Class<> ) ; this . org.springframework.test.context.junit4.TestContextManager = org.springframework.test.context.junit4.TestContextManager ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.context.junit4.TestContextManager org.springframework.test.context.junit4.TestContextManager ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return new TestContextManager ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.test.context.junit4.TestContextManager org.springframework.test.context.junit4.TestContextManager ( ) { return this . org.springframework.test.context.junit4.TestContextManager ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.test.context.junit4.Description org.springframework.test.context.junit4.Description ( ) { if ( ! ProfileValueUtils . isTestEnabledInThisEnvironment ( getTestClass ( ) . getJavaClass ( ) ) ) { return Description . createSuiteDescription ( getTestClass ( ) . getJavaClass ( ) ) ; } return super. getDescription ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RunNotifier org.springframework.test.context.junit4.RunNotifier ) { if ( ! ProfileValueUtils . isTestEnabledInThisEnvironment ( getTestClass ( ) . getJavaClass ( ) ) ) { org.springframework.test.context.junit4.RunNotifier . fireTestIgnored ( org.springframework.test.context.junit4.Description ( ) ) ; return; } super. run ( org.springframework.test.context.junit4.RunNotifier ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( Statement org.springframework.test.context.junit4.Statement ) { Statement org.springframework.test.context.junit4.Statement = super. withBeforeClasses ( org.springframework.test.context.junit4.Statement ) ; return new RunBeforeTestClassCallbacks ( org.springframework.test.context.junit4.Statement , org.springframework.test.context.junit4.TestContextManager ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( Statement org.springframework.test.context.junit4.Statement ) { Statement org.springframework.test.context.junit4.Statement = super. withAfterClasses ( org.springframework.test.context.junit4.Statement ) ; return new RunAfterTestClassCallbacks ( org.springframework.test.context.junit4.Statement , org.springframework.test.context.junit4.TestContextManager ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) java.lang.Exception { java.lang.Object java.lang.Object = super. createTest ( ) ; org.springframework.test.context.junit4.TestContextManager ( ) . prepareTestInstance ( java.lang.Object ) ; return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , RunNotifier org.springframework.test.context.junit4.RunNotifier ) { Description org.springframework.test.context.junit4.Description = describeChild ( org.springframework.test.context.junit4.FrameworkMethod ) ; if ( boolean ( org.springframework.test.context.junit4.FrameworkMethod ) ) { org.springframework.test.context.junit4.RunNotifier . fireTestIgnored ( org.springframework.test.context.junit4.Description ) ; } else { Statement org.springframework.test.context.junit4.Statement ; try { org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.test.context.junit4.Statement = new Fail ( java.lang.Throwable ) ; } runLeaf ( org.springframework.test.context.junit4.Statement , org.springframework.test.context.junit4.Description , org.springframework.test.context.junit4.RunNotifier ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod ) { java.lang.Object java.lang.Object ; try { java.lang.Object = new ReflectiveCallable ( ) { @ java.lang.Override protected java.lang.Object java.lang.Object ( ) java.lang.Throwable { return java.lang.Object ( ) ; } } . run ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { return new Fail ( java.lang.Throwable ) ; } Statement org.springframework.test.context.junit4.Statement = methodInvoker ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; return org.springframework.test.context.junit4.Statement ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ) java.lang.Throwable { return java.lang.Object ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { return ( Statement ) ReflectionUtils . invokeMethod ( java.lang.reflect.Method , this , org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod ) { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) ; return ( java.lang.reflect.Method . boolean ( Ignore .class ) || ! ProfileValueUtils . isTestEnabledInThisEnvironment ( java.lang.reflect.Method , getTestClass ( ) . getJavaClass ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { java.lang.Class<? extends java.lang.Throwable> < ? extends java.lang.Throwable > java.lang.Class<? extends java.lang.Throwable> = java.lang.Class<? extends java.lang.Throwable> ( org.springframework.test.context.junit4.FrameworkMethod ) ; return ( java.lang.Class<> != null ? new ExpectException ( org.springframework.test.context.junit4.Statement , java.lang.Class<> ) : org.springframework.test.context.junit4.Statement ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<? extends java.lang.Throwable> < ? extends java.lang.Throwable > java.lang.Class<? extends java.lang.Throwable> ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod ) { Test org.springframework.test.context.junit4.Test = org.springframework.test.context.junit4.FrameworkMethod . getAnnotation ( Test .class ) ; return ( org.springframework.test.context.junit4.Test != null && org.springframework.test.context.junit4.Test . expected ( ) != Test . Test .class ? org.springframework.test.context.junit4.Test . expected ( ) : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { Statement org.springframework.test.context.junit4.Statement = null ; long long = long ( org.springframework.test.context.junit4.FrameworkMethod ) ; long long = long ( org.springframework.test.context.junit4.FrameworkMethod ) ; if ( long > NUMBER && long > NUMBER ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING + STRING + STRING , org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) , long , long ) ; org.springframework.test.context.junit4.Log . error ( java.lang.String ) ; throw new java.lang.IllegalStateException ( java.lang.String ) ; } else if ( long > NUMBER ) { org.springframework.test.context.junit4.Statement = new SpringFailOnTimeout ( org.springframework.test.context.junit4.Statement , long ) ; } else if ( long > NUMBER ) { org.springframework.test.context.junit4.Statement = FailOnTimeout . builder ( ) . withTimeout ( long , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) . build ( org.springframework.test.context.junit4.Statement ) ; } else { org.springframework.test.context.junit4.Statement = org.springframework.test.context.junit4.Statement ; } return org.springframework.test.context.junit4.Statement ; }  <METHOD_END>
<METHOD_START> protected long long ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod ) { Test org.springframework.test.context.junit4.Test = org.springframework.test.context.junit4.FrameworkMethod . getAnnotation ( Test .class ) ; return ( org.springframework.test.context.junit4.Test != null && org.springframework.test.context.junit4.Test . timeout ( ) > NUMBER ? org.springframework.test.context.junit4.Test . timeout ( ) : NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected long long ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod ) { return TestAnnotationUtils . getTimeout ( org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { return new RunBeforeTestExecutionCallbacks ( org.springframework.test.context.junit4.Statement , java.lang.Object , org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) , org.springframework.test.context.junit4.TestContextManager ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { return new RunAfterTestExecutionCallbacks ( org.springframework.test.context.junit4.Statement , java.lang.Object , org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) , org.springframework.test.context.junit4.TestContextManager ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { Statement org.springframework.test.context.junit4.Statement = super. withBefores ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; return new RunBeforeTestMethodCallbacks ( org.springframework.test.context.junit4.Statement , java.lang.Object , org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) , org.springframework.test.context.junit4.TestContextManager ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { Statement org.springframework.test.context.junit4.Statement = super. withAfters ( org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object , org.springframework.test.context.junit4.Statement ) ; return new RunAfterTestMethodCallbacks ( org.springframework.test.context.junit4.Statement , java.lang.Object , org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) , org.springframework.test.context.junit4.TestContextManager ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.test.context.junit4.Statement org.springframework.test.context.junit4.Statement ( FrameworkMethod org.springframework.test.context.junit4.FrameworkMethod , java.lang.Object java.lang.Object , Statement org.springframework.test.context.junit4.Statement ) { return new SpringRepeat ( org.springframework.test.context.junit4.Statement , org.springframework.test.context.junit4.FrameworkMethod . getMethod ( ) ) ; }  <METHOD_END>
