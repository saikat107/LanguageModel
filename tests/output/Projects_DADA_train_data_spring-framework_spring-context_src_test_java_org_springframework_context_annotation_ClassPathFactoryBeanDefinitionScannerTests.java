<METHOD_START> @ Test public void void ( ) { GenericApplicationContext org.springframework.context.annotation.GenericApplicationContext = new GenericApplicationContext ( ) ; ClassPathBeanDefinitionScanner org.springframework.context.annotation.ClassPathBeanDefinitionScanner = new ClassPathBeanDefinitionScanner ( org.springframework.context.annotation.GenericApplicationContext ) ; org.springframework.context.annotation.GenericApplicationContext . getBeanFactory ( ) . registerScope ( STRING , new SimpleMapScope ( ) ) ; org.springframework.context.annotation.ClassPathBeanDefinitionScanner . scan ( java.lang.String ) ; org.springframework.context.annotation.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean .class ) ) ; org.springframework.context.annotation.GenericApplicationContext . refresh ( ) ; FactoryMethodComponent org.springframework.context.annotation.FactoryMethodComponent = org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING , FactoryMethodComponent .class ) ; assertFalse ( org.springframework.context.annotation.FactoryMethodComponent . getClass ( ) . getName ( ) . contains ( ClassUtils . CGLIB_CLASS_SEPARATOR ) ) ; TestBean org.springframework.context.annotation.TestBean = ( TestBean ) org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.context.annotation.TestBean . getName ( ) ) ; TestBean org.springframework.context.annotation.TestBean = ( TestBean ) org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.context.annotation.TestBean . getName ( ) ) ; assertSame ( org.springframework.context.annotation.TestBean , org.springframework.context.annotation.TestBean ) ; org.springframework.context.annotation.TestBean = ( TestBean ) org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.context.annotation.TestBean . getName ( ) ) ; assertSame ( org.springframework.context.annotation.TestBean , org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) ) ; assertEquals ( STRING , org.springframework.context.annotation.TestBean . getCountry ( ) ) ; org.springframework.context.annotation.TestBean = org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING , TestBean .class ) ; assertEquals ( STRING , org.springframework.context.annotation.TestBean . getName ( ) ) ; assertSame ( org.springframework.context.annotation.TestBean , org.springframework.context.annotation.TestBean ) ; org.springframework.context.annotation.TestBean = org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING , TestBean .class ) ; assertEquals ( STRING , org.springframework.context.annotation.TestBean . getName ( ) ) ; assertEquals ( NUMBER , org.springframework.context.annotation.TestBean . getAge ( ) ) ; org.springframework.context.annotation.TestBean = org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING , TestBean .class ) ; assertEquals ( NUMBER , org.springframework.context.annotation.TestBean . getAge ( ) ) ; assertNotSame ( org.springframework.context.annotation.TestBean , org.springframework.context.annotation.TestBean ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) ; assertTrue ( AopUtils . isCglibProxy ( java.lang.Object ) ) ; assertTrue ( java.lang.Object instanceof ScopedObject ) ; org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean = org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING , org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean .class ) ; assertSame ( org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) , org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean . org.springframework.context.annotation.TestBean ) ; assertSame ( org.springframework.context.annotation.GenericApplicationContext . getBean ( STRING ) , org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean . org.springframework.context.annotation.DependencyBean ) ; assertSame ( org.springframework.context.annotation.GenericApplicationContext , org.springframework.context.annotation.ClassPathFactoryBeanDefinitionScannerTests.QualifiedClientBean . org.springframework.context.annotation.AbstractApplicationContext ) ; }  <METHOD_END>
