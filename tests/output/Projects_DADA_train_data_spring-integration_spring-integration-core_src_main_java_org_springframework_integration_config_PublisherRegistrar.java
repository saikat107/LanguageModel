<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.integration.config.AnnotationMetadata , BeanDefinitionRegistry org.springframework.integration.config.BeanDefinitionRegistry ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.integration.config.AnnotationMetadata . getAnnotationAttributes ( EnablePublisher .class . java.lang.String ( ) ) ; java.lang.String java.lang.String = ( java.util.Map<java.lang.String,java.lang.Object> == null ? ( java.lang.String ) AnnotationUtils . getDefaultValue ( EnablePublisher .class ) : ( java.lang.String ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ) ; if ( ! org.springframework.integration.config.BeanDefinitionRegistry . containsBeanDefinition ( IntegrationContextUtils . PUBLISHER_ANNOTATION_POSTPROCESSOR_NAME ) ) { BeanDefinitionBuilder org.springframework.integration.config.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( PublisherAnnotationBeanPostProcessor .class ) . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.integration.config.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; if ( org.springframework.integration.config.Log . isInfoEnabled ( ) ) { org.springframework.integration.config.Log . info ( STRING + java.lang.String + STRING ) ; } } org.springframework.integration.config.BeanDefinitionRegistry . registerBeanDefinition ( IntegrationContextUtils . PUBLISHER_ANNOTATION_POSTPROCESSOR_NAME , org.springframework.integration.config.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; } else { BeanDefinition org.springframework.integration.config.BeanDefinition = org.springframework.integration.config.BeanDefinitionRegistry . getBeanDefinition ( IntegrationContextUtils . PUBLISHER_ANNOTATION_POSTPROCESSOR_NAME ) ; MutablePropertyValues org.springframework.integration.config.MutablePropertyValues = org.springframework.integration.config.BeanDefinition . getPropertyValues ( ) ; PropertyValue org.springframework.integration.config.PropertyValue = org.springframework.integration.config.MutablePropertyValues . getPropertyValue ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { if ( org.springframework.integration.config.PropertyValue == null ) { org.springframework.integration.config.MutablePropertyValues . addPropertyValue ( STRING , java.lang.String ) ; if ( org.springframework.integration.config.Log . isInfoEnabled ( ) ) { org.springframework.integration.config.Log . info ( STRING + java.lang.String + STRING ) ; } } else if ( ! java.lang.String . boolean ( org.springframework.integration.config.PropertyValue . getValue ( ) ) ) { throw new BeanDefinitionStoreException ( STRING + STRING + STRING ) ; } } } }  <METHOD_END>
