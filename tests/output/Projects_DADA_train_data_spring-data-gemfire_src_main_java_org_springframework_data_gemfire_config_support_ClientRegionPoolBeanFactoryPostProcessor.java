<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory ) throws org.springframework.data.gemfire.config.support.BeansException { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; for ( java.lang.String java.lang.String : org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory . getBeanDefinitionNames ( ) ) { BeanDefinition org.springframework.data.gemfire.config.support.BeanDefinition = org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; if ( boolean ( org.springframework.data.gemfire.config.support.BeanDefinition ) ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } else if ( boolean ( org.springframework.data.gemfire.config.support.BeanDefinition ) ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } } for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { BeanDefinition org.springframework.data.gemfire.config.support.BeanDefinition = org.springframework.data.gemfire.config.support.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; java.lang.String java.lang.String = java.lang.String ( org.springframework.data.gemfire.config.support.BeanDefinition ) ; if ( java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { SpringUtils . addDependsOn ( org.springframework.data.gemfire.config.support.BeanDefinition , java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> boolean boolean ( BeanDefinition org.springframework.data.gemfire.config.support.BeanDefinition ) { return ClientRegionFactoryBean .class . java.lang.String ( ) . boolean ( org.springframework.data.gemfire.config.support.BeanDefinition . getBeanClassName ( ) ) ; }  <METHOD_END>
<METHOD_START> boolean boolean ( BeanDefinition org.springframework.data.gemfire.config.support.BeanDefinition ) { return PoolFactoryBean .class . java.lang.String ( ) . boolean ( org.springframework.data.gemfire.config.support.BeanDefinition . getBeanClassName ( ) ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( BeanDefinition org.springframework.data.gemfire.config.support.BeanDefinition ) { PropertyValue org.springframework.data.gemfire.config.support.PropertyValue = org.springframework.data.gemfire.config.support.BeanDefinition . getPropertyValues ( ) . getPropertyValue ( java.lang.String ) ; return ( org.springframework.data.gemfire.config.support.PropertyValue != null ? java.lang.String . java.lang.String ( org.springframework.data.gemfire.config.support.PropertyValue . getValue ( ) ) : null ) ; }  <METHOD_END>
