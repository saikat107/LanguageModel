<METHOD_START> org.springframework.test.context.support.MergedContextConfiguration org.springframework.test.context.support.MergedContextConfiguration ( java.lang.Class<?> < ? > java.lang.Class<?> ) { CacheAwareContextLoaderDelegate org.springframework.test.context.support.CacheAwareContextLoaderDelegate = Mockito . mock ( CacheAwareContextLoaderDelegate .class ) ; BootstrapContext org.springframework.test.context.support.BootstrapContext = BootstrapTestUtils . buildBootstrapContext ( java.lang.Class<> , org.springframework.test.context.support.CacheAwareContextLoaderDelegate ) ; TestContextBootstrapper org.springframework.test.context.support.TestContextBootstrapper = BootstrapTestUtils . resolveTestContextBootstrapper ( org.springframework.test.context.support.BootstrapContext ) ; return org.springframework.test.context.support.TestContextBootstrapper . buildMergedContextConfiguration ( ) ; }  <METHOD_END>
<METHOD_START> void void ( ContextConfigurationAttributes org.springframework.test.context.support.ContextConfigurationAttributes , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String [] java.lang.String[] , java.lang.Class<?> < ? > [] java.lang.Class<?>[] , java.lang.Class<? extends org.springframework.test.context.support.ContextLoader> < ? extends ContextLoader > java.lang.Class<? extends org.springframework.test.context.support.ContextLoader> , boolean boolean ) { assertEquals ( STRING , java.lang.Class<> , org.springframework.test.context.support.ContextConfigurationAttributes . getDeclaringClass ( ) ) ; assertArrayEquals ( STRING , java.lang.String[] , org.springframework.test.context.support.ContextConfigurationAttributes . getLocations ( ) ) ; assertArrayEquals ( STRING , java.lang.Class<?>[] , org.springframework.test.context.support.ContextConfigurationAttributes . getClasses ( ) ) ; assertEquals ( STRING , boolean , org.springframework.test.context.support.ContextConfigurationAttributes . isInheritLocations ( ) ) ; assertEquals ( STRING , java.lang.Class<> , org.springframework.test.context.support.ContextConfigurationAttributes . getContextLoaderClass ( ) ) ; }  <METHOD_END>
<METHOD_START> void void ( MergedContextConfiguration org.springframework.test.context.support.MergedContextConfiguration , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String [] java.lang.String[] , java.lang.Class<?> < ? > [] java.lang.Class<?>[] , java.lang.Class<? extends org.springframework.test.context.support.ContextLoader> < ? extends ContextLoader > java.lang.Class<? extends org.springframework.test.context.support.ContextLoader> ) { void ( org.springframework.test.context.support.MergedContextConfiguration , java.lang.Class<> , java.lang.String[] , java.lang.Class<?>[] , java.util.Set<java.lang.Class<? extends org.springframework.test.context.support.ApplicationContextInitializer<? extends org.springframework.test.context.support.ConfigurableApplicationContext>>> , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> void void ( MergedContextConfiguration org.springframework.test.context.support.MergedContextConfiguration , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String [] java.lang.String[] , java.lang.Class<?> < ? > [] java.lang.Class<?>[] , java.util.Set<java.lang.Class<? extends org.springframework.test.context.support.ApplicationContextInitializer<? extends org.springframework.test.context.support.ConfigurableApplicationContext>>> < java.lang.Class<? extends org.springframework.test.context.support.ApplicationContextInitializer<? extends org.springframework.test.context.support.ConfigurableApplicationContext>> < ? extends ApplicationContextInitializer < ? extends ConfigurableApplicationContext > > > java.util.Set<java.lang.Class<? extends org.springframework.test.context.support.ApplicationContextInitializer<? extends org.springframework.test.context.support.ConfigurableApplicationContext>>> , java.lang.Class<? extends org.springframework.test.context.support.ContextLoader> < ? extends ContextLoader > java.lang.Class<? extends org.springframework.test.context.support.ContextLoader> ) { assertNotNull ( org.springframework.test.context.support.MergedContextConfiguration ) ; assertEquals ( java.lang.Class<> , org.springframework.test.context.support.MergedContextConfiguration . getTestClass ( ) ) ; assertNotNull ( org.springframework.test.context.support.MergedContextConfiguration . getLocations ( ) ) ; assertArrayEquals ( java.lang.String[] , org.springframework.test.context.support.MergedContextConfiguration . getLocations ( ) ) ; assertNotNull ( org.springframework.test.context.support.MergedContextConfiguration . getClasses ( ) ) ; assertArrayEquals ( java.lang.Class<?>[] , org.springframework.test.context.support.MergedContextConfiguration . getClasses ( ) ) ; assertNotNull ( org.springframework.test.context.support.MergedContextConfiguration . getActiveProfiles ( ) ) ; if ( java.lang.Class<> == null ) { assertNull ( org.springframework.test.context.support.MergedContextConfiguration . getContextLoader ( ) ) ; } else { assertEquals ( java.lang.Class<> , org.springframework.test.context.support.MergedContextConfiguration . getContextLoader ( ) . getClass ( ) ) ; } assertNotNull ( org.springframework.test.context.support.MergedContextConfiguration . getContextInitializerClasses ( ) ) ; assertEquals ( java.util.Set<java.lang.Class<? extends org.springframework.test.context.support.ApplicationContextInitializer<? extends org.springframework.test.context.support.ConfigurableApplicationContext>>> , org.springframework.test.context.support.MergedContextConfiguration . getContextInitializerClasses ( ) ) ; }  <METHOD_END>
