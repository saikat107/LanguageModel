<METHOD_START> @ java.lang.Override protected org.springframework.context.support.ConfigurableApplicationContext org.springframework.context.support.ConfigurableApplicationContext ( ) java.lang.Exception { StaticApplicationContext org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerPrototype ( STRING , TestBean .class , new MutablePropertyValues ( java.util.Map<java.lang.String,java.lang.String> ) ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; org.springframework.context.support.StaticApplicationContext . registerPrototype ( STRING , TestBean .class , new MutablePropertyValues ( java.util.Map<java.lang.String,java.lang.String> ) ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; org.springframework.context.support.StaticApplicationContext . addApplicationListener ( parentListener ) ; org.springframework.context.support.StaticApplicationContext . getStaticMessageSource ( ) . addMessage ( STRING , java.util.Locale . java.util.Locale ( ) , STRING ) ; this . org.springframework.context.support.StaticApplicationContext = new StaticApplicationContext ( org.springframework.context.support.StaticApplicationContext ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , BeanThatListens .class , new MutablePropertyValues ( ) ) ; org.springframework.context.support.StaticApplicationContext . registerSingleton ( STRING , ACATester .class , new MutablePropertyValues ( ) ) ; org.springframework.context.support.StaticApplicationContext . registerPrototype ( STRING , ACATester .class , new MutablePropertyValues ( ) ) ; PropertiesBeanDefinitionReader org.springframework.context.support.PropertiesBeanDefinitionReader = new PropertiesBeanDefinitionReader ( org.springframework.context.support.StaticApplicationContext . getDefaultListableBeanFactory ( ) ) ; org.springframework.context.support.PropertiesBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.context.support.StaticApplicationContextTests> ( ) ) ) ; org.springframework.context.support.StaticApplicationContext . refresh ( ) ; org.springframework.context.support.StaticApplicationContext . addApplicationListener ( listener ) ; org.springframework.context.support.StaticApplicationContext . getStaticMessageSource ( ) . addMessage ( STRING , java.util.Locale . java.util.Locale ( ) , STRING ) ; return org.springframework.context.support.StaticApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.Override public void void ( ) { assertCount ( NUMBER ) ; }  <METHOD_END>
