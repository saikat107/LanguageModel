<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.test.context.bootstrap.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; this . org.springframework.boot.test.context.bootstrap.ExpectedException . expectMessage ( STRING + STRING + STRING + STRING ) ; void ( org.springframework.boot.test.context.bootstrap.SpringBootTestContextBootstrapperTests.SpringBootTestNonMockWebEnvironmentAndWebAppConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.test.context.bootstrap.SpringBootTestContextBootstrapperTests.SpringBootTestMockWebEnvironmentAndWebAppConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { SpringBootTestContextBootstrapper org.springframework.boot.test.context.bootstrap.SpringBootTestContextBootstrapper = new SpringBootTestContextBootstrapper ( ) ; BootstrapContext org.springframework.boot.test.context.bootstrap.BootstrapContext = mock ( BootstrapContext .class ) ; org.springframework.boot.test.context.bootstrap.SpringBootTestContextBootstrapper . setBootstrapContext ( org.springframework.boot.test.context.bootstrap.BootstrapContext ) ; given ( ( java.lang.Class ) org.springframework.boot.test.context.bootstrap.BootstrapContext . getTestClass ( ) ) . willReturn ( java.lang.Class<> ) ; CacheAwareContextLoaderDelegate org.springframework.boot.test.context.bootstrap.CacheAwareContextLoaderDelegate = mock ( CacheAwareContextLoaderDelegate .class ) ; given ( org.springframework.boot.test.context.bootstrap.BootstrapContext . getCacheAwareContextLoaderDelegate ( ) ) . willReturn ( org.springframework.boot.test.context.bootstrap.CacheAwareContextLoaderDelegate ) ; org.springframework.boot.test.context.bootstrap.SpringBootTestContextBootstrapper . buildTestContext ( ) ; }  <METHOD_END>