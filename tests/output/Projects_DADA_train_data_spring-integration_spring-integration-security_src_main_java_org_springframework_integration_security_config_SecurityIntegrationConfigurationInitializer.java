<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public void void ( ConfigurableListableBeanFactory org.springframework.integration.security.config.ConfigurableListableBeanFactory ) throws org.springframework.integration.security.config.BeansException { BeanDefinitionRegistry org.springframework.integration.security.config.BeanDefinitionRegistry = ( BeanDefinitionRegistry ) org.springframework.integration.security.config.ConfigurableListableBeanFactory ; java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> < java.lang.String , ManagedSet < java.lang.String > > java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> = new ManagedMap < java.lang.String , ManagedSet < java.lang.String > > ( ) ; java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> < java.lang.String , java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> < java.util.regex.Pattern , ChannelAccessPolicy > > java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> = new java.util.HashMap<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> < java.lang.String , java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> < java.util.regex.Pattern , ChannelAccessPolicy > > ( ) ; for ( java.lang.String java.lang.String : org.springframework.integration.security.config.BeanDefinitionRegistry . getBeanDefinitionNames ( ) ) { BeanDefinition org.springframework.integration.security.config.BeanDefinition = org.springframework.integration.security.config.BeanDefinitionRegistry . getBeanDefinition ( java.lang.String ) ; if ( ChannelSecurityInterceptor .class . java.lang.String ( ) . boolean ( org.springframework.integration.security.config.BeanDefinition . getBeanClassName ( ) ) ) { BeanDefinition org.springframework.integration.security.config.BeanDefinition = ( BeanDefinition ) org.springframework.integration.security.config.BeanDefinition . getConstructorArgumentValues ( ) . getIndexedArgumentValue ( NUMBER , BeanDefinition .class ) . getValue ( ) ; java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> = ( java.util.Map<java.lang.String,?> < java.lang.String , ? > ) org.springframework.integration.security.config.BeanDefinition . getConstructorArgumentValues ( ) . getIndexedArgumentValue ( NUMBER , java.util.Map .class ) . getValue ( ) ; ManagedSet < java.lang.String > org.springframework.integration.security.config.ManagedSet<java.lang.String> = new ManagedSet < java.lang.String > ( ) ; if ( ! java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . containsKey ( java.lang.String ) ) { java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . put ( java.lang.String , org.springframework.integration.security.config.ManagedSet<java.lang.String> ) ; } else { org.springframework.integration.security.config.ManagedSet<java.lang.String> = java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . get ( java.lang.String ) ; } org.springframework.integration.security.config.ManagedSet<java.lang.String> . addAll ( java.util.Map<java.lang.String,> . java.util.Set<java.lang.String> ( ) ) ; } else if ( org.springframework.integration.security.config.BeanDefinition instanceof AnnotatedBeanDefinition ) { if ( org.springframework.integration.security.config.BeanDefinition . getSource ( ) instanceof MethodMetadata ) { MethodMetadata org.springframework.integration.security.config.MethodMetadata = ( MethodMetadata ) org.springframework.integration.security.config.BeanDefinition . getSource ( ) ; java.lang.String java.lang.String = SecuredChannel .class . java.lang.String ( ) ; if ( org.springframework.integration.security.config.MethodMetadata . isAnnotated ( java.lang.String ) ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.integration.security.config.MethodMetadata . getAnnotationAttributes ( java.lang.String ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; ChannelAccessPolicy org.springframework.integration.security.config.ChannelAccessPolicy = new DefaultChannelAccessPolicy ( java.lang.String[] , java.lang.String[] ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { ManagedSet < java.lang.String > org.springframework.integration.security.config.ManagedSet<java.lang.String> = new ManagedSet < java.lang.String > ( ) ; if ( ! java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . containsKey ( java.lang.String ) ) { java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . put ( java.lang.String , org.springframework.integration.security.config.ManagedSet<java.lang.String> ) ; } else { org.springframework.integration.security.config.ManagedSet<java.lang.String> = java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . get ( java.lang.String ) ; } org.springframework.integration.security.config.ManagedSet<java.lang.String> . add ( java.lang.String ) ; java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> < java.util.regex.Pattern , ChannelAccessPolicy > java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> = new java.util.HashMap<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> < java.util.regex.Pattern , ChannelAccessPolicy > ( ) ; if ( ! java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> . containsKey ( java.lang.String ) ) { java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> . put ( java.lang.String , java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> ) ; } else { java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> = java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> . get ( java.lang.String ) ; } java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy> . put ( java.util.regex.Pattern . java.util.regex.Pattern ( java.lang.String ) , org.springframework.integration.security.config.ChannelAccessPolicy ) ; } } } } } if ( ! java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> . isEmpty ( ) ) { BeanDefinitionBuilder org.springframework.integration.security.config.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( ChannelSecurityInterceptorBeanPostProcessor .class ) . addConstructorArgValue ( java.util.Map<java.lang.String,org.springframework.integration.security.config.ManagedSet<java.lang.String>> ) ; if ( ! java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> . isEmpty ( ) ) { org.springframework.integration.security.config.BeanDefinitionBuilder . addConstructorArgValue ( java.util.Map<java.lang.String,java.util.Map<java.util.regex.Pattern,org.springframework.integration.security.config.ChannelAccessPolicy>> ) ; } org.springframework.integration.security.config.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.integration.security.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } }  <METHOD_END>