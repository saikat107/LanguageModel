<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatDoesImport .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatDoesNotImport .class , org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigToBeAutowired .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { ApplicationContext org.springframework.context.annotation.configuration.ApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<?>[] ) ; org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config = org.springframework.context.annotation.configuration.ApplicationContext . getBean ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config .class ) ; assertTrue ( STRING , ClassUtils . isCglibProxy ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config . org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigToBeAutowired ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatDoesImport .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatDoesNotImport .class , org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigToBeAutowired .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { ApplicationContext org.springframework.context.annotation.configuration.ApplicationContext = new AnnotationConfigApplicationContext ( java.lang.Class<?>[] ) ; org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config = org.springframework.context.annotation.configuration.ApplicationContext . getBean ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config .class ) ; TestBean org.springframework.context.annotation.configuration.TestBean = org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config . org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigToBeAutowired . org.springframework.context.annotation.configuration.TestBean ( ) ; TestBean org.springframework.context.annotation.configuration.TestBean = org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.Config . org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigToBeAutowired . org.springframework.context.annotation.configuration.TestBean ( ) ; assertThat ( STRING , org.springframework.context.annotation.configuration.TestBean , sameInstance ( org.springframework.context.annotation.configuration.TestBean ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ApplicationContext org.springframework.context.annotation.configuration.ApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatImportsNonConfigClass .class ) ; org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatImportsNonConfigClass org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatImportsNonConfigClass = org.springframework.context.annotation.configuration.ApplicationContext . getBean ( org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatImportsNonConfigClass .class ) ; assertSame ( org.springframework.context.annotation.configuration.ApplicationContext . getBean ( TestBean .class ) , org.springframework.context.annotation.configuration.ImportedConfigurationClassEnhancementTests.ConfigThatImportsNonConfigClass . org.springframework.context.annotation.configuration.TestBean ) ; }  <METHOD_END>
<METHOD_START> public @ Bean org.springframework.context.annotation.configuration.TestBean org.springframework.context.annotation.configuration.TestBean ( ) { return new TestBean ( ) ; }  <METHOD_END>
