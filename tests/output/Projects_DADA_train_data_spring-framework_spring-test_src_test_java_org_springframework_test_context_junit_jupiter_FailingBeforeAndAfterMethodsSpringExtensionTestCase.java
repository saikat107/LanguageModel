<METHOD_START> private static java.util.stream.Stream<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.stream.Stream<java.lang.Class<?>> ( ) { return java.util.stream.Stream . java.util.stream.Stream<java.lang.Class<?>> ( org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingBeforeTestClassTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingAfterTestClassTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingPrepareTestInstanceTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingBeforeTestMethodTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingBeforeTestExecutionTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingAfterTestExecutionTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingAfterTestMethodTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.FailingBeforeTransactionTestCase .class , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.FailingAfterTransactionTestCase .class ) ; }  <METHOD_END>
<METHOD_START> @ TestFactory java.util.stream.Stream<org.springframework.test.context.junit.jupiter.DynamicTest> < DynamicTest > java.util.stream.Stream<org.springframework.test.context.junit.jupiter.DynamicTest> ( ) java.lang.Exception { return java.util.stream.Stream<java.lang.Class<?>> ( ) . java.util.stream.Stream<org.springframework.test.context.junit.jupiter.DynamicTest> ( java.lang.Class<?> -> dynamicTest ( java.lang.Class<> . java.lang.String ( ) , ( ) runTestAndAssertCounters ( clazz ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Launcher org.springframework.test.context.junit.jupiter.Launcher = LauncherFactory . create ( ) ; org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener = new org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener ( ) ; org.springframework.test.context.junit.jupiter.Launcher . registerTestExecutionListeners ( org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener ) ; org.springframework.test.context.junit.jupiter.Launcher . execute ( request ( ) . selectors ( selectClass ( java.lang.Class<> ) ) . build ( ) ) ; TestExecutionSummary org.springframework.test.context.junit.jupiter.TestExecutionSummary = org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener . getSummary ( ) ; java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) ; int int = int ( java.lang.Class<> ) ; int int = int ( java.lang.Class<> ) ; int int = int ( java.lang.Class<> ) ; assertAll ( ( ) assertEquals ( NUMBER , summary . getTestsFoundCount ( ) , ( ) name + STRING ) , ( ) assertEquals ( NUMBER , summary . getTestsSkippedCount ( ) , ( ) name + STRING ) , ( ) assertEquals ( NUMBER , summary . getTestsAbortedCount ( ) , ( ) name + STRING ) , ( ) assertEquals ( expectedStartedCount , summary . getTestsStartedCount ( ) , ( ) name + STRING ) , ( ) assertEquals ( expectedSucceededCount , summary . getTestsSucceededCount ( ) , ( ) name + STRING ) , ( ) assertEquals ( expectedFailedCount , summary . getTestsFailedCount ( ) , ( ) name + STRING ) ) ; if ( int > NUMBER ) { assertEquals ( NUMBER , org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener . java.util.List<java.lang.Throwable> . int ( ) , STRING ) ; java.lang.Throwable java.lang.Throwable = org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.ExceptionTrackingListener . java.util.List<java.lang.Throwable> . java.lang.Throwable ( NUMBER ) ; if ( ! ( java.lang.Throwable instanceof AssertionFailedError ) ) { throw new AssertionFailedError ( java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) . java.lang.String ( ) + STRING + AssertionFailedError .class . java.lang.String ( ) , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> private int int ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( java.lang.Class<> == org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingBeforeTestClassTestCase .class ? NUMBER : NUMBER ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return ( java.lang.Class<> == org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingAfterTestClassTestCase .class ? NUMBER : NUMBER ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> == org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingBeforeTestClassTestCase .class || java.lang.Class<> == org.springframework.test.context.junit.jupiter.FailingBeforeAndAfterMethodsSpringExtensionTestCase.AlwaysFailingAfterTestClassTestCase .class ) { return NUMBER ; } return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) throws java.lang.Exception { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.test.context.junit.jupiter.TestContext ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test void void ( ) {		}  <METHOD_END>
<METHOD_START> @ Test void void ( ) {		}  <METHOD_END>
<METHOD_START> @ BeforeTransaction void void ( ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test void void ( ) {		}  <METHOD_END>
<METHOD_START> @ AfterTransaction void void ( ) { fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.test.context.junit.jupiter.PlatformTransactionManager org.springframework.test.context.junit.jupiter.PlatformTransactionManager ( ) { return new DataSourceTransactionManager ( javax.sql.DataSource ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean javax.sql.DataSource javax.sql.DataSource ( ) { return new EmbeddedDatabaseBuilder ( ) . generateUniqueName ( true ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestIdentifier org.springframework.test.context.junit.jupiter.TestIdentifier , TestExecutionResult org.springframework.test.context.junit.jupiter.TestExecutionResult ) { super. executionFinished ( org.springframework.test.context.junit.jupiter.TestIdentifier , org.springframework.test.context.junit.jupiter.TestExecutionResult ) ; org.springframework.test.context.junit.jupiter.TestExecutionResult . getThrowable ( ) . ifPresent ( java.util.List<java.lang.Throwable> :: add ) ; }  <METHOD_END>
