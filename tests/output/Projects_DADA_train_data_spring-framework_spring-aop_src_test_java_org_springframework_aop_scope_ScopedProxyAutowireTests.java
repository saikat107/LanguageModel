<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.aop.scope.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.aop.scope.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.aop.scope.Resource ) ; assertTrue ( java.util.Arrays . java.util.List ( org.springframework.aop.scope.DefaultListableBeanFactory . getBeanNamesForType ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean .class , false , false ) ) . contains ( STRING ) ) ; assertTrue ( java.util.Arrays . java.util.List ( org.springframework.aop.scope.DefaultListableBeanFactory . getBeanNamesForType ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean .class , true , false ) ) . contains ( STRING ) ) ; assertFalse ( org.springframework.aop.scope.DefaultListableBeanFactory . containsSingleton ( STRING ) ) ; org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean = ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ) org.springframework.aop.scope.DefaultListableBeanFactory . getBean ( STRING ) ; org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean = ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ) org.springframework.aop.scope.DefaultListableBeanFactory . getBean ( STRING ) ; assertSame ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean , org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean . org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.aop.scope.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.aop.scope.DefaultListableBeanFactory ) . loadBeanDefinitions ( org.springframework.aop.scope.Resource ) ; assertTrue ( java.util.Arrays . java.util.List ( org.springframework.aop.scope.DefaultListableBeanFactory . getBeanNamesForType ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean .class , true , false ) ) . contains ( STRING ) ) ; assertTrue ( java.util.Arrays . java.util.List ( org.springframework.aop.scope.DefaultListableBeanFactory . getBeanNamesForType ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean .class , false , false ) ) . contains ( STRING ) ) ; assertFalse ( org.springframework.aop.scope.DefaultListableBeanFactory . containsSingleton ( STRING ) ) ; org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean = ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ) org.springframework.aop.scope.DefaultListableBeanFactory . getBean ( STRING ) ; org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean = ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ) org.springframework.aop.scope.DefaultListableBeanFactory . getBean ( STRING ) ; assertSame ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean , org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean . org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ) { this . org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean = org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ; }  <METHOD_END>
<METHOD_START> public org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ( ) { return this . org.springframework.aop.scope.ScopedProxyAutowireTests.TestBean ; }  <METHOD_END>