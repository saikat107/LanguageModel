<METHOD_START> @ Before public void void ( ) { this . org.springframework.scheduling.aspectj.ConfigurableApplicationContext = new ClassPathXmlApplicationContext ( STRING , org.springframework.scheduling.aspectj.AnnotationDrivenBeanDefinitionParserTests .class ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.scheduling.aspectj.ConfigurableApplicationContext != null ) { this . org.springframework.scheduling.aspectj.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.scheduling.aspectj.ConfigurableApplicationContext . containsBean ( TaskManagementConfigUtils . ASYNC_EXECUTION_ASPECT_BEAN_NAME ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.scheduling.aspectj.ConfigurableApplicationContext . getBean ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.scheduling.aspectj.ConfigurableApplicationContext . getBean ( TaskManagementConfigUtils . ASYNC_EXECUTION_ASPECT_BEAN_NAME ) ; assertSame ( java.lang.Object , new DirectFieldAccessor ( java.lang.Object ) . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.scheduling.aspectj.ConfigurableApplicationContext . getBean ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.scheduling.aspectj.ConfigurableApplicationContext . getBean ( TaskManagementConfigUtils . ASYNC_EXECUTION_ASPECT_BEAN_NAME ) ; assertSame ( java.lang.Object , new DirectFieldAccessor ( java.lang.Object ) . getPropertyValue ( STRING ) ) ; }  <METHOD_END>
