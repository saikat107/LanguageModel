<METHOD_START> @ java.lang.Override protected org.springframework.statemachine.config.common.annotation.simple.BeanDefinition org.springframework.statemachine.config.common.annotation.simple.BeanDefinition ( AnnotationMetadata org.springframework.statemachine.config.common.annotation.simple.AnnotationMetadata , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) throws java.lang.Exception { BeanDefinitionBuilder org.springframework.statemachine.config.common.annotation.simple.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfiguration2.SimpleTestConfigDelegatingFactoryBean .class ) ; org.springframework.statemachine.config.common.annotation.simple.BeanDefinitionBuilder . addConstructorArgValue ( org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder ) ; return org.springframework.statemachine.config.common.annotation.simple.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> ( ) { java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> = new java.util.ArrayList<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > ( ) ; java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> . boolean ( EnableSimpleTest2 .class ) ; return java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> ; }  <METHOD_END>
<METHOD_START> public void ( SimpleTestConfigBuilder org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder ) { super( org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder , SimpleTestConfig .class ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { for ( AnnotationConfigurer < SimpleTestConfig , SimpleTestConfigBuilder > org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder> : getConfigurers ( ) ) { if ( org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder> . isAssignable ( getBuilder ( ) ) ) { getBuilder ( ) . apply ( org.springframework.statemachine.config.common.annotation.simple.AnnotationConfigurer<org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfig,org.springframework.statemachine.config.common.annotation.simple.SimpleTestConfigBuilder> ) ; } } setObject ( getBuilder ( ) . getOrBuild ( ) ) ; }  <METHOD_END>
