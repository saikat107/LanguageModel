<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( GroovyObjectCustomizer org.springframework.integration.groovy.config.GroovyObjectCustomizer ) { this . org.springframework.integration.groovy.config.GroovyObjectCustomizer = org.springframework.integration.groovy.config.GroovyObjectCustomizer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.groovy.config.MessageHandler org.springframework.integration.groovy.config.MessageHandler ( ) { Binding org.springframework.integration.groovy.config.Binding = new org.springframework.integration.groovy.config.GroovyControlBusFactoryBean.ManagedBeansBinding ( this . getBeanFactory ( ) ) ; GroovyCommandMessageProcessor org.springframework.integration.groovy.config.GroovyCommandMessageProcessor = new GroovyCommandMessageProcessor ( org.springframework.integration.groovy.config.Binding , message -> { Map < String , Object > variables = new HashMap <> ( ) ; variables . put ( STRING , message . getHeaders ( ) ) ; return variables ; } ) ; if ( this . org.springframework.integration.groovy.config.GroovyObjectCustomizer != null ) { org.springframework.integration.groovy.config.GroovyCommandMessageProcessor . setCustomizer ( this . org.springframework.integration.groovy.config.GroovyObjectCustomizer ) ; } if ( this . java.lang.ClassLoader != null ) { org.springframework.integration.groovy.config.GroovyCommandMessageProcessor . setBeanClassLoader ( this . java.lang.ClassLoader ) ; } if ( getBeanFactory ( ) != null ) { org.springframework.integration.groovy.config.GroovyCommandMessageProcessor . setBeanFactory ( getBeanFactory ( ) ) ; } return this . org.springframework.integration.groovy.config.ServiceActivatingHandler ( new ServiceActivatingHandler ( org.springframework.integration.groovy.config.GroovyCommandMessageProcessor ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.groovy.config.ServiceActivatingHandler org.springframework.integration.groovy.config.ServiceActivatingHandler ( ServiceActivatingHandler org.springframework.integration.groovy.config.ServiceActivatingHandler ) { if ( this . java.lang.Long != null ) { org.springframework.integration.groovy.config.ServiceActivatingHandler . setSendTimeout ( this . java.lang.Long ) ; } return org.springframework.integration.groovy.config.ServiceActivatingHandler ; }  <METHOD_END>
<METHOD_START> private void ( BeanFactory org.springframework.integration.groovy.config.BeanFactory ) { this . org.springframework.integration.groovy.config.ConfigurableListableBeanFactory = ( org.springframework.integration.groovy.config.BeanFactory instanceof ConfigurableListableBeanFactory ) ? ( ConfigurableListableBeanFactory ) org.springframework.integration.groovy.config.BeanFactory : null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { try { return super. getVariable ( java.lang.String ) ; } catch ( MissingPropertyException org.springframework.integration.groovy.config.MissingPropertyException ) { } if ( this . org.springframework.integration.groovy.config.ConfigurableListableBeanFactory == null ) { throw new MissingPropertyException ( java.lang.String , this . java.lang.Class<? extends org.springframework.integration.groovy.config.GroovyControlBusFactoryBean.ManagedBeansBinding> ( ) ) ; } java.lang.Object java.lang.Object = null ; try { java.lang.Object = this . org.springframework.integration.groovy.config.ConfigurableListableBeanFactory . getBean ( java.lang.String ) ; } catch ( NoSuchBeanDefinitionException org.springframework.integration.groovy.config.NoSuchBeanDefinitionException ) { throw new MissingPropertyException ( java.lang.String , this . java.lang.Class<? extends org.springframework.integration.groovy.config.GroovyControlBusFactoryBean.ManagedBeansBinding> ( ) , org.springframework.integration.groovy.config.NoSuchBeanDefinitionException ) ; } if ( java.lang.Object instanceof Lifecycle || java.lang.Object instanceof CustomizableThreadCreator || ( AnnotationUtils . findAnnotation ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , ManagedResource .class ) != null ) || ( AnnotationUtils . findAnnotation ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , IntegrationManagedResource .class ) != null ) ) { return java.lang.Object ; } throw new BeanCreationNotAllowedException ( java.lang.String , STRING + STRING + STRING ) ; }  <METHOD_END>
