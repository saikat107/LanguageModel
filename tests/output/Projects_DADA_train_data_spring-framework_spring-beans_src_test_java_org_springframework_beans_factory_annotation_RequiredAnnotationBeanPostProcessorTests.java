<METHOD_START> @ Test public void void ( ) { try { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinition org.springframework.beans.factory.annotation.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.BeanDefinition ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( new RequiredAnnotationBeanPostProcessor ( ) ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.annotation.BeanCreationException ) { java.lang.String java.lang.String = org.springframework.beans.factory.annotation.BeanCreationException . getCause ( ) . getMessage ( ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinition org.springframework.beans.factory.annotation.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.BeanDefinition ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( new RequiredAnnotationBeanPostProcessor ( ) ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.annotation.BeanCreationException ) { java.lang.String java.lang.String = org.springframework.beans.factory.annotation.BeanCreationException . getCause ( ) . getMessage ( ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinition org.springframework.beans.factory.annotation.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.BeanDefinition ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( new RequiredAnnotationBeanPostProcessor ( ) ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean = ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean ) org.springframework.beans.factory.annotation.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean . int ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinition org.springframework.beans.factory.annotation.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) . getBeanDefinition ( ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.BeanDefinition ) ; RequiredAnnotationBeanPostProcessor org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor = new RequiredAnnotationBeanPostProcessor ( ) ; org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor . setRequiredAnnotationType ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.MyRequired .class ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.annotation.BeanCreationException ) { java.lang.String java.lang.String = org.springframework.beans.factory.annotation.BeanCreationException . getCause ( ) . getMessage ( ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinition org.springframework.beans.factory.annotation.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) . setFactoryMethod ( STRING ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.BeanDefinition ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( new RequiredAnnotationBeanPostProcessor ( ) ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.annotation.BeanCreationException ) { java.lang.String java.lang.String = org.springframework.beans.factory.annotation.BeanCreationException . getCause ( ) . getMessage ( ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; assertTrue ( java.lang.String . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinition org.springframework.beans.factory.annotation.BeanDefinition = BeanDefinitionBuilder . genericBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) . setFactoryMethod ( STRING ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . addPropertyValue ( STRING , STRING ) . getBeanDefinition ( ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.BeanDefinition ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( new RequiredAnnotationBeanPostProcessor ( ) ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean = ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean ) org.springframework.beans.factory.annotation.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean . int ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.annotation.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; RootBeanDefinition org.springframework.beans.factory.annotation.RootBeanDefinition = new RootBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean .class ) ; org.springframework.beans.factory.annotation.RootBeanDefinition . setFactoryBeanName ( STRING ) ; org.springframework.beans.factory.annotation.RootBeanDefinition . setFactoryMethodName ( STRING ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.annotation.RootBeanDefinition ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBeanFactory .class ) ) ; RequiredAnnotationBeanPostProcessor org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor = new RequiredAnnotationBeanPostProcessor ( ) ; org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor . setBeanFactory ( org.springframework.beans.factory.annotation.DefaultListableBeanFactory ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . addBeanPostProcessor ( org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor ) ; org.springframework.beans.factory.annotation.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> @ Required public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.MyRequired public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Required public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Required public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Required public void void ( java.lang.String java.lang.String ) {		}  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Required public void void ( BeanFactory org.springframework.beans.factory.annotation.BeanFactory ) {		}  <METHOD_END>
<METHOD_START> public static org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean ( ) { return new org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean ( ) { return new org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessorTests.RequiredTestBean ( ) ; }  <METHOD_END>
