<METHOD_START> @ Test public void void ( ) { GenericApplicationContext org.springframework.context.annotation.configuration.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( ConfigurationClassPostProcessor .class ) ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( ConfigurationClassPostProcessor .class ) ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . registerBeanDefinition ( STRING , new RootBeanDefinition ( org.springframework.context.annotation.configuration.DuplicateConfigurationClassPostProcessorTests.Config .class ) ) ; org.springframework.context.annotation.configuration.GenericApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
