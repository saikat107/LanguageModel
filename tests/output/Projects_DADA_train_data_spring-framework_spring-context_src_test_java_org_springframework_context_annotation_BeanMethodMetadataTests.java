<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.BeanMethodMetadataTests.Conf .class ) ; BeanDefinition org.springframework.context.annotation.BeanDefinition = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanDefinition ( STRING ) ; assertThat ( STRING , org.springframework.context.annotation.BeanDefinition , instanceOf ( AnnotatedBeanDefinition .class ) ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = ( ( AnnotatedBeanDefinition ) org.springframework.context.annotation.BeanDefinition ) . getFactoryMethodMetadata ( ) . getAnnotationAttributes ( org.springframework.context.annotation.BeanMethodMetadataTests.MyAnnotation .class . java.lang.String ( ) ) ; assertThat ( java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) , equalTo ( STRING ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ org.springframework.context.annotation.BeanMethodMetadataTests.MyAnnotation ( STRING ) public org.springframework.context.annotation.BeanMethodMetadataTests.MyBean org.springframework.context.annotation.BeanMethodMetadataTests.MyBean ( ) { return new org.springframework.context.annotation.BeanMethodMetadataTests.MyBean ( ) ; }  <METHOD_END>
