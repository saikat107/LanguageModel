<METHOD_START> void ( FunctionExecutionConfiguration org.springframework.data.gemfire.function.config.FunctionExecutionConfiguration ) { super( org.springframework.data.gemfire.function.config.FunctionExecutionConfiguration ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.data.gemfire.function.config.BeanDefinitionBuilder org.springframework.data.gemfire.function.config.BeanDefinitionBuilder ( BeanDefinitionRegistry org.springframework.data.gemfire.function.config.BeanDefinitionRegistry ) { BeanDefinitionBuilder org.springframework.data.gemfire.function.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( java.lang.Class<?> ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) configuration . getAttribute ( STRING ) ; java.lang.String java.lang.String = ( java.lang.String ) configuration . getAttribute ( STRING ) ; Assert . state ( ! ( StringUtils . hasText ( java.lang.String ) && StringUtils . hasText ( java.lang.String ) ) , java.lang.String . java.lang.String ( STRING , configuration . getFunctionExecutionInterface ( ) . getName ( ) ) ) ; org.springframework.data.gemfire.function.config.BeanDefinitionBuilder . addConstructorArgReference ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : GemfireConstants . DEFAULT_GEMFIRE_CACHE_NAME ) ) ; return org.springframework.data.gemfire.function.config.BeanDefinitionBuilder ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return GemfireFunctionProxyFactoryBean .class ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Class<?> < ? > java.lang.Class<?> ( )  <METHOD_END>
