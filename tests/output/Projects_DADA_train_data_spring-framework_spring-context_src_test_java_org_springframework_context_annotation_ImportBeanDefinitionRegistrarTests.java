<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( MessageSource .class ) ; assertThat ( org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . org.springframework.context.annotation.BeanFactory , is ( ( BeanFactory ) org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) ) ) ; assertThat ( org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . java.lang.ClassLoader , is ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . getBeanClassLoader ( ) ) ) ; assertThat ( org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . org.springframework.context.annotation.ResourceLoader , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . org.springframework.context.annotation.Environment , is ( ( Environment ) org.springframework.context.annotation.AnnotationConfigApplicationContext . getEnvironment ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.context.annotation.BeanFactory ) throws org.springframework.context.annotation.BeansException { org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . org.springframework.context.annotation.BeanFactory = org.springframework.context.annotation.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceLoader org.springframework.context.annotation.ResourceLoader ) { org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . org.springframework.context.annotation.ResourceLoader = org.springframework.context.annotation.ResourceLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.context.annotation.Environment ) { org.springframework.context.annotation.ImportBeanDefinitionRegistrarTests.SampleRegistrar . org.springframework.context.annotation.Environment = org.springframework.context.annotation.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata , BeanDefinitionRegistry org.springframework.context.annotation.BeanDefinitionRegistry ) {		}  <METHOD_END>